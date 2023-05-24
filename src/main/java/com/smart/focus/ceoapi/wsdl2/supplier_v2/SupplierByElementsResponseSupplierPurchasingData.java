
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>SupplierByElementsResponseSupplierPurchasingData complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsResponseSupplierPurchasingData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CashDiscountTermsCode" type="{http://sap.com/xi/AP/Common/GDT}CashDiscountTermsCode" minOccurs="0"/&gt;
 *         &lt;element name="IncotermsCode" type="{http://sap.com/xi/AP/Common/GDT}IncotermsClassificationCode" minOccurs="0"/&gt;
 *         &lt;element name="IncotermsLocationName" type="{http://sap.com/xi/AP/Common/GDT}IncotermsTransferLocationName" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderCurrencyCode" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingBlockIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CustomerIDAtSupplier" type="{http://sap.com/xi/AP/Common/GDT}PartyPartyID" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderConfirmationRequiredCode" type="{http://sap.com/xi/AP/Common/GDT}FollowUpBusinessTransactionDocumentRequirementCode" minOccurs="0"/&gt;
 *         &lt;element name="EvaluatedReceiptSettlementIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsResponseSupplierPurchasingData", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "cashDiscountTermsCode",
    "incotermsCode",
    "incotermsLocationName",
    "purchaseOrderCurrencyCode",
    "purchasingBlockIndicator",
    "customerIDAtSupplier",
    "purchaseOrderConfirmationRequiredCode",
    "evaluatedReceiptSettlementIndicator"
})
public class SupplierByElementsResponseSupplierPurchasingData {

    @XmlElement(name = "CashDiscountTermsCode")
    protected CashDiscountTermsCode cashDiscountTermsCode;
    @XmlElement(name = "IncotermsCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String incotermsCode;
    @XmlElement(name = "IncotermsLocationName")
    protected String incotermsLocationName;
    @XmlElement(name = "PurchaseOrderCurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String purchaseOrderCurrencyCode;
    @XmlElement(name = "PurchasingBlockIndicator")
    protected Boolean purchasingBlockIndicator;
    @XmlElement(name = "CustomerIDAtSupplier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customerIDAtSupplier;
    @XmlElement(name = "PurchaseOrderConfirmationRequiredCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String purchaseOrderConfirmationRequiredCode;
    @XmlElement(name = "EvaluatedReceiptSettlementIndicator")
    protected Boolean evaluatedReceiptSettlementIndicator;

    /**
     * cashDiscountTermsCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CashDiscountTermsCode }
     *     
     */
    public CashDiscountTermsCode getCashDiscountTermsCode() {
        return cashDiscountTermsCode;
    }

    /**
     * cashDiscountTermsCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CashDiscountTermsCode }
     *     
     */
    public void setCashDiscountTermsCode(CashDiscountTermsCode value) {
        this.cashDiscountTermsCode = value;
    }

    /**
     * incotermsCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncotermsCode() {
        return incotermsCode;
    }

    /**
     * incotermsCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncotermsCode(String value) {
        this.incotermsCode = value;
    }

    /**
     * incotermsLocationName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncotermsLocationName() {
        return incotermsLocationName;
    }

    /**
     * incotermsLocationName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncotermsLocationName(String value) {
        this.incotermsLocationName = value;
    }

    /**
     * purchaseOrderCurrencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderCurrencyCode() {
        return purchaseOrderCurrencyCode;
    }

    /**
     * purchaseOrderCurrencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderCurrencyCode(String value) {
        this.purchaseOrderCurrencyCode = value;
    }

    /**
     * purchasingBlockIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPurchasingBlockIndicator() {
        return purchasingBlockIndicator;
    }

    /**
     * purchasingBlockIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPurchasingBlockIndicator(Boolean value) {
        this.purchasingBlockIndicator = value;
    }

    /**
     * customerIDAtSupplier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerIDAtSupplier() {
        return customerIDAtSupplier;
    }

    /**
     * customerIDAtSupplier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerIDAtSupplier(String value) {
        this.customerIDAtSupplier = value;
    }

    /**
     * purchaseOrderConfirmationRequiredCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderConfirmationRequiredCode() {
        return purchaseOrderConfirmationRequiredCode;
    }

    /**
     * purchaseOrderConfirmationRequiredCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderConfirmationRequiredCode(String value) {
        this.purchaseOrderConfirmationRequiredCode = value;
    }

    /**
     * evaluatedReceiptSettlementIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEvaluatedReceiptSettlementIndicator() {
        return evaluatedReceiptSettlementIndicator;
    }

    /**
     * evaluatedReceiptSettlementIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEvaluatedReceiptSettlementIndicator(Boolean value) {
        this.evaluatedReceiptSettlementIndicator = value;
    }

}
