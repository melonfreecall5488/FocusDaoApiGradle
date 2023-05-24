
package com.smart.focus.ceoapi.wsdl2.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SupplierByElementsReponseSupplierTelephone complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsReponseSupplierTelephone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description"/&gt;
 *         &lt;element name="MobilePhoneNumberIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsReponseSupplierTelephone", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "formattedNumberDescription",
        "mobilePhoneNumberIndicator"
})
public class SupplierByElementsReponseSupplierTelephone {

    @XmlElement(name = "FormattedNumberDescription", required = true)
    protected String formattedNumberDescription;
    @XmlElement(name = "MobilePhoneNumberIndicator")
    protected Boolean mobilePhoneNumberIndicator;

    /**
     * formattedNumberDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFormattedNumberDescription() {
        return formattedNumberDescription;
    }

    /**
     * formattedNumberDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setFormattedNumberDescription(String value) {
        this.formattedNumberDescription = value;
    }

    /**
     * mobilePhoneNumberIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isMobilePhoneNumberIndicator() {
        return mobilePhoneNumberIndicator;
    }

    /**
     * mobilePhoneNumberIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setMobilePhoneNumberIndicator(Boolean value) {
        this.mobilePhoneNumberIndicator = value;
    }

}
