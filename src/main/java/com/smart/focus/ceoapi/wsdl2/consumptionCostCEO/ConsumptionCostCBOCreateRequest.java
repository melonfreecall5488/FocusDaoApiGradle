
package com.smart.focus.ceoapi.wsdl2.consumptionCostCEO;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ConsumptionCostCBOCreateRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionCostCBOCreateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OwnerID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="SiteID" type="{http://sap.com/xi/AP/Common/GDT}LocationID" minOccurs="0"/&gt;
 *         &lt;element name="CostCenterID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="StatusCD" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="SubstitutionsID" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_EXTENDED_Text" minOccurs="0"/&gt;
 *         &lt;element name="Assortment" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}AssortmentCDCode" minOccurs="0"/&gt;
 *         &lt;element name="ReasonCD" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ReasonCDCode" minOccurs="0"/&gt;
 *         &lt;element name="Item" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOCreateRequestItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionCostCBOCreateRequest", propOrder = {
    "ownerID",
    "siteID",
    "costCenterID",
    "createDate",
    "statusCD",
    "substitutionsID",
    "assortment",
    "reasonCD",
    "item"
})
public class ConsumptionCostCBOCreateRequest {

    @XmlElement(name = "OwnerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerID;
    @XmlElement(name = "SiteID")
    protected LocationID siteID;
    @XmlElement(name = "CostCenterID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String costCenterID;
    @XmlElement(name = "CreateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "StatusCD")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String statusCD;
    @XmlElement(name = "SubstitutionsID")
    protected String substitutionsID;
    @XmlElement(name = "Assortment")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String assortment;
    @XmlElement(name = "ReasonCD")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reasonCD;
    @XmlElement(name = "Item")
    protected List<ConsumptionCostCBOCreateRequestItem> item;

    /**
     * ownerID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * ownerID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerID(String value) {
        this.ownerID = value;
    }

    /**
     * siteID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link LocationID }
     *     
     */
    public LocationID getSiteID() {
        return siteID;
    }

    /**
     * siteID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationID }
     *     
     */
    public void setSiteID(LocationID value) {
        this.siteID = value;
    }

    /**
     * costCenterID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterID() {
        return costCenterID;
    }

    /**
     * costCenterID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterID(String value) {
        this.costCenterID = value;
    }

    /**
     * createDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * createDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * statusCD 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCD() {
        return statusCD;
    }

    /**
     * statusCD 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCD(String value) {
        this.statusCD = value;
    }

    /**
     * substitutionsID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstitutionsID() {
        return substitutionsID;
    }

    /**
     * substitutionsID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstitutionsID(String value) {
        this.substitutionsID = value;
    }

    /**
     * assortment 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssortment() {
        return assortment;
    }

    /**
     * assortment 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssortment(String value) {
        this.assortment = value;
    }

    /**
     * reasonCD 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCD() {
        return reasonCD;
    }

    /**
     * reasonCD 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCD(String value) {
        this.reasonCD = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOCreateRequestItem }
     * 
     * 
     */
    public List<ConsumptionCostCBOCreateRequestItem> getItem() {
        if (item == null) {
            item = new ArrayList<ConsumptionCostCBOCreateRequestItem>();
        }
        return this.item;
    }

}
