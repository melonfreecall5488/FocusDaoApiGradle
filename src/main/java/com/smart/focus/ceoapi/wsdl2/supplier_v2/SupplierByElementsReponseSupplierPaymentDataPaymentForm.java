
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>SupplierByElementsReponseSupplierPaymentDataPaymentForm complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsReponseSupplierPaymentDataPaymentForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentFormCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentFormCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsReponseSupplierPaymentDataPaymentForm", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "paymentFormCode"
})
public class SupplierByElementsReponseSupplierPaymentDataPaymentForm {

    @XmlElement(name = "PaymentFormCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentFormCode;

    /**
     * paymentFormCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentFormCode() {
        return paymentFormCode;
    }

    /**
     * paymentFormCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentFormCode(String value) {
        this.paymentFormCode = value;
    }

}
