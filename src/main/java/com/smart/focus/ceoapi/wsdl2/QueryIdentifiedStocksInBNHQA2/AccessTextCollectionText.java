
package com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2;

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
 * AccessTextCollectionText complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AccessTextCollectionText"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}TextCollectionTextTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="TypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="LanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="LanguageName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="SystemAdministrativeData" type="{http://sap.com/xi/AP/Common/GDT}SystemAdministrativeData" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="TextContent" type="{http://sap.com/xi/DocumentServices/Global}AccessTextCollectionTextTextContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessTextCollectionText", namespace = "http://sap.com/xi/DocumentServices/Global", propOrder = {
        "technicalID",
        "typeCode",
        "typeName",
        "languageCode",
        "languageName",
        "systemAdministrativeData",
        "creationDateTime",
        "textContent"
})
public class AccessTextCollectionText {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String technicalID;
    @XmlElement(name = "TypeCode")
    protected TextCollectionTextTypeCode typeCode;
    @XmlElement(name = "TypeName")
    protected String typeName;
    @XmlElement(name = "LanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String languageCode;
    @XmlElement(name = "LanguageName")
    protected String languageName;
    @XmlElement(name = "SystemAdministrativeData")
    protected SystemAdministrativeData systemAdministrativeData;
    @XmlElement(name = "CreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "TextContent")
    protected AccessTextCollectionTextTextContent textContent;

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
     * typeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link TextCollectionTextTypeCode }
     * 
     */
    public TextCollectionTextTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * typeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link TextCollectionTextTypeCode }
     * 
     */
    public void setTypeCode(TextCollectionTextTypeCode value) {
        this.typeCode = value;
    }

    /**
     * typeName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * typeName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

    /**
     * languageCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * languageCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * languageName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * languageName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setLanguageName(String value) {
        this.languageName = value;
    }

    /**
     * systemAdministrativeData 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SystemAdministrativeData }
     * 
     */
    public SystemAdministrativeData getSystemAdministrativeData() {
        return systemAdministrativeData;
    }

    /**
     * systemAdministrativeData 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SystemAdministrativeData }
     * 
     */
    public void setSystemAdministrativeData(SystemAdministrativeData value) {
        this.systemAdministrativeData = value;
    }

    /**
     * creationDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * creationDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * textContent 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link AccessTextCollectionTextTextContent }
     * 
     */
    public AccessTextCollectionTextTextContent getTextContent() {
        return textContent;
    }

    /**
     * textContent 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link AccessTextCollectionTextTextContent }
     * 
     */
    public void setTextContent(AccessTextCollectionTextTextContent value) {
        this.textContent = value;
    }

}
