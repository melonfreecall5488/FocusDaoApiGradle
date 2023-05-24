
package com.smart.focus.ceoapi.wsdl2.material_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MaterialByElementsResponseMaterialQuantityConversion complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialQuantityConversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Quantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondingQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialQuantityConversion", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "quantity",
    "correspondingQuantity"
})
public class MaterialByElementsResponseMaterialQuantityConversion {

    @XmlElement(name = "Quantity")
    protected Quantity quantity;
    @XmlElement(name = "CorrespondingQuantity")
    protected Quantity correspondingQuantity;

    /**
     * quantity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getQuantity() {
        return quantity;
    }

    /**
     * quantity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setQuantity(Quantity value) {
        this.quantity = value;
    }

    /**
     * correspondingQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getCorrespondingQuantity() {
        return correspondingQuantity;
    }

    /**
     * correspondingQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setCorrespondingQuantity(Quantity value) {
        this.correspondingQuantity = value;
    }

}
