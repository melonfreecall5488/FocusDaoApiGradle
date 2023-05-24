
package com.smart.focus.ceoapi.wsdl2.customer;

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
 * <p>
 * CustomerReponseCustomerContactPerson complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerContactPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessPartnerContactUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerContactInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="NationalProviderID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="DefaultContactPersonIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FormOfAddressCode" type="{http://sap.com/xi/AP/Common/GDT}FormOfAddressCode" minOccurs="0"/&gt;
 *         &lt;element name="AcademicTitleCode" type="{http://sap.com/xi/AP/Common/GDT}AcademicTitleCode" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="FamilyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="BirthName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="NickName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="GenderCode" type="{http://sap.com/xi/AP/Common/GDT}GenderCode" minOccurs="0"/&gt;
 *         &lt;element name="BirthDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="NonVerbalCommunicationLanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="OccupationCode" type="{http://sap.com/xi/AP/Common/GDT}OccupationCode" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerFunctionTypeCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerFunctionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerFunctionalAreaCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerFunctionalAreaCode" minOccurs="0"/&gt;
 *         &lt;element name="VIPReasonCode" type="{http://sap.com/xi/AP/Common/GDT}VIPReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="CurrentWorkplaceAddressSnapshotUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceBusinessAddressUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="WorkplacePreferredCommunicationMediumTypeCode" type="{http://sap.com/xi/AP/Common/GDT}CommunicationMediumTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceEmailURI" type="{http://sap.com/xi/AP/Common/GDT}EmailURI" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceFacsimileFormattedNumberDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceTelephone" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerWorkplaceTelephone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceWebURI" type="{http://sap.com/xi/AP/Common/GDT}WebURI" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceFunctionalTitleName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceDepartmentName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceBuildingID" type="{http://sap.com/xi/AP/Common/GDT}BuildingID" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceFloorID" type="{http://sap.com/xi/AP/Common/GDT}FloorID" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceRoomID" type="{http://sap.com/xi/AP/Common/GDT}RoomID" minOccurs="0"/&gt;
 *         &lt;element name="WorkplaceFormattedAddress" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerFormattedAddress" minOccurs="0"/&gt;
 *         &lt;element name="AddressInformation" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerContactPersonAddressInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}PartyLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="MaritalStatusCode" type="{http://sap.com/xi/AP/Common/GDT}MaritalStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="ResponsibleEmployee" type="{http://sap.com/xi/A1S/Global}CustomerReponseContactPersonResponsibleEmployee" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPurposeCompletedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerContactPerson", propOrder = {
        "businessPartnerContactUUID",
        "businessPartnerContactInternalID",
        "nationalProviderID",
        "defaultContactPersonIndicator",
        "formOfAddressCode",
        "academicTitleCode",
        "givenName",
        "middleName",
        "familyName",
        "birthName",
        "nickName",
        "genderCode",
        "birthDate",
        "nonVerbalCommunicationLanguageCode",
        "occupationCode",
        "businessPartnerFunctionTypeCode",
        "businessPartnerFunctionalAreaCode",
        "vipReasonCode",
        "currentWorkplaceAddressSnapshotUUID",
        "workplaceBusinessAddressUUID",
        "workplacePreferredCommunicationMediumTypeCode",
        "workplaceEmailURI",
        "workplaceFacsimileFormattedNumberDescription",
        "workplaceTelephone",
        "workplaceWebURI",
        "workplaceFunctionalTitleName",
        "workplaceDepartmentName",
        "workplaceBuildingID",
        "workplaceFloorID",
        "workplaceRoomID",
        "workplaceFormattedAddress",
        "addressInformation",
        "lifeCycleStatusCode",
        "maritalStatusCode",
        "responsibleEmployee",
        "businessPurposeCompletedIndicator"
})
public class CustomerReponseCustomerContactPerson {

    @XmlElement(name = "BusinessPartnerContactUUID")
    protected UUID businessPartnerContactUUID;
    @XmlElement(name = "BusinessPartnerContactInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessPartnerContactInternalID;
    @XmlElement(name = "NationalProviderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nationalProviderID;
    @XmlElement(name = "DefaultContactPersonIndicator")
    protected Boolean defaultContactPersonIndicator;
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
    @XmlElement(name = "BusinessPartnerFunctionTypeCode")
    protected BusinessPartnerFunctionTypeCode businessPartnerFunctionTypeCode;
    @XmlElement(name = "BusinessPartnerFunctionalAreaCode")
    protected BusinessPartnerFunctionalAreaCode businessPartnerFunctionalAreaCode;
    @XmlElement(name = "VIPReasonCode")
    protected VIPReasonCode vipReasonCode;
    @XmlElement(name = "CurrentWorkplaceAddressSnapshotUUID")
    protected UUID currentWorkplaceAddressSnapshotUUID;
    @XmlElement(name = "WorkplaceBusinessAddressUUID")
    protected UUID workplaceBusinessAddressUUID;
    @XmlElement(name = "WorkplacePreferredCommunicationMediumTypeCode")
    protected CommunicationMediumTypeCode workplacePreferredCommunicationMediumTypeCode;
    @XmlElement(name = "WorkplaceEmailURI")
    protected EmailURI workplaceEmailURI;
    @XmlElement(name = "WorkplaceFacsimileFormattedNumberDescription")
    protected String workplaceFacsimileFormattedNumberDescription;
    @XmlElement(name = "WorkplaceTelephone")
    protected List<CustomerReponseCustomerWorkplaceTelephone> workplaceTelephone;
    @XmlElement(name = "WorkplaceWebURI")
    @XmlSchemaType(name = "anyURI")
    protected String workplaceWebURI;
    @XmlElement(name = "WorkplaceFunctionalTitleName")
    protected String workplaceFunctionalTitleName;
    @XmlElement(name = "WorkplaceDepartmentName")
    protected String workplaceDepartmentName;
    @XmlElement(name = "WorkplaceBuildingID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String workplaceBuildingID;
    @XmlElement(name = "WorkplaceFloorID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String workplaceFloorID;
    @XmlElement(name = "WorkplaceRoomID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String workplaceRoomID;
    @XmlElement(name = "WorkplaceFormattedAddress")
    protected CustomerReponseCustomerFormattedAddress workplaceFormattedAddress;
    @XmlElement(name = "AddressInformation")
    protected List<CustomerReponseCustomerContactPersonAddressInformation> addressInformation;
    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "MaritalStatusCode")
    protected MaritalStatusCode maritalStatusCode;
    @XmlElement(name = "ResponsibleEmployee")
    protected List<CustomerReponseContactPersonResponsibleEmployee> responsibleEmployee;
    @XmlElement(name = "BusinessPurposeCompletedIndicator")
    protected Boolean businessPurposeCompletedIndicator;

    /**
     * businessPartnerContactUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getBusinessPartnerContactUUID() {
        return businessPartnerContactUUID;
    }

    /**
     * businessPartnerContactUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setBusinessPartnerContactUUID(UUID value) {
        this.businessPartnerContactUUID = value;
    }

    /**
     * businessPartnerContactInternalID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getBusinessPartnerContactInternalID() {
        return businessPartnerContactInternalID;
    }

    /**
     * businessPartnerContactInternalID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setBusinessPartnerContactInternalID(String value) {
        this.businessPartnerContactInternalID = value;
    }

    /**
     * nationalProviderID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getNationalProviderID() {
        return nationalProviderID;
    }

    /**
     * nationalProviderID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setNationalProviderID(String value) {
        this.nationalProviderID = value;
    }

    /**
     * defaultContactPersonIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isDefaultContactPersonIndicator() {
        return defaultContactPersonIndicator;
    }

    /**
     * defaultContactPersonIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setDefaultContactPersonIndicator(Boolean value) {
        this.defaultContactPersonIndicator = value;
    }

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

    /**
     * businessPartnerFunctionTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessPartnerFunctionTypeCode }
     * 
     */
    public BusinessPartnerFunctionTypeCode getBusinessPartnerFunctionTypeCode() {
        return businessPartnerFunctionTypeCode;
    }

    /**
     * businessPartnerFunctionTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessPartnerFunctionTypeCode }
     * 
     */
    public void setBusinessPartnerFunctionTypeCode(BusinessPartnerFunctionTypeCode value) {
        this.businessPartnerFunctionTypeCode = value;
    }

    /**
     * businessPartnerFunctionalAreaCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link BusinessPartnerFunctionalAreaCode }
     * 
     */
    public BusinessPartnerFunctionalAreaCode getBusinessPartnerFunctionalAreaCode() {
        return businessPartnerFunctionalAreaCode;
    }

    /**
     * businessPartnerFunctionalAreaCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link BusinessPartnerFunctionalAreaCode }
     * 
     */
    public void setBusinessPartnerFunctionalAreaCode(BusinessPartnerFunctionalAreaCode value) {
        this.businessPartnerFunctionalAreaCode = value;
    }

    /**
     * vipReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link VIPReasonCode }
     * 
     */
    public VIPReasonCode getVIPReasonCode() {
        return vipReasonCode;
    }

    /**
     * vipReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link VIPReasonCode }
     * 
     */
    public void setVIPReasonCode(VIPReasonCode value) {
        this.vipReasonCode = value;
    }

    /**
     * currentWorkplaceAddressSnapshotUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getCurrentWorkplaceAddressSnapshotUUID() {
        return currentWorkplaceAddressSnapshotUUID;
    }

    /**
     * currentWorkplaceAddressSnapshotUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setCurrentWorkplaceAddressSnapshotUUID(UUID value) {
        this.currentWorkplaceAddressSnapshotUUID = value;
    }

    /**
     * workplaceBusinessAddressUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link UUID }
     * 
     */
    public UUID getWorkplaceBusinessAddressUUID() {
        return workplaceBusinessAddressUUID;
    }

    /**
     * workplaceBusinessAddressUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link UUID }
     * 
     */
    public void setWorkplaceBusinessAddressUUID(UUID value) {
        this.workplaceBusinessAddressUUID = value;
    }

    /**
     * workplacePreferredCommunicationMediumTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CommunicationMediumTypeCode }
     * 
     */
    public CommunicationMediumTypeCode getWorkplacePreferredCommunicationMediumTypeCode() {
        return workplacePreferredCommunicationMediumTypeCode;
    }

    /**
     * workplacePreferredCommunicationMediumTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CommunicationMediumTypeCode }
     * 
     */
    public void setWorkplacePreferredCommunicationMediumTypeCode(CommunicationMediumTypeCode value) {
        this.workplacePreferredCommunicationMediumTypeCode = value;
    }

    /**
     * workplaceEmailURI 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link EmailURI }
     * 
     */
    public EmailURI getWorkplaceEmailURI() {
        return workplaceEmailURI;
    }

    /**
     * workplaceEmailURI 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link EmailURI }
     * 
     */
    public void setWorkplaceEmailURI(EmailURI value) {
        this.workplaceEmailURI = value;
    }

    /**
     * workplaceFacsimileFormattedNumberDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getWorkplaceFacsimileFormattedNumberDescription() {
        return workplaceFacsimileFormattedNumberDescription;
    }

    /**
     * workplaceFacsimileFormattedNumberDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setWorkplaceFacsimileFormattedNumberDescription(String value) {
        this.workplaceFacsimileFormattedNumberDescription = value;
    }

    /**
     * Gets the value of the workplaceTelephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workplaceTelephone
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getWorkplaceTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerWorkplaceTelephone }
     * 
     * 
     */
    public List<CustomerReponseCustomerWorkplaceTelephone> getWorkplaceTelephone() {
        if (workplaceTelephone == null) {
            workplaceTelephone = new ArrayList<CustomerReponseCustomerWorkplaceTelephone>();
        }
        return this.workplaceTelephone;
    }

    /**
     * workplaceWebURI 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getWorkplaceWebURI() {
        return workplaceWebURI;
    }

    /**
     * workplaceWebURI 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setWorkplaceWebURI(String value) {
        this.workplaceWebURI = value;
    }

    /**
     * workplaceFunctionalTitleName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getWorkplaceFunctionalTitleName() {
        return workplaceFunctionalTitleName;
    }

    /**
     * workplaceFunctionalTitleName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setWorkplaceFunctionalTitleName(String value) {
        this.workplaceFunctionalTitleName = value;
    }

    /**
     * workplaceDepartmentName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getWorkplaceDepartmentName() {
        return workplaceDepartmentName;
    }

    /**
     * workplaceDepartmentName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setWorkplaceDepartmentName(String value) {
        this.workplaceDepartmentName = value;
    }

    /**
     * workplaceBuildingID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getWorkplaceBuildingID() {
        return workplaceBuildingID;
    }

    /**
     * workplaceBuildingID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setWorkplaceBuildingID(String value) {
        this.workplaceBuildingID = value;
    }

    /**
     * workplaceFloorID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getWorkplaceFloorID() {
        return workplaceFloorID;
    }

    /**
     * workplaceFloorID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setWorkplaceFloorID(String value) {
        this.workplaceFloorID = value;
    }

    /**
     * workplaceRoomID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getWorkplaceRoomID() {
        return workplaceRoomID;
    }

    /**
     * workplaceRoomID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setWorkplaceRoomID(String value) {
        this.workplaceRoomID = value;
    }

    /**
     * workplaceFormattedAddress 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CustomerReponseCustomerFormattedAddress }
     * 
     */
    public CustomerReponseCustomerFormattedAddress getWorkplaceFormattedAddress() {
        return workplaceFormattedAddress;
    }

    /**
     * workplaceFormattedAddress 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CustomerReponseCustomerFormattedAddress }
     * 
     */
    public void setWorkplaceFormattedAddress(CustomerReponseCustomerFormattedAddress value) {
        this.workplaceFormattedAddress = value;
    }

    /**
     * Gets the value of the addressInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressInformation
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getAddressInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerContactPersonAddressInformation }
     * 
     * 
     */
    public List<CustomerReponseCustomerContactPersonAddressInformation> getAddressInformation() {
        if (addressInformation == null) {
            addressInformation = new ArrayList<CustomerReponseCustomerContactPersonAddressInformation>();
        }
        return this.addressInformation;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setLifeCycleStatusCode(String value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * maritalStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link MaritalStatusCode }
     * 
     */
    public MaritalStatusCode getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     * maritalStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link MaritalStatusCode }
     * 
     */
    public void setMaritalStatusCode(MaritalStatusCode value) {
        this.maritalStatusCode = value;
    }

    /**
     * Gets the value of the responsibleEmployee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * responsibleEmployee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getResponsibleEmployee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseContactPersonResponsibleEmployee }
     * 
     * 
     */
    public List<CustomerReponseContactPersonResponsibleEmployee> getResponsibleEmployee() {
        if (responsibleEmployee == null) {
            responsibleEmployee = new ArrayList<CustomerReponseContactPersonResponsibleEmployee>();
        }
        return this.responsibleEmployee;
    }

    /**
     * businessPurposeCompletedIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isBusinessPurposeCompletedIndicator() {
        return businessPurposeCompletedIndicator;
    }

    /**
     * businessPurposeCompletedIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setBusinessPurposeCompletedIndicator(Boolean value) {
        this.businessPurposeCompletedIndicator = value;
    }

}
