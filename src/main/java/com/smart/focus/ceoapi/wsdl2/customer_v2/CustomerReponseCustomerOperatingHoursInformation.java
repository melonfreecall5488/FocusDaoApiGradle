
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>CustomerReponseCustomerOperatingHoursInformation complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerOperatingHoursInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoleCode" type="{http://sap.com/xi/AP/Common/GDT}BUSINESSPARTNER_OperatingHoursRoleCode"/&gt;
 *         &lt;element name="RecurringDayProgramme" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerOperatingHoursInformation", propOrder = {
    "roleCode",
    "recurringDayProgramme"
})
public class CustomerReponseCustomerOperatingHoursInformation {

    @XmlElement(name = "RoleCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String roleCode;
    @XmlElement(name = "RecurringDayProgramme")
    protected List<CustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme> recurringDayProgramme;

    /**
     * roleCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * roleCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleCode(String value) {
        this.roleCode = value;
    }

    /**
     * Gets the value of the recurringDayProgramme property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringDayProgramme property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringDayProgramme().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme }
     * 
     * 
     */
    public List<CustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme> getRecurringDayProgramme() {
        if (recurringDayProgramme == null) {
            recurringDayProgramme = new ArrayList<CustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme>();
        }
        return this.recurringDayProgramme;
    }

}
