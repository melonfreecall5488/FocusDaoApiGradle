
package com.smart.focus.ceoapi.wsdl2.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * CustomerRequestedElementsCustomer complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerRequestedElementsCustomer"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="addressInformationTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="relationshipTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="contactPersonTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="communicationArrangementTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="communicationArrangementMultiChannelTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="directResponsibilityTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="salesArrangementTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="bankDetailsTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="paymentCardDetailsTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="paymentDataTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="personTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="taxNumberTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="generalProductTaxExemptionTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="operatingHoursInfoTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
 *       &lt;attribute name="organisationTransmissionRequestCode" type="{http://sap.com/xi/AP/Common/GDT}TransmissionRequestCode" /&gt;
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
@XmlType(name = "CustomerRequestedElementsCustomer", propOrder = {
        "value"
})
public class CustomerRequestedElementsCustomer {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "addressInformationTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String addressInformationTransmissionRequestCode;
    @XmlAttribute(name = "relationshipTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String relationshipTransmissionRequestCode;
    @XmlAttribute(name = "contactPersonTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactPersonTransmissionRequestCode;
    @XmlAttribute(name = "communicationArrangementTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String communicationArrangementTransmissionRequestCode;
    @XmlAttribute(name = "communicationArrangementMultiChannelTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String communicationArrangementMultiChannelTransmissionRequestCode;
    @XmlAttribute(name = "directResponsibilityTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String directResponsibilityTransmissionRequestCode;
    @XmlAttribute(name = "salesArrangementTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String salesArrangementTransmissionRequestCode;
    @XmlAttribute(name = "bankDetailsTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bankDetailsTransmissionRequestCode;
    @XmlAttribute(name = "paymentCardDetailsTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paymentCardDetailsTransmissionRequestCode;
    @XmlAttribute(name = "paymentDataTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paymentDataTransmissionRequestCode;
    @XmlAttribute(name = "personTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String personTransmissionRequestCode;
    @XmlAttribute(name = "taxNumberTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String taxNumberTransmissionRequestCode;
    @XmlAttribute(name = "generalProductTaxExemptionTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String generalProductTaxExemptionTransmissionRequestCode;
    @XmlAttribute(name = "operatingHoursInfoTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String operatingHoursInfoTransmissionRequestCode;
    @XmlAttribute(name = "organisationTransmissionRequestCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String organisationTransmissionRequestCode;
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
     * directResponsibilityTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDirectResponsibilityTransmissionRequestCode() {
        return directResponsibilityTransmissionRequestCode;
    }

    /**
     * directResponsibilityTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDirectResponsibilityTransmissionRequestCode(String value) {
        this.directResponsibilityTransmissionRequestCode = value;
    }

    /**
     * salesArrangementTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSalesArrangementTransmissionRequestCode() {
        return salesArrangementTransmissionRequestCode;
    }

    /**
     * salesArrangementTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSalesArrangementTransmissionRequestCode(String value) {
        this.salesArrangementTransmissionRequestCode = value;
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
     * paymentCardDetailsTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPaymentCardDetailsTransmissionRequestCode() {
        return paymentCardDetailsTransmissionRequestCode;
    }

    /**
     * paymentCardDetailsTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPaymentCardDetailsTransmissionRequestCode(String value) {
        this.paymentCardDetailsTransmissionRequestCode = value;
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
     * personTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPersonTransmissionRequestCode() {
        return personTransmissionRequestCode;
    }

    /**
     * personTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPersonTransmissionRequestCode(String value) {
        this.personTransmissionRequestCode = value;
    }

    /**
     * taxNumberTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTaxNumberTransmissionRequestCode() {
        return taxNumberTransmissionRequestCode;
    }

    /**
     * taxNumberTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setTaxNumberTransmissionRequestCode(String value) {
        this.taxNumberTransmissionRequestCode = value;
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
     * operatingHoursInfoTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getOperatingHoursInfoTransmissionRequestCode() {
        return operatingHoursInfoTransmissionRequestCode;
    }

    /**
     * operatingHoursInfoTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setOperatingHoursInfoTransmissionRequestCode(String value) {
        this.operatingHoursInfoTransmissionRequestCode = value;
    }

    /**
     * organisationTransmissionRequestCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getOrganisationTransmissionRequestCode() {
        return organisationTransmissionRequestCode;
    }

    /**
     * organisationTransmissionRequestCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setOrganisationTransmissionRequestCode(String value) {
        this.organisationTransmissionRequestCode = value;
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
