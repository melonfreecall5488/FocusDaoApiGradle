
package com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * IdentifiedStockRequestQuery complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IdentifiedStockRequestQuery"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByIdentifiedStockID" type="{http://sap.com/xi/AP/Common/Global}SelectionByIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByExternalIdentifiedStockID" type="{http://sap.com/xi/AP/Common/Global}SelectionByIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySearchText" type="{http://sap.com/xi/AP/Common/GDT}SearchText" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByIdentifiedStockDescription" type="{http://sap.com/xi/AP/Common/Global}SelectionByText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySupplierIDPartyID" type="{http://sap.com/xi/AP/Common/Global}SelectionByIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/Global}SelectionByCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByIdentifiedStockTypeCode" type="{http://sap.com/xi/AP/Common/Global}SelectionByCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByProductValuationLevelTypeCode" type="{http://sap.com/xi/AP/Common/Global}SelectionByCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByProductionDateTime" type="{http://sap.com/xi/AP/Common/Global}GLOBAL_SelectionByDateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByExpirationDateTime" type="{http://sap.com/xi/AP/Common/Global}GLOBAL_SelectionByDateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByMaterialKeyProductID" type="{http://sap.com/xi/AP/Common/Global}SelectionByIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByProductRequirementSpecificationKeyRequirementSpecificationID" type="{http://sap.com/xi/AP/Common/Global}SelectionByIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByAdministrativeDataCreationDateTime" type="{http://sap.com/xi/AP/Common/Global}GLOBAL_SelectionByDateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByAdministrativeDataLastChangeDateTime" type="{http://sap.com/xi/AP/Common/Global}GLOBAL_SelectionByDateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="selectionByBatchManagedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifiedStockRequestQuery", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "selectionByIdentifiedStockID",
        "selectionByExternalIdentifiedStockID",
        "selectionBySearchText",
        "selectionByIdentifiedStockDescription",
        "selectionBySupplierIDPartyID",
        "selectionByLifeCycleStatusCode",
        "selectionByIdentifiedStockTypeCode",
        "selectionByProductValuationLevelTypeCode",
        "selectionByProductionDateTime",
        "selectionByExpirationDateTime",
        "selectionByMaterialKeyProductID",
        "selectionByProductRequirementSpecificationKeyRequirementSpecificationID",
        "selectionByAdministrativeDataCreationDateTime",
        "selectionByAdministrativeDataLastChangeDateTime",
        "selectionByBatchManagedIndicator"
})
public class IdentifiedStockRequestQuery {

    @XmlElement(name = "SelectionByIdentifiedStockID")
    protected List<SelectionByIdentifier> selectionByIdentifiedStockID;
    @XmlElement(name = "SelectionByExternalIdentifiedStockID")
    protected List<SelectionByIdentifier> selectionByExternalIdentifiedStockID;
    @XmlElement(name = "SelectionBySearchText")
    protected String selectionBySearchText;
    @XmlElement(name = "SelectionByIdentifiedStockDescription")
    protected List<SelectionByText> selectionByIdentifiedStockDescription;
    @XmlElement(name = "SelectionBySupplierIDPartyID")
    protected List<SelectionByIdentifier> selectionBySupplierIDPartyID;
    @XmlElement(name = "SelectionByLifeCycleStatusCode")
    protected List<SelectionByCode> selectionByLifeCycleStatusCode;
    @XmlElement(name = "SelectionByIdentifiedStockTypeCode")
    protected List<SelectionByCode> selectionByIdentifiedStockTypeCode;
    @XmlElement(name = "SelectionByProductValuationLevelTypeCode")
    protected List<SelectionByCode> selectionByProductValuationLevelTypeCode;
    @XmlElement(name = "SelectionByProductionDateTime")
    protected List<GLOBALSelectionByDateTime> selectionByProductionDateTime;
    @XmlElement(name = "SelectionByExpirationDateTime")
    protected List<GLOBALSelectionByDateTime> selectionByExpirationDateTime;
    @XmlElement(name = "SelectionByMaterialKeyProductID")
    protected List<SelectionByIdentifier> selectionByMaterialKeyProductID;
    @XmlElement(name = "SelectionByProductRequirementSpecificationKeyRequirementSpecificationID")
    protected List<SelectionByIdentifier> selectionByProductRequirementSpecificationKeyRequirementSpecificationID;
    @XmlElement(name = "SelectionByAdministrativeDataCreationDateTime")
    protected List<GLOBALSelectionByDateTime> selectionByAdministrativeDataCreationDateTime;
    @XmlElement(name = "SelectionByAdministrativeDataLastChangeDateTime")
    protected List<GLOBALSelectionByDateTime> selectionByAdministrativeDataLastChangeDateTime;
    protected Boolean selectionByBatchManagedIndicator;

