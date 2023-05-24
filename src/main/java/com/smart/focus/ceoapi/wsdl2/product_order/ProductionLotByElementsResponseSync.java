
package com.smart.focus.ceoapi.wsdl2.product_order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * ProductionLotByElementsResponse_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotByElementsResponse_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductionLotID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="ProductionOrderID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="ProductionOrderUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ProductionOrderStatus" type="{http://sap.com/xi/AP/LogisticsExecution/Global}LogisticsOrderStatus" minOccurs="0"/&gt;
 *         &lt;element name="ProductionLotUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ProductionLotStatus" type="{http://sap.com/xi/A1S/Global}ProductionLotStatus" minOccurs="0"/&gt;
 *         &lt;element name="MainOutputProductSiteID" type="{http://sap.com/xi/AP/Common/GDT}SupplyPlanningAreaID" minOccurs="0"/&gt;
 *         &lt;element name="MainOutputProduct" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *         &lt;element name="ProductionStartDate" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ProductionEndDate" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationGroup" type="{http://sap.com/xi/A1S/Global}ProductionLotConfirmationGroup" maxOccurs="unbounded"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B}Ext00163EA977381EDC8B95E0E2C19F00B6"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B}Ext00163EA977381EDC8DC34089C30E8286"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotByElementsResponse_sync", propOrder = {
        "productionLotID",
        "productionOrderID",
        "productionOrderUUID",
        "productionOrderStatus",
        "productionLotUUID",
        "productionLotStatus",
        "mainOutputProductSiteID",
        "mainOutputProduct",
        "productionStartDate",
        "productionEndDate",
        "confirmationGroup",
        "zProductionLotStatDate",
        "zResourceCostCentreName"
})
public class ProductionLotByElementsResponseSync {

    @XmlElement(name = "ProductionLotID")
    protected BusinessTransactionDocumentID productionLotID;
    @XmlElement(name = "ProductionOrderID")
    protected BusinessTransactionDocumentID productionOrderID;
    @XmlElement(name = "ProductionOrderUUID")
    protected UUID productionOrderUUID;
    @XmlElement(name = "ProductionOrderStatus")
    protected LogisticsOrderStatus productionOrderStatus;
    @XmlElement(name = "ProductionLotUUID")
    protected UUID productionLotUUID;
    @XmlElement(name = "ProductionLotStatus")
    protected ProductionLotStatus productionLotStatus;
    @XmlElement(name = "MainOutputProductSiteID")
    protected SupplyPlanningAreaID mainOutputProductSiteID;
    @XmlElement(name = "MainOutputProduct")
    protected ProductID mainOutputProduct;
    @XmlElement(name = "ProductionStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar productionStartDate;
    @XmlElement(name = "ProductionEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar productionEndDate;
    @XmlElement(name = "ConfirmationGroup", required = true)
    protected List<ProductionLotConfirmationGroup> confirmationGroup;
    @XmlElement(name = "ZProductionLotStatDate", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar zProductionLotStatDate;
    @XmlElement(name = "ZResourceCostCentreName", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B")
    protected String zResourceCostCentreName;

    /**
     * productionLotID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessTransactionDocumentID }
     * 
     */
    public BusinessTransactionDocumentID getProductionLotID() {
        return productionLotID;
    }

    /**
     * productionLotID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessTransactionDocumentID }
     * 
     */
    public void setProductionLotID(BusinessTransactionDocumentID value) {
        this.productionLotID = value;
    }

    /**
     * productionOrderID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessTransactionDocumentID }
     * 
     */
    public BusinessTransactionDocumentID getProductionOrderID() {
        return productionOrderID;
    }

    /**
     * productionOrderID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessTransactionDocumentID }
     * 
     */
    public void setProductionOrderID(BusinessTransactionDocumentID value) {
        this.productionOrderID = value;
    }

    /**
     * productionOrderUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getProductionOrderUUID() {
        return productionOrderUUID;
    }

    /**
     * productionOrderUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setProductionOrderUUID(UUID value) {
        this.productionOrderUUID = value;
    }

    /**
     * productionOrderStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link LogisticsOrderStatus }
     * 
     */
    public LogisticsOrderStatus getProductionOrderStatus() {
        return productionOrderStatus;
    }

    /**
     * productionOrderStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link LogisticsOrderStatus }
     * 
     */
    public void setProductionOrderStatus(LogisticsOrderStatus value) {
        this.productionOrderStatus = value;
    }

    /**
     * productionLotUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getProductionLotUUID() {
        return productionLotUUID;
    }

    /**
     * productionLotUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setProductionLotUUID(UUID value) {
        this.productionLotUUID = value;
    }

    /**
     * productionLotStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductionLotStatus }
     * 
     */
    public ProductionLotStatus getProductionLotStatus() {
        return productionLotStatus;
    }

    /**
     * productionLotStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductionLotStatus }
     * 
     */
    public void setProductionLotStatus(ProductionLotStatus value) {
        this.productionLotStatus = value;
    }

    /**
     * mainOutputProductSiteID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SupplyPlanningAreaID }
     * 
     */
    public SupplyPlanningAreaID getMainOutputProductSiteID() {
        return mainOutputProductSiteID;
    }

    /**
     * mainOutputProductSiteID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SupplyPlanningAreaID }
     * 
     */
    public void setMainOutputProductSiteID(SupplyPlanningAreaID value) {
        this.mainOutputProductSiteID = value;
    }

    /**
     * mainOutputProduct 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductID }
     * 
     */
    public ProductID getMainOutputProduct() {
        return mainOutputProduct;
    }

    /**
     * mainOutputProduct 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductID }
     * 
     */
    public void setMainOutputProduct(ProductID value) {
        this.mainOutputProduct = value;
    }

    /**
     * productionStartDate 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getProductionStartDate() {
        return productionStartDate;
    }

    /**
     * productionStartDate 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setProductionStartDate(XMLGregorianCalendar value) {
        this.productionStartDate = value;
    }

    /**
     * productionEndDate 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getProductionEndDate() {
        return productionEndDate;
    }

    /**
     * productionEndDate 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setProductionEndDate(XMLGregorianCalendar value) {
        this.productionEndDate = value;
    }

    /**
     * Gets the value of the confirmationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmationGroup
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getConfirmationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotConfirmationGroup }
     * 
     * 
     */
    public List<ProductionLotConfirmationGroup> getConfirmationGroup() {
        if (confirmationGroup == null) {
            confirmationGroup = new ArrayList<ProductionLotConfirmationGroup>();
        }
        return this.confirmationGroup;
    }

    /**
     * zProductionLotStatDate 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getZProductionLotStatDate() {
        return zProductionLotStatDate;
    }

    /**
     * zProductionLotStatDate 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setZProductionLotStatDate(XMLGregorianCalendar value) {
        this.zProductionLotStatDate = value;
    }

    /**
     * zResourceCostCentreName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getZResourceCostCentreName() {
        return zResourceCostCentreName;
    }

    /**
     * zResourceCostCentreName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setZResourceCostCentreName(String value) {
        this.zResourceCostCentreName = value;
    }

}
