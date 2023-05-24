
package com.smart.focus.ceoapi.wsdl2.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * CustomerReponseCustomerTaxNumber complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerTaxNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode"/&gt;
 *         &lt;element name="TaxIdentificationNumberTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxIdentificationNumberTypeCode"/&gt;
 *         &lt;element name="PartyTaxID" type="{http://sap.com/xi/AP/Common/GDT}PartyTaxID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerTaxNumber", propOrder = {
        "countryCode",
        "taxIdentificationNumberTypeCode",
        "partyTaxID"
})
public class CustomerReponseCustomerTaxNumber {

    @XmlElement(name = "CountryCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "TaxIdentificationNumberTypeCode", required = true)
    protected TaxIdentificationNumberTypeCode taxIdentificationNumberTypeCode;
    @XmlElement(name = "PartyTaxID")
    protected PartyTaxID partyTaxID;

    /**
     * countryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * countryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * taxIdentificationNumberTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link TaxIdentificationNumberTypeCode }
     * 
     */
    public TaxIdentificationNumberTypeCode getTaxIdentificationNumberTypeCode() {
        return taxIdentificationNumberTypeCode;
    }

    /**
     * taxIdentificationNumberTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link TaxIdentificationNumberTypeCode }
     * 
     */
    public void setTaxIdentificationNumberTypeCode(TaxIdentificationNumberTypeCode value) {
        this.taxIdentificationNumberTypeCode = value;
    }

    /**
     * partyTaxID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link PartyTaxID }
     * 
     */
    public PartyTaxID getPartyTaxID() {
        return partyTaxID;
    }

    /**
     * partyTaxID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link PartyTaxID }
     * 
     */
    public void setPartyTaxID(PartyTaxID value) {
        this.partyTaxID = value;
    }

}
