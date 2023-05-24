
package com.smart.focus.ceoapi.wsdl2.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * SupplierByElementsQueryRequestedElements complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsQueryRequestedElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Supplier" type="{http://sap.com/xi/A1S/Global}SupplierByElementsQueryRequestedElementsSupplier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="supplierTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsQueryRequestedElements", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "supplier"
})
public class SupplierByElementsQueryRequestedElements {

    @XmlElement(name = "Supplier")
    protected SupplierByElementsQueryRequestedElementsSupplier supplier;
    @XmlAttribute(name = "supplierTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String supplierTransmissionRequestCode;

    /**
     * supplier 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SupplierByElementsQueryRequestedElementsSupplier }
     * 
     */
    public SupplierByElementsQueryRequestedElementsSupplier getSupplier() {
        return supplier;
    }

    /**
     * supplier 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SupplierByElementsQueryRequestedElementsSupplier }
     * 
     */
    public void setSupplier(SupplierByElementsQueryRequestedElementsSupplier value) {
        this.supplier = value;
    }

    /**
     * supplierTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSupplierTransmissionRequestCode() {
        return supplierTransmissionRequestCode;
    }

    /**
     * supplierTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSupplierTransmissionRequestCode(String value) {
        this.supplierTransmissionRequestCode = value;
    }

}
