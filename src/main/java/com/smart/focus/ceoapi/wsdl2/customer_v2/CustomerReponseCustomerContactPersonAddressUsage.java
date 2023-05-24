
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerReponseCustomerContactPersonAddressUsage complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerContactPersonAddressUsage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressUsageCode" type="{http://sap.com/xi/AP/Common/GDT}AddressUsageCode"/&gt;
 *         &lt;element name="DefaultIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerContactPersonAddressUsage", propOrder = {
    "addressUsageCode",
    "defaultIndicator"
})
public class CustomerReponseCustomerContactPersonAddressUsage {

    @XmlElement(name = "AddressUsageCode", required = true)
    protected AddressUsageCode addressUsageCode;
    @XmlElement(name = "DefaultIndicator")
    protected Boolean defaultIndicator;

    /**
     * addressUsageCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AddressUsageCode }
     *     
     */
    public AddressUsageCode getAddressUsageCode() {
        return addressUsageCode;
    }

    /**
     * addressUsageCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUsageCode }
     *     
     */
    public void setAddressUsageCode(AddressUsageCode value) {
        this.addressUsageCode = value;
    }

    /**
     * defaultIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * defaultIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultIndicator(Boolean value) {
        this.defaultIndicator = value;
    }

}
