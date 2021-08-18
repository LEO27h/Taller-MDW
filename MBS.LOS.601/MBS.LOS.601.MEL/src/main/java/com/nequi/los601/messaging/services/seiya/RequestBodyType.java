//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.08.02 a las 03:11:42 PM COT 
//


package com.nequi.los601.messaging.services.seiya;

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
 *       &lt;choice>
 *         &lt;element ref="{http://nequi.co/message/bussines/services/mbs/BS_MSG_GetLoanTypeList}getLoanTypeListRQ"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestBodyType", propOrder = {
    "getLoanTypeListRQ"
})
public class RequestBodyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://nequi.co/message/bussines/services/mbs/BS_MSG_GetLoanTypeList")
    protected GetLoanTypeListRQType getLoanTypeListRQ;

    /**
     * Obtiene el valor de la propiedad getLoanTypeListRQ.
     * 
     * @return
     *     possible object is
     *     {@link GetLoanTypeListRQType }
     *     
     */
    public GetLoanTypeListRQType getGetLoanTypeListRQ() {
        return getLoanTypeListRQ;
    }

    /**
     * Define el valor de la propiedad getLoanTypeListRQ.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLoanTypeListRQType }
     *     
     */
    public void setGetLoanTypeListRQ(GetLoanTypeListRQType value) {
        this.getLoanTypeListRQ = value;
    }

}
