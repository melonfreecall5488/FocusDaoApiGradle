
package com.smart.focus.ceoapi.wsdl2.product_order;

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
 * MaterialInputResponse complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialInputResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaterialInputUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *         &lt;element name="ProductUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="SupplyPlanningArea" type="{http://sap.com/xi/AP/Common/GDT}SupplyPlanningAreaID" minOccurs="0"/&gt;
 *         &lt;element name="IdentifiedStockDescription" type="{http://sap.com/xi/A1S/Global}IdentifiedStockDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IdentifiedStockType" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="IdentifiedStockID" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockID" minOccurs="0"/&gt;
 *         &lt;element name="ActivityID" type="{http://sap.com/xi/AP/Common/GDT}OperationActivityID" minOccurs="0"/&gt;
 *         &lt;element name="ActivityType" type="{http://sap.com/xi/AP/Common/GDT}OperationActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ActivityUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmLogisticsAreaID" type="{http://sap.com/xi/AP/Common/GDT}LogisticsAreaID" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationMethodCode" type="{http://sap.com/xi/AP/Common/GDT}LogisticsConfirmationMethodCode" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationFinished" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ProductSpecificationID" type="{http://sap.com/xi/AP/Common/GDT}RequirementSpecificationID" minOccurs="0"/&gt;
 *         &lt;element name="ProductSpecificationDescription" type="{http://sap.com/xi/A1S/Global}ProductSpecification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="LineItemGroupID" type="{http://sap.com/xi/AP/Common/GDT}BillOfMaterialItemGroupID" minOccurs="0"/&gt;
 *         &lt;element name="PlannedQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="OperationID" type="{http://sap.com/xi/AP/Common/GDT}OperationID" minOccurs="0"/&gt;
 *         &lt;element name="SourceLogisticsAreaID" type="{http://sap.com/xi/AP/Common/GDT}LogisticsAreaID" minOccurs="0"/&gt;
 *         &lt;element name="SiteID" type="{http://sap.com/xi/AP/Common/GDT}LocationID" minOccurs="0"/&gt;
 *         &lt;element name="SiteDescription" type="{http://sap.com/xi/A1S/Global}SiteDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalConfirmedQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="PlannedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="InputProductQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://sap.com/xi/A1S/Global}ProductionLotSerialNumberAssignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialInputResponse", propOrder = {
        "materialInputUUID",
        "productID",
        "productUUID",
        "supplyPlanningArea",
        "identifiedStockDescription",
        "identifiedStockType",
        "identifiedStockID",
        "activityID",
        "activityType",
        "activityUUID",
        "confirmLogisticsAreaID",
        "confirmationMethodCode",
        "confirmationFinished",
        "productSpecificationID",
        "productSpecificationDescription",
        "confirmQuantity",
        "lineItemGroupID",
        "plannedQuantity",
        "operationID",
        "sourceLogisticsAreaID",
        "siteID",
        "siteDescription",
        "totalConfirmedQuantity",
        "plannedIndicator",
        "inputProductQuantity",
        "serialNumber"
})
public class MaterialInputResponse {

    @XmlElement(name = "MaterialInputUUID")
    protected UUID materialInputUUID;
    @XmlElement(name = "ProductID")
    protected ProductID productID;
    @XmlElement(name = "ProductUUID")
    protected UUID productUUID;
    @XmlElement(name = "SupplyPlanningArea")
    protected SupplyPlanningAreaID supplyPlanningArea;
    @XmlElement(name = "IdentifiedStockDescription")
    protected List<IdentifiedStockDescription> identifiedStockDescription;
    @XmlElement(name = "IdentifiedStockType")
    protected IdentifiedStockTypeCode identifiedStockType;
    @XmlElement(name = "IdentifiedStockID")
    protected IdentifiedStockID identifiedStockID;
    @XmlElement(name = "ActivityID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String activityID;
    @XmlElement(name = "ActivityType")
    protected OperationActivityTypeCode activityType;
    @XmlElement(name = "ActivityUUID")
    protected UUID activityUUID;
    @XmlElement(name = "ConfirmLogisticsAreaID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String confirmLogisticsAreaID;
    @XmlElement(name = "ConfirmationMethodCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String confirmationMethodCode;
    @XmlElement(name = "ConfirmationFinished")
    protected Boolean confirmationFinished;
    @XmlElement(name = "ProductSpecificationID")
    protected RequirementSpecificationID productSpecificationID;
    @XmlElement(name = "ProductSpecificationDescription")
    protected List<ProductSpecification> productSpecificationDescription;
    @XmlElement(name = "ConfirmQuantity")
    protected Quantity confirmQuantity;
    @XmlElement(name = "LineItemGroupID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lineItemGroupID;
    @XmlElement(name = "PlannedQuantity")
    protected Quantity plannedQuantity;
    @XmlElement(name = "OperationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String operationID;
    @XmlElement(name = "SourceLogisticsAreaID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sourceLogisticsAreaID;
    @XmlElement(name = "SiteID")
    protected LocationID siteID;
    @XmlElement(name = "SiteDescription")
    protected List<SiteDescription> siteDescription;
    @XmlElement(name = "TotalConfirmedQuantity")
    protected Quantity totalConfirmedQuantity;
    @XmlElement(name = "PlannedIndicator")
    protected Boolean plannedIndicator;
    @XmlElement(name = "InputProductQuantity")
    protected Quantity inputProductQuantity;
    @XmlElement(name = "SerialNumber")
    protected List<ProductionLotSerialNumberAssignment> serialNumber;

    /**
     * materialInputUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getMaterialInputUUID() {
        return materialInputUUID;
    }

    /**
     * materialInputUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setMaterialInputUUID(UUID value) {
        this.materialInputUUID = value;
    }

    /**
     * productID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductID }
     * 
     */
    public ProductID getProductID() {
        return productID;
    }

    /**
     * productID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductID }
     * 
     */
    public void setProductID(ProductID value) {
        this.productID = value;
    }

    /**
     * productUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getProductUUID() {
        return productUUID;
    }

    /**
     * productUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setProductUUID(UUID value) {
        this.productUUID = value;
    }

    /**
     * supplyPlanningArea 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SupplyPlanningAreaID }
     * 
     */
    public SupplyPlanningAreaID getSupplyPlanningArea() {
        return supplyPlanningArea;
    }

    /**
     * supplyPlanningArea 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SupplyPlanningAreaID }
     * 
     */
    public void setSupplyPlanningArea(SupplyPlanningAreaID value) {
        this.supplyPlanningArea = value;
    }

    /**
     * Gets the value of the identifiedStockDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * identifiedStockDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getIdentifiedStockDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifiedStockDescription }
     * 
     * 
     */
    public List<IdentifiedStockDescription> getIdentifiedStockDescription() {
        if (identifiedStockDescription == null) {
            identifiedStockDescription = new ArrayList<IdentifiedStockDescription>();
        }
        return this.identifiedStockDescription;
    }

    /**
     * identifiedStockType 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link IdentifiedStockTypeCode }
     * 
     */
    public IdentifiedStockTypeCode getIdentifiedStockType() {
        return identifiedStockType;
    }

    /**
     * identifiedStockType 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link IdentifiedStockTypeCode }
     * 
     */
    public void setIdentifiedStockType(IdentifiedStockTypeCode value) {
        this.identifiedStockType = value;
    }

    /**
     * identifiedStockID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link IdentifiedStockID }
     * 
     */
    public IdentifiedStockID getIdentifiedStockID() {
        return identifiedStockID;
    }

    /**
     * identifiedStockID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link IdentifiedStockID }
     * 
     */
    public void setIdentifiedStockID(IdentifiedStockID value) {
        this.identifiedStockID = value;
    }

    /**
     * activityID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getActivityID() {
        return activityID;
    }

    /**
     * activityID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setActivityID(String value) {
        this.activityID = value;
    }

    /**
     * activityType 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link OperationActivityTypeCode }
     * 
     */
    public OperationActivityTypeCode getActivityType() {
        return activityType;
    }

    /**
     * activityType 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link OperationActivityTypeCode }
     * 
     */
    public void setActivityType(OperationActivityTypeCode value) {
        this.activityType = value;
    }

    /**
     * activityUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getActivityUUID() {
        return activityUUID;
    }

    /**
     * activityUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setActivityUUID(UUID value) {
        this.activityUUID = value;
    }

    /**
     * confirmLogisticsAreaID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getConfirmLogisticsAreaID() {
        return confirmLogisticsAreaID;
    }

    /**
     * confirmLogisticsAreaID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setConfirmLogisticsAreaID(String value) {
        this.confirmLogisticsAreaID = value;
    }

    /**
     * confirmationMethodCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getConfirmationMethodCode() {
        return confirmationMethodCode;
    }

    /**
     * confirmationMethodCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setConfirmationMethodCode(String value) {
        this.confirmationMethodCode = value;
    }

    /**
     * confirmationFinished 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isConfirmationFinished() {
        return confirmationFinished;
    }

    /**
     * confirmationFinished 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setConfirmationFinished(Boolean value) {
        this.confirmationFinished = value;
    }

    /**
     * productSpecificationID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link RequirementSpecificationID }
     * 
     */
    public RequirementSpecificationID getProductSpecificationID() {
        return productSpecificationID;
    }

    /**
     * productSpecificationID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link RequirementSpecificationID }
     * 
     */
    public void setProductSpecificationID(RequirementSpecificationID value) {
        this.productSpecificationID = value;
    }

    /**
     * Gets the value of the productSpecificationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * productSpecificationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getProductSpecificationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSpecification }
     * 
     * 
     */
    public List<ProductSpecification> getProductSpecificationDescription() {
        if (productSpecificationDescription == null) {
            productSpecificationDescription = new ArrayList<ProductSpecification>();
        }
        return this.productSpecificationDescription;
    }

    /**
     * confirmQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getConfirmQuantity() {
        return confirmQuantity;
    }

    /**
     * confirmQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setConfirmQuantity(Quantity value) {
        this.confirmQuantity = value;
    }

    /**
     * lineItemGroupID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getLineItemGroupID() {
        return lineItemGroupID;
    }

    /**
     * lineItemGroupID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setLineItemGroupID(String value) {
        this.lineItemGroupID = value;
    }

    /**
     * plannedQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getPlannedQuantity() {
        return plannedQuantity;
    }

    /**
     * plannedQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setPlannedQuantity(Quantity value) {
        this.plannedQuantity = value;
    }

    /**
     * operationID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getOperationID() {
        return operationID;
    }

    /**
     * operationID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setOperationID(String value) {
        this.operationID = value;
    }

    /**
     * sourceLogisticsAreaID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSourceLogisticsAreaID() {
        return sourceLogisticsAreaID;
    }

    /**
     * sourceLogisticsAreaID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSourceLogisticsAreaID(String value) {
        this.sourceLogisticsAreaID = value;
    }

    /**
     * siteID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link LocationID }
     * 
     */
    public LocationID getSiteID() {
        return siteID;
    }

    /**
     * siteID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link LocationID }
     * 
     */
    public void setSiteID(LocationID value) {
        this.siteID = value;
    }

    /**
     * Gets the value of the siteDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteDescription
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSiteDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteDescription }
     * 
     * 
     */
    public List<SiteDescription> getSiteDescription() {
        if (siteDescription == null) {
            siteDescription = new ArrayList<SiteDescription>();
        }
        return this.siteDescription;
    }

    /**
     * totalConfirmedQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getTotalConfirmedQuantity() {
        return totalConfirmedQuantity;
    }

    /**
     * totalConfirmedQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setTotalConfirmedQuantity(Quantity value) {
        this.totalConfirmedQuantity = value;
    }

    /**
     * plannedIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isPlannedIndicator() {
        return plannedIndicator;
    }

    /**
     * plannedIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setPlannedIndicator(Boolean value) {
        this.plannedIndicator = value;
    }

    /**
     * inputProductQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getInputProductQuantity() {
        return inputProductQuantity;
    }

    /**
     * inputProductQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setInputProductQuantity(Quantity value) {
        this.inputProductQuantity = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumber
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSerialNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotSerialNumberAssignment }
     * 
     * 
     */
    public List<ProductionLotSerialNumberAssignment> getSerialNumber() {
        if (serialNumber == null) {
            serialNumber = new ArrayList<ProductionLotSerialNumberAssignment>();
        }
        return this.serialNumber;
    }

}
