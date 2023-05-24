
package com.smart.focus.ceoapi.wsdl2.supplier;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ExtSelectionByAmount complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ExtSelectionByAmount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByAmount" type="{http://sap.com/xi/AP/Common/Global}SelectionByAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SelectionByCurrencyCode" type="{http://sap.com/xi/AP/Common/Global}SelectionByCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtSelectionByAmount", namespace = "http://sap.com/xi/Extensibility/Global", propOrder = {
        "selectionByAmount",
        "selectionByCurrencyCode"
})
public class ExtSelectionByAmount {

    @XmlElement(name = "SelectionByAmount")
    protected List<SelectionByAmount> selectionByAmount;
    @XmlElement(name = "SelectionByCurrencyCode")
    protected List<SelectionByCode> selectionByCurrencyCode;

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
     * {@link SelectionByAmount }
     * 
     * 
     */
    public List<SelectionByAmount> getSelectionByAmount() {
        if (selectionByAmount == null) {
            selectionByAmount = new ArrayList<SelectionByAmount>();
        }
        return this.selectionByAmount;
    }

    /**
     * Gets the value of the selectionByCurrencyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * selectionByCurrencyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSelectionByCurrencyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByCode }
     * 
     * 
     */
    public List<SelectionByCode> getSelectionByCurrencyCode() {
        if (selectionByCurrencyCode == null) {
            selectionByCurrencyCode = new ArrayList<SelectionByCode>();
        }
        return this.selectionByCurrencyCode;
    }

}
