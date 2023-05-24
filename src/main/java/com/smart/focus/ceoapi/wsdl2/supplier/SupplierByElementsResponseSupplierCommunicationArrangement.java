
package com.smart.focus.ceoapi.wsdl2.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SupplierByElementsResponseSupplierCommunicationArrangement complex type에 대한
 * Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsResponseSupplierCommunicationArrangement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CompoundServiceInterfaceCode" type="{http://sap.com/xi/AP/Common/GDT}CompoundServiceInterfaceCode" minOccurs="0"/&gt;
 *         &lt;element name="EnabledIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CommunicationMediumTypeCode" type="{http://sap.com/xi/AP/Common/GDT}CommunicationMediumTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="OutputRequestFormTemplateCode" type="{http://sap.com/xi/AP/Common/GDT}OutputRequestFormTemplateCode" minOccurs="0"/&gt;
 *         &lt;element name="EMailURI" type="{http://sap.com/xi/AP/Common/GDT}EmailURI" minOccurs="0"/&gt;
 *         &lt;element name="FacsimileFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="OutputCopyNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsResponseSupplierCommunicationArrangement", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "uuid",
        "compoundServiceInterfaceCode",
        "enabledIndicator",
        "communicationMediumTypeCode",
        "outputRequestFormTemplateCode",
        "eMailURI",
        "facsimileFormattedNumberDescription",
        "outputCopyNumberValue"
})
public class SupplierByElementsResponseSupplierCommunicationArrangement {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "CompoundServiceInterfaceCode")
    protected CompoundServiceInterfaceCode compoundServiceInterfaceCode;
    @XmlElement(name = "EnabledIndicator")
    protected Boolean enabledIndicator;
    @XmlElement(name = "CommunicationMediumTypeCode")
    protected CommunicationMediumTypeCode communicationMediumTypeCode;
    @XmlElement(name = "OutputRequestFormTemplateCode")
    protected OutputRequestFormTemplateCode outputRequestFormTemplateCode;
    @XmlElement(name = "EMailURI")
    protected EmailURI eMailURI;
    @XmlElement(name = "FacsimileFormattedNumberDescription")
    protected String facsimileFormattedNumberDescription;
    @XmlElement(name = "OutputCopyNumberValue")
    protected Integer outputCopyNumberValue;

    /**
     * uuid 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * uuid 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * compoundServiceInterfaceCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CompoundServiceInterfaceCode }
     * 
     */
    public CompoundServiceInterfaceCode getCompoundServiceInterfaceCode() {
        return compoundServiceInterfaceCode;
    }

    /**
     * compoundServiceInterfaceCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CompoundServiceInterfaceCode }
     * 
     */
    public void setCompoundServiceInterfaceCode(CompoundServiceInterfaceCode value) {
        this.compoundServiceInterfaceCode = value;
    }

    /**
     * enabledIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isEnabledIndicator() {
        return enabledIndicator;
    }

    /**
     * enabledIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setEnabledIndicator(Boolean value) {
        this.enabledIndicator = value;
    }

    /**
     * communicationMediumTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CommunicationMediumTypeCode }
     * 
     */
    public CommunicationMediumTypeCode getCommunicationMediumTypeCode() {
        return communicationMediumTypeCode;
    }

    /**
     * communicationMediumTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CommunicationMediumTypeCode }
     * 
     */
    public void setCommunicationMediumTypeCode(CommunicationMediumTypeCode value) {
        this.communicationMediumTypeCode = value;
    }

    /**
     * outputRequestFormTemplateCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link OutputRequestFormTemplateCode }
     * 
     */
    public OutputRequestFormTemplateCode getOutputRequestFormTemplateCode() {
        return outputRequestFormTemplateCode;
    }

    /**
     * outputRequestFormTemplateCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link OutputRequestFormTemplateCode }
     * 
     */
    public void setOutputRequestFormTemplateCode(OutputRequestFormTemplateCode value) {
        this.outputRequestFormTemplateCode = value;
    }

    /**
     * eMailURI 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link EmailURI }
     * 
     */
    public EmailURI getEMailURI() {
        return eMailURI;
    }

    /**
     * eMailURI 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link EmailURI }
     * 
     */
    public void setEMailURI(EmailURI value) {
        this.eMailURI = value;
    }

    /**
     * facsimileFormattedNumberDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFacsimileFormattedNumberDescription() {
        return facsimileFormattedNumberDescription;
    }

    /**
     * facsimileFormattedNumberDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setFacsimileFormattedNumberDescription(String value) {
        this.facsimileFormattedNumberDescription = value;
    }

    /**
     * outputCopyNumberValue 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getOutputCopyNumberValue() {
        return outputCopyNumberValue;
    }

    /**
     * outputCopyNumberValue 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setOutputCopyNumberValue(Integer value) {
        this.outputCopyNumberValue = value;
    }

}
