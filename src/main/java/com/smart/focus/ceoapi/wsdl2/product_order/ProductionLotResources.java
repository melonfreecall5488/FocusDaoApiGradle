
package com.smart.focus.ceoapi.wsdl2.product_order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;

/**
 * <p>
 * ProductionLotResources complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotResources"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResourceGroupID" type="{http://sap.com/xi/AP/Common/GDT}ResourceID" minOccurs="0"/&gt;
 *         &lt;element name="ResourceGroupDescription" type="{http://sap.com/xi/A1S/Global}ActivityResourceGroupDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResourceID" type="{http://sap.com/xi/AP/Common/GDT}ResourceID"/&gt;
 *         &lt;element name="ResourceType" type="{http://sap.com/xi/AP/Common/GDT}ResourceCategoryCode"/&gt;
 *         &lt;element name="MainResource" type="{http://sap.com/xi/AP/Common/GDT}Indicator"/&gt;
 *         &lt;element name="NumberOfResources" type="{http://sap.com/xi/AP/Common/GDT}NumberValue"/&gt;
 *         &lt;element name="TotalConfirmedCapacityConsumption" type="{http://sap.com/xi/AP/Common/GDT}TIME_Duration"/&gt;
 *         &lt;element name="ConfirmedDuration" type="{http://sap.com/xi/AP/Common/GDT}TIME_Duration"/&gt;
 *         &lt;element name="ConfirmationFinished" type="{http://sap.com/xi/AP/Common/GDT}Indicator"/&gt;
 *         &lt;element name="ResourceUtilisationUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotResources", propOrder = {
        "resourceGroupID",
        "resourceGroupDescription",
        "resourceID",
        "resourceType",
        "mainResource",
        "numberOfResources",
        "totalConfirmedCapacityConsumption",
        "confirmedDuration",
        "confirmationFinished",
        "resourceUtilisationUUID"
})
public class ProductionLotResources {

    @XmlElement(name = "ResourceGroupID")
    protected ResourceID resourceGroupID;
    @XmlElement(name = "ResourceGroupDescription")
    protected List<ActivityResourceGroupDescription> resourceGroupDescription;
    @XmlElement(name = "ResourceID", required = true)
    protected ResourceID resourceID;
    @XmlElement(name = "ResourceType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String resourceType;
    @XmlElement(name = "MainResource")
    protected boolean mainResource;
    @XmlElement(name = "NumberOfResources")
    protected int numberOfResources;
    @XmlElement(name = "TotalConfirmedCapacityConsumption", required = true)
    protected Duration totalConfirmedCapacityConsumption;
    @XmlElement(name = "ConfirmedDuration", required = true)
    protected Duration confirmedDuration;
    @XmlElement(name = "ConfirmationFinished")
    protected boolean confirmationFinished;
    @XmlElement(name = "ResourceUtilisationUUID", required = true)
    protected UUID resourceUtilisationUUID;

    /**
     * resourceGroupID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ResourceID }
     * 
     */
    public ResourceID getResourceGroupID() {
        return resourceGroupID;
    }

    /**
     * resourceGroupID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ResourceID }
     * 
     */
    public void setResourceGroupID(ResourceID value) {
        this.resourceGroupID = value;
    }

    /**
     * Gets the value of the resourceGroupDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * resourceGroupDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getResourceGroupDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityResourceGroupDescription }
     * 
     * 
     */
    public List<ActivityResourceGroupDescription> getResourceGroupDescription() {
        if (resourceGroupDescription == null) {
            resourceGroupDescription = new ArrayList<ActivityResourceGroupDescription>();
        }
        return this.resourceGroupDescription;
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
     * resourceType 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * resourceType 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setResourceType(String value) {
        this.resourceType = value;
    }

    /**
     * mainResource 속성의 값을 가져옵니다.
     * 
     */
    public boolean isMainResource() {
        return mainResource;
    }

    /**
     * mainResource 속성의 값을 설정합니다.
     * 
     */
    public void setMainResource(boolean value) {
        this.mainResource = value;
    }

    /**
     * numberOfResources 속성의 값을 가져옵니다.
     * 
     */
    public int getNumberOfResources() {
        return numberOfResources;
    }

    /**
     * numberOfResources 속성의 값을 설정합니다.
     * 
     */
    public void setNumberOfResources(int value) {
        this.numberOfResources = value;
    }

    /**
     * totalConfirmedCapacityConsumption 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getTotalConfirmedCapacityConsumption() {
        return totalConfirmedCapacityConsumption;
    }

    /**
     * totalConfirmedCapacityConsumption 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setTotalConfirmedCapacityConsumption(Duration value) {
        this.totalConfirmedCapacityConsumption = value;
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
     * confirmationFinished 속성의 값을 가져옵니다.
     * 
     */
    public boolean isConfirmationFinished() {
        return confirmationFinished;
    }

    /**
     * confirmationFinished 속성의 값을 설정합니다.
     * 
     */
    public void setConfirmationFinished(boolean value) {
        this.confirmationFinished = value;
    }

    /**
     * resourceUtilisationUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getResourceUtilisationUUID() {
        return resourceUtilisationUUID;
    }

    /**
     * resourceUtilisationUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setResourceUtilisationUUID(UUID value) {
        this.resourceUtilisationUUID = value;
    }

}
