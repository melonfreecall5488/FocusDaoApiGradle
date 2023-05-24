
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
 * CustomerReponseContactPersonResponsibleEmployee complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseContactPersonResponsibleEmployee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ResponsibleEmployeeUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ResponsibleEmployeeID" type="{http://sap.com/xi/AP/Common/GDT}EmployeeID" minOccurs="0"/&gt;
 *         &lt;element name="PartyRoleCode" type="{http://sap.com/xi/AP/Common/GDT}PartyRoleCode" minOccurs="0"/&gt;
 *         &lt;element name="GroupwareSubscriptionIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseContactPersonResponsibleEmployee", propOrder = {
        "uuid",
        "responsibleEmployeeUUID",
        "responsibleEmployeeID",
        "partyRoleCode",
        "groupwareSubscriptionIndicator"
})
public class CustomerReponseContactPersonResponsibleEmployee {

    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "ResponsibleEmployeeUUID")
    protected UUID responsibleEmployeeUUID;
    @XmlElement(name = "ResponsibleEmployeeID")
    protected EmployeeID responsibleEmployeeID;
    @XmlElement(name = "PartyRoleCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String partyRoleCode;
    @XmlElement(name = "GroupwareSubscriptionIndicator")
    protected Boolean groupwareSubscriptionIndicator;

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
     * responsibleEmployeeUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getResponsibleEmployeeUUID() {
        return responsibleEmployeeUUID;
    }

    /**
     * responsibleEmployeeUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setResponsibleEmployeeUUID(UUID value) {
        this.responsibleEmployeeUUID = value;
    }

    /**
     * responsibleEmployeeID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link EmployeeID }
     * 
     */
    public EmployeeID getResponsibleEmployeeID() {
        return responsibleEmployeeID;
    }

    /**
     * responsibleEmployeeID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link EmployeeID }
     * 
     */
    public void setResponsibleEmployeeID(EmployeeID value) {
        this.responsibleEmployeeID = value;
    }

    /**
     * partyRoleCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPartyRoleCode() {
        return partyRoleCode;
    }

    /**
     * partyRoleCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPartyRoleCode(String value) {
        this.partyRoleCode = value;
    }

    /**
     * groupwareSubscriptionIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isGroupwareSubscriptionIndicator() {
        return groupwareSubscriptionIndicator;
    }

    /**
     * groupwareSubscriptionIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setGroupwareSubscriptionIndicator(Boolean value) {
        this.groupwareSubscriptionIndicator = value;
    }

}
