
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
 * SiteLogisticsLotMaterialInput complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsLotMaterialInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteLogisticsLotMaterialInputUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="SourceLogisticsAreaID" type="{http://sap.com/xi/AP/Common/GDT}LogisticsAreaID" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{http://sap.com/xi/AP/Common/GDT}SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="PlanQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="OpenQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="TotalConfirmedQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="IdentifiedStockID" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockID" minOccurs="0"/&gt;
 *         &lt;element name="ProductSpecificationID" type="{http://sap.com/xi/AP/Common/GDT}RequirementSpecificationID" minOccurs="0"/&gt;
 *         &lt;element name="ProductRequirementSpecificationDescription" type="{http://sap.com/xi/AP/Common/GDT}MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="LogisticsDeviationReasonCode" type="{http://sap.com/xi/AP/Common/GDT}LogisticsDeviationReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="LineItemID" type="{http://sap.com/xi/AP/Common/GDT}OrdinalNumberValue" minOccurs="0"/&gt;
 *         &lt;element name="LogisticPackageInput" type="{http://sap.com/xi/A1S/Global}SiteLogisticsLotLogisticPackageInput" minOccurs="0"/&gt;
 *         &lt;element name="MaterialDeviationStatusCode" type="{http://sap.com/xi/AP/Common/GDT}DeviationStatusCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsLotMaterialInput", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "siteLogisticsLotMaterialInputUUID",
        "sourceLogisticsAreaID",
        "productID",
        "productDescription",
        "planQuantity",
        "openQuantity",
        "confirmQuantity",
        "totalConfirmedQuantity",
        "identifiedStockID",
        "productSpecificationID",
        "productRequirementSpecificationDescription",
        "logisticsDeviationReasonCode",
        "restrictedIndicator",
        "lineItemID",
        "logisticPackageInput",
        "materialDeviationStatusCode"
})
public class SiteLogisticsLotMaterialInput {

