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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para securityType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="securityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="publicKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primeModulus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="baseGenerator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "securityType", propOrder = {
    "publicKey",
    "primeModulus",
    "baseGenerator"
})
public class SecurityType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String publicKey;
    protected String primeModulus;
    protected String baseGenerator;

    /**
     * Obtiene el valor de la propiedad publicKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * Define el valor de la propiedad publicKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicKey(String value) {
        this.publicKey = value;
    }

    /**
     * Obtiene el valor de la propiedad primeModulus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeModulus() {
        return primeModulus;
    }

    /**
     * Define el valor de la propiedad primeModulus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeModulus(String value) {
        this.primeModulus = value;
    }

    /**
     * Obtiene el valor de la propiedad baseGenerator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseGenerator() {
        return baseGenerator;
    }

    /**
     * Define el valor de la propiedad baseGenerator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseGenerator(String value) {
        this.baseGenerator = value;
    }

}
