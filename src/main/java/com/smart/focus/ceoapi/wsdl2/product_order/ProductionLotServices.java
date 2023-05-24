
package com.smart.focus.ceoapi.wsdl2.product_order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ProductionLotServices complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotServices"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ServiceID" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="ResourceID" type="{http://sap.com/xi/AP/Common/GDT}ResourceID" minOccurs="0"/&gt;
 *         &lt;element name="ResourceDescription" type="{http://sap.com/xi/A1S/Global}ServiceResourceDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MainResource" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="TotalConfirmedQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmedQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationFinished" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ServiceConsumptionCalculationMethodCode" type="{http://sap.com/xi/AP/Common/GDT}ServiceProductConsumptionCalculationMethodCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotServices", propOrder = {
        "serviceUUID",
        "serviceID",
        "serviceDescription",
        "resourceID",
        "resourceDescription",
        "mainResource",
        "totalConfirmedQuantity",
        "confirmedQuantity",
        "confirmationFinished",
        "serviceConsumptionCalculationMethodCode"
})
public class ProductionLotServices {

    @XmlElement(name = "ServiceUUID")
    protected UUID serviceUUID;
    @XmlElement(name = "ServiceID")
    protected ProductID serviceID;
    @XmlElement(name = "ServiceDescription")
    protected String serviceDescription;
    @XmlElement(name = "ResourceID")
    protected ResourceID resourceID;
    @XmlElement(name = "ResourceDescription")
    protected List<ServiceResourceDescription> resourceDescription;
    @XmlElement(name = "MainResource")
    protected Boolean mainResource;
    @XmlElement(name = "TotalConfirmedQuantity")
    protected Quantity totalConfirmedQuantity;
    @XmlElement(name = "ConfirmedQuantity")
    protected Quantity confirmedQuantity;
    @XmlElement(name = "ConfirmationFinished")
    protected Boolean confirmationFinished;
    @XmlElement(name = "ServiceConsumptionCalculationMethodCode")
    protected ServiceProductConsumptionCalculationMethodCode serviceConsumptionCalculationMethodCode;

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
     * serviceDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getServiceDescription() {
        return serviceDescription;
    }

    /**
     * serviceDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setServiceDescription(String value) {
        this.serviceDescription = value;
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
     * Gets the value of the resourceDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * resourceDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getResourceDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceResourceDescription }
     * 
     * 
     */
    public List<ServiceResourceDescription> getResourceDescription() {
        if (resourceDescription == null) {
            resourceDescription = new ArrayList<ServiceResourceDescription>();
        }
        return this.resourceDescription;
    }

    /**
     * mainResource 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isMainResource() {
        return mainResource;
    }

    /**
     * mainResource 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setMainResource(Boolean value) {
        this.mainResource = value;
    }

    /**
     * totalConfirmedQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getTotalConfirmedQuantity() {
        return totalConfirmedQuantity;
    }

    /**
     * totalConfirmedQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setTotalConfirmedQuantity(Quantity value) {
        this.totalConfirmedQuantity = value;
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
     * confirmationFinished 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isConfirmationFinished() {
        return confirmationFinished;
    }

    /**
     * confirmationFinished 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setConfirmationFinished(Boolean value) {
        this.confirmationFinished = value;
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

}
