
package com.smart.focus.ceoapi.wsdl2.input_list;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SiteLogisticsTaskReferencedObject complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskReferencedObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferencedObjectUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="SiteLogisticsLotOperationActivity" type="{http://sap.com/xi/A1S/Global}SiteLogisticsLotOperationActivity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskReferencedObject", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "referencedObjectUUID",
        "siteLogisticsLotOperationActivity"
})
public class SiteLogisticsTaskReferencedObject {

    @XmlElement(name = "ReferencedObjectUUID")
    protected UUID referencedObjectUUID;
    @XmlElement(name = "SiteLogisticsLotOperationActivity")
    protected SiteLogisticsLotOperationActivity siteLogisticsLotOperationActivity;

    /**
     * referencedObjectUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getReferencedObjectUUID() {
        return referencedObjectUUID;
    }

    /**
     * referencedObjectUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setReferencedObjectUUID(UUID value) {
        this.referencedObjectUUID = value;
    }

    /**
     * siteLogisticsLotOperationActivity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SiteLogisticsLotOperationActivity }
     * 
     */
    public SiteLogisticsLotOperationActivity getSiteLogisticsLotOperationActivity() {
        return siteLogisticsLotOperationActivity;
    }

    /**
     * siteLogisticsLotOperationActivity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SiteLogisticsLotOperationActivity }
     * 
     */
    public void setSiteLogisticsLotOperationActivity(SiteLogisticsLotOperationActivity value) {
        this.siteLogisticsLotOperationActivity = value;
    }

}
