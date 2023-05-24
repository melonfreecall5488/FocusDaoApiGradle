
package com.smart.focus.ceoapi.wsdl2.product_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * ProductionLotReportingPoint complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotReportingPoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReportingPointID" type="{http://sap.com/xi/AP/Common/GDT}ReportingPointID" minOccurs="0"/&gt;
 *         &lt;element name="ReportingPointUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ReportingPointStatus" type="{http://sap.com/xi/AP/LogisticsExecution/Global}LogisticsLotReportingPointStatus" minOccurs="0"/&gt;
 *         &lt;element name="TotalConfirmedQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmedQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="TotalConfirmedScrap" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmedScrap" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="OpenQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="DeviationReason" type="{http://sap.com/xi/AP/Common/GDT}LogisticsDeviationReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="PlannedQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationFinishedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotReportingPoint", propOrder = {
        "reportingPointID",
        "reportingPointUUID",
        "reportingPointStatus",
        "totalConfirmedQuantity",
        "confirmedQuantity",
        "totalConfirmedScrap",
        "confirmedScrap",
        "openQuantity",
        "deviationReason",
        "plannedQuantity",
        "confirmationFinishedIndicator"
})
public class ProductionLotReportingPoint {

    @XmlElement(name = "ReportingPointID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reportingPointID;
    @XmlElement(name = "ReportingPointUUID")
    protected UUID reportingPointUUID;
    @XmlElement(name = "ReportingPointStatus")
    protected LogisticsLotReportingPointStatus reportingPointStatus;
    @XmlElement(name = "TotalConfirmedQuantity")
    protected Quantity totalConfirmedQuantity;
    @XmlElement(name = "ConfirmedQuantity")
    protected Quantity confirmedQuantity;
    @XmlElement(name = "TotalConfirmedScrap")
    protected Quantity totalConfirmedScrap;
    @XmlElement(name = "ConfirmedScrap")
    protected Quantity confirmedScrap;
    @XmlElement(name = "OpenQuantity")
    protected Quantity openQuantity;
    @XmlElement(name = "DeviationReason")
    protected LogisticsDeviationReasonCode deviationReason;
    @XmlElement(name = "PlannedQuantity")
    protected Quantity plannedQuantity;
    @XmlElement(name = "ConfirmationFinishedIndicator")
    protected Boolean confirmationFinishedIndicator;

    /**
     * reportingPointID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getReportingPointID() {
        return reportingPointID;
    }

    /**
     * reportingPointID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setReportingPointID(String value) {
        this.reportingPointID = value;
    }

    /**
     * reportingPointUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getReportingPointUUID() {
        return reportingPointUUID;
    }

    /**
     * reportingPointUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setReportingPointUUID(UUID value) {
        this.reportingPointUUID = value;
    }

    /**
     * reportingPointStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link LogisticsLotReportingPointStatus }
     * 
     */
    public LogisticsLotReportingPointStatus getReportingPointStatus() {
        return reportingPointStatus;
    }

    /**
     * reportingPointStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link LogisticsLotReportingPointStatus }
     * 
     */
    public void setReportingPointStatus(LogisticsLotReportingPointStatus value) {
        this.reportingPointStatus = value;
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
     * confirmedQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getConfirmedQuantity() {
        return confirmedQuantity;
    }

    /**
     * confirmedQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setConfirmedQuantity(Quantity value) {
        this.confirmedQuantity = value;
    }

    /**
     * totalConfirmedScrap 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getTotalConfirmedScrap() {
        return totalConfirmedScrap;
    }

    /**
     * totalConfirmedScrap 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setTotalConfirmedScrap(Quantity value) {
        this.totalConfirmedScrap = value;
    }

    /**
     * confirmedScrap 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getConfirmedScrap() {
        return confirmedScrap;
    }

    /**
     * confirmedScrap 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setConfirmedScrap(Quantity value) {
        this.confirmedScrap = value;
    }

    /**
     * openQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getOpenQuantity() {
        return openQuantity;
    }

    /**
     * openQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setOpenQuantity(Quantity value) {
        this.openQuantity = value;
    }

    /**
     * deviationReason 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link LogisticsDeviationReasonCode }
     * 
     */
    public LogisticsDeviationReasonCode getDeviationReason() {
        return deviationReason;
    }

    /**
     * deviationReason 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link LogisticsDeviationReasonCode }
     * 
     */
    public void setDeviationReason(LogisticsDeviationReasonCode value) {
        this.deviationReason = value;
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
     * confirmationFinishedIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isConfirmationFinishedIndicator() {
        return confirmationFinishedIndicator;
    }

    /**
     * confirmationFinishedIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setConfirmationFinishedIndicator(Boolean value) {
        this.confirmationFinishedIndicator = value;
    }

}
