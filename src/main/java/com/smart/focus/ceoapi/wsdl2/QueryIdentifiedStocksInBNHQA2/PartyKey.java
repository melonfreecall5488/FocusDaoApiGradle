
package com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * PartyKey complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="PartyKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartyTypeCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessObjectTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="PartyID" type="{http://sap.com/xi/AP/Common/GDT}PartyID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyKey", namespace = "http://sap.com/xi/AP/Common/Global", propOrder = {
        "partyTypeCode",
        "partyID"
})
public class PartyKey {

    @XmlElement(name = "PartyTypeCode")
    protected BusinessObjectTypeCode partyTypeCode;
    @XmlElement(name = "PartyID")
    protected PartyID partyID;

    /**
     * partyTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessObjectTypeCode }
     * 
     */
    public BusinessObjectTypeCode getPartyTypeCode() {
        return partyTypeCode;
    }

    /**
     * partyTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessObjectTypeCode }
     * 
     */
    public void setPartyTypeCode(BusinessObjectTypeCode value) {
        this.partyTypeCode = value;
    }

    /**
     * partyID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link PartyID }
     * 
     */
    public PartyID getPartyID() {
        return partyID;
    }

    /**
     * partyID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link PartyID }
     * 
     */
    public void setPartyID(PartyID value) {
        this.partyID = value;
    }

}
