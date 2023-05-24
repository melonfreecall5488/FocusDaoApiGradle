
package com.smart.focus.ceoapi.wsdl2.material_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>MaterialByElementsResponseMaterialQunantityCharacteristics complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialQunantityCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuantityMeasureUnitCode" type="{http://sap.com/xi/AP/Common/GDT}MeasureUnitCode" minOccurs="0"/&gt;
 *         &lt;element name="CharacteristicQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="CharacteristicQuantityTypeCode" type="{http://sap.com/xi/AP/Common/GDT}QuantityTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialQunantityCharacteristics", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "quantityMeasureUnitCode",
    "characteristicQuantity",
    "characteristicQuantityTypeCode"
})
public class MaterialByElementsResponseMaterialQunantityCharacteristics {

    @XmlElement(name = "QuantityMeasureUnitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String quantityMeasureUnitCode;
    @XmlElement(name = "CharacteristicQuantity")
    protected Quantity characteristicQuantity;
    @XmlElement(name = "CharacteristicQuantityTypeCode")
    protected QuantityTypeCode characteristicQuantityTypeCode;

    /**
     * quantityMeasureUnitCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityMeasureUnitCode() {
        return quantityMeasureUnitCode;
    }

    /**
     * quantityMeasureUnitCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityMeasureUnitCode(String value) {
        this.quantityMeasureUnitCode = value;
    }

    /**
     * characteristicQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getCharacteristicQuantity() {
        return characteristicQuantity;
    }

    /**
     * characteristicQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setCharacteristicQuantity(Quantity value) {
        this.characteristicQuantity = value;
    }

    /**
     * characteristicQuantityTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTypeCode }
     *     
     */
    public QuantityTypeCode getCharacteristicQuantityTypeCode() {
        return characteristicQuantityTypeCode;
    }

    /**
     * characteristicQuantityTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTypeCode }
     *     
     */
    public void setCharacteristicQuantityTypeCode(QuantityTypeCode value) {
        this.characteristicQuantityTypeCode = value;
    }

}
