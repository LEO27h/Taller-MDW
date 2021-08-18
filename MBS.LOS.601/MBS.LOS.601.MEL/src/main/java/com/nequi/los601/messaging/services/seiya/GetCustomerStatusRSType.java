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
 * <p>Clase Java para GetCustomerStatusRSType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetCustomerStatusRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cifId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preferredName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="emailId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foracId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acctOpnDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acctStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schemeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomerStatusRSType", propOrder = {
    "cifId",
    "fullName",
    "preferredName",
    "documentType",
    "documentId",
    "phoneNumber",
    "emailId",
    "foracId",
    "acctOpnDate",
    "acctStatus",
    "schemeCode"
})
public class GetCustomerStatusRSType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String cifId;
    @XmlElement(required = true)
    protected String fullName;
    @XmlElement(required = true)
    protected String preferredName;
    @XmlElement(required = true)
    protected String documentType;
    @XmlElement(required = true)
    protected String documentId;
    @XmlElement(required = true)
    protected String phoneNumber;
    @XmlElement(required = true)
    protected String emailId;
    @XmlElement(required = true)
    protected String foracId;
    @XmlElement(required = true)
    protected String acctOpnDate;
    @XmlElement(required = true)
    protected String acctStatus;
    @XmlElement(required = true)
    protected String schemeCode;

    /**
     * Obtiene el valor de la propiedad cifId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCifId() {
        return cifId;
    }

    /**
     * Define el valor de la propiedad cifId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCifId(String value) {
        this.cifId = value;
    }

    /**
     * Obtiene el valor de la propiedad fullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Define el valor de la propiedad fullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Obtiene el valor de la propiedad preferredName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredName() {
        return preferredName;
    }

    /**
     * Define el valor de la propiedad preferredName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredName(String value) {
        this.preferredName = value;
    }

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Obtiene el valor de la propiedad documentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentId() {
        return documentId;
    }

    /**
     * Define el valor de la propiedad documentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentId(String value) {
        this.documentId = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define el valor de la propiedad phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad emailId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailId() {
        return emailId;
    }

    /**
     * Define el valor de la propiedad emailId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailId(String value) {
        this.emailId = value;
    }

    /**
     * Obtiene el valor de la propiedad foracId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForacId() {
        return foracId;
    }

    /**
     * Define el valor de la propiedad foracId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForacId(String value) {
        this.foracId = value;
    }

    /**
     * Obtiene el valor de la propiedad acctOpnDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOpnDate() {
        return acctOpnDate;
    }

    /**
     * Define el valor de la propiedad acctOpnDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOpnDate(String value) {
        this.acctOpnDate = value;
    }

    /**
     * Obtiene el valor de la propiedad acctStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctStatus() {
        return acctStatus;
    }

    /**
     * Define el valor de la propiedad acctStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctStatus(String value) {
        this.acctStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad schemeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeCode() {
        return schemeCode;
    }

    /**
     * Define el valor de la propiedad schemeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeCode(String value) {
        this.schemeCode = value;
    }

}
