
package com.smart.focus.ceoapi.wsdl2.product_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * ProductionLotDefects complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotDefects"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefectCode" type="{http://sap.com/xi/AP/Common/GDT}QualityIssueCategoryID" minOccurs="0"/&gt;
 *         &lt;element name="DefectName" type="{http://sap.com/xi/AP/Common/GDT}MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="DefectDescription" type="{http://sap.com/xi/AP/Common/GDT}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfDefects" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="InternalDefects" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="ChangedOn" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ChangedBy" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotDefects", propOrder = {
        "defectCode",
        "defectName",
        "defectDescription",
        "numberOfDefects",
        "internalDefects",
        "changedOn",
        "changedBy"
})
public class ProductionLotDefects {

    @XmlElement(name = "DefectCode")
    protected QualityIssueCategoryID defectCode;
    @XmlElement(name = "DefectName")
    protected MEDIUMName defectName;
    @XmlElement(name = "DefectDescription")
    protected MEDIUMDescription defectDescription;
    @XmlElement(name = "NumberOfDefects")
    protected Integer numberOfDefects;
    @XmlElement(name = "InternalDefects")
    protected Integer internalDefects;
    @XmlElement(name = "ChangedOn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedOn;
    @XmlElement(name = "ChangedBy")
    protected String changedBy;

    /**
     * defectCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link QualityIssueCategoryID }
     * 
     */
    public QualityIssueCategoryID getDefectCode() {
        return defectCode;
    }

    /**
     * defectCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link QualityIssueCategoryID }
     * 
     */
    public void setDefectCode(QualityIssueCategoryID value) {
        this.defectCode = value;
    }

    /**
     * defectName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link MEDIUMName }
     * 
     */
    public MEDIUMName getDefectName() {
        return defectName;
    }

    /**
     * defectName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link MEDIUMName }
     * 
     */
    public void setDefectName(MEDIUMName value) {
        this.defectName = value;
    }

    /**
     * defectDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link MEDIUMDescription }
     * 
     */
    public MEDIUMDescription getDefectDescription() {
        return defectDescription;
    }

    /**
     * defectDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link MEDIUMDescription }
     * 
     */
    public void setDefectDescription(MEDIUMDescription value) {
        this.defectDescription = value;
    }

    /**
     * numberOfDefects 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getNumberOfDefects() {
        return numberOfDefects;
    }

    /**
     * numberOfDefects 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setNumberOfDefects(Integer value) {
        this.numberOfDefects = value;
    }

    /**
     * internalDefects 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getInternalDefects() {
        return internalDefects;
    }

    /**
     * internalDefects 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setInternalDefects(Integer value) {
        this.internalDefects = value;
    }

    /**
     * changedOn 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getChangedOn() {
        return changedOn;
    }

    /**
     * changedOn 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setChangedOn(XMLGregorianCalendar value) {
        this.changedOn = value;
    }

    /**
     * changedBy 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getChangedBy() {
        return changedBy;
    }

    /**
     * changedBy 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setChangedBy(String value) {
        this.changedBy = value;
    }

}
