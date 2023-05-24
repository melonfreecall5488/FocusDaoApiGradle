
package com.smart.focus.ceoapi.wsdl2.webServiceTask;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MDR_SiteLogisticTaskQueryByElementsSimpleByRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MDR_SiteLogisticTaskQueryByElementsSimpleByRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByTNO_USTRASales" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNO_USTRASales" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTNO_USTRAOrd" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNO_USTRAOrd" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTNO_Sales" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNO_Sales" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTCD_Status" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCD_Status" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTCD_DISTBROUT" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCD_DISTBROUT" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTDT_Sales" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTDT_Sales" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTDT_Created" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTDT_Created" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTFG_DLV" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTFG_DLV" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTCD_CUST" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCD_CUST" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTMD_Indicator" type="{http://0027131779-one-off.sap.com/Y57MOATJY_}MDR_SiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTMD_Indicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MDR_SiteLogisticTaskQueryByElementsSimpleByRequest", propOrder = {
    "selectionByTNOUSTRASales",
    "selectionByTNOUSTRAOrd",
    "selectionByTNOSales",
    "selectionByTCDStatus",
    "selectionByTCDDISTBROUT",
    "selectionByTDTSales",
    "selectionByTDTCreated",
    "selectionByTFGDLV",
    "selectionByTCDCUST",
    "selectionByTMDIndicator"
})
public class MDRSiteLogisticTaskQueryByElementsSimpleByRequest {

    @XmlElement(name = "SelectionByTNO_USTRASales")
    protected List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNOUSTRASales> selectionByTNOUSTRASales;
    @XmlElement(name = "SelectionByTNO_USTRAOrd")
    protected List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNOUSTRAOrd> selectionByTNOUSTRAOrd;
    @XmlElement(name = "SelectionByTNO_Sales")
    protected List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNOSales> selectionByTNOSales;
    @XmlElement(name = "SelectionByTCD_Status")
    protected List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDStatus> selectionByTCDStatus;
    @XmlElement(name = "SelectionByTCD_DISTBROUT")
    protected List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDDISTBROUT> selectionByTCDDISTBROUT;
    @XmlElement(name = "SelectionByTDT_Sales")
    protected List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTDTSales> selectionByTDTSales;
    @XmlElement(name = "SelectionByTDT_Created")
    protected List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTDTCreated> selectionByTDTCreated;
    @XmlElement(name = "SelectionByTFG_DLV")
    protected List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTFGDLV> selectionByTFGDLV;
    @XmlElement(name = "SelectionByTCD_CUST")
    protected List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDCUST> selectionByTCDCUST;
    @XmlElement(name = "SelectionByTMD_Indicator")
    protected List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTMDIndicator> selectionByTMDIndicator;

    /**
     * Gets the value of the selectionByTNOUSTRASales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByTNOUSTRASales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByTNOUSTRASales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNOUSTRASales }
     * 
     * 
     */
    public List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNOUSTRASales> getSelectionByTNOUSTRASales() {
        if (selectionByTNOUSTRASales == null) {
            selectionByTNOUSTRASales = new ArrayList<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNOUSTRASales>();
        }
        return this.selectionByTNOUSTRASales;
    }

    /**
     * Gets the value of the selectionByTNOUSTRAOrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByTNOUSTRAOrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByTNOUSTRAOrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNOUSTRAOrd }
     * 
     * 
     */
    public List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNOUSTRAOrd> getSelectionByTNOUSTRAOrd() {
        if (selectionByTNOUSTRAOrd == null) {
            selectionByTNOUSTRAOrd = new ArrayList<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNOUSTRAOrd>();
        }
        return this.selectionByTNOUSTRAOrd;
    }

    /**
     * Gets the value of the selectionByTNOSales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByTNOSales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByTNOSales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNOSales }
     * 
     * 
     */
    public List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNOSales> getSelectionByTNOSales() {
        if (selectionByTNOSales == null) {
            selectionByTNOSales = new ArrayList<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTNOSales>();
        }
        return this.selectionByTNOSales;
    }

    /**
     * Gets the value of the selectionByTCDStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByTCDStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByTCDStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDStatus }
     * 
     * 
     */
    public List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDStatus> getSelectionByTCDStatus() {
        if (selectionByTCDStatus == null) {
            selectionByTCDStatus = new ArrayList<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDStatus>();
        }
        return this.selectionByTCDStatus;
    }

    /**
     * Gets the value of the selectionByTCDDISTBROUT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByTCDDISTBROUT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByTCDDISTBROUT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDDISTBROUT }
     * 
     * 
     */
    public List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDDISTBROUT> getSelectionByTCDDISTBROUT() {
        if (selectionByTCDDISTBROUT == null) {
            selectionByTCDDISTBROUT = new ArrayList<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDDISTBROUT>();
        }
        return this.selectionByTCDDISTBROUT;
    }

    /**
     * Gets the value of the selectionByTDTSales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByTDTSales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByTDTSales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTDTSales }
     * 
     * 
     */
    public List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTDTSales> getSelectionByTDTSales() {
        if (selectionByTDTSales == null) {
            selectionByTDTSales = new ArrayList<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTDTSales>();
        }
        return this.selectionByTDTSales;
    }

    /**
     * Gets the value of the selectionByTDTCreated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByTDTCreated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByTDTCreated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTDTCreated }
     * 
     * 
     */
    public List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTDTCreated> getSelectionByTDTCreated() {
        if (selectionByTDTCreated == null) {
            selectionByTDTCreated = new ArrayList<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTDTCreated>();
        }
        return this.selectionByTDTCreated;
    }

    /**
     * Gets the value of the selectionByTFGDLV property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByTFGDLV property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByTFGDLV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTFGDLV }
     * 
     * 
     */
    public List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTFGDLV> getSelectionByTFGDLV() {
        if (selectionByTFGDLV == null) {
            selectionByTFGDLV = new ArrayList<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTFGDLV>();
        }
        return this.selectionByTFGDLV;
    }

    /**
     * Gets the value of the selectionByTCDCUST property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByTCDCUST property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByTCDCUST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDCUST }
     * 
     * 
     */
    public List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDCUST> getSelectionByTCDCUST() {
        if (selectionByTCDCUST == null) {
            selectionByTCDCUST = new ArrayList<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTCDCUST>();
        }
        return this.selectionByTCDCUST;
    }

    /**
     * Gets the value of the selectionByTMDIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByTMDIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByTMDIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTMDIndicator }
     * 
     * 
     */
    public List<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTMDIndicator> getSelectionByTMDIndicator() {
        if (selectionByTMDIndicator == null) {
            selectionByTMDIndicator = new ArrayList<MDRSiteLogisticTaskQueryByElementsSimpleByRequestSelectionByTMDIndicator>();
        }
        return this.selectionByTMDIndicator;
    }

}
