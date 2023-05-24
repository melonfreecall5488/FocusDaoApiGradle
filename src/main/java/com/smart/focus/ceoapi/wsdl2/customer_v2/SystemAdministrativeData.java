
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SystemAdministrativeData complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SystemAdministrativeData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime"/&gt;
 *         &lt;element name="CreationIdentityUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="LastChangeDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="LastChangeIdentityUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemAdministrativeData", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "creationDateTime",
    "creationIdentityUUID",
    "lastChangeDateTime",
    "lastChangeIdentityUUID"
})
public class SystemAdministrativeData {

    @XmlElement(name = "CreationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "CreationIdentityUUID")
    protected UUID creationIdentityUUID;
    @XmlElement(name = "LastChangeDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastChangeDateTime;
    @XmlElement(name = "LastChangeIdentityUUID")
    protected UUID lastChangeIdentityUUID;

    /**
     * creationDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * creationDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * creationIdentityUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getCreationIdentityUUID() {
        return creationIdentityUUID;
    }

    /**
     * creationIdentityUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setCreationIdentityUUID(UUID value) {
        this.creationIdentityUUID = value;
    }

    /**
     * lastChangeDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastChangeDateTime() {
        return lastChangeDateTime;
    }

    /**
     * lastChangeDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastChangeDateTime(XMLGregorianCalendar value) {
        this.lastChangeDateTime = value;
    }

    /**
     * lastChangeIdentityUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getLastChangeIdentityUUID() {
        return lastChangeIdentityUUID;
    }

    /**
     * lastChangeIdentityUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setLastChangeIdentityUUID(UUID value) {
        this.lastChangeIdentityUUID = value;
    }

}
