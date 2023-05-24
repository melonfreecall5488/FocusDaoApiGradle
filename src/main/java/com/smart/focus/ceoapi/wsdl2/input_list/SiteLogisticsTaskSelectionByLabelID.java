
package com.smart.focus.ceoapi.wsdl2.input_list;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * SiteLogisticsTaskSelectionByLabelID complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskSelectionByLabelID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="LowerBoundaryLabelID" type="{http://sap.com/xi/AP/Common/GDT}GoodsTagID" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryLabelID" type="{http://sap.com/xi/AP/Common/GDT}GoodsTagID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskSelectionByLabelID", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "inclusionExclusionCode",
        "intervalBoundaryTypeCode",
        "lowerBoundaryLabelID",
        "upperBoundaryLabelID"
})
public class SiteLogisticsTaskSelectionByLabelID {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryLabelID")
    protected GoodsTagID lowerBoundaryLabelID;
    @XmlElement(name = "UpperBoundaryLabelID")
    protected GoodsTagID upperBoundaryLabelID;

    /**
     * inclusionExclusionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getInclusionExclusionCode() {
        return inclusionExclusionCode;
    }

    /**
     * inclusionExclusionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setInclusionExclusionCode(String value) {
        this.inclusionExclusionCode = value;
    }

    /**
     * intervalBoundaryTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getIntervalBoundaryTypeCode() {
        return intervalBoundaryTypeCode;
    }

    /**
     * intervalBoundaryTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setIntervalBoundaryTypeCode(String value) {
        this.intervalBoundaryTypeCode = value;
    }

    /**
     * lowerBoundaryLabelID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link GoodsTagID }
     * 
     */
    public GoodsTagID getLowerBoundaryLabelID() {
        return lowerBoundaryLabelID;
    }

    /**
     * lowerBoundaryLabelID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link GoodsTagID }
     * 
     */
    public void setLowerBoundaryLabelID(GoodsTagID value) {
        this.lowerBoundaryLabelID = value;
    }

    /**
     * upperBoundaryLabelID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link GoodsTagID }
     * 
     */
    public GoodsTagID getUpperBoundaryLabelID() {
        return upperBoundaryLabelID;
    }

    /**
     * upperBoundaryLabelID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link GoodsTagID }
     * 
     */
    public void setUpperBoundaryLabelID(GoodsTagID value) {
        this.upperBoundaryLabelID = value;
    }

}
