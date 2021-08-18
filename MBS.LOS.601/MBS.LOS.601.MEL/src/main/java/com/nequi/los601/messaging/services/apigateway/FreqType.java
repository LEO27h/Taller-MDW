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
 * <p>Clase Java para FreqType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FreqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="holStat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqType", propOrder = {
    "cal",
    "holStat",
    "startDt",
    "type"
})
public class FreqType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String cal;
    @XmlElement(required = true)
    protected String holStat;
    @XmlElement(required = true)
    protected String startDt;
    @XmlElement(required = true)
    protected String type;

    /**
     * Obtiene el valor de la propiedad cal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCal() {
        return cal;
    }

    /**
     * Define el valor de la propiedad cal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCal(String value) {
        this.cal = value;
    }

    /**
     * Obtiene el valor de la propiedad holStat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHolStat() {
        return holStat;
    }

    /**
     * Define el valor de la propiedad holStat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHolStat(String value) {
        this.holStat = value;
    }

    /**
     * Obtiene el valor de la propiedad startDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Define el valor de la propiedad startDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
