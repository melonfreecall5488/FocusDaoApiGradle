
package com.smart.focus.ceoapi.wsdl2.input_list;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SiteLogisticsTaskByElementsQueryMessage complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskByElementsQueryMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteLogisticsTaskSelectionByElements" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskSelectionByElements" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}QueryProcessingConditions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskByElementsQueryMessage", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "siteLogisticsTaskSelectionByElements",
        "processingConditions"
})
public class SiteLogisticsTaskByElementsQueryMessage {

    @XmlElement(name = "SiteLogisticsTaskSelectionByElements")
    protected SiteLogisticsTaskSelectionByElements siteLogisticsTaskSelectionByElements;
    @XmlElement(name = "ProcessingConditions")
    protected QueryProcessingConditions processingConditions;

    /**
     * siteLogisticsTaskSelectionByElements 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SiteLogisticsTaskSelectionByElements }
     * 
     */
    public SiteLogisticsTaskSelectionByElements getSiteLogisticsTaskSelectionByElements() {
        return siteLogisticsTaskSelectionByElements;
    }

    /**
     * siteLogisticsTaskSelectionByElements 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SiteLogisticsTaskSelectionByElements }
     * 
     */
    public void setSiteLogisticsTaskSelectionByElements(SiteLogisticsTaskSelectionByElements value) {
        this.siteLogisticsTaskSelectionByElements = value;
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

}
