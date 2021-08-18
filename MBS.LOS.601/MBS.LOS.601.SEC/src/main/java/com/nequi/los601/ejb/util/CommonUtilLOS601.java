package com.nequi.los601.ejb.util;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import javax.ws.rs.core.HttpHeaders;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.JSONObject;

import com.nequi.cmm.consumer.constant.ConstantCommonService;
import com.nequi.cmm.consumer.exception.CommonUtilException;
import com.nequi.cmm.consumer.registry.ServiceRegistry;
import com.nequi.cmm.consumer.util.CommonServiceConsumerUtil;
import com.nequi.cmm.consumer.util.UtilJSON;
import com.nequi.los601.messaging.services.seiya.AddressType;
import com.nequi.los601.messaging.services.seiya.ChannelType;
import com.nequi.los601.messaging.services.seiya.ConsumerType;
import com.nequi.los601.messaging.services.seiya.ContainerType;
import com.nequi.los601.messaging.services.seiya.DestinationType;
import com.nequi.los601.messaging.services.seiya.GetCustomerStatusRQType;
import com.nequi.los601.messaging.services.seiya.GetCustomerStatusRequestType;
import com.nequi.los601.messaging.services.seiya.GetLoanTypeListRSType;
import com.nequi.los601.messaging.services.seiya.MessageRS;
import com.nequi.los601.messaging.services.seiya.ProviderType;
import com.nequi.los601.messaging.services.seiya.RequestHeaderType;
import com.nequi.los601.messaging.services.seiya.ResponseBodyType;
import com.nequi.los601.messaging.services.seiya.ResponseHeaderType;
import com.nequi.los601.messaging.services.seiya.ResponseMessageType;
import com.nequi.los601.messaging.services.seiya.StatusType;
import com.nequi.mdw.business.messaging.homologator.HmgResponseType;
import com.nequi.mdw.business.util.BusinessConstant;
import com.nequi.mdw.business.util.HomologateUtil;
import com.nequi.mdw.common.tracerv7.service.GenericLogger;

/**
 *
 */
public class CommonUtilLOS601{

    private CommonUtilLOS601() {
    }
    /**
     * Genera un mensaje de Response a Front Homologando el error que se le
     * envie.
     * 
     * @param httpHeaders
     * @param requestHeader
     * @param errorCode
     * @param system
     * @param destinationSystem
     * @param logger
     * @param serviceRegistry
     * @return <code>MessageRS</code>>
     */
    public static MessageRS responseErrorMessage(HttpHeaders httpHeaders,
            RequestHeaderType requestHeader, String errorCode, String system,
            String destinationSystem, GenericLogger logger,
            ServiceRegistry serviceRegistry) {

        RequestHeaderType requestHeaderResponse = requestHeader;
        
        if (null == requestHeaderResponse) {
            requestHeaderResponse = new RequestHeaderType();
            requestHeaderResponse.setDestination(new DestinationType());
            requestHeaderResponse.setChannel(new ChannelType());
            requestHeaderResponse.setContainer(new ContainerType());
            AddressType addressType = new AddressType();
            ConsumerType consumerType = new ConsumerType();
            consumerType.setAddress(addressType);
            requestHeaderResponse.setConsumer(consumerType);

            requestHeaderResponse
                    .setMessageID(String.valueOf((new Date()).getTime()));
        }
        requestHeaderResponse.getContainer()
                .setId(BusinessConstant.COMMON_STRING_CONTAINER_TYPE_ID);
        requestHeaderResponse.getContainer()
                .setName(BusinessConstant.COMMON_STRING_CONTAINER_TYPE_NAME);
        requestHeaderResponse.getChannel().setId(ConstantLOS601.COMMON_STRING_SERVICE_NAME);
        requestHeaderResponse.getChannel().setName(ConstantCommonService.COMMON_STRING_MOBILE_FIRST_CHANNEL_ID);

        return buildResponseErrorMessage(httpHeaders, requestHeaderResponse, errorCode, system,
                destinationSystem, logger, serviceRegistry);
    }

    /**
     * Metodo que construye el mensaje tomando el sistema destino para
     * homologar.
     * 
     * @param httpHeaders
     * @param requestHeader
     * @param errorCode
     * @param system
     * @param destinationSystem
     * @param logger
     * @param serviceRegistry
     * @return {@link MessageRS}
     */
    private static MessageRS buildResponseErrorMessage(HttpHeaders httpHeaders,
            RequestHeaderType requestHeader, String errorCode, String system,
            String destinationSystem, GenericLogger logger,
            ServiceRegistry serviceRegistry) {

        String messageId = null != requestHeader.getMessageID()
                ? requestHeader.getMessageID()
                : String.valueOf(new Date().getTime());

        if (ConstantCommonService.COMMON_STRING_SUCCESS_CODE
                .equals(errorCode)) {

            return getResponseStructure(requestHeader,
                    ConstantCommonService.COMMON_STRING_SUCCESS_CODE,
                    ConstantCommonService.COMMON_STRING_SUCCESS_MAYUS);

        } else if (null != errorCode && null != system) {

            HmgResponseType hmgResponseType = HomologateUtil.homologateError(httpHeaders,
                    messageId, requestHeader.getConsumer().getId(),
                    requestHeader.getConsumer().getName(),
                    requestHeader.getChannel().getId(), errorCode, system,
                    destinationSystem, logger, serviceRegistry);

            return getResponseStructure(requestHeader,
                    hmgResponseType.getBody().getOutCode(),
                    hmgResponseType.getBody().getOutMessage());

        } else {
            return getResponseStructure(requestHeader,
                    ConstantCommonService.ERROR_DEFAULT_CODE,
                    ConstantCommonService.ERROR_DEFAULT_MESSAGE);
        }

    }

