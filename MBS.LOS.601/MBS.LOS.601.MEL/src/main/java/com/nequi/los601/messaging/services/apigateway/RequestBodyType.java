//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.16 a las 08:56:31 PM COT 
//


package com.nequi.los601.messaging.services.apigateway;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para requestBodyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="requestBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://nequi.co/message/bussines/services/getProduct}getProductRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestBodyType", namespace = "http://nequi.co/message/integration/services/agi/", propOrder = {
    "getProductRequest"
})
public class RequestBodyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://nequi.co/message/bussines/services/getProduct", required = true)
    protected GetProductRequestType getProductRequest;

    /**
     * Obtiene el valor de la propiedad getProductRequest.
     * 
     * @return
     *     possible object is
     *     {@link GetProductRequestType }
     *     
     */
    public GetProductRequestType getGetProductRequest() {
        return getProductRequest;
    }

    /**
     * Define el valor de la propiedad getProductRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProductRequestType }
     *     
     */
    public void setGetProductRequest(GetProductRequestType value) {
        this.getProductRequest = value;
    }

}
