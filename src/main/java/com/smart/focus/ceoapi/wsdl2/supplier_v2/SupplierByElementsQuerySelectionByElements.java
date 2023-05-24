
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplierByElementsQuerySelectionByElements complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsQuerySelectionByElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByBusinessPartnerRoleCode" type="{http://sap.com/xi/AP/Common/Global}SelectionByCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByInternalID" type="{http://sap.com/xi/AP/Common/Global}SelectionByIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByUUID" type="{http://sap.com/xi/AP/Common/Global}SelectionByUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBusinessPartnerName" type="{http://sap.com/xi/AP/Common/Global}SelectionByName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBusinessPartnerAdditionalName" type="{http://sap.com/xi/AP/Common/Global}SelectionByName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySortingFormattedName" type="{http://sap.com/xi/AP/Common/Global}SelectionByName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLegalCompetenceIndicator" type="{http://sap.com/xi/AP/Common/Global}SelectionByIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByAddressDefaultIndicator" type="{http://sap.com/xi/AP/Common/Global}SelectionByIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPostalAddressCityName" type="{http://sap.com/xi/AP/Common/Global}SelectionByName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPostalAddressStreetPostalCode" type="{http://sap.com/xi/A1S/Global}SupplierByElementsQuerySelectionByStreetPostalCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPostalAddressStreetName" type="{http://sap.com/xi/AP/Common/Global}SelectionByName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPostalAddressBuildingID" type="{http://sap.com/xi/AP/Common/Global}SelectionByIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPostalAddressFloorID" type="{http://sap.com/xi/AP/Common/Global}SelectionByIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPostalAddressCountryCode" type="{http://sap.com/xi/A1S/Global}SupplierByElementsQuerySelectionByCountryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPostalAddressRegionCode" type="{http://sap.com/xi/AP/Common/Global}SelectionByCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionbyAddressEMailURI" type="{http://sap.com/xi/A1S/Global}SupplierByElementsQuerySelectionByEMailURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByABCClassificationCode" type="{http://sap.com/xi/AP/Common/Global}SelectionByCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByIndustrialSectorCode" type="{http://sap.com/xi/AP/Common/Global}SelectionByCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByContactPersonInternalID" type="{http://sap.com/xi/AP/Common/Global}SelectionByIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByContactPersonUUID" type="{http://sap.com/xi/AP/Common/Global}SelectionByUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByContactPersonFamilyName" type="{http://sap.com/xi/AP/Common/Global}SelectionByName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByContactPersonGivenName" type="{http://sap.com/xi/AP/Common/Global}SelectionByName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByContactPersonSortingFormattedName" type="{http://sap.com/xi/AP/Common/Global}SelectionByName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByIdentificationDunAndBradstreetNumberBusinessPartnerID" type="{http://sap.com/xi/AP/Common/Global}SelectionByIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByProcurementArrangementPurchasingTermsPurchasingBlockIndicator" type="{http://sap.com/xi/AP/Common/Global}SelectionByIndicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCreatedSinceDate" type="{http://sap.com/xi/AP/Common/Global}SelectionByDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByChangedSinceDate" type="{http://sap.com/xi/AP/Common/Global}SelectionByDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLifeCycleStatusCode" type="{http://sap.com/xi/A1S/Global}SupplierByElementsQuerySelectionByLifeCycleStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySearchText" type="{http://sap.com/xi/AP/Common/GDT}SearchText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsQuerySelectionByElements", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "selectionByBusinessPartnerRoleCode",
    "selectionByInternalID",
    "selectionByUUID",
    "selectionByBusinessPartnerName",
    "selectionByBusinessPartnerAdditionalName",
    "selectionBySortingFormattedName",
    "selectionByLegalCompetenceIndicator",
    "selectionByAddressDefaultIndicator",
    "selectionByPostalAddressCityName",
    "selectionByPostalAddressStreetPostalCode",
    "selectionByPostalAddressStreetName",
    "selectionByPostalAddressBuildingID",
    "selectionByPostalAddressFloorID",
    "selectionByPostalAddressCountryCode",
    "selectionByPostalAddressRegionCode",
    "selectionbyAddressEMailURI",
    "selectionByABCClassificationCode",
    "selectionByIndustrialSectorCode",
    "selectionByContactPersonInternalID",
    "selectionByContactPersonUUID",
    "selectionByContactPersonFamilyName",
    "selectionByContactPersonGivenName",
    "selectionByContactPersonSortingFormattedName",
    "selectionByIdentificationDunAndBradstreetNumberBusinessPartnerID",
    "selectionByProcurementArrangementPurchasingTermsPurchasingBlockIndicator",
    "selectionByCreatedSinceDate",
    "selectionByChangedSinceDate",
    "selectionByLifeCycleStatusCode",
    "selectionBySearchText"
})
public class SupplierByElementsQuerySelectionByElements {