    @XmlElement(name = "SiteLogisticsLotMaterialInputUUID")
    protected UUID siteLogisticsLotMaterialInputUUID;
    @XmlElement(name = "SourceLogisticsAreaID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sourceLogisticsAreaID;
    @XmlElement(name = "ProductID")
    protected ProductID productID;
    @XmlElement(name = "ProductDescription")
    protected SHORTDescription productDescription;
    @XmlElement(name = "PlanQuantity")
    protected Quantity planQuantity;
    @XmlElement(name = "OpenQuantity")
    protected Quantity openQuantity;
    @XmlElement(name = "ConfirmQuantity")
    protected Quantity confirmQuantity;
    @XmlElement(name = "TotalConfirmedQuantity")
    protected Quantity totalConfirmedQuantity;
    @XmlElement(name = "IdentifiedStockID")
    protected IdentifiedStockID identifiedStockID;
    @XmlElement(name = "ProductSpecificationID")
    protected RequirementSpecificationID productSpecificationID;
    @XmlElement(name = "ProductRequirementSpecificationDescription")
    protected MEDIUMDescription productRequirementSpecificationDescription;
    @XmlElement(name = "LogisticsDeviationReasonCode")
    protected LogisticsDeviationReasonCode logisticsDeviationReasonCode;
    @XmlElement(name = "RestrictedIndicator")
    protected Boolean restrictedIndicator;
    @XmlElement(name = "LineItemID")
    protected Integer lineItemID;
    @XmlElement(name = "LogisticPackageInput")
    protected SiteLogisticsLotLogisticPackageInput logisticPackageInput;
    @XmlElement(name = "MaterialDeviationStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String materialDeviationStatusCode;

    /**
     * siteLogisticsLotMaterialInputUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getSiteLogisticsLotMaterialInputUUID() {
        return siteLogisticsLotMaterialInputUUID;
    }

    /**
     * siteLogisticsLotMaterialInputUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setSiteLogisticsLotMaterialInputUUID(UUID value) {
        this.siteLogisticsLotMaterialInputUUID = value;
    }

    /**
     * sourceLogisticsAreaID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSourceLogisticsAreaID() {
        return sourceLogisticsAreaID;
    }

    /**
     * sourceLogisticsAreaID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSourceLogisticsAreaID(String value) {
        this.sourceLogisticsAreaID = value;
    }

    /**
     * productID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductID }
     * 
     */
    public ProductID getProductID() {
        return productID;
    }

    /**
     * productID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductID }
     * 
     */
    public void setProductID(ProductID value) {
        this.productID = value;
    }

    /**
     * productDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SHORTDescription }
     * 
     */
    public SHORTDescription getProductDescription() {
        return productDescription;
    }

    /**
     * productDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SHORTDescription }
     * 
     */
    public void setProductDescription(SHORTDescription value) {
        this.productDescription = value;
    }

    /**
     * planQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getPlanQuantity() {
        return planQuantity;
    }

    /**
     * planQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setPlanQuantity(Quantity value) {
        this.planQuantity = value;
    }

    /**
     * openQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getOpenQuantity() {
        return openQuantity;
    }

    /**
     * openQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setOpenQuantity(Quantity value) {
        this.openQuantity = value;
    }

    /**
     * confirmQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getConfirmQuantity() {
        return confirmQuantity;
    }

    /**
     * confirmQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setConfirmQuantity(Quantity value) {
        this.confirmQuantity = value;
    }

    /**
     * totalConfirmedQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getTotalConfirmedQuantity() {
        return totalConfirmedQuantity;
    }

    /**
     * totalConfirmedQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setTotalConfirmedQuantity(Quantity value) {
        this.totalConfirmedQuantity = value;
    }

    /**
     * identifiedStockID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link IdentifiedStockID }
     * 
     */
    public IdentifiedStockID getIdentifiedStockID() {
        return identifiedStockID;
    }

    /**
     * identifiedStockID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link IdentifiedStockID }
     * 
     */
    public void setIdentifiedStockID(IdentifiedStockID value) {
        this.identifiedStockID = value;
    }

    /**
     * productSpecificationID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link RequirementSpecificationID }
     * 
     */
    public RequirementSpecificationID getProductSpecificationID() {
        return productSpecificationID;
    }

    /**
     * productSpecificationID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link RequirementSpecificationID }
     * 
     */
    public void setProductSpecificationID(RequirementSpecificationID value) {
        this.productSpecificationID = value;
    }

    /**
     * productRequirementSpecificationDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link MEDIUMDescription }
     * 
     */
    public MEDIUMDescription getProductRequirementSpecificationDescription() {
        return productRequirementSpecificationDescription;
    }

    /**
     * productRequirementSpecificationDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link MEDIUMDescription }
     * 
     */
    public void setProductRequirementSpecificationDescription(MEDIUMDescription value) {
        this.productRequirementSpecificationDescription = value;
    }

    /**
     * logisticsDeviationReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link LogisticsDeviationReasonCode }
     * 
     */
    public LogisticsDeviationReasonCode getLogisticsDeviationReasonCode() {
        return logisticsDeviationReasonCode;
    }

    /**
     * logisticsDeviationReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link LogisticsDeviationReasonCode }
     * 
     */
    public void setLogisticsDeviationReasonCode(LogisticsDeviationReasonCode value) {
        this.logisticsDeviationReasonCode = value;
    }

    /**
     * restrictedIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isRestrictedIndicator() {
        return restrictedIndicator;
    }

    /**
     * restrictedIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setRestrictedIndicator(Boolean value) {
        this.restrictedIndicator = value;
    }

    /**
     * lineItemID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getLineItemID() {
        return lineItemID;
    }

    /**
     * lineItemID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setLineItemID(Integer value) {
        this.lineItemID = value;
    }

    /**
     * logisticPackageInput 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SiteLogisticsLotLogisticPackageInput }
     * 
     */
    public SiteLogisticsLotLogisticPackageInput getLogisticPackageInput() {
        return logisticPackageInput;
    }

    /**
     * logisticPackageInput 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SiteLogisticsLotLogisticPackageInput }
     * 
     */
    public void setLogisticPackageInput(SiteLogisticsLotLogisticPackageInput value) {
        this.logisticPackageInput = value;
    }

    /**
     * materialDeviationStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getMaterialDeviationStatusCode() {
        return materialDeviationStatusCode;
    }

    /**
     * materialDeviationStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setMaterialDeviationStatusCode(String value) {
        this.materialDeviationStatusCode = value;
    }

}
