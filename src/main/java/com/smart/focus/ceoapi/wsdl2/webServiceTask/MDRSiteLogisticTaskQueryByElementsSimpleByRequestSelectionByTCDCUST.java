
package com.smart.focus.ceoapi.wsdl2.webServiceTask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCD_CUST complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCD_CUST"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode"/&gt;
 *         &lt;element name="LowerBoundaryTCD_CUST" type="{http://sap.com/xi/AP/Common/GDT}PartyID" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryTCD_CUST" type="{http://sap.com/xi/AP/Common/GDT}PartyID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCD_CUST", propOrder = {
    "inclusionExclusionCode",
    "intervalBoundaryTypeCode",
    "lowerBoundaryTCDCUST",
    "upperBoundaryTCDCUST"
})
public class MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDCUST {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryTCD_CUST")
    protected PartyID lowerBoundaryTCDCUST;
    @XmlElement(name = "UpperBoundaryTCD_CUST")
    protected PartyID upperBoundaryTCDCUST;

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
     * lowerBoundaryTCDCUST 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PartyID }
     *     
     */
    public PartyID getLowerBoundaryTCDCUST() {
        return lowerBoundaryTCDCUST;
    }

    /**
     * lowerBoundaryTCDCUST 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyID }
     *     
     */
    public void setLowerBoundaryTCDCUST(PartyID value) {
        this.lowerBoundaryTCDCUST = value;
    }

    /**
     * upperBoundaryTCDCUST 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PartyID }
     *     
     */
    public PartyID getUpperBoundaryTCDCUST() {
        return upperBoundaryTCDCUST;
    }

    /**
     * upperBoundaryTCDCUST 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyID }
     *     
     */
    public void setUpperBoundaryTCDCUST(PartyID value) {
        this.upperBoundaryTCDCUST = value;
    }

}