    @XmlElement(name = "SelectionByBusinessPartnerRoleCode")
    protected List<SelectionByCode> selectionByBusinessPartnerRoleCode;
    @XmlElement(name = "SelectionByInternalID")
    protected List<SelectionByIdentifier> selectionByInternalID;
    @XmlElement(name = "SelectionByUUID")
    protected List<SelectionByUUID> selectionByUUID;
    @XmlElement(name = "SelectionByBusinessPartnerName")
    protected List<SelectionByName> selectionByBusinessPartnerName;
    @XmlElement(name = "SelectionByBusinessPartnerAdditionalName")
    protected List<SelectionByName> selectionByBusinessPartnerAdditionalName;
    @XmlElement(name = "SelectionBySortingFormattedName")
    protected List<SelectionByName> selectionBySortingFormattedName;
    @XmlElement(name = "SelectionByLegalCompetenceIndicator")
    protected List<SelectionByIndicator> selectionByLegalCompetenceIndicator;
    @XmlElement(name = "SelectionByAddressDefaultIndicator")
    protected List<SelectionByIndicator> selectionByAddressDefaultIndicator;
    @XmlElement(name = "SelectionByPostalAddressCityName")
    protected List<SelectionByName> selectionByPostalAddressCityName;
    @XmlElement(name = "SelectionByPostalAddressStreetPostalCode")
    protected List<SupplierByElementsQuerySelectionByStreetPostalCode> selectionByPostalAddressStreetPostalCode;
    @XmlElement(name = "SelectionByPostalAddressStreetName")
    protected List<SelectionByName> selectionByPostalAddressStreetName;
    @XmlElement(name = "SelectionByPostalAddressBuildingID")
    protected List<SelectionByIdentifier> selectionByPostalAddressBuildingID;
    @XmlElement(name = "SelectionByPostalAddressFloorID")
    protected List<SelectionByIdentifier> selectionByPostalAddressFloorID;
    @XmlElement(name = "SelectionByPostalAddressCountryCode")
    protected List<SupplierByElementsQuerySelectionByCountryCode> selectionByPostalAddressCountryCode;
    @XmlElement(name = "SelectionByPostalAddressRegionCode")
    protected List<SelectionByCode> selectionByPostalAddressRegionCode;
    @XmlElement(name = "SelectionbyAddressEMailURI")
    protected List<SupplierByElementsQuerySelectionByEMailURI> selectionbyAddressEMailURI;
    @XmlElement(name = "SelectionByABCClassificationCode")
    protected List<SelectionByCode> selectionByABCClassificationCode;
    @XmlElement(name = "SelectionByIndustrialSectorCode")
    protected List<SelectionByCode> selectionByIndustrialSectorCode;
    @XmlElement(name = "SelectionByContactPersonInternalID")
    protected List<SelectionByIdentifier> selectionByContactPersonInternalID;
    @XmlElement(name = "SelectionByContactPersonUUID")
    protected List<SelectionByUUID> selectionByContactPersonUUID;
    @XmlElement(name = "SelectionByContactPersonFamilyName")
    protected List<SelectionByName> selectionByContactPersonFamilyName;
    @XmlElement(name = "SelectionByContactPersonGivenName")
    protected List<SelectionByName> selectionByContactPersonGivenName;
    @XmlElement(name = "SelectionByContactPersonSortingFormattedName")
    protected List<SelectionByName> selectionByContactPersonSortingFormattedName;
    @XmlElement(name = "SelectionByIdentificationDunAndBradstreetNumberBusinessPartnerID")
    protected List<SelectionByIdentifier> selectionByIdentificationDunAndBradstreetNumberBusinessPartnerID;
    @XmlElement(name = "SelectionByProcurementArrangementPurchasingTermsPurchasingBlockIndicator")
    protected List<SelectionByIndicator> selectionByProcurementArrangementPurchasingTermsPurchasingBlockIndicator;
    @XmlElement(name = "SelectionByCreatedSinceDate")
    protected List<SelectionByDate> selectionByCreatedSinceDate;
    @XmlElement(name = "SelectionByChangedSinceDate")
    protected List<SelectionByDate> selectionByChangedSinceDate;
    @XmlElement(name = "SelectionByLifeCycleStatusCode")
    protected List<SupplierByElementsQuerySelectionByLifeCycleStatusCode> selectionByLifeCycleStatusCode;
    @XmlElement(name = "SelectionBySearchText")
    protected String selectionBySearchText;

