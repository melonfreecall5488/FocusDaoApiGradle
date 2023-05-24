
package com.smart.focus.ceoapi.wsdl2.consumptionCostCEO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConsumptionCostCBOQueryByElementsSimpleByRequestMessage_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionCostCBOQueryByElementsSimpleByRequestMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumptionCostCBOSimpleSelectionBy" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequest"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}QueryProcessingConditions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionCostCBOQueryByElementsSimpleByRequestMessage_sync", propOrder = {
    "consumptionCostCBOSimpleSelectionBy",
    "processingConditions"
})
public class ConsumptionCostCBOQueryByElementsSimpleByRequestMessageSync {

    @XmlElement(name = "ConsumptionCostCBOSimpleSelectionBy", required = true)
    protected ConsumptionCostCBOQueryByElementsSimpleByRequest consumptionCostCBOSimpleSelectionBy;
    @XmlElement(name = "ProcessingConditions", required = true)
    protected QueryProcessingConditions processingConditions;

    /**
     * consumptionCostCBOSimpleSelectionBy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionCostCBOQueryByElementsSimpleByRequest }
     *     
     */
    public ConsumptionCostCBOQueryByElementsSimpleByRequest getConsumptionCostCBOSimpleSelectionBy() {
        return consumptionCostCBOSimpleSelectionBy;
    }

    /**
     * consumptionCostCBOSimpleSelectionBy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionCostCBOQueryByElementsSimpleByRequest }
     *     
     */
    public void setConsumptionCostCBOSimpleSelectionBy(ConsumptionCostCBOQueryByElementsSimpleByRequest value) {
        this.consumptionCostCBOSimpleSelectionBy = value;
    }

    /**
     * processingConditions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link QueryProcessingConditions }
     *     
     */
    public QueryProcessingConditions getProcessingConditions() {
        return processingConditions;
    }

    /**
     * processingConditions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryProcessingConditions }
     *     
     */
    public void setProcessingConditions(QueryProcessingConditions value) {
        this.processingConditions = value;
    }

}
