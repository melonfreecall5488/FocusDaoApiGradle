
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SupplierByElementsReponseSupplierContactPersonAddre complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsReponseSupplierContactPersonAddre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CurrentAddressSnapshotUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="AddressUsage" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierAddressUsage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://sap.com/xi/A1S/Global}SupplierByElementsReponseSupplierContactPersonAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsReponseSupplierContactPersonAddre", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "uuid",
    "currentAddressSnapshotUUID",
    "addressUsage",
    "address"
})
public class SupplierByElementsReponseSupplierContactPersonAddre {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "CurrentAddressSnapshotUUID")
    protected UUID currentAddressSnapshotUUID;
    @XmlElement(name = "AddressUsage")
    protected List<SupplierByElementsResponseSupplierAddressUsage> addressUsage;
    @XmlElement(name = "Address")
    protected SupplierByElementsReponseSupplierContactPersonAddress address;

    /**
     * uuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * uuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * currentAddressSnapshotUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getCurrentAddressSnapshotUUID() {
        return currentAddressSnapshotUUID;
    }

    /**
     * currentAddressSnapshotUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setCurrentAddressSnapshotUUID(UUID value) {
        this.currentAddressSnapshotUUID = value;
    }

    /**
     * Gets the value of the addressUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsResponseSupplierAddressUsage }
     * 
     * 
     */
    public List<SupplierByElementsResponseSupplierAddressUsage> getAddressUsage() {
        if (addressUsage == null) {
            addressUsage = new ArrayList<SupplierByElementsResponseSupplierAddressUsage>();
        }
        return this.addressUsage;
    }

    /**
     * address 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SupplierByElementsReponseSupplierContactPersonAddress }
     *     
     */
    public SupplierByElementsReponseSupplierContactPersonAddress getAddress() {
        return address;
    }

    /**
     * address 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierByElementsReponseSupplierContactPersonAddress }
     *     
     */
    public void setAddress(SupplierByElementsReponseSupplierContactPersonAddress value) {
        this.address = value;
    }

}