    /**
     * Gets the value of the selectionByBusinessPartnerRoleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByBusinessPartnerRoleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByBusinessPartnerRoleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByCode }
     * 
     * 
     */
    public List<SelectionByCode> getSelectionByBusinessPartnerRoleCode() {
        if (selectionByBusinessPartnerRoleCode == null) {
            selectionByBusinessPartnerRoleCode = new ArrayList<SelectionByCode>();
        }
        return this.selectionByBusinessPartnerRoleCode;
    }

    /**
     * Gets the value of the selectionByInternalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByInternalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByInternalID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIdentifier }
     * 
     * 
     */
    public List<SelectionByIdentifier> getSelectionByInternalID() {
        if (selectionByInternalID == null) {
            selectionByInternalID = new ArrayList<SelectionByIdentifier>();
        }
        return this.selectionByInternalID;
    }

    /**
     * Gets the value of the selectionByUUID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByUUID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByUUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByUUID }
     * 
     * 
     */
    public List<SelectionByUUID> getSelectionByUUID() {
        if (selectionByUUID == null) {
            selectionByUUID = new ArrayList<SelectionByUUID>();
        }
        return this.selectionByUUID;
    }

    /**
     * Gets the value of the selectionByBusinessPartnerName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByBusinessPartnerName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByBusinessPartnerName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByName }
     * 
     * 
     */
    public List<SelectionByName> getSelectionByBusinessPartnerName() {
        if (selectionByBusinessPartnerName == null) {
            selectionByBusinessPartnerName = new ArrayList<SelectionByName>();
        }
        return this.selectionByBusinessPartnerName;
    }

    /**
     * Gets the value of the selectionByBusinessPartnerAdditionalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByBusinessPartnerAdditionalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByBusinessPartnerAdditionalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByName }
     * 
     * 
     */
    public List<SelectionByName> getSelectionByBusinessPartnerAdditionalName() {
        if (selectionByBusinessPartnerAdditionalName == null) {
            selectionByBusinessPartnerAdditionalName = new ArrayList<SelectionByName>();
        }
        return this.selectionByBusinessPartnerAdditionalName;
    }

    /**
     * Gets the value of the selectionBySortingFormattedName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionBySortingFormattedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionBySortingFormattedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByName }
     * 
     * 
     */
    public List<SelectionByName> getSelectionBySortingFormattedName() {
        if (selectionBySortingFormattedName == null) {
            selectionBySortingFormattedName = new ArrayList<SelectionByName>();
        }
        return this.selectionBySortingFormattedName;
    }

    /**
     * Gets the value of the selectionByLegalCompetenceIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByLegalCompetenceIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByLegalCompetenceIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIndicator }
     * 
     * 
     */
    public List<SelectionByIndicator> getSelectionByLegalCompetenceIndicator() {
        if (selectionByLegalCompetenceIndicator == null) {
            selectionByLegalCompetenceIndicator = new ArrayList<SelectionByIndicator>();
        }
        return this.selectionByLegalCompetenceIndicator;
    }

    /**
     * Gets the value of the selectionByAddressDefaultIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByAddressDefaultIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByAddressDefaultIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIndicator }
     * 
     * 
     */
    public List<SelectionByIndicator> getSelectionByAddressDefaultIndicator() {
        if (selectionByAddressDefaultIndicator == null) {
            selectionByAddressDefaultIndicator = new ArrayList<SelectionByIndicator>();
        }
        return this.selectionByAddressDefaultIndicator;
    }

    /**
     * Gets the value of the selectionByPostalAddressCityName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByPostalAddressCityName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByPostalAddressCityName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByName }
     * 
     * 
     */
    public List<SelectionByName> getSelectionByPostalAddressCityName() {
        if (selectionByPostalAddressCityName == null) {
            selectionByPostalAddressCityName = new ArrayList<SelectionByName>();
        }
        return this.selectionByPostalAddressCityName;
    }

    /**
     * Gets the value of the selectionByPostalAddressStreetPostalCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByPostalAddressStreetPostalCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByPostalAddressStreetPostalCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsQuerySelectionByStreetPostalCode }
     * 
     * 
     */
    public List<SupplierByElementsQuerySelectionByStreetPostalCode> getSelectionByPostalAddressStreetPostalCode() {
        if (selectionByPostalAddressStreetPostalCode == null) {
            selectionByPostalAddressStreetPostalCode = new ArrayList<SupplierByElementsQuerySelectionByStreetPostalCode>();
        }
        return this.selectionByPostalAddressStreetPostalCode;
    }

