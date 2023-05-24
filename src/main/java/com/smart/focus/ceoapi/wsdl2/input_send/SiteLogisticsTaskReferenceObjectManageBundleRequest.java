
package com.smart.focus.ceoapi.wsdl2.input_send;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SiteLogisticsTaskReferenceObjectManageBundle_Request complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskReferenceObjectManageBundle_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenceObjectUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="OperationActivity" type="{http://sap.com/xi/A1S/Global}SiteLogisticsLotOperationActivityManageBundle_Request" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskReferenceObjectManageBundle_Request", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "referenceObjectUUID",
        "operationActivity"
})
public class SiteLogisticsTaskReferenceObjectManageBundleRequest {

    @XmlElement(name = "ReferenceObjectUUID")
    protected UUID referenceObjectUUID;
    @XmlElement(name = "OperationActivity")
    protected List<SiteLogisticsLotOperationActivityManageBundleRequest> operationActivity;

    /**
     * referenceObjectUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getReferenceObjectUUID() {
        return referenceObjectUUID;
    }

    /**
     * referenceObjectUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setReferenceObjectUUID(UUID value) {
        this.referenceObjectUUID = value;
    }

    /**
     * Gets the value of the operationActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationActivity
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getOperationActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsLotOperationActivityManageBundleRequest }
     * 
     * 
     */
    public List<SiteLogisticsLotOperationActivityManageBundleRequest> getOperationActivity() {
        if (operationActivity == null) {
            operationActivity = new ArrayList<SiteLogisticsLotOperationActivityManageBundleRequest>();
        }
        return this.operationActivity;
    }

}
