/**
 * 
 */
package com.nequi.los601.sef.service;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

import com.nequi.cmm.consumer.constant.ConstantCommonService;
import com.nequi.cmm.consumer.exception.CommonUtilException;
import com.nequi.cmm.consumer.util.UtilJSON;
import com.nequi.los601.ejb.exception.LOS601Exception;
import com.nequi.los601.ejb.factory.IFactory;
import com.nequi.los601.ejb.factory.impl.GetLoanTypeListFactory;
import com.nequi.los601.ejb.service.ServiceBean;
import com.nequi.los601.ejb.util.CommonUtilLOS601;
import com.nequi.los601.ejb.util.ConstantLOS601;
import com.nequi.los601.ejb.util.MessageTracerUtil;
import com.nequi.los601.messaging.services.seiya.MessageRQ;
import com.nequi.los601.messaging.services.seiya.MessageRS;
import com.nequi.los601.messaging.services.seiya.RequestHeaderType;
import com.nequi.mdw.common.tracerv7.service.GenericLogger;
import com.nequi.mdw.common.tracerv7.service.LoggerFactory;
import com.nequi.mdw.common.tracerv7.service.ServiceTypeEnum;

/**
 * Fachada para servicios de Business Services
 */
@Path(ConstantLOS601.FACADE_LOAN_SERVICES_PATH)
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class Loan {

    private GenericLogger logger;

    @EJB
    private GetLoanTypeListFactory getLoanTypeListFactory;

    /**
     *  Post Constructor
     * 
     */
    @PostConstruct
    public void init() {
        logger = LoggerFactory.getLogger(ServiceTypeEnum.BUSSINES,
                 Loan.class);
    }

    /**
     * Fachada del dominio de negocio para  Loan
     * 
     * @param httpHeaders
     * @param request
     * @return {@link String}
     */
    @Path(ConstantLOS601.SERVICE_OPERATION_GETLOANTYPELIST)
    @javax.ws.rs.POST
    public String getLoanTypeList(@Context HttpHeaders httpHeaders, String request) {
        return callService(httpHeaders, request, getLoanTypeListFactory);
    }

    /**
     * Metodo generico para llamar EJB 
     * 
     * @param httpHeaders
     * @param request
     * @param factory
     * @return {@link String}
     */
    private String callService(HttpHeaders httpHeaders, String request, IFactory factory) {
        String response = null;
        MessageRQ messageRQ = null;
        MessageRS messageRS = null;
        String messageId = ConstantCommonService.COMMON_STRING_EMPTY;
        String consumerId = ConstantCommonService.COMMON_STRING_EMPTY;

        try {

            messageRQ = UtilJSON
                    .parsePayloadWithJaxbAnnotation(request,
                            MessageRQ.class);

            messageId = messageRQ.getRequestMessage().getHeader()
                    .getMessageID();
            consumerId = messageRQ.getRequestMessage().getHeader().getConsumer()
                    .getId();
            
            /* Se traza la petición */
            MessageTracerUtil.traceRequestMessage(messageRQ,request, logger, messageId,
                            consumerId);

            String region = messageRQ.getRequestMessage().getHeader()
                    .getDestination().getServiceRegion();

            String version = messageRQ.getRequestMessage().getHeader()
                    .getDestination().getServiceVersion();

            ServiceBean bean = factory.getServiceBean(region,
                    version);

            response = bean.executeOperation(httpHeaders, request);

            messageRS = UtilJSON.parsePayloadWithJaxbAnnotation(response,
                MessageRS.class);

        } catch (CommonUtilException | LOS601Exception e) {
            RequestHeaderType headerRQ = null;

            if (null != messageRQ) {
                headerRQ = messageRQ.getRequestMessage().getHeader();
            }

            logger.traceError(e.getMessage(), e, messageId, consumerId);

            messageRS = CommonUtilLOS601.getResponseStructure(headerRQ,
                    ConstantCommonService.ERROR_DEFAULT_CODE,
                    ConstantCommonService.ERROR_DEFAULT_MESSAGE);

            response = CommonUtilLOS601.generateResponseAsString(messageRS,
                    logger, messageId, consumerId);
        }

        MessageTracerUtil.traceResponseMessage(messageRS, response, logger, messageId,
            consumerId);


        return response;
    }
 
}