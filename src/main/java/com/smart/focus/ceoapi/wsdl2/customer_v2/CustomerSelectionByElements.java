
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CustomerSelectionByElements complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerSelectionByElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByBusinessPartnerRoleCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByRoleCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByInternalID" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByInternalID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByUUID" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCategoryCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByCategoryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBusinessPartnerName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByBusinessPartnerName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBusinessPartnerAdditionalName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByBusinessPartnerAdditionalName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySortingFormattedName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionBySortingFormattedName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLegalCompetenceIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByAddressDefaultIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPostalAddressCityName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByCityName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPostalAddressStreetPostalCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByStreetPostalCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPostalAddressCountryCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByCountryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPostalAddressRegionCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByRegionCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByABCClassificationCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByCustomerABCClassificationCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByIndustrialSectorCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByIndustrialSectorCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByContactPersonInternalID" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByInternalID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByContactPersonUUID" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByContactPersonFamilyName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByBusinessPartnerName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByContactPersonGivenName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByBusinessPartnerAdditionalName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByContactPersonSortingFormattedName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionBySortingFormattedName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByContactPersonWorkplaceEmailURI" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByEmailURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySalesArrangementSalesOrganisationID" type="{http://sap.com/xi/A1S/Global}CustomerSelectionBySalesOrganisationID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCreatedSinceDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByChangedSinceDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLifeCycleStatusCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByLifeCycleStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySearchText" type="{http://sap.com/xi/AP/Common/GDT}SearchText" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCreatedSinceDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLastChangeSinceDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCreationIdentityID" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByIdentityID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLastChangeIdentityID" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByIdentityID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByGroupwareSubscriptionEmployeeUUID" type="{http://sap.com/xi/AP/Common/Global}SelectionByUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByResponsibleEmployeeUUID" type="{http://sap.com/xi/AP/Common/Global}SelectionByUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCreationDateTime" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByCreationDateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLastChangeDateTime" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByChangeDateTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA5BCFD2A4D5E3"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA690848BBF7DD"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA72782950BA79"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA8246E8C8DCA9"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA890F5E5D5DFC"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8FC0DC54C578885B"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSelectionByElements", propOrder = {
    "selectionByBusinessPartnerRoleCode",
    "selectionByInternalID",
    "selectionByUUID",
    "selectionByCategoryCode",
    "selectionByBusinessPartnerName",
    "selectionByBusinessPartnerAdditionalName",
    "selectionBySortingFormattedName",
    "selectionByLegalCompetenceIndicator",
    "selectionByAddressDefaultIndicator",
    "selectionByPostalAddressCityName",
    "selectionByPostalAddressStreetPostalCode",
    "selectionByPostalAddressCountryCode",
    "selectionByPostalAddressRegionCode",
    "selectionByABCClassificationCode",
    "selectionByIndustrialSectorCode",
    "selectionByContactPersonInternalID",
    "selectionByContactPersonUUID",
    "selectionByContactPersonFamilyName",
    "selectionByContactPersonGivenName",
    "selectionByContactPersonSortingFormattedName",
    "selectionByContactPersonWorkplaceEmailURI",
    "selectionBySalesArrangementSalesOrganisationID",
    "selectionByCreatedSinceDate",
    "selectionByChangedSinceDate",
    "selectionByLifeCycleStatusCode",
    "selectionBySearchText",
    "selectionByCreatedSinceDateTime",
    "selectionByLastChangeSinceDateTime",
    "selectionByCreationIdentityID",
    "selectionByLastChangeIdentityID",
    "selectionByGroupwareSubscriptionEmployeeUUID",
    "selectionByResponsibleEmployeeUUID",
    "selectionByCreationDateTime",
    "selectionByLastChangeDateTime",
    "zpartnercustom1EA8AE8AUBVHCSXVYS0FJ1R3ON",
    "zpartnercustom2EA8AE8AUBVHCSXVYS0FJ1R3ON",
    "zpartnercustom3EA8AE8AUBVHCSXVYS0FJ1R3ON",
    "zpartnercustom4EA8AE8AUBVHCSXVYS0FJ1R3ON",
    "zpartnercustom6EA8AE8AUBVHCSXVYS0FJ1R3ON",
    "zpartnercustom5EA8AE8AUBVHCSXVYS0FJ1R3ON"
})
public class CustomerSelectionByElements {

