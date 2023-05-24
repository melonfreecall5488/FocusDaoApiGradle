
package com.smart.focus.ceoapi.wsdl2.webServiceTask;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MDR_SiteLogisticTaskCreateConfirmationMessage_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MDR_SiteLogisticTaskCreateConfirmationMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MDR_SiteLogisticTask" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskCreateConfirmation" minOccurs="0"/&gt;
 *         &lt;element name="Log" type="{http://sap.com/xi/AP/Common/GDT}Log"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDR_SiteLogisticTaskCreateConfirmationMessage_sync", propOrder = {
    "mdrSiteLogisticTask",
    "log"
})
public class MDRSiteLogisticTaskCreateConfirmationMessageSync {

    @XmlElement(name = "MDR_SiteLogisticTask")
    protected MDRSiteLogisticTaskCreateConfirmation mdrSiteLogisticTask;
    @XmlElement(name = "Log", required = true)
    protected Log log;

    /**
     * mdrSiteLogisticTask 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MDRSiteLogisticTaskCreateConfirmation }
     *     
     */
    public MDRSiteLogisticTaskCreateConfirmation getMDRSiteLogisticTask() {
        return mdrSiteLogisticTask;
    }

    /**
     * mdrSiteLogisticTask 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MDRSiteLogisticTaskCreateConfirmation }
     *     
     */
    public void setMDRSiteLogisticTask(MDRSiteLogisticTaskCreateConfirmation value) {
        this.mdrSiteLogisticTask = value;
    }

    /**
     * log 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * log 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
    }

}
