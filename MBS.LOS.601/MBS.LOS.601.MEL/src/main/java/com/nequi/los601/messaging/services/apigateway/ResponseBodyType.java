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
 * <p>Clase Java para responseBodyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="responseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://nequi.co/message/bussines/services/getProduct}getProductResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseBodyType", namespace = "http://nequi.co/message/integration/services/agi/", propOrder = {
    "getProductResponse"
})
public class ResponseBodyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://nequi.co/message/bussines/services/getProduct", required = true)
    protected GetProductResponseType getProductResponse;

    /**
     * Obtiene el valor de la propiedad getProductResponse.
     * 
     * @return
     *     possible object is
     *     {@link GetProductResponseType }
     *     
     */
    public GetProductResponseType getGetProductResponse() {
        return getProductResponse;
    }

    /**
     * Define el valor de la propiedad getProductResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link GetProductResponseType }
     *     
     */
    public void setGetProductResponse(GetProductResponseType value) {
        this.getProductResponse = value;
    }

}
