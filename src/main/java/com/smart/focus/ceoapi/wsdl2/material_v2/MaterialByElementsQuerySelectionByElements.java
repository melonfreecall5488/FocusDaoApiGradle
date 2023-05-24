
package com.smart.focus.ceoapi.wsdl2.material_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MaterialByElementsQuerySelectionByElements complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsQuerySelectionByElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByDescription" type="{http://sap.com/xi/A1S/Global}MaterialByElementsQuerySelectionByDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByInternalID" type="{http://sap.com/xi/A1S/Global}MaterialByElementsQuerySelectionByInternalID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByIdentifiedStockTypeCode" type="{http://sap.com/xi/A1S/Global}MaterialByElementsQuerySelectionByIdentifiedStockTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySearchText" type="{http://sap.com/xi/AP/Common/GDT}SearchText" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCreatedSinceDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLastChangeSinceDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8CE86B5E68B2C372"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8CE871691C1AA5B9"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8CE8773AD1AE2718"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8CE87BA197308808"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8CE87F819970C8D2"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8CE883089321C997"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8CE8861EA2F78A3E"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8CE88A42F87ACB78"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8CE88DC18FEB4C1C"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8CE891DD2A5B4CEE"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8CE89601EDA58E0F"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8CE89A28C8AEEF09"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EDD8FF88D0A875D7ED9"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EA8ACE625B8BBCF"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EA8B53E1DAB3D1D"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EA8BD671F323DE4"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EA8C127E43CBEB0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EA8C3E5A80B3F03"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EA8C67E4D717F5A"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsQuerySelectionByElements", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "selectionByDescription",
    "selectionByInternalID",
    "selectionByIdentifiedStockTypeCode",
    "selectionBySearchText",
    "selectionByCreatedSinceDateTime",
    "selectionByLastChangeSinceDateTime",
    "zadcodeynB7AD952QPQ6NZ0DX95SWUJ8PG",
    "zhscodeB7AD952QPQ6NZ0DX95SWUJ8PG",
    "zsetynB7AD952QPQ6NZ0DX95SWUJ8PG",
    "zbarcodeB7AD952QPQ6NZ0DX95SWUJ8PG",
    "zpobundleB7AD952QPQ6NZ0DX95SWUJ8PG",
    "zitemgrp3B7AD952QPQ6NZ0DX95SWUJ8PG",
    "zurlB7AD952QPQ6NZ0DX95SWUJ8PG",
    "zitemgrp4B7AD952QPQ6NZ0DX95SWUJ8PG",
    "zitempriceB7AD952QPQ6NZ0DX95SWUJ8PG",
    "zvolumeB7AD952QPQ6NZ0DX95SWUJ8PG",
    "zeperidB7AD952QPQ6NZ0DX95SWUJ8PG",
    "zedicodeB7AD952QPQ6NZ0DX95SWUJ8PG",
    "zProductCategoryNameB7AD952QPQ6NZ0DX95SWUJ8PG",
    "zcustom1B7AD952QPQ6NZ0DX95SWUJ8PG",
    "zcustom2B7AD952QPQ6NZ0DX95SWUJ8PG",
    "zcustom3B7AD952QPQ6NZ0DX95SWUJ8PG",
    "zcustom4B7AD952QPQ6NZ0DX95SWUJ8PG",
    "zcustom5B7AD952QPQ6NZ0DX95SWUJ8PG",
    "zcustom6B7AD952QPQ6NZ0DX95SWUJ8PG"
})
public class MaterialByElementsQuerySelectionByElements {

