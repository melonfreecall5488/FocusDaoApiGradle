
package com.smart.focus.ceoapi.wsdl2.webServiceTask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCD_DISTBROUT complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCD_DISTBROUT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryTCD_DISTBROUT" type="{http://sap.com/xi/AP/Common/GDT}DistributionChannelCode" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryTCD_DISTBROUT" type="{http://sap.com/xi/AP/Common/GDT}DistributionChannelCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCD_DISTBROUT", propOrder = {
    "inclusionExclusionCode",
    "intervalBoundaryTypeCode",
    "lowerBoundaryTCDDISTBROUT",
    "upperBoundaryTCDDISTBROUT"
})
public class MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDDISTBROUT {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryTCD_DISTBROUT")
    protected DistributionChannelCode lowerBoundaryTCDDISTBROUT;
    @XmlElement(name = "UpperBoundaryTCD_DISTBROUT")
    protected DistributionChannelCode upperBoundaryTCDDISTBROUT;

    /**
     * inclusionExclusionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclusionExclusionCode() {
        return inclusionExclusionCode;
    }

    /**
     * inclusionExclusionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclusionExclusionCode(String value) {
        this.inclusionExclusionCode = value;
    }

    /**
     * intervalBoundaryTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntervalBoundaryTypeCode() {
        return intervalBoundaryTypeCode;
    }

    /**
     * intervalBoundaryTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntervalBoundaryTypeCode(String value) {
        this.intervalBoundaryTypeCode = value;
    }

    /**
     * lowerBoundaryTCDDISTBROUT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelCode }
     *     
     */
    public DistributionChannelCode getLowerBoundaryTCDDISTBROUT() {
        return lowerBoundaryTCDDISTBROUT;
    }

    /**
     * lowerBoundaryTCDDISTBROUT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelCode }
     *     
     */
    public void setLowerBoundaryTCDDISTBROUT(DistributionChannelCode value) {
        this.lowerBoundaryTCDDISTBROUT = value;
    }

    /**
     * upperBoundaryTCDDISTBROUT 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelCode }
     *     
     */
    public DistributionChannelCode getUpperBoundaryTCDDISTBROUT() {
        return upperBoundaryTCDDISTBROUT;
    }

    /**
     * upperBoundaryTCDDISTBROUT 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelCode }
     *     
     */
    public void setUpperBoundaryTCDDISTBROUT(DistributionChannelCode value) {
        this.upperBoundaryTCDDISTBROUT = value;
    }

}
