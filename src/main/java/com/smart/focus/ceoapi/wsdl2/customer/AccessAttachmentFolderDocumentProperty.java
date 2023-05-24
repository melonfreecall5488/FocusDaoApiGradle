
package com.smart.focus.ceoapi.wsdl2.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * AccessAttachmentFolderDocumentProperty complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AccessAttachmentFolderDocumentProperty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodeTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="DataTypeFormatCode" type="{http://sap.com/xi/AP/Common/GDT}PropertyDataTypeFormatCode" minOccurs="0"/&gt;
 *         &lt;element name="DataTypeFormatName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="VisibleIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ChangeAllowedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="MultipleValueIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="NamespaceURI" type="{http://sap.com/xi/AP/Common/GDT}NamespaceURI" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}Description" minOccurs="0"/&gt;
 *         &lt;element name="PropertyValue" type="{http://sap.com/xi/DocumentServices/Global}AccessAttachmentFolderDocumentPropertyPropertyValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessAttachmentFolderDocumentProperty", namespace = "http://sap.com/xi/DocumentServices/Global", propOrder = {
        "technicalID",
        "name",
        "dataTypeFormatCode",
        "dataTypeFormatName",
        "visibleIndicator",
        "changeAllowedIndicator",
        "multipleValueIndicator",
        "namespaceURI",
        "description",
        "propertyValue"
})
public class AccessAttachmentFolderDocumentProperty {

    @XmlElement(name = "TechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String technicalID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "DataTypeFormatCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dataTypeFormatCode;
    @XmlElement(name = "DataTypeFormatName")
    protected String dataTypeFormatName;
    @XmlElement(name = "VisibleIndicator")
    protected Boolean visibleIndicator;
    @XmlElement(name = "ChangeAllowedIndicator")
    protected Boolean changeAllowedIndicator;
    @XmlElement(name = "MultipleValueIndicator")
    protected Boolean multipleValueIndicator;
    @XmlElement(name = "NamespaceURI")
    protected NamespaceURI namespaceURI;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "PropertyValue")
    protected List<AccessAttachmentFolderDocumentPropertyPropertyValue> propertyValue;

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
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * dataTypeFormatCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDataTypeFormatCode() {
        return dataTypeFormatCode;
    }

    /**
     * dataTypeFormatCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDataTypeFormatCode(String value) {
        this.dataTypeFormatCode = value;
    }

    /**
     * dataTypeFormatName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDataTypeFormatName() {
        return dataTypeFormatName;
    }

    /**
     * dataTypeFormatName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDataTypeFormatName(String value) {
        this.dataTypeFormatName = value;
    }

    /**
     * visibleIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isVisibleIndicator() {
        return visibleIndicator;
    }

    /**
     * visibleIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setVisibleIndicator(Boolean value) {
        this.visibleIndicator = value;
    }

    /**
     * changeAllowedIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isChangeAllowedIndicator() {
        return changeAllowedIndicator;
    }

    /**
     * changeAllowedIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setChangeAllowedIndicator(Boolean value) {
        this.changeAllowedIndicator = value;
    }

    /**
     * multipleValueIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isMultipleValueIndicator() {
        return multipleValueIndicator;
    }

    /**
     * multipleValueIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setMultipleValueIndicator(Boolean value) {
        this.multipleValueIndicator = value;
    }

    /**
     * namespaceURI 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link NamespaceURI }
     * 
     */
    public NamespaceURI getNamespaceURI() {
        return namespaceURI;
    }

    /**
     * namespaceURI 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link NamespaceURI }
     * 
     */
    public void setNamespaceURI(NamespaceURI value) {
        this.namespaceURI = value;
    }

    /**
     * description 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Description }
     * 
     */
    public Description getDescription() {
        return description;
    }

    /**
     * description 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Description }
     * 
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the propertyValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyValue
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPropertyValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessAttachmentFolderDocumentPropertyPropertyValue }
     * 
     * 
     */
    public List<AccessAttachmentFolderDocumentPropertyPropertyValue> getPropertyValue() {
        if (propertyValue == null) {
            propertyValue = new ArrayList<AccessAttachmentFolderDocumentPropertyPropertyValue>();
        }
        return this.propertyValue;
    }

}
