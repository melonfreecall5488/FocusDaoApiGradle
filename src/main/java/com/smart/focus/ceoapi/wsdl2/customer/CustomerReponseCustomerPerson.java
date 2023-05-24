
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
 * CustomerReponseCustomerPerson complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
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
        "occupationCode"
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
    protected String birthDate;
    @XmlElement(name = "NonVerbalCommunicationLanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String nonVerbalCommunicationLanguageCode;
    @XmlElement(name = "OccupationCode")
    protected OccupationCode occupationCode;

    /**
     * formOfAddressCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link FormOfAddressCode }
     * 
     */
    public FormOfAddressCode getFormOfAddressCode() {
        return formOfAddressCode;
    }

    /**
     * formOfAddressCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link FormOfAddressCode }
     * 
     */
    public void setFormOfAddressCode(FormOfAddressCode value) {
        this.formOfAddressCode = value;
    }

    /**
     * academicTitleCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link AcademicTitleCode }
     * 
     */
    public AcademicTitleCode getAcademicTitleCode() {
        return academicTitleCode;
    }

    /**
     * academicTitleCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link AcademicTitleCode }
     * 
     */
    public void setAcademicTitleCode(AcademicTitleCode value) {
        this.academicTitleCode = value;
    }

    /**
     * givenName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * givenName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * middleName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * middleName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * familyName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * familyName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * birthName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getBirthName() {
        return birthName;
    }

    /**
     * birthName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setBirthName(String value) {
        this.birthName = value;
    }

    /**
     * nickName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * nickName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * nameFormatCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getNameFormatCountryCode() {
        return nameFormatCountryCode;
    }

    /**
     * nameFormatCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setNameFormatCountryCode(String value) {
        this.nameFormatCountryCode = value;
    }

    /**
     * genderCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * genderCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setGenderCode(String value) {
        this.genderCode = value;
    }

    /**
     * birthDate 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * birthDate 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * nonVerbalCommunicationLanguageCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getNonVerbalCommunicationLanguageCode() {
        return nonVerbalCommunicationLanguageCode;
    }

    /**
     * nonVerbalCommunicationLanguageCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setNonVerbalCommunicationLanguageCode(String value) {
        this.nonVerbalCommunicationLanguageCode = value;
    }

    /**
     * occupationCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link OccupationCode }
     * 
     */
    public OccupationCode getOccupationCode() {
        return occupationCode;
    }

    /**
     * occupationCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link OccupationCode }
     * 
     */
    public void setOccupationCode(OccupationCode value) {
        this.occupationCode = value;
    }

}
