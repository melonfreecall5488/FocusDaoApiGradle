
package com.smart.focus.ceoapi.wsdl2.material_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>MaterialByElementsResponseMaterialPlanning complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialPlanning"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForecastCategoryID" type="{http://sap.com/xi/AP/Common/GDT}ProductCategoryInternalID" minOccurs="0"/&gt;
 *         &lt;element name="SupplyPlanning" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialSupplyPlanning" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialPlanning", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "forecastCategoryID",
    "supplyPlanning"
})
public class MaterialByElementsResponseMaterialPlanning {

    @XmlElement(name = "ForecastCategoryID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String forecastCategoryID;
    @XmlElement(name = "SupplyPlanning")
    protected List<MaterialByElementsResponseMaterialSupplyPlanning> supplyPlanning;

    /**
     * forecastCategoryID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastCategoryID() {
        return forecastCategoryID;
    }

    /**
     * forecastCategoryID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastCategoryID(String value) {
        this.forecastCategoryID = value;
    }

    /**
     * Gets the value of the supplyPlanning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplyPlanning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplyPlanning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialSupplyPlanning }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialSupplyPlanning> getSupplyPlanning() {
        if (supplyPlanning == null) {
            supplyPlanning = new ArrayList<MaterialByElementsResponseMaterialSupplyPlanning>();
        }
        return this.supplyPlanning;
    }

}
