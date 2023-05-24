
package com.smart.focus.ceoapi.wsdl2.product_result;

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

/**
 * <p>
 * ActivityResponseManageMDT complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ActivityResponseManageMDT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActivityID" type="{http://sap.com/xi/AP/Common/GDT}OperationActivityID" minOccurs="0"/&gt;
 *         &lt;element name="ActivityUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}OperationActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}OperationActivityCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationCompletedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ResourceUtilization" type="{http://sap.com/xi/A1S/Global}ProductionLotActivityMaintainResources" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmDuration" type="{http://sap.com/xi/AP/Common/GDT}TIME_Duration" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationMethodCode" type="{http://sap.com/xi/AP/Common/GDT}LogisticsConfirmationMethodCode" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://sap.com/xi/A1S/Global}ProductionLotActivityServices" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityResponseManageMDT", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "activityID",
        "activityUUID",
        "typeCode",
        "categoryCode",
        "confirmationCompletedIndicator",
        "resourceUtilization",
        "confirmDuration",
        "confirmationMethodCode",
        "service"
})
public class ActivityResponseManageMDT {

    @XmlElement(name = "ActivityID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String activityID;
    @XmlElement(name = "ActivityUUID")
    protected UUID activityUUID;
    @XmlElement(name = "TypeCode")
    protected OperationActivityTypeCode typeCode;
    @XmlElement(name = "CategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String categoryCode;
    @XmlElement(name = "ConfirmationCompletedIndicator")
    protected Boolean confirmationCompletedIndicator;
    @XmlElement(name = "ResourceUtilization")
    protected List<ProductionLotActivityMaintainResources> resourceUtilization;
    @XmlElement(name = "ConfirmDuration")
    protected Duration confirmDuration;
    @XmlElement(name = "ConfirmationMethodCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String confirmationMethodCode;
    @XmlElement(name = "Service")
    protected List<ProductionLotActivityServices> service;

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
     * {@link ProductionLotActivityMaintainResources }
     * 
     * 
     */
    public List<ProductionLotActivityMaintainResources> getResourceUtilization() {
        if (resourceUtilization == null) {
            resourceUtilization = new ArrayList<ProductionLotActivityMaintainResources>();
        }
        return this.resourceUtilization;
    }

    /**
     * confirmDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getConfirmDuration() {
        return confirmDuration;
    }

    /**
     * confirmDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setConfirmDuration(Duration value) {
        this.confirmDuration = value;
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
     * {@link ProductionLotActivityServices }
     * 
     * 
     */
    public List<ProductionLotActivityServices> getService() {
        if (service == null) {
            service = new ArrayList<ProductionLotActivityServices>();
        }
        return this.service;
    }

}
