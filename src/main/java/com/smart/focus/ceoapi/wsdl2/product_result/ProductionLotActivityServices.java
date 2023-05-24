
package com.smart.focus.ceoapi.wsdl2.product_result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * ProductionLotActivityServices complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotActivityServices"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Service_ID" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *         &lt;element name="Resource_ID" type="{http://sap.com/xi/AP/Common/GDT}ResourceID" minOccurs="0"/&gt;
 *         &lt;element name="Confirmed_Quantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="ServiceConsumptionCalculationMethodCode" type="{http://sap.com/xi/AP/Common/GDT}ServiceProductConsumptionCalculationMethodCode" minOccurs="0"/&gt;
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
@XmlType(name = "ProductionLotActivityServices", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "serviceUUID",
        "serviceID",
        "resourceID",
        "confirmedQuantity",
        "serviceConsumptionCalculationMethodCode"
})
public class ProductionLotActivityServices {

    @XmlElement(name = "ServiceUUID")
    protected UUID serviceUUID;
    @XmlElement(name = "Service_ID")
    protected ProductID serviceID;
    @XmlElement(name = "Resource_ID")
    protected ResourceID resourceID;
    @XmlElement(name = "Confirmed_Quantity")
    protected Quantity confirmedQuantity;
    @XmlElement(name = "ServiceConsumptionCalculationMethodCode")
    protected ServiceProductConsumptionCalculationMethodCode serviceConsumptionCalculationMethodCode;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * serviceUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getServiceUUID() {
        return serviceUUID;
    }

    /**
     * serviceUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setServiceUUID(UUID value) {
        this.serviceUUID = value;
    }

    /**
     * serviceID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductID }
     * 
     */
    public ProductID getServiceID() {
        return serviceID;
    }

    /**
     * serviceID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductID }
     * 
     */
    public void setServiceID(ProductID value) {
        this.serviceID = value;
    }

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
     * confirmedQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getConfirmedQuantity() {
        return confirmedQuantity;
    }

    /**
     * confirmedQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setConfirmedQuantity(Quantity value) {
        this.confirmedQuantity = value;
    }

    /**
     * serviceConsumptionCalculationMethodCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ServiceProductConsumptionCalculationMethodCode }
     * 
     */
    public ServiceProductConsumptionCalculationMethodCode getServiceConsumptionCalculationMethodCode() {
        return serviceConsumptionCalculationMethodCode;
    }

    /**
     * serviceConsumptionCalculationMethodCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ServiceProductConsumptionCalculationMethodCode }
     * 
     */
    public void setServiceConsumptionCalculationMethodCode(ServiceProductConsumptionCalculationMethodCode value) {
        this.serviceConsumptionCalculationMethodCode = value;
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
