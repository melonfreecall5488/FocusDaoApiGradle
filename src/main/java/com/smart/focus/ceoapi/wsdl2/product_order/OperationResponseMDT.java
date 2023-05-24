
package com.smart.focus.ceoapi.wsdl2.product_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * OperationResponseMDT complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="OperationResponseMDT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationID" type="{http://sap.com/xi/AP/Common/GDT}OperationID" minOccurs="0"/&gt;
 *         &lt;element name="OperationUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://sap.com/xi/AP/Common/GDT}OperationTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}OperationCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="OperationStatus" type="{http://sap.com/xi/A1S/Global}OperationStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="StartDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmMainResourceID" type="{http://sap.com/xi/AP/Common/GDT}ResourceID" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmMainResourceUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationGroupUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationResponseMDT", propOrder = {
        "operationID",
        "operationUUID",
        "typeCode",
        "categoryCode",
        "operationStatus",
        "startDateTime",
        "endDateTime",
        "confirmMainResourceID",
        "confirmMainResourceUUID",
        "confirmationGroupUUID"
})
public class OperationResponseMDT {

    @XmlElement(name = "OperationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String operationID;
    @XmlElement(name = "OperationUUID")
    protected UUID operationUUID;
    @XmlElement(name = "TypeCode")
    protected OperationTypeCode typeCode;
    @XmlElement(name = "CategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String categoryCode;
    @XmlElement(name = "OperationStatus")
    protected OperationStatusCode operationStatus;
    @XmlElement(name = "StartDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(name = "EndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(name = "ConfirmMainResourceID")
    protected ResourceID confirmMainResourceID;
    @XmlElement(name = "ConfirmMainResourceUUID")
    protected UUID confirmMainResourceUUID;
    @XmlElement(name = "ConfirmationGroupUUID")
    protected UUID confirmationGroupUUID;

    /**
     * operationID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getOperationID() {
        return operationID;
    }

    /**
     * operationID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setOperationID(String value) {
        this.operationID = value;
    }

    /**
     * operationUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getOperationUUID() {
        return operationUUID;
    }

    /**
     * operationUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setOperationUUID(UUID value) {
        this.operationUUID = value;
    }

    /**
     * typeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link OperationTypeCode }
     * 
     */
    public OperationTypeCode getTypeCode() {
        return typeCode;
    }

    /**
     * typeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link OperationTypeCode }
     * 
     */
    public void setTypeCode(OperationTypeCode value) {
        this.typeCode = value;
    }

    /**
     * categoryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * categoryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * operationStatus 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link OperationStatusCode }
     * 
     */
    public OperationStatusCode getOperationStatus() {
        return operationStatus;
    }

    /**
     * operationStatus 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link OperationStatusCode }
     * 
     */
    public void setOperationStatus(OperationStatusCode value) {
        this.operationStatus = value;
    }

    /**
     * startDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * startDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * endDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * endDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * confirmMainResourceID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ResourceID }
     * 
     */
    public ResourceID getConfirmMainResourceID() {
        return confirmMainResourceID;
    }

    /**
     * confirmMainResourceID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ResourceID }
     * 
     */
    public void setConfirmMainResourceID(ResourceID value) {
        this.confirmMainResourceID = value;
    }

    /**
     * confirmMainResourceUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getConfirmMainResourceUUID() {
        return confirmMainResourceUUID;
    }

    /**
     * confirmMainResourceUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setConfirmMainResourceUUID(UUID value) {
        this.confirmMainResourceUUID = value;
    }

    /**
     * confirmationGroupUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getConfirmationGroupUUID() {
        return confirmationGroupUUID;
    }

    /**
     * confirmationGroupUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setConfirmationGroupUUID(UUID value) {
        this.confirmationGroupUUID = value;
    }

}
