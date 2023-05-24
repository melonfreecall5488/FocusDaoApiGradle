
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
 * ProductionLotInspectionDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotInspectionDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EvaluationMode" type="{http://sap.com/xi/AP/Common/GDT}InspectionResultEvaluationTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="InspectedQuantity" type="{http://sap.com/xi/AP/Common/GDT}NONNEGATIVE_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="DestructedQuantity" type="{http://sap.com/xi/AP/Common/GDT}NONNEGATIVE_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="NonConformingUnits" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="InspectedBy" type="{http://sap.com/xi/AP/Common/GDT}EmployeeID" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *         &lt;element name="ProposedEvaluation" type="{http://sap.com/xi/AP/Common/GDT}AcceptanceStatusCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotInspectionDetails", propOrder = {
        "evaluationMode",
        "inspectedQuantity",
        "destructedQuantity",
        "nonConformingUnits",
        "inspectedBy",
        "employeeName",
        "proposedEvaluation"
})
public class ProductionLotInspectionDetails {

    @XmlElement(name = "EvaluationMode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String evaluationMode;
    @XmlElement(name = "InspectedQuantity")
    protected NONNEGATIVEQuantity inspectedQuantity;
    @XmlElement(name = "DestructedQuantity")
    protected NONNEGATIVEQuantity destructedQuantity;
    @XmlElement(name = "NonConformingUnits")
    protected Integer nonConformingUnits;
    @XmlElement(name = "InspectedBy")
    protected EmployeeID inspectedBy;
    @XmlElement(name = "EmployeeName")
    protected String employeeName;
    @XmlElement(name = "ProposedEvaluation")
    @XmlSchemaType(name = "token")
    protected AcceptanceStatusCode proposedEvaluation;

    /**
     * evaluationMode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getEvaluationMode() {
        return evaluationMode;
    }

    /**
     * evaluationMode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setEvaluationMode(String value) {
        this.evaluationMode = value;
    }

    /**
     * inspectedQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link NONNEGATIVEQuantity }
     * 
     */
    public NONNEGATIVEQuantity getInspectedQuantity() {
        return inspectedQuantity;
    }

    /**
     * inspectedQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link NONNEGATIVEQuantity }
     * 
     */
    public void setInspectedQuantity(NONNEGATIVEQuantity value) {
        this.inspectedQuantity = value;
    }

    /**
     * destructedQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link NONNEGATIVEQuantity }
     * 
     */
    public NONNEGATIVEQuantity getDestructedQuantity() {
        return destructedQuantity;
    }

    /**
     * destructedQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link NONNEGATIVEQuantity }
     * 
     */
    public void setDestructedQuantity(NONNEGATIVEQuantity value) {
        this.destructedQuantity = value;
    }

    /**
     * nonConformingUnits 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getNonConformingUnits() {
        return nonConformingUnits;
    }

    /**
     * nonConformingUnits 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setNonConformingUnits(Integer value) {
        this.nonConformingUnits = value;
    }

    /**
     * inspectedBy 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link EmployeeID }
     * 
     */
    public EmployeeID getInspectedBy() {
        return inspectedBy;
    }

    /**
     * inspectedBy 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link EmployeeID }
     * 
     */
    public void setInspectedBy(EmployeeID value) {
        this.inspectedBy = value;
    }

    /**
     * employeeName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * employeeName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setEmployeeName(String value) {
        this.employeeName = value;
    }

    /**
     * proposedEvaluation 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link AcceptanceStatusCode }
     * 
     */
    public AcceptanceStatusCode getProposedEvaluation() {
        return proposedEvaluation;
    }

    /**
     * proposedEvaluation 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link AcceptanceStatusCode }
     * 
     */
    public void setProposedEvaluation(AcceptanceStatusCode value) {
        this.proposedEvaluation = value;
    }

}
