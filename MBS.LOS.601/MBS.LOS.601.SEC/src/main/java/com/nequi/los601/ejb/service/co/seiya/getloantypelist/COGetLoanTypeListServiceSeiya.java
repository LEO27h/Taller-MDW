package com.nequi.los601.ejb.service.co.seiya.getloantypelist;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.HttpHeaders;

import com.nequi.cmm.consumer.broker.ServiceBroker;
import com.nequi.cmm.consumer.constant.ConstantCommonService;
import com.nequi.cmm.consumer.exception.CommonUtilException;
import com.nequi.cmm.consumer.exception.MiddlewareException;
import com.nequi.cmm.consumer.exception.RestClientException;
import com.nequi.cmm.consumer.registry.ServiceRegistry;
import com.nequi.cmm.consumer.util.UtilJSON;
import com.nequi.cmm.messaging.esb.ResponseHeaderOutMessageType;
import com.nequi.los601.ejb.exception.LOS601Exception;
import com.nequi.los601.ejb.service.ServiceBean;
import com.nequi.los601.ejb.util.CommonUtilLOS601;
import com.nequi.los601.ejb.util.ConstantLOS601;
import com.nequi.los601.messaging.services.apigateway.GetProductRequestType;
import com.nequi.los601.messaging.services.seiya.GetCustomerStatusRequestType;
import com.nequi.los601.messaging.services.seiya.GetCustomerStatusResponseType;
import com.nequi.los601.messaging.services.seiya.GetLoanTypeListRQType;
import com.nequi.los601.messaging.services.seiya.GetLoanTypeListRSType;
import com.nequi.los601.messaging.services.seiya.MessageRQ;
import com.nequi.los601.messaging.services.seiya.MessageRS;
import com.nequi.los601.messaging.services.seiya.RequestBodyType;
import com.nequi.los601.messaging.services.seiya.RequestHeaderType;
import com.nequi.los601.messaging.services.seiya.ResponseBodyType;
import com.nequi.mdw.business.cmm.DataServiceUtil;
import com.nequi.mdw.business.cmm.SecurityServiceUtil;
import com.nequi.mdw.business.exception.DiffieHellmanException;
import com.nequi.mdw.business.util.ApiGatewayUtil;
import com.nequi.mdw.business.util.BusinessConstant;
import com.nequi.mdw.business.util.BusinessUtil;
import com.nequi.mdw.common.jpa.exception.JPAException;
import com.nequi.mdw.common.jpa.model.entities.Cliente;
import com.nequi.mdw.common.tracerv7.service.GenericLogger;
import com.nequi.mdw.common.tracerv7.service.LoggerFactory;
import com.nequi.mdw.common.tracerv7.service.ServiceTypeEnum;

/**
 * Session Bean implementation class COGetLoanTypeListServiceSeiya
 * 
 *
 */
@Stateless(mappedName = ConstantLOS601.COMMON_STRING_COGETLOANTYPELIST_SERVICE_SEIYA)
@LocalBean
public class COGetLoanTypeListServiceSeiya implements ServiceBean {

    @PersistenceContext(unitName = ConstantCommonService.COMMON_STRING_PERSISTENCE_JPA_MANAGER)
    private EntityManager em;
    private GenericLogger logger;
    private ServiceRegistry serviceRegistry;
    private boolean isExternalChannel;

    @PostConstruct
    void init() {
        logger = LoggerFactory.getLogger(ServiceTypeEnum.BUSSINES,
                COGetLoanTypeListServiceSeiya.class);
    }

