
package com.smart.focus.ceoapi.wsdl2.input_send;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SiteLogisticsTaskBundleMaintainResponse complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskBundleMaintainResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaskID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="TaskUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="SiteLogisticsTaskLog" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskBundleLog" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskBundleMaintainResponse", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "taskID",
        "taskUUID",
        "siteLogisticsTaskLog"
})
public class SiteLogisticsTaskBundleMaintainResponse {

    @XmlElement(name = "TaskID")
    protected BusinessTransactionDocumentID taskID;
    @XmlElement(name = "TaskUUID")
    protected UUID taskUUID;
    @XmlElement(name = "SiteLogisticsTaskLog")
    protected List<SiteLogisticsTaskBundleLog> siteLogisticsTaskLog;

    /**
     * taskID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessTransactionDocumentID }
     * 
     */
    public BusinessTransactionDocumentID getTaskID() {
        return taskID;
    }

    /**
     * taskID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessTransactionDocumentID }
     * 
     */
    public void setTaskID(BusinessTransactionDocumentID value) {
        this.taskID = value;
    }

    /**
     * taskUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getTaskUUID() {
        return taskUUID;
    }

    /**
     * taskUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setTaskUUID(UUID value) {
        this.taskUUID = value;
    }

    /**
     * Gets the value of the siteLogisticsTaskLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * siteLogisticsTaskLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSiteLogisticsTaskLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskBundleLog }
     * 
     * 
     */
    public List<SiteLogisticsTaskBundleLog> getSiteLogisticsTaskLog() {
        if (siteLogisticsTaskLog == null) {
            siteLogisticsTaskLog = new ArrayList<SiteLogisticsTaskBundleLog>();
        }
        return this.siteLogisticsTaskLog;
    }

}
