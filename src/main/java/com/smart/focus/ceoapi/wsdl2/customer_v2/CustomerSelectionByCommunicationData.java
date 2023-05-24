
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerSelectionByCommunicationData complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerSelectionByCommunicationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByNormalisedTelephoneNumber" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByNormalisedTelephoneNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByNormalisedFacsimileNumber" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByNormalisedFacsimileNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByEmailURI" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByEmailURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByInternalID" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByInternalID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByUUID" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCategoryCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByCategoryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBusinessCharacterCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByBusinessCharacterCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBusinessPartnerName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByBusinessPartnerName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBusinessPartnerAdditionalName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByBusinessPartnerAdditionalName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySortingFormattedName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionBySortingFormattedName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLifeCycleStatusCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByLifeCycleStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySearchText" type="{http://sap.com/xi/AP/Common/GDT}SearchText" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA5D0B72127618"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA6A588A8AB86E"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA73AA7A49BA97"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA80B16EE31C5E"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA8AAE957D7E47"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8FC0DDA9365C687F"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSelectionByCommunicationData", propOrder = {
    "selectionByNormalisedTelephoneNumber",
    "selectionByNormalisedFacsimileNumber",
    "selectionByEmailURI",
    "selectionByInternalID",
    "selectionByUUID",
    "selectionByCategoryCode",
    "selectionByBusinessCharacterCode",
    "selectionByBusinessPartnerName",
    "selectionByBusinessPartnerAdditionalName",
    "selectionBySortingFormattedName",
    "selectionByLifeCycleStatusCode",
    "selectionBySearchText",
    "zpartnercustom1EA8AE8AUBVHCSXVYS0FJ1R3ON",
    "zpartnercustom2EA8AE8AUBVHCSXVYS0FJ1R3ON",
    "zpartnercustom3EA8AE8AUBVHCSXVYS0FJ1R3ON",
    "zpartnercustom4EA8AE8AUBVHCSXVYS0FJ1R3ON",
    "zpartnercustom6EA8AE8AUBVHCSXVYS0FJ1R3ON",
    "zpartnercustom5EA8AE8AUBVHCSXVYS0FJ1R3ON"
})
public class CustomerSelectionByCommunicationData {

    @XmlElement(name = "SelectionByNormalisedTelephoneNumber")
    protected List<CustomerSelectionByNormalisedTelephoneNumber> selectionByNormalisedTelephoneNumber;
    @XmlElement(name = "SelectionByNormalisedFacsimileNumber")
    protected List<CustomerSelectionByNormalisedFacsimileNumber> selectionByNormalisedFacsimileNumber;
    @XmlElement(name = "SelectionByEmailURI")
    protected List<CustomerSelectionByEmailURI> selectionByEmailURI;
    @XmlElement(name = "SelectionByInternalID")
    protected List<CustomerSelectionByInternalID> selectionByInternalID;
    @XmlElement(name = "SelectionByUUID")
    protected List<CustomerSelectionByUUID> selectionByUUID;
    @XmlElement(name = "SelectionByCategoryCode")
    protected List<CustomerSelectionByCategoryCode> selectionByCategoryCode;
    @XmlElement(name = "SelectionByBusinessCharacterCode")
    protected List<CustomerSelectionByBusinessCharacterCode> selectionByBusinessCharacterCode;
    @XmlElement(name = "SelectionByBusinessPartnerName")
    protected List<CustomerSelectionByBusinessPartnerName> selectionByBusinessPartnerName;
    @XmlElement(name = "SelectionByBusinessPartnerAdditionalName")
    protected List<CustomerSelectionByBusinessPartnerAdditionalName> selectionByBusinessPartnerAdditionalName;
    @XmlElement(name = "SelectionBySortingFormattedName")
    protected List<CustomerSelectionBySortingFormattedName> selectionBySortingFormattedName;
    @XmlElement(name = "SelectionByLifeCycleStatusCode")
    protected List<CustomerSelectionByLifeCycleStatusCode> selectionByLifeCycleStatusCode;
    @XmlElement(name = "SelectionBySearchText")
    protected String selectionBySearchText;
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
     * Gets the value of the selectionByNormalisedTelephoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByNormalisedTelephoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByNormalisedTelephoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionByNormalisedTelephoneNumber }
     * 
     * 
     */
    public List<CustomerSelectionByNormalisedTelephoneNumber> getSelectionByNormalisedTelephoneNumber() {
        if (selectionByNormalisedTelephoneNumber == null) {
            selectionByNormalisedTelephoneNumber = new ArrayList<CustomerSelectionByNormalisedTelephoneNumber>();
        }
        return this.selectionByNormalisedTelephoneNumber;
    }

    /**
     * Gets the value of the selectionByNormalisedFacsimileNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByNormalisedFacsimileNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByNormalisedFacsimileNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionByNormalisedFacsimileNumber }
     * 
     * 
     */
    public List<CustomerSelectionByNormalisedFacsimileNumber> getSelectionByNormalisedFacsimileNumber() {
        if (selectionByNormalisedFacsimileNumber == null) {
            selectionByNormalisedFacsimileNumber = new ArrayList<CustomerSelectionByNormalisedFacsimileNumber>();
        }
        return this.selectionByNormalisedFacsimileNumber;
    }

    /**
     * Gets the value of the selectionByEmailURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByEmailURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByEmailURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionByEmailURI }
     * 
     * 
     */
    public List<CustomerSelectionByEmailURI> getSelectionByEmailURI() {
        if (selectionByEmailURI == null) {
            selectionByEmailURI = new ArrayList<CustomerSelectionByEmailURI>();
        }
        return this.selectionByEmailURI;
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
     * Gets the value of the selectionByBusinessCharacterCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByBusinessCharacterCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByBusinessCharacterCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionByBusinessCharacterCode }
     * 
     * 
     */
    public List<CustomerSelectionByBusinessCharacterCode> getSelectionByBusinessCharacterCode() {
        if (selectionByBusinessCharacterCode == null) {
            selectionByBusinessCharacterCode = new ArrayList<CustomerSelectionByBusinessCharacterCode>();
        }
        return this.selectionByBusinessCharacterCode;
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
