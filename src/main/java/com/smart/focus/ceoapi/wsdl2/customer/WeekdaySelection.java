
package com.smart.focus.ceoapi.wsdl2.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * WeekdaySelection complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="WeekdaySelection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MondayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="TuesdayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="WednesdayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="ThursdayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FridayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="SundayIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeekdaySelection", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
        "mondayIndicator",
        "tuesdayIndicator",
        "wednesdayIndicator",
        "thursdayIndicator",
        "fridayIndicator",
        "saturdayIndicator",
        "sundayIndicator"
})
public class WeekdaySelection {

    @XmlElement(name = "MondayIndicator")
    protected Boolean mondayIndicator;
    @XmlElement(name = "TuesdayIndicator")
    protected Boolean tuesdayIndicator;
    @XmlElement(name = "WednesdayIndicator")
    protected Boolean wednesdayIndicator;
    @XmlElement(name = "ThursdayIndicator")
    protected Boolean thursdayIndicator;
    @XmlElement(name = "FridayIndicator")
    protected Boolean fridayIndicator;
    @XmlElement(name = "SaturdayIndicator")
    protected Boolean saturdayIndicator;
    @XmlElement(name = "SundayIndicator")
    protected Boolean sundayIndicator;

    /**
     * mondayIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isMondayIndicator() {
        return mondayIndicator;
    }

    /**
     * mondayIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setMondayIndicator(Boolean value) {
        this.mondayIndicator = value;
    }

    /**
     * tuesdayIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isTuesdayIndicator() {
        return tuesdayIndicator;
    }

    /**
     * tuesdayIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setTuesdayIndicator(Boolean value) {
        this.tuesdayIndicator = value;
    }

    /**
     * wednesdayIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isWednesdayIndicator() {
        return wednesdayIndicator;
    }

    /**
     * wednesdayIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setWednesdayIndicator(Boolean value) {
        this.wednesdayIndicator = value;
    }

    /**
     * thursdayIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isThursdayIndicator() {
        return thursdayIndicator;
    }

    /**
     * thursdayIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setThursdayIndicator(Boolean value) {
        this.thursdayIndicator = value;
    }

    /**
     * fridayIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isFridayIndicator() {
        return fridayIndicator;
    }

    /**
     * fridayIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setFridayIndicator(Boolean value) {
        this.fridayIndicator = value;
    }

    /**
     * saturdayIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isSaturdayIndicator() {
        return saturdayIndicator;
    }

    /**
     * saturdayIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setSaturdayIndicator(Boolean value) {
        this.saturdayIndicator = value;
    }

    /**
     * sundayIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isSundayIndicator() {
        return sundayIndicator;
    }

    /**
     * sundayIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setSundayIndicator(Boolean value) {
        this.sundayIndicator = value;
    }

}
