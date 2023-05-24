
package com.smart.focus.ceoapi.wsdl2.product_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * MaterialOutputInspectionDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialOutputInspectionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InspectionId" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="InspectionTypeCode" type="{http://sap.com/xi/AP/Common/GDT}InspectionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}MaterialInspectionLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="InspectionSamplingDetails" type="{http://sap.com/xi/A1S/Global}InspectionSamplingDetails" minOccurs="0"/&gt;
 *         &lt;element name="InspectionDetails" type="{http://sap.com/xi/A1S/Global}ProductionLotInspectionDetails" minOccurs="0"/&gt;
 *         &lt;element name="InspectionDefects" type="{http://sap.com/xi/A1S/Global}ProductionLotDefects" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialOutputInspectionDetails", propOrder = {
        "inspectionId",
        "inspectionTypeCode",
        "lifeCycleStatusCode",
        "inspectionSamplingDetails",
        "inspectionDetails",
        "inspectionDefects"
})
public class MaterialOutputInspectionDetails {

    @XmlElement(name = "InspectionId")
    protected BusinessTransactionDocumentID inspectionId;
    @XmlElement(name = "InspectionTypeCode")
    protected InspectionTypeCode inspectionTypeCode;
    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "InspectionSamplingDetails")
    protected InspectionSamplingDetails inspectionSamplingDetails;
    @XmlElement(name = "InspectionDetails")
    protected ProductionLotInspectionDetails inspectionDetails;
    @XmlElement(name = "InspectionDefects")
    protected ProductionLotDefects inspectionDefects;

    /**
     * inspectionId 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessTransactionDocumentID }
     * 
     */
    public BusinessTransactionDocumentID getInspectionId() {
        return inspectionId;
    }

    /**
     * inspectionId 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessTransactionDocumentID }
     * 
     */
    public void setInspectionId(BusinessTransactionDocumentID value) {
        this.inspectionId = value;
    }

    /**
     * inspectionTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link InspectionTypeCode }
     * 
     */
    public InspectionTypeCode getInspectionTypeCode() {
        return inspectionTypeCode;
    }

    /**
     * inspectionTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link InspectionTypeCode }
     * 
     */
    public void setInspectionTypeCode(InspectionTypeCode value) {
        this.inspectionTypeCode = value;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setLifeCycleStatusCode(String value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * inspectionSamplingDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link InspectionSamplingDetails }
     * 
     */
    public InspectionSamplingDetails getInspectionSamplingDetails() {
        return inspectionSamplingDetails;
    }

    /**
     * inspectionSamplingDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link InspectionSamplingDetails }
     * 
     */
    public void setInspectionSamplingDetails(InspectionSamplingDetails value) {
        this.inspectionSamplingDetails = value;
    }

    /**
     * inspectionDetails 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductionLotInspectionDetails }
     * 
     */
    public ProductionLotInspectionDetails getInspectionDetails() {
        return inspectionDetails;
    }

    /**
     * inspectionDetails 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductionLotInspectionDetails }
     * 
     */
    public void setInspectionDetails(ProductionLotInspectionDetails value) {
        this.inspectionDetails = value;
    }

    /**
     * inspectionDefects 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductionLotDefects }
     * 
     */
    public ProductionLotDefects getInspectionDefects() {
        return inspectionDefects;
    }

    /**
     * inspectionDefects 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductionLotDefects }
     * 
     */
    public void setInspectionDefects(ProductionLotDefects value) {
        this.inspectionDefects = value;
    }

}
