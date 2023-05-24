
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SupplierByElementsResponseSupplierWithholdingTaxClassification complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsResponseSupplierWithholdingTaxClassification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxRateTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxRateTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxIncomeTypeCode" type="{http://sap.com/xi/AP/Common/GDT}WithholdingTaxIncomeTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptionReasonCode" type="{http://sap.com/xi/AP/Common/GDT}TaxExemptionReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxRecipientCode" type="{http://sap.com/xi/AP/FO/WithholdingTax/Global}WithholdingTaxRecipientTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxCertificateID" type="{http://sap.com/xi/AP/Common/GDT}WithholdingTaxCertificateID" minOccurs="0"/&gt;
 *         &lt;element name="ILServiceAndShaamGroup" type="{http://sap.com/xi/AP/Common/GDT}ServiceAndAssetShaamGroup" minOccurs="0"/&gt;
 *         &lt;element name="ILLastChangeDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsResponseSupplierWithholdingTaxClassification", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "countryCode",
    "taxTypeCode",
    "taxRateTypeCode",
    "withholdingTaxIncomeTypeCode",
    "taxExemptionReasonCode",
    "taxRecipientCode",
    "validityPeriod",
    "withholdingTaxCertificateID",
    "ilServiceAndShaamGroup",
    "ilLastChangeDate"
})
public class SupplierByElementsResponseSupplierWithholdingTaxClassification {

    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "TaxTypeCode")
    protected TaxTypeCode taxTypeCode;
    @XmlElement(name = "TaxRateTypeCode")
    protected TaxRateTypeCode taxRateTypeCode;
    @XmlElement(name = "WithholdingTaxIncomeTypeCode")
    protected WithholdingTaxIncomeTypeCode withholdingTaxIncomeTypeCode;
    @XmlElement(name = "TaxExemptionReasonCode")
    protected TaxExemptionReasonCode taxExemptionReasonCode;
    @XmlElement(name = "TaxRecipientCode")
    protected WithholdingTaxRecipientTypeCode taxRecipientCode;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "WithholdingTaxCertificateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String withholdingTaxCertificateID;
    @XmlElement(name = "ILServiceAndShaamGroup")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ilServiceAndShaamGroup;
    @XmlElement(name = "ILLastChangeDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ilLastChangeDate;

    /**
     * countryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * countryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * taxTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeCode }
     *     
     */
    public TaxTypeCode getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * taxTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeCode }
     *     
     */
    public void setTaxTypeCode(TaxTypeCode value) {
        this.taxTypeCode = value;
    }

    /**
     * taxRateTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TaxRateTypeCode }
     *     
     */
    public TaxRateTypeCode getTaxRateTypeCode() {
        return taxRateTypeCode;
    }

    /**
     * taxRateTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRateTypeCode }
     *     
     */
    public void setTaxRateTypeCode(TaxRateTypeCode value) {
        this.taxRateTypeCode = value;
    }

    /**
     * withholdingTaxIncomeTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WithholdingTaxIncomeTypeCode }
     *     
     */
    public WithholdingTaxIncomeTypeCode getWithholdingTaxIncomeTypeCode() {
        return withholdingTaxIncomeTypeCode;
    }

    /**
     * withholdingTaxIncomeTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WithholdingTaxIncomeTypeCode }
     *     
     */
    public void setWithholdingTaxIncomeTypeCode(WithholdingTaxIncomeTypeCode value) {
        this.withholdingTaxIncomeTypeCode = value;
    }

    /**
     * taxExemptionReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReasonCode }
     *     
     */
    public TaxExemptionReasonCode getTaxExemptionReasonCode() {
        return taxExemptionReasonCode;
    }

    /**
     * taxExemptionReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReasonCode }
     *     
     */
    public void setTaxExemptionReasonCode(TaxExemptionReasonCode value) {
        this.taxExemptionReasonCode = value;
    }

    /**
     * taxRecipientCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WithholdingTaxRecipientTypeCode }
     *     
     */
    public WithholdingTaxRecipientTypeCode getTaxRecipientCode() {
        return taxRecipientCode;
    }

    /**
     * taxRecipientCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WithholdingTaxRecipientTypeCode }
     *     
     */
    public void setTaxRecipientCode(WithholdingTaxRecipientTypeCode value) {
        this.taxRecipientCode = value;
    }

    /**
     * validityPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public CLOSEDDatePeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * validityPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public void setValidityPeriod(CLOSEDDatePeriod value) {
        this.validityPeriod = value;
    }

    /**
     * withholdingTaxCertificateID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithholdingTaxCertificateID() {
        return withholdingTaxCertificateID;
    }

    /**
     * withholdingTaxCertificateID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithholdingTaxCertificateID(String value) {
        this.withholdingTaxCertificateID = value;
    }

    /**
     * ilServiceAndShaamGroup 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getILServiceAndShaamGroup() {
        return ilServiceAndShaamGroup;
    }

    /**
     * ilServiceAndShaamGroup 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setILServiceAndShaamGroup(String value) {
        this.ilServiceAndShaamGroup = value;
    }

    /**
     * ilLastChangeDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getILLastChangeDate() {
        return ilLastChangeDate;
    }

    /**
     * ilLastChangeDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setILLastChangeDate(XMLGregorianCalendar value) {
        this.ilLastChangeDate = value;
    }

}
