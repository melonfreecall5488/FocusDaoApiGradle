
package com.smart.focus.ceoapi.wsdl2.material;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * MaterialByElementsResponseMaterial_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterial_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeStateID" type="{http://sap.com/xi/AP/Common/GDT}ChangeStateID" minOccurs="0"/&gt;
 *         &lt;element name="InternalID" type="{http://sap.com/xi/AP/Common/GDT}ProductInternalID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="SystemAdministrativeData" type="{http://sap.com/xi/AP/Common/GDT}SystemAdministrativeData" minOccurs="0"/&gt;
 *         &lt;element name="ProductCategoryID" type="{http://sap.com/xi/AP/Common/GDT}ProductCategoryInternalID" minOccurs="0"/&gt;
 *         &lt;element name="IdentifiedStockTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BaseMeasureUnitCode" type="{http://sap.com/xi/AP/Common/GDT}MeasureUnitCode" minOccurs="0"/&gt;
 *         &lt;element name="InventoryValuationMeasureUnitCode" type="{http://sap.com/xi/AP/Common/GDT}MeasureUnitCode" minOccurs="0"/&gt;
 *         &lt;element name="PlanningMeasureUnitCode" type="{http://sap.com/xi/AP/Common/GDT}MeasureUnitCode" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Detail" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuantityConversion" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialQuantityConversion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuantityCharacteristic" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialQunantityCharacteristics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GlobalTradeItemNumber" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialGlobaldTradeItemNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Purchasing" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialPurchasing" minOccurs="0"/&gt;
 *         &lt;element name="Planning" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialPlanning" minOccurs="0"/&gt;
 *         &lt;element name="AvailabilityConfirmation" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialAvailabilityConfirmation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sales" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialSales" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Logistics" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialLogistics" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DeviantTaxClassification" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialDeviantTaxClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxClassification" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialWithholdingTaxClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Valuation" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialValuation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPartNumber" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialCustomerPartNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SupplierPartNumber" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialSupplierPartNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}AccessAttachmentFolder" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B}Ext00163EA977381EEC87F426564B8242E0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B}Ext00163EA977381EEC88B4B9A66084D088"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/Globalization}MaterialQueryCostAuditingReportExtensionElements"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/Globalization}MaterialQueryMaterialTariffExtensionElements"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/Globalization}MaterialQueryProductTaxStandardClassificationExtensionElements"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterial_sync", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "changeStateID",
        "internalID",
        "uuid",
        "systemAdministrativeData",
        "productCategoryID",
        "identifiedStockTypeCode",
        "baseMeasureUnitCode",
        "inventoryValuationMeasureUnitCode",
        "planningMeasureUnitCode",
        "description",
        "detail",
        "quantityConversion",
        "quantityCharacteristic",
        "globalTradeItemNumber",
        "purchasing",
        "planning",
        "availabilityConfirmation",
        "sales",
        "logistics",
        "deviantTaxClassification",
        "withholdingTaxClassification",
        "valuation",
        "customerPartNumber",
        "supplierPartNumber",
        "attachmentFolder",
        "zMaterialUOM",
        "zProductCategoryName",
        "indiaCostAuditingTradedProductIndicator",
        "indiaCostAuditingManufacteredProductIndicator",
        "indiaMaterialTariffID",
        "mrpTextileIndustry",
        "hsnCodeIndia",
        "indiaMaterialTypeCode"
})
public class MaterialByElementsResponseMaterialSync {

