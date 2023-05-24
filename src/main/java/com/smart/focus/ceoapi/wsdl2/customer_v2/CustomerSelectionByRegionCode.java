
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>CustomerSelectionByRegionCode complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerSelectionByRegionCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="LowerBoundaryRegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryRegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSelectionByRegionCode", propOrder = {
    "inclusionExclusionCode",
    "intervalBoundaryTypeCode",
    "lowerBoundaryRegionCode",
    "upperBoundaryRegionCode"
})
public class CustomerSelectionByRegionCode {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryRegionCode")
    protected RegionCode lowerBoundaryRegionCode;
    @XmlElement(name = "UpperBoundaryRegionCode")
    protected RegionCode upperBoundaryRegionCode;

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
     * lowerBoundaryRegionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getLowerBoundaryRegionCode() {
        return lowerBoundaryRegionCode;
    }

    /**
     * lowerBoundaryRegionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setLowerBoundaryRegionCode(RegionCode value) {
        this.lowerBoundaryRegionCode = value;
    }

    /**
     * upperBoundaryRegionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link RegionCode }
     *     
     */
    public RegionCode getUpperBoundaryRegionCode() {
        return upperBoundaryRegionCode;
    }

    /**
     * upperBoundaryRegionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionCode }
     *     
     */
    public void setUpperBoundaryRegionCode(RegionCode value) {
        this.upperBoundaryRegionCode = value;
    }

}
