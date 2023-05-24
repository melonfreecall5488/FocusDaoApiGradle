
package com.smart.focus.ceoapi.wsdl2.input_send;

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
 * SiteLogisticsTaskMaintainBundleRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskMaintainBundleRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteLogisticTaskID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="SiteLogisticTaskUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ActualExecutionOn" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="PlannedStartDate" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualDeliveryDate" type="{http://sap.com/xi/AP/Common/GDT}UPPEROPEN_LOCALNORMALISED_DateTimePeriod" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceObject" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskReferenceObjectManageBundle_Request" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskMaintainBundleRequest", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "siteLogisticTaskID",
        "siteLogisticTaskUUID",
        "actualExecutionOn",
        "plannedStartDate",
        "actualDeliveryDate",
        "referenceObject"
})
public class SiteLogisticsTaskMaintainBundleRequest {

    @XmlElement(name = "SiteLogisticTaskID")
    protected BusinessTransactionDocumentID siteLogisticTaskID;
    @XmlElement(name = "SiteLogisticTaskUUID")
    protected UUID siteLogisticTaskUUID;
    @XmlElement(name = "ActualExecutionOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualExecutionOn;
    @XmlElement(name = "PlannedStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plannedStartDate;
    @XmlElement(name = "ActualDeliveryDate")
    protected UPPEROPENLOCALNORMALISEDDateTimePeriod actualDeliveryDate;
    @XmlElement(name = "ReferenceObject")
    protected List<SiteLogisticsTaskReferenceObjectManageBundleRequest> referenceObject;

    /**
     * siteLogisticTaskID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessTransactionDocumentID }
     * 
     */
    public BusinessTransactionDocumentID getSiteLogisticTaskID() {
        return siteLogisticTaskID;
    }

    /**
     * siteLogisticTaskID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessTransactionDocumentID }
     * 
     */
    public void setSiteLogisticTaskID(BusinessTransactionDocumentID value) {
        this.siteLogisticTaskID = value;
    }

    /**
     * siteLogisticTaskUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getSiteLogisticTaskUUID() {
        return siteLogisticTaskUUID;
    }

    /**
     * siteLogisticTaskUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setSiteLogisticTaskUUID(UUID value) {
        this.siteLogisticTaskUUID = value;
    }

    /**
     * actualExecutionOn 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getActualExecutionOn() {
        return actualExecutionOn;
    }

    /**
     * actualExecutionOn 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setActualExecutionOn(XMLGregorianCalendar value) {
        this.actualExecutionOn = value;
    }

    /**
     * plannedStartDate 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getPlannedStartDate() {
        return plannedStartDate;
    }

    /**
     * plannedStartDate 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setPlannedStartDate(XMLGregorianCalendar value) {
        this.plannedStartDate = value;
    }

    /**
     * actualDeliveryDate 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UPPEROPENLOCALNORMALISEDDateTimePeriod }
     * 
     */
    public UPPEROPENLOCALNORMALISEDDateTimePeriod getActualDeliveryDate() {
        return actualDeliveryDate;
    }

    /**
     * actualDeliveryDate 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UPPEROPENLOCALNORMALISEDDateTimePeriod }
     * 
     */
    public void setActualDeliveryDate(UPPEROPENLOCALNORMALISEDDateTimePeriod value) {
        this.actualDeliveryDate = value;
    }

    /**
     * Gets the value of the referenceObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceObject
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getReferenceObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskReferenceObjectManageBundleRequest }
     * 
     * 
     */
    public List<SiteLogisticsTaskReferenceObjectManageBundleRequest> getReferenceObject() {
        if (referenceObject == null) {
            referenceObject = new ArrayList<SiteLogisticsTaskReferenceObjectManageBundleRequest>();
        }
        return this.referenceObject;
    }

}
