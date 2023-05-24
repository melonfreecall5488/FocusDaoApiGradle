
package com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * IdentifiedStockQueryResponse complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IdentifiedStockQueryResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentifiedStockID" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockID" minOccurs="0"/&gt;
 *         &lt;element name="ExternalIdentifiedStockID" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockID" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *         &lt;element name="ProductionDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="SupplierID" type="{http://sap.com/xi/AP/Common/Global}PartyKey" minOccurs="0"/&gt;
 *         &lt;element name="ProductRequirementSpecificationKey" type="{http://sap.com/xi/AP/Common/Global}RequirementSpecificationKey" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/FO/IdentifiedStock/Global}IdentifiedStockStatus" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/AP/Common/GDT}MEDIUM_Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuantityConversion" type="{http://sap.com/xi/A1S/Global}IdentifiedStockQuantityConversionQueryRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}AccessAttachmentFolder" minOccurs="0"/&gt;
 *         &lt;element name="TextCollection" type="{http://sap.com/xi/DocumentServices/Global}AccessTextCollection" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifiedStockQueryResponse", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "identifiedStockID",
        "externalIdentifiedStockID",
        "productID",
        "productionDateTime",
        "expirationDateTime",
        "supplierID",
        "productRequirementSpecificationKey",
        "lifeCycleStatusCode",
        "description",
        "quantityConversion",
        "attachmentFolder",
        "textCollection"
})
public class IdentifiedStockQueryResponse {

    @XmlElement(name = "IdentifiedStockID")
    protected IdentifiedStockID identifiedStockID;
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
    @XmlElement(name = "LifeCycleStatusCode")
    protected IdentifiedStockStatus lifeCycleStatusCode;
    @XmlElement(name = "Description")
    protected List<MEDIUMDescription> description;
    @XmlElement(name = "QuantityConversion")
    protected List<IdentifiedStockQuantityConversionQueryRequest> quantityConversion;
    @XmlElement(name = "AttachmentFolder")
    protected AccessAttachmentFolder attachmentFolder;
    @XmlElement(name = "TextCollection")
    protected AccessTextCollection textCollection;

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
     * lifeCycleStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link IdentifiedStockStatus }
     * 
     */
    public IdentifiedStockStatus getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link IdentifiedStockStatus }
     * 
     */
    public void setLifeCycleStatusCode(IdentifiedStockStatus value) {
        this.lifeCycleStatusCode = value;
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
     * {@link MEDIUMDescription }
     * 
     * 
     */
    public List<MEDIUMDescription> getDescription() {
        if (description == null) {
            description = new ArrayList<MEDIUMDescription>();
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
     * {@link IdentifiedStockQuantityConversionQueryRequest }
     * 
     * 
     */
    public List<IdentifiedStockQuantityConversionQueryRequest> getQuantityConversion() {
        if (quantityConversion == null) {
            quantityConversion = new ArrayList<IdentifiedStockQuantityConversionQueryRequest>();
        }
        return this.quantityConversion;
    }

    /**
     * attachmentFolder 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link AccessAttachmentFolder }
     * 
     */
    public AccessAttachmentFolder getAttachmentFolder() {
        return attachmentFolder;
    }

    /**
     * attachmentFolder 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link AccessAttachmentFolder }
     * 
     */
    public void setAttachmentFolder(AccessAttachmentFolder value) {
        this.attachmentFolder = value;
    }

    /**
     * textCollection 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link AccessTextCollection }
     * 
     */
    public AccessTextCollection getTextCollection() {
        return textCollection;
    }

    /**
     * textCollection 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link AccessTextCollection }
     * 
     */
    public void setTextCollection(AccessTextCollection value) {
        this.textCollection = value;
    }

}
