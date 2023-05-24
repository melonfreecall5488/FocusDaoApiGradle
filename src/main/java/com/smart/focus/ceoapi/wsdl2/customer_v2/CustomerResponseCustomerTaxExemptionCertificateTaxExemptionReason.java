
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptionReasonCode" type="{http://sap.com/xi/AP/Common/GDT}TaxExemptionReasonCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason", propOrder = {
    "uuid",
    "taxExemptionReasonCode"
})
public class CustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "TaxExemptionReasonCode")
    protected TaxExemptionReasonCode taxExemptionReasonCode;

    /**
     * uuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * uuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * taxExemptionReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionReasonCode }
     *     
     */
    public TaxExemptionReasonCode getTaxExemptionReasonCode() {
        return taxExemptionReasonCode;
    }

    /**
     * taxExemptionReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionReasonCode }
     *     
     */
    public void setTaxExemptionReasonCode(TaxExemptionReasonCode value) {
        this.taxExemptionReasonCode = value;
    }

}