    /**
     * Metodo que genera una respuesta con el codigo y mensaje especificado
     * 
     * @param headerRQ
     * @param code
     * @param message
     * @return {@link MessageRS}
     */
    public static MessageRS getResponseStructure(RequestHeaderType headerRQ,
            String code, String message) {
        MessageRS response = null;
        response = getResponseStructure();
        ResponseHeaderType headerRS = setRequestDataToResponse(headerRQ,
                response.getResponseMessage().getHeader());
        response.getResponseMessage().setHeader(headerRS);
        response.getResponseMessage().getHeader().getStatus().setCode(code);
        response.getResponseMessage().getHeader().getStatus()
                .setDescription(message);
        return response;
    }

    /**
     * Metodo que construye la mensajeria de la respuesta de los servicios sin
     * configuracion.
     * 
     * @return {@link MessageRS} generacion de respuesta sin configuracion.
     */
    public static MessageRS getResponseStructure() {

        MessageRS messageRS = new MessageRS();
        ResponseMessageType responseMessageType = new ResponseMessageType();
        ResponseHeaderType responseHeaderType = new ResponseHeaderType();
        DestinationType destinationType = new DestinationType();
        StatusType statusType = new StatusType();
        ProviderType providerType = new ProviderType();
        ContainerType containerType = new ContainerType();
        ConsumerType consumerType = new ConsumerType();
        AddressType addressType = new AddressType();
        consumerType.setAddress(addressType);

        responseHeaderType.setDestination(destinationType);
        responseHeaderType.setStatus(statusType);
        responseHeaderType.setProvider(providerType);
        responseHeaderType.setContainer(containerType);
        responseHeaderType.setConsumer(consumerType);

        ResponseBodyType responseBodyType = new ResponseBodyType();

        responseMessageType.setHeader(responseHeaderType);
        responseMessageType.setBody(responseBodyType);
        messageRS.setResponseMessage(responseMessageType);

        return messageRS;
    }

    /**
     * Metodo que construye el header para la respuesta del servicio.
     * 
     * @param headerRQ
     * @param headerRS
     * @return {@link ResponseHeaderType} header para respuesta del servicio.
     */
    public static ResponseHeaderType setRequestDataToResponse(
            RequestHeaderType headerRQ, ResponseHeaderType headerRS) {
        Date responseDate = new Date();
        String date = CommonServiceConsumerUtil
                .getCurrentTimeStamp(ConstantCommonService.COMMON_FORMAT_DATE_TO_FRONT);

        if (null == headerRQ) {

            headerRS.getDestination()
                    .setServiceName(ConstantLOS601.COMMON_STRING_SERVICE_NAME);
            headerRS.getDestination()
                    .setServiceOperation(ConstantCommonService.COMMON_STRING_EMPTY);
            headerRS.getDestination()
                    .setServiceRegion(ConstantCommonService.COMMON_STRING_EMPTY);
            headerRS.getDestination()
                    .setServiceVersion(ConstantCommonService.COMMON_STRING_EMPTY);

            headerRS.setMessageID(String.valueOf(responseDate.getTime()));
            headerRS.getContainer()
                    .setId(BusinessConstant.COMMON_STRING_CONTAINER_TYPE_ID);
            headerRS.getContainer()
                    .setName(BusinessConstant.COMMON_STRING_CONTAINER_TYPE_NAME);
            headerRS.getConsumer().getAddress()
                    .setDeviceAddress(ConstantCommonService.COMMON_STRING_EMPTY);
            headerRS.getConsumer().getAddress()
                    .setNetworkAddress(ConstantCommonService.COMMON_STRING_EMPTY);
            headerRS.getConsumer().setId(ConstantCommonService.COMMON_STRING_EMPTY);
            headerRS.getConsumer().setName(ConstantCommonService.COMMON_STRING_EMPTY);

        } else {
            headerRS.setDestination(headerRQ.getDestination());
            headerRS.setMessageID(headerRQ.getMessageID());
            headerRS.setContainer(headerRQ.getContainer());
            headerRS.setChannel(headerRQ.getChannel().getId());
            headerRS.setConsumer(headerRQ.getConsumer());
        }

        headerRS.setResponseDate(date);
        headerRS.getProvider().setId(ConstantLOS601.COMMON_STRING_SERVICE_ID);
        headerRS.getProvider().setName(ConstantLOS601.COMMON_STRING_SERVICE_NAME);
        return headerRS;
    }

