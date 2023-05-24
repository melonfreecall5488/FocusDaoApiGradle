
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
 * CustomerReponseCustomerPaymentCardDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerPaymentCardDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerPaymentCardDetailsID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardTypeCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardID" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardHolderName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardExpirationDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="DefaultIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="BlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentCardBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://sap.com/xi/AP/Common/GDT}StreetName" minOccurs="0"/&gt;
 *         &lt;element name="HouseID" type="{http://sap.com/xi/AP/Common/GDT}HouseID" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerPaymentCardDetails", propOrder = {
        "id",
        "paymentCardTypeCode",
        "paymentCardID",
        "paymentCardHolderName",
        "paymentCardExpirationDate",
        "defaultIndicator",
        "blockingReasonCode",
        "streetName",
        "houseID",
        "postalCode",
        "cityName",
        "regionCode",
        "countryCode"
})
public class CustomerReponseCustomerPaymentCardDetails {

    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "PaymentCardTypeCode")
    protected PaymentCardTypeCode paymentCardTypeCode;
    @XmlElement(name = "PaymentCardID")
    protected PaymentCardID paymentCardID;
    @XmlElement(name = "PaymentCardHolderName")
    protected String paymentCardHolderName;
    @XmlElement(name = "PaymentCardExpirationDate")
    protected String paymentCardExpirationDate;
    @XmlElement(name = "DefaultIndicator")
    protected Boolean defaultIndicator;
    @XmlElement(name = "BlockingReasonCode")
    protected PaymentCardBlockingReasonCode blockingReasonCode;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "HouseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String houseID;
    @XmlElement(name = "PostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postalCode;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "RegionCode")
    protected RegionCode regionCode;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getID() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * paymentCardTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link PaymentCardTypeCode }
     * 
     */
    public PaymentCardTypeCode getPaymentCardTypeCode() {
        return paymentCardTypeCode;
    }

    /**
     * paymentCardTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link PaymentCardTypeCode }
     * 
     */
    public void setPaymentCardTypeCode(PaymentCardTypeCode value) {
        this.paymentCardTypeCode = value;
    }

    /**
     * paymentCardID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link PaymentCardID }
     * 
     */
    public PaymentCardID getPaymentCardID() {
        return paymentCardID;
    }

    /**
     * paymentCardID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link PaymentCardID }
     * 
     */
    public void setPaymentCardID(PaymentCardID value) {
        this.paymentCardID = value;
    }

    /**
     * paymentCardHolderName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPaymentCardHolderName() {
        return paymentCardHolderName;
    }

    /**
     * paymentCardHolderName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPaymentCardHolderName(String value) {
        this.paymentCardHolderName = value;
    }

    /**
     * paymentCardExpirationDate 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPaymentCardExpirationDate() {
        return paymentCardExpirationDate;
    }

    /**
     * paymentCardExpirationDate 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPaymentCardExpirationDate(String value) {
        this.paymentCardExpirationDate = value;
    }

    /**
     * defaultIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * defaultIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setDefaultIndicator(Boolean value) {
        this.defaultIndicator = value;
    }

    /**
     * blockingReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link PaymentCardBlockingReasonCode }
     * 
     */
    public PaymentCardBlockingReasonCode getBlockingReasonCode() {
        return blockingReasonCode;
    }

    /**
     * blockingReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link PaymentCardBlockingReasonCode }
     * 
     */
    public void setBlockingReasonCode(PaymentCardBlockingReasonCode value) {
        this.blockingReasonCode = value;
    }

    /**
     * streetName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * streetName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * houseID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getHouseID() {
        return houseID;
    }

    /**
     * houseID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setHouseID(String value) {
        this.houseID = value;
    }

    /**
     * postalCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * postalCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * cityName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * cityName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * regionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link RegionCode }
     * 
     */
    public RegionCode getRegionCode() {
        return regionCode;
    }

    /**
     * regionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link RegionCode }
     * 
     */
    public void setRegionCode(RegionCode value) {
        this.regionCode = value;
    }

    /**
     * countryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * countryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
