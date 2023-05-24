
package com.smart.focus.ceoapi.wsdl2.goodsMovementCEO;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GoodsMovementCBOQueryByElementsSimpleByRequest complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GoodsMovementCBOQueryByElementsSimpleByRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByOwnerID" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByOwnerID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTransitNO" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByTransitNO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByShopID" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByShopID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByShopNM" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByShopNM" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySiteID" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionBySiteID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCreateDate" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByCreateDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByExcuteDate" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByExcuteDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySourceAreaID_S" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionBySourceAreaID_S" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByTargetAreaID_S" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByTargetAreaID_S" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByConfirmationID" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByConfirmationID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByimsiUUID" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByimsiUUID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByStatusCD" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByStatusCD" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByBO_MDR" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByBO_MDR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsMovementCBOQueryByElementsSimpleByRequest", propOrder = {
    "selectionByOwnerID",
    "selectionByTransitNO",
    "selectionByShopID",
    "selectionByShopNM",
    "selectionBySiteID",
    "selectionByCreateDate",
    "selectionByExcuteDate",
    "selectionBySourceAreaIDS",
    "selectionByTargetAreaIDS",
    "selectionByConfirmationID",
    "selectionByimsiUUID",
    "selectionByStatusCD",
    "selectionByBOMDR"
})
public class GoodsMovementCBOQueryByElementsSimpleByRequest {

    @XmlElement(name = "SelectionByOwnerID")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByOwnerID> selectionByOwnerID;
    @XmlElement(name = "SelectionByTransitNO")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByTransitNO> selectionByTransitNO;
    @XmlElement(name = "SelectionByShopID")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByShopID> selectionByShopID;
    @XmlElement(name = "SelectionByShopNM")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByShopNM> selectionByShopNM;
    @XmlElement(name = "SelectionBySiteID")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionBySiteID> selectionBySiteID;
    @XmlElement(name = "SelectionByCreateDate")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByCreateDate> selectionByCreateDate;
    @XmlElement(name = "SelectionByExcuteDate")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByExcuteDate> selectionByExcuteDate;
    @XmlElement(name = "SelectionBySourceAreaID_S")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionBySourceAreaIDS> selectionBySourceAreaIDS;
    @XmlElement(name = "SelectionByTargetAreaID_S")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByTargetAreaIDS> selectionByTargetAreaIDS;
    @XmlElement(name = "SelectionByConfirmationID")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByConfirmationID> selectionByConfirmationID;
    @XmlElement(name = "SelectionByimsiUUID")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByimsiUUID> selectionByimsiUUID;
    @XmlElement(name = "SelectionByStatusCD")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByStatusCD> selectionByStatusCD;
    @XmlElement(name = "SelectionByBO_MDR")
    protected List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByBOMDR> selectionByBOMDR;

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
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByOwnerID }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByOwnerID> getSelectionByOwnerID() {
        if (selectionByOwnerID == null) {
            selectionByOwnerID = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByOwnerID>();
        }
        return this.selectionByOwnerID;
    }

    /**
     * Gets the value of the selectionByTransitNO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByTransitNO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByTransitNO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByTransitNO }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByTransitNO> getSelectionByTransitNO() {
        if (selectionByTransitNO == null) {
            selectionByTransitNO = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByTransitNO>();
        }
        return this.selectionByTransitNO;
    }

    /**
     * Gets the value of the selectionByShopID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByShopID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByShopID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByShopID }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByShopID> getSelectionByShopID() {
        if (selectionByShopID == null) {
            selectionByShopID = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByShopID>();
        }
        return this.selectionByShopID;
    }

    /**
     * Gets the value of the selectionByShopNM property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByShopNM property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByShopNM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByShopNM }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByShopNM> getSelectionByShopNM() {
        if (selectionByShopNM == null) {
            selectionByShopNM = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByShopNM>();
        }
        return this.selectionByShopNM;
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
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionBySiteID }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionBySiteID> getSelectionBySiteID() {
        if (selectionBySiteID == null) {
            selectionBySiteID = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionBySiteID>();
        }
        return this.selectionBySiteID;
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
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByCreateDate }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByCreateDate> getSelectionByCreateDate() {
        if (selectionByCreateDate == null) {
            selectionByCreateDate = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByCreateDate>();
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
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByExcuteDate }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByExcuteDate> getSelectionByExcuteDate() {
        if (selectionByExcuteDate == null) {
            selectionByExcuteDate = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByExcuteDate>();
        }
        return this.selectionByExcuteDate;
    }

    /**
     * Gets the value of the selectionBySourceAreaIDS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionBySourceAreaIDS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionBySourceAreaIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionBySourceAreaIDS }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionBySourceAreaIDS> getSelectionBySourceAreaIDS() {
        if (selectionBySourceAreaIDS == null) {
            selectionBySourceAreaIDS = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionBySourceAreaIDS>();
        }
        return this.selectionBySourceAreaIDS;
    }

    /**
     * Gets the value of the selectionByTargetAreaIDS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByTargetAreaIDS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByTargetAreaIDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByTargetAreaIDS }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByTargetAreaIDS> getSelectionByTargetAreaIDS() {
        if (selectionByTargetAreaIDS == null) {
            selectionByTargetAreaIDS = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByTargetAreaIDS>();
        }
        return this.selectionByTargetAreaIDS;
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
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByConfirmationID }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByConfirmationID> getSelectionByConfirmationID() {
        if (selectionByConfirmationID == null) {
            selectionByConfirmationID = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByConfirmationID>();
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
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByimsiUUID }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByimsiUUID> getSelectionByimsiUUID() {
        if (selectionByimsiUUID == null) {
            selectionByimsiUUID = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByimsiUUID>();
        }
        return this.selectionByimsiUUID;
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
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByStatusCD }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByStatusCD> getSelectionByStatusCD() {
        if (selectionByStatusCD == null) {
            selectionByStatusCD = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByStatusCD>();
        }
        return this.selectionByStatusCD;
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
     * {@link GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByBOMDR }
     * 
     * 
     */
    public List<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByBOMDR> getSelectionByBOMDR() {
        if (selectionByBOMDR == null) {
            selectionByBOMDR = new ArrayList<GoodsMovementCBOQueryByElementsSimpleByRequestSelectionByBOMDR>();
        }
        return this.selectionByBOMDR;
    }

}
