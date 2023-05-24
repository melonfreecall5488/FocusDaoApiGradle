
package com.smart.focus.ceoapi.wsdl2.product_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * ProductionLotSerialNumberHierarchy complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotSerialNumberHierarchy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InputProductID" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *         &lt;element name="InputProductUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="InputProductSerialID" type="{http://sap.com/xi/AP/Common/GDT}SerialID" minOccurs="0"/&gt;
 *         &lt;element name="InputProductSerialUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotSerialNumberHierarchy", propOrder = {
        "inputProductID",
        "inputProductUUID",
        "inputProductSerialID",
        "inputProductSerialUUID"
})
public class ProductionLotSerialNumberHierarchy {

    @XmlElement(name = "InputProductID")
    protected ProductID inputProductID;
    @XmlElement(name = "InputProductUUID")
    protected UUID inputProductUUID;
    @XmlElement(name = "InputProductSerialID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inputProductSerialID;
    @XmlElement(name = "InputProductSerialUUID")
    protected UUID inputProductSerialUUID;

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
     * inputProductUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getInputProductUUID() {
        return inputProductUUID;
    }

    /**
     * inputProductUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setInputProductUUID(UUID value) {
        this.inputProductUUID = value;
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

    /**
     * inputProductSerialUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getInputProductSerialUUID() {
        return inputProductSerialUUID;
    }

    /**
     * inputProductSerialUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setInputProductSerialUUID(UUID value) {
        this.inputProductSerialUUID = value;
    }

}
