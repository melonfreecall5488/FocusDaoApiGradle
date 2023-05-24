
package com.smart.focus.ceoapi.wsdl2.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * CustomerReponseCustomerCommunicationEmail complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerCommunicationEmail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmailURI" type="{http://sap.com/xi/AP/Common/GDT}EmailURI"/&gt;
 *         &lt;element name="RecipientFieldTypeCode" type="{http://sap.com/xi/DocumentServices/Global}EmailRecipientFieldTypeCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerCommunicationEmail", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "emailURI",
        "recipientFieldTypeCode"
})
public class CustomerReponseCustomerCommunicationEmail {

    @XmlElement(name = "EmailURI", required = true)
    protected EmailURI emailURI;
    @XmlElement(name = "RecipientFieldTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String recipientFieldTypeCode;

    /**
     * emailURI 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link EmailURI }
     * 
     */
    public EmailURI getEmailURI() {
        return emailURI;
    }

    /**
     * emailURI 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link EmailURI }
     * 
     */
    public void setEmailURI(EmailURI value) {
        this.emailURI = value;
    }

    /**
     * recipientFieldTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getRecipientFieldTypeCode() {
        return recipientFieldTypeCode;
    }

    /**
     * recipientFieldTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setRecipientFieldTypeCode(String value) {
        this.recipientFieldTypeCode = value;
    }

}
