
package com.smart.focus.ceoapi.wsdl2.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SupplierByElementsQueryMessage_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsQueryMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SupplierSelectionByElements" type="{http://sap.com/xi/A1S/Global}SupplierByElementsQuerySelectionByElements" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}QueryProcessingConditions" minOccurs="0"/&gt;
 *         &lt;element name="RequestedElements" type="{http://sap.com/xi/A1S/Global}SupplierByElementsQueryRequestedElements" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsQueryMessage_sync", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "supplierSelectionByElements",
        "processingConditions",
        "requestedElements"
})
public class SupplierByElementsQueryMessageSync {

    @XmlElement(name = "SupplierSelectionByElements")
    protected SupplierByElementsQuerySelectionByElements supplierSelectionByElements;
    @XmlElement(name = "ProcessingConditions")
    protected QueryProcessingConditions processingConditions;
    @XmlElement(name = "RequestedElements")
    protected SupplierByElementsQueryRequestedElements requestedElements;

    /**
     * supplierSelectionByElements 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SupplierByElementsQuerySelectionByElements }
     * 
     */
    public SupplierByElementsQuerySelectionByElements getSupplierSelectionByElements() {
        return supplierSelectionByElements;
    }

    /**
     * supplierSelectionByElements 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SupplierByElementsQuerySelectionByElements }
     * 
     */
    public void setSupplierSelectionByElements(SupplierByElementsQuerySelectionByElements value) {
        this.supplierSelectionByElements = value;
    }

    /**
     * processingConditions 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link QueryProcessingConditions }
     * 
     */
    public QueryProcessingConditions getProcessingConditions() {
        return processingConditions;
    }

    /**
     * processingConditions 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link QueryProcessingConditions }
     * 
     */
    public void setProcessingConditions(QueryProcessingConditions value) {
        this.processingConditions = value;
    }

    /**
     * requestedElements 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SupplierByElementsQueryRequestedElements }
     * 
     */
    public SupplierByElementsQueryRequestedElements getRequestedElements() {
        return requestedElements;
    }

    /**
     * requestedElements 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SupplierByElementsQueryRequestedElements }
     * 
     */
    public void setRequestedElements(SupplierByElementsQueryRequestedElements value) {
        this.requestedElements = value;
    }

}
