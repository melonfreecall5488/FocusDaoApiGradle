
package com.smart.focus.ceoapi.wsdl2.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * CustomerSelectionByBusinessCharacterCode complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerSelectionByBusinessCharacterCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InclusionExclusionCode" type="{http://sap.com/xi/AP/Common/GDT}InclusionExclusionCode" minOccurs="0"/&gt;
 *         &lt;element name="IntervalBoundaryTypeCode" type="{http://sap.com/xi/AP/Common/GDT}IntervalBoundaryTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="LowerBoundaryBusinessCharacterCode" type="{http://sap.com/xi/AP/Common/GDT}BUSINESSPARTNER_PartyBusinessCharacterCode" minOccurs="0"/&gt;
 *         &lt;element name="UpperBoundaryBusinessCharacterCode" type="{http://sap.com/xi/AP/Common/GDT}BUSINESSPARTNER_PartyBusinessCharacterCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSelectionByBusinessCharacterCode", propOrder = {
        "inclusionExclusionCode",
        "intervalBoundaryTypeCode",
        "lowerBoundaryBusinessCharacterCode",
        "upperBoundaryBusinessCharacterCode"
})
public class CustomerSelectionByBusinessCharacterCode {

    @XmlElement(name = "InclusionExclusionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inclusionExclusionCode;
    @XmlElement(name = "IntervalBoundaryTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String intervalBoundaryTypeCode;
    @XmlElement(name = "LowerBoundaryBusinessCharacterCode")
    protected BUSINESSPARTNERPartyBusinessCharacterCode lowerBoundaryBusinessCharacterCode;
    @XmlElement(name = "UpperBoundaryBusinessCharacterCode")
    protected BUSINESSPARTNERPartyBusinessCharacterCode upperBoundaryBusinessCharacterCode;

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
     * lowerBoundaryBusinessCharacterCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BUSINESSPARTNERPartyBusinessCharacterCode }
     * 
     */
    public BUSINESSPARTNERPartyBusinessCharacterCode getLowerBoundaryBusinessCharacterCode() {
        return lowerBoundaryBusinessCharacterCode;
    }

    /**
     * lowerBoundaryBusinessCharacterCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BUSINESSPARTNERPartyBusinessCharacterCode }
     * 
     */
    public void setLowerBoundaryBusinessCharacterCode(BUSINESSPARTNERPartyBusinessCharacterCode value) {
        this.lowerBoundaryBusinessCharacterCode = value;
    }

    /**
     * upperBoundaryBusinessCharacterCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BUSINESSPARTNERPartyBusinessCharacterCode }
     * 
     */
    public BUSINESSPARTNERPartyBusinessCharacterCode getUpperBoundaryBusinessCharacterCode() {
        return upperBoundaryBusinessCharacterCode;
    }

    /**
     * upperBoundaryBusinessCharacterCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BUSINESSPARTNERPartyBusinessCharacterCode }
     * 
     */
    public void setUpperBoundaryBusinessCharacterCode(BUSINESSPARTNERPartyBusinessCharacterCode value) {
        this.upperBoundaryBusinessCharacterCode = value;
    }

}
