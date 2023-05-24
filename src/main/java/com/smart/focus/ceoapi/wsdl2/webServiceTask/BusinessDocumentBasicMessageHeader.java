
package com.smart.focus.ceoapi.wsdl2.webServiceTask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BusinessDocumentBasicMessageHeader complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BusinessDocumentBasicMessageHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://sap.com/xi/AP/Common/GDT}BusinessDocumentMessageID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID" type="{http://sap.com/xi/AP/Common/GDT}BusinessDocumentMessageID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDocumentBasicMessageHeader", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "id",
    "uuid",
    "referenceID",
    "referenceUUID"
})
public class BusinessDocumentBasicMessageHeader {

    @XmlElement(name = "ID")
    protected BusinessDocumentMessageID id;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "ReferenceID")
    protected BusinessDocumentMessageID referenceID;
    @XmlElement(name = "ReferenceUUID")
    protected UUID referenceUUID;

    /**
     * id 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageID }
     *     
     */
    public BusinessDocumentMessageID getID() {
        return id;
    }

    /**
     * id 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageID }
     *     
     */
    public void setID(BusinessDocumentMessageID value) {
        this.id = value;
    }

    /**
     * uuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * uuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * referenceID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageID }
     *     
     */
    public BusinessDocumentMessageID getReferenceID() {
        return referenceID;
    }

    /**
     * referenceID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageID }
     *     
     */
    public void setReferenceID(BusinessDocumentMessageID value) {
        this.referenceID = value;
    }

    /**
     * referenceUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getReferenceUUID() {
        return referenceUUID;
    }

    /**
     * referenceUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setReferenceUUID(UUID value) {
        this.referenceUUID = value;
    }

}
