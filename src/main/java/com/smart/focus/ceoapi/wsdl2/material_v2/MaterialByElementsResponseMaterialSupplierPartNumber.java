
package com.smart.focus.ceoapi.wsdl2.material_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * <p>MaterialByElementsResponseMaterialSupplierPartNumber complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialSupplierPartNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ProductSupplierID" type="{http://sap.com/xi/AP/Common/GDT}ProductPartyID" minOccurs="0"/&gt;
 *         &lt;element name="SupplierLeadTimeDuration" type="{http://sap.com/xi/AP/Common/GDT}DAY_Duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialSupplierPartNumber", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "supplierInternalID",
    "productSupplierID",
    "supplierLeadTimeDuration"
})
public class MaterialByElementsResponseMaterialSupplierPartNumber {

    @XmlElement(name = "SupplierInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String supplierInternalID;
    @XmlElement(name = "ProductSupplierID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productSupplierID;
    @XmlElement(name = "SupplierLeadTimeDuration")
    protected Duration supplierLeadTimeDuration;

    /**
     * supplierInternalID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierInternalID() {
        return supplierInternalID;
    }

    /**
     * supplierInternalID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierInternalID(String value) {
        this.supplierInternalID = value;
    }

    /**
     * productSupplierID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSupplierID() {
        return productSupplierID;
    }

    /**
     * productSupplierID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSupplierID(String value) {
        this.productSupplierID = value;
    }

    /**
     * supplierLeadTimeDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSupplierLeadTimeDuration() {
        return supplierLeadTimeDuration;
    }

    /**
     * supplierLeadTimeDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSupplierLeadTimeDuration(Duration value) {
        this.supplierLeadTimeDuration = value;
    }

}
