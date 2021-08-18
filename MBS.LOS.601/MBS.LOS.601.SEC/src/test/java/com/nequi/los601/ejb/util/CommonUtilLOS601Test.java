/**
 * 
 */
package com.nequi.los601.ejb.util;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.nequi.los601.messaging.services.seiya.MessageRS;
import com.nequi.los601.messaging.services.seiya.RequestHeaderType;
import com.nequi.los601.messaging.services.seiya.ResponseHeaderType;
import com.nequi.los601.messaging.services.seiya.ResponseMessageType;
import com.nequi.mdw.common.tracerv7.service.GenericLogger;
import com.nequi.mdw.common.tracerv7.service.LoggerFactory;
import com.nequi.mdw.common.tracerv7.service.ServiceTypeEnum;

public class CommonUtilLOS601Test {

    private GenericLogger logger;
    
    @Before
    public void setUp() throws Exception {
        logger = LoggerFactory.getLogger(ServiceTypeEnum.BUSSINES,
                CommonUtilLOS601Test.class);
    }
    
    @Test
    public void testResponseErrorMessage() {
        //Success without ServiceRegistry
        RequestHeaderType requestHeader = null;
        String system = "MDW";
        String errorCode = "0";
        String destinationSystem = "MDW";
        assertNotNull(CommonUtilLOS601.responseErrorMessage(null, requestHeader, errorCode,
                system, destinationSystem, logger, null));
    }
    @Test
    public void testGetResponseStructure() {
        RequestHeaderType requestHeader = null;
        String errorCode = "0";
        String message = "Error";
        assertNotNull(CommonUtilLOS601.getResponseStructure(requestHeader, errorCode, message));
    }

        @Test
    public void testGenerateResponseAsString() {
        String consumerId = "3993126664";
        MessageRS messageRS = new MessageRS();
        ResponseMessageType responseMessageType = new ResponseMessageType();
        ResponseHeaderType responseHeaderType = new ResponseHeaderType();
        responseMessageType.setHeader(responseHeaderType);
        messageRS.setResponseMessage(responseMessageType);
        String messageId = "1234";

        assertNotNull(CommonUtilLOS601.generateResponseAsString(messageRS,
                logger, messageId, consumerId));
    }

      @Test
    public void testGetRequestBody() {
        String rq = "{ \"requestMessage\": { \"body\": { \"testRQ\": { \"phoneNumber\": \"3999999999\"}},\"header\":{\"channel\":{\"id\":\"MDW-C001\",\"name\":\"Mobile First\"},\"consumer\": { \"address\": { \"deviceAddress\": \"172.31.17.207\", \"networkAddress\": \"10.5.1.153\" }, \"id\": \"3999999999\", \"name\": \"phoneNumber\" }, \"container\": { \"id\": \"WLT\", \"name\": \"Worklight\" }, \"destination\": { \"serviceName\": \"FinancialServices\", \"serviceOperation\": \"test\", \"serviceRegion\": \"C001\", \"serviceVersion\": \"1.0.0\" }, \"messageID\": \"3246546576\", \"requestDate\": \"2021-02-15 10:30\", \"security\": null } } }";
        assertNotNull(CommonUtilLOS601.getRequestBody(rq));
    }

}
