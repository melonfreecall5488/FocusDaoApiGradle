
package com.smart.focus.ceoapi.wsdl2.input_send;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SiteLogisticsTaskMaintainRequestBundleMessage complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskMaintainRequestBundleMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasicMessageHeader" type="{http://sap.com/xi/AP/Common/GDT}BusinessDocumentBasicMessageHeader"/&gt;
 *         &lt;element name="SiteLogisticsTask" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskMaintainBundleRequest" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskMaintainRequestBundleMessage", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "basicMessageHeader",
        "siteLogisticsTask"
})
public class SiteLogisticsTaskMaintainRequestBundleMessage {

    @XmlElement(name = "BasicMessageHeader", required = true)
    protected BusinessDocumentBasicMessageHeader basicMessageHeader;
    @XmlElement(name = "SiteLogisticsTask")
    protected List<SiteLogisticsTaskMaintainBundleRequest> siteLogisticsTask;

    /**
     * basicMessageHeader 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessDocumentBasicMessageHeader }
     * 
     */
    public BusinessDocumentBasicMessageHeader getBasicMessageHeader() {
        return basicMessageHeader;
    }

    /**
     * basicMessageHeader 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessDocumentBasicMessageHeader }
     * 
     */
    public void setBasicMessageHeader(BusinessDocumentBasicMessageHeader value) {
        this.basicMessageHeader = value;
    }

    /**
     * Gets the value of the siteLogisticsTask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the siteLogisticsTask
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSiteLogisticsTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskMaintainBundleRequest }
     * 
     * 
     */
    public List<SiteLogisticsTaskMaintainBundleRequest> getSiteLogisticsTask() {
        if (siteLogisticsTask == null) {
            siteLogisticsTask = new ArrayList<SiteLogisticsTaskMaintainBundleRequest>();
        }
        return this.siteLogisticsTask;
    }

}
