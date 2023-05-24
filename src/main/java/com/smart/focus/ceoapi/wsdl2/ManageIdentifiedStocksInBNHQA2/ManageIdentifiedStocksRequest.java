
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
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * ManageIdentifiedStocksRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ManageIdentifiedStocksRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="ChangeStateID" type="{http://sap.com/xi/AP/Common/GDT}ChangeStateID" minOccurs="0"/&gt;
 *         &lt;element name="IdentifiedStockID" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockID" minOccurs="0"/&gt;
 *         &lt;element name="IdentifiedStockUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ExternalIdentifiedStockID" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockID" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *         &lt;element name="ProductionDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="SupplierID" type="{http://sap.com/xi/AP/Common/Global}PartyKey" minOccurs="0"/&gt;
 *         &lt;element name="ProductRequirementSpecificationKey" type="{http://sap.com/xi/AP/Common/Global}RequirementSpecificationKey" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceAttachmentFolder" minOccurs="0"/&gt;
 *         &lt;element name="TextCollection" type="{http://sap.com/xi/DocumentServices/Global}MaintenanceTextCollection" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/A1S/Global}IdentifiedStocksDescriptionRequestBundle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuantityConversion" type="{http://sap.com/xi/A1S/Global}IdentifiedStockQuantityConversionMaintainRequestBundle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="actionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *       &lt;attribute name="activateIdentifiedStockIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="blockIdentifiedStockIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="unblockIdentifiedStockIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="setObsoleteIdentifiedStockIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="undoObsoleteIdentifiedStockIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="descriptionListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *       &lt;attribute name="quantityConversionListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageIdentifiedStocksRequest", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "objectNodeSenderTechnicalID",
        "changeStateID",
        "identifiedStockID",
        "identifiedStockUUID",
        "externalIdentifiedStockID",
        "productID",
        "productionDateTime",
        "expirationDateTime",
        "supplierID",
        "productRequirementSpecificationKey",
        "attachmentFolder",
        "textCollection",
        "description",
        "quantityConversion"
})
public class ManageIdentifiedStocksRequest {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "ChangeStateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String changeStateID;
    @XmlElement(name = "IdentifiedStockID")
    protected IdentifiedStockID identifiedStockID;
    @XmlElement(name = "IdentifiedStockUUID")
    protected UUID identifiedStockUUID;
    @XmlElement(name = "ExternalIdentifiedStockID")
    protected IdentifiedStockID externalIdentifiedStockID;
    @XmlElement(name = "ProductID")
    protected ProductID productID;
    @XmlElement(name = "ProductionDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar productionDateTime;
    @XmlElement(name = "ExpirationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlElement(name = "SupplierID")
    protected PartyKey supplierID;
    @XmlElement(name = "ProductRequirementSpecificationKey")
    protected RequirementSpecificationKey productRequirementSpecificationKey;
    @XmlElement(name = "AttachmentFolder")
    protected MaintenanceAttachmentFolder attachmentFolder;
    @XmlElement(name = "TextCollection")
    protected MaintenanceTextCollection textCollection;
    @XmlElement(name = "Description")
    protected List<IdentifiedStocksDescriptionRequestBundle> description;
    @XmlElement(name = "QuantityConversion")
    protected List<IdentifiedStockQuantityConversionMaintainRequestBundle> quantityConversion;
    @XmlAttribute(name = "actionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;
    @XmlAttribute(name = "activateIdentifiedStockIndicator")
    protected Boolean activateIdentifiedStockIndicator;
    @XmlAttribute(name = "blockIdentifiedStockIndicator")
    protected Boolean blockIdentifiedStockIndicator;
    @XmlAttribute(name = "unblockIdentifiedStockIndicator")
    protected Boolean unblockIdentifiedStockIndicator;
    @XmlAttribute(name = "setObsoleteIdentifiedStockIndicator")
    protected Boolean setObsoleteIdentifiedStockIndicator;
    @XmlAttribute(name = "undoObsoleteIdentifiedStockIndicator")
    protected Boolean undoObsoleteIdentifiedStockIndicator;
    @XmlAttribute(name = "descriptionListCompleteTransmissionIndicator")
    protected Boolean descriptionListCompleteTransmissionIndicator;
    @XmlAttribute(name = "quantityConversionListCompleteTransmissionIndicator")
    protected Boolean quantityConversionListCompleteTransmissionIndicator;

    /**
     * objectNodeSenderTechnicalID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getObjectNodeSenderTechnicalID() {
        return objectNodeSenderTechnicalID;
    }

    /**
     * objectNodeSenderTechnicalID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setObjectNodeSenderTechnicalID(String value) {
        this.objectNodeSenderTechnicalID = value;
    }

    /**
     * changeStateID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getChangeStateID() {
        return changeStateID;
    }

    /**
     * changeStateID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setChangeStateID(String value) {
        this.changeStateID = value;
    }

    /**
     * identifiedStockID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link IdentifiedStockID }
     * 
     */
    public IdentifiedStockID getIdentifiedStockID() {
        return identifiedStockID;
    }

    /**
     * identifiedStockID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link IdentifiedStockID }
     * 
     */
    public void setIdentifiedStockID(IdentifiedStockID value) {
        this.identifiedStockID = value;
    }

    /**
     * identifiedStockUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getIdentifiedStockUUID() {
        return identifiedStockUUID;
    }

    /**
     * identifiedStockUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setIdentifiedStockUUID(UUID value) {
        this.identifiedStockUUID = value;
    }

    /**
     * externalIdentifiedStockID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link IdentifiedStockID }
     * 
     */
    public IdentifiedStockID getExternalIdentifiedStockID() {
        return externalIdentifiedStockID;
    }

    /**
     * externalIdentifiedStockID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link IdentifiedStockID }
     * 
     */
    public void setExternalIdentifiedStockID(IdentifiedStockID value) {
        this.externalIdentifiedStockID = value;
    }

    /**
     * productID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductID }
     * 
     */
    public ProductID getProductID() {
        return productID;
    }

    /**
     * productID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductID }
     * 
     */
    public void setProductID(ProductID value) {
        this.productID = value;
    }

    /**
     * productionDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getProductionDateTime() {
        return productionDateTime;
    }

    /**
     * productionDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setProductionDateTime(XMLGregorianCalendar value) {
        this.productionDateTime = value;
    }

    /**
     * expirationDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * expirationDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setExpirationDateTime(XMLGregorianCalendar value) {
        this.expirationDateTime = value;
    }

    /**
     * supplierID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link PartyKey }
     * 
     */
    public PartyKey getSupplierID() {
        return supplierID;
    }

    /**
     * supplierID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link PartyKey }
     * 
     */
    public void setSupplierID(PartyKey value) {
        this.supplierID = value;
    }

    /**
     * productRequirementSpecificationKey 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link RequirementSpecificationKey }
     * 
     */
    public RequirementSpecificationKey getProductRequirementSpecificationKey() {
        return productRequirementSpecificationKey;
    }

    /**
     * productRequirementSpecificationKey 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link RequirementSpecificationKey }
     * 
     */
    public void setProductRequirementSpecificationKey(RequirementSpecificationKey value) {
        this.productRequirementSpecificationKey = value;
    }

    /**
     * attachmentFolder 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link MaintenanceAttachmentFolder }
     * 
     */
    public MaintenanceAttachmentFolder getAttachmentFolder() {
        return attachmentFolder;
    }

    /**
     * attachmentFolder 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link MaintenanceAttachmentFolder }
     * 
     */
    public void setAttachmentFolder(MaintenanceAttachmentFolder value) {
        this.attachmentFolder = value;
    }

    /**
     * textCollection 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link MaintenanceTextCollection }
     * 
     */
    public MaintenanceTextCollection getTextCollection() {
        return textCollection;
    }

    /**
     * textCollection 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link MaintenanceTextCollection }
     * 
     */
    public void setTextCollection(MaintenanceTextCollection value) {
        this.textCollection = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifiedStocksDescriptionRequestBundle }
     * 
     * 
     */
    public List<IdentifiedStocksDescriptionRequestBundle> getDescription() {
        if (description == null) {
            description = new ArrayList<IdentifiedStocksDescriptionRequestBundle>();
        }
        return this.description;
    }

    /**
     * Gets the value of the quantityConversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityConversion
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getQuantityConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifiedStockQuantityConversionMaintainRequestBundle }
     * 
     * 
     */
    public List<IdentifiedStockQuantityConversionMaintainRequestBundle> getQuantityConversion() {
        if (quantityConversion == null) {
            quantityConversion = new ArrayList<IdentifiedStockQuantityConversionMaintainRequestBundle>();
        }
        return this.quantityConversion;
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

    /**
     * activateIdentifiedStockIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isActivateIdentifiedStockIndicator() {
        return activateIdentifiedStockIndicator;
    }

    /**
     * activateIdentifiedStockIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setActivateIdentifiedStockIndicator(Boolean value) {
        this.activateIdentifiedStockIndicator = value;
    }

    /**
     * blockIdentifiedStockIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isBlockIdentifiedStockIndicator() {
        return blockIdentifiedStockIndicator;
    }

    /**
     * blockIdentifiedStockIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setBlockIdentifiedStockIndicator(Boolean value) {
        this.blockIdentifiedStockIndicator = value;
    }

    /**
     * unblockIdentifiedStockIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isUnblockIdentifiedStockIndicator() {
        return unblockIdentifiedStockIndicator;
    }

    /**
     * unblockIdentifiedStockIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setUnblockIdentifiedStockIndicator(Boolean value) {
        this.unblockIdentifiedStockIndicator = value;
    }

    /**
     * setObsoleteIdentifiedStockIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isSetObsoleteIdentifiedStockIndicator() {
        return setObsoleteIdentifiedStockIndicator;
    }

    /**
     * setObsoleteIdentifiedStockIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setSetObsoleteIdentifiedStockIndicator(Boolean value) {
        this.setObsoleteIdentifiedStockIndicator = value;
    }

    /**
     * undoObsoleteIdentifiedStockIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isUndoObsoleteIdentifiedStockIndicator() {
        return undoObsoleteIdentifiedStockIndicator;
    }

    /**
     * undoObsoleteIdentifiedStockIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setUndoObsoleteIdentifiedStockIndicator(Boolean value) {
        this.undoObsoleteIdentifiedStockIndicator = value;
    }

    /**
     * descriptionListCompleteTransmissionIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isDescriptionListCompleteTransmissionIndicator() {
        return descriptionListCompleteTransmissionIndicator;
    }

    /**
     * descriptionListCompleteTransmissionIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setDescriptionListCompleteTransmissionIndicator(Boolean value) {
        this.descriptionListCompleteTransmissionIndicator = value;
    }

    /**
     * quantityConversionListCompleteTransmissionIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isQuantityConversionListCompleteTransmissionIndicator() {
        return quantityConversionListCompleteTransmissionIndicator;
    }

    /**
     * quantityConversionListCompleteTransmissionIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setQuantityConversionListCompleteTransmissionIndicator(Boolean value) {
        this.quantityConversionListCompleteTransmissionIndicator = value;
    }

}
