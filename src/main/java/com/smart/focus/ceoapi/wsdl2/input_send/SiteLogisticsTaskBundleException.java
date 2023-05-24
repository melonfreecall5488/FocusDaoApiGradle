
package com.smart.focus.ceoapi.wsdl2.input_send;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * SiteLogisticsTaskBundleException complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskBundleException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageNote" type="{http://sap.com/xi/AP/Common/GDT}LogItemNote" minOccurs="0"/&gt;
 *         &lt;element name="SeverityCode" type="{http://sap.com/xi/AP/Common/GDT}LogItemSeverityCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskBundleException", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "messageNote",
        "severityCode"
})
public class SiteLogisticsTaskBundleException {

    @XmlElement(name = "MessageNote")
    protected String messageNote;
    @XmlElement(name = "SeverityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String severityCode;

    /**
     * messageNote 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getMessageNote() {
        return messageNote;
    }

    /**
     * messageNote 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setMessageNote(String value) {
        this.messageNote = value;
    }

    /**
     * severityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSeverityCode() {
        return severityCode;
    }

    /**
     * severityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSeverityCode(String value) {
        this.severityCode = value;
    }

}