    @XmlElement(name = "SelectionByBusinessPartnerRoleCode")
    protected List<CustomerSelectionByRoleCode> selectionByBusinessPartnerRoleCode;
    @XmlElement(name = "SelectionByInternalID")
    protected List<CustomerSelectionByInternalID> selectionByInternalID;
    @XmlElement(name = "SelectionByUUID")
    protected List<CustomerSelectionByUUID> selectionByUUID;
    @XmlElement(name = "SelectionByCategoryCode")
    protected List<CustomerSelectionByCategoryCode> selectionByCategoryCode;
    @XmlElement(name = "SelectionByBusinessPartnerName")
    protected List<CustomerSelectionByBusinessPartnerName> selectionByBusinessPartnerName;
    @XmlElement(name = "SelectionByBusinessPartnerAdditionalName")
    protected List<CustomerSelectionByBusinessPartnerAdditionalName> selectionByBusinessPartnerAdditionalName;
    @XmlElement(name = "SelectionBySortingFormattedName")
    protected List<CustomerSelectionBySortingFormattedName> selectionBySortingFormattedName;
    @XmlElement(name = "SelectionByLegalCompetenceIndicator")
    protected Boolean selectionByLegalCompetenceIndicator;
    @XmlElement(name = "SelectionByAddressDefaultIndicator")
    protected Boolean selectionByAddressDefaultIndicator;
    @XmlElement(name = "SelectionByPostalAddressCityName")
    protected List<CustomerSelectionByCityName> selectionByPostalAddressCityName;
    @XmlElement(name = "SelectionByPostalAddressStreetPostalCode")
    protected List<CustomerSelectionByStreetPostalCode> selectionByPostalAddressStreetPostalCode;
    @XmlElement(name = "SelectionByPostalAddressCountryCode")
    protected List<CustomerSelectionByCountryCode> selectionByPostalAddressCountryCode;
    @XmlElement(name = "SelectionByPostalAddressRegionCode")
    protected List<CustomerSelectionByRegionCode> selectionByPostalAddressRegionCode;
    @XmlElement(name = "SelectionByABCClassificationCode")
    protected List<CustomerSelectionByCustomerABCClassificationCode> selectionByABCClassificationCode;
    @XmlElement(name = "SelectionByIndustrialSectorCode")
    protected List<CustomerSelectionByIndustrialSectorCode> selectionByIndustrialSectorCode;
    @XmlElement(name = "SelectionByContactPersonInternalID")
    protected List<CustomerSelectionByInternalID> selectionByContactPersonInternalID;
    @XmlElement(name = "SelectionByContactPersonUUID")
    protected List<CustomerSelectionByUUID> selectionByContactPersonUUID;
    @XmlElement(name = "SelectionByContactPersonFamilyName")
    protected List<CustomerSelectionByBusinessPartnerName> selectionByContactPersonFamilyName;
    @XmlElement(name = "SelectionByContactPersonGivenName")
    protected List<CustomerSelectionByBusinessPartnerAdditionalName> selectionByContactPersonGivenName;
    @XmlElement(name = "SelectionByContactPersonSortingFormattedName")
    protected List<CustomerSelectionBySortingFormattedName> selectionByContactPersonSortingFormattedName;
    @XmlElement(name = "SelectionByContactPersonWorkplaceEmailURI")
    protected List<CustomerSelectionByEmailURI> selectionByContactPersonWorkplaceEmailURI;
    @XmlElement(name = "SelectionBySalesArrangementSalesOrganisationID")
    protected List<CustomerSelectionBySalesOrganisationID> selectionBySalesArrangementSalesOrganisationID;
    @XmlElement(name = "SelectionByCreatedSinceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar selectionByCreatedSinceDate;
    @XmlElement(name = "SelectionByChangedSinceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar selectionByChangedSinceDate;
    @XmlElement(name = "SelectionByLifeCycleStatusCode")
    protected List<CustomerSelectionByLifeCycleStatusCode> selectionByLifeCycleStatusCode;
    @XmlElement(name = "SelectionBySearchText")
    protected String selectionBySearchText;
    @XmlElement(name = "SelectionByCreatedSinceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar selectionByCreatedSinceDateTime;
    @XmlElement(name = "SelectionByLastChangeSinceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar selectionByLastChangeSinceDateTime;
    @XmlElement(name = "SelectionByCreationIdentityID")
    protected List<CustomerSelectionByIdentityID> selectionByCreationIdentityID;
    @XmlElement(name = "SelectionByLastChangeIdentityID")
    protected List<CustomerSelectionByIdentityID> selectionByLastChangeIdentityID;
    @XmlElement(name = "SelectionByGroupwareSubscriptionEmployeeUUID")
    protected List<SelectionByUUID> selectionByGroupwareSubscriptionEmployeeUUID;
    @XmlElement(name = "SelectionByResponsibleEmployeeUUID")
    protected List<SelectionByUUID> selectionByResponsibleEmployeeUUID;
    @XmlElement(name = "SelectionByCreationDateTime")
    protected List<CustomerSelectionByCreationDateTime> selectionByCreationDateTime;
    @XmlElement(name = "SelectionByLastChangeDateTime")
    protected List<CustomerSelectionByChangeDateTime> selectionByLastChangeDateTime;
    @XmlElement(name = "Zpartnercustom1_EA8AE8AUBVHCSXVYS0FJ1R3ON", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByText zpartnercustom1EA8AE8AUBVHCSXVYS0FJ1R3ON;
    @XmlElement(name = "Zpartnercustom2_EA8AE8AUBVHCSXVYS0FJ1R3ON", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByText zpartnercustom2EA8AE8AUBVHCSXVYS0FJ1R3ON;
    @XmlElement(name = "Zpartnercustom3_EA8AE8AUBVHCSXVYS0FJ1R3ON", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByDecimal zpartnercustom3EA8AE8AUBVHCSXVYS0FJ1R3ON;
    @XmlElement(name = "Zpartnercustom4_EA8AE8AUBVHCSXVYS0FJ1R3ON", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByDecimal zpartnercustom4EA8AE8AUBVHCSXVYS0FJ1R3ON;
    @XmlElement(name = "Zpartnercustom6_EA8AE8AUBVHCSXVYS0FJ1R3ON", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByCode zpartnercustom6EA8AE8AUBVHCSXVYS0FJ1R3ON;
    @XmlElement(name = "Zpartnercustom5_EA8AE8AUBVHCSXVYS0FJ1R3ON", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByCode zpartnercustom5EA8AE8AUBVHCSXVYS0FJ1R3ON;

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
     * {@link CustomerSelectionByRoleCode }
     * 
     * 
     */
    public List<CustomerSelectionByRoleCode> getSelectionByBusinessPartnerRoleCode() {
        if (selectionByBusinessPartnerRoleCode == null) {
            selectionByBusinessPartnerRoleCode = new ArrayList<CustomerSelectionByRoleCode>();
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
     * {@link CustomerSelectionByInternalID }
     * 
     * 
     */
    public List<CustomerSelectionByInternalID> getSelectionByInternalID() {
        if (selectionByInternalID == null) {
            selectionByInternalID = new ArrayList<CustomerSelectionByInternalID>();
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
     * {@link CustomerSelectionByUUID }
     * 
     * 
     */
    public List<CustomerSelectionByUUID> getSelectionByUUID() {
        if (selectionByUUID == null) {
            selectionByUUID = new ArrayList<CustomerSelectionByUUID>();
        }
        return this.selectionByUUID;
    }

    /**
     * Gets the value of the selectionByCategoryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByCategoryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByCategoryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionByCategoryCode }
     * 
     * 
     */
    public List<CustomerSelectionByCategoryCode> getSelectionByCategoryCode() {
        if (selectionByCategoryCode == null) {
            selectionByCategoryCode = new ArrayList<CustomerSelectionByCategoryCode>();
        }
        return this.selectionByCategoryCode;
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
     * {@link CustomerSelectionByBusinessPartnerName }
     * 
     * 
     */
    public List<CustomerSelectionByBusinessPartnerName> getSelectionByBusinessPartnerName() {
        if (selectionByBusinessPartnerName == null) {
            selectionByBusinessPartnerName = new ArrayList<CustomerSelectionByBusinessPartnerName>();
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
     * {@link CustomerSelectionByBusinessPartnerAdditionalName }
     * 
     * 
     */
    public List<CustomerSelectionByBusinessPartnerAdditionalName> getSelectionByBusinessPartnerAdditionalName() {
        if (selectionByBusinessPartnerAdditionalName == null) {
            selectionByBusinessPartnerAdditionalName = new ArrayList<CustomerSelectionByBusinessPartnerAdditionalName>();
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
     * {@link CustomerSelectionBySortingFormattedName }
     * 
     * 
     */
    public List<CustomerSelectionBySortingFormattedName> getSelectionBySortingFormattedName() {
        if (selectionBySortingFormattedName == null) {
            selectionBySortingFormattedName = new ArrayList<CustomerSelectionBySortingFormattedName>();
        }
        return this.selectionBySortingFormattedName;
    }

    /**
     * selectionByLegalCompetenceIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectionByLegalCompetenceIndicator() {
        return selectionByLegalCompetenceIndicator;
    }

    /**
     * selectionByLegalCompetenceIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectionByLegalCompetenceIndicator(Boolean value) {
        this.selectionByLegalCompetenceIndicator = value;
    }

    /**
     * selectionByAddressDefaultIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectionByAddressDefaultIndicator() {
        return selectionByAddressDefaultIndicator;
    }

    /**
     * selectionByAddressDefaultIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectionByAddressDefaultIndicator(Boolean value) {
        this.selectionByAddressDefaultIndicator = value;
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
     * {@link CustomerSelectionByCityName }
     * 
     * 
     */
    public List<CustomerSelectionByCityName> getSelectionByPostalAddressCityName() {
        if (selectionByPostalAddressCityName == null) {
            selectionByPostalAddressCityName = new ArrayList<CustomerSelectionByCityName>();
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
     * {@link CustomerSelectionByStreetPostalCode }
     * 
     * 
     */
    public List<CustomerSelectionByStreetPostalCode> getSelectionByPostalAddressStreetPostalCode() {
        if (selectionByPostalAddressStreetPostalCode == null) {
            selectionByPostalAddressStreetPostalCode = new ArrayList<CustomerSelectionByStreetPostalCode>();
        }
        return this.selectionByPostalAddressStreetPostalCode;
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
     * {@link CustomerSelectionByCountryCode }
     * 
     * 
     */
    public List<CustomerSelectionByCountryCode> getSelectionByPostalAddressCountryCode() {
        if (selectionByPostalAddressCountryCode == null) {
            selectionByPostalAddressCountryCode = new ArrayList<CustomerSelectionByCountryCode>();
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
     * {@link CustomerSelectionByRegionCode }
     * 
     * 
     */
    public List<CustomerSelectionByRegionCode> getSelectionByPostalAddressRegionCode() {
        if (selectionByPostalAddressRegionCode == null) {
            selectionByPostalAddressRegionCode = new ArrayList<CustomerSelectionByRegionCode>();
        }
        return this.selectionByPostalAddressRegionCode;
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
     * {@link CustomerSelectionByCustomerABCClassificationCode }
     * 
     * 
     */
    public List<CustomerSelectionByCustomerABCClassificationCode> getSelectionByABCClassificationCode() {
        if (selectionByABCClassificationCode == null) {
            selectionByABCClassificationCode = new ArrayList<CustomerSelectionByCustomerABCClassificationCode>();
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
     * {@link CustomerSelectionByIndustrialSectorCode }
     * 
     * 
     */
    public List<CustomerSelectionByIndustrialSectorCode> getSelectionByIndustrialSectorCode() {
        if (selectionByIndustrialSectorCode == null) {
            selectionByIndustrialSectorCode = new ArrayList<CustomerSelectionByIndustrialSectorCode>();
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
     * {@link CustomerSelectionByInternalID }
     * 
     * 
     */
    public List<CustomerSelectionByInternalID> getSelectionByContactPersonInternalID() {
        if (selectionByContactPersonInternalID == null) {
            selectionByContactPersonInternalID = new ArrayList<CustomerSelectionByInternalID>();
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
     * {@link CustomerSelectionByUUID }
     * 
     * 
     */
    public List<CustomerSelectionByUUID> getSelectionByContactPersonUUID() {
        if (selectionByContactPersonUUID == null) {
            selectionByContactPersonUUID = new ArrayList<CustomerSelectionByUUID>();
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
     * {@link CustomerSelectionByBusinessPartnerName }
     * 
     * 
     */
    public List<CustomerSelectionByBusinessPartnerName> getSelectionByContactPersonFamilyName() {
        if (selectionByContactPersonFamilyName == null) {
            selectionByContactPersonFamilyName = new ArrayList<CustomerSelectionByBusinessPartnerName>();
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
     * {@link CustomerSelectionByBusinessPartnerAdditionalName }
     * 
     * 
     */
    public List<CustomerSelectionByBusinessPartnerAdditionalName> getSelectionByContactPersonGivenName() {
        if (selectionByContactPersonGivenName == null) {
            selectionByContactPersonGivenName = new ArrayList<CustomerSelectionByBusinessPartnerAdditionalName>();
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
     * {@link CustomerSelectionBySortingFormattedName }
     * 
     * 
     */
    public List<CustomerSelectionBySortingFormattedName> getSelectionByContactPersonSortingFormattedName() {
        if (selectionByContactPersonSortingFormattedName == null) {
            selectionByContactPersonSortingFormattedName = new ArrayList<CustomerSelectionBySortingFormattedName>();
        }
        return this.selectionByContactPersonSortingFormattedName;
    }

    /**
     * Gets the value of the selectionByContactPersonWorkplaceEmailURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByContactPersonWorkplaceEmailURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByContactPersonWorkplaceEmailURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionByEmailURI }
     * 
     * 
     */
    public List<CustomerSelectionByEmailURI> getSelectionByContactPersonWorkplaceEmailURI() {
        if (selectionByContactPersonWorkplaceEmailURI == null) {
            selectionByContactPersonWorkplaceEmailURI = new ArrayList<CustomerSelectionByEmailURI>();
        }
        return this.selectionByContactPersonWorkplaceEmailURI;
    }

    /**
     * Gets the value of the selectionBySalesArrangementSalesOrganisationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionBySalesArrangementSalesOrganisationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionBySalesArrangementSalesOrganisationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionBySalesOrganisationID }
     * 
     * 
     */
    public List<CustomerSelectionBySalesOrganisationID> getSelectionBySalesArrangementSalesOrganisationID() {
        if (selectionBySalesArrangementSalesOrganisationID == null) {
            selectionBySalesArrangementSalesOrganisationID = new ArrayList<CustomerSelectionBySalesOrganisationID>();
        }
        return this.selectionBySalesArrangementSalesOrganisationID;
    }

    /**
     * selectionByCreatedSinceDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSelectionByCreatedSinceDate() {
        return selectionByCreatedSinceDate;
    }

    /**
     * selectionByCreatedSinceDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSelectionByCreatedSinceDate(XMLGregorianCalendar value) {
        this.selectionByCreatedSinceDate = value;
    }

    /**
     * selectionByChangedSinceDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSelectionByChangedSinceDate() {
        return selectionByChangedSinceDate;
    }

    /**
     * selectionByChangedSinceDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSelectionByChangedSinceDate(XMLGregorianCalendar value) {
        this.selectionByChangedSinceDate = value;
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
     * {@link CustomerSelectionByLifeCycleStatusCode }
     * 
     * 
     */
    public List<CustomerSelectionByLifeCycleStatusCode> getSelectionByLifeCycleStatusCode() {
        if (selectionByLifeCycleStatusCode == null) {
            selectionByLifeCycleStatusCode = new ArrayList<CustomerSelectionByLifeCycleStatusCode>();
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

    /**
     * selectionByCreatedSinceDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSelectionByCreatedSinceDateTime() {
        return selectionByCreatedSinceDateTime;
    }

    /**
     * selectionByCreatedSinceDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSelectionByCreatedSinceDateTime(XMLGregorianCalendar value) {
        this.selectionByCreatedSinceDateTime = value;
    }

    /**
     * selectionByLastChangeSinceDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSelectionByLastChangeSinceDateTime() {
        return selectionByLastChangeSinceDateTime;
    }

    /**
     * selectionByLastChangeSinceDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSelectionByLastChangeSinceDateTime(XMLGregorianCalendar value) {
        this.selectionByLastChangeSinceDateTime = value;
    }

    /**
     * Gets the value of the selectionByCreationIdentityID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByCreationIdentityID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByCreationIdentityID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionByIdentityID }
     * 
     * 
     */
    public List<CustomerSelectionByIdentityID> getSelectionByCreationIdentityID() {
        if (selectionByCreationIdentityID == null) {
            selectionByCreationIdentityID = new ArrayList<CustomerSelectionByIdentityID>();
        }
        return this.selectionByCreationIdentityID;
    }

    /**
     * Gets the value of the selectionByLastChangeIdentityID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByLastChangeIdentityID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByLastChangeIdentityID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionByIdentityID }
     * 
     * 
     */
    public List<CustomerSelectionByIdentityID> getSelectionByLastChangeIdentityID() {
        if (selectionByLastChangeIdentityID == null) {
            selectionByLastChangeIdentityID = new ArrayList<CustomerSelectionByIdentityID>();
        }
        return this.selectionByLastChangeIdentityID;
    }

    /**
     * Gets the value of the selectionByGroupwareSubscriptionEmployeeUUID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByGroupwareSubscriptionEmployeeUUID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByGroupwareSubscriptionEmployeeUUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByUUID }
     * 
     * 
     */
    public List<SelectionByUUID> getSelectionByGroupwareSubscriptionEmployeeUUID() {
        if (selectionByGroupwareSubscriptionEmployeeUUID == null) {
            selectionByGroupwareSubscriptionEmployeeUUID = new ArrayList<SelectionByUUID>();
        }
        return this.selectionByGroupwareSubscriptionEmployeeUUID;
    }

    /**
     * Gets the value of the selectionByResponsibleEmployeeUUID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByResponsibleEmployeeUUID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByResponsibleEmployeeUUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByUUID }
     * 
     * 
     */
    public List<SelectionByUUID> getSelectionByResponsibleEmployeeUUID() {
        if (selectionByResponsibleEmployeeUUID == null) {
            selectionByResponsibleEmployeeUUID = new ArrayList<SelectionByUUID>();
        }
        return this.selectionByResponsibleEmployeeUUID;
    }

    /**
     * Gets the value of the selectionByCreationDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByCreationDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByCreationDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionByCreationDateTime }
     * 
     * 
     */
    public List<CustomerSelectionByCreationDateTime> getSelectionByCreationDateTime() {
        if (selectionByCreationDateTime == null) {
            selectionByCreationDateTime = new ArrayList<CustomerSelectionByCreationDateTime>();
        }
        return this.selectionByCreationDateTime;
    }

    /**
     * Gets the value of the selectionByLastChangeDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByLastChangeDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByLastChangeDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionByChangeDateTime }
     * 
     * 
     */
    public List<CustomerSelectionByChangeDateTime> getSelectionByLastChangeDateTime() {
        if (selectionByLastChangeDateTime == null) {
            selectionByLastChangeDateTime = new ArrayList<CustomerSelectionByChangeDateTime>();
        }
        return this.selectionByLastChangeDateTime;
    }

    /**
     * zpartnercustom1EA8AE8AUBVHCSXVYS0FJ1R3ON 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByText }
     *     
     */
    public ExtSelectionByText getZpartnercustom1EA8AE8AUBVHCSXVYS0FJ1R3ON() {
        return zpartnercustom1EA8AE8AUBVHCSXVYS0FJ1R3ON;
    }

    /**
     * zpartnercustom1EA8AE8AUBVHCSXVYS0FJ1R3ON 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByText }
     *     
     */
    public void setZpartnercustom1EA8AE8AUBVHCSXVYS0FJ1R3ON(ExtSelectionByText value) {
        this.zpartnercustom1EA8AE8AUBVHCSXVYS0FJ1R3ON = value;
    }

    /**
     * zpartnercustom2EA8AE8AUBVHCSXVYS0FJ1R3ON 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByText }
     *     
     */
    public ExtSelectionByText getZpartnercustom2EA8AE8AUBVHCSXVYS0FJ1R3ON() {
        return zpartnercustom2EA8AE8AUBVHCSXVYS0FJ1R3ON;
    }

    /**
     * zpartnercustom2EA8AE8AUBVHCSXVYS0FJ1R3ON 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByText }
     *     
     */
    public void setZpartnercustom2EA8AE8AUBVHCSXVYS0FJ1R3ON(ExtSelectionByText value) {
        this.zpartnercustom2EA8AE8AUBVHCSXVYS0FJ1R3ON = value;
    }

    /**
     * zpartnercustom3EA8AE8AUBVHCSXVYS0FJ1R3ON 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByDecimal }
     *     
     */
    public ExtSelectionByDecimal getZpartnercustom3EA8AE8AUBVHCSXVYS0FJ1R3ON() {
        return zpartnercustom3EA8AE8AUBVHCSXVYS0FJ1R3ON;
    }

    /**
     * zpartnercustom3EA8AE8AUBVHCSXVYS0FJ1R3ON 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByDecimal }
     *     
     */
    public void setZpartnercustom3EA8AE8AUBVHCSXVYS0FJ1R3ON(ExtSelectionByDecimal value) {
        this.zpartnercustom3EA8AE8AUBVHCSXVYS0FJ1R3ON = value;
    }

    /**
     * zpartnercustom4EA8AE8AUBVHCSXVYS0FJ1R3ON 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByDecimal }
     *     
     */
    public ExtSelectionByDecimal getZpartnercustom4EA8AE8AUBVHCSXVYS0FJ1R3ON() {
        return zpartnercustom4EA8AE8AUBVHCSXVYS0FJ1R3ON;
    }

    /**
     * zpartnercustom4EA8AE8AUBVHCSXVYS0FJ1R3ON 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByDecimal }
     *     
     */
    public void setZpartnercustom4EA8AE8AUBVHCSXVYS0FJ1R3ON(ExtSelectionByDecimal value) {
        this.zpartnercustom4EA8AE8AUBVHCSXVYS0FJ1R3ON = value;
    }

    /**
     * zpartnercustom6EA8AE8AUBVHCSXVYS0FJ1R3ON 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public ExtSelectionByCode getZpartnercustom6EA8AE8AUBVHCSXVYS0FJ1R3ON() {
        return zpartnercustom6EA8AE8AUBVHCSXVYS0FJ1R3ON;
    }

    /**
     * zpartnercustom6EA8AE8AUBVHCSXVYS0FJ1R3ON 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public void setZpartnercustom6EA8AE8AUBVHCSXVYS0FJ1R3ON(ExtSelectionByCode value) {
        this.zpartnercustom6EA8AE8AUBVHCSXVYS0FJ1R3ON = value;
    }

    /**
     * zpartnercustom5EA8AE8AUBVHCSXVYS0FJ1R3ON 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public ExtSelectionByCode getZpartnercustom5EA8AE8AUBVHCSXVYS0FJ1R3ON() {
        return zpartnercustom5EA8AE8AUBVHCSXVYS0FJ1R3ON;
    }

    /**
     * zpartnercustom5EA8AE8AUBVHCSXVYS0FJ1R3ON 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public void setZpartnercustom5EA8AE8AUBVHCSXVYS0FJ1R3ON(ExtSelectionByCode value) {
        this.zpartnercustom5EA8AE8AUBVHCSXVYS0FJ1R3ON = value;
    }

}
