
package com.smart.focus.ceoapi.wsdl2.webServiceTask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MDR_SiteLogisticTaskQueryByElementsSimpleByRequestMessage_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MDR_SiteLogisticTaskQueryByElementsSimpleByRequestMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MDR_SiteLogisticTaskSimpleSelectionBy" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskQueryByElementsSimpleByRequest"/&gt;
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
@XmlType(name = "MDR_SiteLogisticTaskQueryByElementsSimpleByRequestMessage_sync", propOrder = {
    "mdrSiteLogisticTaskSimpleSelectionBy",
    "processingConditions"
})
public class MDRSiteLogisticTaskQueryByElementsSimpleByRequestMessageSync {

    @XmlElement(name = "MDR_SiteLogisticTaskSimpleSelectionBy", required = true)
    protected MDRSiteLogisticTaskQueryByElementsSimpleByRequest mdrSiteLogisticTaskSimpleSelectionBy;
    @XmlElement(name = "ProcessingConditions", required = true)
    protected QueryProcessingConditions processingConditions;

    /**
     * mdrSiteLogisticTaskSimpleSelectionBy 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDRSiteLogisticTaskQueryByElementsSimpleByRequest }
     *     
     */
    public MDRSiteLogisticTaskQueryByElementsSimpleByRequest getMDRSiteLogisticTaskSimpleSelectionBy() {
        return mdrSiteLogisticTaskSimpleSelectionBy;
    }

    /**
     * mdrSiteLogisticTaskSimpleSelectionBy 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDRSiteLogisticTaskQueryByElementsSimpleByRequest }
     *     
     */
    public void setMDRSiteLogisticTaskSimpleSelectionBy(MDRSiteLogisticTaskQueryByElementsSimpleByRequest value) {
        this.mdrSiteLogisticTaskSimpleSelectionBy = value;
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