    /**
     * Gets the value of the selectionByPostalAddressStreetName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByPostalAddressStreetName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByPostalAddressStreetName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByName }
     * 
     * 
     */
    public List<SelectionByName> getSelectionByPostalAddressStreetName() {
        if (selectionByPostalAddressStreetName == null) {
            selectionByPostalAddressStreetName = new ArrayList<SelectionByName>();
        }
        return this.selectionByPostalAddressStreetName;
    }

    /**
     * Gets the value of the selectionByPostalAddressBuildingID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByPostalAddressBuildingID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByPostalAddressBuildingID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIdentifier }
     * 
     * 
     */
    public List<SelectionByIdentifier> getSelectionByPostalAddressBuildingID() {
        if (selectionByPostalAddressBuildingID == null) {
            selectionByPostalAddressBuildingID = new ArrayList<SelectionByIdentifier>();
        }
        return this.selectionByPostalAddressBuildingID;
    }

    /**
     * Gets the value of the selectionByPostalAddressFloorID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByPostalAddressFloorID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByPostalAddressFloorID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIdentifier }
     * 
     * 
     */
    public List<SelectionByIdentifier> getSelectionByPostalAddressFloorID() {
        if (selectionByPostalAddressFloorID == null) {
            selectionByPostalAddressFloorID = new ArrayList<SelectionByIdentifier>();
        }
        return this.selectionByPostalAddressFloorID;
    }

    /**
     * Gets the value of the selectionByPostalAddressCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByPostalAddressCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByPostalAddressCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsQuerySelectionByCountryCode }
     * 
     * 
     */
    public List<SupplierByElementsQuerySelectionByCountryCode> getSelectionByPostalAddressCountryCode() {
        if (selectionByPostalAddressCountryCode == null) {
            selectionByPostalAddressCountryCode = new ArrayList<SupplierByElementsQuerySelectionByCountryCode>();
        }
        return this.selectionByPostalAddressCountryCode;
    }

    /**
     * Gets the value of the selectionByPostalAddressRegionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByPostalAddressRegionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByPostalAddressRegionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByCode }
     * 
     * 
     */
    public List<SelectionByCode> getSelectionByPostalAddressRegionCode() {
        if (selectionByPostalAddressRegionCode == null) {
            selectionByPostalAddressRegionCode = new ArrayList<SelectionByCode>();
        }
        return this.selectionByPostalAddressRegionCode;
    }

    /**
     * Gets the value of the selectionbyAddressEMailURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionbyAddressEMailURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionbyAddressEMailURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsQuerySelectionByEMailURI }
     * 
     * 
     */
    public List<SupplierByElementsQuerySelectionByEMailURI> getSelectionbyAddressEMailURI() {
        if (selectionbyAddressEMailURI == null) {
            selectionbyAddressEMailURI = new ArrayList<SupplierByElementsQuerySelectionByEMailURI>();
        }
        return this.selectionbyAddressEMailURI;
    }

    /**
     * Gets the value of the selectionByABCClassificationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByABCClassificationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByABCClassificationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByCode }
     * 
     * 
     */
    public List<SelectionByCode> getSelectionByABCClassificationCode() {
        if (selectionByABCClassificationCode == null) {
            selectionByABCClassificationCode = new ArrayList<SelectionByCode>();
        }
        return this.selectionByABCClassificationCode;
    }

    /**
     * Gets the value of the selectionByIndustrialSectorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByIndustrialSectorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByIndustrialSectorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByCode }
     * 
     * 
     */
    public List<SelectionByCode> getSelectionByIndustrialSectorCode() {
        if (selectionByIndustrialSectorCode == null) {
            selectionByIndustrialSectorCode = new ArrayList<SelectionByCode>();
        }
        return this.selectionByIndustrialSectorCode;
    }

    /**
     * Gets the value of the selectionByContactPersonInternalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByContactPersonInternalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByContactPersonInternalID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIdentifier }
     * 
     * 
     */
    public List<SelectionByIdentifier> getSelectionByContactPersonInternalID() {
        if (selectionByContactPersonInternalID == null) {
            selectionByContactPersonInternalID = new ArrayList<SelectionByIdentifier>();
        }
        return this.selectionByContactPersonInternalID;
    }

    /**
     * Gets the value of the selectionByContactPersonUUID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByContactPersonUUID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByContactPersonUUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByUUID }
     * 
     * 
     */
    public List<SelectionByUUID> getSelectionByContactPersonUUID() {
        if (selectionByContactPersonUUID == null) {
            selectionByContactPersonUUID = new ArrayList<SelectionByUUID>();
        }
        return this.selectionByContactPersonUUID;
    }

