
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CustomerReponseCustomerPerson complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormOfAddressCode" type="{http://sap.com/xi/AP/Common/GDT}FormOfAddressCode" minOccurs="0"/&gt;
 *         &lt;element name="AcademicTitleCode" type="{http://sap.com/xi/AP/Common/GDT}AcademicTitleCode" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="FamilyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="BirthName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="NickName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="NameFormatCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="GenderCode" type="{http://sap.com/xi/AP/Common/GDT}GenderCode" minOccurs="0"/&gt;
 *         &lt;element name="BirthDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="NonVerbalCommunicationLanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="OccupationCode" type="{http://sap.com/xi/AP/Common/GDT}OccupationCode" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA5B3124449561"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA68790083D7BC"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA7201F8153A72"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA7F58AF7B7BF6"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8EAA8807F4255D7E"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV}ExtFA163E7A9C661EED8FC0DB80FE7F884B"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerPerson", propOrder = {
    "formOfAddressCode",
    "academicTitleCode",
    "givenName",
    "middleName",
    "familyName",
    "birthName",
    "nickName",
    "nameFormatCountryCode",
    "genderCode",
    "birthDate",
    "nonVerbalCommunicationLanguageCode",
    "occupationCode",
    "zpartnercustom1",
    "zpartnercustom2",
    "zpartnercustom3",
    "zpartnercustom4",
    "zpartnercustom6",
    "zpartnercustom5"
})
public class CustomerReponseCustomerPerson {

    @XmlElement(name = "FormOfAddressCode")
    protected FormOfAddressCode formOfAddressCode;
    @XmlElement(name = "AcademicTitleCode")
    protected AcademicTitleCode academicTitleCode;
    @XmlElement(name = "GivenName")
    protected String givenName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "FamilyName")
    protected String familyName;
    @XmlElement(name = "BirthName")
    protected String birthName;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "NameFormatCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nameFormatCountryCode;
    @XmlElement(name = "GenderCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String genderCode;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "NonVerbalCommunicationLanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String nonVerbalCommunicationLanguageCode;
    @XmlElement(name = "OccupationCode")
    protected OccupationCode occupationCode;
    @XmlElement(name = "Zpartnercustom1", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected String zpartnercustom1;
    @XmlElement(name = "Zpartnercustom2", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected String zpartnercustom2;
    @XmlElement(name = "Zpartnercustom3", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected BigDecimal zpartnercustom3;
    @XmlElement(name = "Zpartnercustom4", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    protected BigDecimal zpartnercustom4;
    @XmlElement(name = "Zpartnercustom6", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String zpartnercustom6;
    @XmlElement(name = "Zpartnercustom5", namespace = "http://sap.com/xi/AP/CustomerExtension/BYD/A8OCV")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String zpartnercustom5;

    /**
     * formOfAddressCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FormOfAddressCode }
     *     
     */
    public FormOfAddressCode getFormOfAddressCode() {
        return formOfAddressCode;
    }

    /**
     * formOfAddressCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfAddressCode }
     *     
     */
    public void setFormOfAddressCode(FormOfAddressCode value) {
        this.formOfAddressCode = value;
    }

    /**
     * academicTitleCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AcademicTitleCode }
     *     
     */
    public AcademicTitleCode getAcademicTitleCode() {
        return academicTitleCode;
    }

    /**
     * academicTitleCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicTitleCode }
     *     
     */
    public void setAcademicTitleCode(AcademicTitleCode value) {
        this.academicTitleCode = value;
    }

    /**
     * givenName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * givenName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * middleName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * middleName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * familyName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * familyName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * birthName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthName() {
        return birthName;
    }

    /**
     * birthName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthName(String value) {
        this.birthName = value;
    }

    /**
     * nickName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * nickName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * nameFormatCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameFormatCountryCode() {
        return nameFormatCountryCode;
    }

    /**
     * nameFormatCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameFormatCountryCode(String value) {
        this.nameFormatCountryCode = value;
    }

    /**
     * genderCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * genderCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCode(String value) {
        this.genderCode = value;
    }

    /**
     * birthDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * birthDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * nonVerbalCommunicationLanguageCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonVerbalCommunicationLanguageCode() {
        return nonVerbalCommunicationLanguageCode;
    }

    /**
     * nonVerbalCommunicationLanguageCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonVerbalCommunicationLanguageCode(String value) {
        this.nonVerbalCommunicationLanguageCode = value;
    }

    /**
     * occupationCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OccupationCode }
     *     
     */
    public OccupationCode getOccupationCode() {
        return occupationCode;
    }

    /**
     * occupationCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupationCode }
     *     
     */
    public void setOccupationCode(OccupationCode value) {
        this.occupationCode = value;
    }

    /**
     * zpartnercustom1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZpartnercustom1() {
        return zpartnercustom1;
    }

    /**
     * zpartnercustom1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZpartnercustom1(String value) {
        this.zpartnercustom1 = value;
    }

    /**
     * zpartnercustom2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZpartnercustom2() {
        return zpartnercustom2;
    }

    /**
     * zpartnercustom2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZpartnercustom2(String value) {
        this.zpartnercustom2 = value;
    }

    /**
     * zpartnercustom3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZpartnercustom3() {
        return zpartnercustom3;
    }

    /**
     * zpartnercustom3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZpartnercustom3(BigDecimal value) {
        this.zpartnercustom3 = value;
    }

    /**
     * zpartnercustom4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZpartnercustom4() {
        return zpartnercustom4;
    }

    /**
     * zpartnercustom4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZpartnercustom4(BigDecimal value) {
        this.zpartnercustom4 = value;
    }

    /**
     * zpartnercustom6 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZpartnercustom6() {
        return zpartnercustom6;
    }

    /**
     * zpartnercustom6 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZpartnercustom6(String value) {
        this.zpartnercustom6 = value;
    }

    /**
     * zpartnercustom5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZpartnercustom5() {
        return zpartnercustom5;
    }

    /**
     * zpartnercustom5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZpartnercustom5(String value) {
        this.zpartnercustom5 = value;
    }

}
