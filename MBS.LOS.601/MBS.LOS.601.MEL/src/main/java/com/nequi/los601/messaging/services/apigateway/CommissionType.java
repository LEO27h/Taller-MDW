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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CommissionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CommissionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommissionType", propOrder = {
    "maximum",
    "percentage",
    "value"
})
public class CommissionType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected double maximum;
    protected double percentage;
    protected double value;

    /**
     * Obtiene el valor de la propiedad maximum.
     * 
     */
    public double getMaximum() {
        return maximum;
    }

    /**
     * Define el valor de la propiedad maximum.
     * 
     */
    public void setMaximum(double value) {
        this.maximum = value;
    }

    /**
     * Obtiene el valor de la propiedad percentage.
     * 
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * Define el valor de la propiedad percentage.
     * 
     */
    public void setPercentage(double value) {
        this.percentage = value;
    }

    /**
     * Obtiene el valor de la propiedad value.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

}
