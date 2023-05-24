
package com.smart.focus.ceoapi.wsdl2.input_list;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SiteLogisticsLotLogisticPackageInput complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsLotLogisticPackageInput"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LogisticUnitUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="LogisticUnitID" type="{http://sap.com/xi/AP/Common/GDT}LogisticUnitID" minOccurs="0"/&gt;
 *         &lt;element name="LogisticUnitTotalConfirmedQuantity" type="{http://sap.com/xi/AP/Common/GDT}INTEGER_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="LogisticUnitOpenQuantity" type="{http://sap.com/xi/AP/Common/GDT}INTEGER_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="LogisticUnitPlanQuantity" type="{http://sap.com/xi/AP/Common/GDT}INTEGER_Quantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsLotLogisticPackageInput", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "logisticUnitUUID",
        "logisticUnitID",
        "logisticUnitTotalConfirmedQuantity",
        "logisticUnitOpenQuantity",
        "logisticUnitPlanQuantity"
})
public class SiteLogisticsLotLogisticPackageInput {

    @XmlElement(name = "LogisticUnitUUID")
    protected UUID logisticUnitUUID;
    @XmlElement(name = "LogisticUnitID")
    protected LogisticUnitID logisticUnitID;
    @XmlElement(name = "LogisticUnitTotalConfirmedQuantity")
    protected INTEGERQuantity logisticUnitTotalConfirmedQuantity;
    @XmlElement(name = "LogisticUnitOpenQuantity")
    protected INTEGERQuantity logisticUnitOpenQuantity;
    @XmlElement(name = "LogisticUnitPlanQuantity")
    protected INTEGERQuantity logisticUnitPlanQuantity;

    /**
     * logisticUnitUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getLogisticUnitUUID() {
        return logisticUnitUUID;
    }

    /**
     * logisticUnitUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setLogisticUnitUUID(UUID value) {
        this.logisticUnitUUID = value;
    }

    /**
     * logisticUnitID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link LogisticUnitID }
     * 
     */
    public LogisticUnitID getLogisticUnitID() {
        return logisticUnitID;
    }

    /**
     * logisticUnitID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link LogisticUnitID }
     * 
     */
    public void setLogisticUnitID(LogisticUnitID value) {
        this.logisticUnitID = value;
    }

    /**
     * logisticUnitTotalConfirmedQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link INTEGERQuantity }
     * 
     */
    public INTEGERQuantity getLogisticUnitTotalConfirmedQuantity() {
        return logisticUnitTotalConfirmedQuantity;
    }

    /**
     * logisticUnitTotalConfirmedQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link INTEGERQuantity }
     * 
     */
    public void setLogisticUnitTotalConfirmedQuantity(INTEGERQuantity value) {
        this.logisticUnitTotalConfirmedQuantity = value;
    }

    /**
     * logisticUnitOpenQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link INTEGERQuantity }
     * 
     */
    public INTEGERQuantity getLogisticUnitOpenQuantity() {
        return logisticUnitOpenQuantity;
    }

    /**
     * logisticUnitOpenQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link INTEGERQuantity }
     * 
     */
    public void setLogisticUnitOpenQuantity(INTEGERQuantity value) {
        this.logisticUnitOpenQuantity = value;
    }

    /**
     * logisticUnitPlanQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link INTEGERQuantity }
     * 
     */
    public INTEGERQuantity getLogisticUnitPlanQuantity() {
        return logisticUnitPlanQuantity;
    }

    /**
     * logisticUnitPlanQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link INTEGERQuantity }
     * 
     */
    public void setLogisticUnitPlanQuantity(INTEGERQuantity value) {
        this.logisticUnitPlanQuantity = value;
    }

}
