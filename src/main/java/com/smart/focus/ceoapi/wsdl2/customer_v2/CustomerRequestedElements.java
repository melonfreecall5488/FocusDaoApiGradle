
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>CustomerRequestedElements complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerRequestedElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Customer" type="{http://sap.com/xi/A1S/Global}CustomerRequestedElementsCustomer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="customerTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerRequestedElements", propOrder = {
    "customer"
})
public class CustomerRequestedElements {

    @XmlElement(name = "Customer")
    protected CustomerRequestedElementsCustomer customer;
    @XmlAttribute(name = "customerTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String customerTransmissionRequestCode;

    /**
     * customer 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRequestedElementsCustomer }
     *     
     */
    public CustomerRequestedElementsCustomer getCustomer() {
        return customer;
    }

    /**
     * customer 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRequestedElementsCustomer }
     *     
     */
    public void setCustomer(CustomerRequestedElementsCustomer value) {
        this.customer = value;
    }

    /**
     * customerTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTransmissionRequestCode() {
        return customerTransmissionRequestCode;
    }

    /**
     * customerTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTransmissionRequestCode(String value) {
        this.customerTransmissionRequestCode = value;
    }

}