     /**
     * Metodo que parsea la respuesta para generarla en formato JSON.
     * 
     * @param messageRS
     * @param messageId
     * @param consumerId
     * @return respuesta en formato JSON.
     */
    public static String generateResponseAsString(MessageRS messageRS,
            GenericLogger logger, String messageId, String consumerId) {
        try {

            return UtilJSON.parseJSONToString(messageRS);

        } catch (CommonUtilException e1) {
            logger.traceError(ConstantCommonService.ERROR_MESSAGE_PARSING_ERROR,
                    e1, messageId, consumerId);
        }
        return ConstantCommonService.COMMON_STRING_EMPTY;
    }

     /**
     * Metodo para agregar body a objeto especifico
     * 
     * @param parent
     * @param body
     * @param logger
     * @param messageId
     * @param consumerId
     * @param objectLabel
     * @param bodyLabel
     * @return String
     */
    public static String addBodyToObject(Object parent, Object body,
            GenericLogger logger, String messageId, String consumerId,
            String objectLabel, String bodyLabel) {

        Map<String, Object> map = null;
        JSONObject jSONObject = null;
        ObjectMapper mapper = null;
        try {
            String bodyString = UtilJSON.parseJSONToString(body);

            // convert JSON string to Map
            mapper = new ObjectMapper();
            map = mapper.readValue(bodyString,
                    new TypeReference<Map<String, Object>>() {
                    });

            jSONObject = new JSONObject(parent);
            jSONObject.getJSONObject(objectLabel).put(bodyLabel, map);
            return jSONObject.toString();

        } catch (CommonUtilException | IOException e) {
            logger.traceError(ConstantCommonService.ERROR_MESSAGE_PARSING_ERROR,
                    e, messageId, consumerId);
        }
        return ConstantCommonService.COMMON_STRING_EMPTY;
    }

     /**
     * Metodo que nos devuelve RQ de la peticion de entrada
     * 
     * @param request
     * @return {@code String}
     */
    public static String getRequestBody(String request) {
        JSONObject jSONObject = new JSONObject(request);
        return jSONObject
                .getJSONObject(ConstantLOS601.COMMON_STRING_REQUEST_MESSAGE)
                .get(ConstantLOS601.COMMON_STRING_BODY).toString();
    }
    

    /**
     * Create object with the client parameters
     * @param region
     * @param bankId
     * @param document
     * @param phoneNumber
     * @return
     */
    public static GetCustomerStatusRequestType createGetCustomerStatusRequestType(
            String region, String bankId, String document, String phoneNumber) {
        GetCustomerStatusRequestType getCustomerStatusRequestType = new GetCustomerStatusRequestType();
        GetCustomerStatusRQType getCustomerStatusRQType = new GetCustomerStatusRQType();
        getCustomerStatusRQType.setBankId(bankId);
        getCustomerStatusRQType.setDocument(document);
        getCustomerStatusRQType.setPhoneNumber(
                ConstantCommonService.SERVICE_REGION_CO.equalsIgnoreCase(region)
                        ? ConstantLOS601.COMMON_STRING_PREFIX_PHONENUMBER_CO
                        : ConstantLOS601.COMMON_STRING_PREFIX_PHONENUMBER_PA
                                + phoneNumber);
        getCustomerStatusRequestType
                .setGetCustomerStatusRQ(getCustomerStatusRQType);
        return getCustomerStatusRequestType;
    }
    
    /**
     * Metodo para validar codigo de respuesta apigateway
     * 
     * @param messageRS
     * @return Boolean
     */
    public static boolean successResponse(
            com.nequi.los601.messaging.services.apigateway.MessageRS messageRS) {

        return null != messageRS && null != messageRS.getResponseMessage()
                && null != messageRS.getResponseMessage().getHeader()
                && ConstantCommonService.COMMON_STRING_SUCCESS_CODE
                        .equals(messageRS.getResponseMessage().getHeader()
                                .getStatus().getCode());
    }
    
    /**
     * Método que mapea los atributos para la respuesta
     * @param responseAPG
     * @return
     */
    public static GetLoanTypeListRSType buildGetLoanTypeListRSType(
            com.nequi.los601.messaging.services.apigateway.MessageRS responseAPG) {
        GetLoanTypeListRSType getLoanTypeListRSType = new GetLoanTypeListRSType();
        com.nequi.los601.messaging.services.seiya.ProductType productType = new com.nequi.los601.messaging.services.seiya.ProductType();
        productType.setId(responseAPG.getResponseMessage().getBody().getGetProductResponse().getSchmCode());
        productType.setName(responseAPG.getResponseMessage().getBody().getGetProductResponse().getName());
        getLoanTypeListRSType.getProduct().add(productType);
        return getLoanTypeListRSType;
    }

    
  }