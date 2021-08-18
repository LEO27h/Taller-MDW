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
 * <p>Clase Java para responseBodyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="responseBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://nequi.co/message/bussines/services/mbs/BS_MSG_GetLoanTypeList}getLoanTypeListRS"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "responseBodyType", propOrder = {
    "getLoanTypeListRS"
})
public class ResponseBodyType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "http://nequi.co/message/bussines/services/mbs/BS_MSG_GetLoanTypeList")
    protected GetLoanTypeListRSType getLoanTypeListRS;

    /**
     * Obtiene el valor de la propiedad getLoanTypeListRS.
     * 
     * @return
     *     possible object is
     *     {@link GetLoanTypeListRSType }
     *     
     */
    public GetLoanTypeListRSType getGetLoanTypeListRS() {
        return getLoanTypeListRS;
    }

    /**
     * Define el valor de la propiedad getLoanTypeListRS.
     * 
     * @param value
     *     allowed object is
     *     {@link GetLoanTypeListRSType }
     *     
     */
    public void setGetLoanTypeListRS(GetLoanTypeListRSType value) {
        this.getLoanTypeListRS = value;
    }

}
