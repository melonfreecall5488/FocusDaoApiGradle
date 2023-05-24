
package com.smart.focus.ceoapi.wsdl2.input_list;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * SiteLogisticsTaskByElementsResponse_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskByElementsResponse_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteLogisticsTaskID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="SiteLogisticsTaskUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="OperationTypeCode" type="{http://sap.com/xi/AP/Common/GDT}OperationTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BusinessTransactionDocumentReferenceID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="SiteLogisticsTaskReferencedObject" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskReferencedObject" minOccurs="0"/&gt;
 *         &lt;element name="CustomerParty" type="{http://sap.com/xi/AP/LogisticsExecution/Global}SiteLogisticsTaskReferncedCustomerParty" minOccurs="0"/&gt;
 *         &lt;element name="EarliestExecutionStartDate" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LatestExecutionEndDate" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskByElementsResponse_sync", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "siteLogisticsTaskID",
        "siteLogisticsTaskUUID",
        "operationTypeCode",
        "businessTransactionDocumentReferenceID",
        "siteLogisticsTaskReferencedObject",
        "customerParty",
        "earliestExecutionStartDate",
        "latestExecutionEndDate"
})
public class SiteLogisticsTaskByElementsResponseSync {

    @XmlElement(name = "SiteLogisticsTaskID")
    protected BusinessTransactionDocumentID siteLogisticsTaskID;
    @XmlElement(name = "SiteLogisticsTaskUUID")
    protected UUID siteLogisticsTaskUUID;
    @XmlElement(name = "OperationTypeCode")
    protected OperationTypeCode operationTypeCode;
    @XmlElement(name = "BusinessTransactionDocumentReferenceID")
    protected BusinessTransactionDocumentID businessTransactionDocumentReferenceID;
    @XmlElement(name = "SiteLogisticsTaskReferencedObject")
    protected SiteLogisticsTaskReferencedObject siteLogisticsTaskReferencedObject;
    @XmlElement(name = "CustomerParty")
    protected SiteLogisticsTaskReferncedCustomerParty customerParty;
    @XmlElement(name = "EarliestExecutionStartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestExecutionStartDate;
    @XmlElement(name = "LatestExecutionEndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestExecutionEndDate;

    /**
     * siteLogisticsTaskID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessTransactionDocumentID }
     * 
     */
    public BusinessTransactionDocumentID getSiteLogisticsTaskID() {
        return siteLogisticsTaskID;
    }

    /**
     * siteLogisticsTaskID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessTransactionDocumentID }
     * 
     */
    public void setSiteLogisticsTaskID(BusinessTransactionDocumentID value) {
        this.siteLogisticsTaskID = value;
    }

    /**
     * siteLogisticsTaskUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getSiteLogisticsTaskUUID() {
        return siteLogisticsTaskUUID;
    }

    /**
     * siteLogisticsTaskUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setSiteLogisticsTaskUUID(UUID value) {
        this.siteLogisticsTaskUUID = value;
    }

    /**
     * operationTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link OperationTypeCode }
     * 
     */
    public OperationTypeCode getOperationTypeCode() {
        return operationTypeCode;
    }

    /**
     * operationTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link OperationTypeCode }
     * 
     */
    public void setOperationTypeCode(OperationTypeCode value) {
        this.operationTypeCode = value;
    }

    /**
     * businessTransactionDocumentReferenceID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessTransactionDocumentID }
     * 
     */
    public BusinessTransactionDocumentID getBusinessTransactionDocumentReferenceID() {
        return businessTransactionDocumentReferenceID;
    }

    /**
     * businessTransactionDocumentReferenceID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessTransactionDocumentID }
     * 
     */
    public void setBusinessTransactionDocumentReferenceID(BusinessTransactionDocumentID value) {
        this.businessTransactionDocumentReferenceID = value;
    }

    /**
     * siteLogisticsTaskReferencedObject 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SiteLogisticsTaskReferencedObject }
     * 
     */
    public SiteLogisticsTaskReferencedObject getSiteLogisticsTaskReferencedObject() {
        return siteLogisticsTaskReferencedObject;
    }

    /**
     * siteLogisticsTaskReferencedObject 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SiteLogisticsTaskReferencedObject }
     * 
     */
    public void setSiteLogisticsTaskReferencedObject(SiteLogisticsTaskReferencedObject value) {
        this.siteLogisticsTaskReferencedObject = value;
    }

    /**
     * customerParty 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SiteLogisticsTaskReferncedCustomerParty }
     * 
     */
    public SiteLogisticsTaskReferncedCustomerParty getCustomerParty() {
        return customerParty;
    }

    /**
     * customerParty 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SiteLogisticsTaskReferncedCustomerParty }
     * 
     */
    public void setCustomerParty(SiteLogisticsTaskReferncedCustomerParty value) {
        this.customerParty = value;
    }

    /**
     * earliestExecutionStartDate 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getEarliestExecutionStartDate() {
        return earliestExecutionStartDate;
    }

    /**
     * earliestExecutionStartDate 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setEarliestExecutionStartDate(XMLGregorianCalendar value) {
        this.earliestExecutionStartDate = value;
    }

    /**
     * latestExecutionEndDate 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getLatestExecutionEndDate() {
        return latestExecutionEndDate;
    }

    /**
     * latestExecutionEndDate 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setLatestExecutionEndDate(XMLGregorianCalendar value) {
        this.latestExecutionEndDate = value;
    }

}
