
package com.smart.focus.ceoapi.wsdl2.customer_v2;

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
 * <p>AccessAttachmentFolderDocument complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="AccessAttachmentFolderDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="VersionID" type="{http://sap.com/xi/AP/Common/GDT}VersionID" minOccurs="0"/&gt;
 *         &lt;element name="SystemAdministrativeData" type="{http://sap.com/xi/AP/Common/GDT}SystemAdministrativeData" minOccurs="0"/&gt;
 *         &lt;element name="LinkInternalIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CheckedOutIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="VisibleIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="VersioningEnabledIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}DocumentCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="CategoryName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}DocumentTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="TypeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="MIMECode" type="{http://sap.com/xi/AP/Common/GDT}MIMECode" minOccurs="0"/&gt;
 *         &lt;element name="MIMEName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="PathName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="AlternativeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="InternalLinkUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}Description" minOccurs="0"/&gt;
 *         &lt;element name="ExternalLinkWebURI" type="{http://sap.com/xi/AP/Common/GDT}WebURI" minOccurs="0"/&gt;
 *         &lt;element name="FileContentURI" type="{http://sap.com/xi/AP/Common/GDT}URI" minOccurs="0"/&gt;
 *         &lt;element name="FilesizeMeasure" type="{http://sap.com/xi/AP/Common/GDT}Measure" minOccurs="0"/&gt;
 *         &lt;element name="Property" type="{http://sap.com/xi/DocumentServices/Global}AccessAttachmentFolderDocumentProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessAttachmentFolderDocument", namespace = "http://sap.com/xi/DocumentServices/Global", propOrder = {
    "uuid",
    "versionID",
    "systemAdministrativeData",
    "linkInternalIndicator",
    "checkedOutIndicator",
    "visibleIndicator",
    "versioningEnabledIndicator",
    "categoryCode",
    "categoryName",
    "typeCode",
    "typeName",
    "mimeCode",
    "mimeName",
    "pathName",
    "name",
    "alternativeName",
    "internalLinkUUID",
    "description",
    "externalLinkWebURI",
    "fileContentURI",
    "filesizeMeasure",
    "property"
})
public class AccessAttachmentFolderDocument {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "VersionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String versionID;
    @XmlElement(name = "SystemAdministrativeData")
    protected SystemAdministrativeData systemAdministrativeData;
    @XmlElement(name = "LinkInternalIndicator")
    protected Boolean linkInternalIndicator;
    @XmlElement(name = "CheckedOutIndicator")
    protected Boolean checkedOutIndicator;
    @XmlElement(name = "VisibleIndicator")
    protected Boolean visibleIndicator;
    @XmlElement(name = "VersioningEnabledIndicator")
    protected Boolean versioningEnabledIndicator;
    @XmlElement(name = "CategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String categoryCode;
    @XmlElement(name = "CategoryName")
    protected String categoryName;
    @XmlElement(name = "TypeCode")
    protected DocumentTypeCode typeCode;
    @XmlElement(name = "TypeName")
    protected String typeName;
    @XmlElement(name = "MIMECode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String mimeCode;
    @XmlElement(name = "MIMEName")
    protected String mimeName;
    @XmlElement(name = "PathName")
    protected String pathName;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AlternativeName")
    protected String alternativeName;
    @XmlElement(name = "InternalLinkUUID")
    protected UUID internalLinkUUID;
    @XmlElement(name = "Description")
    protected Description description;
    @XmlElement(name = "ExternalLinkWebURI")
    @XmlSchemaType(name = "anyURI")
    protected String externalLinkWebURI;
    @XmlElement(name = "FileContentURI")
    protected URI fileContentURI;
    @XmlElement(name = "FilesizeMeasure")
    protected Measure filesizeMeasure;
    @XmlElement(name = "Property")
    protected List<AccessAttachmentFolderDocumentProperty> property;

    /**
     * uuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * uuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * versionID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionID() {
        return versionID;
    }

    /**
     * versionID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionID(String value) {
        this.versionID = value;
    }

    /**
     * systemAdministrativeData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SystemAdministrativeData }
     *     
     */
    public SystemAdministrativeData getSystemAdministrativeData() {
        return systemAdministrativeData;
    }

    /**
     * systemAdministrativeData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAdministrativeData }
     *     
     */
    public void setSystemAdministrativeData(SystemAdministrativeData value) {
        this.systemAdministrativeData = value;
    }

    /**
     * linkInternalIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinkInternalIndicator() {
        return linkInternalIndicator;
    }

    /**
     * linkInternalIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkInternalIndicator(Boolean value) {
        this.linkInternalIndicator = value;
    }

    /**
     * checkedOutIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckedOutIndicator() {
        return checkedOutIndicator;
    }

    /**
     * checkedOutIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckedOutIndicator(Boolean value) {
        this.checkedOutIndicator = value;
    }

    /**
     * visibleIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisibleIndicator() {
        return visibleIndicator;
    }

    /**
     * visibleIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisibleIndicator(Boolean value) {
        this.visibleIndicator = value;
    }

    /**
     * versioningEnabledIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVersioningEnabledIndicator() {
        return versioningEnabledIndicator;
    }

    /**
     * versioningEnabledIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVersioningEnabledIndicator(Boolean value) {
        this.versioningEnabledIndicator = value;
    }

    /**
     * categoryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * categoryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * categoryName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * categoryName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * typeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DocumentTypeCode }
     *     
     */
    public DocumentTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * typeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentTypeCode }
     *     
     */
    public void setTypeCode(DocumentTypeCode value) {
        this.typeCode = value;
    }

    /**
     * typeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * typeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

    /**
     * mimeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMECode() {
        return mimeCode;
    }

    /**
     * mimeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMECode(String value) {
        this.mimeCode = value;
    }

    /**
     * mimeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMEName() {
        return mimeName;
    }

    /**
     * mimeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMEName(String value) {
        this.mimeName = value;
    }

    /**
     * pathName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathName() {
        return pathName;
    }

    /**
     * pathName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathName(String value) {
        this.pathName = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * alternativeName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeName() {
        return alternativeName;
    }

    /**
     * alternativeName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeName(String value) {
        this.alternativeName = value;
    }

    /**
     * internalLinkUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getInternalLinkUUID() {
        return internalLinkUUID;
    }

    /**
     * internalLinkUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setInternalLinkUUID(UUID value) {
        this.internalLinkUUID = value;
    }

    /**
     * description 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * description 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * externalLinkWebURI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalLinkWebURI() {
        return externalLinkWebURI;
    }

    /**
     * externalLinkWebURI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalLinkWebURI(String value) {
        this.externalLinkWebURI = value;
    }

    /**
     * fileContentURI 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link URI }
     *     
     */
    public URI getFileContentURI() {
        return fileContentURI;
    }

    /**
     * fileContentURI 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link URI }
     *     
     */
    public void setFileContentURI(URI value) {
        this.fileContentURI = value;
    }

    /**
     * filesizeMeasure 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Measure }
     *     
     */
    public Measure getFilesizeMeasure() {
        return filesizeMeasure;
    }

    /**
     * filesizeMeasure 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Measure }
     *     
     */
    public void setFilesizeMeasure(Measure value) {
        this.filesizeMeasure = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessAttachmentFolderDocumentProperty }
     * 
     * 
     */
    public List<AccessAttachmentFolderDocumentProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<AccessAttachmentFolderDocumentProperty>();
        }
        return this.property;
    }

}
