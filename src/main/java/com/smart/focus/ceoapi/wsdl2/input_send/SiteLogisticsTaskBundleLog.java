
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
 * SiteLogisticsTaskBundleLog complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskBundleLog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteLogisticsTaskNodeName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="SiteLogisticsTaskNodeID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="SiteLogisticsTaskSeverityCode" type="{http://sap.com/xi/AP/Common/GDT}LogItemSeverityCode" minOccurs="0"/&gt;
 *         &lt;element name="SiteLogisticsTaskNote" type="{http://sap.com/xi/AP/Common/GDT}LogItemNote" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskBundleLog", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "siteLogisticsTaskNodeName",
        "siteLogisticsTaskNodeID",
        "siteLogisticsTaskSeverityCode",
        "siteLogisticsTaskNote"
})
public class SiteLogisticsTaskBundleLog {

    @XmlElement(name = "SiteLogisticsTaskNodeName")
    protected String siteLogisticsTaskNodeName;
    @XmlElement(name = "SiteLogisticsTaskNodeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String siteLogisticsTaskNodeID;
    @XmlElement(name = "SiteLogisticsTaskSeverityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String siteLogisticsTaskSeverityCode;
    @XmlElement(name = "SiteLogisticsTaskNote")
    protected String siteLogisticsTaskNote;

    /**
     * siteLogisticsTaskNodeName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSiteLogisticsTaskNodeName() {
        return siteLogisticsTaskNodeName;
    }

    /**
     * siteLogisticsTaskNodeName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSiteLogisticsTaskNodeName(String value) {
        this.siteLogisticsTaskNodeName = value;
    }

    /**
     * siteLogisticsTaskNodeID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSiteLogisticsTaskNodeID() {
        return siteLogisticsTaskNodeID;
    }

    /**
     * siteLogisticsTaskNodeID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSiteLogisticsTaskNodeID(String value) {
        this.siteLogisticsTaskNodeID = value;
    }

    /**
     * siteLogisticsTaskSeverityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSiteLogisticsTaskSeverityCode() {
        return siteLogisticsTaskSeverityCode;
    }

    /**
     * siteLogisticsTaskSeverityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSiteLogisticsTaskSeverityCode(String value) {
        this.siteLogisticsTaskSeverityCode = value;
    }

    /**
     * siteLogisticsTaskNote 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSiteLogisticsTaskNote() {
        return siteLogisticsTaskNote;
    }

    /**
     * siteLogisticsTaskNote 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSiteLogisticsTaskNote(String value) {
        this.siteLogisticsTaskNote = value;
    }

}
