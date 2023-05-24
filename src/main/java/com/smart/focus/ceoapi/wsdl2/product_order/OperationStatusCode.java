
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
 * OperationStatusCode complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="OperationStatusCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Life_Cycle_Status_Code" type="{http://sap.com/xi/AP/Common/GDT}LogisticsLifeCycleStatusCode"/&gt;
 *         &lt;element name="Release_Status_Code" type="{http://sap.com/xi/AP/Common/GDT}ReleaseStatusCode"/&gt;
 *         &lt;element name="Activit_Processing_Status_Code" type="{http://sap.com/xi/AP/Common/GDT}ProcessingStatusCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperationStatusCode", propOrder = {
        "lifeCycleStatusCode",
        "releaseStatusCode",
        "activitProcessingStatusCode"
})
public class OperationStatusCode {

    @XmlElement(name = "Life_Cycle_Status_Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "Release_Status_Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String releaseStatusCode;
    @XmlElement(name = "Activit_Processing_Status_Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String activitProcessingStatusCode;

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
     * releaseStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getReleaseStatusCode() {
        return releaseStatusCode;
    }

    /**
     * releaseStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setReleaseStatusCode(String value) {
        this.releaseStatusCode = value;
    }

    /**
     * activitProcessingStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getActivitProcessingStatusCode() {
        return activitProcessingStatusCode;
    }

    /**
     * activitProcessingStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setActivitProcessingStatusCode(String value) {
        this.activitProcessingStatusCode = value;
    }

}
