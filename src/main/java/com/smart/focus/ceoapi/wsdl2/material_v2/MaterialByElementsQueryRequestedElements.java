
package com.smart.focus.ceoapi.wsdl2.material_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>MaterialByElementsQueryRequestedElements complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsQueryRequestedElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Material" type="{http://sap.com/xi/A1S/Global}MaterialByElementsQueryRequestedElementsMaterial" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="materialTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsQueryRequestedElements", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "material"
})
public class MaterialByElementsQueryRequestedElements {

    @XmlElement(name = "Material")
    protected MaterialByElementsQueryRequestedElementsMaterial material;
    @XmlAttribute(name = "materialTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String materialTransmissionRequestCode;

    /**
     * material 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MaterialByElementsQueryRequestedElementsMaterial }
     *     
     */
    public MaterialByElementsQueryRequestedElementsMaterial getMaterial() {
        return material;
    }

    /**
     * material 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialByElementsQueryRequestedElementsMaterial }
     *     
     */
    public void setMaterial(MaterialByElementsQueryRequestedElementsMaterial value) {
        this.material = value;
    }

    /**
     * materialTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialTransmissionRequestCode() {
        return materialTransmissionRequestCode;
    }

    /**
     * materialTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialTransmissionRequestCode(String value) {
        this.materialTransmissionRequestCode = value;
    }

}
