
package com.smart.focus.ceoapi.wsdl2.product_result;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ProdLotMaintainRequestBundleMaterial_sync_V1 complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProdLotMaintainRequestBundleMaterial_sync_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductionLotID" type="{http://sap.com/xi/AP/Common/GDT}BusinessTransactionDocumentID" minOccurs="0"/&gt;
 *         &lt;element name="ProductionLotUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ConfirmationGroup" type="{http://sap.com/xi/A1S/Global}ProductionLotManageConfirmationGroup" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdLotMaintainRequestBundleMaterial_sync_V1", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "productionLotID",
        "productionLotUUID",
        "confirmationGroup"
})
public class ProdLotMaintainRequestBundleMaterialSyncV1 {

    @XmlElement(name = "ProductionLotID")
    protected BusinessTransactionDocumentID productionLotID;
    @XmlElement(name = "ProductionLotUUID")
    protected UUID productionLotUUID;
    @XmlElement(name = "ConfirmationGroup", required = true)
    protected List<ProductionLotManageConfirmationGroup> confirmationGroup;

    /**
     * productionLotID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessTransactionDocumentID }
     * 
     */
    public BusinessTransactionDocumentID getProductionLotID() {
        return productionLotID;
    }

    /**
     * productionLotID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessTransactionDocumentID }
     * 
     */
    public void setProductionLotID(BusinessTransactionDocumentID value) {
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
     * Gets the value of the confirmationGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confirmationGroup
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getConfirmationGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductionLotManageConfirmationGroup }
     * 
     * 
     */
    public List<ProductionLotManageConfirmationGroup> getConfirmationGroup() {
        if (confirmationGroup == null) {
            confirmationGroup = new ArrayList<ProductionLotManageConfirmationGroup>();
        }
        return this.confirmationGroup;
    }

}
