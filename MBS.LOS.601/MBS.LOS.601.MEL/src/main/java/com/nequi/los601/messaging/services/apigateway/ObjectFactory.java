//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.16 a las 08:56:31 PM COT 
//


package com.nequi.los601.messaging.services.apigateway;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nequi.los601.messaging.services.apigateway package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetProductRequest_QNAME = new QName("http://nequi.co/message/bussines/services/getProduct", "getProductRequest");
    private final static QName _ResponseMessage_QNAME = new QName("http://nequi.co/message/integration/services/agi/", "responseMessage");
    private final static QName _GetProductResponse_QNAME = new QName("http://nequi.co/message/bussines/services/getProduct", "getProductResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nequi.los601.messaging.services.apigateway
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageRS }
     * 
     */
    public MessageRS createMessageRS() {
        return new MessageRS();
    }

    /**
     * Create an instance of {@link ResponseMessageType }
     * 
     */
    public ResponseMessageType createResponseMessageType() {
        return new ResponseMessageType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link RequestBodyType }
     * 
     */
    public RequestBodyType createRequestBodyType() {
        return new RequestBodyType();
    }

    /**
     * Create an instance of {@link ResponseBodyType }
     * 
     */
    public ResponseBodyType createResponseBodyType() {
        return new ResponseBodyType();
    }

    /**
     * Create an instance of {@link ResponseHeaderType }
     * 
     */
    public ResponseHeaderType createResponseHeaderType() {
        return new ResponseHeaderType();
    }

    /**
     * Create an instance of {@link GetProductResponseType }
     * 
     */
    public GetProductResponseType createGetProductResponseType() {
        return new GetProductResponseType();
    }

    /**
     * Create an instance of {@link GetProductRequestType }
     * 
     */
    public GetProductRequestType createGetProductRequestType() {
        return new GetProductRequestType();
    }

    /**
     * Create an instance of {@link FreqType }
     * 
     */
    public FreqType createFreqType() {
        return new FreqType();
    }

    /**
     * Create an instance of {@link LoanOtherDtlsType }
     * 
     */
    public LoanOtherDtlsType createLoanOtherDtlsType() {
        return new LoanOtherDtlsType();
    }

    /**
     * Create an instance of {@link CommissionType }
     * 
     */
    public CommissionType createCommissionType() {
        return new CommissionType();
    }

    /**
     * Create an instance of {@link InstlDet }
     * 
     */
    public InstlDet createInstlDet() {
        return new InstlDet();
    }

    /**
     * Create an instance of {@link LoanIntTblDtlRecType }
     * 
     */
    public LoanIntTblDtlRecType createLoanIntTblDtlRecType() {
        return new LoanIntTblDtlRecType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nequi.co/message/bussines/services/getProduct", name = "getProductRequest")
    public JAXBElement<GetProductRequestType> createGetProductRequest(GetProductRequestType value) {
        return new JAXBElement<GetProductRequestType>(_GetProductRequest_QNAME, GetProductRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nequi.co/message/integration/services/agi/", name = "responseMessage")
    public JAXBElement<ResponseMessageType> createResponseMessage(ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(_ResponseMessage_QNAME, ResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nequi.co/message/bussines/services/getProduct", name = "getProductResponse")
    public JAXBElement<GetProductResponseType> createGetProductResponse(GetProductResponseType value) {
        return new JAXBElement<GetProductResponseType>(_GetProductResponse_QNAME, GetProductResponseType.class, null, value);
    }

}
