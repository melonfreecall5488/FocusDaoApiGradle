
package com.smart.focus.ceoapi.wsdl2.product_order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ProductionLotSelectionByElements complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotSelectionByElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByProductionLotID" type="{http://sap.com/xi/A1S/Global}ProductionLotSelectionByLotID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByProductionOrderID" type="{http://sap.com/xi/A1S/Global}ProductionLotSelectionByProductionOrderID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByProductionRequestID" type="{http://sap.com/xi/A1S/Global}ProductionLotSelectByProductionRequestID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByProductionLotStatusCode" type="{http://sap.com/xi/A1S/Global}ProductionLotSelectionByLifeCycleStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByOutputProductID" type="{http://sap.com/xi/A1S/Global}ProductionLotQueryByOutputMaterial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySiteID" type="{http://sap.com/xi/A1S/Global}ProductionLotSelectBySiteID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByProductionLotCreationDateTime" type="{http://sap.com/xi/A1S/Global}SelectionByProductionLotDates" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByProductionLotLastChangeDateTime" type="{http://sap.com/xi/A1S/Global}SelectionByProductionLotDates" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotSelectionByElements", propOrder = {
        "selectionByProductionLotID",
        "selectionByProductionOrderID",
        "selectionByProductionRequestID",
        "selectionByProductionLotStatusCode",
        "selectionByOutputProductID",
        "selectionBySiteID",
        "selectionByProductionLotCreationDateTime",
        "selectionByProductionLotLastChangeDateTime"
})
public class ProductionLotSelectionByElements {

    @XmlElement(name = "SelectionByProductionLotID")
    protected List<ProductionLotSelectionByLotID> selectionByProductionLotID;
    @XmlElement(name = "SelectionByProductionOrderID")
    protected List<ProductionLotSelectionByProductionOrderID> selectionByProductionOrderID;
    @XmlElement(name = "SelectionByProductionRequestID")
    protected List<ProductionLotSelectByProductionRequestID> selectionByProductionRequestID;
    @XmlElement(name = "SelectionByProductionLotStatusCode")
    protected List<ProductionLotSelectionByLifeCycleStatusCode> selectionByProductionLotStatusCode;
    @XmlElement(name = "SelectionByOutputProductID")
    protected List<ProductionLotQueryByOutputMaterial> selectionByOutputProductID;
    @XmlElement(name = "SelectionBySiteID")
    protected List<ProductionLotSelectBySiteID> selectionBySiteID;
    @XmlElement(name = "SelectionByProductionLotCreationDateTime")
    protected List<SelectionByProductionLotDates> selectionByProductionLotCreationDateTime;
    @XmlElement(name = "SelectionByProductionLotLastChangeDateTime")
    protected List<SelectionByProductionLotDates> selectionByProductionLotLastChangeDateTime;

    /**
     * Gets the value of the selectionByProductionLotID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByProductionLotID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByProductionLotID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotSelectionByLotID }
     * 
     * 
     */
    public List<ProductionLotSelectionByLotID> getSelectionByProductionLotID() {
        if (selectionByProductionLotID == null) {
            selectionByProductionLotID = new ArrayList<ProductionLotSelectionByLotID>();
        }
        return this.selectionByProductionLotID;
    }

    /**
     * Gets the value of the selectionByProductionOrderID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByProductionOrderID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByProductionOrderID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotSelectionByProductionOrderID }
     * 
     * 
     */
    public List<ProductionLotSelectionByProductionOrderID> getSelectionByProductionOrderID() {
        if (selectionByProductionOrderID == null) {
            selectionByProductionOrderID = new ArrayList<ProductionLotSelectionByProductionOrderID>();
        }
        return this.selectionByProductionOrderID;
    }

    /**
     * Gets the value of the selectionByProductionRequestID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByProductionRequestID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByProductionRequestID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotSelectByProductionRequestID }
     * 
     * 
     */
    public List<ProductionLotSelectByProductionRequestID> getSelectionByProductionRequestID() {
        if (selectionByProductionRequestID == null) {
            selectionByProductionRequestID = new ArrayList<ProductionLotSelectByProductionRequestID>();
        }
        return this.selectionByProductionRequestID;
    }

    /**
     * Gets the value of the selectionByProductionLotStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByProductionLotStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByProductionLotStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotSelectionByLifeCycleStatusCode }
     * 
     * 
     */
    public List<ProductionLotSelectionByLifeCycleStatusCode> getSelectionByProductionLotStatusCode() {
        if (selectionByProductionLotStatusCode == null) {
            selectionByProductionLotStatusCode = new ArrayList<ProductionLotSelectionByLifeCycleStatusCode>();
        }
        return this.selectionByProductionLotStatusCode;
    }

    /**
     * Gets the value of the selectionByOutputProductID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByOutputProductID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByOutputProductID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotQueryByOutputMaterial }
     * 
     * 
     */
    public List<ProductionLotQueryByOutputMaterial> getSelectionByOutputProductID() {
        if (selectionByOutputProductID == null) {
            selectionByOutputProductID = new ArrayList<ProductionLotQueryByOutputMaterial>();
        }
        return this.selectionByOutputProductID;
    }

    /**
     * Gets the value of the selectionBySiteID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionBySiteID
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionBySiteID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotSelectBySiteID }
     * 
     * 
     */
    public List<ProductionLotSelectBySiteID> getSelectionBySiteID() {
        if (selectionBySiteID == null) {
            selectionBySiteID = new ArrayList<ProductionLotSelectBySiteID>();
        }
        return this.selectionBySiteID;
    }

    /**
     * Gets the value of the selectionByProductionLotCreationDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByProductionLotCreationDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByProductionLotCreationDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByProductionLotDates }
     * 
     * 
     */
    public List<SelectionByProductionLotDates> getSelectionByProductionLotCreationDateTime() {
        if (selectionByProductionLotCreationDateTime == null) {
            selectionByProductionLotCreationDateTime = new ArrayList<SelectionByProductionLotDates>();
        }
        return this.selectionByProductionLotCreationDateTime;
    }

    /**
     * Gets the value of the selectionByProductionLotLastChangeDateTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByProductionLotLastChangeDateTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByProductionLotLastChangeDateTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByProductionLotDates }
     * 
     * 
     */
    public List<SelectionByProductionLotDates> getSelectionByProductionLotLastChangeDateTime() {
        if (selectionByProductionLotLastChangeDateTime == null) {
            selectionByProductionLotLastChangeDateTime = new ArrayList<SelectionByProductionLotDates>();
        }
        return this.selectionByProductionLotLastChangeDateTime;
    }

}
