
package com.smart.focus.ceoapi.wsdl2.material_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ExtSelectionByIdentifier complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ExtSelectionByIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectionByIdentifier" type="{http://sap.com/xi/AP/Common/Global}SelectionByIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtSelectionByIdentifier", namespace = "http://sap.com/xi/Extensibility/Global", propOrder = {
    "selectionByIdentifier"
})
public class ExtSelectionByIdentifier {

    @XmlElement(name = "SelectionByIdentifier")
    protected List<SelectionByIdentifier> selectionByIdentifier;

    /**
     * Gets the value of the selectionByIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectionByIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectionByIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionByIdentifier }
     * 
     * 
     */
    public List<SelectionByIdentifier> getSelectionByIdentifier() {
        if (selectionByIdentifier == null) {
            selectionByIdentifier = new ArrayList<SelectionByIdentifier>();
        }
        return this.selectionByIdentifier;
    }

}
