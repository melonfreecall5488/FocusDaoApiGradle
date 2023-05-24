
package com.smart.focus.ceoapi.wsdl2.material;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * MaterialByElementsQuerySelectionByElements complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsQuerySelectionByElements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByDescription" type="{http://sap.com/xi/A1S/Global}MaterialByElementsQuerySelectionByDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByInternalID" type="{http://sap.com/xi/A1S/Global}MaterialByElementsQuerySelectionByInternalID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByIdentifiedStockTypeCode" type="{http://sap.com/xi/A1S/Global}MaterialByElementsQuerySelectionByIdentifiedStockTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionBySearchText" type="{http://sap.com/xi/AP/Common/GDT}SearchText" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCreatedSinceDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByLastChangeSinceDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B}Ext00163EA977381EEC87F426564B8262E0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsQuerySelectionByElements", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "selectionByDescription",
        "selectionByInternalID",
        "selectionByIdentifiedStockTypeCode",
        "selectionBySearchText",
        "selectionByCreatedSinceDateTime",
        "selectionByLastChangeSinceDateTime",
        "zMaterialUOMB7AD952QPQ6NZ0DX95SWUJ8PG"
})
public class MaterialByElementsQuerySelectionByElements {

    @XmlElement(name = "SelectionByDescription")
    protected List<MaterialByElementsQuerySelectionByDescription> selectionByDescription;
    @XmlElement(name = "SelectionByInternalID")
    protected List<MaterialByElementsQuerySelectionByInternalID> selectionByInternalID;
    @XmlElement(name = "SelectionByIdentifiedStockTypeCode")
    protected List<MaterialByElementsQuerySelectionByIdentifiedStockTypeCode> selectionByIdentifiedStockTypeCode;
    @XmlElement(name = "SelectionBySearchText")
    protected String selectionBySearchText;
    @XmlElement(name = "SelectionByCreatedSinceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar selectionByCreatedSinceDateTime;
    @XmlElement(name = "SelectionByLastChangeSinceDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar selectionByLastChangeSinceDateTime;
    @XmlElement(name = "ZMaterialUOM_B7AD952QPQ6NZ0DX95SWUJ8PG", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A4A0B")
    protected ExtSelectionByLongText zMaterialUOMB7AD952QPQ6NZ0DX95SWUJ8PG;

    /**
     * Gets the value of the selectionByDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsQuerySelectionByDescription }
     * 
     * 
     */
    public List<MaterialByElementsQuerySelectionByDescription> getSelectionByDescription() {
        if (selectionByDescription == null) {
            selectionByDescription = new ArrayList<MaterialByElementsQuerySelectionByDescription>();
        }
        return this.selectionByDescription;
    }

    /**
     * Gets the value of the selectionByInternalID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByInternalID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByInternalID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsQuerySelectionByInternalID }
     * 
     * 
     */
    public List<MaterialByElementsQuerySelectionByInternalID> getSelectionByInternalID() {
        if (selectionByInternalID == null) {
            selectionByInternalID = new ArrayList<MaterialByElementsQuerySelectionByInternalID>();
        }
        return this.selectionByInternalID;
    }

    /**
     * Gets the value of the selectionByIdentifiedStockTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByIdentifiedStockTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByIdentifiedStockTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsQuerySelectionByIdentifiedStockTypeCode }
     * 
     * 
     */
    public List<MaterialByElementsQuerySelectionByIdentifiedStockTypeCode> getSelectionByIdentifiedStockTypeCode() {
        if (selectionByIdentifiedStockTypeCode == null) {
            selectionByIdentifiedStockTypeCode = new ArrayList<MaterialByElementsQuerySelectionByIdentifiedStockTypeCode>();
        }
        return this.selectionByIdentifiedStockTypeCode;
    }

    /**
     * selectionBySearchText 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSelectionBySearchText() {
        return selectionBySearchText;
    }

    /**
     * selectionBySearchText 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSelectionBySearchText(String value) {
        this.selectionBySearchText = value;
    }

    /**
     * selectionByCreatedSinceDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getSelectionByCreatedSinceDateTime() {
        return selectionByCreatedSinceDateTime;
    }

    /**
     * selectionByCreatedSinceDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setSelectionByCreatedSinceDateTime(XMLGregorianCalendar value) {
        this.selectionByCreatedSinceDateTime = value;
    }

    /**
     * selectionByLastChangeSinceDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getSelectionByLastChangeSinceDateTime() {
        return selectionByLastChangeSinceDateTime;
    }

    /**
     * selectionByLastChangeSinceDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setSelectionByLastChangeSinceDateTime(XMLGregorianCalendar value) {
        this.selectionByLastChangeSinceDateTime = value;
    }

    /**
     * zMaterialUOMB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ExtSelectionByLongText }
     * 
     */
    public ExtSelectionByLongText getZMaterialUOMB7AD952QPQ6NZ0DX95SWUJ8PG() {
        return zMaterialUOMB7AD952QPQ6NZ0DX95SWUJ8PG;
    }

    /**
     * zMaterialUOMB7AD952QPQ6NZ0DX95SWUJ8PG 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ExtSelectionByLongText }
     * 
     */
    public void setZMaterialUOMB7AD952QPQ6NZ0DX95SWUJ8PG(ExtSelectionByLongText value) {
        this.zMaterialUOMB7AD952QPQ6NZ0DX95SWUJ8PG = value;
    }

}
