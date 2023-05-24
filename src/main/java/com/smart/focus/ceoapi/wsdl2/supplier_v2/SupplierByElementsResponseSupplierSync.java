
package com.smart.focus.ceoapi.wsdl2.supplier_v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SupplierByElementsResponseSupplier_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsResponseSupplier_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeStateID" type="{http://sap.com/xi/AP/Common/GDT}ChangeStateID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="InternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="SystemAdministrativeData" type="{http://sap.com/xi/AP/Common/GDT}SystemAdministrativeData" minOccurs="0"/&gt;
 *         &lt;element name="FirstLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="SecondLineName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="DunAndBradstreetNumberID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="GlobalLocationNumberID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="StandardCarrierAlphaCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="GermanCustomsNumberCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="PeppolParticipantID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="BidderIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="SupplierIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FreightForwarderIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="WarehouseProviderIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="CompanyLegalFormCode" type="{http://sap.com/xi/AP/Common/GDT}CompanyLegalFormCode" minOccurs="0"/&gt;
 *         &lt;element name="ABCClassificationCode" type="{http://sap.com/xi/AP/Common/GDT}SupplierABCClassificationCode" minOccurs="0"/&gt;
 *         &lt;element name="IndustrialSectorCode" type="{http://sap.com/xi/AP/Common/GDT}IndustrialSectorCode" minOccurs="0"/&gt;
 *         &lt;element name="MinimumOrderValue" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="QualityManagementISOStandardCode" type="{http://sap.com/xi/AP/Common/GDT}QualityManagementSystemStandardCode" minOccurs="0"/&gt;
 *         &lt;element name="QualityManagementValidToDate" type="{http://sap.com/xi/AP/Common/GDT}Date" minOccurs="0"/&gt;
 *         &lt;element name="LegalCompetenceIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="LifeCycleStatusCode" type="{http://sap.com/xi/AP/Common/GDT}PartyLifeCycleStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="NLChainLiabilityRelevanceIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="AddressInformation" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierAddressInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CommunicationArrangement" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierCommunicationArrangement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CommunicationArrangementMultiChannel" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerCommunicationArrangementMultiChannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Relationship" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContactPerson" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierContactPerson" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PurchasingData" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierPurchasingData" minOccurs="0"/&gt;
 *         &lt;element name="PaymentData" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierPaymentData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BankDetails" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierBankDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DeviantTaxClassification" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierDeviantTaxClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxClassification" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierWithholdingTaxClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GeneralProductTaxExemption" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierGeneralProductTaxExemption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://sap.com/xi/A1S/Global}SupplierByElementsResponseSupplierText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AttachmentFolder" type="{http://sap.com/xi/DocumentServices/Global}AccessAttachmentFolder" minOccurs="0"/&gt;
 *         &lt;element name="EnterpriseIdentificationNumber" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerID" minOccurs="0"/&gt;
 *         &lt;element name="EnterpriseIdentificationSupplementCode" type="{http://sap.com/xi/AP/Common/GDT}CH_EnterpriseIdentificationSupplementCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxPayerCategoryCode" type="{http://sap.com/xi/AP/Common/GDT}TaxPayerCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="ILOccupationCode" type="{http://sap.com/xi/AP/Globalization}IL_TaxReportingBusinessPartnerOccupationCode" minOccurs="0"/&gt;
 *         &lt;element name="WithholdingTaxOfficeCode" type="{http://sap.com/xi/AP/Globalization}IL_TaxReportingBusinessPartnerWithHoldingOfficeName" minOccurs="0"/&gt;
 *         &lt;element name="AuthorisationToDeferTaxIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="SupplierNonCompanyIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="BusinessPartnerFormattedName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_LONG_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierByElementsResponseSupplier_sync", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "changeStateID",
    "uuid",
    "internalID",
    "systemAdministrativeData",
    "firstLineName",
    "secondLineName",
    "dunAndBradstreetNumberID",
    "globalLocationNumberID",
    "standardCarrierAlphaCode",
    "germanCustomsNumberCode",
    "peppolParticipantID",
    "bidderIndicator",
    "supplierIndicator",
    "freightForwarderIndicator",
    "warehouseProviderIndicator",
    "companyLegalFormCode",
    "abcClassificationCode",
    "industrialSectorCode",
    "minimumOrderValue",
    "qualityManagementISOStandardCode",
    "qualityManagementValidToDate",
    "legalCompetenceIndicator",
    "lifeCycleStatusCode",
    "nlChainLiabilityRelevanceIndicator",
    "addressInformation",
    "communicationArrangement",
    "communicationArrangementMultiChannel",
    "relationship",
    "contactPerson",
    "purchasingData",
    "paymentData",
    "bankDetails",
    "deviantTaxClassification",
    "withholdingTaxClassification",
    "generalProductTaxExemption",
    "text",
    "attachmentFolder",
    "enterpriseIdentificationNumber",
    "enterpriseIdentificationSupplementCode",
    "taxPayerCategoryCode",
    "ilOccupationCode",
    "withholdingTaxOfficeCode",
    "authorisationToDeferTaxIndicator",
    "supplierNonCompanyIndicator",
    "businessPartnerFormattedName"
})
public class SupplierByElementsResponseSupplierSync {

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
    @XmlElement(name = "FirstLineName")
    protected String firstLineName;
    @XmlElement(name = "SecondLineName")
    protected String secondLineName;
    @XmlElement(name = "DunAndBradstreetNumberID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dunAndBradstreetNumberID;
    @XmlElement(name = "GlobalLocationNumberID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String globalLocationNumberID;
    @XmlElement(name = "StandardCarrierAlphaCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String standardCarrierAlphaCode;
    @XmlElement(name = "GermanCustomsNumberCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String germanCustomsNumberCode;
    @XmlElement(name = "PeppolParticipantID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String peppolParticipantID;
    @XmlElement(name = "BidderIndicator")
    protected Boolean bidderIndicator;
    @XmlElement(name = "SupplierIndicator")
    protected Boolean supplierIndicator;
    @XmlElement(name = "FreightForwarderIndicator")
    protected Boolean freightForwarderIndicator;
    @XmlElement(name = "WarehouseProviderIndicator")
    protected Boolean warehouseProviderIndicator;
    @XmlElement(name = "CompanyLegalFormCode")
    protected CompanyLegalFormCode companyLegalFormCode;
    @XmlElement(name = "ABCClassificationCode")
    protected SupplierABCClassificationCode abcClassificationCode;
    @XmlElement(name = "IndustrialSectorCode")
    protected IndustrialSectorCode industrialSectorCode;
    @XmlElement(name = "MinimumOrderValue")
    protected Amount minimumOrderValue;
    @XmlElement(name = "QualityManagementISOStandardCode")
    protected QualityManagementSystemStandardCode qualityManagementISOStandardCode;
    @XmlElement(name = "QualityManagementValidToDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar qualityManagementValidToDate;
    @XmlElement(name = "LegalCompetenceIndicator")
    protected Boolean legalCompetenceIndicator;
    @XmlElement(name = "LifeCycleStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lifeCycleStatusCode;
    @XmlElement(name = "NLChainLiabilityRelevanceIndicator")
    protected Boolean nlChainLiabilityRelevanceIndicator;
    @XmlElement(name = "AddressInformation")
    protected List<SupplierByElementsResponseSupplierAddressInformation> addressInformation;
    @XmlElement(name = "CommunicationArrangement")
    protected List<SupplierByElementsResponseSupplierCommunicationArrangement> communicationArrangement;
    @XmlElement(name = "CommunicationArrangementMultiChannel")
    protected List<CustomerReponseCustomerCommunicationArrangementMultiChannel> communicationArrangementMultiChannel;
    @XmlElement(name = "Relationship")
    protected List<SupplierByElementsResponseSupplierRelationship> relationship;
    @XmlElement(name = "ContactPerson")
    protected List<SupplierByElementsResponseSupplierContactPerson> contactPerson;
    @XmlElement(name = "PurchasingData")
    protected SupplierByElementsResponseSupplierPurchasingData purchasingData;
    @XmlElement(name = "PaymentData")
    protected List<SupplierByElementsResponseSupplierPaymentData> paymentData;
    @XmlElement(name = "BankDetails")
    protected List<SupplierByElementsResponseSupplierBankDetails> bankDetails;
    @XmlElement(name = "DeviantTaxClassification")
    protected List<SupplierByElementsResponseSupplierDeviantTaxClassification> deviantTaxClassification;
    @XmlElement(name = "WithholdingTaxClassification")
    protected List<SupplierByElementsResponseSupplierWithholdingTaxClassification> withholdingTaxClassification;
    @XmlElement(name = "GeneralProductTaxExemption")
    protected List<SupplierByElementsResponseSupplierGeneralProductTaxExemption> generalProductTaxExemption;
    @XmlElement(name = "Text")
    protected List<SupplierByElementsResponseSupplierText> text;
    @XmlElement(name = "AttachmentFolder")
    protected AccessAttachmentFolder attachmentFolder;
    @XmlElement(name = "EnterpriseIdentificationNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String enterpriseIdentificationNumber;
    @XmlElement(name = "EnterpriseIdentificationSupplementCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String enterpriseIdentificationSupplementCode;
    @XmlElement(name = "TaxPayerCategoryCode")
    protected TaxPayerCategoryCode taxPayerCategoryCode;
    @XmlElement(name = "ILOccupationCode")
    protected ILTaxReportingBusinessPartnerOccupationCode ilOccupationCode;
    @XmlElement(name = "WithholdingTaxOfficeCode")
    protected ILTaxReportingBusinessPartnerWithHoldingOfficeName withholdingTaxOfficeCode;
    @XmlElement(name = "AuthorisationToDeferTaxIndicator")
    protected Boolean authorisationToDeferTaxIndicator;
    @XmlElement(name = "SupplierNonCompanyIndicator")
    protected Boolean supplierNonCompanyIndicator;
    @XmlElement(name = "BusinessPartnerFormattedName")
    protected String businessPartnerFormattedName;

    /**
     * changeStateID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeStateID() {
        return changeStateID;
    }

    /**
     * changeStateID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeStateID(String value) {
        this.changeStateID = value;
    }

    /**
     * uuid 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * uuid 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setUUID(UUID value) {
        this.uuid = value;
    }

    /**
     * internalID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalID() {
        return internalID;
    }

    /**
     * internalID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalID(String value) {
        this.internalID = value;
    }

    /**
     * systemAdministrativeData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SystemAdministrativeData }
     *     
     */
    public SystemAdministrativeData getSystemAdministrativeData() {
        return systemAdministrativeData;
    }

    /**
     * systemAdministrativeData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAdministrativeData }
     *     
     */
    public void setSystemAdministrativeData(SystemAdministrativeData value) {
        this.systemAdministrativeData = value;
    }

    /**
     * firstLineName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstLineName() {
        return firstLineName;
    }

    /**
     * firstLineName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstLineName(String value) {
        this.firstLineName = value;
    }

    /**
     * secondLineName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondLineName() {
        return secondLineName;
    }

    /**
     * secondLineName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondLineName(String value) {
        this.secondLineName = value;
    }

    /**
     * dunAndBradstreetNumberID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunAndBradstreetNumberID() {
        return dunAndBradstreetNumberID;
    }

    /**
     * dunAndBradstreetNumberID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunAndBradstreetNumberID(String value) {
        this.dunAndBradstreetNumberID = value;
    }

    /**
     * globalLocationNumberID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalLocationNumberID() {
        return globalLocationNumberID;
    }

    /**
     * globalLocationNumberID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalLocationNumberID(String value) {
        this.globalLocationNumberID = value;
    }

    /**
     * standardCarrierAlphaCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardCarrierAlphaCode() {
        return standardCarrierAlphaCode;
    }

    /**
     * standardCarrierAlphaCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardCarrierAlphaCode(String value) {
        this.standardCarrierAlphaCode = value;
    }

    /**
     * germanCustomsNumberCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGermanCustomsNumberCode() {
        return germanCustomsNumberCode;
    }

    /**
     * germanCustomsNumberCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGermanCustomsNumberCode(String value) {
        this.germanCustomsNumberCode = value;
    }

    /**
     * peppolParticipantID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeppolParticipantID() {
        return peppolParticipantID;
    }

    /**
     * peppolParticipantID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeppolParticipantID(String value) {
        this.peppolParticipantID = value;
    }

    /**
     * bidderIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBidderIndicator() {
        return bidderIndicator;
    }

    /**
     * bidderIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBidderIndicator(Boolean value) {
        this.bidderIndicator = value;
    }

    /**
     * supplierIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupplierIndicator() {
        return supplierIndicator;
    }

    /**
     * supplierIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupplierIndicator(Boolean value) {
        this.supplierIndicator = value;
    }

    /**
     * freightForwarderIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFreightForwarderIndicator() {
        return freightForwarderIndicator;
    }

    /**
     * freightForwarderIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFreightForwarderIndicator(Boolean value) {
        this.freightForwarderIndicator = value;
    }

    /**
     * warehouseProviderIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarehouseProviderIndicator() {
        return warehouseProviderIndicator;
    }

    /**
     * warehouseProviderIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarehouseProviderIndicator(Boolean value) {
        this.warehouseProviderIndicator = value;
    }

    /**
     * companyLegalFormCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CompanyLegalFormCode }
     *     
     */
    public CompanyLegalFormCode getCompanyLegalFormCode() {
        return companyLegalFormCode;
    }

    /**
     * companyLegalFormCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyLegalFormCode }
     *     
     */
    public void setCompanyLegalFormCode(CompanyLegalFormCode value) {
        this.companyLegalFormCode = value;
    }

    /**
     * abcClassificationCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SupplierABCClassificationCode }
     *     
     */
    public SupplierABCClassificationCode getABCClassificationCode() {
        return abcClassificationCode;
    }

    /**
     * abcClassificationCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierABCClassificationCode }
     *     
     */
    public void setABCClassificationCode(SupplierABCClassificationCode value) {
        this.abcClassificationCode = value;
    }

    /**
     * industrialSectorCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public IndustrialSectorCode getIndustrialSectorCode() {
        return industrialSectorCode;
    }

    /**
     * industrialSectorCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link IndustrialSectorCode }
     *     
     */
    public void setIndustrialSectorCode(IndustrialSectorCode value) {
        this.industrialSectorCode = value;
    }

    /**
     * minimumOrderValue 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getMinimumOrderValue() {
        return minimumOrderValue;
    }

    /**
     * minimumOrderValue 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setMinimumOrderValue(Amount value) {
        this.minimumOrderValue = value;
    }

    /**
     * qualityManagementISOStandardCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link QualityManagementSystemStandardCode }
     *     
     */
    public QualityManagementSystemStandardCode getQualityManagementISOStandardCode() {
        return qualityManagementISOStandardCode;
    }

    /**
     * qualityManagementISOStandardCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityManagementSystemStandardCode }
     *     
     */
    public void setQualityManagementISOStandardCode(QualityManagementSystemStandardCode value) {
        this.qualityManagementISOStandardCode = value;
    }

    /**
     * qualityManagementValidToDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQualityManagementValidToDate() {
        return qualityManagementValidToDate;
    }

    /**
     * qualityManagementValidToDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQualityManagementValidToDate(XMLGregorianCalendar value) {
        this.qualityManagementValidToDate = value;
    }

    /**
     * legalCompetenceIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalCompetenceIndicator() {
        return legalCompetenceIndicator;
    }

    /**
     * legalCompetenceIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalCompetenceIndicator(Boolean value) {
        this.legalCompetenceIndicator = value;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCycleStatusCode() {
        return lifeCycleStatusCode;
    }

    /**
     * lifeCycleStatusCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCycleStatusCode(String value) {
        this.lifeCycleStatusCode = value;
    }

    /**
     * nlChainLiabilityRelevanceIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNLChainLiabilityRelevanceIndicator() {
        return nlChainLiabilityRelevanceIndicator;
    }

    /**
     * nlChainLiabilityRelevanceIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNLChainLiabilityRelevanceIndicator(Boolean value) {
        this.nlChainLiabilityRelevanceIndicator = value;
    }

    /**
     * Gets the value of the addressInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsResponseSupplierAddressInformation }
     * 
     * 
     */
    public List<SupplierByElementsResponseSupplierAddressInformation> getAddressInformation() {
        if (addressInformation == null) {
            addressInformation = new ArrayList<SupplierByElementsResponseSupplierAddressInformation>();
        }
        return this.addressInformation;
    }

    /**
     * Gets the value of the communicationArrangement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the communicationArrangement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationArrangement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsResponseSupplierCommunicationArrangement }
     * 
     * 
     */
    public List<SupplierByElementsResponseSupplierCommunicationArrangement> getCommunicationArrangement() {
        if (communicationArrangement == null) {
            communicationArrangement = new ArrayList<SupplierByElementsResponseSupplierCommunicationArrangement>();
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
     * This is why there is not a <CODE>set</CODE> method for the communicationArrangementMultiChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationArrangementMultiChannel().add(newItem);
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
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsResponseSupplierRelationship }
     * 
     * 
     */
    public List<SupplierByElementsResponseSupplierRelationship> getRelationship() {
        if (relationship == null) {
            relationship = new ArrayList<SupplierByElementsResponseSupplierRelationship>();
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
     * This is why there is not a <CODE>set</CODE> method for the contactPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsResponseSupplierContactPerson }
     * 
     * 
     */
    public List<SupplierByElementsResponseSupplierContactPerson> getContactPerson() {
        if (contactPerson == null) {
            contactPerson = new ArrayList<SupplierByElementsResponseSupplierContactPerson>();
        }
        return this.contactPerson;
    }

    /**
     * purchasingData 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SupplierByElementsResponseSupplierPurchasingData }
     *     
     */
    public SupplierByElementsResponseSupplierPurchasingData getPurchasingData() {
        return purchasingData;
    }

    /**
     * purchasingData 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierByElementsResponseSupplierPurchasingData }
     *     
     */
    public void setPurchasingData(SupplierByElementsResponseSupplierPurchasingData value) {
        this.purchasingData = value;
    }

    /**
     * Gets the value of the paymentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsResponseSupplierPaymentData }
     * 
     * 
     */
    public List<SupplierByElementsResponseSupplierPaymentData> getPaymentData() {
        if (paymentData == null) {
            paymentData = new ArrayList<SupplierByElementsResponseSupplierPaymentData>();
        }
        return this.paymentData;
    }

    /**
     * Gets the value of the bankDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsResponseSupplierBankDetails }
     * 
     * 
     */
    public List<SupplierByElementsResponseSupplierBankDetails> getBankDetails() {
        if (bankDetails == null) {
            bankDetails = new ArrayList<SupplierByElementsResponseSupplierBankDetails>();
        }
        return this.bankDetails;
    }

    /**
     * Gets the value of the deviantTaxClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviantTaxClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviantTaxClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsResponseSupplierDeviantTaxClassification }
     * 
     * 
     */
    public List<SupplierByElementsResponseSupplierDeviantTaxClassification> getDeviantTaxClassification() {
        if (deviantTaxClassification == null) {
            deviantTaxClassification = new ArrayList<SupplierByElementsResponseSupplierDeviantTaxClassification>();
        }
        return this.deviantTaxClassification;
    }

    /**
     * Gets the value of the withholdingTaxClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withholdingTaxClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWithholdingTaxClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsResponseSupplierWithholdingTaxClassification }
     * 
     * 
     */
    public List<SupplierByElementsResponseSupplierWithholdingTaxClassification> getWithholdingTaxClassification() {
        if (withholdingTaxClassification == null) {
            withholdingTaxClassification = new ArrayList<SupplierByElementsResponseSupplierWithholdingTaxClassification>();
        }
        return this.withholdingTaxClassification;
    }

    /**
     * Gets the value of the generalProductTaxExemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalProductTaxExemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralProductTaxExemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsResponseSupplierGeneralProductTaxExemption }
     * 
     * 
     */
    public List<SupplierByElementsResponseSupplierGeneralProductTaxExemption> getGeneralProductTaxExemption() {
        if (generalProductTaxExemption == null) {
            generalProductTaxExemption = new ArrayList<SupplierByElementsResponseSupplierGeneralProductTaxExemption>();
        }
        return this.generalProductTaxExemption;
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
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplierByElementsResponseSupplierText }
     * 
     * 
     */
    public List<SupplierByElementsResponseSupplierText> getText() {
        if (text == null) {
            text = new ArrayList<SupplierByElementsResponseSupplierText>();
        }
        return this.text;
    }

    /**
     * attachmentFolder 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link AccessAttachmentFolder }
     *     
     */
    public AccessAttachmentFolder getAttachmentFolder() {
        return attachmentFolder;
    }

    /**
     * attachmentFolder 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessAttachmentFolder }
     *     
     */
    public void setAttachmentFolder(AccessAttachmentFolder value) {
        this.attachmentFolder = value;
    }

    /**
     * enterpriseIdentificationNumber 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseIdentificationNumber() {
        return enterpriseIdentificationNumber;
    }

    /**
     * enterpriseIdentificationNumber 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseIdentificationNumber(String value) {
        this.enterpriseIdentificationNumber = value;
    }

    /**
     * enterpriseIdentificationSupplementCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnterpriseIdentificationSupplementCode() {
        return enterpriseIdentificationSupplementCode;
    }

    /**
     * enterpriseIdentificationSupplementCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnterpriseIdentificationSupplementCode(String value) {
        this.enterpriseIdentificationSupplementCode = value;
    }

    /**
     * taxPayerCategoryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TaxPayerCategoryCode }
     *     
     */
    public TaxPayerCategoryCode getTaxPayerCategoryCode() {
        return taxPayerCategoryCode;
    }

    /**
     * taxPayerCategoryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPayerCategoryCode }
     *     
     */
    public void setTaxPayerCategoryCode(TaxPayerCategoryCode value) {
        this.taxPayerCategoryCode = value;
    }

    /**
     * ilOccupationCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ILTaxReportingBusinessPartnerOccupationCode }
     *     
     */
    public ILTaxReportingBusinessPartnerOccupationCode getILOccupationCode() {
        return ilOccupationCode;
    }

    /**
     * ilOccupationCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ILTaxReportingBusinessPartnerOccupationCode }
     *     
     */
    public void setILOccupationCode(ILTaxReportingBusinessPartnerOccupationCode value) {
        this.ilOccupationCode = value;
    }

    /**
     * withholdingTaxOfficeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ILTaxReportingBusinessPartnerWithHoldingOfficeName }
     *     
     */
    public ILTaxReportingBusinessPartnerWithHoldingOfficeName getWithholdingTaxOfficeCode() {
        return withholdingTaxOfficeCode;
    }

    /**
     * withholdingTaxOfficeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ILTaxReportingBusinessPartnerWithHoldingOfficeName }
     *     
     */
    public void setWithholdingTaxOfficeCode(ILTaxReportingBusinessPartnerWithHoldingOfficeName value) {
        this.withholdingTaxOfficeCode = value;
    }

    /**
     * authorisationToDeferTaxIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthorisationToDeferTaxIndicator() {
        return authorisationToDeferTaxIndicator;
    }

    /**
     * authorisationToDeferTaxIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthorisationToDeferTaxIndicator(Boolean value) {
        this.authorisationToDeferTaxIndicator = value;
    }

    /**
     * supplierNonCompanyIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupplierNonCompanyIndicator() {
        return supplierNonCompanyIndicator;
    }

    /**
     * supplierNonCompanyIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupplierNonCompanyIndicator(Boolean value) {
        this.supplierNonCompanyIndicator = value;
    }

    /**
     * businessPartnerFormattedName 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerFormattedName() {
        return businessPartnerFormattedName;
    }

    /**
     * businessPartnerFormattedName 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerFormattedName(String value) {
        this.businessPartnerFormattedName = value;
    }

}