    /**
     * Gets the value of the selectionByIdentifiedStockID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByIdentifiedStockID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByIdentifiedStockID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIdentifier }
     * 
     * 
     */
    public List<SelectionByIdentifier> getSelectionByIdentifiedStockID() {
        if (selectionByIdentifiedStockID == null) {
            selectionByIdentifiedStockID = new ArrayList<SelectionByIdentifier>();
        }
        return this.selectionByIdentifiedStockID;
    }

    /**
     * Gets the value of the selectionByExternalIdentifiedStockID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByExternalIdentifiedStockID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByExternalIdentifiedStockID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIdentifier }
     * 
     * 
     */
    public List<SelectionByIdentifier> getSelectionByExternalIdentifiedStockID() {
        if (selectionByExternalIdentifiedStockID == null) {
            selectionByExternalIdentifiedStockID = new ArrayList<SelectionByIdentifier>();
        }
        return this.selectionByExternalIdentifiedStockID;
    }

    /**
     * selectionBySearchText 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSelectionBySearchText() {
        return selectionBySearchText;
    }

    /**
     * selectionBySearchText 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSelectionBySearchText(String value) {
        this.selectionBySearchText = value;
    }

    /**
     * Gets the value of the selectionByIdentifiedStockDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByIdentifiedStockDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByIdentifiedStockDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByText }
     * 
     * 
     */
    public List<SelectionByText> getSelectionByIdentifiedStockDescription() {
        if (selectionByIdentifiedStockDescription == null) {
            selectionByIdentifiedStockDescription = new ArrayList<SelectionByText>();
        }
        return this.selectionByIdentifiedStockDescription;
    }

    /**
     * Gets the value of the selectionBySupplierIDPartyID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionBySupplierIDPartyID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionBySupplierIDPartyID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIdentifier }
     * 
     * 
     */
    public List<SelectionByIdentifier> getSelectionBySupplierIDPartyID() {
        if (selectionBySupplierIDPartyID == null) {
            selectionBySupplierIDPartyID = new ArrayList<SelectionByIdentifier>();
        }
        return this.selectionBySupplierIDPartyID;
    }

    /**
     * Gets the value of the selectionByLifeCycleStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByLifeCycleStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByLifeCycleStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByCode }
     * 
     * 
     */
    public List<SelectionByCode> getSelectionByLifeCycleStatusCode() {
        if (selectionByLifeCycleStatusCode == null) {
            selectionByLifeCycleStatusCode = new ArrayList<SelectionByCode>();
        }
        return this.selectionByLifeCycleStatusCode;
    }

    /**
     * Gets the value of the selectionByIdentifiedStockTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByIdentifiedStockTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByIdentifiedStockTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByCode }
     * 
     * 
     */
    public List<SelectionByCode> getSelectionByIdentifiedStockTypeCode() {
        if (selectionByIdentifiedStockTypeCode == null) {
            selectionByIdentifiedStockTypeCode = new ArrayList<SelectionByCode>();
        }
        return this.selectionByIdentifiedStockTypeCode;
    }

