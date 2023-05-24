
package com.smart.focus.ceoapi.wsdl2.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * AccessAttachmentFolderDocumentPropertyPropertyValue complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AccessAttachmentFolderDocumentPropertyPropertyValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Text" minOccurs="0"/&gt;
 *         &lt;element name="Indicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="IntegerValue" type="{http://sap.com/xi/AP/Common/GDT}IntegerValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessAttachmentFolderDocumentPropertyPropertyValue", namespace = "http://sap.com/xi/DocumentServices/Global", propOrder = {
        "technicalID",
        "text",
        "indicator",
        "dateTime",
        "integerValue"
})
public class AccessAttachmentFolderDocumentPropertyPropertyValue {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String technicalID;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "Indicator")
    protected Boolean indicator;
    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "IntegerValue")
    protected Integer integerValue;

    /**
     * technicalID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTechnicalID() {
        return technicalID;
    }

    /**
     * technicalID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setTechnicalID(String value) {
        this.technicalID = value;
    }

    /**
     * text 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getText() {
        return text;
    }

    /**
     * text 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * indicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isIndicator() {
        return indicator;
    }

    /**
     * indicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setIndicator(Boolean value) {
        this.indicator = value;
    }

    /**
     * dateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * dateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * integerValue 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getIntegerValue() {
        return integerValue;
    }

    /**
     * integerValue 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setIntegerValue(Integer value) {
        this.integerValue = value;
    }

}
