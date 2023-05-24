
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>SupplierByElementsResponseSupplierBankDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsResponseSupplierBankDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerBankDetailsID" minOccurs="0"/&gt;
 *         &lt;element name="BankUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="BankInternalID" type="{http://sap.com/xi/AP/Common/GDT}BankInternalID" minOccurs="0"/&gt;
 *         &lt;element name="BankRoutingID" type="{http://sap.com/xi/AP/Common/GDT}BankRoutingID" minOccurs="0"/&gt;
 *         &lt;element name="BankRoutingIDTypeCode" type="{http://sap.com/xi/AP/Common/GDT}BankRoutingIDTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BankStandardID" type="{http://sap.com/xi/AP/Common/GDT}BankStandardID" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountID" type="{http://sap.com/xi/AP/Common/GDT}BankAccountID" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountIDCheckDigitValue" type="{http://sap.com/xi/AP/Common/GDT}BankAccountIDCheckDigitValue" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountTypeCode" type="{http://sap.com/xi/AP/Common/GDT}BankAccountTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountHolderName" type="{http://sap.com/xi/AP/Common/GDT}BankAccountHolderName_V1" minOccurs="0"/&gt;
 *         &lt;element name="BankAccountStandardID" type="{http://sap.com/xi/AP/Common/GDT}BankAccountStandardID" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="NLGAccountIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="BankDirectoryBranchID" type="{http://sap.com/xi/AP/Common/GDT}BankBranchID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsResponseSupplierBankDetails", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "id",
    "bankUUID",
    "bankInternalID",
    "bankRoutingID",
    "bankRoutingIDTypeCode",
    "bankStandardID",
    "bankAccountID",
    "bankAccountIDCheckDigitValue",
    "bankAccountTypeCode",
    "bankAccountHolderName",
    "bankAccountStandardID",
    "validityPeriod",
    "nlgAccountIndicator",
    "bankDirectoryBranchID"
})
public class SupplierByElementsResponseSupplierBankDetails {

    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "BankUUID")
    protected UUID bankUUID;
    @XmlElement(name = "BankInternalID")
    protected BankInternalID bankInternalID;
    @XmlElement(name = "BankRoutingID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankRoutingID;
    @XmlElement(name = "BankRoutingIDTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankRoutingIDTypeCode;
    @XmlElement(name = "BankStandardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankStandardID;
    @XmlElement(name = "BankAccountID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccountID;
    @XmlElement(name = "BankAccountIDCheckDigitValue")
    protected String bankAccountIDCheckDigitValue;
    @XmlElement(name = "BankAccountTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccountTypeCode;
    @XmlElement(name = "BankAccountHolderName")
    protected String bankAccountHolderName;
    @XmlElement(name = "BankAccountStandardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankAccountStandardID;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;
    @XmlElement(name = "NLGAccountIndicator")
    protected Boolean nlgAccountIndicator;
    @XmlElement(name = "BankDirectoryBranchID")
    protected BankBranchID bankDirectoryBranchID;

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * bankUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getBankUUID() {
        return bankUUID;
    }

    /**
     * bankUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setBankUUID(UUID value) {
        this.bankUUID = value;
    }

    /**
     * bankInternalID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BankInternalID }
     *     
     */
    public BankInternalID getBankInternalID() {
        return bankInternalID;
    }

    /**
     * bankInternalID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BankInternalID }
     *     
     */
    public void setBankInternalID(BankInternalID value) {
        this.bankInternalID = value;
    }

    /**
     * bankRoutingID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankRoutingID() {
        return bankRoutingID;
    }

    /**
     * bankRoutingID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankRoutingID(String value) {
        this.bankRoutingID = value;
    }

    /**
     * bankRoutingIDTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankRoutingIDTypeCode() {
        return bankRoutingIDTypeCode;
    }

    /**
     * bankRoutingIDTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankRoutingIDTypeCode(String value) {
        this.bankRoutingIDTypeCode = value;
    }

    /**
     * bankStandardID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankStandardID() {
        return bankStandardID;
    }

    /**
     * bankStandardID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankStandardID(String value) {
        this.bankStandardID = value;
    }

    /**
     * bankAccountID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountID() {
        return bankAccountID;
    }

    /**
     * bankAccountID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountID(String value) {
        this.bankAccountID = value;
    }

    /**
     * bankAccountIDCheckDigitValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountIDCheckDigitValue() {
        return bankAccountIDCheckDigitValue;
    }

    /**
     * bankAccountIDCheckDigitValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountIDCheckDigitValue(String value) {
        this.bankAccountIDCheckDigitValue = value;
    }

    /**
     * bankAccountTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountTypeCode() {
        return bankAccountTypeCode;
    }

    /**
     * bankAccountTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountTypeCode(String value) {
        this.bankAccountTypeCode = value;
    }

    /**
     * bankAccountHolderName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountHolderName() {
        return bankAccountHolderName;
    }

    /**
     * bankAccountHolderName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountHolderName(String value) {
        this.bankAccountHolderName = value;
    }

    /**
     * bankAccountStandardID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountStandardID() {
        return bankAccountStandardID;
    }

    /**
     * bankAccountStandardID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountStandardID(String value) {
        this.bankAccountStandardID = value;
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
     * nlgAccountIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNLGAccountIndicator() {
        return nlgAccountIndicator;
    }

    /**
     * nlgAccountIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNLGAccountIndicator(Boolean value) {
        this.nlgAccountIndicator = value;
    }

    /**
     * bankDirectoryBranchID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BankBranchID }
     *     
     */
    public BankBranchID getBankDirectoryBranchID() {
        return bankDirectoryBranchID;
    }

    /**
     * bankDirectoryBranchID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BankBranchID }
     *     
     */
    public void setBankDirectoryBranchID(BankBranchID value) {
        this.bankDirectoryBranchID = value;
    }

}
