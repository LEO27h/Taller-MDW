//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.02 a las 03:11:42 PM COT 
//


package com.nequi.los601.messaging.services.seiya;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nequi.los601.messaging.services.seiya package. 
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

    private final static QName _ResponseMessage_QNAME = new QName("http://nequi.co/message/bussines/services/", "responseMessage");
    private final static QName _RequestMessage_QNAME = new QName("http://nequi.co/message/bussines/services/", "requestMessage");
    private final static QName _GetLoanTypeListRQ_QNAME = new QName("http://nequi.co/message/bussines/services/mbs/BS_MSG_GetLoanTypeList", "getLoanTypeListRQ");
    private final static QName _GetLoanTypeListRS_QNAME = new QName("http://nequi.co/message/bussines/services/mbs/BS_MSG_GetLoanTypeList", "getLoanTypeListRS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nequi.los601.messaging.services.seiya
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestMessageType }
     * 
     */
    public RequestMessageType createRequestMessageType() {
        return new RequestMessageType();
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
     * Create an instance of {@link MessageRQ }
     * 
     */
    public MessageRQ createMessageRQ() {
        return new MessageRQ();
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
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link ContainerType }
     * 
     */
    public ContainerType createContainerType() {
        return new ContainerType();
    }

    /**
     * Create an instance of {@link ResponseBodyType }
     * 
     */
    public ResponseBodyType createResponseBodyType() {
        return new ResponseBodyType();
    }

    /**
     * Create an instance of {@link ChannelType }
     * 
     */
    public ChannelType createChannelType() {
        return new ChannelType();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link ProviderType }
     * 
     */
    public ProviderType createProviderType() {
        return new ProviderType();
    }

    /**
     * Create an instance of {@link ConsumerType }
     * 
     */
    public ConsumerType createConsumerType() {
        return new ConsumerType();
    }

    /**
     * Create an instance of {@link SecurityType }
     * 
     */
    public SecurityType createSecurityType() {
        return new SecurityType();
    }

    /**
     * Create an instance of {@link ResponseHeaderType }
     * 
     */
    public ResponseHeaderType createResponseHeaderType() {
        return new ResponseHeaderType();
    }

    /**
     * Create an instance of {@link DestinationType }
     * 
     */
    public DestinationType createDestinationType() {
        return new DestinationType();
    }

    /**
     * Create an instance of {@link GetLoanTypeListRQType }
     * 
     */
    public GetLoanTypeListRQType createGetLoanTypeListRQType() {
        return new GetLoanTypeListRQType();
    }

    /**
     * Create an instance of {@link GetLoanTypeListRSType }
     * 
     */
    public GetLoanTypeListRSType createGetLoanTypeListRSType() {
        return new GetLoanTypeListRSType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nequi.co/message/bussines/services/", name = "responseMessage")
    public JAXBElement<ResponseMessageType> createResponseMessage(ResponseMessageType value) {
        return new JAXBElement<ResponseMessageType>(_ResponseMessage_QNAME, ResponseMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nequi.co/message/bussines/services/", name = "requestMessage")
    public JAXBElement<RequestMessageType> createRequestMessage(RequestMessageType value) {
        return new JAXBElement<RequestMessageType>(_RequestMessage_QNAME, RequestMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoanTypeListRQType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nequi.co/message/bussines/services/mbs/BS_MSG_GetLoanTypeList", name = "getLoanTypeListRQ")
    public JAXBElement<GetLoanTypeListRQType> createGetLoanTypeListRQ(GetLoanTypeListRQType value) {
        return new JAXBElement<GetLoanTypeListRQType>(_GetLoanTypeListRQ_QNAME, GetLoanTypeListRQType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoanTypeListRSType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nequi.co/message/bussines/services/mbs/BS_MSG_GetLoanTypeList", name = "getLoanTypeListRS")
    public JAXBElement<GetLoanTypeListRSType> createGetLoanTypeListRS(GetLoanTypeListRSType value) {
        return new JAXBElement<GetLoanTypeListRSType>(_GetLoanTypeListRS_QNAME, GetLoanTypeListRSType.class, null, value);
    }

}
