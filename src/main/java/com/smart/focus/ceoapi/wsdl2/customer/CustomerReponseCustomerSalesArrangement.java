
package com.smart.focus.ceoapi.wsdl2.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * CustomerReponseCustomerSalesArrangement complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerSalesArrangement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalesOrganisationID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="DistributionChannelCode" type="{http://sap.com/xi/AP/Common/GDT}DistributionChannelCode" minOccurs="0"/&gt;
 *         &lt;element name="Incoterms" type="{http://sap.com/xi/AP/Common/GDT}Incoterms" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryPriorityCode" type="{http://sap.com/xi/AP/Common/GDT}PriorityCode" minOccurs="0"/&gt;
 *         &lt;element name="CompleteDeliveryRequestedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://sap.com/xi/AP/Common/GDT}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="CustomerGroupCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscountTermsCode" type="{http://sap.com/xi/AP/Common/GDT}CashDiscountTermsCode" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B}Ext00163EA977381EDC88BC93BBE82C9990"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerSalesArrangement", propOrder = {
        "salesOrganisationID",
        "distributionChannelCode",
        "incoterms",
        "deliveryPriorityCode",
        "completeDeliveryRequestedIndicator",
        "currencyCode",
        "customerGroupCode",
        "cashDiscountTermsCode",
        "zCustomerSalesUnitName"
})
public class CustomerReponseCustomerSalesArrangement {

    @XmlElement(name = "SalesOrganisationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrganisationID;
    @XmlElement(name = "DistributionChannelCode")
    protected DistributionChannelCode distributionChannelCode;
    @XmlElement(name = "Incoterms")
    protected Incoterms incoterms;
    @XmlElement(name = "DeliveryPriorityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryPriorityCode;
    @XmlElement(name = "CompleteDeliveryRequestedIndicator")
    protected Boolean completeDeliveryRequestedIndicator;
    @XmlElement(name = "CurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String currencyCode;
    @XmlElement(name = "CustomerGroupCode")
    protected CustomerGroupCode customerGroupCode;
    @XmlElement(name = "CashDiscountTermsCode")
    protected CashDiscountTermsCode cashDiscountTermsCode;
    @XmlElement(name = "ZCustomerSalesUnitName", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B")
    protected String zCustomerSalesUnitName;

    /**
     * salesOrganisationID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSalesOrganisationID() {
        return salesOrganisationID;
    }

    /**
     * salesOrganisationID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSalesOrganisationID(String value) {
        this.salesOrganisationID = value;
    }

    /**
     * distributionChannelCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link DistributionChannelCode }
     * 
     */
    public DistributionChannelCode getDistributionChannelCode() {
        return distributionChannelCode;
    }

    /**
     * distributionChannelCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link DistributionChannelCode }
     * 
     */
    public void setDistributionChannelCode(DistributionChannelCode value) {
        this.distributionChannelCode = value;
    }

    /**
     * incoterms 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Incoterms }
     * 
     */
    public Incoterms getIncoterms() {
        return incoterms;
    }

    /**
     * incoterms 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Incoterms }
     * 
     */
    public void setIncoterms(Incoterms value) {
        this.incoterms = value;
    }

    /**
     * deliveryPriorityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDeliveryPriorityCode() {
        return deliveryPriorityCode;
    }

    /**
     * deliveryPriorityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDeliveryPriorityCode(String value) {
        this.deliveryPriorityCode = value;
    }

    /**
     * completeDeliveryRequestedIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isCompleteDeliveryRequestedIndicator() {
        return completeDeliveryRequestedIndicator;
    }

    /**
     * completeDeliveryRequestedIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setCompleteDeliveryRequestedIndicator(Boolean value) {
        this.completeDeliveryRequestedIndicator = value;
    }

    /**
     * currencyCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * currencyCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * customerGroupCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CustomerGroupCode }
     * 
     */
    public CustomerGroupCode getCustomerGroupCode() {
        return customerGroupCode;
    }

    /**
     * customerGroupCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CustomerGroupCode }
     * 
     */
    public void setCustomerGroupCode(CustomerGroupCode value) {
        this.customerGroupCode = value;
    }

    /**
     * cashDiscountTermsCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CashDiscountTermsCode }
     * 
     */
    public CashDiscountTermsCode getCashDiscountTermsCode() {
        return cashDiscountTermsCode;
    }

    /**
     * cashDiscountTermsCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CashDiscountTermsCode }
     * 
     */
    public void setCashDiscountTermsCode(CashDiscountTermsCode value) {
        this.cashDiscountTermsCode = value;
    }

    /**
     * zCustomerSalesUnitName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getZCustomerSalesUnitName() {
        return zCustomerSalesUnitName;
    }

    /**
     * zCustomerSalesUnitName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setZCustomerSalesUnitName(String value) {
        this.zCustomerSalesUnitName = value;
    }

}
