
package com.smart.focus.ceoapi.wsdl2.material;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;

/**
 * <p>
 * MaterialByElementsResponseMaterialSupplyPlanning complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialSupplyPlanning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplyPlanningCategoryID" type="{http://sap.com/xi/AP/Common/GDT}ProductCategoryInternalID" minOccurs="0"/&gt;
 *         &lt;element name="SupplyPlanningAreaID" type="{http://sap.com/xi/AP/Common/GDT}SupplyPlanningAreaID" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ProductProcessUsabilityLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="ProcurementTypeCode" type="{http://sap.com/xi/AP/Common/GDT}ProcurementMethodCode" minOccurs="0"/&gt;
 *         &lt;element name="PlanningTimeFenceDuration" type="{http://sap.com/xi/AP/Common/GDT}DAY_Duration" minOccurs="0"/&gt;
 *         &lt;element name="PlanningProcedureCode" type="{http://sap.com/xi/AP/Common/GDT}SupplyPlanningProcedureCode" minOccurs="0"/&gt;
 *         &lt;element name="LotSizeProcedureCode" type="{http://sap.com/xi/AP/Common/GDT}LotSizeProcedureCode" minOccurs="0"/&gt;
 *         &lt;element name="FixedLotSizeQuantityValue" type="{http://sap.com/xi/AP/Common/GDT}DecimalValue" minOccurs="0"/&gt;
 *         &lt;element name="PeriodTypeCode" type="{http://sap.com/xi/AP/Common/GDT}CalendarUnitCode" minOccurs="0"/&gt;
 *         &lt;element name="ReOrderQuantityValue" type="{http://sap.com/xi/AP/Common/GDT}DecimalValue" minOccurs="0"/&gt;
 *         &lt;element name="TargetStockQuantityValue" type="{http://sap.com/xi/AP/Common/GDT}DecimalValue" minOccurs="0"/&gt;
 *         &lt;element name="TargetDaysOfSupplyDuration" type="{http://sap.com/xi/AP/Common/GDT}DAY_Duration" minOccurs="0"/&gt;
 *         &lt;element name="SafetyStockQuantityValue" type="{http://sap.com/xi/AP/Common/GDT}DecimalValue" minOccurs="0"/&gt;
 *         &lt;element name="SafetyDaysOfSupplyDuration" type="{http://sap.com/xi/AP/Common/GDT}DAY_Duration" minOccurs="0"/&gt;
 *         &lt;element name="LotSizeRoundingQuantityValue" type="{http://sap.com/xi/AP/Common/GDT}DecimalValue" minOccurs="0"/&gt;
 *         &lt;element name="MinimumLotSizeQuantityValue" type="{http://sap.com/xi/AP/Common/GDT}DecimalValue" minOccurs="0"/&gt;
 *         &lt;element name="MaximumLotSizeQuantityValue" type="{http://sap.com/xi/AP/Common/GDT}DecimalValue" minOccurs="0"/&gt;
 *         &lt;element name="DemandManagementProcedureCode" type="{http://sap.com/xi/AP/Common/GDT}DemandForecastRequirementProfileCode" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDeliveryDuration" type="{http://sap.com/xi/AP/Common/GDT}DAY_Duration" minOccurs="0"/&gt;
 *         &lt;element name="GoodsReceiptProcessingDuration" type="{http://sap.com/xi/AP/Common/GDT}TIME_Duration" minOccurs="0"/&gt;
 *         &lt;element name="MinimumDaysOfSupplyDuration" type="{http://sap.com/xi/AP/Common/GDT}DAY_Duration" minOccurs="0"/&gt;
 *         &lt;element name="MinimumReceiptDaysOfSupplyDuration" type="{http://sap.com/xi/AP/Common/GDT}DAY_Duration" minOccurs="0"/&gt;
 *         &lt;element name="MinShelfLifeDuration" type="{http://sap.com/xi/AP/Common/GDT}DAY_Duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialSupplyPlanning", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "supplyPlanningCategoryID",
        "supplyPlanningAreaID",
        "lifeCycleStatusCode",
        "procurementTypeCode",
        "planningTimeFenceDuration",
        "planningProcedureCode",
        "lotSizeProcedureCode",
        "fixedLotSizeQuantityValue",
        "periodTypeCode",
        "reOrderQuantityValue",
        "targetStockQuantityValue",
        "targetDaysOfSupplyDuration",
        "safetyStockQuantityValue",
        "safetyDaysOfSupplyDuration",
        "lotSizeRoundingQuantityValue",
        "minimumLotSizeQuantityValue",
        "maximumLotSizeQuantityValue",
        "demandManagementProcedureCode",
        "plannedDeliveryDuration",
        "goodsReceiptProcessingDuration",
        "minimumDaysOfSupplyDuration",
        "minimumReceiptDaysOfSupplyDuration",
        "minShelfLifeDuration"
})
public class MaterialByElementsResponseMaterialSupplyPlanning {

    @XmlElement(name = "SupplyPlanningCategoryID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String supplyPlanningCategoryID;
    @XmlElement(name = "SupplyPlanningAreaID")
    protected SupplyPlanningAreaID supplyPlanningAreaID;
    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "ProcurementTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String procurementTypeCode;
    @XmlElement(name = "PlanningTimeFenceDuration")
    protected Duration planningTimeFenceDuration;
    @XmlElement(name = "PlanningProcedureCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String planningProcedureCode;
    @XmlElement(name = "LotSizeProcedureCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lotSizeProcedureCode;
    @XmlElement(name = "FixedLotSizeQuantityValue")
    protected BigDecimal fixedLotSizeQuantityValue;
    @XmlElement(name = "PeriodTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String periodTypeCode;
    @XmlElement(name = "ReOrderQuantityValue")
    protected BigDecimal reOrderQuantityValue;
    @XmlElement(name = "TargetStockQuantityValue")
    protected BigDecimal targetStockQuantityValue;
    @XmlElement(name = "TargetDaysOfSupplyDuration")
    protected Duration targetDaysOfSupplyDuration;
    @XmlElement(name = "SafetyStockQuantityValue")
    protected BigDecimal safetyStockQuantityValue;
    @XmlElement(name = "SafetyDaysOfSupplyDuration")
    protected Duration safetyDaysOfSupplyDuration;
    @XmlElement(name = "LotSizeRoundingQuantityValue")
    protected BigDecimal lotSizeRoundingQuantityValue;
    @XmlElement(name = "MinimumLotSizeQuantityValue")
    protected BigDecimal minimumLotSizeQuantityValue;
    @XmlElement(name = "MaximumLotSizeQuantityValue")
    protected BigDecimal maximumLotSizeQuantityValue;
    @XmlElement(name = "DemandManagementProcedureCode")
    protected DemandForecastRequirementProfileCode demandManagementProcedureCode;
    @XmlElement(name = "PlannedDeliveryDuration")
    protected Duration plannedDeliveryDuration;
    @XmlElement(name = "GoodsReceiptProcessingDuration")
    protected Duration goodsReceiptProcessingDuration;
    @XmlElement(name = "MinimumDaysOfSupplyDuration")
    protected Duration minimumDaysOfSupplyDuration;
    @XmlElement(name = "MinimumReceiptDaysOfSupplyDuration")
    protected Duration minimumReceiptDaysOfSupplyDuration;
    @XmlElement(name = "MinShelfLifeDuration")
    protected Duration minShelfLifeDuration;

    /**
     * supplyPlanningCategoryID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSupplyPlanningCategoryID() {
        return supplyPlanningCategoryID;
    }

    /**
     * supplyPlanningCategoryID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSupplyPlanningCategoryID(String value) {
        this.supplyPlanningCategoryID = value;
    }

    /**
     * supplyPlanningAreaID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SupplyPlanningAreaID }
     * 
     */
    public SupplyPlanningAreaID getSupplyPlanningAreaID() {
        return supplyPlanningAreaID;
    }

    /**
     * supplyPlanningAreaID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SupplyPlanningAreaID }
     * 
     */
    public void setSupplyPlanningAreaID(SupplyPlanningAreaID value) {
        this.supplyPlanningAreaID = value;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setLifeCycleStatusCode(String value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * procurementTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getProcurementTypeCode() {
        return procurementTypeCode;
    }

    /**
     * procurementTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setProcurementTypeCode(String value) {
        this.procurementTypeCode = value;
    }

    /**
     * planningTimeFenceDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getPlanningTimeFenceDuration() {
        return planningTimeFenceDuration;
    }

    /**
     * planningTimeFenceDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setPlanningTimeFenceDuration(Duration value) {
        this.planningTimeFenceDuration = value;
    }

    /**
     * planningProcedureCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPlanningProcedureCode() {
        return planningProcedureCode;
    }

    /**
     * planningProcedureCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPlanningProcedureCode(String value) {
        this.planningProcedureCode = value;
    }

    /**
     * lotSizeProcedureCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getLotSizeProcedureCode() {
        return lotSizeProcedureCode;
    }

    /**
     * lotSizeProcedureCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setLotSizeProcedureCode(String value) {
        this.lotSizeProcedureCode = value;
    }

    /**
     * fixedLotSizeQuantityValue 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BigDecimal }
     * 
     */
    public BigDecimal getFixedLotSizeQuantityValue() {
        return fixedLotSizeQuantityValue;
    }

    /**
     * fixedLotSizeQuantityValue 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BigDecimal }
     * 
     */
    public void setFixedLotSizeQuantityValue(BigDecimal value) {
        this.fixedLotSizeQuantityValue = value;
    }

    /**
     * periodTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPeriodTypeCode() {
        return periodTypeCode;
    }

    /**
     * periodTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPeriodTypeCode(String value) {
        this.periodTypeCode = value;
    }

    /**
     * reOrderQuantityValue 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BigDecimal }
     * 
     */
    public BigDecimal getReOrderQuantityValue() {
        return reOrderQuantityValue;
    }

    /**
     * reOrderQuantityValue 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BigDecimal }
     * 
     */
    public void setReOrderQuantityValue(BigDecimal value) {
        this.reOrderQuantityValue = value;
    }

    /**
     * targetStockQuantityValue 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BigDecimal }
     * 
     */
    public BigDecimal getTargetStockQuantityValue() {
        return targetStockQuantityValue;
    }

    /**
     * targetStockQuantityValue 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BigDecimal }
     * 
     */
    public void setTargetStockQuantityValue(BigDecimal value) {
        this.targetStockQuantityValue = value;
    }

    /**
     * targetDaysOfSupplyDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getTargetDaysOfSupplyDuration() {
        return targetDaysOfSupplyDuration;
    }

    /**
     * targetDaysOfSupplyDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setTargetDaysOfSupplyDuration(Duration value) {
        this.targetDaysOfSupplyDuration = value;
    }

    /**
     * safetyStockQuantityValue 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BigDecimal }
     * 
     */
    public BigDecimal getSafetyStockQuantityValue() {
        return safetyStockQuantityValue;
    }

    /**
     * safetyStockQuantityValue 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BigDecimal }
     * 
     */
    public void setSafetyStockQuantityValue(BigDecimal value) {
        this.safetyStockQuantityValue = value;
    }

    /**
     * safetyDaysOfSupplyDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getSafetyDaysOfSupplyDuration() {
        return safetyDaysOfSupplyDuration;
    }

    /**
     * safetyDaysOfSupplyDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setSafetyDaysOfSupplyDuration(Duration value) {
        this.safetyDaysOfSupplyDuration = value;
    }

    /**
     * lotSizeRoundingQuantityValue 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BigDecimal }
     * 
     */
    public BigDecimal getLotSizeRoundingQuantityValue() {
        return lotSizeRoundingQuantityValue;
    }

    /**
     * lotSizeRoundingQuantityValue 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BigDecimal }
     * 
     */
    public void setLotSizeRoundingQuantityValue(BigDecimal value) {
        this.lotSizeRoundingQuantityValue = value;
    }

    /**
     * minimumLotSizeQuantityValue 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BigDecimal }
     * 
     */
    public BigDecimal getMinimumLotSizeQuantityValue() {
        return minimumLotSizeQuantityValue;
    }

    /**
     * minimumLotSizeQuantityValue 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BigDecimal }
     * 
     */
    public void setMinimumLotSizeQuantityValue(BigDecimal value) {
        this.minimumLotSizeQuantityValue = value;
    }

    /**
     * maximumLotSizeQuantityValue 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BigDecimal }
     * 
     */
    public BigDecimal getMaximumLotSizeQuantityValue() {
        return maximumLotSizeQuantityValue;
    }

    /**
     * maximumLotSizeQuantityValue 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BigDecimal }
     * 
     */
    public void setMaximumLotSizeQuantityValue(BigDecimal value) {
        this.maximumLotSizeQuantityValue = value;
    }

    /**
     * demandManagementProcedureCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link DemandForecastRequirementProfileCode }
     * 
     */
    public DemandForecastRequirementProfileCode getDemandManagementProcedureCode() {
        return demandManagementProcedureCode;
    }

    /**
     * demandManagementProcedureCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link DemandForecastRequirementProfileCode }
     * 
     */
    public void setDemandManagementProcedureCode(DemandForecastRequirementProfileCode value) {
        this.demandManagementProcedureCode = value;
    }

    /**
     * plannedDeliveryDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getPlannedDeliveryDuration() {
        return plannedDeliveryDuration;
    }

    /**
     * plannedDeliveryDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setPlannedDeliveryDuration(Duration value) {
        this.plannedDeliveryDuration = value;
    }

    /**
     * goodsReceiptProcessingDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getGoodsReceiptProcessingDuration() {
        return goodsReceiptProcessingDuration;
    }

    /**
     * goodsReceiptProcessingDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setGoodsReceiptProcessingDuration(Duration value) {
        this.goodsReceiptProcessingDuration = value;
    }

    /**
     * minimumDaysOfSupplyDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getMinimumDaysOfSupplyDuration() {
        return minimumDaysOfSupplyDuration;
    }

    /**
     * minimumDaysOfSupplyDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setMinimumDaysOfSupplyDuration(Duration value) {
        this.minimumDaysOfSupplyDuration = value;
    }

    /**
     * minimumReceiptDaysOfSupplyDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getMinimumReceiptDaysOfSupplyDuration() {
        return minimumReceiptDaysOfSupplyDuration;
    }

    /**
     * minimumReceiptDaysOfSupplyDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setMinimumReceiptDaysOfSupplyDuration(Duration value) {
        this.minimumReceiptDaysOfSupplyDuration = value;
    }

    /**
     * minShelfLifeDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getMinShelfLifeDuration() {
        return minShelfLifeDuration;
    }

    /**
     * minShelfLifeDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setMinShelfLifeDuration(Duration value) {
        this.minShelfLifeDuration = value;
    }

}
