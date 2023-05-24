
package com.smart.focus.ceoapi.wsdl2.input_send;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SiteLogisticsTaskBundleMaintainResponseMessage_sync complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskBundleMaintainResponseMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteLogisticsTaskResponse" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskBundleMaintainResponse" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ExceptionMessage" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskBundleException" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskBundleMaintainResponseMessage_sync", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "siteLogisticsTaskResponse",
        "exceptionMessage"
})
public class SiteLogisticsTaskBundleMaintainResponseMessageSync {

    @XmlElement(name = "SiteLogisticsTaskResponse", required = true)
    protected List<SiteLogisticsTaskBundleMaintainResponse> siteLogisticsTaskResponse;
    @XmlElement(name = "ExceptionMessage")
    protected List<SiteLogisticsTaskBundleException> exceptionMessage;

    /**
     * Gets the value of the siteLogisticsTaskResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * siteLogisticsTaskResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSiteLogisticsTaskResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskBundleMaintainResponse }
     * 
     * 
     */
    public List<SiteLogisticsTaskBundleMaintainResponse> getSiteLogisticsTaskResponse() {
        if (siteLogisticsTaskResponse == null) {
            siteLogisticsTaskResponse = new ArrayList<SiteLogisticsTaskBundleMaintainResponse>();
        }
        return this.siteLogisticsTaskResponse;
    }

    /**
     * Gets the value of the exceptionMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptionMessage
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getExceptionMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskBundleException }
     * 
     * 
     */
    public List<SiteLogisticsTaskBundleException> getExceptionMessage() {
        if (exceptionMessage == null) {
            exceptionMessage = new ArrayList<SiteLogisticsTaskBundleException>();
        }
        return this.exceptionMessage;
    }

}
