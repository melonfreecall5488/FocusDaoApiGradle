
package com.smart.focus.ceoapi.wsdl2.material;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * MaterialByElementsResponseMaterialText complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentText" type="{http://sap.com/xi/AP/Common/GDT}Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialText", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "contentText"
})
public class MaterialByElementsResponseMaterialText {

    @XmlElement(name = "ContentText")
    protected Text contentText;

    /**
     * contentText 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Text }
     * 
     */
    public Text getContentText() {
        return contentText;
    }

    /**
     * contentText 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Text }
     * 
     */
    public void setContentText(Text value) {
        this.contentText = value;
    }

}
