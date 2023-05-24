
package com.smart.focus.ceoapi.wsdl2.goodsMovementCEO;

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
 * <p>GoodsMovementCBOUpdateRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GoodsMovementCBOUpdateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SAP_UUID" type="{http://sap.com/xi/Common/DataTypes}UUID" minOccurs="0"/&gt;
 *         &lt;element name="OwnerID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="TransitNO" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_EXTENDED_Text" minOccurs="0"/&gt;
 *         &lt;element name="ShopID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="ShopNM" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_EXTENDED_Text" minOccurs="0"/&gt;
 *         &lt;element name="SiteID" type="{http://sap.com/xi/AP/Common/GDT}LocationID" minOccurs="0"/&gt;
 *         &lt;element name="CreateDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="ExcuteDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="SourceAreaID_S" type="{http://sap.com/xi/AP/Common/GDT}LogisticsAreaID" minOccurs="0"/&gt;
 *         &lt;element name="TargetAreaID_S" type="{http://sap.com/xi/AP/Common/GDT}LogisticsAreaID" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="imsiUUID" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_EXTENDED_Text" minOccurs="0"/&gt;
 *         &lt;element name="StatusCD" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="BO_MDR" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="Item" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOUpdateRequestItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ItemListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsMovementCBOUpdateRequest", propOrder = {
    "sapuuid",
    "ownerID",
    "transitNO",
    "shopID",
    "shopNM",
    "siteID",
    "createDate",
    "excuteDate",
    "sourceAreaIDS",
    "targetAreaIDS",
    "confirmationID",
    "imsiUUID",
    "statusCD",
    "bomdr",
    "item"
})
public class GoodsMovementCBOUpdateRequest {

    @XmlElement(name = "SAP_UUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sapuuid;
    @XmlElement(name = "OwnerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerID;
    @XmlElement(name = "TransitNO")
    protected String transitNO;
    @XmlElement(name = "ShopID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shopID;
    @XmlElement(name = "ShopNM")
    protected String shopNM;
    @XmlElement(name = "SiteID")
    protected LocationID siteID;
    @XmlElement(name = "CreateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDate;
    @XmlElement(name = "ExcuteDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar excuteDate;
    @XmlElement(name = "SourceAreaID_S")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sourceAreaIDS;
    @XmlElement(name = "TargetAreaID_S")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String targetAreaIDS;
    @XmlElement(name = "ConfirmationID")
    protected BusinessTransactionDocumentID confirmationID;
    protected String imsiUUID;
    @XmlElement(name = "StatusCD")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String statusCD;
    @XmlElement(name = "BO_MDR")
    protected Boolean bomdr;
    @XmlElement(name = "Item")
    protected List<GoodsMovementCBOUpdateRequestItem> item;
    @XmlAttribute(name = "ItemListCompleteTransmissionIndicator")
    protected Boolean itemListCompleteTransmissionIndicator;

    /**
     * sapuuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPUUID() {
        return sapuuid;
    }

    /**
     * sapuuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPUUID(String value) {
        this.sapuuid = value;
    }

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
     * transitNO 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitNO() {
        return transitNO;
    }

    /**
     * transitNO 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitNO(String value) {
        this.transitNO = value;
    }

    /**
     * shopID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopID() {
        return shopID;
    }

    /**
     * shopID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopID(String value) {
        this.shopID = value;
    }

    /**
     * shopNM 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopNM() {
        return shopNM;
    }

    /**
     * shopNM 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopNM(String value) {
        this.shopNM = value;
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
     * excuteDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExcuteDate() {
        return excuteDate;
    }

    /**
     * excuteDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExcuteDate(XMLGregorianCalendar value) {
        this.excuteDate = value;
    }

    /**
     * sourceAreaIDS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAreaIDS() {
        return sourceAreaIDS;
    }

    /**
     * sourceAreaIDS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAreaIDS(String value) {
        this.sourceAreaIDS = value;
    }

    /**
     * targetAreaIDS 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetAreaIDS() {
        return targetAreaIDS;
    }

    /**
     * targetAreaIDS 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetAreaIDS(String value) {
        this.targetAreaIDS = value;
    }

    /**
     * confirmationID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public BusinessTransactionDocumentID getConfirmationID() {
        return confirmationID;
    }

    /**
     * confirmationID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public void setConfirmationID(BusinessTransactionDocumentID value) {
        this.confirmationID = value;
    }

    /**
     * imsiUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImsiUUID() {
        return imsiUUID;
    }

    /**
     * imsiUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImsiUUID(String value) {
        this.imsiUUID = value;
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
     * bomdr 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBOMDR() {
        return bomdr;
    }

    /**
     * bomdr 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBOMDR(Boolean value) {
        this.bomdr = value;
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
     * {@link GoodsMovementCBOUpdateRequestItem }
     * 
     * 
     */
    public List<GoodsMovementCBOUpdateRequestItem> getItem() {
        if (item == null) {
            item = new ArrayList<GoodsMovementCBOUpdateRequestItem>();
        }
        return this.item;
    }

    /**
     * itemListCompleteTransmissionIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isItemListCompleteTransmissionIndicator() {
        return itemListCompleteTransmissionIndicator;
    }

    /**
     * itemListCompleteTransmissionIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setItemListCompleteTransmissionIndicator(Boolean value) {
        this.itemListCompleteTransmissionIndicator = value;
    }

}
