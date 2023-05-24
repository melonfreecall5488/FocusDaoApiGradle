
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
 * <p>CustomerReponseCustomerAddress complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorrespondenceLanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="PreferredCommunicationMediumTypeCode" type="{http://sap.com/xi/AP/Common/GDT}CommunicationMediumTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="EmailURI" type="{http://sap.com/xi/AP/Common/GDT}EmailURI" minOccurs="0"/&gt;
 *         &lt;element name="FacsimileFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddress" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerAddressPostalAddress" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerAddressTelephone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WebURI" type="{http://sap.com/xi/AP/Common/GDT}WebURI" minOccurs="0"/&gt;
 *         &lt;element name="FormattedAddress" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerFormattedAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerAddress", propOrder = {
    "correspondenceLanguageCode",
    "preferredCommunicationMediumTypeCode",
    "emailURI",
    "facsimileFormattedNumberDescription",
    "postalAddress",
    "telephone",
    "webURI",
    "formattedAddress"
})
public class CustomerReponseCustomerAddress {

    @XmlElement(name = "CorrespondenceLanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String correspondenceLanguageCode;
    @XmlElement(name = "PreferredCommunicationMediumTypeCode")
    protected CommunicationMediumTypeCode preferredCommunicationMediumTypeCode;
    @XmlElement(name = "EmailURI")
    protected EmailURI emailURI;
    @XmlElement(name = "FacsimileFormattedNumberDescription")
    protected String facsimileFormattedNumberDescription;
    @XmlElement(name = "PostalAddress")
    protected CustomerReponseCustomerAddressPostalAddress postalAddress;
    @XmlElement(name = "Telephone")
    protected List<CustomerReponseCustomerAddressTelephone> telephone;
    @XmlElement(name = "WebURI")
    @XmlSchemaType(name = "anyURI")
    protected String webURI;
    @XmlElement(name = "FormattedAddress")
    protected CustomerReponseCustomerFormattedAddress formattedAddress;

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
     * preferredCommunicationMediumTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMediumTypeCode }
     *     
     */
    public CommunicationMediumTypeCode getPreferredCommunicationMediumTypeCode() {
        return preferredCommunicationMediumTypeCode;
    }

    /**
     * preferredCommunicationMediumTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMediumTypeCode }
     *     
     */
    public void setPreferredCommunicationMediumTypeCode(CommunicationMediumTypeCode value) {
        this.preferredCommunicationMediumTypeCode = value;
    }

    /**
     * emailURI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link EmailURI }
     *     
     */
    public EmailURI getEmailURI() {
        return emailURI;
    }

    /**
     * emailURI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailURI }
     *     
     */
    public void setEmailURI(EmailURI value) {
        this.emailURI = value;
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
     * postalAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReponseCustomerAddressPostalAddress }
     *     
     */
    public CustomerReponseCustomerAddressPostalAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * postalAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReponseCustomerAddressPostalAddress }
     *     
     */
    public void setPostalAddress(CustomerReponseCustomerAddressPostalAddress value) {
        this.postalAddress = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerAddressTelephone }
     * 
     * 
     */
    public List<CustomerReponseCustomerAddressTelephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<CustomerReponseCustomerAddressTelephone>();
        }
        return this.telephone;
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
     * formattedAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReponseCustomerFormattedAddress }
     *     
     */
    public CustomerReponseCustomerFormattedAddress getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * formattedAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReponseCustomerFormattedAddress }
     *     
     */
    public void setFormattedAddress(CustomerReponseCustomerFormattedAddress value) {
        this.formattedAddress = value;
    }

}
