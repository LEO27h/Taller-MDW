//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.07.22 a las 07:25:32 PM COT 
//


package com.nequi.los601.messaging.services.seiya;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GetCustomerStatusRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerStatusRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getCustomerStatusRQ" type="{http://co.bancaDigital/nequi/services/UserServices/CustomerDetails/v1.0}GetCustomerStatusRQType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerStatusRequestType", propOrder = {
    "getCustomerStatusRQ"
})
public class GetCustomerStatusRequestType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected GetCustomerStatusRQType getCustomerStatusRQ;

    /**
     * Obtiene el valor de la propiedad getCustomerStatusRQ.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomerStatusRQType }
     *     
     */
    public GetCustomerStatusRQType getGetCustomerStatusRQ() {
        return getCustomerStatusRQ;
    }

    /**
     * Define el valor de la propiedad getCustomerStatusRQ.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomerStatusRQType }
     *     
     */
    public void setGetCustomerStatusRQ(GetCustomerStatusRQType value) {
        this.getCustomerStatusRQ = value;
    }

}
