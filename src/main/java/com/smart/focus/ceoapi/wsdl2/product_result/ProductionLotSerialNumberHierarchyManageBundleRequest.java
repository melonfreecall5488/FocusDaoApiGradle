
package com.smart.focus.ceoapi.wsdl2.product_result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * ProductionLotSerialNumberHierarchyManageBundle_Request complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotSerialNumberHierarchyManageBundle_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InputProductID" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *         &lt;element name="InputProductSerialID" type="{http://sap.com/xi/AP/Common/GDT}SerialID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotSerialNumberHierarchyManageBundle_Request", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "inputProductID",
        "inputProductSerialID"
})
public class ProductionLotSerialNumberHierarchyManageBundleRequest {

    @XmlElement(name = "InputProductID")
    protected ProductID inputProductID;
    @XmlElement(name = "InputProductSerialID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inputProductSerialID;

    /**
     * inputProductID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductID }
     * 
     */
    public ProductID getInputProductID() {
        return inputProductID;
    }

    /**
     * inputProductID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductID }
     * 
     */
    public void setInputProductID(ProductID value) {
        this.inputProductID = value;
    }

    /**
     * inputProductSerialID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getInputProductSerialID() {
        return inputProductSerialID;
    }

    /**
     * inputProductSerialID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setInputProductSerialID(String value) {
        this.inputProductSerialID = value;
    }

}
