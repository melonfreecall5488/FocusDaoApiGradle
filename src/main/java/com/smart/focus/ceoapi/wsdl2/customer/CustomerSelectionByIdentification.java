
package com.smart.focus.ceoapi.wsdl2.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * CustomerSelectionByIdentification complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerSelectionByIdentification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByInternalID" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByInternalID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByUUID" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCategoryCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByCategoryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBusinessPartnerID" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByBusinessPartnerID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByPartyIdentifierTypeCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByPartyIdentifierTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBusinessPartnerName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByBusinessPartnerName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBusinessPartnerAdditionalName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByBusinessPartnerAdditionalName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySortingFormattedName" type="{http://sap.com/xi/A1S/Global}CustomerSelectionBySortingFormattedName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLifeCycleStatusCode" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByLifeCycleStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerSelectionByIdentification", propOrder = {
        "selectionByInternalID",
        "selectionByUUID",
        "selectionByCategoryCode",
        "selectionByBusinessPartnerID",
        "selectionByPartyIdentifierTypeCode",
        "selectionByBusinessPartnerName",
        "selectionByBusinessPartnerAdditionalName",
        "selectionBySortingFormattedName",
        "selectionByLifeCycleStatusCode",
        "selectionBySearchText"
})
public class CustomerSelectionByIdentification {

    @XmlElement(name = "SelectionByInternalID")
    protected List<CustomerSelectionByInternalID> selectionByInternalID;
    @XmlElement(name = "SelectionByUUID")
    protected List<CustomerSelectionByUUID> selectionByUUID;
    @XmlElement(name = "SelectionByCategoryCode")
    protected List<CustomerSelectionByCategoryCode> selectionByCategoryCode;
    @XmlElement(name = "SelectionByBusinessPartnerID")
    protected List<CustomerSelectionByBusinessPartnerID> selectionByBusinessPartnerID;
    @XmlElement(name = "SelectionByPartyIdentifierTypeCode")
    protected List<CustomerSelectionByPartyIdentifierTypeCode> selectionByPartyIdentifierTypeCode;
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

    /**
     * Gets the value of the selectionByInternalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByInternalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByInternalID().add(newItem);
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
     * This is why there is not a <CODE>set</CODE> method for the selectionByUUID
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByUUID().add(newItem);
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
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByCategoryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByCategoryCode().add(newItem);
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
     * Gets the value of the selectionByBusinessPartnerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByBusinessPartnerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByBusinessPartnerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionByBusinessPartnerID }
     * 
     * 
     */
    public List<CustomerSelectionByBusinessPartnerID> getSelectionByBusinessPartnerID() {
        if (selectionByBusinessPartnerID == null) {
            selectionByBusinessPartnerID = new ArrayList<CustomerSelectionByBusinessPartnerID>();
        }
        return this.selectionByBusinessPartnerID;
    }

    /**
     * Gets the value of the selectionByPartyIdentifierTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByPartyIdentifierTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByPartyIdentifierTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerSelectionByPartyIdentifierTypeCode }
     * 
     * 
     */
    public List<CustomerSelectionByPartyIdentifierTypeCode> getSelectionByPartyIdentifierTypeCode() {
        if (selectionByPartyIdentifierTypeCode == null) {
            selectionByPartyIdentifierTypeCode = new ArrayList<CustomerSelectionByPartyIdentifierTypeCode>();
        }
        return this.selectionByPartyIdentifierTypeCode;
    }

    /**
     * Gets the value of the selectionByBusinessPartnerName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByBusinessPartnerName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByBusinessPartnerName().add(newItem);
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
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByBusinessPartnerAdditionalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByBusinessPartnerAdditionalName().add(newItem);
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
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionBySortingFormattedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionBySortingFormattedName().add(newItem);
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

}
