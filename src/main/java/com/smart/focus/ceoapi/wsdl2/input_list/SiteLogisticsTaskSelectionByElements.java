
package com.smart.focus.ceoapi.wsdl2.input_list;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SiteLogisticsTaskSelectionByElements complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskSelectionByElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionBySiteLogisticsTaskID" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskSelectionByTaskId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByReferenceDocumentID" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskSelectionByLotID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByReferenceDocumentTypeCode" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskSelectionByRefDocTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByProcessTypeCode" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskSelectionByProcessTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByMaterialDescription" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskSelectionByMaterialDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBarCodeText" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskSelectionByBarCodeText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLabelID" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskSelectionByLabelID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByResponsibleEmployeeID" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskSelectionByResponsibleEmployeeID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByProcessingStatusCode" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskSelectionByProcessingStatusCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySiteID" type="{http://sap.com/xi/A1S/Global}SiteLogisticsTaskSelectionBySiteID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskSelectionByElements", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "selectionBySiteLogisticsTaskID",
        "selectionByReferenceDocumentID",
        "selectionByReferenceDocumentTypeCode",
        "selectionByProcessTypeCode",
        "selectionByMaterialDescription",
        "selectionByBarCodeText",
        "selectionByLabelID",
        "selectionByResponsibleEmployeeID",
        "selectionByProcessingStatusCode",
        "selectionBySiteID"
})
public class SiteLogisticsTaskSelectionByElements {

    @XmlElement(name = "SelectionBySiteLogisticsTaskID")
    protected List<SiteLogisticsTaskSelectionByTaskId> selectionBySiteLogisticsTaskID;
    @XmlElement(name = "SelectionByReferenceDocumentID")
    protected List<SiteLogisticsTaskSelectionByLotID> selectionByReferenceDocumentID;
    @XmlElement(name = "SelectionByReferenceDocumentTypeCode")
    protected List<SiteLogisticsTaskSelectionByRefDocTypeCode> selectionByReferenceDocumentTypeCode;
    @XmlElement(name = "SelectionByProcessTypeCode")
    protected SiteLogisticsTaskSelectionByProcessTypeCode selectionByProcessTypeCode;
    @XmlElement(name = "SelectionByMaterialDescription")
    protected List<SiteLogisticsTaskSelectionByMaterialDescription> selectionByMaterialDescription;
    @XmlElement(name = "SelectionByBarCodeText")
    protected List<SiteLogisticsTaskSelectionByBarCodeText> selectionByBarCodeText;
    @XmlElement(name = "SelectionByLabelID")
    protected List<SiteLogisticsTaskSelectionByLabelID> selectionByLabelID;
    @XmlElement(name = "SelectionByResponsibleEmployeeID")
    protected List<SiteLogisticsTaskSelectionByResponsibleEmployeeID> selectionByResponsibleEmployeeID;
    @XmlElement(name = "SelectionByProcessingStatusCode")
    protected List<SiteLogisticsTaskSelectionByProcessingStatusCode> selectionByProcessingStatusCode;
    @XmlElement(name = "SelectionBySiteID")
    protected List<SiteLogisticsTaskSelectionBySiteID> selectionBySiteID;

    /**
     * Gets the value of the selectionBySiteLogisticsTaskID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionBySiteLogisticsTaskID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionBySiteLogisticsTaskID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskSelectionByTaskId }
     * 
     * 
     */
    public List<SiteLogisticsTaskSelectionByTaskId> getSelectionBySiteLogisticsTaskID() {
        if (selectionBySiteLogisticsTaskID == null) {
            selectionBySiteLogisticsTaskID = new ArrayList<SiteLogisticsTaskSelectionByTaskId>();
        }
        return this.selectionBySiteLogisticsTaskID;
    }

    /**
     * Gets the value of the selectionByReferenceDocumentID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByReferenceDocumentID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByReferenceDocumentID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskSelectionByLotID }
     * 
     * 
     */
    public List<SiteLogisticsTaskSelectionByLotID> getSelectionByReferenceDocumentID() {
        if (selectionByReferenceDocumentID == null) {
            selectionByReferenceDocumentID = new ArrayList<SiteLogisticsTaskSelectionByLotID>();
        }
        return this.selectionByReferenceDocumentID;
    }

