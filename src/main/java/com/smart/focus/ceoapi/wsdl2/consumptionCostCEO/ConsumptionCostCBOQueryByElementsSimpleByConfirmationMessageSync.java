
package com.smart.focus.ceoapi.wsdl2.consumptionCostCEO;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConsumptionCostCBOQueryByElementsSimpleByConfirmationMessage_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionCostCBOQueryByElementsSimpleByConfirmationMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumptionCostCBO" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByConfirmation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}ResponseProcessingConditions"/&gt;
 *         &lt;element name="Log" type="{http://sap.com/xi/AP/Common/GDT}Log"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionCostCBOQueryByElementsSimpleByConfirmationMessage_sync", propOrder = {
    "consumptionCostCBO",
    "processingConditions",
    "log"
})
public class ConsumptionCostCBOQueryByElementsSimpleByConfirmationMessageSync {

    @XmlElement(name = "ConsumptionCostCBO")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByConfirmation> consumptionCostCBO;
    @XmlElement(name = "ProcessingConditions", required = true)
    protected ResponseProcessingConditions processingConditions;
    @XmlElement(name = "Log", required = true)
    protected Log log;

    /**
     * Gets the value of the consumptionCostCBO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consumptionCostCBO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsumptionCostCBO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByConfirmation }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByConfirmation> getConsumptionCostCBO() {
        if (consumptionCostCBO == null) {
            consumptionCostCBO = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByConfirmation>();
        }
        return this.consumptionCostCBO;
    }

    /**
     * processingConditions 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ResponseProcessingConditions }
     *     
     */
    public ResponseProcessingConditions getProcessingConditions() {
        return processingConditions;
    }

    /**
     * processingConditions 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseProcessingConditions }
     *     
     */
    public void setProcessingConditions(ResponseProcessingConditions value) {
        this.processingConditions = value;
    }

    /**
     * log 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * log 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
    }

}
