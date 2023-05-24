
package com.smart.focus.ceoapi.wsdl2.product_result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ProductionLotBundleMaintainConfirmationMessage_sync complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotBundleMaintainConfirmationMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductionLotResponse" type="{http://sap.com/xi/A1S/Global}ProductionLotBundleMaintainConfirmations" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ExceptionMessage" type="{http://sap.com/xi/A1S/Global}ProductionLotBundleException" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotBundleMaintainConfirmationMessage_sync", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "productionLotResponse",
        "exceptionMessage"
})
public class ProductionLotBundleMaintainConfirmationMessageSync {

    @XmlElement(name = "ProductionLotResponse", required = true)
    protected List<ProductionLotBundleMaintainConfirmations> productionLotResponse;
    @XmlElement(name = "ExceptionMessage")
    protected ProductionLotBundleException exceptionMessage;

    /**
     * Gets the value of the productionLotResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * productionLotResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getProductionLotResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotBundleMaintainConfirmations }
     * 
     * 
     */
    public List<ProductionLotBundleMaintainConfirmations> getProductionLotResponse() {
        if (productionLotResponse == null) {
            productionLotResponse = new ArrayList<ProductionLotBundleMaintainConfirmations>();
        }
        return this.productionLotResponse;
    }

    /**
     * exceptionMessage 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductionLotBundleException }
     * 
     */
    public ProductionLotBundleException getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * exceptionMessage 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductionLotBundleException }
     * 
     */
    public void setExceptionMessage(ProductionLotBundleException value) {
        this.exceptionMessage = value;
    }

}
