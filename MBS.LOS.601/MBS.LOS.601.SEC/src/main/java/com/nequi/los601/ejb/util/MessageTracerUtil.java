/**
 * 
 */
package com.nequi.los601.ejb.util;

import com.nequi.cmm.consumer.constant.ConstantCommonService;
import com.nequi.cmm.consumer.exception.CommonUtilException;
import com.nequi.cmm.consumer.util.UtilJSON;
import com.nequi.los601.messaging.services.seiya.MessageRQ;
import com.nequi.los601.messaging.services.seiya.MessageRS;
import com.nequi.mdw.common.tracerv7.service.GenericLogger;
import com.nequi.mdw.common.tracerv7.util.TypeEnum;

/**
 *
 */
public class MessageTracerUtil {

    /**
     * Constructor Privado
     */
    private MessageTracerUtil() {

    }

     /**
     * Este método traza un response
     * 
     * @param response
     * @param payload
     * @param logger
     * @param messageId
     * @param consumerId
     */
    public static void traceResponseMessage(MessageRS response, Object payload,
            GenericLogger logger, String messageId, String consumerId) {

        try {
            Object any = UtilJSON.getPropertyJsonInMapJson(
                    ConstantLOS601.COMMON_STRING_SPLIT_PATTERN,
                    ConstantLOS601.COMMON_STRING_PATH_BODY_RS, payload.toString());
            logger.traceInfo(
                    UtilJSON.parseJSONToString(
                            response.getResponseMessage().getHeader()),
                    UtilJSON.parseJSONToString(any), TypeEnum.RS);
        } catch (CommonUtilException e) {
            logger.traceError(ConstantCommonService.ERROR_MESSAGE_PARSING_ERROR,
                    e, messageId, consumerId);
        }
    }

    /**
     * Este método traza un request
     * 
     * @param request
     * @param payload
     * @param logger
     * @param messageId
     * @param consumerId
     */
    public static void traceRequestMessage(MessageRQ request, Object payload,
            GenericLogger logger, String messageId, String consumerId) {

        try {
            Object any = UtilJSON.getPropertyJsonInMapJson(
                    ConstantLOS601.COMMON_STRING_SPLIT_PATTERN,
                    ConstantLOS601.COMMON_STRING_PATH_BODY_RQ, payload.toString());

            logger.traceInfo(
                    UtilJSON.parseJSONToString(
                            request.getRequestMessage().getHeader()),
                    UtilJSON.parseJSONToString(any), TypeEnum.RQ);
        } catch (CommonUtilException e) {
            logger.traceError(ConstantCommonService.ERROR_MESSAGE_PARSING_ERROR,
                    e, messageId, consumerId);
        }

    }

}
