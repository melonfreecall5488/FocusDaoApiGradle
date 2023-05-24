
package com.smart.focus.ceoapi.wsdl2.consumptionCostCEO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>ConsumptionCostCBOCreateRequestItem complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionCostCBOCreateRequestItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentItemID" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *         &lt;element name="ProductDesc" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="StockID" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockID" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDt" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_EXTENDED_Text" minOccurs="0"/&gt;
 *         &lt;element name="LogisticsAreaID" type="{http://sap.com/xi/AP/Common/GDT}LogisticsAreaID" minOccurs="0"/&gt;
 *         &lt;element name="ProductQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="LotNo" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_EXTENDED_Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionCostCBOCreateRequestItem", propOrder = {
    "itemID",
    "productID",
    "productDesc",
    "stockID",
    "expirationDt",
    "logisticsAreaID",
    "productQuantity",
    "lotNo"
})
public class ConsumptionCostCBOCreateRequestItem {

    @XmlElement(name = "ItemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemID;
    @XmlElement(name = "ProductID")
    protected ProductID productID;
    @XmlElement(name = "ProductDesc")
    protected SHORTDescription productDesc;
    @XmlElement(name = "StockID")
    protected IdentifiedStockID stockID;
    @XmlElement(name = "ExpirationDt")
    protected String expirationDt;
    @XmlElement(name = "LogisticsAreaID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String logisticsAreaID;
    @XmlElement(name = "ProductQuantity")
    protected Quantity productQuantity;
    @XmlElement(name = "LotNo")
    protected String lotNo;

    /**
     * itemID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * itemID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * productID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ProductID }
     *     
     */
    public ProductID getProductID() {
        return productID;
    }

    /**
     * productID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductID }
     *     
     */
    public void setProductID(ProductID value) {
        this.productID = value;
    }

    /**
     * productDesc 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SHORTDescription }
     *     
     */
    public SHORTDescription getProductDesc() {
        return productDesc;
    }

    /**
     * productDesc 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SHORTDescription }
     *     
     */
    public void setProductDesc(SHORTDescription value) {
        this.productDesc = value;
    }

    /**
     * stockID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedStockID }
     *     
     */
    public IdentifiedStockID getStockID() {
        return stockID;
    }

    /**
     * stockID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedStockID }
     *     
     */
    public void setStockID(IdentifiedStockID value) {
        this.stockID = value;
    }

    /**
     * expirationDt 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDt() {
        return expirationDt;
    }

    /**
     * expirationDt 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDt(String value) {
        this.expirationDt = value;
    }

    /**
     * logisticsAreaID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsAreaID() {
        return logisticsAreaID;
    }

    /**
     * logisticsAreaID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsAreaID(String value) {
        this.logisticsAreaID = value;
    }

    /**
     * productQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * productQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setProductQuantity(Quantity value) {
        this.productQuantity = value;
    }

    /**
     * lotNo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotNo() {
        return lotNo;
    }

    /**
     * lotNo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotNo(String value) {
        this.lotNo = value;
    }

}
