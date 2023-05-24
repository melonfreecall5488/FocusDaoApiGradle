
package com.smart.focus.ceoapi.wsdl2.product_result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ProductionLotManageConfirmationGroup complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotManageConfirmationGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfirmationGroupUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ProductionTask" type="{http://sap.com/xi/A1S/Global}ProductionTaskManageResponseMDT" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Activity" type="{http://sap.com/xi/A1S/Global}ActivityResponseManageMDT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaterialInput" type="{http://sap.com/xi/A1S/Global}MaterialInputManageBundle_Response" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaterialOutput" type="{http://sap.com/xi/A1S/Global}MaterialOutputManageBundle_Response" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReportingPoint" type="{http://sap.com/xi/A1S/Global}ProductionLotManageReportingPoint" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotManageConfirmationGroup", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "confirmationGroupUUID",
        "productionTask",
        "activity",
        "materialInput",
        "materialOutput",
        "reportingPoint"
})
public class ProductionLotManageConfirmationGroup {

    @XmlElement(name = "ConfirmationGroupUUID")
    protected UUID confirmationGroupUUID;
    @XmlElement(name = "ProductionTask", required = true)
    protected List<ProductionTaskManageResponseMDT> productionTask;
    @XmlElement(name = "Activity")
    protected List<ActivityResponseManageMDT> activity;
    @XmlElement(name = "MaterialInput")
    protected List<MaterialInputManageBundleResponse> materialInput;
    @XmlElement(name = "MaterialOutput")
    protected List<MaterialOutputManageBundleResponse> materialOutput;
    @XmlElement(name = "ReportingPoint")
    protected List<ProductionLotManageReportingPoint> reportingPoint;

    /**
     * confirmationGroupUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getConfirmationGroupUUID() {
        return confirmationGroupUUID;
    }

    /**
     * confirmationGroupUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setConfirmationGroupUUID(UUID value) {
        this.confirmationGroupUUID = value;
    }

    /**
     * Gets the value of the productionTask property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionTask
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getProductionTask().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionTaskManageResponseMDT }
     * 
     * 
     */
    public List<ProductionTaskManageResponseMDT> getProductionTask() {
        if (productionTask == null) {
            productionTask = new ArrayList<ProductionTaskManageResponseMDT>();
        }
        return this.productionTask;
    }

    /**
     * Gets the value of the activity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityResponseManageMDT }
     * 
     * 
     */
    public List<ActivityResponseManageMDT> getActivity() {
        if (activity == null) {
            activity = new ArrayList<ActivityResponseManageMDT>();
        }
        return this.activity;
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
     * {@link MaterialInputManageBundleResponse }
     * 
     * 
     */
    public List<MaterialInputManageBundleResponse> getMaterialInput() {
        if (materialInput == null) {
            materialInput = new ArrayList<MaterialInputManageBundleResponse>();
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
     * {@link MaterialOutputManageBundleResponse }
     * 
     * 
     */
    public List<MaterialOutputManageBundleResponse> getMaterialOutput() {
        if (materialOutput == null) {
            materialOutput = new ArrayList<MaterialOutputManageBundleResponse>();
        }
        return this.materialOutput;
    }

    /**
     * Gets the value of the reportingPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportingPoint
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getReportingPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotManageReportingPoint }
     * 
     * 
     */
    public List<ProductionLotManageReportingPoint> getReportingPoint() {
        if (reportingPoint == null) {
            reportingPoint = new ArrayList<ProductionLotManageReportingPoint>();
        }
        return this.reportingPoint;
    }

}
