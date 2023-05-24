
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

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
 * <p>CustomerReponseCustomerCommunicationChannel complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerCommunicationChannel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CommunicationMediumTypeCode" type="{http://sap.com/xi/AP/Common/GDT}CommunicationMediumTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="OutputRequestFormTemplateCode" type="{http://sap.com/xi/AP/Common/GDT}OutputRequestFormTemplateCode" minOccurs="0"/&gt;
 *         &lt;element name="EmailURI" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerCommunicationEmail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FacsimileFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="OutputCopyNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="PrintQueueIdentifier" type="{http://sap.com/xi/AP/Common/GDT}PrintQueueID" minOccurs="0"/&gt;
 *         &lt;element name="DuplicateIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="TransformationID" type="{http://sap.com/xi/AP/FO/PriceAndTax/Global}XSLTStorageXSLTID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerCommunicationChannel", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "communicationMediumTypeCode",
    "outputRequestFormTemplateCode",
    "emailURI",
    "facsimileFormattedNumberDescription",
    "outputCopyNumberValue",
    "printQueueIdentifier",
    "duplicateIndicator",
    "transformationID"
})
public class CustomerReponseCustomerCommunicationChannel {

    @XmlElement(name = "CommunicationMediumTypeCode")
    protected CommunicationMediumTypeCode communicationMediumTypeCode;
    @XmlElement(name = "OutputRequestFormTemplateCode")
    protected OutputRequestFormTemplateCode outputRequestFormTemplateCode;
    @XmlElement(name = "EmailURI")
    protected List<CustomerReponseCustomerCommunicationEmail> emailURI;
    @XmlElement(name = "FacsimileFormattedNumberDescription")
    protected String facsimileFormattedNumberDescription;
    @XmlElement(name = "OutputCopyNumberValue")
    protected Integer outputCopyNumberValue;
    @XmlElement(name = "PrintQueueIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String printQueueIdentifier;
    @XmlElement(name = "DuplicateIndicator")
    protected Boolean duplicateIndicator;
    @XmlElement(name = "TransformationID")
    protected XSLTStorageXSLTID transformationID;

    /**
     * communicationMediumTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMediumTypeCode }
     *     
     */
    public CommunicationMediumTypeCode getCommunicationMediumTypeCode() {
        return communicationMediumTypeCode;
    }

    /**
     * communicationMediumTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMediumTypeCode }
     *     
     */
    public void setCommunicationMediumTypeCode(CommunicationMediumTypeCode value) {
        this.communicationMediumTypeCode = value;
    }

    /**
     * outputRequestFormTemplateCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OutputRequestFormTemplateCode }
     *     
     */
    public OutputRequestFormTemplateCode getOutputRequestFormTemplateCode() {
        return outputRequestFormTemplateCode;
    }

    /**
     * outputRequestFormTemplateCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputRequestFormTemplateCode }
     *     
     */
    public void setOutputRequestFormTemplateCode(OutputRequestFormTemplateCode value) {
        this.outputRequestFormTemplateCode = value;
    }

    /**
     * Gets the value of the emailURI property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailURI property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailURI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerCommunicationEmail }
     * 
     * 
     */
    public List<CustomerReponseCustomerCommunicationEmail> getEmailURI() {
        if (emailURI == null) {
            emailURI = new ArrayList<CustomerReponseCustomerCommunicationEmail>();
        }
        return this.emailURI;
    }

    /**
     * facsimileFormattedNumberDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacsimileFormattedNumberDescription() {
        return facsimileFormattedNumberDescription;
    }

    /**
     * facsimileFormattedNumberDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacsimileFormattedNumberDescription(String value) {
        this.facsimileFormattedNumberDescription = value;
    }

    /**
     * outputCopyNumberValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutputCopyNumberValue() {
        return outputCopyNumberValue;
    }

    /**
     * outputCopyNumberValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutputCopyNumberValue(Integer value) {
        this.outputCopyNumberValue = value;
    }

    /**
     * printQueueIdentifier 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintQueueIdentifier() {
        return printQueueIdentifier;
    }

    /**
     * printQueueIdentifier 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintQueueIdentifier(String value) {
        this.printQueueIdentifier = value;
    }

    /**
     * duplicateIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplicateIndicator() {
        return duplicateIndicator;
    }

    /**
     * duplicateIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicateIndicator(Boolean value) {
        this.duplicateIndicator = value;
    }

    /**
     * transformationID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XSLTStorageXSLTID }
     *     
     */
    public XSLTStorageXSLTID getTransformationID() {
        return transformationID;
    }

    /**
     * transformationID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XSLTStorageXSLTID }
     *     
     */
    public void setTransformationID(XSLTStorageXSLTID value) {
        this.transformationID = value;
    }

}
