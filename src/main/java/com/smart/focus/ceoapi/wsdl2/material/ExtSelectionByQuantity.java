
package com.smart.focus.ceoapi.wsdl2.material;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ExtSelectionByQuantity complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ExtSelectionByQuantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByAmount" type="{http://sap.com/xi/AP/Common/Global}SelectionByQuantity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByUnitCode" type="{http://sap.com/xi/AP/Common/Global}SelectionByCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtSelectionByQuantity", namespace = "http://sap.com/xi/Extensibility/Global", propOrder = {
        "selectionByAmount",
        "selectionByUnitCode"
})
public class ExtSelectionByQuantity {

    @XmlElement(name = "SelectionByAmount")
    protected List<SelectionByQuantity> selectionByAmount;
    @XmlElement(name = "SelectionByUnitCode")
    protected List<SelectionByCode> selectionByUnitCode;

    /**
     * Gets the value of the selectionByAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByAmount
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByQuantity }
     * 
     * 
     */
    public List<SelectionByQuantity> getSelectionByAmount() {
        if (selectionByAmount == null) {
            selectionByAmount = new ArrayList<SelectionByQuantity>();
        }
        return this.selectionByAmount;
    }

    /**
     * Gets the value of the selectionByUnitCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByUnitCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByUnitCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByCode }
     * 
     * 
     */
    public List<SelectionByCode> getSelectionByUnitCode() {
        if (selectionByUnitCode == null) {
            selectionByUnitCode = new ArrayList<SelectionByCode>();
        }
        return this.selectionByUnitCode;
    }

}
