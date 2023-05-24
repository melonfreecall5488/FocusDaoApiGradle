
package com.smart.focus.ceoapi.wsdl2.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * CustomerReponseCustomerFormattedAddress complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerFormattedAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormattedAddressDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="FormattedPostalAddressDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="FormattedAddress" type="{http://sap.com/xi/AP/Common/GDT}FormattedAddress" minOccurs="0"/&gt;
 *         &lt;element name="FormattedPostalAddress" type="{http://sap.com/xi/AP/Common/GDT}FormattedPostalAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerFormattedAddress", propOrder = {
        "formattedAddressDescription",
        "formattedPostalAddressDescription",
        "formattedAddress",
        "formattedPostalAddress"
})
public class CustomerReponseCustomerFormattedAddress {

    @XmlElement(name = "FormattedAddressDescription")
    protected String formattedAddressDescription;
    @XmlElement(name = "FormattedPostalAddressDescription")
    protected String formattedPostalAddressDescription;
    @XmlElement(name = "FormattedAddress")
    protected FormattedAddress formattedAddress;
    @XmlElement(name = "FormattedPostalAddress")
    protected FormattedPostalAddress formattedPostalAddress;

    /**
     * formattedAddressDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFormattedAddressDescription() {
        return formattedAddressDescription;
    }

    /**
     * formattedAddressDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setFormattedAddressDescription(String value) {
        this.formattedAddressDescription = value;
    }

    /**
     * formattedPostalAddressDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFormattedPostalAddressDescription() {
        return formattedPostalAddressDescription;
    }

    /**
     * formattedPostalAddressDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setFormattedPostalAddressDescription(String value) {
        this.formattedPostalAddressDescription = value;
    }

    /**
     * formattedAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link FormattedAddress }
     * 
     */
    public FormattedAddress getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * formattedAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link FormattedAddress }
     * 
     */
    public void setFormattedAddress(FormattedAddress value) {
        this.formattedAddress = value;
    }

    /**
     * formattedPostalAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link FormattedPostalAddress }
     * 
     */
    public FormattedPostalAddress getFormattedPostalAddress() {
        return formattedPostalAddress;
    }

    /**
     * formattedPostalAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link FormattedPostalAddress }
     * 
     */
    public void setFormattedPostalAddress(FormattedPostalAddress value) {
        this.formattedPostalAddress = value;
    }

}