    /**
     * Metodo que implementa de la interfaz {@link ServiceBean}
     * 
     * @see ServiceBean#executeOperation(String)
     */
    @Override
    public String executeOperation(HttpHeaders httpHeaders, String request) {

        MessageRS messageRS = null;
        MessageRQ messageRQ = null;
        RequestHeaderType requestHeader = null;
        String messageId = null;
        String consumerId = null;
        GetLoanTypeListRQType getLoanTypeListRQType = null;
        Cliente cliente = null;

        try {

            serviceRegistry = ServiceRegistry.getInstance();
            /* Parsear el request a object */
            messageRQ = UtilJSON.parsePayloadWithJaxbAnnotation(request,
                    MessageRQ.class);

            /* Get del header */
            requestHeader = messageRQ.getRequestMessage().getHeader();

            // Validamos el canal
            isExternalChannel = SecurityServiceUtil
                    .validateChannel(requestHeader.getChannel().getId(), em);

            /* Get de datos para trazar */
            messageId = requestHeader.getMessageID();
            consumerId = null != requestHeader.getConsumer()
                    ? requestHeader.getConsumer().getId()
                    : ConstantCommonService.COMMON_STRING_EMPTY;

            /* Get del body */
            getLoanTypeListRQType = messageRQ.getRequestMessage().getBody()
                    .getGetLoanTypeListRQ();

            /* Obtener el cliente de base de datos */
            cliente = DataServiceUtil
                    .getCustomer(getLoanTypeListRQType.getPhoneNumber(), em);

            String bankId = DataServiceUtil.getParameterValue(
                    BusinessConstant.COMMON_STRING_PARAMETER_BANK_ID,
                    BusinessConstant.COMMON_STRING_BANK_ID_COUNTRY,
                    BusinessConstant.COMMON_STRING_BANKID_REGION_COLOMBIA,
                    requestHeader.getDestination().getServiceRegion(), em);

            GetCustomerStatusRequestType getCustomerStatusRequestType = CommonUtilLOS601
                    .createGetCustomerStatusRequestType(
                            requestHeader.getDestination().getServiceRegion(),
                            bankId, cliente.getNumeroId(),
                            getLoanTypeListRQType.getPhoneNumber());

            ResponseHeaderOutMessageType responseHeaderOutMessageType = this
                    .callGetCustomerStatus(httpHeaders,
                            requestHeader.getChannel().getId(), messageId,
                            requestHeader.getDestination().getServiceRegion(),
                            consumerId, logger, getCustomerStatusRequestType);

            if (BusinessUtil.successResponse(responseHeaderOutMessageType)) {
                GetCustomerStatusResponseType getCustomerStatusResponseType = UtilJSON
                        .parsePayloadWithJaxbAnnotation(
                                responseHeaderOutMessageType
                                        .getResponseHeaderOut().getBody()
                                        .getAny(),
                                GetCustomerStatusResponseType.class);

                if (!ConstantLOS601.COMMON_STRING_STATUS_A
                        .equals(getCustomerStatusResponseType
                                .getGetCustomerStatusRS().getAcctStatus())) {
                    // Retornar error CUENTA NO ACTIVA
                    return CommonUtilLOS601.generateResponseAsString(messageRS,
                            logger, messageId, consumerId);                    
                }
                
                // CONSULTAR CREDITOS POR APIGATEWAY
            }

            getLoanTypeListRQType = getGetLoanTypeListRQType(httpHeaders,
                    messageRQ, requestHeader, messageId, request);

            messageRS = CommonUtilLOS601.getResponseStructure(requestHeader,
                    ConstantCommonService.COMMON_STRING_SUCCESS_CODE,
                    ConstantCommonService.COMMON_STRING_SUCCESS_MAYUS);

            com.nequi.los601.messaging.services.apigateway.MessageRS responseAPG = new com.nequi.los601.messaging.services.apigateway.MessageRS();

            responseAPG = getProduct(httpHeaders, ConstantLOS601.PRODUCT_ID_1,
                    serviceRegistry, messageId, consumerId,
                    requestHeader.getDestination().getServiceRegion());

            if (!CommonUtilLOS601.successResponse(responseAPG)) {

                messageRS = CommonUtilLOS601.responseErrorMessage(httpHeaders,
                        requestHeader,
                        responseAPG.getResponseMessage().getHeader().getStatus()
                                .getCode(),
                        responseAPG.getResponseMessage().getHeader().getStatus()
                                .getSystem(),
                        ConstantCommonService.APP_SYSTEM, logger,
                        serviceRegistry);

                logger.traceError(ConstantLOS601.ERROR_MESSAGE_GET_PRODUCT,
                        new LOS601Exception(
                                ConstantLOS601.ERROR_MESSAGE_PRODUCT),
                        messageId, consumerId);

                return CommonUtilLOS601.generateResponseAsString(messageRS,
                        logger, messageId, consumerId);
            }
            ResponseBodyType responseBodyType = new ResponseBodyType();
            GetLoanTypeListRSType getLoanTypeListRSType = new GetLoanTypeListRSType();
            getLoanTypeListRSType = CommonUtilLOS601
                    .buildGetLoanTypeListRSType(responseAPG);
             responseBodyType.setGetLoanTypeListRS(getLoanTypeListRSType);

            return CommonUtilLOS601.addBodyToObject(messageRS, responseBodyType,
                    logger, messageId, consumerId,
                    ConstantLOS601.COMMON_STRING_RESPONSE_MESSAGE,
                    ConstantLOS601.COMMON_STRING_BODY);

        } catch (CommonUtilException e) {

            logger.traceError(ConstantCommonService.ERROR_MESSAGE_PARSING_ERROR,
                    e, messageId, consumerId);
            messageRS = CommonUtilLOS601.responseErrorMessage(httpHeaders,
                    requestHeader, ConstantCommonService.ERROR_PARSE,
                    ConstantCommonService.MDW_SYSTEM,
                    ConstantCommonService.APP_SYSTEM, logger, serviceRegistry);

        } 
        catch (RestClientException e) {

            logger.traceError(ConstantCommonService.ERROR_TO_CALL_REST, e,
                    messageId, consumerId);
            messageRS = CommonUtilLOS601.responseErrorMessage(httpHeaders,
                    requestHeader,
                    ConstantCommonService.ERROR_CODE_REST_CONSUMER_ERROR,
                    ConstantCommonService.MDW_SYSTEM,
                    ConstantCommonService.APP_SYSTEM, logger, serviceRegistry);
        } catch (JPAException e) {

            logger.traceError(ConstantCommonService.ERROR_BD_MESSAGE, e,
                    messageId, consumerId);
            messageRS = CommonUtilLOS601.responseErrorMessage(httpHeaders,
                    requestHeader,
                    ConstantCommonService.ERROR_CODE_DB_OPERATION,
                    ConstantCommonService.DB_SYSTEM,
                    ConstantCommonService.APP_SYSTEM, logger, serviceRegistry);
        } catch (MiddlewareException e) {

            logger.traceError(e.getMessage(), e, messageId, consumerId);
            messageRS = CommonUtilLOS601.responseErrorMessage(httpHeaders,
                    requestHeader, e.getCode(), e.getSystem(),
                    ConstantCommonService.APP_SYSTEM, logger, serviceRegistry);

        }

        return CommonUtilLOS601.generateResponseAsString(messageRS, logger,
                messageId, consumerId);

    }

