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
 * <p>Clase Java para LoanOtherDtlsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoanOtherDtlsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acctInsuFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insuAgncyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPrdEndDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanOtherDtlsType", propOrder = {
    "acctInsuFlg",
    "insuAgncyCode",
    "loanPrdEndDt"
})
public class LoanOtherDtlsType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String acctInsuFlg;
    protected String insuAgncyCode;
    protected String loanPrdEndDt;

    /**
     * Obtiene el valor de la propiedad acctInsuFlg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctInsuFlg() {
        return acctInsuFlg;
    }

    /**
     * Define el valor de la propiedad acctInsuFlg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctInsuFlg(String value) {
        this.acctInsuFlg = value;
    }

    /**
     * Obtiene el valor de la propiedad insuAgncyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuAgncyCode() {
        return insuAgncyCode;
    }

    /**
     * Define el valor de la propiedad insuAgncyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuAgncyCode(String value) {
        this.insuAgncyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad loanPrdEndDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPrdEndDt() {
        return loanPrdEndDt;
    }

    /**
     * Define el valor de la propiedad loanPrdEndDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPrdEndDt(String value) {
        this.loanPrdEndDt = value;
    }

}
