
package com.smart.focus.ceoapi.wsdl2.material;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * MaterialByElementsResponseMaterialCustomerPartNumber complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialCustomerPartNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ProductCustomerID" type="{http://sap.com/xi/AP/Common/GDT}ProductPartyID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialCustomerPartNumber", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "customerInternalID",
        "productCustomerID"
})
public class MaterialByElementsResponseMaterialCustomerPartNumber {

    @XmlElement(name = "CustomerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customerInternalID;
    @XmlElement(name = "ProductCustomerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productCustomerID;

    /**
     * customerInternalID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCustomerInternalID() {
        return customerInternalID;
    }

    /**
     * customerInternalID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCustomerInternalID(String value) {
        this.customerInternalID = value;
    }

    /**
     * productCustomerID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getProductCustomerID() {
        return productCustomerID;
    }

    /**
     * productCustomerID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setProductCustomerID(String value) {
        this.productCustomerID = value;
    }

}
