
package com.smart.focus.ceoapi.wsdl2.input_list;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * SiteLogisticsLotSerialNumberAssignment complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsLotSerialNumberAssignment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SerialID" type="{http://sap.com/xi/AP/Common/GDT}SerialID" minOccurs="0"/&gt;
 *         &lt;element name="IndividualProductUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://sap.com/xi/AP/Common/GDT}Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsLotSerialNumberAssignment", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "serialID",
        "individualProductUUID",
        "status"
})
public class SiteLogisticsLotSerialNumberAssignment {

    @XmlElement(name = "SerialID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serialID;
    @XmlElement(name = "IndividualProductUUID")
    protected UUID individualProductUUID;
    @XmlElement(name = "Status")
    protected Description status;

    /**
     * serialID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSerialID() {
        return serialID;
    }

    /**
     * serialID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSerialID(String value) {
        this.serialID = value;
    }

    /**
     * individualProductUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getIndividualProductUUID() {
        return individualProductUUID;
    }

    /**
     * individualProductUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setIndividualProductUUID(UUID value) {
        this.individualProductUUID = value;
    }

    /**
     * status 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Description }
     * 
     */
    public Description getStatus() {
        return status;
    }

    /**
     * status 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Description }
     * 
     */
    public void setStatus(Description value) {
        this.status = value;
    }

}