    /**
     * Gets the value of the selectionByProductValuationLevelTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByProductValuationLevelTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByProductValuationLevelTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByCode }
     * 
     * 
     */
    public List<SelectionByCode> getSelectionByProductValuationLevelTypeCode() {
        if (selectionByProductValuationLevelTypeCode == null) {
            selectionByProductValuationLevelTypeCode = new ArrayList<SelectionByCode>();
        }
        return this.selectionByProductValuationLevelTypeCode;
    }

    /**
     * Gets the value of the selectionByProductionDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByProductionDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByProductionDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLOBALSelectionByDateTime }
     * 
     * 
     */
    public List<GLOBALSelectionByDateTime> getSelectionByProductionDateTime() {
        if (selectionByProductionDateTime == null) {
            selectionByProductionDateTime = new ArrayList<GLOBALSelectionByDateTime>();
        }
        return this.selectionByProductionDateTime;
    }

    /**
     * Gets the value of the selectionByExpirationDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByExpirationDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByExpirationDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLOBALSelectionByDateTime }
     * 
     * 
     */
    public List<GLOBALSelectionByDateTime> getSelectionByExpirationDateTime() {
        if (selectionByExpirationDateTime == null) {
            selectionByExpirationDateTime = new ArrayList<GLOBALSelectionByDateTime>();
        }
        return this.selectionByExpirationDateTime;
    }

    /**
     * Gets the value of the selectionByMaterialKeyProductID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByMaterialKeyProductID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByMaterialKeyProductID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIdentifier }
     * 
     * 
     */
    public List<SelectionByIdentifier> getSelectionByMaterialKeyProductID() {
        if (selectionByMaterialKeyProductID == null) {
            selectionByMaterialKeyProductID = new ArrayList<SelectionByIdentifier>();
        }
        return this.selectionByMaterialKeyProductID;
    }

    /**
     * Gets the value of the
     * selectionByProductRequirementSpecificationKeyRequirementSpecificationID
     * property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByProductRequirementSpecificationKeyRequirementSpecificationID
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByProductRequirementSpecificationKeyRequirementSpecificationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIdentifier }
     * 
     * 
     */
    public List<SelectionByIdentifier> getSelectionByProductRequirementSpecificationKeyRequirementSpecificationID() {
        if (selectionByProductRequirementSpecificationKeyRequirementSpecificationID == null) {
            selectionByProductRequirementSpecificationKeyRequirementSpecificationID = new ArrayList<SelectionByIdentifier>();
        }
        return this.selectionByProductRequirementSpecificationKeyRequirementSpecificationID;
    }

    /**
     * Gets the value of the selectionByAdministrativeDataCreationDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByAdministrativeDataCreationDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByAdministrativeDataCreationDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLOBALSelectionByDateTime }
     * 
     * 
     */
    public List<GLOBALSelectionByDateTime> getSelectionByAdministrativeDataCreationDateTime() {
        if (selectionByAdministrativeDataCreationDateTime == null) {
            selectionByAdministrativeDataCreationDateTime = new ArrayList<GLOBALSelectionByDateTime>();
        }
        return this.selectionByAdministrativeDataCreationDateTime;
    }

    /**
     * Gets the value of the selectionByAdministrativeDataLastChangeDateTime
     * property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByAdministrativeDataLastChangeDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByAdministrativeDataLastChangeDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GLOBALSelectionByDateTime }
     * 
     * 
     */
    public List<GLOBALSelectionByDateTime> getSelectionByAdministrativeDataLastChangeDateTime() {
        if (selectionByAdministrativeDataLastChangeDateTime == null) {
            selectionByAdministrativeDataLastChangeDateTime = new ArrayList<GLOBALSelectionByDateTime>();
        }
        return this.selectionByAdministrativeDataLastChangeDateTime;
    }

    /**
     * selectionByBatchManagedIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isSelectionByBatchManagedIndicator() {
        return selectionByBatchManagedIndicator;
    }

    /**
     * selectionByBatchManagedIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setSelectionByBatchManagedIndicator(Boolean value) {
        this.selectionByBatchManagedIndicator = value;
    }

}
