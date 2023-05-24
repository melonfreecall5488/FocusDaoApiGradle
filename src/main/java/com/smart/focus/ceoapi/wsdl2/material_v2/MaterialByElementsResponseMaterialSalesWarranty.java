
package com.smart.focus.ceoapi.wsdl2.material_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MaterialByElementsResponseMaterialSalesWarranty complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialSalesWarranty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductInternalID" type="{http://sap.com/xi/AP/Common/GDT}ProductInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialSalesWarranty", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "productInternalID",
    "validityPeriod"
})
public class MaterialByElementsResponseMaterialSalesWarranty {

    @XmlElement(name = "ProductInternalID")
    protected ProductInternalID productInternalID;
    @XmlElement(name = "ValidityPeriod")
    protected CLOSEDDatePeriod validityPeriod;

    /**
     * productInternalID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ProductInternalID }
     *     
     */
    public ProductInternalID getProductInternalID() {
        return productInternalID;
    }

    /**
     * productInternalID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInternalID }
     *     
     */
    public void setProductInternalID(ProductInternalID value) {
        this.productInternalID = value;
    }

    /**
     * validityPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public CLOSEDDatePeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * validityPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CLOSEDDatePeriod }
     *     
     */
    public void setValidityPeriod(CLOSEDDatePeriod value) {
        this.validityPeriod = value;
    }

}
