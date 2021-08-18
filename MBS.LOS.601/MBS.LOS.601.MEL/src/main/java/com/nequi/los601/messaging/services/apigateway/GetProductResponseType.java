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
 * <p>Clase Java para GetProductResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GetProductResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schmCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schmType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="branchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genLedgerSubHeadCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acctCurr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repricingPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanPeriodMonths" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eqInstallFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installFreq" type="{http://nequi.co/message/bussines/services/getProduct}FreqType" minOccurs="0"/>
 *         &lt;element name="installmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intFreq" type="{http://nequi.co/message/bussines/services/getProduct}FreqType" minOccurs="0"/>
 *         &lt;element name="noOfInstall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="repayMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loanIntTblDtlRec" type="{http://nequi.co/message/bussines/services/getProduct}LoanIntTblDtlRecType" minOccurs="0"/>
 *         &lt;element name="deductOvduDmds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modeOfDisb" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="finalDisbFlg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grossNetDisbt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isDetailsEntered" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tranType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="solId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="agreement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementWithInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lifeInsuranceContract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commission" type="{http://nequi.co/message/bussines/services/getProduct}CommissionType" minOccurs="0"/>
 *         &lt;element name="interestAE" type="{http://nequi.co/message/bussines/services/getProduct}CommissionType" minOccurs="0"/>
 *         &lt;element name="moratoriumInterestAE" type="{http://nequi.co/message/bussines/services/getProduct}CommissionType" minOccurs="0"/>
 *         &lt;element name="loanOtherDtls" type="{http://nequi.co/message/bussines/services/getProduct}LoanOtherDtlsType" minOccurs="0"/>
 *         &lt;element name="instlDet" type="{http://nequi.co/message/bussines/services/getProduct}instlDet" minOccurs="0"/>
 *         &lt;element name="maxInstallment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="minInstallment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdfAgreement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdfAgreementWithInsurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProductResponseType", propOrder = {
    "schmCode",
    "schmType",
    "branchId",
    "genLedgerSubHeadCode",
    "curCode",
    "currencyCode",
    "acctCurr",
    "repricingPlan",
    "loanPeriodMonths",
    "eqInstallFlg",
    "installFreq",
    "installmentId",
    "intFreq",
    "noOfInstall",
    "repayMethod",
    "loanIntTblDtlRec",
    "deductOvduDmds",
    "modeOfDisb",
    "finalDisbFlg",
    "grossNetDisbt",
    "isDetailsEntered",
    "tranType",
    "solId",
    "agreement",
    "agreementWithInsurance",
    "lifeInsuranceContract",
    "commission",
    "interestAE",
    "moratoriumInterestAE",
    "loanOtherDtls",
    "instlDet",
    "maxInstallment",
    "minInstallment",
    "attributeId",
    "pdfAgreement",
    "pdfAgreementWithInsurance",
    "name"
})
public class GetProductResponseType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected String schmCode;
    @XmlElement(required = true)
    protected String schmType;
    protected String branchId;
    protected String genLedgerSubHeadCode;
    protected String curCode;
    @XmlElement(required = true)
    protected String currencyCode;
    protected String acctCurr;
    protected String repricingPlan;
    protected String loanPeriodMonths;
    protected String eqInstallFlg;
    protected FreqType installFreq;
    protected String installmentId;
    protected FreqType intFreq;
    protected String noOfInstall;
    protected String repayMethod;
    protected LoanIntTblDtlRecType loanIntTblDtlRec;
    @XmlElement(required = true)
    protected String deductOvduDmds;
    @XmlElement(required = true)
    protected String modeOfDisb;
    @XmlElement(required = true)
    protected String finalDisbFlg;
    @XmlElement(required = true)
    protected String grossNetDisbt;
    @XmlElement(required = true)
    protected String isDetailsEntered;
    @XmlElement(required = true)
    protected String tranType;
    @XmlElement(required = true)
    protected String solId;
    protected String agreement;
    protected String agreementWithInsurance;
    protected String lifeInsuranceContract;
    protected CommissionType commission;
    protected CommissionType interestAE;
    protected CommissionType moratoriumInterestAE;
    protected LoanOtherDtlsType loanOtherDtls;
    protected InstlDet instlDet;
    protected String maxInstallment;
    protected String minInstallment;
    protected String attributeId;
    protected String pdfAgreement;
    protected String pdfAgreementWithInsurance;
    protected String name;

    /**
     * Obtiene el valor de la propiedad schmCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchmCode() {
        return schmCode;
    }

    /**
     * Define el valor de la propiedad schmCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchmCode(String value) {
        this.schmCode = value;
    }

    /**
     * Obtiene el valor de la propiedad schmType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchmType() {
        return schmType;
    }

    /**
     * Define el valor de la propiedad schmType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchmType(String value) {
        this.schmType = value;
    }

    /**
     * Obtiene el valor de la propiedad branchId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Define el valor de la propiedad branchId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Obtiene el valor de la propiedad genLedgerSubHeadCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenLedgerSubHeadCode() {
        return genLedgerSubHeadCode;
    }

    /**
     * Define el valor de la propiedad genLedgerSubHeadCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenLedgerSubHeadCode(String value) {
        this.genLedgerSubHeadCode = value;
    }

    /**
     * Obtiene el valor de la propiedad curCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurCode() {
        return curCode;
    }

    /**
     * Define el valor de la propiedad curCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurCode(String value) {
        this.curCode = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Define el valor de la propiedad currencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad acctCurr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctCurr() {
        return acctCurr;
    }

    /**
     * Define el valor de la propiedad acctCurr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctCurr(String value) {
        this.acctCurr = value;
    }

    /**
     * Obtiene el valor de la propiedad repricingPlan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepricingPlan() {
        return repricingPlan;
    }

    /**
     * Define el valor de la propiedad repricingPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepricingPlan(String value) {
        this.repricingPlan = value;
    }

    /**
     * Obtiene el valor de la propiedad loanPeriodMonths.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanPeriodMonths() {
        return loanPeriodMonths;
    }

    /**
     * Define el valor de la propiedad loanPeriodMonths.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanPeriodMonths(String value) {
        this.loanPeriodMonths = value;
    }

    /**
     * Obtiene el valor de la propiedad eqInstallFlg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqInstallFlg() {
        return eqInstallFlg;
    }

    /**
     * Define el valor de la propiedad eqInstallFlg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqInstallFlg(String value) {
        this.eqInstallFlg = value;
    }

    /**
     * Obtiene el valor de la propiedad installFreq.
     * 
     * @return
     *     possible object is
     *     {@link FreqType }
     *     
     */
    public FreqType getInstallFreq() {
        return installFreq;
    }

    /**
     * Define el valor de la propiedad installFreq.
     * 
     * @param value
     *     allowed object is
     *     {@link FreqType }
     *     
     */
    public void setInstallFreq(FreqType value) {
        this.installFreq = value;
    }

    /**
     * Obtiene el valor de la propiedad installmentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallmentId() {
        return installmentId;
    }

    /**
     * Define el valor de la propiedad installmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallmentId(String value) {
        this.installmentId = value;
    }

    /**
     * Obtiene el valor de la propiedad intFreq.
     * 
     * @return
     *     possible object is
     *     {@link FreqType }
     *     
     */
    public FreqType getIntFreq() {
        return intFreq;
    }

    /**
     * Define el valor de la propiedad intFreq.
     * 
     * @param value
     *     allowed object is
     *     {@link FreqType }
     *     
     */
    public void setIntFreq(FreqType value) {
        this.intFreq = value;
    }

    /**
     * Obtiene el valor de la propiedad noOfInstall.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfInstall() {
        return noOfInstall;
    }

    /**
     * Define el valor de la propiedad noOfInstall.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfInstall(String value) {
        this.noOfInstall = value;
    }

    /**
     * Obtiene el valor de la propiedad repayMethod.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepayMethod() {
        return repayMethod;
    }

    /**
     * Define el valor de la propiedad repayMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepayMethod(String value) {
        this.repayMethod = value;
    }

    /**
     * Obtiene el valor de la propiedad loanIntTblDtlRec.
     * 
     * @return
     *     possible object is
     *     {@link LoanIntTblDtlRecType }
     *     
     */
    public LoanIntTblDtlRecType getLoanIntTblDtlRec() {
        return loanIntTblDtlRec;
    }

    /**
     * Define el valor de la propiedad loanIntTblDtlRec.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanIntTblDtlRecType }
     *     
     */
    public void setLoanIntTblDtlRec(LoanIntTblDtlRecType value) {
        this.loanIntTblDtlRec = value;
    }

    /**
     * Obtiene el valor de la propiedad deductOvduDmds.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductOvduDmds() {
        return deductOvduDmds;
    }

    /**
     * Define el valor de la propiedad deductOvduDmds.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeductOvduDmds(String value) {
        this.deductOvduDmds = value;
    }

    /**
     * Obtiene el valor de la propiedad modeOfDisb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeOfDisb() {
        return modeOfDisb;
    }

    /**
     * Define el valor de la propiedad modeOfDisb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeOfDisb(String value) {
        this.modeOfDisb = value;
    }

    /**
     * Obtiene el valor de la propiedad finalDisbFlg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalDisbFlg() {
        return finalDisbFlg;
    }

    /**
     * Define el valor de la propiedad finalDisbFlg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalDisbFlg(String value) {
        this.finalDisbFlg = value;
    }

    /**
     * Obtiene el valor de la propiedad grossNetDisbt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrossNetDisbt() {
        return grossNetDisbt;
    }

    /**
     * Define el valor de la propiedad grossNetDisbt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrossNetDisbt(String value) {
        this.grossNetDisbt = value;
    }

    /**
     * Obtiene el valor de la propiedad isDetailsEntered.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDetailsEntered() {
        return isDetailsEntered;
    }

    /**
     * Define el valor de la propiedad isDetailsEntered.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDetailsEntered(String value) {
        this.isDetailsEntered = value;
    }

    /**
     * Obtiene el valor de la propiedad tranType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranType() {
        return tranType;
    }

    /**
     * Define el valor de la propiedad tranType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranType(String value) {
        this.tranType = value;
    }

    /**
     * Obtiene el valor de la propiedad solId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolId() {
        return solId;
    }

    /**
     * Define el valor de la propiedad solId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolId(String value) {
        this.solId = value;
    }

    /**
     * Obtiene el valor de la propiedad agreement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreement() {
        return agreement;
    }

    /**
     * Define el valor de la propiedad agreement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreement(String value) {
        this.agreement = value;
    }

    /**
     * Obtiene el valor de la propiedad agreementWithInsurance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgreementWithInsurance() {
        return agreementWithInsurance;
    }

    /**
     * Define el valor de la propiedad agreementWithInsurance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgreementWithInsurance(String value) {
        this.agreementWithInsurance = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeInsuranceContract.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeInsuranceContract() {
        return lifeInsuranceContract;
    }

    /**
     * Define el valor de la propiedad lifeInsuranceContract.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeInsuranceContract(String value) {
        this.lifeInsuranceContract = value;
    }

    /**
     * Obtiene el valor de la propiedad commission.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Define el valor de la propiedad commission.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Obtiene el valor de la propiedad interestAE.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getInterestAE() {
        return interestAE;
    }

    /**
     * Define el valor de la propiedad interestAE.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setInterestAE(CommissionType value) {
        this.interestAE = value;
    }

    /**
     * Obtiene el valor de la propiedad moratoriumInterestAE.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getMoratoriumInterestAE() {
        return moratoriumInterestAE;
    }

    /**
     * Define el valor de la propiedad moratoriumInterestAE.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setMoratoriumInterestAE(CommissionType value) {
        this.moratoriumInterestAE = value;
    }

    /**
     * Obtiene el valor de la propiedad loanOtherDtls.
     * 
     * @return
     *     possible object is
     *     {@link LoanOtherDtlsType }
     *     
     */
    public LoanOtherDtlsType getLoanOtherDtls() {
        return loanOtherDtls;
    }

    /**
     * Define el valor de la propiedad loanOtherDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanOtherDtlsType }
     *     
     */
    public void setLoanOtherDtls(LoanOtherDtlsType value) {
        this.loanOtherDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad instlDet.
     * 
     * @return
     *     possible object is
     *     {@link InstlDet }
     *     
     */
    public InstlDet getInstlDet() {
        return instlDet;
    }

    /**
     * Define el valor de la propiedad instlDet.
     * 
     * @param value
     *     allowed object is
     *     {@link InstlDet }
     *     
     */
    public void setInstlDet(InstlDet value) {
        this.instlDet = value;
    }

    /**
     * Obtiene el valor de la propiedad maxInstallment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxInstallment() {
        return maxInstallment;
    }

    /**
     * Define el valor de la propiedad maxInstallment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxInstallment(String value) {
        this.maxInstallment = value;
    }

    /**
     * Obtiene el valor de la propiedad minInstallment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinInstallment() {
        return minInstallment;
    }

    /**
     * Define el valor de la propiedad minInstallment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinInstallment(String value) {
        this.minInstallment = value;
    }

    /**
     * Obtiene el valor de la propiedad attributeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeId() {
        return attributeId;
    }

    /**
     * Define el valor de la propiedad attributeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeId(String value) {
        this.attributeId = value;
    }

    /**
     * Obtiene el valor de la propiedad pdfAgreement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfAgreement() {
        return pdfAgreement;
    }

    /**
     * Define el valor de la propiedad pdfAgreement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfAgreement(String value) {
        this.pdfAgreement = value;
    }

    /**
     * Obtiene el valor de la propiedad pdfAgreementWithInsurance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfAgreementWithInsurance() {
        return pdfAgreementWithInsurance;
    }

    /**
     * Define el valor de la propiedad pdfAgreementWithInsurance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfAgreementWithInsurance(String value) {
        this.pdfAgreementWithInsurance = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
