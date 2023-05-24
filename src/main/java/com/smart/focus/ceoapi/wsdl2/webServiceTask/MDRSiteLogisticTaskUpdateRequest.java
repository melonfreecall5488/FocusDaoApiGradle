
package com.smart.focus.ceoapi.wsdl2.webServiceTask;

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
 * <p>MDR_SiteLogisticTaskUpdateRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MDR_SiteLogisticTaskUpdateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SAP_UUID" type="{http://sap.com/xi/Common/DataTypes}UUID" minOccurs="0"/&gt;
 *         &lt;element name="TNO_USTRASales" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="TNO_USTRAOrd" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="TNO_Sales" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="TCD_Status" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}SiteLogisticTaskStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="TCD_DISTBROUT" type="{http://sap.com/xi/AP/Common/GDT}DistributionChannelCode" minOccurs="0"/&gt;
 *         &lt;element name="TDT_Sales" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="TDT_Created" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="TFG_DLV" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Note" minOccurs="0"/&gt;
 *         &lt;element name="TCD_CUST" type="{http://sap.com/xi/AP/Common/GDT}PartyID" minOccurs="0"/&gt;
 *         &lt;element name="TMD_Indicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DetailTable" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskUpdateRequestDetailTable" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="DetailTableListCompleteTransmissionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDR_SiteLogisticTaskUpdateRequest", propOrder = {
    "sapuuid",
    "tnoustraSales",
    "tnoustraOrd",
    "tnoSales",
    "tcdStatus",
    "tcddistbrout",
    "tdtSales",
    "tdtCreated",
    "tfgdlv",
    "tcdcust",
    "tmdIndicator",
    "detailTable"
})
public class MDRSiteLogisticTaskUpdateRequest {

    @XmlElement(name = "SAP_UUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sapuuid;
    @XmlElement(name = "TNO_USTRASales")
    protected String tnoustraSales;
    @XmlElement(name = "TNO_USTRAOrd")
    protected String tnoustraOrd;
    @XmlElement(name = "TNO_Sales")
    protected BusinessTransactionDocumentID tnoSales;
    @XmlElement(name = "TCD_Status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tcdStatus;
    @XmlElement(name = "TCD_DISTBROUT")
    protected DistributionChannelCode tcddistbrout;
    @XmlElement(name = "TDT_Sales")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tdtSales;
    @XmlElement(name = "TDT_Created")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tdtCreated;
    @XmlElement(name = "TFG_DLV")
    protected String tfgdlv;
    @XmlElement(name = "TCD_CUST")
    protected PartyID tcdcust;
    @XmlElement(name = "TMD_Indicator")
    protected Boolean tmdIndicator;
    @XmlElement(name = "DetailTable")
    protected List<MDRSiteLogisticTaskUpdateRequestDetailTable> detailTable;
    @XmlAttribute(name = "DetailTableListCompleteTransmissionIndicator")
    protected Boolean detailTableListCompleteTransmissionIndicator;

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
     * tnoustraSales 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNOUSTRASales() {
        return tnoustraSales;
    }

    /**
     * tnoustraSales 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNOUSTRASales(String value) {
        this.tnoustraSales = value;
    }

    /**
     * tnoustraOrd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNOUSTRAOrd() {
        return tnoustraOrd;
    }

    /**
     * tnoustraOrd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNOUSTRAOrd(String value) {
        this.tnoustraOrd = value;
    }

    /**
     * tnoSales 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public BusinessTransactionDocumentID getTNOSales() {
        return tnoSales;
    }

    /**
     * tnoSales 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public void setTNOSales(BusinessTransactionDocumentID value) {
        this.tnoSales = value;
    }

    /**
     * tcdStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTCDStatus() {
        return tcdStatus;
    }

    /**
     * tcdStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTCDStatus(String value) {
        this.tcdStatus = value;
    }

    /**
     * tcddistbrout 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelCode }
     *     
     */
    public DistributionChannelCode getTCDDISTBROUT() {
        return tcddistbrout;
    }

    /**
     * tcddistbrout 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelCode }
     *     
     */
    public void setTCDDISTBROUT(DistributionChannelCode value) {
        this.tcddistbrout = value;
    }

    /**
     * tdtSales 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDTSales() {
        return tdtSales;
    }

    /**
     * tdtSales 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDTSales(XMLGregorianCalendar value) {
        this.tdtSales = value;
    }

    /**
     * tdtCreated 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTDTCreated() {
        return tdtCreated;
    }

    /**
     * tdtCreated 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTDTCreated(XMLGregorianCalendar value) {
        this.tdtCreated = value;
    }

    /**
     * tfgdlv 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTFGDLV() {
        return tfgdlv;
    }

    /**
     * tfgdlv 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTFGDLV(String value) {
        this.tfgdlv = value;
    }

    /**
     * tcdcust 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PartyID }
     *     
     */
    public PartyID getTCDCUST() {
        return tcdcust;
    }

    /**
     * tcdcust 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyID }
     *     
     */
    public void setTCDCUST(PartyID value) {
        this.tcdcust = value;
    }

    /**
     * tmdIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTMDIndicator() {
        return tmdIndicator;
    }

    /**
     * tmdIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTMDIndicator(Boolean value) {
        this.tmdIndicator = value;
    }

    /**
     * Gets the value of the detailTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRSiteLogisticTaskUpdateRequestDetailTable }
     * 
     * 
     */
    public List<MDRSiteLogisticTaskUpdateRequestDetailTable> getDetailTable() {
        if (detailTable == null) {
            detailTable = new ArrayList<MDRSiteLogisticTaskUpdateRequestDetailTable>();
        }
        return this.detailTable;
    }

    /**
     * detailTableListCompleteTransmissionIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetailTableListCompleteTransmissionIndicator() {
        return detailTableListCompleteTransmissionIndicator;
    }

    /**
     * detailTableListCompleteTransmissionIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetailTableListCompleteTransmissionIndicator(Boolean value) {
        this.detailTableListCompleteTransmissionIndicator = value;
    }

}
