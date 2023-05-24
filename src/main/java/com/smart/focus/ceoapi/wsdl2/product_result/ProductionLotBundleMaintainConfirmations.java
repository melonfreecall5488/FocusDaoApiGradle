
package com.smart.focus.ceoapi.wsdl2.product_result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ProductionLotBundleMaintainConfirmations complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotBundleMaintainConfirmations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductionLotID" type="{http://sap.com/xi/AP/Common/GDT}ProductInternalID"/&gt;
 *         &lt;element name="ProductionLotUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID"/&gt;
 *         &lt;element name="ProductionLotLog" type="{http://sap.com/xi/A1S/Global}ProductionLotBundleLog" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotBundleMaintainConfirmations", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "productionLotID",
        "productionLotUUID",
        "productionLotLog"
})
public class ProductionLotBundleMaintainConfirmations {

    @XmlElement(name = "ProductionLotID", required = true)
    protected ProductInternalID productionLotID;
    @XmlElement(name = "ProductionLotUUID", required = true)
    protected UUID productionLotUUID;
    @XmlElement(name = "ProductionLotLog")
    protected List<ProductionLotBundleLog> productionLotLog;

    /**
     * productionLotID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductInternalID }
     * 
     */
    public ProductInternalID getProductionLotID() {
        return productionLotID;
    }

    /**
     * productionLotID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductInternalID }
     * 
     */
    public void setProductionLotID(ProductInternalID value) {
        this.productionLotID = value;
    }

    /**
     * productionLotUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getProductionLotUUID() {
        return productionLotUUID;
    }

    /**
     * productionLotUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setProductionLotUUID(UUID value) {
        this.productionLotUUID = value;
    }

    /**
     * Gets the value of the productionLotLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productionLotLog
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getProductionLotLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotBundleLog }
     * 
     * 
     */
    public List<ProductionLotBundleLog> getProductionLotLog() {
        if (productionLotLog == null) {
            productionLotLog = new ArrayList<ProductionLotBundleLog>();
        }
        return this.productionLotLog;
    }

}
