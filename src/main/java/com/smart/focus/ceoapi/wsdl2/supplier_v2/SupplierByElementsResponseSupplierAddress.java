
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>SupplierByElementsResponseSupplierAddress complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsResponseSupplierAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostalAddress" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierAddressPostalAddress" minOccurs="0"/&gt;
 *         &lt;element name="PhoneFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="FacsimileFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="EMailURI" type="{http://sap.com/xi/AP/Common/GDT}EmailURI" minOccurs="0"/&gt;
 *         &lt;element name="WebURI" type="{http://sap.com/xi/AP/Common/GDT}WebURI" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondenceLanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="FormattedAddress" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierAddressFormattedAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsResponseSupplierAddress", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "postalAddress",
    "phoneFormattedNumberDescription",
    "facsimileFormattedNumberDescription",
    "eMailURI",
    "webURI",
    "correspondenceLanguageCode",
    "formattedAddress"
})
public class SupplierByElementsResponseSupplierAddress {

    @XmlElement(name = "PostalAddress")
    protected SupplierByElementsResponseSupplierAddressPostalAddress postalAddress;
    @XmlElement(name = "PhoneFormattedNumberDescription")
    protected String phoneFormattedNumberDescription;
    @XmlElement(name = "FacsimileFormattedNumberDescription")
    protected String facsimileFormattedNumberDescription;
    @XmlElement(name = "EMailURI")
    protected EmailURI eMailURI;
    @XmlElement(name = "WebURI")
    @XmlSchemaType(name = "anyURI")
    protected String webURI;
    @XmlElement(name = "CorrespondenceLanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String correspondenceLanguageCode;
    @XmlElement(name = "FormattedAddress")
    protected SupplierByElementsResponseSupplierAddressFormattedAddress formattedAddress;

    /**
     * postalAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SupplierByElementsResponseSupplierAddressPostalAddress }
     *     
     */
    public SupplierByElementsResponseSupplierAddressPostalAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * postalAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierByElementsResponseSupplierAddressPostalAddress }
     *     
     */
    public void setPostalAddress(SupplierByElementsResponseSupplierAddressPostalAddress value) {
        this.postalAddress = value;
    }

    /**
     * phoneFormattedNumberDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneFormattedNumberDescription() {
        return phoneFormattedNumberDescription;
    }

    /**
     * phoneFormattedNumberDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneFormattedNumberDescription(String value) {
        this.phoneFormattedNumberDescription = value;
    }

    /**
     * facsimileFormattedNumberDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacsimileFormattedNumberDescription() {
        return facsimileFormattedNumberDescription;
    }

    /**
     * facsimileFormattedNumberDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacsimileFormattedNumberDescription(String value) {
        this.facsimileFormattedNumberDescription = value;
    }

    /**
     * eMailURI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EmailURI }
     *     
     */
    public EmailURI getEMailURI() {
        return eMailURI;
    }

    /**
     * eMailURI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailURI }
     *     
     */
    public void setEMailURI(EmailURI value) {
        this.eMailURI = value;
    }

    /**
     * webURI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebURI() {
        return webURI;
    }

    /**
     * webURI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebURI(String value) {
        this.webURI = value;
    }

    /**
     * correspondenceLanguageCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondenceLanguageCode() {
        return correspondenceLanguageCode;
    }

    /**
     * correspondenceLanguageCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondenceLanguageCode(String value) {
        this.correspondenceLanguageCode = value;
    }

    /**
     * formattedAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SupplierByElementsResponseSupplierAddressFormattedAddress }
     *     
     */
    public SupplierByElementsResponseSupplierAddressFormattedAddress getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * formattedAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierByElementsResponseSupplierAddressFormattedAddress }
     *     
     */
    public void setFormattedAddress(SupplierByElementsResponseSupplierAddressFormattedAddress value) {
        this.formattedAddress = value;
    }

}
