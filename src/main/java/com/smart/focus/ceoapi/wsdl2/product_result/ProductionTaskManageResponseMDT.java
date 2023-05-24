
package com.smart.focus.ceoapi.wsdl2.product_result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * ProductionTaskManageResponseMDT complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionTaskManageResponseMDT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductionTaskID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="ProducionTaskUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="OperationTypeCode" type="{http://sap.com/xi/AP/Common/GDT}OperationTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="OperationActivityTypeCode" type="{http://sap.com/xi/AP/Common/GDT}OperationActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ResourceUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ProcessorEmployeeID" type="{http://sap.com/xi/AP/Common/GDT}EmployeeID" minOccurs="0"/&gt;
 *         &lt;element name="ExecutionDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationCompletedRequiredIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="RestartOfTaskIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="AssignResponsibleIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ProcessedOnDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionTaskManageResponseMDT", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "productionTaskID",
        "producionTaskUUID",
        "operationTypeCode",
        "operationActivityTypeCode",
        "resourceUUID",
        "processorEmployeeID",
        "executionDateTime",
        "confirmationCompletedRequiredIndicator",
        "restartOfTaskIndicator",
        "assignResponsibleIndicator",
        "processedOnDateTime"
})
public class ProductionTaskManageResponseMDT {

    @XmlElement(name = "ProductionTaskID")
    protected BusinessTransactionDocumentID productionTaskID;
    @XmlElement(name = "ProducionTaskUUID")
    protected UUID producionTaskUUID;
    @XmlElement(name = "OperationTypeCode")
    protected OperationTypeCode operationTypeCode;
    @XmlElement(name = "OperationActivityTypeCode")
    protected OperationActivityTypeCode operationActivityTypeCode;
    @XmlElement(name = "ResourceUUID")
    protected UUID resourceUUID;
    @XmlElement(name = "ProcessorEmployeeID")
    protected EmployeeID processorEmployeeID;
    @XmlElement(name = "ExecutionDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar executionDateTime;
    @XmlElement(name = "ConfirmationCompletedRequiredIndicator")
    protected Boolean confirmationCompletedRequiredIndicator;
    @XmlElement(name = "RestartOfTaskIndicator")
    protected Boolean restartOfTaskIndicator;
    @XmlElement(name = "AssignResponsibleIndicator")
    protected Boolean assignResponsibleIndicator;
    @XmlElement(name = "ProcessedOnDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processedOnDateTime;

    /**
     * productionTaskID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessTransactionDocumentID }
     * 
     */
    public BusinessTransactionDocumentID getProductionTaskID() {
        return productionTaskID;
    }

    /**
     * productionTaskID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessTransactionDocumentID }
     * 
     */
    public void setProductionTaskID(BusinessTransactionDocumentID value) {
        this.productionTaskID = value;
    }

    /**
     * producionTaskUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getProducionTaskUUID() {
        return producionTaskUUID;
    }

    /**
     * producionTaskUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setProducionTaskUUID(UUID value) {
        this.producionTaskUUID = value;
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
     * operationActivityTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link OperationActivityTypeCode }
     * 
     */
    public OperationActivityTypeCode getOperationActivityTypeCode() {
        return operationActivityTypeCode;
    }

    /**
     * operationActivityTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link OperationActivityTypeCode }
     * 
     */
    public void setOperationActivityTypeCode(OperationActivityTypeCode value) {
        this.operationActivityTypeCode = value;
    }

    /**
     * resourceUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getResourceUUID() {
        return resourceUUID;
    }

    /**
     * resourceUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setResourceUUID(UUID value) {
        this.resourceUUID = value;
    }

    /**
     * processorEmployeeID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link EmployeeID }
     * 
     */
    public EmployeeID getProcessorEmployeeID() {
        return processorEmployeeID;
    }

    /**
     * processorEmployeeID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link EmployeeID }
     * 
     */
    public void setProcessorEmployeeID(EmployeeID value) {
        this.processorEmployeeID = value;
    }

    /**
     * executionDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getExecutionDateTime() {
        return executionDateTime;
    }

    /**
     * executionDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setExecutionDateTime(XMLGregorianCalendar value) {
        this.executionDateTime = value;
    }

    /**
     * confirmationCompletedRequiredIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isConfirmationCompletedRequiredIndicator() {
        return confirmationCompletedRequiredIndicator;
    }

    /**
     * confirmationCompletedRequiredIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setConfirmationCompletedRequiredIndicator(Boolean value) {
        this.confirmationCompletedRequiredIndicator = value;
    }

    /**
     * restartOfTaskIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isRestartOfTaskIndicator() {
        return restartOfTaskIndicator;
    }

    /**
     * restartOfTaskIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setRestartOfTaskIndicator(Boolean value) {
        this.restartOfTaskIndicator = value;
    }

    /**
     * assignResponsibleIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isAssignResponsibleIndicator() {
        return assignResponsibleIndicator;
    }

    /**
     * assignResponsibleIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setAssignResponsibleIndicator(Boolean value) {
        this.assignResponsibleIndicator = value;
    }

    /**
     * processedOnDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getProcessedOnDateTime() {
        return processedOnDateTime;
    }

    /**
     * processedOnDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setProcessedOnDateTime(XMLGregorianCalendar value) {
        this.processedOnDateTime = value;
    }

}
