
package com.smart.focus.ceoapi.wsdl2.material;

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
 * MaterialByElementsResponseMaterialAvailabilityConfirmation complex type에 대한
 * Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialAvailabilityConfirmation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PlanningAreaID" type="{http://sap.com/xi/AP/Common/GDT}SupplyPlanningAreaID" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ProductProcessUsabilityLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="ReplenishmentLeadTimeDuration" type="{http://sap.com/xi/AP/Common/GDT}DAY_Duration" minOccurs="0"/&gt;
 *         &lt;element name="AvailabilityCheckScopeCode" type="{http://sap.com/xi/AP/Common/GDT}AvailabilityConfirmationModeCode" minOccurs="0"/&gt;
 *         &lt;element name="GoodsIssueProcessingDuration" type="{http://sap.com/xi/AP/Common/GDT}TIME_Duration" minOccurs="0"/&gt;
 *         &lt;element name="AvailabilityCheckHorizonDuration" type="{http://sap.com/xi/AP/Common/GDT}DAY_Duration" minOccurs="0"/&gt;
 *         &lt;element name="DisableAutomaticShipFromDeterminationIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialAvailabilityConfirmation", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "planningAreaID",
        "lifeCycleStatusCode",
        "replenishmentLeadTimeDuration",
        "availabilityCheckScopeCode",
        "goodsIssueProcessingDuration",
        "availabilityCheckHorizonDuration",
        "disableAutomaticShipFromDeterminationIndicator"
})
public class MaterialByElementsResponseMaterialAvailabilityConfirmation {

    @XmlElement(name = "PlanningAreaID")
    protected SupplyPlanningAreaID planningAreaID;
    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "ReplenishmentLeadTimeDuration")
    protected Duration replenishmentLeadTimeDuration;
    @XmlElement(name = "AvailabilityCheckScopeCode")
    protected AvailabilityConfirmationModeCode availabilityCheckScopeCode;
    @XmlElement(name = "GoodsIssueProcessingDuration")
    protected Duration goodsIssueProcessingDuration;
    @XmlElement(name = "AvailabilityCheckHorizonDuration")
    protected Duration availabilityCheckHorizonDuration;
    @XmlElement(name = "DisableAutomaticShipFromDeterminationIndicator")
    protected Boolean disableAutomaticShipFromDeterminationIndicator;

    /**
     * planningAreaID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SupplyPlanningAreaID }
     * 
     */
    public SupplyPlanningAreaID getPlanningAreaID() {
        return planningAreaID;
    }

    /**
     * planningAreaID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SupplyPlanningAreaID }
     * 
     */
    public void setPlanningAreaID(SupplyPlanningAreaID value) {
        this.planningAreaID = value;
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
     * replenishmentLeadTimeDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getReplenishmentLeadTimeDuration() {
        return replenishmentLeadTimeDuration;
    }

    /**
     * replenishmentLeadTimeDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setReplenishmentLeadTimeDuration(Duration value) {
        this.replenishmentLeadTimeDuration = value;
    }

    /**
     * availabilityCheckScopeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link AvailabilityConfirmationModeCode }
     * 
     */
    public AvailabilityConfirmationModeCode getAvailabilityCheckScopeCode() {
        return availabilityCheckScopeCode;
    }

    /**
     * availabilityCheckScopeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link AvailabilityConfirmationModeCode }
     * 
     */
    public void setAvailabilityCheckScopeCode(AvailabilityConfirmationModeCode value) {
        this.availabilityCheckScopeCode = value;
    }

    /**
     * goodsIssueProcessingDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getGoodsIssueProcessingDuration() {
        return goodsIssueProcessingDuration;
    }

    /**
     * goodsIssueProcessingDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setGoodsIssueProcessingDuration(Duration value) {
        this.goodsIssueProcessingDuration = value;
    }

    /**
     * availabilityCheckHorizonDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getAvailabilityCheckHorizonDuration() {
        return availabilityCheckHorizonDuration;
    }

    /**
     * availabilityCheckHorizonDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setAvailabilityCheckHorizonDuration(Duration value) {
        this.availabilityCheckHorizonDuration = value;
    }

    /**
     * disableAutomaticShipFromDeterminationIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isDisableAutomaticShipFromDeterminationIndicator() {
        return disableAutomaticShipFromDeterminationIndicator;
    }

    /**
     * disableAutomaticShipFromDeterminationIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setDisableAutomaticShipFromDeterminationIndicator(Boolean value) {
        this.disableAutomaticShipFromDeterminationIndicator = value;
    }

}
