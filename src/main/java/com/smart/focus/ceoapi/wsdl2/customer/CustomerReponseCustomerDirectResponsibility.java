
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
 * CustomerReponseCustomerDirectResponsibility complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerDirectResponsibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartyRoleCode" type="{http://sap.com/xi/AP/Common/GDT}PartyRoleCode" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeID" type="{http://sap.com/xi/AP/Common/GDT}EmployeeID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerDirectResponsibility", propOrder = {
        "partyRoleCode",
        "employeeID"
})
public class CustomerReponseCustomerDirectResponsibility {

    @XmlElement(name = "PartyRoleCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String partyRoleCode;
    @XmlElement(name = "EmployeeID")
    protected EmployeeID employeeID;

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
     * employeeID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link EmployeeID }
     * 
     */
    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    /**
     * employeeID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link EmployeeID }
     * 
     */
    public void setEmployeeID(EmployeeID value) {
        this.employeeID = value;
    }

}
