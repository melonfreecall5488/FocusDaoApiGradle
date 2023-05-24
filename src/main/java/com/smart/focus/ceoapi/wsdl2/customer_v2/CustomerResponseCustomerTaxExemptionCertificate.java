
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>CustomerResponseCustomerTaxExemptionCertificate complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerResponseCustomerTaxExemptionCertificate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}TaxExemptionCertificateID" minOccurs="0"/&gt;
 *         &lt;element name="ExternalID" type="{http://sap.com/xi/AP/Common/GDT}TaxExemptionCertificateID" minOccurs="0"/&gt;
 *         &lt;element name="CompanyID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxExemptionCertificateTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="MaximumAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerTaxExemptionCertificateLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptionReason" type="{http://sap.com/xi/A1S/Global}CustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerResponseCustomerTaxExemptionCertificate", propOrder = {
    "id",
    "externalID",
    "companyID",
    "typeCode",
    "countryCode",
    "regionCode",
    "taxTypeCode",
    "validityPeriod",
    "maximumAmount",
    "totalAmount",
    "lifeCycleStatusCode",
    "taxExemptionReason"
})
public class CustomerResponseCustomerTaxExemptionCertificate {

    @XmlElement(name = "ID")
    protected TaxExemptionCertificateID id;
    @XmlElement(name = "ExternalID")
    protected TaxExemptionCertificateID externalID;
    @XmlElement(name = "CompanyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyID;
    @XmlElement(name = "TypeCode")
    protected TaxExemptionCertificateTypeCode typeCode;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "RegionCode")
    protected RegionCode regionCode;
    @XmlElement(name = "TaxTypeCode")
    protected TaxTypeCode taxTypeCode;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "MaximumAmount")
    protected Amount maximumAmount;
    @XmlElement(name = "TotalAmount")
    protected Amount totalAmount;
    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "TaxExemptionReason", required = true)
    protected List<CustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason> taxExemptionReason;

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public TaxExemptionCertificateID getID() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public void setID(TaxExemptionCertificateID value) {
        this.id = value;
    }

    /**
     * externalID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public TaxExemptionCertificateID getExternalID() {
        return externalID;
    }

    /**
     * externalID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionCertificateID }
     *     
     */
    public void setExternalID(TaxExemptionCertificateID value) {
        this.externalID = value;
    }

    /**
     * companyID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * companyID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyID(String value) {
        this.companyID = value;
    }

    /**
     * typeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionCertificateTypeCode }
     *     
     */
    public TaxExemptionCertificateTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * typeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionCertificateTypeCode }
     *     
     */
    public void setTypeCode(TaxExemptionCertificateTypeCode value) {
        this.typeCode = value;
    }

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
     * regionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getRegionCode() {
        return regionCode;
    }

    /**
     * regionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setRegionCode(RegionCode value) {
        this.regionCode = value;
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
     * maximumAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * maximumAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setMaximumAmount(Amount value) {
        this.maximumAmount = value;
    }

    /**
     * totalAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getTotalAmount() {
        return totalAmount;
    }

    /**
     * totalAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setTotalAmount(Amount value) {
        this.totalAmount = value;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleStatusCode(String value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * Gets the value of the taxExemptionReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExemptionReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxExemptionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason }
     * 
     * 
     */
    public List<CustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason> getTaxExemptionReason() {
        if (taxExemptionReason == null) {
            taxExemptionReason = new ArrayList<CustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason>();
        }
        return this.taxExemptionReason;
    }

}
