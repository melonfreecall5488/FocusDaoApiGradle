
package com.smart.focus.ceoapi.wsdl2.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * CustomerByIdentificationQueryMessage_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerByIdentificationQueryMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerSelectionByIdentification" type="{http://sap.com/xi/A1S/Global}CustomerSelectionByIdentification" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}QueryProcessingConditions" minOccurs="0"/&gt;
 *         &lt;element name="RequestedElements" type="{http://sap.com/xi/A1S/Global}CustomerRequestedElements" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerByIdentificationQueryMessage_sync", propOrder = {
        "customerSelectionByIdentification",
        "processingConditions",
        "requestedElements"
})
public class CustomerByIdentificationQueryMessageSync {

    @XmlElement(name = "CustomerSelectionByIdentification")
    protected CustomerSelectionByIdentification customerSelectionByIdentification;
    @XmlElement(name = "ProcessingConditions")
    protected QueryProcessingConditions processingConditions;
    @XmlElement(name = "RequestedElements")
    protected CustomerRequestedElements requestedElements;

    /**
     * customerSelectionByIdentification 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CustomerSelectionByIdentification }
     * 
     */
    public CustomerSelectionByIdentification getCustomerSelectionByIdentification() {
        return customerSelectionByIdentification;
    }

    /**
     * customerSelectionByIdentification 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CustomerSelectionByIdentification }
     * 
     */
    public void setCustomerSelectionByIdentification(CustomerSelectionByIdentification value) {
        this.customerSelectionByIdentification = value;
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
     *         {@link CustomerRequestedElements }
     * 
     */
    public CustomerRequestedElements getRequestedElements() {
        return requestedElements;
    }

    /**
     * requestedElements 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CustomerRequestedElements }
     * 
     */
    public void setRequestedElements(CustomerRequestedElements value) {
        this.requestedElements = value;
    }

}
