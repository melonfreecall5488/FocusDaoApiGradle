
package com.smart.focus.ceoapi.wsdl2.material;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * MaterialByElementsResponseMaterialDescription complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialDescription", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "description"
})
public class MaterialByElementsResponseMaterialDescription {

    @XmlElement(name = "Description")
    protected SHORTDescription description;

    /**
     * description 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SHORTDescription }
     * 
     */
    public SHORTDescription getDescription() {
        return description;
    }

    /**
     * description 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SHORTDescription }
     * 
     */
    public void setDescription(SHORTDescription value) {
        this.description = value;
    }

}
