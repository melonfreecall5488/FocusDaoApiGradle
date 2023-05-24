
package com.smart.focus.ceoapi.wsdl2.webServiceTask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>MDR_SiteLogisticTaskCreateRequestDetailTable complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MDR_SiteLogisticTaskCreateRequestDetailTable"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TNO_SalesLine" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemID" minOccurs="0"/&gt;
 *         &lt;element name="TCD_Item" type="{http://sap.com/xi/AP/Common/GDT}NOCONVERSION_ProductID" minOccurs="0"/&gt;
 *         &lt;element name="TNM_Item" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="TNO_IdentiStock" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockID" minOccurs="0"/&gt;
 *         &lt;element name="TQT_Sales" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="TRQ_Sales" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="TNO_TaskID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="TNO_LogiArea" type="{http://sap.com/xi/AP/Common/GDT}LogisticsAreaID" minOccurs="0"/&gt;
 *         &lt;element name="TRS_FailureReason" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Note" minOccurs="0"/&gt;
 *         &lt;element name="TIn_Split" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="TNO_ShipmentID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDR_SiteLogisticTaskCreateRequestDetailTable", propOrder = {
    "tnoSalesLine",
    "tcdItem",
    "tnmItem",
    "tnoIdentiStock",
    "tqtSales",
    "trqSales",
    "tnoTaskID",
    "tnoLogiArea",
    "trsFailureReason",
    "tInSplit",
    "tnoShipmentID"
})
public class MDRSiteLogisticTaskCreateRequestDetailTable {

    @XmlElement(name = "TNO_SalesLine")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tnoSalesLine;
    @XmlElement(name = "TCD_Item")
    protected NOCONVERSIONProductID tcdItem;
    @XmlElement(name = "TNM_Item")
    protected SHORTDescription tnmItem;
    @XmlElement(name = "TNO_IdentiStock")
    protected IdentifiedStockID tnoIdentiStock;
    @XmlElement(name = "TQT_Sales")
    protected Quantity tqtSales;
    @XmlElement(name = "TRQ_Sales")
    protected Quantity trqSales;
    @XmlElement(name = "TNO_TaskID")
    protected BusinessTransactionDocumentID tnoTaskID;
    @XmlElement(name = "TNO_LogiArea")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tnoLogiArea;
    @XmlElement(name = "TRS_FailureReason")
    protected String trsFailureReason;
    @XmlElement(name = "TIn_Split")
    protected Boolean tInSplit;
    @XmlElement(name = "TNO_ShipmentID")
    protected BusinessTransactionDocumentID tnoShipmentID;

    /**
     * tnoSalesLine 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNOSalesLine() {
        return tnoSalesLine;
    }

    /**
     * tnoSalesLine 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNOSalesLine(String value) {
        this.tnoSalesLine = value;
    }

    /**
     * tcdItem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link NOCONVERSIONProductID }
     *     
     */
    public NOCONVERSIONProductID getTCDItem() {
        return tcdItem;
    }

    /**
     * tcdItem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link NOCONVERSIONProductID }
     *     
     */
    public void setTCDItem(NOCONVERSIONProductID value) {
        this.tcdItem = value;
    }

    /**
     * tnmItem 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SHORTDescription }
     *     
     */
    public SHORTDescription getTNMItem() {
        return tnmItem;
    }

    /**
     * tnmItem 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SHORTDescription }
     *     
     */
    public void setTNMItem(SHORTDescription value) {
        this.tnmItem = value;
    }

    /**
     * tnoIdentiStock 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedStockID }
     *     
     */
    public IdentifiedStockID getTNOIdentiStock() {
        return tnoIdentiStock;
    }

    /**
     * tnoIdentiStock 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedStockID }
     *     
     */
    public void setTNOIdentiStock(IdentifiedStockID value) {
        this.tnoIdentiStock = value;
    }

    /**
     * tqtSales 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getTQTSales() {
        return tqtSales;
    }

    /**
     * tqtSales 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setTQTSales(Quantity value) {
        this.tqtSales = value;
    }

    /**
     * trqSales 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getTRQSales() {
        return trqSales;
    }

    /**
     * trqSales 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setTRQSales(Quantity value) {
        this.trqSales = value;
    }

    /**
     * tnoTaskID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public BusinessTransactionDocumentID getTNOTaskID() {
        return tnoTaskID;
    }

    /**
     * tnoTaskID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public void setTNOTaskID(BusinessTransactionDocumentID value) {
        this.tnoTaskID = value;
    }

    /**
     * tnoLogiArea 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNOLogiArea() {
        return tnoLogiArea;
    }

    /**
     * tnoLogiArea 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNOLogiArea(String value) {
        this.tnoLogiArea = value;
    }

    /**
     * trsFailureReason 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRSFailureReason() {
        return trsFailureReason;
    }

    /**
     * trsFailureReason 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRSFailureReason(String value) {
        this.trsFailureReason = value;
    }

    /**
     * tInSplit 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTInSplit() {
        return tInSplit;
    }

    /**
     * tInSplit 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTInSplit(Boolean value) {
        this.tInSplit = value;
    }

    /**
     * tnoShipmentID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public BusinessTransactionDocumentID getTNOShipmentID() {
        return tnoShipmentID;
    }

    /**
     * tnoShipmentID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessTransactionDocumentID }
     *     
     */
    public void setTNOShipmentID(BusinessTransactionDocumentID value) {
        this.tnoShipmentID = value;
    }

}
