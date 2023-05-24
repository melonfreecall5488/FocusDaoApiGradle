
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
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * ActivityResponseMDT complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ActivityResponseMDT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityID" type="{http://sap.com/xi/AP/Common/GDT}OperationActivityID" minOccurs="0"/&gt;
 *         &lt;element name="ActivityUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ActivityStatus" type="{http://sap.com/xi/A1S/Global}ActivityStatus" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}OperationActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}OperationActivityCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="MaterialInspectionUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="StartDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedDuration" type="{http://sap.com/xi/AP/Common/GDT}TIME_Duration" minOccurs="0"/&gt;
 *         &lt;element name="OpenDuration" type="{http://sap.com/xi/AP/Common/GDT}TIME_Duration" minOccurs="0"/&gt;
 *         &lt;element name="TotalConfirmedDuration" type="{http://sap.com/xi/AP/Common/GDT}TIME_Duration" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationCompletedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationGroupUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ResourceUtilization" type="{http://sap.com/xi/A1S/Global}ProductionLotResources" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://sap.com/xi/A1S/Global}ProductionLotServices" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityResponseMDT", propOrder = {
        "activityID",
        "activityUUID",
        "activityStatus",
        "typeCode",
        "categoryCode",
        "materialInspectionUUID",
        "startDateTime",
        "plannedDuration",
        "openDuration",
        "totalConfirmedDuration",
        "endDateTime",
        "confirmationCompletedIndicator",
        "confirmationGroupUUID",
        "resourceUtilization",
        "service"
})
public class ActivityResponseMDT {

    @XmlElement(name = "ActivityID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String activityID;
    @XmlElement(name = "ActivityUUID")
    protected UUID activityUUID;
    @XmlElement(name = "ActivityStatus")
    protected ActivityStatus activityStatus;
    @XmlElement(name = "TypeCode")
    protected OperationActivityTypeCode typeCode;
    @XmlElement(name = "CategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String categoryCode;
    @XmlElement(name = "MaterialInspectionUUID")
    protected UUID materialInspectionUUID;
    @XmlElement(name = "StartDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "PlannedDuration")
    protected Duration plannedDuration;
    @XmlElement(name = "OpenDuration")
    protected Duration openDuration;
    @XmlElement(name = "TotalConfirmedDuration")
    protected Duration totalConfirmedDuration;
    @XmlElement(name = "EndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "ConfirmationCompletedIndicator")
    protected Boolean confirmationCompletedIndicator;
    @XmlElement(name = "ConfirmationGroupUUID")
    protected UUID confirmationGroupUUID;
    @XmlElement(name = "ResourceUtilization")
    protected List<ProductionLotResources> resourceUtilization;
    @XmlElement(name = "Service")
    protected List<ProductionLotServices> service;

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
     * activityStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ActivityStatus }
     * 
     */
    public ActivityStatus getActivityStatus() {
        return activityStatus;
    }

    /**
     * activityStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ActivityStatus }
     * 
     */
    public void setActivityStatus(ActivityStatus value) {
        this.activityStatus = value;
    }

    /**
     * typeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link OperationActivityTypeCode }
     * 
     */
    public OperationActivityTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * typeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link OperationActivityTypeCode }
     * 
     */
    public void setTypeCode(OperationActivityTypeCode value) {
        this.typeCode = value;
    }

    /**
     * categoryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * categoryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * materialInspectionUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getMaterialInspectionUUID() {
        return materialInspectionUUID;
    }

    /**
     * materialInspectionUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setMaterialInspectionUUID(UUID value) {
        this.materialInspectionUUID = value;
    }

    /**
     * startDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * startDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * plannedDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getPlannedDuration() {
        return plannedDuration;
    }

    /**
     * plannedDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setPlannedDuration(Duration value) {
        this.plannedDuration = value;
    }

    /**
     * openDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getOpenDuration() {
        return openDuration;
    }

    /**
     * openDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setOpenDuration(Duration value) {
        this.openDuration = value;
    }

    /**
     * totalConfirmedDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getTotalConfirmedDuration() {
        return totalConfirmedDuration;
    }

    /**
     * totalConfirmedDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setTotalConfirmedDuration(Duration value) {
        this.totalConfirmedDuration = value;
    }

    /**
     * endDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * endDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * confirmationCompletedIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isConfirmationCompletedIndicator() {
        return confirmationCompletedIndicator;
    }

    /**
     * confirmationCompletedIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setConfirmationCompletedIndicator(Boolean value) {
        this.confirmationCompletedIndicator = value;
    }

    /**
     * confirmationGroupUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getConfirmationGroupUUID() {
        return confirmationGroupUUID;
    }

    /**
     * confirmationGroupUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setConfirmationGroupUUID(UUID value) {
        this.confirmationGroupUUID = value;
    }

    /**
     * Gets the value of the resourceUtilization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * resourceUtilization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getResourceUtilization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotResources }
     * 
     * 
     */
    public List<ProductionLotResources> getResourceUtilization() {
        if (resourceUtilization == null) {
            resourceUtilization = new ArrayList<ProductionLotResources>();
        }
        return this.resourceUtilization;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotServices }
     * 
     * 
     */
    public List<ProductionLotServices> getService() {
        if (service == null) {
            service = new ArrayList<ProductionLotServices>();
        }
        return this.service;
    }

}
