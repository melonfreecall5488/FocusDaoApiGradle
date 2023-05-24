
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
 * ActivityStatus complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ActivityStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Activity_Status_Code" type="{http://sap.com/xi/AP/Common/GDT}ReleaseStatusCode"/&gt;
 *         &lt;element name="Processing_Status_Code" type="{http://sap.com/xi/AP/Common/GDT}ProcessingStatusCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityStatus", propOrder = {
        "activityStatusCode",
        "processingStatusCode"
})
public class ActivityStatus {

    @XmlElement(name = "Activity_Status_Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String activityStatusCode;
    @XmlElement(name = "Processing_Status_Code", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String processingStatusCode;

    /**
     * activityStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getActivityStatusCode() {
        return activityStatusCode;
    }

    /**
     * activityStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setActivityStatusCode(String value) {
        this.activityStatusCode = value;
    }

    /**
     * processingStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getProcessingStatusCode() {
        return processingStatusCode;
    }

    /**
     * processingStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setProcessingStatusCode(String value) {
        this.processingStatusCode = value;
    }

}
