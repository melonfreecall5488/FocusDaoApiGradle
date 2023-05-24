
package com.smart.focus.ceoapi.wsdl2.input_send;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SiteLogisticsTaskLogisticsPackageOutputManageBundle_Request complex type에 대한
 * Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskLogisticsPackageOutputManageBundle_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LogisticsUnitUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="LogisticsUnitID" type="{http://sap.com/xi/AP/Common/GDT}LogisticUnitID" minOccurs="0"/&gt;
 *         &lt;element name="LogisticsUnitQuantity" type="{http://sap.com/xi/AP/Common/GDT}INTEGER_Quantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskLogisticsPackageOutputManageBundle_Request", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "logisticsUnitUUID",
        "logisticsUnitID",
        "logisticsUnitQuantity"
})
public class SiteLogisticsTaskLogisticsPackageOutputManageBundleRequest {

    @XmlElement(name = "LogisticsUnitUUID")
    protected UUID logisticsUnitUUID;
    @XmlElement(name = "LogisticsUnitID")
    protected LogisticUnitID logisticsUnitID;
    @XmlElement(name = "LogisticsUnitQuantity")
    protected INTEGERQuantity logisticsUnitQuantity;

    /**
     * logisticsUnitUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getLogisticsUnitUUID() {
        return logisticsUnitUUID;
    }

    /**
     * logisticsUnitUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setLogisticsUnitUUID(UUID value) {
        this.logisticsUnitUUID = value;
    }

    /**
     * logisticsUnitID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link LogisticUnitID }
     * 
     */
    public LogisticUnitID getLogisticsUnitID() {
        return logisticsUnitID;
    }

    /**
     * logisticsUnitID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link LogisticUnitID }
     * 
     */
    public void setLogisticsUnitID(LogisticUnitID value) {
        this.logisticsUnitID = value;
    }

    /**
     * logisticsUnitQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link INTEGERQuantity }
     * 
     */
    public INTEGERQuantity getLogisticsUnitQuantity() {
        return logisticsUnitQuantity;
    }

    /**
     * logisticsUnitQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link INTEGERQuantity }
     * 
     */
    public void setLogisticsUnitQuantity(INTEGERQuantity value) {
        this.logisticsUnitQuantity = value;
    }

}
