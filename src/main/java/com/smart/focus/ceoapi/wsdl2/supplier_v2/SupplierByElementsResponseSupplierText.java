
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplierByElementsResponseSupplierText complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsResponseSupplierText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}TextCollectionTextTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ContentText" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsResponseSupplierText", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "typeCode",
    "contentText"
})
public class SupplierByElementsResponseSupplierText {

    @XmlElement(name = "TypeCode")
    protected TextCollectionTextTypeCode typeCode;
    @XmlElement(name = "ContentText")
    protected String contentText;

    /**
     * typeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TextCollectionTextTypeCode }
     *     
     */
    public TextCollectionTextTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * typeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TextCollectionTextTypeCode }
     *     
     */
    public void setTypeCode(TextCollectionTextTypeCode value) {
        this.typeCode = value;
    }

    /**
     * contentText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentText() {
        return contentText;
    }

    /**
     * contentText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentText(String value) {
        this.contentText = value;
    }

}