    @XmlElement(name = "ChangeStateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String changeStateID;
    @XmlElement(name = "InternalID")
    protected ProductInternalID internalID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "SystemAdministrativeData")
    protected SystemAdministrativeData systemAdministrativeData;
    @XmlElement(name = "ProductCategoryID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productCategoryID;
    @XmlElement(name = "IdentifiedStockTypeCode")
    protected IdentifiedStockTypeCode identifiedStockTypeCode;
    @XmlElement(name = "BaseMeasureUnitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baseMeasureUnitCode;
    @XmlElement(name = "InventoryValuationMeasureUnitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inventoryValuationMeasureUnitCode;
    @XmlElement(name = "PlanningMeasureUnitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String planningMeasureUnitCode;
    @XmlElement(name = "Description")
    protected List<MaterialByElementsResponseMaterialDescription> description;
    @XmlElement(name = "Detail")
    protected List<MaterialByElementsResponseMaterialText> detail;
    @XmlElement(name = "QuantityConversion")
    protected List<MaterialByElementsResponseMaterialQuantityConversion> quantityConversion;
    @XmlElement(name = "QuantityCharacteristic")
    protected List<MaterialByElementsResponseMaterialQunantityCharacteristics> quantityCharacteristic;
    @XmlElement(name = "GlobalTradeItemNumber")
    protected List<MaterialByElementsResponseMaterialGlobaldTradeItemNumber> globalTradeItemNumber;
    @XmlElement(name = "Purchasing")
    protected MaterialByElementsResponseMaterialPurchasing purchasing;
    @XmlElement(name = "Planning")
    protected MaterialByElementsResponseMaterialPlanning planning;
    @XmlElement(name = "AvailabilityConfirmation")
    protected List<MaterialByElementsResponseMaterialAvailabilityConfirmation> availabilityConfirmation;
    @XmlElement(name = "Sales")
    protected List<MaterialByElementsResponseMaterialSales> sales;
    @XmlElement(name = "Logistics")
    protected List<MaterialByElementsResponseMaterialLogistics> logistics;
    @XmlElement(name = "DeviantTaxClassification")
    protected List<MaterialByElementsResponseMaterialDeviantTaxClassification> deviantTaxClassification;
    @XmlElement(name = "WithholdingTaxClassification")
    protected List<MaterialByElementsResponseMaterialWithholdingTaxClassification> withholdingTaxClassification;
    @XmlElement(name = "Valuation")
    protected List<MaterialByElementsResponseMaterialValuation> valuation;
    @XmlElement(name = "CustomerPartNumber")
    protected List<MaterialByElementsResponseMaterialCustomerPartNumber> customerPartNumber;
    @XmlElement(name = "SupplierPartNumber")
    protected List<MaterialByElementsResponseMaterialSupplierPartNumber> supplierPartNumber;
    @XmlElement(name = "AttachmentFolder")
    protected AccessAttachmentFolder attachmentFolder;
    @XmlElement(name = "ZMaterialUOM", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B")
    protected String zMaterialUOM;
    @XmlElement(name = "ZProductCategoryName", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B")
    protected String zProductCategoryName;
    @XmlElement(name = "IndiaCostAuditingTradedProductIndicator", namespace = "http://sap.com/xi/AP/Globalization")
    protected Boolean indiaCostAuditingTradedProductIndicator;
    @XmlElement(name = "IndiaCostAuditingManufacteredProductIndicator", namespace = "http://sap.com/xi/AP/Globalization")
    protected Boolean indiaCostAuditingManufacteredProductIndicator;
    @XmlElement(name = "IndiaMaterialTariffID", namespace = "http://sap.com/xi/AP/Globalization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String indiaMaterialTariffID;
    @XmlElement(name = "MRPTextileIndustry", namespace = "http://sap.com/xi/AP/Globalization")
    protected Amount mrpTextileIndustry;
    @XmlElement(name = "HSNCodeIndia", namespace = "http://sap.com/xi/AP/Globalization")
    protected ProductTaxStandardClassificationCode hsnCodeIndia;
    @XmlElement(name = "IndiaMaterialTypeCode", namespace = "http://sap.com/xi/AP/Globalization")
    protected ProductTaxStandardClassificationCode indiaMaterialTypeCode;

    /**
     * changeStateID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getChangeStateID() {
        return changeStateID;
    }

    /**
     * changeStateID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setChangeStateID(String value) {
        this.changeStateID = value;
    }

    /**
     * internalID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductInternalID }
     * 
     */
    public ProductInternalID getInternalID() {
        return internalID;
    }

    /**
     * internalID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductInternalID }
     * 
     */
    public void setInternalID(ProductInternalID value) {
        this.internalID = value;
    }

    /**
     * uuid 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * uuid 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * systemAdministrativeData 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SystemAdministrativeData }
     * 
     */
    public SystemAdministrativeData getSystemAdministrativeData() {
        return systemAdministrativeData;
    }

    /**
     * systemAdministrativeData 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SystemAdministrativeData }
     * 
     */
    public void setSystemAdministrativeData(SystemAdministrativeData value) {
        this.systemAdministrativeData = value;
    }

    /**
     * productCategoryID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getProductCategoryID() {
        return productCategoryID;
    }

    /**
     * productCategoryID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setProductCategoryID(String value) {
        this.productCategoryID = value;
    }

    /**
     * identifiedStockTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link IdentifiedStockTypeCode }
     * 
     */
    public IdentifiedStockTypeCode getIdentifiedStockTypeCode() {
        return identifiedStockTypeCode;
    }

    /**
     * identifiedStockTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link IdentifiedStockTypeCode }
     * 
     */
    public void setIdentifiedStockTypeCode(IdentifiedStockTypeCode value) {
        this.identifiedStockTypeCode = value;
    }

    /**
     * baseMeasureUnitCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getBaseMeasureUnitCode() {
        return baseMeasureUnitCode;
    }

    /**
     * baseMeasureUnitCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setBaseMeasureUnitCode(String value) {
        this.baseMeasureUnitCode = value;
    }

    /**
     * inventoryValuationMeasureUnitCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getInventoryValuationMeasureUnitCode() {
        return inventoryValuationMeasureUnitCode;
    }

    /**
     * inventoryValuationMeasureUnitCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setInventoryValuationMeasureUnitCode(String value) {
        this.inventoryValuationMeasureUnitCode = value;
    }

    /**
     * planningMeasureUnitCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPlanningMeasureUnitCode() {
        return planningMeasureUnitCode;
    }

    /**
     * planningMeasureUnitCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPlanningMeasureUnitCode(String value) {
        this.planningMeasureUnitCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialDescription }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialDescription> getDescription() {
        if (description == null) {
            description = new ArrayList<MaterialByElementsResponseMaterialDescription>();
        }
        return this.description;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialText }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialText> getDetail() {
        if (detail == null) {
            detail = new ArrayList<MaterialByElementsResponseMaterialText>();
        }
        return this.detail;
    }

    /**
     * Gets the value of the quantityConversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityConversion
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getQuantityConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialQuantityConversion }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialQuantityConversion> getQuantityConversion() {
        if (quantityConversion == null) {
            quantityConversion = new ArrayList<MaterialByElementsResponseMaterialQuantityConversion>();
        }
        return this.quantityConversion;
    }

    /**
     * Gets the value of the quantityCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * quantityCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getQuantityCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialQunantityCharacteristics }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialQunantityCharacteristics> getQuantityCharacteristic() {
        if (quantityCharacteristic == null) {
            quantityCharacteristic = new ArrayList<MaterialByElementsResponseMaterialQunantityCharacteristics>();
        }
        return this.quantityCharacteristic;
    }

    /**
     * Gets the value of the globalTradeItemNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * globalTradeItemNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGlobalTradeItemNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialGlobaldTradeItemNumber }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialGlobaldTradeItemNumber> getGlobalTradeItemNumber() {
        if (globalTradeItemNumber == null) {
            globalTradeItemNumber = new ArrayList<MaterialByElementsResponseMaterialGlobaldTradeItemNumber>();
        }
        return this.globalTradeItemNumber;
    }

    /**
     * purchasing 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link MaterialByElementsResponseMaterialPurchasing }
     * 
     */
    public MaterialByElementsResponseMaterialPurchasing getPurchasing() {
        return purchasing;
    }

    /**
     * purchasing 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link MaterialByElementsResponseMaterialPurchasing }
     * 
     */
    public void setPurchasing(MaterialByElementsResponseMaterialPurchasing value) {
        this.purchasing = value;
    }

    /**
     * planning 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link MaterialByElementsResponseMaterialPlanning }
     * 
     */
    public MaterialByElementsResponseMaterialPlanning getPlanning() {
        return planning;
    }

    /**
     * planning 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link MaterialByElementsResponseMaterialPlanning }
     * 
     */
    public void setPlanning(MaterialByElementsResponseMaterialPlanning value) {
        this.planning = value;
    }

    /**
     * Gets the value of the availabilityConfirmation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * availabilityConfirmation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAvailabilityConfirmation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialAvailabilityConfirmation }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialAvailabilityConfirmation> getAvailabilityConfirmation() {
        if (availabilityConfirmation == null) {
            availabilityConfirmation = new ArrayList<MaterialByElementsResponseMaterialAvailabilityConfirmation>();
        }
        return this.availabilityConfirmation;
    }

    /**
     * Gets the value of the sales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialSales }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialSales> getSales() {
        if (sales == null) {
            sales = new ArrayList<MaterialByElementsResponseMaterialSales>();
        }
        return this.sales;
    }

    /**
     * Gets the value of the logistics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the logistics
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getLogistics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialLogistics }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialLogistics> getLogistics() {
        if (logistics == null) {
            logistics = new ArrayList<MaterialByElementsResponseMaterialLogistics>();
        }
        return this.logistics;
    }

    /**
     * Gets the value of the deviantTaxClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * deviantTaxClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDeviantTaxClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialDeviantTaxClassification }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialDeviantTaxClassification> getDeviantTaxClassification() {
        if (deviantTaxClassification == null) {
            deviantTaxClassification = new ArrayList<MaterialByElementsResponseMaterialDeviantTaxClassification>();
        }
        return this.deviantTaxClassification;
    }

    /**
     * Gets the value of the withholdingTaxClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * withholdingTaxClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getWithholdingTaxClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialWithholdingTaxClassification }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialWithholdingTaxClassification> getWithholdingTaxClassification() {
        if (withholdingTaxClassification == null) {
            withholdingTaxClassification = new ArrayList<MaterialByElementsResponseMaterialWithholdingTaxClassification>();
        }
        return this.withholdingTaxClassification;
    }

    /**
     * Gets the value of the valuation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valuation
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getValuation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialValuation }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialValuation> getValuation() {
        if (valuation == null) {
            valuation = new ArrayList<MaterialByElementsResponseMaterialValuation>();
        }
        return this.valuation;
    }

    /**
     * Gets the value of the customerPartNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerPartNumber
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCustomerPartNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialCustomerPartNumber }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialCustomerPartNumber> getCustomerPartNumber() {
        if (customerPartNumber == null) {
            customerPartNumber = new ArrayList<MaterialByElementsResponseMaterialCustomerPartNumber>();
        }
        return this.customerPartNumber;
    }

    /**
     * Gets the value of the supplierPartNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierPartNumber
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSupplierPartNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialSupplierPartNumber }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialSupplierPartNumber> getSupplierPartNumber() {
        if (supplierPartNumber == null) {
            supplierPartNumber = new ArrayList<MaterialByElementsResponseMaterialSupplierPartNumber>();
        }
        return this.supplierPartNumber;
    }

    /**
     * attachmentFolder 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link AccessAttachmentFolder }
     * 
     */
    public AccessAttachmentFolder getAttachmentFolder() {
        return attachmentFolder;
    }

    /**
     * attachmentFolder 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link AccessAttachmentFolder }
     * 
     */
    public void setAttachmentFolder(AccessAttachmentFolder value) {
        this.attachmentFolder = value;
    }

    /**
     * zMaterialUOM 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getZMaterialUOM() {
        return zMaterialUOM;
    }

    /**
     * zMaterialUOM 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setZMaterialUOM(String value) {
        this.zMaterialUOM = value;
    }

    /**
     * zProductCategoryName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getZProductCategoryName() {
        return zProductCategoryName;
    }

    /**
     * zProductCategoryName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setZProductCategoryName(String value) {
        this.zProductCategoryName = value;
    }

    /**
     * indiaCostAuditingTradedProductIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isIndiaCostAuditingTradedProductIndicator() {
        return indiaCostAuditingTradedProductIndicator;
    }

    /**
     * indiaCostAuditingTradedProductIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setIndiaCostAuditingTradedProductIndicator(Boolean value) {
        this.indiaCostAuditingTradedProductIndicator = value;
    }

    /**
     * indiaCostAuditingManufacteredProductIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isIndiaCostAuditingManufacteredProductIndicator() {
        return indiaCostAuditingManufacteredProductIndicator;
    }

    /**
     * indiaCostAuditingManufacteredProductIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setIndiaCostAuditingManufacteredProductIndicator(Boolean value) {
        this.indiaCostAuditingManufacteredProductIndicator = value;
    }

    /**
     * indiaMaterialTariffID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getIndiaMaterialTariffID() {
        return indiaMaterialTariffID;
    }

    /**
     * indiaMaterialTariffID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setIndiaMaterialTariffID(String value) {
        this.indiaMaterialTariffID = value;
    }

    /**
     * mrpTextileIndustry 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Amount }
     * 
     */
    public Amount getMRPTextileIndustry() {
        return mrpTextileIndustry;
    }

    /**
     * mrpTextileIndustry 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Amount }
     * 
     */
    public void setMRPTextileIndustry(Amount value) {
        this.mrpTextileIndustry = value;
    }

    /**
     * hsnCodeIndia 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductTaxStandardClassificationCode }
     * 
     */
    public ProductTaxStandardClassificationCode getHSNCodeIndia() {
        return hsnCodeIndia;
    }

    /**
     * hsnCodeIndia 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductTaxStandardClassificationCode }
     * 
     */
    public void setHSNCodeIndia(ProductTaxStandardClassificationCode value) {
        this.hsnCodeIndia = value;
    }

    /**
     * indiaMaterialTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductTaxStandardClassificationCode }
     * 
     */
    public ProductTaxStandardClassificationCode getIndiaMaterialTypeCode() {
        return indiaMaterialTypeCode;
    }

    /**
     * indiaMaterialTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductTaxStandardClassificationCode }
     * 
     */
    public void setIndiaMaterialTypeCode(ProductTaxStandardClassificationCode value) {
        this.indiaMaterialTypeCode = value;
    }

}
