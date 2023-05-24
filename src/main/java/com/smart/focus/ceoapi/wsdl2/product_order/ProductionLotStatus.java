
package com.smart.focus.ceoapi.wsdl2.product_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * ProductionLotStatus complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Life_Cycle_Status_Code" type="{http://sap.com/xi/AP/Common/GDT}LogisticsLifeCycleStatusCode"/&gt;
 *         &lt;element name="Activity_porcess_Status_Code" type="{http://sap.com/xi/AP/Common/GDT}ProcessingStatusCode"/&gt;
 *         &lt;element name="Rep_Point_Processing_Status_Code" type="{http://sap.com/xi/AP/Common/GDT}ProcessingStatusCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotStatus", propOrder = {
        "lifeCycleStatusCode",
        "activityPorcessStatusCode",
        "repPointProcessingStatusCode"
})
public class ProductionLotStatus {

    @XmlElement(name = "Life_Cycle_Status_Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "Activity_porcess_Status_Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String activityPorcessStatusCode;
    @XmlElement(name = "Rep_Point_Processing_Status_Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String repPointProcessingStatusCode;

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
     * activityPorcessStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getActivityPorcessStatusCode() {
        return activityPorcessStatusCode;
    }

    /**
     * activityPorcessStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setActivityPorcessStatusCode(String value) {
        this.activityPorcessStatusCode = value;
    }

    /**
     * repPointProcessingStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getRepPointProcessingStatusCode() {
        return repPointProcessingStatusCode;
    }

    /**
     * repPointProcessingStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setRepPointProcessingStatusCode(String value) {
        this.repPointProcessingStatusCode = value;
    }

}
