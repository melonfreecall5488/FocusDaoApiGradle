
package com.smart.focus.ceoapi.wsdl2.input_send;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SiteLogisticsLotOperationActivityManageBundle_Request complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsLotOperationActivityManageBundle_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OperationActivityUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="DeliverySplitIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="MaterialInput" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskMaterialInputManageBundle_Request" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaterialOutput" type="{http://sap.com/xi/A1S/Global}SLTMaterialOutputManageBundle_Request" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsLotOperationActivityManageBundle_Request", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "operationActivityUUID",
        "deliverySplitIndicator",
        "materialInput",
        "materialOutput"
})
public class SiteLogisticsLotOperationActivityManageBundleRequest {

    @XmlElement(name = "OperationActivityUUID")
    protected UUID operationActivityUUID;
    @XmlElement(name = "DeliverySplitIndicator")
    protected Boolean deliverySplitIndicator;
    @XmlElement(name = "MaterialInput")
    protected List<SiteLogisticsTaskMaterialInputManageBundleRequest> materialInput;
    @XmlElement(name = "MaterialOutput")
    protected List<SLTMaterialOutputManageBundleRequest> materialOutput;

    /**
     * operationActivityUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getOperationActivityUUID() {
        return operationActivityUUID;
    }

    /**
     * operationActivityUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setOperationActivityUUID(UUID value) {
        this.operationActivityUUID = value;
    }

    /**
     * deliverySplitIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isDeliverySplitIndicator() {
        return deliverySplitIndicator;
    }

    /**
     * deliverySplitIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setDeliverySplitIndicator(Boolean value) {
        this.deliverySplitIndicator = value;
    }

    /**
     * Gets the value of the materialInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialInput
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getMaterialInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskMaterialInputManageBundleRequest }
     * 
     * 
     */
    public List<SiteLogisticsTaskMaterialInputManageBundleRequest> getMaterialInput() {
        if (materialInput == null) {
            materialInput = new ArrayList<SiteLogisticsTaskMaterialInputManageBundleRequest>();
        }
        return this.materialInput;
    }

    /**
     * Gets the value of the materialOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialOutput
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getMaterialOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SLTMaterialOutputManageBundleRequest }
     * 
     * 
     */
    public List<SLTMaterialOutputManageBundleRequest> getMaterialOutput() {
        if (materialOutput == null) {
            materialOutput = new ArrayList<SLTMaterialOutputManageBundleRequest>();
        }
        return this.materialOutput;
    }

}
