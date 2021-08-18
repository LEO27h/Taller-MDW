/**
 * 
 */
package com.nequi.los601.ejb.util;


import org.junit.Before;
import org.junit.Test;

import com.nequi.los601.messaging.services.seiya.MessageRQ;
import com.nequi.los601.messaging.services.seiya.MessageRS;
import com.nequi.los601.messaging.services.seiya.RequestHeaderType;
import com.nequi.los601.messaging.services.seiya.RequestMessageType;
import com.nequi.los601.messaging.services.seiya.ResponseHeaderType;
import com.nequi.los601.messaging.services.seiya.ResponseMessageType;
import com.nequi.mdw.common.tracerv7.service.GenericLogger;
import com.nequi.mdw.common.tracerv7.service.LoggerFactory;
import com.nequi.mdw.common.tracerv7.service.ServiceTypeEnum;

public class MessageTracerUtilTest {

    private GenericLogger logger;

    @Before
    public void setUp() {
        logger = LoggerFactory.getLogger(ServiceTypeEnum.BUSSINES,
                GenericLogger.class);
    }

      @Test
    public void testTraceResponseMessage() throws Exception {
        Object payload = new Object();
        String messageId = "123456789";
        String consumerId = "399999999";
        MessageRS messageRS = new MessageRS();

        // Exception Test
        MessageTracerUtil.traceResponseMessage(messageRS, payload, logger,
                messageId, consumerId);

        // Success Test
        payload = "{ \"responseMessage\": { \"header\": { \"container\": { \"name\": \"WebSphere Application Server\", \"id\": \"WAS-Node\" }, \"provider\": { \"name\": \"FinancialService\", \"id\": \"test\" }, \"destination\": { \"serviceVersion\": \"1.0.0\", \"serviceRegion\": \"C001\", \"serviceOperation\": \"test\", \"serviceName\": \"FinancialServices\" }, \"channel\": \"MF-001\", \"messageID\": \"7894560\", \"consumer\": { \"address\": { \"deviceAddress\": \"172.31.17.207\", \"networkAddress\": \"10.5.1.153\" }, \"name\": \"phoneNumber\", \"id\": \"399999999\" }, \"responseDate\": \"2021-02-18 11:27:36\", \"status\": { \"code\": \"11-6L\", \"description\": \"¡Súper! Todo salió bien.\" } }, \"body\": { \"testRS\": { } } } }";
        ResponseMessageType responseMessageType = new ResponseMessageType();
        ResponseHeaderType responseHeaderType = new ResponseHeaderType();
        responseHeaderType.setMessageID(messageId);
        responseMessageType.setHeader(responseHeaderType);
        messageRS.setResponseMessage(responseMessageType);
        MessageTracerUtil.traceResponseMessage(messageRS, payload, logger,
                messageId, consumerId);
    }

    @Test
    public void testTraceRequestMessage() throws Exception {
        Object payload = new Object();
        String messageId = "123456789";
        String consumerId = "399999999";
        MessageRQ messageQ = new MessageRQ();

        // Exception Test
        MessageTracerUtil.traceRequestMessage(messageQ, payload, logger,
                messageId, consumerId);

        // Success Test
        payload = "{ \"requestMessage\": { \"body\": { \"protectedMsgRQ\": { \"info\": \"info\", \"phoneNumber\":\"399999999\", \"type\":\"testRQ\" } }, \"header\": { \"channel\": { \"id\": \"MF-001\", \"name\": \"Mobile First\" }, \"consumer\": { \"address\": { \"deviceAddress\": \"172.31.17.207\", \"networkAddress\": \"10.5.1.153\" }, \"id\": \"399999999\", \"name\": \"phoneNumber\" }, \"container\": { \"id\": \"WLT\", \"name\": \"Worklight\" }, \"destination\": { \"serviceName\": \"FinancialServices\", \"serviceOperation\": \"test\", \"serviceRegion\": \"C001\", \"serviceVersion\": \"1.0.0\" }, \"messageContext\": { \"property\": [ { \"key\": \"currentAttempt\", \"value\": \"0\" } ] }, \"messageID\": \"7894560\", \"requestDate\": \"2021-02-15 10:30\", \"security\": { \"baseGenerator\": 2, \"primeModulus\": \"\"}, \"sendSNS\": true } } }";
        RequestMessageType requestMessageType = new RequestMessageType();
        RequestHeaderType requestHeaderType = new RequestHeaderType();
        requestMessageType.setHeader(requestHeaderType);
        requestHeaderType.setMessageID(messageId);
        messageQ.setRequestMessage(requestMessageType);
        MessageTracerUtil.traceRequestMessage(messageQ, payload, logger,
                messageId, consumerId);
    }
}