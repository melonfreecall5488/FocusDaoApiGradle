
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FormattedPostalAddress complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FormattedPostalAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FirstLineDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Description"/&gt;
 *         &lt;element name="SecondLineDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="ThirdLineDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedPostalAddress", propOrder = {
    "firstLineDescription",
    "secondLineDescription",
    "thirdLineDescription"
})
public class FormattedPostalAddress {

    @XmlElement(name = "FirstLineDescription", required = true)
    protected String firstLineDescription;
    @XmlElement(name = "SecondLineDescription")
    protected String secondLineDescription;
    @XmlElement(name = "ThirdLineDescription")
    protected String thirdLineDescription;

    /**
     * firstLineDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstLineDescription() {
        return firstLineDescription;
    }

    /**
     * firstLineDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstLineDescription(String value) {
        this.firstLineDescription = value;
    }

    /**
     * secondLineDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondLineDescription() {
        return secondLineDescription;
    }

    /**
     * secondLineDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondLineDescription(String value) {
        this.secondLineDescription = value;
    }

    /**
     * thirdLineDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdLineDescription() {
        return thirdLineDescription;
    }

    /**
     * thirdLineDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdLineDescription(String value) {
        this.thirdLineDescription = value;
    }

}
