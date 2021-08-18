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
 * <p>Clase Java para instlDet complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="instlDet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="installmentAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maturityDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxLoanAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numInstallments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalInsuranceAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalInterestAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instlDet", propOrder = {
    "installmentAmt",
    "maturityDate",
    "maxLoanAmt",
    "numInstallments",
    "totalInsuranceAmt",
    "totalInterestAmt"
})
public class InstlDet
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String installmentAmt;
    protected String maturityDate;
    protected String maxLoanAmt;
    protected String numInstallments;
    protected String totalInsuranceAmt;
    protected String totalInterestAmt;

    /**
     * Obtiene el valor de la propiedad installmentAmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentAmt() {
        return installmentAmt;
    }

    /**
     * Define el valor de la propiedad installmentAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentAmt(String value) {
        this.installmentAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad maturityDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaturityDate() {
        return maturityDate;
    }

    /**
     * Define el valor de la propiedad maturityDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaturityDate(String value) {
        this.maturityDate = value;
    }

    /**
     * Obtiene el valor de la propiedad maxLoanAmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxLoanAmt() {
        return maxLoanAmt;
    }

    /**
     * Define el valor de la propiedad maxLoanAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxLoanAmt(String value) {
        this.maxLoanAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad numInstallments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumInstallments() {
        return numInstallments;
    }

    /**
     * Define el valor de la propiedad numInstallments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumInstallments(String value) {
        this.numInstallments = value;
    }

    /**
     * Obtiene el valor de la propiedad totalInsuranceAmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalInsuranceAmt() {
        return totalInsuranceAmt;
    }

    /**
     * Define el valor de la propiedad totalInsuranceAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalInsuranceAmt(String value) {
        this.totalInsuranceAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad totalInterestAmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalInterestAmt() {
        return totalInterestAmt;
    }

    /**
     * Define el valor de la propiedad totalInterestAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalInterestAmt(String value) {
        this.totalInterestAmt = value;
    }

}