    @XmlElement(name = "SelectionByDescription")
    protected List<MaterialByElementsQuerySelectionByDescription> selectionByDescription;
    @XmlElement(name = "SelectionByInternalID")
    protected List<MaterialByElementsQuerySelectionByInternalID> selectionByInternalID;
    @XmlElement(name = "SelectionByIdentifiedStockTypeCode")
    protected List<MaterialByElementsQuerySelectionByIdentifiedStockTypeCode> selectionByIdentifiedStockTypeCode;
    @XmlElement(name = "SelectionBySearchText")
    protected String selectionBySearchText;
    @XmlElement(name = "SelectionByCreatedSinceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar selectionByCreatedSinceDateTime;
    @XmlElement(name = "SelectionByLastChangeSinceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar selectionByLastChangeSinceDateTime;
    @XmlElement(name = "Zadcodeyn_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByCode zadcodeynB7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zhscode_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByText zhscodeB7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zsetyn_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByCode zsetynB7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zbarcode_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByText zbarcodeB7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zpobundle_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByQuantity zpobundleB7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zitemgrp3_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByCode zitemgrp3B7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zurl_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByURI zurlB7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zitemgrp4_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByCode zitemgrp4B7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zitemprice_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByAmount zitempriceB7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zvolume_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByQuantity zvolumeB7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zeperid_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByDecimal zeperidB7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zedicode_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByText zedicodeB7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "ZProductCategoryName_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByText zProductCategoryNameB7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zcustom1_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByText zcustom1B7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zcustom2_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByText zcustom2B7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zcustom3_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByDecimal zcustom3B7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zcustom4_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByDecimal zcustom4B7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zcustom5_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByCode zcustom5B7AD952QPQ6NZ0DX95SWUJ8PG;
    @XmlElement(name = "Zcustom6_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected ExtSelectionByCode zcustom6B7AD952QPQ6NZ0DX95SWUJ8PG;

    /**
     * Gets the value of the selectionByDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsQuerySelectionByDescription }
     * 
     * 
     */
    public List<MaterialByElementsQuerySelectionByDescription> getSelectionByDescription() {
        if (selectionByDescription == null) {
            selectionByDescription = new ArrayList<MaterialByElementsQuerySelectionByDescription>();
        }
        return this.selectionByDescription;
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
     * {@link MaterialByElementsQuerySelectionByInternalID }
     * 
     * 
     */
    public List<MaterialByElementsQuerySelectionByInternalID> getSelectionByInternalID() {
        if (selectionByInternalID == null) {
            selectionByInternalID = new ArrayList<MaterialByElementsQuerySelectionByInternalID>();
        }
        return this.selectionByInternalID;
    }

    /**
     * Gets the value of the selectionByIdentifiedStockTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByIdentifiedStockTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByIdentifiedStockTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsQuerySelectionByIdentifiedStockTypeCode }
     * 
     * 
     */
    public List<MaterialByElementsQuerySelectionByIdentifiedStockTypeCode> getSelectionByIdentifiedStockTypeCode() {
        if (selectionByIdentifiedStockTypeCode == null) {
            selectionByIdentifiedStockTypeCode = new ArrayList<MaterialByElementsQuerySelectionByIdentifiedStockTypeCode>();
        }
        return this.selectionByIdentifiedStockTypeCode;
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
     * zadcodeynB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public ExtSelectionByCode getZadcodeynB7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zadcodeynB7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zadcodeynB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public void setZadcodeynB7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByCode value) {
        this.zadcodeynB7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zhscodeB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByText }
     *     
     */
    public ExtSelectionByText getZhscodeB7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zhscodeB7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zhscodeB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByText }
     *     
     */
    public void setZhscodeB7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByText value) {
        this.zhscodeB7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zsetynB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public ExtSelectionByCode getZsetynB7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zsetynB7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zsetynB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public void setZsetynB7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByCode value) {
        this.zsetynB7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zbarcodeB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByText }
     *     
     */
    public ExtSelectionByText getZbarcodeB7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zbarcodeB7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zbarcodeB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByText }
     *     
     */
    public void setZbarcodeB7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByText value) {
        this.zbarcodeB7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zpobundleB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByQuantity }
     *     
     */
    public ExtSelectionByQuantity getZpobundleB7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zpobundleB7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zpobundleB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByQuantity }
     *     
     */
    public void setZpobundleB7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByQuantity value) {
        this.zpobundleB7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zitemgrp3B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public ExtSelectionByCode getZitemgrp3B7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zitemgrp3B7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zitemgrp3B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public void setZitemgrp3B7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByCode value) {
        this.zitemgrp3B7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zurlB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByURI }
     *     
     */
    public ExtSelectionByURI getZurlB7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zurlB7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zurlB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByURI }
     *     
     */
    public void setZurlB7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByURI value) {
        this.zurlB7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zitemgrp4B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public ExtSelectionByCode getZitemgrp4B7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zitemgrp4B7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zitemgrp4B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public void setZitemgrp4B7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByCode value) {
        this.zitemgrp4B7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zitempriceB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByAmount }
     *     
     */
    public ExtSelectionByAmount getZitempriceB7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zitempriceB7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zitempriceB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByAmount }
     *     
     */
    public void setZitempriceB7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByAmount value) {
        this.zitempriceB7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zvolumeB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByQuantity }
     *     
     */
    public ExtSelectionByQuantity getZvolumeB7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zvolumeB7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zvolumeB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByQuantity }
     *     
     */
    public void setZvolumeB7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByQuantity value) {
        this.zvolumeB7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zeperidB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByDecimal }
     *     
     */
    public ExtSelectionByDecimal getZeperidB7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zeperidB7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zeperidB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByDecimal }
     *     
     */
    public void setZeperidB7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByDecimal value) {
        this.zeperidB7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zedicodeB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByText }
     *     
     */
    public ExtSelectionByText getZedicodeB7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zedicodeB7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zedicodeB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByText }
     *     
     */
    public void setZedicodeB7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByText value) {
        this.zedicodeB7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zProductCategoryNameB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByText }
     *     
     */
    public ExtSelectionByText getZProductCategoryNameB7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zProductCategoryNameB7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zProductCategoryNameB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByText }
     *     
     */
    public void setZProductCategoryNameB7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByText value) {
        this.zProductCategoryNameB7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zcustom1B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByText }
     *     
     */
    public ExtSelectionByText getZcustom1B7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zcustom1B7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zcustom1B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByText }
     *     
     */
    public void setZcustom1B7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByText value) {
        this.zcustom1B7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zcustom2B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByText }
     *     
     */
    public ExtSelectionByText getZcustom2B7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zcustom2B7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zcustom2B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByText }
     *     
     */
    public void setZcustom2B7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByText value) {
        this.zcustom2B7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zcustom3B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByDecimal }
     *     
     */
    public ExtSelectionByDecimal getZcustom3B7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zcustom3B7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zcustom3B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByDecimal }
     *     
     */
    public void setZcustom3B7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByDecimal value) {
        this.zcustom3B7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zcustom4B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByDecimal }
     *     
     */
    public ExtSelectionByDecimal getZcustom4B7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zcustom4B7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zcustom4B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByDecimal }
     *     
     */
    public void setZcustom4B7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByDecimal value) {
        this.zcustom4B7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zcustom5B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public ExtSelectionByCode getZcustom5B7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zcustom5B7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zcustom5B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public void setZcustom5B7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByCode value) {
        this.zcustom5B7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

    /**
     * zcustom6B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public ExtSelectionByCode getZcustom6B7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zcustom6B7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zcustom6B7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtSelectionByCode }
     *     
     */
    public void setZcustom6B7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByCode value) {
        this.zcustom6B7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

}
