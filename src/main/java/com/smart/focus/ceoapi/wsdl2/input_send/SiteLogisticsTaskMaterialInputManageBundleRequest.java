
package com.smart.focus.ceoapi.wsdl2.input_send;

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
 * SiteLogisticsTaskMaterialInputManageBundle_Request complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskMaterialInputManageBundle_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaterialInputUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ProductID" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *         &lt;element name="SourceLogisticsAreaID" type="{http://sap.com/xi/AP/Common/GDT}LogisticsAreaID" minOccurs="0"/&gt;
 *         &lt;element name="ActualQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="IdentifiedStockID" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockID" minOccurs="0"/&gt;
 *         &lt;element name="ProductRequirementSpecificationID" type="{http://sap.com/xi/AP/Common/GDT}RequirementSpecificationID" minOccurs="0"/&gt;
 *         &lt;element name="InventoryRestrictedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="LogisticsDeviationReasonCode" type="{http://sap.com/xi/AP/Common/GDT}LogisticsDeviationReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="SplitIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="LogisticsPackageInput" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskLogisticsPackageInputManageBundle_Request" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AutomaticIdentification" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskAutoIDManageBundle_Request" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskMaterialInputManageBundle_Request", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "materialInputUUID",
        "productID",
        "sourceLogisticsAreaID",
        "actualQuantity",
        "identifiedStockID",
        "productRequirementSpecificationID",
        "inventoryRestrictedIndicator",
        "logisticsDeviationReasonCode",
        "splitIndicator",
        "logisticsPackageInput",
        "automaticIdentification"
})
public class SiteLogisticsTaskMaterialInputManageBundleRequest {

    @XmlElement(name = "MaterialInputUUID")
    protected UUID materialInputUUID;
    @XmlElement(name = "ProductID")
    protected ProductID productID;
    @XmlElement(name = "SourceLogisticsAreaID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sourceLogisticsAreaID;
    @XmlElement(name = "ActualQuantity")
    protected Quantity actualQuantity;
    @XmlElement(name = "IdentifiedStockID")
    protected IdentifiedStockID identifiedStockID;
    @XmlElement(name = "ProductRequirementSpecificationID")
    protected RequirementSpecificationID productRequirementSpecificationID;
    @XmlElement(name = "InventoryRestrictedIndicator")
    protected Boolean inventoryRestrictedIndicator;
    @XmlElement(name = "LogisticsDeviationReasonCode")
    protected LogisticsDeviationReasonCode logisticsDeviationReasonCode;
    @XmlElement(name = "SplitIndicator")
    protected Boolean splitIndicator;
    @XmlElement(name = "LogisticsPackageInput")
    protected List<SiteLogisticsTaskLogisticsPackageInputManageBundleRequest> logisticsPackageInput;
    @XmlElement(name = "AutomaticIdentification")
    protected SiteLogisticsTaskAutoIDManageBundleRequest automaticIdentification;

    /**
     * materialInputUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getMaterialInputUUID() {
        return materialInputUUID;
    }

    /**
     * materialInputUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setMaterialInputUUID(UUID value) {
        this.materialInputUUID = value;
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
     * actualQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getActualQuantity() {
        return actualQuantity;
    }

    /**
     * actualQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setActualQuantity(Quantity value) {
        this.actualQuantity = value;
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
     * productRequirementSpecificationID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link RequirementSpecificationID }
     * 
     */
    public RequirementSpecificationID getProductRequirementSpecificationID() {
        return productRequirementSpecificationID;
    }

    /**
     * productRequirementSpecificationID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link RequirementSpecificationID }
     * 
     */
    public void setProductRequirementSpecificationID(RequirementSpecificationID value) {
        this.productRequirementSpecificationID = value;
    }

    /**
     * inventoryRestrictedIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isInventoryRestrictedIndicator() {
        return inventoryRestrictedIndicator;
    }

    /**
     * inventoryRestrictedIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setInventoryRestrictedIndicator(Boolean value) {
        this.inventoryRestrictedIndicator = value;
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
     * splitIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isSplitIndicator() {
        return splitIndicator;
    }

    /**
     * splitIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setSplitIndicator(Boolean value) {
        this.splitIndicator = value;
    }

    /**
     * Gets the value of the logisticsPackageInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * logisticsPackageInput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getLogisticsPackageInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskLogisticsPackageInputManageBundleRequest }
     * 
     * 
     */
    public List<SiteLogisticsTaskLogisticsPackageInputManageBundleRequest> getLogisticsPackageInput() {
        if (logisticsPackageInput == null) {
            logisticsPackageInput = new ArrayList<SiteLogisticsTaskLogisticsPackageInputManageBundleRequest>();
        }
        return this.logisticsPackageInput;
    }

    /**
     * automaticIdentification 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SiteLogisticsTaskAutoIDManageBundleRequest }
     * 
     */
    public SiteLogisticsTaskAutoIDManageBundleRequest getAutomaticIdentification() {
        return automaticIdentification;
    }

    /**
     * automaticIdentification 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SiteLogisticsTaskAutoIDManageBundleRequest }
     * 
     */
    public void setAutomaticIdentification(SiteLogisticsTaskAutoIDManageBundleRequest value) {
        this.automaticIdentification = value;
    }

}
