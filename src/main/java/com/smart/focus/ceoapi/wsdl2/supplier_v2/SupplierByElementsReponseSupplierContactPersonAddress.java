
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplierByElementsReponseSupplierContactPersonAddress complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsReponseSupplierContactPersonAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PostalAddress" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierAddressPostalAddress" minOccurs="0"/&gt;
 *         &lt;element name="Telephone" type="{http://sap.com/xi/A1S/Global}SupplierByElementsReponseSupplierTelephone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FacsimileFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="EMailURI" type="{http://sap.com/xi/AP/Common/GDT}EmailURI" minOccurs="0"/&gt;
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
@XmlType(name = "SupplierByElementsReponseSupplierContactPersonAddress", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "postalAddress",
    "telephone",
    "facsimileFormattedNumberDescription",
    "eMailURI",
    "formattedAddress"
})
public class SupplierByElementsReponseSupplierContactPersonAddress {

    @XmlElement(name = "PostalAddress")
    protected SupplierByElementsResponseSupplierAddressPostalAddress postalAddress;
    @XmlElement(name = "Telephone")
    protected List<SupplierByElementsReponseSupplierTelephone> telephone;
    @XmlElement(name = "FacsimileFormattedNumberDescription")
    protected String facsimileFormattedNumberDescription;
    @XmlElement(name = "EMailURI")
    protected EmailURI eMailURI;
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
     * {@link SupplierByElementsReponseSupplierTelephone }
     * 
     * 
     */
    public List<SupplierByElementsReponseSupplierTelephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<SupplierByElementsReponseSupplierTelephone>();
        }
        return this.telephone;
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
