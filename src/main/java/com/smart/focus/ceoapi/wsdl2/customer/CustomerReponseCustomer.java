
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
 * CustomerReponseCustomer complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeStateID" type="{http://sap.com/xi/AP/Common/GDT}ChangeStateID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="InternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="SystemAdministrativeData" type="{http://sap.com/xi/AP/Common/GDT}SystemAdministrativeData" minOccurs="0"/&gt;
 *         &lt;element name="CategoryCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="ProspectIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CustomerIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}PartyLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="Person" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerPerson" minOccurs="0"/&gt;
 *         &lt;element name="Organisation" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerOrganisation" minOccurs="0"/&gt;
 *         &lt;element name="VerbalCommunicationLanguageCode" type="{http://sap.com/xi/BASIS/Global}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="ContactAllowedCode" type="{http://sap.com/xi/AP/Common/GDT}ContactAllowedCode" minOccurs="0"/&gt;
 *         &lt;element name="LegalCompetenceIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="DunAndBradstreetNumberID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="GlobalLocationNumberID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="NationalProviderID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="ABCClassificationCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerABCClassificationCode" minOccurs="0"/&gt;
 *         &lt;element name="NielsenRegionCode" type="{http://sap.com/xi/AP/Common/GDT}NielsenRegionCode" minOccurs="0"/&gt;
 *         &lt;element name="IndustrialSectorCode" type="{http://sap.com/xi/AP/Common/GDT}IndustrialSectorCode" minOccurs="0"/&gt;
 *         &lt;element name="AddressInformation" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerAddressInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Relationship" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContactPerson" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerContactPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CommunicationArrangement" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerCommunicationArrangement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CommunicationArrangementMultiChannel" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerCommunicationArrangementMultiChannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DirectResponsibility" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerDirectResponsibility" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SalesArrangement" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerSalesArrangement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InvoicingBlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}InvoicingBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="CustomerTransactionDocumentFulfilmentBlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerTransactionDocumentFulfilmentBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="CustomerBlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}CustomerBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="BankDetails" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerBankDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardDetails" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerPaymentCardDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentData" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerPaymentData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxNumber" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerTaxNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GeneralProductTaxExemption" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerGeneralProductTaxExemption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptionCertificate" type="{http://sap.com/xi/A1S/Global}CustomerResponseCustomerTaxExemptionCertificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OperatingHoursInformation" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerOperatingHoursInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}AccessAttachmentFolder" minOccurs="0"/&gt;
 *         &lt;element name="EnterpriseIdentificationNumber" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/Globalization}CustomerReponseCustomerCommonExtensionElements"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomer", propOrder = {
        "changeStateID",
        "uuid",
        "internalID",
        "systemAdministrativeData",
        "categoryCode",
        "prospectIndicator",
        "customerIndicator",
        "lifeCycleStatusCode",
        "person",
        "organisation",
        "verbalCommunicationLanguageCode",
        "contactAllowedCode",
        "legalCompetenceIndicator",
        "dunAndBradstreetNumberID",
        "globalLocationNumberID",
        "nationalProviderID",
        "abcClassificationCode",
        "nielsenRegionCode",
        "industrialSectorCode",
        "addressInformation",
        "relationship",
        "contactPerson",
        "communicationArrangement",
        "communicationArrangementMultiChannel",
        "directResponsibility",
        "salesArrangement",
        "invoicingBlockingReasonCode",
        "customerTransactionDocumentFulfilmentBlockingReasonCode",
        "customerBlockingReasonCode",
        "bankDetails",
        "paymentCardDetails",
        "paymentData",
        "taxNumber",
        "generalProductTaxExemption",
        "taxExemptionCertificate",
        "operatingHoursInformation",
        "text",
        "attachmentFolder",
        "enterpriseIdentificationNumber",
        "taxPayerCategoryCode",
        "enterpriseIdentificationSupplementCode",
        "invoiceSummaryRoleCode",
        "closingDatePatternID",
        "mxUseCfdiCode",
        "customerTCSIndicator"
})
public class CustomerReponseCustomer {

