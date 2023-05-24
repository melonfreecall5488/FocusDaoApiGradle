
package com.smart.focus.ceoapi.wsdl2.material;

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
 * MaterialByElementsResponseMaterialLogistics complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialLogistics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteID" type="{http://sap.com/xi/AP/Common/GDT}LocationID" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ProductProcessUsabilityLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="CycleCountPlannedDuration" type="{http://sap.com/xi/AP/Common/GDT}DAY_Duration" minOccurs="0"/&gt;
 *         &lt;element name="ProductionCategoryID" type="{http://sap.com/xi/AP/Common/GDT}ProductCategoryInternalID" minOccurs="0"/&gt;
 *         &lt;element name="StorageCategoryID" type="{http://sap.com/xi/AP/Common/GDT}ProductCategoryInternalID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialLogistics", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "siteID",
        "lifeCycleStatusCode",
        "cycleCountPlannedDuration",
        "productionCategoryID",
        "storageCategoryID"
})
public class MaterialByElementsResponseMaterialLogistics {

    @XmlElement(name = "SiteID")
    protected LocationID siteID;
    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "CycleCountPlannedDuration")
    protected Duration cycleCountPlannedDuration;
    @XmlElement(name = "ProductionCategoryID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productionCategoryID;
    @XmlElement(name = "StorageCategoryID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String storageCategoryID;

    /**
     * siteID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link LocationID }
     * 
     */
    public LocationID getSiteID() {
        return siteID;
    }

    /**
     * siteID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link LocationID }
     * 
     */
    public void setSiteID(LocationID value) {
        this.siteID = value;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setLifeCycleStatusCode(String value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * cycleCountPlannedDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Duration }
     * 
     */
    public Duration getCycleCountPlannedDuration() {
        return cycleCountPlannedDuration;
    }

    /**
     * cycleCountPlannedDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Duration }
     * 
     */
    public void setCycleCountPlannedDuration(Duration value) {
        this.cycleCountPlannedDuration = value;
    }

    /**
     * productionCategoryID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getProductionCategoryID() {
        return productionCategoryID;
    }

    /**
     * productionCategoryID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setProductionCategoryID(String value) {
        this.productionCategoryID = value;
    }

    /**
     * storageCategoryID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getStorageCategoryID() {
        return storageCategoryID;
    }

    /**
     * storageCategoryID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setStorageCategoryID(String value) {
        this.storageCategoryID = value;
    }

}
