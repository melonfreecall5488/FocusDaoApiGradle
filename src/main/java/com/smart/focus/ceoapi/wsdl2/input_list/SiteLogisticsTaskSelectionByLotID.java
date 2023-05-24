
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
 * SiteLogisticsTaskSelectionByLotID complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskSelectionByLotID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="LowerBoundaryReferenceDocumentID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryReferenceDocumentID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskSelectionByLotID", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "inclusionExclusionCode",
        "intervalBoundaryTypeCode",
        "lowerBoundaryReferenceDocumentID",
        "upperBoundaryReferenceDocumentID"
})
public class SiteLogisticsTaskSelectionByLotID {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryReferenceDocumentID")
    protected BusinessTransactionDocumentID lowerBoundaryReferenceDocumentID;
    @XmlElement(name = "UpperBoundaryReferenceDocumentID")
    protected BusinessTransactionDocumentID upperBoundaryReferenceDocumentID;

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
     * lowerBoundaryReferenceDocumentID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessTransactionDocumentID }
     * 
     */
    public BusinessTransactionDocumentID getLowerBoundaryReferenceDocumentID() {
        return lowerBoundaryReferenceDocumentID;
    }

    /**
     * lowerBoundaryReferenceDocumentID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessTransactionDocumentID }
     * 
     */
    public void setLowerBoundaryReferenceDocumentID(BusinessTransactionDocumentID value) {
        this.lowerBoundaryReferenceDocumentID = value;
    }

    /**
     * upperBoundaryReferenceDocumentID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessTransactionDocumentID }
     * 
     */
    public BusinessTransactionDocumentID getUpperBoundaryReferenceDocumentID() {
        return upperBoundaryReferenceDocumentID;
    }

    /**
     * upperBoundaryReferenceDocumentID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessTransactionDocumentID }
     * 
     */
    public void setUpperBoundaryReferenceDocumentID(BusinessTransactionDocumentID value) {
        this.upperBoundaryReferenceDocumentID = value;
    }

}
