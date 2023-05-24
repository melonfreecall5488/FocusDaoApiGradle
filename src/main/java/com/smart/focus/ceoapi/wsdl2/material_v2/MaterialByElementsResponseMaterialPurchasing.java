
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
 * <p>MaterialByElementsResponseMaterialPurchasing complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialPurchasing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}ProductProcessUsabilityLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingMeasureUnitCode" type="{http://sap.com/xi/AP/Common/GDT}MeasureUnitCode" minOccurs="0"/&gt;
 *         &lt;element name="InternalNote" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialLanguateIndependentText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingNote" type="{http://sap.com/xi/A1S/Global}MaterialByElementsResponseMaterialText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialPurchasing", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "lifeCycleStatusCode",
    "purchasingMeasureUnitCode",
    "internalNote",
    "purchasingNote"
})
public class MaterialByElementsResponseMaterialPurchasing {

    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "PurchasingMeasureUnitCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String purchasingMeasureUnitCode;
    @XmlElement(name = "InternalNote")
    protected List<MaterialByElementsResponseMaterialLanguateIndependentText> internalNote;
    @XmlElement(name = "PurchasingNote")
    protected List<MaterialByElementsResponseMaterialText> purchasingNote;

    /**
     * lifeCycleStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleStatusCode(String value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * purchasingMeasureUnitCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchasingMeasureUnitCode() {
        return purchasingMeasureUnitCode;
    }

    /**
     * purchasingMeasureUnitCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchasingMeasureUnitCode(String value) {
        this.purchasingMeasureUnitCode = value;
    }

    /**
     * Gets the value of the internalNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialLanguateIndependentText }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialLanguateIndependentText> getInternalNote() {
        if (internalNote == null) {
            internalNote = new ArrayList<MaterialByElementsResponseMaterialLanguateIndependentText>();
        }
        return this.internalNote;
    }

    /**
     * Gets the value of the purchasingNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchasingNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchasingNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialByElementsResponseMaterialText }
     * 
     * 
     */
    public List<MaterialByElementsResponseMaterialText> getPurchasingNote() {
        if (purchasingNote == null) {
            purchasingNote = new ArrayList<MaterialByElementsResponseMaterialText>();
        }
        return this.purchasingNote;
    }

}
