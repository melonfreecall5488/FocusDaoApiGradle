
package com.smart.focus.ceoapi.wsdl2.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * SupplierByElementsQueryRequestedElementsSupplier complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsQueryRequestedElementsSupplier"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="addressInformationTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="communicationArrangementTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="communicationArrangementMultiChannelTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="relationshipTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="contactPersonTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="purchasingDataTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="paymentDataTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="bankDetailsTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="deviantTaxClassificationTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="withholdingTaxClassificationTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="generalProductTaxExemptionTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="textTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="attachmentFolderTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsQueryRequestedElementsSupplier", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "value"
})
public class SupplierByElementsQueryRequestedElementsSupplier {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "addressInformationTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String addressInformationTransmissionRequestCode;
    @XmlAttribute(name = "communicationArrangementTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String communicationArrangementTransmissionRequestCode;
    @XmlAttribute(name = "communicationArrangementMultiChannelTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String communicationArrangementMultiChannelTransmissionRequestCode;
    @XmlAttribute(name = "relationshipTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String relationshipTransmissionRequestCode;
    @XmlAttribute(name = "contactPersonTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactPersonTransmissionRequestCode;
    @XmlAttribute(name = "purchasingDataTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String purchasingDataTransmissionRequestCode;
    @XmlAttribute(name = "paymentDataTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paymentDataTransmissionRequestCode;
    @XmlAttribute(name = "bankDetailsTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bankDetailsTransmissionRequestCode;
    @XmlAttribute(name = "deviantTaxClassificationTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String deviantTaxClassificationTransmissionRequestCode;
    @XmlAttribute(name = "withholdingTaxClassificationTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String withholdingTaxClassificationTransmissionRequestCode;
    @XmlAttribute(name = "generalProductTaxExemptionTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String generalProductTaxExemptionTransmissionRequestCode;
    @XmlAttribute(name = "textTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textTransmissionRequestCode;
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
     * addressInformationTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getAddressInformationTransmissionRequestCode() {
        return addressInformationTransmissionRequestCode;
    }

    /**
     * addressInformationTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setAddressInformationTransmissionRequestCode(String value) {
        this.addressInformationTransmissionRequestCode = value;
    }

    /**
     * communicationArrangementTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCommunicationArrangementTransmissionRequestCode() {
        return communicationArrangementTransmissionRequestCode;
    }

    /**
     * communicationArrangementTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCommunicationArrangementTransmissionRequestCode(String value) {
        this.communicationArrangementTransmissionRequestCode = value;
    }

    /**
     * communicationArrangementMultiChannelTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCommunicationArrangementMultiChannelTransmissionRequestCode() {
        return communicationArrangementMultiChannelTransmissionRequestCode;
    }

    /**
     * communicationArrangementMultiChannelTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCommunicationArrangementMultiChannelTransmissionRequestCode(String value) {
        this.communicationArrangementMultiChannelTransmissionRequestCode = value;
    }

    /**
     * relationshipTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getRelationshipTransmissionRequestCode() {
        return relationshipTransmissionRequestCode;
    }

    /**
     * relationshipTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setRelationshipTransmissionRequestCode(String value) {
        this.relationshipTransmissionRequestCode = value;
    }

    /**
     * contactPersonTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getContactPersonTransmissionRequestCode() {
        return contactPersonTransmissionRequestCode;
    }

    /**
     * contactPersonTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setContactPersonTransmissionRequestCode(String value) {
        this.contactPersonTransmissionRequestCode = value;
    }

    /**
     * purchasingDataTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPurchasingDataTransmissionRequestCode() {
        return purchasingDataTransmissionRequestCode;
    }

    /**
     * purchasingDataTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPurchasingDataTransmissionRequestCode(String value) {
        this.purchasingDataTransmissionRequestCode = value;
    }

    /**
     * paymentDataTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPaymentDataTransmissionRequestCode() {
        return paymentDataTransmissionRequestCode;
    }

    /**
     * paymentDataTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPaymentDataTransmissionRequestCode(String value) {
        this.paymentDataTransmissionRequestCode = value;
    }

    /**
     * bankDetailsTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getBankDetailsTransmissionRequestCode() {
        return bankDetailsTransmissionRequestCode;
    }

    /**
     * bankDetailsTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setBankDetailsTransmissionRequestCode(String value) {
        this.bankDetailsTransmissionRequestCode = value;
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
     * generalProductTaxExemptionTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getGeneralProductTaxExemptionTransmissionRequestCode() {
        return generalProductTaxExemptionTransmissionRequestCode;
    }

    /**
     * generalProductTaxExemptionTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setGeneralProductTaxExemptionTransmissionRequestCode(String value) {
        this.generalProductTaxExemptionTransmissionRequestCode = value;
    }

    /**
     * textTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTextTransmissionRequestCode() {
        return textTransmissionRequestCode;
    }

    /**
     * textTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setTextTransmissionRequestCode(String value) {
        this.textTransmissionRequestCode = value;
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