    /**
     * Gets the value of the selectionByContactPersonFamilyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByContactPersonFamilyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByContactPersonFamilyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByName }
     * 
     * 
     */
    public List<SelectionByName> getSelectionByContactPersonFamilyName() {
        if (selectionByContactPersonFamilyName == null) {
            selectionByContactPersonFamilyName = new ArrayList<SelectionByName>();
        }
        return this.selectionByContactPersonFamilyName;
    }

    /**
     * Gets the value of the selectionByContactPersonGivenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByContactPersonGivenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByContactPersonGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByName }
     * 
     * 
     */
    public List<SelectionByName> getSelectionByContactPersonGivenName() {
        if (selectionByContactPersonGivenName == null) {
            selectionByContactPersonGivenName = new ArrayList<SelectionByName>();
        }
        return this.selectionByContactPersonGivenName;
    }

    /**
     * Gets the value of the selectionByContactPersonSortingFormattedName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByContactPersonSortingFormattedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByContactPersonSortingFormattedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByName }
     * 
     * 
     */
    public List<SelectionByName> getSelectionByContactPersonSortingFormattedName() {
        if (selectionByContactPersonSortingFormattedName == null) {
            selectionByContactPersonSortingFormattedName = new ArrayList<SelectionByName>();
        }
        return this.selectionByContactPersonSortingFormattedName;
    }

    /**
     * Gets the value of the selectionByIdentificationDunAndBradstreetNumberBusinessPartnerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByIdentificationDunAndBradstreetNumberBusinessPartnerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByIdentificationDunAndBradstreetNumberBusinessPartnerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIdentifier }
     * 
     * 
     */
    public List<SelectionByIdentifier> getSelectionByIdentificationDunAndBradstreetNumberBusinessPartnerID() {
        if (selectionByIdentificationDunAndBradstreetNumberBusinessPartnerID == null) {
            selectionByIdentificationDunAndBradstreetNumberBusinessPartnerID = new ArrayList<SelectionByIdentifier>();
        }
        return this.selectionByIdentificationDunAndBradstreetNumberBusinessPartnerID;
    }

    /**
     * Gets the value of the selectionByProcurementArrangementPurchasingTermsPurchasingBlockIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByProcurementArrangementPurchasingTermsPurchasingBlockIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByProcurementArrangementPurchasingTermsPurchasingBlockIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIndicator }
     * 
     * 
     */
    public List<SelectionByIndicator> getSelectionByProcurementArrangementPurchasingTermsPurchasingBlockIndicator() {
        if (selectionByProcurementArrangementPurchasingTermsPurchasingBlockIndicator == null) {
            selectionByProcurementArrangementPurchasingTermsPurchasingBlockIndicator = new ArrayList<SelectionByIndicator>();
        }
        return this.selectionByProcurementArrangementPurchasingTermsPurchasingBlockIndicator;
    }

    /**
     * Gets the value of the selectionByCreatedSinceDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByCreatedSinceDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByCreatedSinceDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByDate }
     * 
     * 
     */
    public List<SelectionByDate> getSelectionByCreatedSinceDate() {
        if (selectionByCreatedSinceDate == null) {
            selectionByCreatedSinceDate = new ArrayList<SelectionByDate>();
        }
        return this.selectionByCreatedSinceDate;
    }

    /**
     * Gets the value of the selectionByChangedSinceDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByChangedSinceDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByChangedSinceDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByDate }
     * 
     * 
     */
    public List<SelectionByDate> getSelectionByChangedSinceDate() {
        if (selectionByChangedSinceDate == null) {
            selectionByChangedSinceDate = new ArrayList<SelectionByDate>();
        }
        return this.selectionByChangedSinceDate;
    }

    /**
     * Gets the value of the selectionByLifeCycleStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByLifeCycleStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByLifeCycleStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsQuerySelectionByLifeCycleStatusCode }
     * 
     * 
     */
    public List<SupplierByElementsQuerySelectionByLifeCycleStatusCode> getSelectionByLifeCycleStatusCode() {
        if (selectionByLifeCycleStatusCode == null) {
            selectionByLifeCycleStatusCode = new ArrayList<SupplierByElementsQuerySelectionByLifeCycleStatusCode>();
        }
        return this.selectionByLifeCycleStatusCode;
    }

    /**
     * selectionBySearchText 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionBySearchText() {
        return selectionBySearchText;
    }

    /**
     * selectionBySearchText 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionBySearchText(String value) {
        this.selectionBySearchText = value;
    }

}
