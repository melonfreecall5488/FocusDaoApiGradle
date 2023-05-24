
package com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * MaintenanceAttachmentFolderDocument complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaintenanceAttachmentFolderDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="LinkInternalIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="VisibleIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}DocumentCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}DocumentTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="MIMECode" type="{http://sap.com/xi/AP/Common/GDT}MIMECode" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="AlternativeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_Name" minOccurs="0"/&gt;
 *         &lt;element name="InternalLinkUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}Description" minOccurs="0"/&gt;
 *         &lt;element name="ExternalLinkWebURI" type="{http://sap.com/xi/AP/Common/GDT}WebURI" minOccurs="0"/&gt;
 *         &lt;element name="Property" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolderDocumentProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FileContent" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolderDocumentFileContent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PropertyListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaintenanceAttachmentFolderDocument", namespace = "http://sap.com/xi/DocumentServices/Global", propOrder = {
        "uuid",
        "linkInternalIndicator",
        "visibleIndicator",
        "categoryCode",
        "typeCode",
        "mimeCode",
        "name",
        "alternativeName",
        "internalLinkUUID",
        "description",
        "externalLinkWebURI",
        "property",
        "fileContent"
})
public class MaintenanceAttachmentFolderDocument {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "LinkInternalIndicator")
    protected Boolean linkInternalIndicator;
    @XmlElement(name = "VisibleIndicator")
    protected Boolean visibleIndicator;
    @XmlElement(name = "CategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String categoryCode;
    @XmlElement(name = "TypeCode")
    protected DocumentTypeCode typeCode;
    @XmlElement(name = "MIMECode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String mimeCode;
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
    @XmlElement(name = "Property")
    protected List<MaintenanceAttachmentFolderDocumentProperty> property;
    @XmlElement(name = "FileContent")
    protected MaintenanceAttachmentFolderDocumentFileContent fileContent;
    @XmlAttribute(name = "PropertyListCompleteTransmissionIndicator")
    protected Boolean propertyListCompleteTransmissionIndicator;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * uuid 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * uuid 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * linkInternalIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isLinkInternalIndicator() {
        return linkInternalIndicator;
    }

    /**
     * linkInternalIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setLinkInternalIndicator(Boolean value) {
        this.linkInternalIndicator = value;
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
     * categoryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * categoryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * typeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link DocumentTypeCode }
     * 
     */
    public DocumentTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * typeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link DocumentTypeCode }
     * 
     */
    public void setTypeCode(DocumentTypeCode value) {
        this.typeCode = value;
    }

    /**
     * mimeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getMIMECode() {
        return mimeCode;
    }

    /**
     * mimeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setMIMECode(String value) {
        this.mimeCode = value;
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
     * alternativeName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getAlternativeName() {
        return alternativeName;
    }

    /**
     * alternativeName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setAlternativeName(String value) {
        this.alternativeName = value;
    }

    /**
     * internalLinkUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getInternalLinkUUID() {
        return internalLinkUUID;
    }

    /**
     * internalLinkUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setInternalLinkUUID(UUID value) {
        this.internalLinkUUID = value;
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
     * externalLinkWebURI 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getExternalLinkWebURI() {
        return externalLinkWebURI;
    }

    /**
     * externalLinkWebURI 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setExternalLinkWebURI(String value) {
        this.externalLinkWebURI = value;
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
     * 
     * <pre>
     * getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaintenanceAttachmentFolderDocumentProperty }
     * 
     * 
     */
    public List<MaintenanceAttachmentFolderDocumentProperty> getProperty() {
        if (property == null) {
            property = new ArrayList<MaintenanceAttachmentFolderDocumentProperty>();
        }
        return this.property;
    }

    /**
     * fileContent 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link MaintenanceAttachmentFolderDocumentFileContent }
     * 
     */
    public MaintenanceAttachmentFolderDocumentFileContent getFileContent() {
        return fileContent;
    }

    /**
     * fileContent 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link MaintenanceAttachmentFolderDocumentFileContent }
     * 
     */
    public void setFileContent(MaintenanceAttachmentFolderDocumentFileContent value) {
        this.fileContent = value;
    }

    /**
     * propertyListCompleteTransmissionIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isPropertyListCompleteTransmissionIndicator() {
        return propertyListCompleteTransmissionIndicator;
    }

    /**
     * propertyListCompleteTransmissionIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setPropertyListCompleteTransmissionIndicator(Boolean value) {
        this.propertyListCompleteTransmissionIndicator = value;
    }

    /**
     * actionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * actionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
