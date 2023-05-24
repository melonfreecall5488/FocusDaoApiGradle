
package com.smart.focus.ceoapi.wsdl2.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * CustomerReponseCustomerContactPersonAddressInformation complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerContactPersonAddressInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CurrentAddressSnapshotUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerContactPersonAddress" minOccurs="0"/&gt;
 *         &lt;element name="AddressUsage" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerContactPersonAddressUsage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerContactPersonAddressInformation", propOrder = {
        "uuid",
        "currentAddressSnapshotUUID",
        "address",
        "addressUsage"
})
public class CustomerReponseCustomerContactPersonAddressInformation {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "CurrentAddressSnapshotUUID")
    protected UUID currentAddressSnapshotUUID;
    @XmlElement(name = "Address")
    protected CustomerReponseCustomerContactPersonAddress address;
    @XmlElement(name = "AddressUsage")
    protected CustomerReponseCustomerContactPersonAddressUsage addressUsage;

    /**
     * uuid 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * uuid 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * currentAddressSnapshotUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getCurrentAddressSnapshotUUID() {
        return currentAddressSnapshotUUID;
    }

    /**
     * currentAddressSnapshotUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setCurrentAddressSnapshotUUID(UUID value) {
        this.currentAddressSnapshotUUID = value;
    }

    /**
     * address 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CustomerReponseCustomerContactPersonAddress }
     * 
     */
    public CustomerReponseCustomerContactPersonAddress getAddress() {
        return address;
    }

    /**
     * address 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CustomerReponseCustomerContactPersonAddress }
     * 
     */
    public void setAddress(CustomerReponseCustomerContactPersonAddress value) {
        this.address = value;
    }

    /**
     * addressUsage 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CustomerReponseCustomerContactPersonAddressUsage }
     * 
     */
    public CustomerReponseCustomerContactPersonAddressUsage getAddressUsage() {
        return addressUsage;
    }

    /**
     * addressUsage 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CustomerReponseCustomerContactPersonAddressUsage }
     * 
     */
    public void setAddressUsage(CustomerReponseCustomerContactPersonAddressUsage value) {
        this.addressUsage = value;
    }

}