    @XmlElement(name = "ChangeStateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String changeStateID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "InternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internalID;
    @XmlElement(name = "SystemAdministrativeData")
    protected SystemAdministrativeData systemAdministrativeData;
    @XmlElement(name = "CategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String categoryCode;
    @XmlElement(name = "ProspectIndicator")
    protected Boolean prospectIndicator;
    @XmlElement(name = "CustomerIndicator")
    protected Boolean customerIndicator;
    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "Person")
    protected CustomerReponseCustomerPerson person;
    @XmlElement(name = "Organisation")
    protected CustomerReponseCustomerOrganisation organisation;
    @XmlElement(name = "VerbalCommunicationLanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String verbalCommunicationLanguageCode;
    @XmlElement(name = "ContactAllowedCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactAllowedCode;
    @XmlElement(name = "LegalCompetenceIndicator")
    protected Boolean legalCompetenceIndicator;
    @XmlElement(name = "DunAndBradstreetNumberID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dunAndBradstreetNumberID;
    @XmlElement(name = "GlobalLocationNumberID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String globalLocationNumberID;
    @XmlElement(name = "NationalProviderID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nationalProviderID;
    @XmlElement(name = "ABCClassificationCode")
    protected CustomerABCClassificationCode abcClassificationCode;
    @XmlElement(name = "NielsenRegionCode")
    protected NielsenRegionCode nielsenRegionCode;
    @XmlElement(name = "IndustrialSectorCode")
    protected IndustrialSectorCode industrialSectorCode;
    @XmlElement(name = "AddressInformation")
    protected List<CustomerReponseCustomerAddressInformation> addressInformation;
    @XmlElement(name = "Relationship")
    protected List<CustomerReponseCustomerRelationship> relationship;
    @XmlElement(name = "ContactPerson")
    protected List<CustomerReponseCustomerContactPerson> contactPerson;
    @XmlElement(name = "CommunicationArrangement")
    protected List<CustomerReponseCustomerCommunicationArrangement> communicationArrangement;
    @XmlElement(name = "CommunicationArrangementMultiChannel")
    protected List<CustomerReponseCustomerCommunicationArrangementMultiChannel> communicationArrangementMultiChannel;
    @XmlElement(name = "DirectResponsibility")
    protected List<CustomerReponseCustomerDirectResponsibility> directResponsibility;
    @XmlElement(name = "SalesArrangement")
    protected List<CustomerReponseCustomerSalesArrangement> salesArrangement;
    @XmlElement(name = "InvoicingBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String invoicingBlockingReasonCode;
    @XmlElement(name = "CustomerTransactionDocumentFulfilmentBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customerTransactionDocumentFulfilmentBlockingReasonCode;
    @XmlElement(name = "CustomerBlockingReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customerBlockingReasonCode;
    @XmlElement(name = "BankDetails")
    protected List<CustomerReponseCustomerBankDetails> bankDetails;
    @XmlElement(name = "PaymentCardDetails")
    protected List<CustomerReponseCustomerPaymentCardDetails> paymentCardDetails;
    @XmlElement(name = "PaymentData")
    protected List<CustomerReponseCustomerPaymentData> paymentData;
    @XmlElement(name = "TaxNumber")
    protected List<CustomerReponseCustomerTaxNumber> taxNumber;
    @XmlElement(name = "GeneralProductTaxExemption")
    protected List<CustomerReponseCustomerGeneralProductTaxExemption> generalProductTaxExemption;
    @XmlElement(name = "TaxExemptionCertificate")
    protected List<CustomerResponseCustomerTaxExemptionCertificate> taxExemptionCertificate;
    @XmlElement(name = "OperatingHoursInformation")
    protected List<CustomerReponseCustomerOperatingHoursInformation> operatingHoursInformation;
    @XmlElement(name = "Text")
    protected List<CustomerReponseCustomerText> text;
    @XmlElement(name = "AttachmentFolder")
    protected AccessAttachmentFolder attachmentFolder;
    @XmlElement(name = "EnterpriseIdentificationNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String enterpriseIdentificationNumber;
    @XmlElement(name = "TaxPayerCategoryCode", namespace = "http://sap.com/xi/AP/Globalization")
    protected TaxPayerCategoryCode taxPayerCategoryCode;
    @XmlElement(name = "EnterpriseIdentificationSupplementCode", namespace = "http://sap.com/xi/AP/Globalization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String enterpriseIdentificationSupplementCode;
    @XmlElement(name = "InvoiceSummaryRoleCode", namespace = "http://sap.com/xi/AP/Globalization")
    protected JPLogisticsInvoiceSummaryBusinessPartnerTypeCode invoiceSummaryRoleCode;
    @XmlElement(name = "ClosingDatePatternID", namespace = "http://sap.com/xi/AP/Globalization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String closingDatePatternID;
    @XmlElement(name = "MxUseCfdiCode", namespace = "http://sap.com/xi/AP/Globalization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String mxUseCfdiCode;
    @XmlElement(name = "CustomerTCSIndicator", namespace = "http://sap.com/xi/AP/Globalization")
    protected Boolean customerTCSIndicator;

    /**
     * changeStateID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getChangeStateID() {
        return changeStateID;
    }

    /**
     * changeStateID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setChangeStateID(String value) {
        this.changeStateID = value;
    }

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
     * internalID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getInternalID() {
        return internalID;
    }

    /**
     * internalID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setInternalID(String value) {
        this.internalID = value;
    }

    /**
     * systemAdministrativeData 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link SystemAdministrativeData }
     * 
     */
    public SystemAdministrativeData getSystemAdministrativeData() {
        return systemAdministrativeData;
    }

    /**
     * systemAdministrativeData 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link SystemAdministrativeData }
     * 
     */
    public void setSystemAdministrativeData(SystemAdministrativeData value) {
        this.systemAdministrativeData = value;
    }

    /**
     * categoryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * categoryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCategoryCode(String value) {
        this.categoryCode = value;
    }

    /**
     * prospectIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isProspectIndicator() {
        return prospectIndicator;
    }

    /**
     * prospectIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setProspectIndicator(Boolean value) {
        this.prospectIndicator = value;
    }

    /**
     * customerIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isCustomerIndicator() {
        return customerIndicator;
    }

    /**
     * customerIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setCustomerIndicator(Boolean value) {
        this.customerIndicator = value;
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
     * person 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CustomerReponseCustomerPerson }
     * 
     */
    public CustomerReponseCustomerPerson getPerson() {
        return person;
    }

    /**
     * person 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CustomerReponseCustomerPerson }
     * 
     */
    public void setPerson(CustomerReponseCustomerPerson value) {
        this.person = value;
    }

    /**
     * organisation 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CustomerReponseCustomerOrganisation }
     * 
     */
    public CustomerReponseCustomerOrganisation getOrganisation() {
        return organisation;
    }

    /**
     * organisation 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CustomerReponseCustomerOrganisation }
     * 
     */
    public void setOrganisation(CustomerReponseCustomerOrganisation value) {
        this.organisation = value;
    }

    /**
     * verbalCommunicationLanguageCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getVerbalCommunicationLanguageCode() {
        return verbalCommunicationLanguageCode;
    }

    /**
     * verbalCommunicationLanguageCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setVerbalCommunicationLanguageCode(String value) {
        this.verbalCommunicationLanguageCode = value;
    }

    /**
     * contactAllowedCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getContactAllowedCode() {
        return contactAllowedCode;
    }

    /**
     * contactAllowedCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setContactAllowedCode(String value) {
        this.contactAllowedCode = value;
    }

    /**
     * legalCompetenceIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isLegalCompetenceIndicator() {
        return legalCompetenceIndicator;
    }

    /**
     * legalCompetenceIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setLegalCompetenceIndicator(Boolean value) {
        this.legalCompetenceIndicator = value;
    }

    /**
     * dunAndBradstreetNumberID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDunAndBradstreetNumberID() {
        return dunAndBradstreetNumberID;
    }

    /**
     * dunAndBradstreetNumberID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDunAndBradstreetNumberID(String value) {
        this.dunAndBradstreetNumberID = value;
    }

    /**
     * globalLocationNumberID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getGlobalLocationNumberID() {
        return globalLocationNumberID;
    }

    /**
     * globalLocationNumberID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setGlobalLocationNumberID(String value) {
        this.globalLocationNumberID = value;
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
     * abcClassificationCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CustomerABCClassificationCode }
     * 
     */
    public CustomerABCClassificationCode getABCClassificationCode() {
        return abcClassificationCode;
    }

    /**
     * abcClassificationCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CustomerABCClassificationCode }
     * 
     */
    public void setABCClassificationCode(CustomerABCClassificationCode value) {
        this.abcClassificationCode = value;
    }

    /**
     * nielsenRegionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link NielsenRegionCode }
     * 
     */
    public NielsenRegionCode getNielsenRegionCode() {
        return nielsenRegionCode;
    }

    /**
     * nielsenRegionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link NielsenRegionCode }
     * 
     */
    public void setNielsenRegionCode(NielsenRegionCode value) {
        this.nielsenRegionCode = value;
    }

    /**
     * industrialSectorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link IndustrialSectorCode }
     * 
     */
    public IndustrialSectorCode getIndustrialSectorCode() {
        return industrialSectorCode;
    }

    /**
     * industrialSectorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link IndustrialSectorCode }
     * 
     */
    public void setIndustrialSectorCode(IndustrialSectorCode value) {
        this.industrialSectorCode = value;
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
     * {@link CustomerReponseCustomerAddressInformation }
     * 
     * 
     */
    public List<CustomerReponseCustomerAddressInformation> getAddressInformation() {
        if (addressInformation == null) {
            addressInformation = new ArrayList<CustomerReponseCustomerAddressInformation>();
        }
        return this.addressInformation;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerRelationship }
     * 
     * 
     */
    public List<CustomerReponseCustomerRelationship> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<CustomerReponseCustomerRelationship>();
        }
        return this.relationship;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPerson
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getContactPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerContactPerson }
     * 
     * 
     */
    public List<CustomerReponseCustomerContactPerson> getContactPerson() {
        if (contactPerson == null) {
            contactPerson = new ArrayList<CustomerReponseCustomerContactPerson>();
        }
        return this.contactPerson;
    }

    /**
     * Gets the value of the communicationArrangement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * communicationArrangement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCommunicationArrangement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerCommunicationArrangement }
     * 
     * 
     */
    public List<CustomerReponseCustomerCommunicationArrangement> getCommunicationArrangement() {
        if (communicationArrangement == null) {
            communicationArrangement = new ArrayList<CustomerReponseCustomerCommunicationArrangement>();
        }
        return this.communicationArrangement;
    }

    /**
     * Gets the value of the communicationArrangementMultiChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * communicationArrangementMultiChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getCommunicationArrangementMultiChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerCommunicationArrangementMultiChannel }
     * 
     * 
     */
    public List<CustomerReponseCustomerCommunicationArrangementMultiChannel> getCommunicationArrangementMultiChannel() {
        if (communicationArrangementMultiChannel == null) {
            communicationArrangementMultiChannel = new ArrayList<CustomerReponseCustomerCommunicationArrangementMultiChannel>();
        }
        return this.communicationArrangementMultiChannel;
    }

    /**
     * Gets the value of the directResponsibility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * directResponsibility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getDirectResponsibility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerDirectResponsibility }
     * 
     * 
     */
    public List<CustomerReponseCustomerDirectResponsibility> getDirectResponsibility() {
        if (directResponsibility == null) {
            directResponsibility = new ArrayList<CustomerReponseCustomerDirectResponsibility>();
        }
        return this.directResponsibility;
    }

    /**
     * Gets the value of the salesArrangement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesArrangement
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSalesArrangement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerSalesArrangement }
     * 
     * 
     */
    public List<CustomerReponseCustomerSalesArrangement> getSalesArrangement() {
        if (salesArrangement == null) {
            salesArrangement = new ArrayList<CustomerReponseCustomerSalesArrangement>();
        }
        return this.salesArrangement;
    }

    /**
     * invoicingBlockingReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getInvoicingBlockingReasonCode() {
        return invoicingBlockingReasonCode;
    }

    /**
     * invoicingBlockingReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setInvoicingBlockingReasonCode(String value) {
        this.invoicingBlockingReasonCode = value;
    }

    /**
     * customerTransactionDocumentFulfilmentBlockingReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCustomerTransactionDocumentFulfilmentBlockingReasonCode() {
        return customerTransactionDocumentFulfilmentBlockingReasonCode;
    }

    /**
     * customerTransactionDocumentFulfilmentBlockingReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCustomerTransactionDocumentFulfilmentBlockingReasonCode(String value) {
        this.customerTransactionDocumentFulfilmentBlockingReasonCode = value;
    }

    /**
     * customerBlockingReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCustomerBlockingReasonCode() {
        return customerBlockingReasonCode;
    }

    /**
     * customerBlockingReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCustomerBlockingReasonCode(String value) {
        this.customerBlockingReasonCode = value;
    }

    /**
     * Gets the value of the bankDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankDetails
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getBankDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerBankDetails }
     * 
     * 
     */
    public List<CustomerReponseCustomerBankDetails> getBankDetails() {
        if (bankDetails == null) {
            bankDetails = new ArrayList<CustomerReponseCustomerBankDetails>();
        }
        return this.bankDetails;
    }

    /**
     * Gets the value of the paymentCardDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentCardDetails
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPaymentCardDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerPaymentCardDetails }
     * 
     * 
     */
    public List<CustomerReponseCustomerPaymentCardDetails> getPaymentCardDetails() {
        if (paymentCardDetails == null) {
            paymentCardDetails = new ArrayList<CustomerReponseCustomerPaymentCardDetails>();
        }
        return this.paymentCardDetails;
    }

    /**
     * Gets the value of the paymentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentData
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPaymentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerPaymentData }
     * 
     * 
     */
    public List<CustomerReponseCustomerPaymentData> getPaymentData() {
        if (paymentData == null) {
            paymentData = new ArrayList<CustomerReponseCustomerPaymentData>();
        }
        return this.paymentData;
    }

    /**
     * Gets the value of the taxNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxNumber
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTaxNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerTaxNumber }
     * 
     * 
     */
    public List<CustomerReponseCustomerTaxNumber> getTaxNumber() {
        if (taxNumber == null) {
            taxNumber = new ArrayList<CustomerReponseCustomerTaxNumber>();
        }
        return this.taxNumber;
    }

    /**
     * Gets the value of the generalProductTaxExemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * generalProductTaxExemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGeneralProductTaxExemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerGeneralProductTaxExemption }
     * 
     * 
     */
    public List<CustomerReponseCustomerGeneralProductTaxExemption> getGeneralProductTaxExemption() {
        if (generalProductTaxExemption == null) {
            generalProductTaxExemption = new ArrayList<CustomerReponseCustomerGeneralProductTaxExemption>();
        }
        return this.generalProductTaxExemption;
    }

    /**
     * Gets the value of the taxExemptionCertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * taxExemptionCertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getTaxExemptionCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerResponseCustomerTaxExemptionCertificate }
     * 
     * 
     */
    public List<CustomerResponseCustomerTaxExemptionCertificate> getTaxExemptionCertificate() {
        if (taxExemptionCertificate == null) {
            taxExemptionCertificate = new ArrayList<CustomerResponseCustomerTaxExemptionCertificate>();
        }
        return this.taxExemptionCertificate;
    }

    /**
     * Gets the value of the operatingHoursInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the
     * operatingHoursInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getOperatingHoursInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerOperatingHoursInformation }
     * 
     * 
     */
    public List<CustomerReponseCustomerOperatingHoursInformation> getOperatingHoursInformation() {
        if (operatingHoursInformation == null) {
            operatingHoursInformation = new ArrayList<CustomerReponseCustomerOperatingHoursInformation>();
        }
        return this.operatingHoursInformation;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerText }
     * 
     * 
     */
    public List<CustomerReponseCustomerText> getText() {
        if (text == null) {
            text = new ArrayList<CustomerReponseCustomerText>();
        }
        return this.text;
    }

    /**
     * attachmentFolder 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link AccessAttachmentFolder }
     * 
     */
    public AccessAttachmentFolder getAttachmentFolder() {
        return attachmentFolder;
    }

    /**
     * attachmentFolder 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link AccessAttachmentFolder }
     * 
     */
    public void setAttachmentFolder(AccessAttachmentFolder value) {
        this.attachmentFolder = value;
    }

    /**
     * enterpriseIdentificationNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getEnterpriseIdentificationNumber() {
        return enterpriseIdentificationNumber;
    }

    /**
     * enterpriseIdentificationNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setEnterpriseIdentificationNumber(String value) {
        this.enterpriseIdentificationNumber = value;
    }

    /**
     * taxPayerCategoryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link TaxPayerCategoryCode }
     * 
     */
    public TaxPayerCategoryCode getTaxPayerCategoryCode() {
        return taxPayerCategoryCode;
    }

    /**
     * taxPayerCategoryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link TaxPayerCategoryCode }
     * 
     */
    public void setTaxPayerCategoryCode(TaxPayerCategoryCode value) {
        this.taxPayerCategoryCode = value;
    }

    /**
     * enterpriseIdentificationSupplementCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getEnterpriseIdentificationSupplementCode() {
        return enterpriseIdentificationSupplementCode;
    }

    /**
     * enterpriseIdentificationSupplementCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setEnterpriseIdentificationSupplementCode(String value) {
        this.enterpriseIdentificationSupplementCode = value;
    }

    /**
     * invoiceSummaryRoleCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link JPLogisticsInvoiceSummaryBusinessPartnerTypeCode }
     * 
     */
    public JPLogisticsInvoiceSummaryBusinessPartnerTypeCode getInvoiceSummaryRoleCode() {
        return invoiceSummaryRoleCode;
    }

    /**
     * invoiceSummaryRoleCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link JPLogisticsInvoiceSummaryBusinessPartnerTypeCode }
     * 
     */
    public void setInvoiceSummaryRoleCode(JPLogisticsInvoiceSummaryBusinessPartnerTypeCode value) {
        this.invoiceSummaryRoleCode = value;
    }

    /**
     * closingDatePatternID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getClosingDatePatternID() {
        return closingDatePatternID;
    }

    /**
     * closingDatePatternID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setClosingDatePatternID(String value) {
        this.closingDatePatternID = value;
    }

    /**
     * mxUseCfdiCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getMxUseCfdiCode() {
        return mxUseCfdiCode;
    }

    /**
     * mxUseCfdiCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setMxUseCfdiCode(String value) {
        this.mxUseCfdiCode = value;
    }

    /**
     * customerTCSIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isCustomerTCSIndicator() {
        return customerTCSIndicator;
    }

    /**
     * customerTCSIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setCustomerTCSIndicator(Boolean value) {
        this.customerTCSIndicator = value;
    }

}
