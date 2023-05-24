
package com.smart.focus.ceoapi.wsdl2.input_list;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * SiteLogisticsTaskReferncedCustomerParty complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SiteLogisticsTaskReferncedCustomerParty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerPartyKey" type="{http://sap.com/xi/AP/Common/Global}PartyKey" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPartyName" type="{http://sap.com/xi/AP/Common/GDT}LONG_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteLogisticsTaskReferncedCustomerParty", namespace = "http://sap.com/xi/AP/LogisticsExecution/Global", propOrder = {
        "customerPartyKey",
        "customerPartyName"
})
public class SiteLogisticsTaskReferncedCustomerParty {

    @XmlElement(name = "CustomerPartyKey")
    protected PartyKey customerPartyKey;
    @XmlElement(name = "CustomerPartyName")
    protected LONGName customerPartyName;

    /**
     * customerPartyKey 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link PartyKey }
     * 
     */
    public PartyKey getCustomerPartyKey() {
        return customerPartyKey;
    }

    /**
     * customerPartyKey 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link PartyKey }
     * 
     */
    public void setCustomerPartyKey(PartyKey value) {
        this.customerPartyKey = value;
    }

    /**
     * customerPartyName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link LONGName }
     * 
     */
    public LONGName getCustomerPartyName() {
        return customerPartyName;
    }

    /**
     * customerPartyName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link LONGName }
     * 
     */
    public void setCustomerPartyName(LONGName value) {
        this.customerPartyName = value;
    }

}