    /**
     * Gets the value of the selectionByReferenceDocumentTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByReferenceDocumentTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByReferenceDocumentTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskSelectionByRefDocTypeCode }
     * 
     * 
     */
    public List<SiteLogisticsTaskSelectionByRefDocTypeCode> getSelectionByReferenceDocumentTypeCode() {
        if (selectionByReferenceDocumentTypeCode == null) {
            selectionByReferenceDocumentTypeCode = new ArrayList<SiteLogisticsTaskSelectionByRefDocTypeCode>();
        }
        return this.selectionByReferenceDocumentTypeCode;
    }

    /**
     * selectionByProcessTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SiteLogisticsTaskSelectionByProcessTypeCode }
     * 
     */
    public SiteLogisticsTaskSelectionByProcessTypeCode getSelectionByProcessTypeCode() {
        return selectionByProcessTypeCode;
    }

    /**
     * selectionByProcessTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SiteLogisticsTaskSelectionByProcessTypeCode }
     * 
     */
    public void setSelectionByProcessTypeCode(SiteLogisticsTaskSelectionByProcessTypeCode value) {
        this.selectionByProcessTypeCode = value;
    }

    /**
     * Gets the value of the selectionByMaterialDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByMaterialDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByMaterialDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskSelectionByMaterialDescription }
     * 
     * 
     */
    public List<SiteLogisticsTaskSelectionByMaterialDescription> getSelectionByMaterialDescription() {
        if (selectionByMaterialDescription == null) {
            selectionByMaterialDescription = new ArrayList<SiteLogisticsTaskSelectionByMaterialDescription>();
        }
        return this.selectionByMaterialDescription;
    }

    /**
     * Gets the value of the selectionByBarCodeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByBarCodeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByBarCodeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskSelectionByBarCodeText }
     * 
     * 
     */
    public List<SiteLogisticsTaskSelectionByBarCodeText> getSelectionByBarCodeText() {
        if (selectionByBarCodeText == null) {
            selectionByBarCodeText = new ArrayList<SiteLogisticsTaskSelectionByBarCodeText>();
        }
        return this.selectionByBarCodeText;
    }

    /**
     * Gets the value of the selectionByLabelID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByLabelID
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByLabelID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskSelectionByLabelID }
     * 
     * 
     */
    public List<SiteLogisticsTaskSelectionByLabelID> getSelectionByLabelID() {
        if (selectionByLabelID == null) {
            selectionByLabelID = new ArrayList<SiteLogisticsTaskSelectionByLabelID>();
        }
        return this.selectionByLabelID;
    }

    /**
     * Gets the value of the selectionByResponsibleEmployeeID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByResponsibleEmployeeID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByResponsibleEmployeeID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskSelectionByResponsibleEmployeeID }
     * 
     * 
     */
    public List<SiteLogisticsTaskSelectionByResponsibleEmployeeID> getSelectionByResponsibleEmployeeID() {
        if (selectionByResponsibleEmployeeID == null) {
            selectionByResponsibleEmployeeID = new ArrayList<SiteLogisticsTaskSelectionByResponsibleEmployeeID>();
        }
        return this.selectionByResponsibleEmployeeID;
    }

    /**
     * Gets the value of the selectionByProcessingStatusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByProcessingStatusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByProcessingStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsTaskSelectionByProcessingStatusCode }
     * 
     * 
     */
    public List<SiteLogisticsTaskSelectionByProcessingStatusCode> getSelectionByProcessingStatusCode() {
        if (selectionByProcessingStatusCode == null) {
            selectionByProcessingStatusCode = new ArrayList<SiteLogisticsTaskSelectionByProcessingStatusCode>();
        }
        return this.selectionByProcessingStatusCode;
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
     * {@link SiteLogisticsTaskSelectionBySiteID }
     * 
     * 
     */
    public List<SiteLogisticsTaskSelectionBySiteID> getSelectionBySiteID() {
        if (selectionBySiteID == null) {
            selectionBySiteID = new ArrayList<SiteLogisticsTaskSelectionBySiteID>();
        }
        return this.selectionBySiteID;
    }

}
