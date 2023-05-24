
package com.smart.focus.ceoapi.wsdl2.consumptionCostCEO;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConsumptionCostCBOQueryByElementsSimpleByRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionCostCBOQueryByElementsSimpleByRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByOwnerID" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByOwnerID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySiteID" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionBySiteID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCostCenterID" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByCostCenterID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCreateDate" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByCreateDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByExcuteDate" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByExcuteDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLogisticsAreaID_S" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByLogisticsAreaID_S" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByStatusCD" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByStatusCD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySubstitutionsID" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionBySubstitutionsID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByAssortment" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByAssortment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByReasonCD" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByReasonCD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByConfirmationID" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByConfirmationID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByimsiUUID" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByimsiUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBO_MDR" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByBO_MDR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionCostCBOQueryByElementsSimpleByRequest", propOrder = {
    "selectionByOwnerID",
    "selectionBySiteID",
    "selectionByCostCenterID",
    "selectionByCreateDate",
    "selectionByExcuteDate",
    "selectionByLogisticsAreaIDS",
    "selectionByStatusCD",
    "selectionBySubstitutionsID",
    "selectionByAssortment",
    "selectionByReasonCD",
    "selectionByConfirmationID",
    "selectionByimsiUUID",
    "selectionByBOMDR"
})
public class ConsumptionCostCBOQueryByElementsSimpleByRequest {

    @XmlElement(name = "SelectionByOwnerID")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByOwnerID> selectionByOwnerID;
    @XmlElement(name = "SelectionBySiteID")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionBySiteID> selectionBySiteID;
    @XmlElement(name = "SelectionByCostCenterID")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByCostCenterID> selectionByCostCenterID;
    @XmlElement(name = "SelectionByCreateDate")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByCreateDate> selectionByCreateDate;
    @XmlElement(name = "SelectionByExcuteDate")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByExcuteDate> selectionByExcuteDate;
    @XmlElement(name = "SelectionByLogisticsAreaID_S")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByLogisticsAreaIDS> selectionByLogisticsAreaIDS;
    @XmlElement(name = "SelectionByStatusCD")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByStatusCD> selectionByStatusCD;
    @XmlElement(name = "SelectionBySubstitutionsID")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionBySubstitutionsID> selectionBySubstitutionsID;
    @XmlElement(name = "SelectionByAssortment")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByAssortment> selectionByAssortment;
    @XmlElement(name = "SelectionByReasonCD")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByReasonCD> selectionByReasonCD;
    @XmlElement(name = "SelectionByConfirmationID")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByConfirmationID> selectionByConfirmationID;
    @XmlElement(name = "SelectionByimsiUUID")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByimsiUUID> selectionByimsiUUID;
    @XmlElement(name = "SelectionByBO_MDR")
    protected List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByBOMDR> selectionByBOMDR;

    /**
     * Gets the value of the selectionByOwnerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByOwnerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByOwnerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByOwnerID }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByOwnerID> getSelectionByOwnerID() {
        if (selectionByOwnerID == null) {
            selectionByOwnerID = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByOwnerID>();
        }
        return this.selectionByOwnerID;
    }

    /**
     * Gets the value of the selectionBySiteID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionBySiteID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionBySiteID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionBySiteID }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionBySiteID> getSelectionBySiteID() {
        if (selectionBySiteID == null) {
            selectionBySiteID = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionBySiteID>();
        }
        return this.selectionBySiteID;
    }

    /**
     * Gets the value of the selectionByCostCenterID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByCostCenterID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByCostCenterID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByCostCenterID }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByCostCenterID> getSelectionByCostCenterID() {
        if (selectionByCostCenterID == null) {
            selectionByCostCenterID = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByCostCenterID>();
        }
        return this.selectionByCostCenterID;
    }

    /**
     * Gets the value of the selectionByCreateDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByCreateDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByCreateDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByCreateDate }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByCreateDate> getSelectionByCreateDate() {
        if (selectionByCreateDate == null) {
            selectionByCreateDate = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByCreateDate>();
        }
        return this.selectionByCreateDate;
    }

    /**
     * Gets the value of the selectionByExcuteDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByExcuteDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByExcuteDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByExcuteDate }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByExcuteDate> getSelectionByExcuteDate() {
        if (selectionByExcuteDate == null) {
            selectionByExcuteDate = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByExcuteDate>();
        }
        return this.selectionByExcuteDate;
    }

    /**
     * Gets the value of the selectionByLogisticsAreaIDS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByLogisticsAreaIDS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByLogisticsAreaIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByLogisticsAreaIDS }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByLogisticsAreaIDS> getSelectionByLogisticsAreaIDS() {
        if (selectionByLogisticsAreaIDS == null) {
            selectionByLogisticsAreaIDS = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByLogisticsAreaIDS>();
        }
        return this.selectionByLogisticsAreaIDS;
    }

    /**
     * Gets the value of the selectionByStatusCD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByStatusCD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByStatusCD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByStatusCD }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByStatusCD> getSelectionByStatusCD() {
        if (selectionByStatusCD == null) {
            selectionByStatusCD = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByStatusCD>();
        }
        return this.selectionByStatusCD;
    }

    /**
     * Gets the value of the selectionBySubstitutionsID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionBySubstitutionsID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionBySubstitutionsID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionBySubstitutionsID }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionBySubstitutionsID> getSelectionBySubstitutionsID() {
        if (selectionBySubstitutionsID == null) {
            selectionBySubstitutionsID = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionBySubstitutionsID>();
        }
        return this.selectionBySubstitutionsID;
    }

    /**
     * Gets the value of the selectionByAssortment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByAssortment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByAssortment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByAssortment }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByAssortment> getSelectionByAssortment() {
        if (selectionByAssortment == null) {
            selectionByAssortment = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByAssortment>();
        }
        return this.selectionByAssortment;
    }

    /**
     * Gets the value of the selectionByReasonCD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByReasonCD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByReasonCD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByReasonCD }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByReasonCD> getSelectionByReasonCD() {
        if (selectionByReasonCD == null) {
            selectionByReasonCD = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByReasonCD>();
        }
        return this.selectionByReasonCD;
    }

    /**
     * Gets the value of the selectionByConfirmationID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByConfirmationID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByConfirmationID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByConfirmationID }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByConfirmationID> getSelectionByConfirmationID() {
        if (selectionByConfirmationID == null) {
            selectionByConfirmationID = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByConfirmationID>();
        }
        return this.selectionByConfirmationID;
    }

    /**
     * Gets the value of the selectionByimsiUUID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByimsiUUID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByimsiUUID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByimsiUUID }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByimsiUUID> getSelectionByimsiUUID() {
        if (selectionByimsiUUID == null) {
            selectionByimsiUUID = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByimsiUUID>();
        }
        return this.selectionByimsiUUID;
    }

    /**
     * Gets the value of the selectionByBOMDR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByBOMDR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByBOMDR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByBOMDR }
     * 
     * 
     */
    public List<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByBOMDR> getSelectionByBOMDR() {
        if (selectionByBOMDR == null) {
            selectionByBOMDR = new ArrayList<ConsumptionCostCBOQueryByElementsSimpleByRequestSelectionByBOMDR>();
        }
        return this.selectionByBOMDR;
    }

}
