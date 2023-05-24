
package com.smart.focus.ceoapi.wsdl2.material;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * MaterialByElementsQueryRequestedElementsMaterial complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsQueryRequestedElementsMaterial"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="descriptionTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="detailTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="quantityConversionTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="quantityCharacteristicTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="globalTradeItemNumberTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="planningTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="purchasingTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="availabilityConfirmationTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="salesTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="logisticsTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="deviantTaxClassificationTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="withholdingTaxClassificationTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="valuationTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="customerPartNumberTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="supplierPartNumberTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="attachmentFolderTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsQueryRequestedElementsMaterial", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "value"
})
public class MaterialByElementsQueryRequestedElementsMaterial {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "descriptionTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String descriptionTransmissionRequestCode;
    @XmlAttribute(name = "detailTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String detailTransmissionRequestCode;
    @XmlAttribute(name = "quantityConversionTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String quantityConversionTransmissionRequestCode;
    @XmlAttribute(name = "quantityCharacteristicTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String quantityCharacteristicTransmissionRequestCode;
    @XmlAttribute(name = "globalTradeItemNumberTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String globalTradeItemNumberTransmissionRequestCode;
    @XmlAttribute(name = "planningTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String planningTransmissionRequestCode;
    @XmlAttribute(name = "purchasingTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String purchasingTransmissionRequestCode;
    @XmlAttribute(name = "availabilityConfirmationTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String availabilityConfirmationTransmissionRequestCode;
    @XmlAttribute(name = "salesTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesTransmissionRequestCode;
    @XmlAttribute(name = "logisticsTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String logisticsTransmissionRequestCode;
    @XmlAttribute(name = "deviantTaxClassificationTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deviantTaxClassificationTransmissionRequestCode;
    @XmlAttribute(name = "withholdingTaxClassificationTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String withholdingTaxClassificationTransmissionRequestCode;
    @XmlAttribute(name = "valuationTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valuationTransmissionRequestCode;
    @XmlAttribute(name = "customerPartNumberTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String customerPartNumberTransmissionRequestCode;
    @XmlAttribute(name = "supplierPartNumberTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String supplierPartNumberTransmissionRequestCode;
    @XmlAttribute(name = "attachmentFolderTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String attachmentFolderTransmissionRequestCode;

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * descriptionTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDescriptionTransmissionRequestCode() {
        return descriptionTransmissionRequestCode;
    }

    /**
     * descriptionTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDescriptionTransmissionRequestCode(String value) {
        this.descriptionTransmissionRequestCode = value;
    }

    /**
     * detailTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDetailTransmissionRequestCode() {
        return detailTransmissionRequestCode;
    }

    /**
     * detailTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDetailTransmissionRequestCode(String value) {
        this.detailTransmissionRequestCode = value;
    }

    /**
     * quantityConversionTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getQuantityConversionTransmissionRequestCode() {
        return quantityConversionTransmissionRequestCode;
    }

    /**
     * quantityConversionTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setQuantityConversionTransmissionRequestCode(String value) {
        this.quantityConversionTransmissionRequestCode = value;
    }

    /**
     * quantityCharacteristicTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getQuantityCharacteristicTransmissionRequestCode() {
        return quantityCharacteristicTransmissionRequestCode;
    }

    /**
     * quantityCharacteristicTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setQuantityCharacteristicTransmissionRequestCode(String value) {
        this.quantityCharacteristicTransmissionRequestCode = value;
    }

    /**
     * globalTradeItemNumberTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getGlobalTradeItemNumberTransmissionRequestCode() {
        return globalTradeItemNumberTransmissionRequestCode;
    }

    /**
     * globalTradeItemNumberTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setGlobalTradeItemNumberTransmissionRequestCode(String value) {
        this.globalTradeItemNumberTransmissionRequestCode = value;
    }

    /**
     * planningTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPlanningTransmissionRequestCode() {
        return planningTransmissionRequestCode;
    }

    /**
     * planningTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPlanningTransmissionRequestCode(String value) {
        this.planningTransmissionRequestCode = value;
    }

    /**
     * purchasingTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPurchasingTransmissionRequestCode() {
        return purchasingTransmissionRequestCode;
    }

    /**
     * purchasingTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPurchasingTransmissionRequestCode(String value) {
        this.purchasingTransmissionRequestCode = value;
    }

    /**
     * availabilityConfirmationTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getAvailabilityConfirmationTransmissionRequestCode() {
        return availabilityConfirmationTransmissionRequestCode;
    }

    /**
     * availabilityConfirmationTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setAvailabilityConfirmationTransmissionRequestCode(String value) {
        this.availabilityConfirmationTransmissionRequestCode = value;
    }

    /**
     * salesTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSalesTransmissionRequestCode() {
        return salesTransmissionRequestCode;
    }

    /**
     * salesTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSalesTransmissionRequestCode(String value) {
        this.salesTransmissionRequestCode = value;
    }

    /**
     * logisticsTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getLogisticsTransmissionRequestCode() {
        return logisticsTransmissionRequestCode;
    }

    /**
     * logisticsTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setLogisticsTransmissionRequestCode(String value) {
        this.logisticsTransmissionRequestCode = value;
    }

    /**
     * deviantTaxClassificationTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDeviantTaxClassificationTransmissionRequestCode() {
        return deviantTaxClassificationTransmissionRequestCode;
    }

    /**
     * deviantTaxClassificationTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDeviantTaxClassificationTransmissionRequestCode(String value) {
        this.deviantTaxClassificationTransmissionRequestCode = value;
    }

    /**
     * withholdingTaxClassificationTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getWithholdingTaxClassificationTransmissionRequestCode() {
        return withholdingTaxClassificationTransmissionRequestCode;
    }

    /**
     * withholdingTaxClassificationTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setWithholdingTaxClassificationTransmissionRequestCode(String value) {
        this.withholdingTaxClassificationTransmissionRequestCode = value;
    }

    /**
     * valuationTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getValuationTransmissionRequestCode() {
        return valuationTransmissionRequestCode;
    }

    /**
     * valuationTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setValuationTransmissionRequestCode(String value) {
        this.valuationTransmissionRequestCode = value;
    }

    /**
     * customerPartNumberTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCustomerPartNumberTransmissionRequestCode() {
        return customerPartNumberTransmissionRequestCode;
    }

    /**
     * customerPartNumberTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCustomerPartNumberTransmissionRequestCode(String value) {
        this.customerPartNumberTransmissionRequestCode = value;
    }

    /**
     * supplierPartNumberTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSupplierPartNumberTransmissionRequestCode() {
        return supplierPartNumberTransmissionRequestCode;
    }

    /**
     * supplierPartNumberTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSupplierPartNumberTransmissionRequestCode(String value) {
        this.supplierPartNumberTransmissionRequestCode = value;
    }

    /**
     * attachmentFolderTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getAttachmentFolderTransmissionRequestCode() {
        return attachmentFolderTransmissionRequestCode;
    }

    /**
     * attachmentFolderTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setAttachmentFolderTransmissionRequestCode(String value) {
        this.attachmentFolderTransmissionRequestCode = value;
    }

}
