
package com.smart.focus.ceoapi.wsdl2.input_list;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SiteLogisticsLotOperationActivity complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsLotOperationActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SiteLogisticsLotOperationActivityUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="MaterialInput" type="{http://sap.com/xi/A1S/Global}SiteLogisticsLotMaterialInput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaterialOutput" type="{http://sap.com/xi/A1S/Global}SiteLogisticsLotMaterialOutput" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsLotOperationActivity", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "siteLogisticsLotOperationActivityUUID",
        "materialInput",
        "materialOutput"
})
public class SiteLogisticsLotOperationActivity {

    @XmlElement(name = "SiteLogisticsLotOperationActivityUUID")
    protected UUID siteLogisticsLotOperationActivityUUID;
    @XmlElement(name = "MaterialInput")
    protected List<SiteLogisticsLotMaterialInput> materialInput;
    @XmlElement(name = "MaterialOutput")
    protected List<SiteLogisticsLotMaterialOutput> materialOutput;

    /**
     * siteLogisticsLotOperationActivityUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getSiteLogisticsLotOperationActivityUUID() {
        return siteLogisticsLotOperationActivityUUID;
    }

    /**
     * siteLogisticsLotOperationActivityUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setSiteLogisticsLotOperationActivityUUID(UUID value) {
        this.siteLogisticsLotOperationActivityUUID = value;
    }

    /**
     * Gets the value of the materialInput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialInput
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getMaterialInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsLotMaterialInput }
     * 
     * 
     */
    public List<SiteLogisticsLotMaterialInput> getMaterialInput() {
        if (materialInput == null) {
            materialInput = new ArrayList<SiteLogisticsLotMaterialInput>();
        }
        return this.materialInput;
    }

    /**
     * Gets the value of the materialOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialOutput
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getMaterialOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteLogisticsLotMaterialOutput }
     * 
     * 
     */
    public List<SiteLogisticsLotMaterialOutput> getMaterialOutput() {
        if (materialOutput == null) {
            materialOutput = new ArrayList<SiteLogisticsLotMaterialOutput>();
        }
        return this.materialOutput;
    }

}
