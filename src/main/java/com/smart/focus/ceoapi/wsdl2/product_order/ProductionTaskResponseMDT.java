
package com.smart.focus.ceoapi.wsdl2.product_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ProductionTaskResponseMDT complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionTaskResponseMDT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductionTaskID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="ProducionTaskUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="OperationTypeCode" type="{http://sap.com/xi/AP/Common/GDT}OperationTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="OperationActivityTypeCode" type="{http://sap.com/xi/AP/Common/GDT}OperationActivityTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ResourceUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://sap.com/xi/AP/LogisticsExecution/Global}LogisticsTaskStatus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionTaskResponseMDT", propOrder = {
        "productionTaskID",
        "producionTaskUUID",
        "operationTypeCode",
        "operationActivityTypeCode",
        "resourceUUID",
        "status"
})
public class ProductionTaskResponseMDT {

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
    @XmlElement(name = "Status")
    protected LogisticsTaskStatus status;

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
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link LogisticsTaskStatus }
     * 
     */
    public LogisticsTaskStatus getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link LogisticsTaskStatus }
     * 
     */
    public void setStatus(LogisticsTaskStatus value) {
        this.status = value;
    }

}
