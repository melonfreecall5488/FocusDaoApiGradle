
package com.smart.focus.ceoapi.wsdl2.product_result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;

/**
 * <p>
 * ProductionLotActivityMaintainResources complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotActivityMaintainResources"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResourceID" type="{http://sap.com/xi/AP/Common/GDT}ResourceID" minOccurs="0"/&gt;
 *         &lt;element name="ResourceUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmedDuration" type="{http://sap.com/xi/AP/Common/GDT}TIME_Duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotActivityMaintainResources", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "resourceID",
        "resourceUUID",
        "confirmedDuration"
})
public class ProductionLotActivityMaintainResources {

    @XmlElement(name = "ResourceID")
    protected ResourceID resourceID;
    @XmlElement(name = "ResourceUUID")
    protected UUID resourceUUID;
    @XmlElement(name = "ConfirmedDuration")
    protected Duration confirmedDuration;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * resourceID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ResourceID }
     * 
     */
    public ResourceID getResourceID() {
        return resourceID;
    }

    /**
     * resourceID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ResourceID }
     * 
     */
    public void setResourceID(ResourceID value) {
        this.resourceID = value;
    }

    /**
     * resourceUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getResourceUUID() {
        return resourceUUID;
    }

    /**
     * resourceUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setResourceUUID(UUID value) {
        this.resourceUUID = value;
    }

    /**
     * confirmedDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getConfirmedDuration() {
        return confirmedDuration;
    }

    /**
     * confirmedDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setConfirmedDuration(Duration value) {
        this.confirmedDuration = value;
    }

    /**
     * actionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * actionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
