
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerReponseCustomerCommunicationArrangementMultiChannel complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerCommunicationArrangementMultiChannel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompoundServiceInterfaceCode" type="{http://sap.com/xi/AP/Common/GDT}CompoundServiceInterfaceCode" minOccurs="0"/&gt;
 *         &lt;element name="EnabledIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CommunicationChannel" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerCommunicationChannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerCommunicationArrangementMultiChannel", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "compoundServiceInterfaceCode",
    "enabledIndicator",
    "communicationChannel"
})
public class CustomerReponseCustomerCommunicationArrangementMultiChannel {

    @XmlElement(name = "CompoundServiceInterfaceCode")
    protected CompoundServiceInterfaceCode compoundServiceInterfaceCode;
    @XmlElement(name = "EnabledIndicator")
    protected Boolean enabledIndicator;
    @XmlElement(name = "CommunicationChannel")
    protected List<CustomerReponseCustomerCommunicationChannel> communicationChannel;

    /**
     * compoundServiceInterfaceCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CompoundServiceInterfaceCode }
     *     
     */
    public CompoundServiceInterfaceCode getCompoundServiceInterfaceCode() {
        return compoundServiceInterfaceCode;
    }

    /**
     * compoundServiceInterfaceCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundServiceInterfaceCode }
     *     
     */
    public void setCompoundServiceInterfaceCode(CompoundServiceInterfaceCode value) {
        this.compoundServiceInterfaceCode = value;
    }

    /**
     * enabledIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabledIndicator() {
        return enabledIndicator;
    }

    /**
     * enabledIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabledIndicator(Boolean value) {
        this.enabledIndicator = value;
    }

    /**
     * Gets the value of the communicationChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communicationChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerCommunicationChannel }
     * 
     * 
     */
    public List<CustomerReponseCustomerCommunicationChannel> getCommunicationChannel() {
        if (communicationChannel == null) {
            communicationChannel = new ArrayList<CustomerReponseCustomerCommunicationChannel>();
        }
        return this.communicationChannel;
    }

}
