
package com.smart.focus.ceoapi.wsdl2.material;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * MaterialByElementsResponseMaterialSales complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialSales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SalesOrganisationID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID" minOccurs="0"/&gt;
 *         &lt;element name="DistributionChannelCode" type="{http://sap.com/xi/AP/Common/GDT}DistributionChannelCode" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ProductProcessUsabilityLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="SalesMeasureUnitCode" type="{http://sap.com/xi/AP/Common/GDT}MeasureUnitCode" minOccurs="0"/&gt;
 *         &lt;element name="MinimumOrderQuantityValue" type="{http://sap.com/xi/AP/Common/GDT}DecimalValue" minOccurs="0"/&gt;
 *         &lt;element name="ItemGroupCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerTransactionDocumentItemProcessingTypeDeterminationProductGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="CashDiscountDeductibleIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ReferencePriceMaterialInternalID" type="{http://sap.com/xi/AP/Common/GDT}ProductInternalID" minOccurs="0"/&gt;
 *         &lt;element name="Warranty" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialSalesWarranty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InternalNote" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialLanguateIndependentText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesNote" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B}Ext00163EA977381EEC88B4F859219D51C5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialSales", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "salesOrganisationID",
        "distributionChannelCode",
        "lifeCycleStatusCode",
        "salesMeasureUnitCode",
        "minimumOrderQuantityValue",
        "itemGroupCode",
        "cashDiscountDeductibleIndicator",
        "referencePriceMaterialInternalID",
        "warranty",
        "internalNote",
        "salesNote",
        "zSalesOrganisationName"
})
public class MaterialByElementsResponseMaterialSales {

    @XmlElement(name = "SalesOrganisationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesOrganisationID;
    @XmlElement(name = "DistributionChannelCode")
    protected DistributionChannelCode distributionChannelCode;
    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "SalesMeasureUnitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String salesMeasureUnitCode;
    @XmlElement(name = "MinimumOrderQuantityValue")
    protected BigDecimal minimumOrderQuantityValue;
    @XmlElement(name = "ItemGroupCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemGroupCode;
    @XmlElement(name = "CashDiscountDeductibleIndicator")
    protected Boolean cashDiscountDeductibleIndicator;
    @XmlElement(name = "ReferencePriceMaterialInternalID")
    protected ProductInternalID referencePriceMaterialInternalID;
    @XmlElement(name = "Warranty")
    protected List<MaterialByElementsResponseMaterialSalesWarranty> warranty;
    @XmlElement(name = "InternalNote")
    protected List<MaterialByElementsResponseMaterialLanguateIndependentText> internalNote;
    @XmlElement(name = "SalesNote")
    protected List<MaterialByElementsResponseMaterialText> salesNote;
    @XmlElement(name = "ZSalesOrganisationName", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B")
    protected String zSalesOrganisationName;

    /**
     * salesOrganisationID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSalesOrganisationID() {
        return salesOrganisationID;
    }

    /**
     * salesOrganisationID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSalesOrganisationID(String value) {
        this.salesOrganisationID = value;
    }

    /**
     * distributionChannelCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link DistributionChannelCode }
     * 
     */
    public DistributionChannelCode getDistributionChannelCode() {
        return distributionChannelCode;
    }

    /**
     * distributionChannelCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link DistributionChannelCode }
     * 
     */
    public void setDistributionChannelCode(DistributionChannelCode value) {
        this.distributionChannelCode = value;
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
     * salesMeasureUnitCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSalesMeasureUnitCode() {
        return salesMeasureUnitCode;
    }

    /**
     * salesMeasureUnitCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSalesMeasureUnitCode(String value) {
        this.salesMeasureUnitCode = value;
    }

    /**
     * minimumOrderQuantityValue 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BigDecimal }
     * 
     */
    public BigDecimal getMinimumOrderQuantityValue() {
        return minimumOrderQuantityValue;
    }

    /**
     * minimumOrderQuantityValue 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BigDecimal }
     * 
     */
    public void setMinimumOrderQuantityValue(BigDecimal value) {
        this.minimumOrderQuantityValue = value;
    }

    /**
     * itemGroupCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getItemGroupCode() {
        return itemGroupCode;
    }

    /**
     * itemGroupCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setItemGroupCode(String value) {
        this.itemGroupCode = value;
    }

    /**
     * cashDiscountDeductibleIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isCashDiscountDeductibleIndicator() {
        return cashDiscountDeductibleIndicator;
    }

    /**
     * cashDiscountDeductibleIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setCashDiscountDeductibleIndicator(Boolean value) {
        this.cashDiscountDeductibleIndicator = value;
    }

    /**
     * referencePriceMaterialInternalID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductInternalID }
     * 
     */
    public ProductInternalID getReferencePriceMaterialInternalID() {
        return referencePriceMaterialInternalID;
    }

    /**
     * referencePriceMaterialInternalID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductInternalID }
     * 
     */
    public void setReferencePriceMaterialInternalID(ProductInternalID value) {
        this.referencePriceMaterialInternalID = value;
    }

    /**
     * Gets the value of the warranty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warranty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getWarranty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialSalesWarranty }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialSalesWarranty> getWarranty() {
        if (warranty == null) {
            warranty = new ArrayList<MaterialByElementsResponseMaterialSalesWarranty>();
        }
        return this.warranty;
    }

    /**
     * Gets the value of the internalNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalNote
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getInternalNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialLanguateIndependentText }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialLanguateIndependentText> getInternalNote() {
        if (internalNote == null) {
            internalNote = new ArrayList<MaterialByElementsResponseMaterialLanguateIndependentText>();
        }
        return this.internalNote;
    }

    /**
     * Gets the value of the salesNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesNote
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSalesNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialText }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialText> getSalesNote() {
        if (salesNote == null) {
            salesNote = new ArrayList<MaterialByElementsResponseMaterialText>();
        }
        return this.salesNote;
    }

    /**
     * zSalesOrganisationName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getZSalesOrganisationName() {
        return zSalesOrganisationName;
    }

    /**
     * zSalesOrganisationName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setZSalesOrganisationName(String value) {
        this.zSalesOrganisationName = value;
    }

}