    /**
     * Metodo para obtener objeto {@code GetLoanTypeListRQType}
     * 
     * @param httpHeaders
     * @param messageRQ
     * @param requestHeader
     * @param messageId
     * @param request
     * @return {@linkGetLoanTypeListRQType}
     * @throws DiffieHellmanException
     * @throws RestClientException
     * @throws CommonUtilException
     */
    private GetLoanTypeListRQType getGetLoanTypeListRQType(
            HttpHeaders httpHeaders, MessageRQ messageRQ,
            RequestHeaderType requestHeader, String messageId, String request)
            throws DiffieHellmanException, RestClientException,
            CommonUtilException {

        // if (!isExternalChannel) {
        // return SecurityServiceUtil
        // .getRequestBodyPlain(httpHeaders, messageId,
        // messageRQ.getRequestMessage().getBody()
        // .getProtectedMsgRQ().getPhoneNumber(),
        // requestHeader.getSecurity().getPublicKey(),
        // messageRQ.getRequestMessage().getBody()
        // .getProtectedMsgRQ().getInfo(),
        // GetLoanTypeListRQType.class);
        //
        // }
        {
            RequestBodyType requestBodyType = UtilJSON
                    .parsePayloadWithJaxbAnnotation(
                            CommonUtilLOS601.getRequestBody(request),
                            RequestBodyType.class);
            return requestBodyType.getGetLoanTypeListRQ();
        }
    }

    /**
     * Metodo que valida estado de un cliente en finacle
     * 
     * @param channelId
     * @param messageId
     * @param serviceRegion
     * @param consumerId
     * @param logger
     * @param getCustomerStatusRequestType
     * @return {@link ResponseHeaderOutMessageType}
     */
    private ResponseHeaderOutMessageType callGetCustomerStatus(
            HttpHeaders httpHeaders, String channelId, String messageId,
            String serviceRegion, String consumerId, GenericLogger logger,
            GetCustomerStatusRequestType getCustomerStatusRequestType) {

        return ServiceBroker.createBrokerRequest(httpHeaders, channelId,
                messageId, serviceRegion, getCustomerStatusRequestType,
                ConstantLOS601.NAME_CUSTOMER_DETAILS,
                ConstantLOS601.NAMESPACE_CUSTOMER_DETAILS,
                ConstantLOS601.OPERATION_GET_CUSTOMER_STATUS,
                ConstantLOS601.GET_CUSTOMER_STATUS_RQ,
                ConstantLOS601.GET_CUSTOMER_STATUS_RS, logger, consumerId);
    }

    private com.nequi.los601.messaging.services.apigateway.MessageRS getProduct(
            HttpHeaders httpHeaders, String productId,
            ServiceRegistry serviceRegistry, String messageId,
            String consumerId, String region)
            throws RestClientException, CommonUtilException {

        com.nequi.los601.messaging.services.apigateway.RequestBodyType bodyType = new com.nequi.los601.messaging.services.apigateway.RequestBodyType();

        GetProductRequestType getProductRequest = new GetProductRequestType();
        getProductRequest.setProductId(productId);
        bodyType.setGetProductRequest(getProductRequest);

        return ApiGatewayUtil.createRequestApiGateway406(httpHeaders, messageId,
                consumerId, region, serviceRegistry,
                ConstantLOS601.SERVICE_OPERATION_APIGATEWAY_GET_PRODUCT,
                ConstantLOS601.COMMON_STRING_LOAN_SERVICES,
                ConstantLOS601.COMMON_STRING_SEIYA, bodyType, com.nequi.los601.messaging.services.apigateway.MessageRS.class);

    }

}
