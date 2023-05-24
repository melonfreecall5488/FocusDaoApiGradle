
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WeekdaySelection" type="{http://sap.com/xi/AP/Common/GDT}WeekdaySelection" minOccurs="0"/&gt;
 *         &lt;element name="OperatingHours" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerRecurringDayProgrammeOperationHours" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme", propOrder = {
    "weekdaySelection",
    "operatingHours"
})
public class CustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme {

    @XmlElement(name = "WeekdaySelection")
    protected WeekdaySelection weekdaySelection;
    @XmlElement(name = "OperatingHours")
    protected List<CustomerReponseCustomerRecurringDayProgrammeOperationHours> operatingHours;

    /**
     * weekdaySelection 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link WeekdaySelection }
     *     
     */
    public WeekdaySelection getWeekdaySelection() {
        return weekdaySelection;
    }

    /**
     * weekdaySelection 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link WeekdaySelection }
     *     
     */
    public void setWeekdaySelection(WeekdaySelection value) {
        this.weekdaySelection = value;
    }

    /**
     * Gets the value of the operatingHours property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingHours property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingHours().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerRecurringDayProgrammeOperationHours }
     * 
     * 
     */
    public List<CustomerReponseCustomerRecurringDayProgrammeOperationHours> getOperatingHours() {
        if (operatingHours == null) {
            operatingHours = new ArrayList<CustomerReponseCustomerRecurringDayProgrammeOperationHours>();
        }
        return this.operatingHours;
    }

}
