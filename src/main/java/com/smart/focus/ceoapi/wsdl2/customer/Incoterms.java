
package com.smart.focus.ceoapi.wsdl2.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Incoterms complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Incoterms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClassificationCode" type="{http://sap.com/xi/AP/Common/GDT}IncotermsClassificationCode"/&gt;
 *         &lt;element name="TransferLocationName" type="{http://sap.com/xi/AP/Common/GDT}IncotermsTransferLocationName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Incoterms", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
        "classificationCode",
        "transferLocationName"
})
public class Incoterms {

    @XmlElement(name = "ClassificationCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String classificationCode;
    @XmlElement(name = "TransferLocationName")
    protected String transferLocationName;

    /**
     * classificationCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getClassificationCode() {
        return classificationCode;
    }

    /**
     * classificationCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setClassificationCode(String value) {
        this.classificationCode = value;
    }

    /**
     * transferLocationName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTransferLocationName() {
        return transferLocationName;
    }

    /**
     * transferLocationName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setTransferLocationName(String value) {
        this.transferLocationName = value;
    }

}
