
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.smart.focus.ceoapi.wsdl2.customer_v2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CustomerByCommunicationDataQuerySync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "CustomerByCommunicationDataQuery_sync");
    private final static QName _CustomerByCommunicationDataResponseSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "CustomerByCommunicationDataResponse_sync");
    private final static QName _CustomerByElementsQuerySync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "CustomerByElementsQuery_sync");
    private final static QName _CustomerByElementsResponseSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "CustomerByElementsResponse_sync");
    private final static QName _CustomerByIdentificationQuerySync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "CustomerByIdentificationQuery_sync");
    private final static QName _CustomerByIdentificationResponseSync_QNAME = new QName("http://sap.com/xi/SAPGlobal20/Global", "CustomerByIdentificationResponse_sync");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.smart.focus.ceoapi.wsdl2.customer_v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JPLogisticsInvoiceSummaryBusinessPartnerTypeCode }
     * 
     */
    public JPLogisticsInvoiceSummaryBusinessPartnerTypeCode createJPLogisticsInvoiceSummaryBusinessPartnerTypeCode() {
        return new JPLogisticsInvoiceSummaryBusinessPartnerTypeCode();
    }

    /**
     * Create an instance of {@link CustomerByCommunicationDataQueryMessageSync }
     * 
     */
    public CustomerByCommunicationDataQueryMessageSync createCustomerByCommunicationDataQueryMessageSync() {
        return new CustomerByCommunicationDataQueryMessageSync();
    }

    /**
     * Create an instance of {@link CustomerResponseMessageSync }
     * 
     */
    public CustomerResponseMessageSync createCustomerResponseMessageSync() {
        return new CustomerResponseMessageSync();
    }

    /**
     * Create an instance of {@link CustomerByElementsQueryMessageSync }
     * 
     */
    public CustomerByElementsQueryMessageSync createCustomerByElementsQueryMessageSync() {
        return new CustomerByElementsQueryMessageSync();
    }

    /**
     * Create an instance of {@link CustomerByIdentificationQueryMessageSync }
     * 
     */
    public CustomerByIdentificationQueryMessageSync createCustomerByIdentificationQueryMessageSync() {
        return new CustomerByIdentificationQueryMessageSync();
    }

    /**
     * Create an instance of {@link StandardFaultMessage }
     * 
     */
    public StandardFaultMessage createStandardFaultMessage() {
        return new StandardFaultMessage();
    }

    /**
     * Create an instance of {@link ExchangeFaultData }
     * 
     */
    public ExchangeFaultData createExchangeFaultData() {
        return new ExchangeFaultData();
    }

    /**
     * Create an instance of {@link StandardFaultMessageExtension }
     * 
     */
    public StandardFaultMessageExtension createStandardFaultMessageExtension() {
        return new StandardFaultMessageExtension();
    }

    /**
     * Create an instance of {@link ExchangeLogData }
     * 
     */
    public ExchangeLogData createExchangeLogData() {
        return new ExchangeLogData();
    }

    /**
     * Create an instance of {@link SelectionByAmount }
     * 
     */
    public SelectionByAmount createSelectionByAmount() {
        return new SelectionByAmount();
    }

    /**
     * Create an instance of {@link SelectionByCode }
     * 
     */
    public SelectionByCode createSelectionByCode() {
        return new SelectionByCode();
    }

    /**
     * Create an instance of {@link SelectionByDate }
     * 
     */
    public SelectionByDate createSelectionByDate() {
        return new SelectionByDate();
    }

    /**
     * Create an instance of {@link SelectionByIdentifier }
     * 
     */
    public SelectionByIdentifier createSelectionByIdentifier() {
        return new SelectionByIdentifier();
    }

    /**
     * Create an instance of {@link SelectionByIndicator }
     * 
     */
    public SelectionByIndicator createSelectionByIndicator() {
        return new SelectionByIndicator();
    }

    /**
     * Create an instance of {@link SelectionByName }
     * 
     */
    public SelectionByName createSelectionByName() {
        return new SelectionByName();
    }

    /**
     * Create an instance of {@link SelectionByUUID }
     * 
     */
    public SelectionByUUID createSelectionByUUID() {
        return new SelectionByUUID();
    }

    /**
     * Create an instance of {@link SelectionByValue }
     * 
     */
    public SelectionByValue createSelectionByValue() {
        return new SelectionByValue();
    }

    /**
     * Create an instance of {@link CustomerReponseContactPersonResponsibleEmployee }
     * 
     */
    public CustomerReponseContactPersonResponsibleEmployee createCustomerReponseContactPersonResponsibleEmployee() {
        return new CustomerReponseContactPersonResponsibleEmployee();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomer }
     * 
     */
    public CustomerReponseCustomer createCustomerReponseCustomer() {
        return new CustomerReponseCustomer();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerAddress }
     * 
     */
    public CustomerReponseCustomerAddress createCustomerReponseCustomerAddress() {
        return new CustomerReponseCustomerAddress();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerAddressInformation }
     * 
     */
    public CustomerReponseCustomerAddressInformation createCustomerReponseCustomerAddressInformation() {
        return new CustomerReponseCustomerAddressInformation();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerAddressPostalAddress }
     * 
     */
    public CustomerReponseCustomerAddressPostalAddress createCustomerReponseCustomerAddressPostalAddress() {
        return new CustomerReponseCustomerAddressPostalAddress();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerAddressTelephone }
     * 
     */
    public CustomerReponseCustomerAddressTelephone createCustomerReponseCustomerAddressTelephone() {
        return new CustomerReponseCustomerAddressTelephone();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerAddressUsage }
     * 
     */
    public CustomerReponseCustomerAddressUsage createCustomerReponseCustomerAddressUsage() {
        return new CustomerReponseCustomerAddressUsage();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerBankDetails }
     * 
     */
    public CustomerReponseCustomerBankDetails createCustomerReponseCustomerBankDetails() {
        return new CustomerReponseCustomerBankDetails();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerCommunicationArrangement }
     * 
     */
    public CustomerReponseCustomerCommunicationArrangement createCustomerReponseCustomerCommunicationArrangement() {
        return new CustomerReponseCustomerCommunicationArrangement();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerCommunicationArrangementMultiChannel }
     * 
     */
    public CustomerReponseCustomerCommunicationArrangementMultiChannel createCustomerReponseCustomerCommunicationArrangementMultiChannel() {
        return new CustomerReponseCustomerCommunicationArrangementMultiChannel();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerCommunicationChannel }
     * 
     */
    public CustomerReponseCustomerCommunicationChannel createCustomerReponseCustomerCommunicationChannel() {
        return new CustomerReponseCustomerCommunicationChannel();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerCommunicationEmail }
     * 
     */
    public CustomerReponseCustomerCommunicationEmail createCustomerReponseCustomerCommunicationEmail() {
        return new CustomerReponseCustomerCommunicationEmail();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerContactPerson }
     * 
     */
    public CustomerReponseCustomerContactPerson createCustomerReponseCustomerContactPerson() {
        return new CustomerReponseCustomerContactPerson();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerContactPersonAddress }
     * 
     */
    public CustomerReponseCustomerContactPersonAddress createCustomerReponseCustomerContactPersonAddress() {
        return new CustomerReponseCustomerContactPersonAddress();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerContactPersonAddressInformation }
     * 
     */
    public CustomerReponseCustomerContactPersonAddressInformation createCustomerReponseCustomerContactPersonAddressInformation() {
        return new CustomerReponseCustomerContactPersonAddressInformation();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerContactPersonAddressUsage }
     * 
     */
    public CustomerReponseCustomerContactPersonAddressUsage createCustomerReponseCustomerContactPersonAddressUsage() {
        return new CustomerReponseCustomerContactPersonAddressUsage();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerContactPersonTelephone }
     * 
     */
    public CustomerReponseCustomerContactPersonTelephone createCustomerReponseCustomerContactPersonTelephone() {
        return new CustomerReponseCustomerContactPersonTelephone();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerDirectResponsibility }
     * 
     */
    public CustomerReponseCustomerDirectResponsibility createCustomerReponseCustomerDirectResponsibility() {
        return new CustomerReponseCustomerDirectResponsibility();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerFormattedAddress }
     * 
     */
    public CustomerReponseCustomerFormattedAddress createCustomerReponseCustomerFormattedAddress() {
        return new CustomerReponseCustomerFormattedAddress();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerGeneralProductTaxExemption }
     * 
     */
    public CustomerReponseCustomerGeneralProductTaxExemption createCustomerReponseCustomerGeneralProductTaxExemption() {
        return new CustomerReponseCustomerGeneralProductTaxExemption();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerOperatingHoursInformation }
     * 
     */
    public CustomerReponseCustomerOperatingHoursInformation createCustomerReponseCustomerOperatingHoursInformation() {
        return new CustomerReponseCustomerOperatingHoursInformation();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme }
     * 
     */
    public CustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme createCustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme() {
        return new CustomerReponseCustomerOperatingHoursInformationRecurringDayProgramme();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerOrganisation }
     * 
     */
    public CustomerReponseCustomerOrganisation createCustomerReponseCustomerOrganisation() {
        return new CustomerReponseCustomerOrganisation();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerPaymentCardDetails }
     * 
     */
    public CustomerReponseCustomerPaymentCardDetails createCustomerReponseCustomerPaymentCardDetails() {
        return new CustomerReponseCustomerPaymentCardDetails();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerPaymentData }
     * 
     */
    public CustomerReponseCustomerPaymentData createCustomerReponseCustomerPaymentData() {
        return new CustomerReponseCustomerPaymentData();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerPaymentDataPaymentForm }
     * 
     */
    public CustomerReponseCustomerPaymentDataPaymentForm createCustomerReponseCustomerPaymentDataPaymentForm() {
        return new CustomerReponseCustomerPaymentDataPaymentForm();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerPerson }
     * 
     */
    public CustomerReponseCustomerPerson createCustomerReponseCustomerPerson() {
        return new CustomerReponseCustomerPerson();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerRecurringDayProgrammeOperationHours }
     * 
     */
    public CustomerReponseCustomerRecurringDayProgrammeOperationHours createCustomerReponseCustomerRecurringDayProgrammeOperationHours() {
        return new CustomerReponseCustomerRecurringDayProgrammeOperationHours();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerRelationship }
     * 
     */
    public CustomerReponseCustomerRelationship createCustomerReponseCustomerRelationship() {
        return new CustomerReponseCustomerRelationship();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerSalesArrangement }
     * 
     */
    public CustomerReponseCustomerSalesArrangement createCustomerReponseCustomerSalesArrangement() {
        return new CustomerReponseCustomerSalesArrangement();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerTaxNumber }
     * 
     */
    public CustomerReponseCustomerTaxNumber createCustomerReponseCustomerTaxNumber() {
        return new CustomerReponseCustomerTaxNumber();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerText }
     * 
     */
    public CustomerReponseCustomerText createCustomerReponseCustomerText() {
        return new CustomerReponseCustomerText();
    }

    /**
     * Create an instance of {@link CustomerReponseCustomerWorkplaceTelephone }
     * 
     */
    public CustomerReponseCustomerWorkplaceTelephone createCustomerReponseCustomerWorkplaceTelephone() {
        return new CustomerReponseCustomerWorkplaceTelephone();
    }

    /**
     * Create an instance of {@link CustomerRequestedElements }
     * 
     */
    public CustomerRequestedElements createCustomerRequestedElements() {
        return new CustomerRequestedElements();
    }

    /**
     * Create an instance of {@link CustomerRequestedElementsCustomer }
     * 
     */
    public CustomerRequestedElementsCustomer createCustomerRequestedElementsCustomer() {
        return new CustomerRequestedElementsCustomer();
    }

    /**
     * Create an instance of {@link CustomerResponseCustomerTaxExemptionCertificate }
     * 
     */
    public CustomerResponseCustomerTaxExemptionCertificate createCustomerResponseCustomerTaxExemptionCertificate() {
        return new CustomerResponseCustomerTaxExemptionCertificate();
    }

    /**
     * Create an instance of {@link CustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason }
     * 
     */
    public CustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason createCustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason() {
        return new CustomerResponseCustomerTaxExemptionCertificateTaxExemptionReason();
    }

    /**
     * Create an instance of {@link CustomerSelectionByBusinessCharacterCode }
     * 
     */
    public CustomerSelectionByBusinessCharacterCode createCustomerSelectionByBusinessCharacterCode() {
        return new CustomerSelectionByBusinessCharacterCode();
    }

    /**
     * Create an instance of {@link CustomerSelectionByBusinessPartnerAdditionalName }
     * 
     */
    public CustomerSelectionByBusinessPartnerAdditionalName createCustomerSelectionByBusinessPartnerAdditionalName() {
        return new CustomerSelectionByBusinessPartnerAdditionalName();
    }

    /**
     * Create an instance of {@link CustomerSelectionByBusinessPartnerID }
     * 
     */
    public CustomerSelectionByBusinessPartnerID createCustomerSelectionByBusinessPartnerID() {
        return new CustomerSelectionByBusinessPartnerID();
    }

    /**
     * Create an instance of {@link CustomerSelectionByBusinessPartnerName }
     * 
     */
    public CustomerSelectionByBusinessPartnerName createCustomerSelectionByBusinessPartnerName() {
        return new CustomerSelectionByBusinessPartnerName();
    }

    /**
     * Create an instance of {@link CustomerSelectionByCategoryCode }
     * 
     */
    public CustomerSelectionByCategoryCode createCustomerSelectionByCategoryCode() {
        return new CustomerSelectionByCategoryCode();
    }

    /**
     * Create an instance of {@link CustomerSelectionByChangeDateTime }
     * 
     */
    public CustomerSelectionByChangeDateTime createCustomerSelectionByChangeDateTime() {
        return new CustomerSelectionByChangeDateTime();
    }

    /**
     * Create an instance of {@link CustomerSelectionByCityName }
     * 
     */
    public CustomerSelectionByCityName createCustomerSelectionByCityName() {
        return new CustomerSelectionByCityName();
    }

    /**
     * Create an instance of {@link CustomerSelectionByCommunicationData }
     * 
     */
    public CustomerSelectionByCommunicationData createCustomerSelectionByCommunicationData() {
        return new CustomerSelectionByCommunicationData();
    }

    /**
     * Create an instance of {@link CustomerSelectionByCountryCode }
     * 
     */
    public CustomerSelectionByCountryCode createCustomerSelectionByCountryCode() {
        return new CustomerSelectionByCountryCode();
    }

    /**
     * Create an instance of {@link CustomerSelectionByCreationDateTime }
     * 
     */
    public CustomerSelectionByCreationDateTime createCustomerSelectionByCreationDateTime() {
        return new CustomerSelectionByCreationDateTime();
    }

    /**
     * Create an instance of {@link CustomerSelectionByCustomerABCClassificationCode }
     * 
     */
    public CustomerSelectionByCustomerABCClassificationCode createCustomerSelectionByCustomerABCClassificationCode() {
        return new CustomerSelectionByCustomerABCClassificationCode();
    }

    /**
     * Create an instance of {@link CustomerSelectionByElements }
     * 
     */
    public CustomerSelectionByElements createCustomerSelectionByElements() {
        return new CustomerSelectionByElements();
    }

    /**
     * Create an instance of {@link CustomerSelectionByEmailURI }
     * 
     */
    public CustomerSelectionByEmailURI createCustomerSelectionByEmailURI() {
        return new CustomerSelectionByEmailURI();
    }

    /**
     * Create an instance of {@link CustomerSelectionByIdentification }
     * 
     */
    public CustomerSelectionByIdentification createCustomerSelectionByIdentification() {
        return new CustomerSelectionByIdentification();
    }

    /**
     * Create an instance of {@link CustomerSelectionByIdentityID }
     * 
     */
    public CustomerSelectionByIdentityID createCustomerSelectionByIdentityID() {
        return new CustomerSelectionByIdentityID();
    }

    /**
     * Create an instance of {@link CustomerSelectionByIndustrialSectorCode }
     * 
     */
    public CustomerSelectionByIndustrialSectorCode createCustomerSelectionByIndustrialSectorCode() {
        return new CustomerSelectionByIndustrialSectorCode();
    }

    /**
     * Create an instance of {@link CustomerSelectionByInternalID }
     * 
     */
    public CustomerSelectionByInternalID createCustomerSelectionByInternalID() {
        return new CustomerSelectionByInternalID();
    }

    /**
     * Create an instance of {@link CustomerSelectionByLifeCycleStatusCode }
     * 
     */
    public CustomerSelectionByLifeCycleStatusCode createCustomerSelectionByLifeCycleStatusCode() {
        return new CustomerSelectionByLifeCycleStatusCode();
    }

    /**
     * Create an instance of {@link CustomerSelectionByNormalisedFacsimileNumber }
     * 
     */
    public CustomerSelectionByNormalisedFacsimileNumber createCustomerSelectionByNormalisedFacsimileNumber() {
        return new CustomerSelectionByNormalisedFacsimileNumber();
    }

    /**
     * Create an instance of {@link CustomerSelectionByNormalisedTelephoneNumber }
     * 
     */
    public CustomerSelectionByNormalisedTelephoneNumber createCustomerSelectionByNormalisedTelephoneNumber() {
        return new CustomerSelectionByNormalisedTelephoneNumber();
    }

    /**
     * Create an instance of {@link CustomerSelectionByPartyIdentifierTypeCode }
     * 
     */
    public CustomerSelectionByPartyIdentifierTypeCode createCustomerSelectionByPartyIdentifierTypeCode() {
        return new CustomerSelectionByPartyIdentifierTypeCode();
    }

    /**
     * Create an instance of {@link CustomerSelectionByRegionCode }
     * 
     */
    public CustomerSelectionByRegionCode createCustomerSelectionByRegionCode() {
        return new CustomerSelectionByRegionCode();
    }

    /**
     * Create an instance of {@link CustomerSelectionByRoleCode }
     * 
     */
    public CustomerSelectionByRoleCode createCustomerSelectionByRoleCode() {
        return new CustomerSelectionByRoleCode();
    }

    /**
     * Create an instance of {@link CustomerSelectionBySalesOrganisationID }
     * 
     */
    public CustomerSelectionBySalesOrganisationID createCustomerSelectionBySalesOrganisationID() {
        return new CustomerSelectionBySalesOrganisationID();
    }

    /**
     * Create an instance of {@link CustomerSelectionBySortingFormattedName }
     * 
     */
    public CustomerSelectionBySortingFormattedName createCustomerSelectionBySortingFormattedName() {
        return new CustomerSelectionBySortingFormattedName();
    }

    /**
     * Create an instance of {@link CustomerSelectionByStreetPostalCode }
     * 
     */
    public CustomerSelectionByStreetPostalCode createCustomerSelectionByStreetPostalCode() {
        return new CustomerSelectionByStreetPostalCode();
    }

    /**
     * Create an instance of {@link CustomerSelectionByUUID }
     * 
     */
    public CustomerSelectionByUUID createCustomerSelectionByUUID() {
        return new CustomerSelectionByUUID();
    }

    /**
     * Create an instance of {@link AcademicTitleCode }
     * 
     */
    public AcademicTitleCode createAcademicTitleCode() {
        return new AcademicTitleCode();
    }

    /**
     * Create an instance of {@link AddressUsageCode }
     * 
     */
    public AddressUsageCode createAddressUsageCode() {
        return new AddressUsageCode();
    }

    /**
     * Create an instance of {@link Amount }
     * 
     */
    public Amount createAmount() {
        return new Amount();
    }

    /**
     * Create an instance of {@link BUSINESSPARTNERPartyBusinessCharacterCode }
     * 
     */
    public BUSINESSPARTNERPartyBusinessCharacterCode createBUSINESSPARTNERPartyBusinessCharacterCode() {
        return new BUSINESSPARTNERPartyBusinessCharacterCode();
    }

    /**
     * Create an instance of {@link BankBranchID }
     * 
     */
    public BankBranchID createBankBranchID() {
        return new BankBranchID();
    }

    /**
     * Create an instance of {@link BankInternalID }
     * 
     */
    public BankInternalID createBankInternalID() {
        return new BankInternalID();
    }

    /**
     * Create an instance of {@link BusinessPartnerFunctionTypeCode }
     * 
     */
    public BusinessPartnerFunctionTypeCode createBusinessPartnerFunctionTypeCode() {
        return new BusinessPartnerFunctionTypeCode();
    }

    /**
     * Create an instance of {@link BusinessPartnerFunctionalAreaCode }
     * 
     */
    public BusinessPartnerFunctionalAreaCode createBusinessPartnerFunctionalAreaCode() {
        return new BusinessPartnerFunctionalAreaCode();
    }

    /**
     * Create an instance of {@link BusinessPartnerRelationshipRoleCode }
     * 
     */
    public BusinessPartnerRelationshipRoleCode createBusinessPartnerRelationshipRoleCode() {
        return new BusinessPartnerRelationshipRoleCode();
    }

    /**
     * Create an instance of {@link BusinessPartnerRoleCode }
     * 
     */
    public BusinessPartnerRoleCode createBusinessPartnerRoleCode() {
        return new BusinessPartnerRoleCode();
    }

    /**
     * Create an instance of {@link CLOSEDDatePeriod }
     * 
     */
    public CLOSEDDatePeriod createCLOSEDDatePeriod() {
        return new CLOSEDDatePeriod();
    }

    /**
     * Create an instance of {@link CashDiscountTermsCode }
     * 
     */
    public CashDiscountTermsCode createCashDiscountTermsCode() {
        return new CashDiscountTermsCode();
    }

    /**
     * Create an instance of {@link CommunicationMediumTypeCode }
     * 
     */
    public CommunicationMediumTypeCode createCommunicationMediumTypeCode() {
        return new CommunicationMediumTypeCode();
    }

    /**
     * Create an instance of {@link CompanyLegalFormCode }
     * 
     */
    public CompanyLegalFormCode createCompanyLegalFormCode() {
        return new CompanyLegalFormCode();
    }

    /**
     * Create an instance of {@link CompoundServiceInterfaceCode }
     * 
     */
    public CompoundServiceInterfaceCode createCompoundServiceInterfaceCode() {
        return new CompoundServiceInterfaceCode();
    }

    /**
     * Create an instance of {@link CustomerABCClassificationCode }
     * 
     */
    public CustomerABCClassificationCode createCustomerABCClassificationCode() {
        return new CustomerABCClassificationCode();
    }

    /**
     * Create an instance of {@link CustomerGroupCode }
     * 
     */
    public CustomerGroupCode createCustomerGroupCode() {
        return new CustomerGroupCode();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link DistributionChannelCode }
     * 
     */
    public DistributionChannelCode createDistributionChannelCode() {
        return new DistributionChannelCode();
    }

    /**
     * Create an instance of {@link DocumentTypeCode }
     * 
     */
    public DocumentTypeCode createDocumentTypeCode() {
        return new DocumentTypeCode();
    }

    /**
     * Create an instance of {@link EmailURI }
     * 
     */
    public EmailURI createEmailURI() {
        return new EmailURI();
    }

    /**
     * Create an instance of {@link EmployeeID }
     * 
     */
    public EmployeeID createEmployeeID() {
        return new EmployeeID();
    }

    /**
     * Create an instance of {@link FormOfAddressCode }
     * 
     */
    public FormOfAddressCode createFormOfAddressCode() {
        return new FormOfAddressCode();
    }

    /**
     * Create an instance of {@link FormattedAddress }
     * 
     */
    public FormattedAddress createFormattedAddress() {
        return new FormattedAddress();
    }

    /**
     * Create an instance of {@link FormattedPostalAddress }
     * 
     */
    public FormattedPostalAddress createFormattedPostalAddress() {
        return new FormattedPostalAddress();
    }

    /**
     * Create an instance of {@link IdentityID }
     * 
     */
    public IdentityID createIdentityID() {
        return new IdentityID();
    }

    /**
     * Create an instance of {@link Incoterms }
     * 
     */
    public Incoterms createIncoterms() {
        return new Incoterms();
    }

    /**
     * Create an instance of {@link IndustrialSectorCode }
     * 
     */
    public IndustrialSectorCode createIndustrialSectorCode() {
        return new IndustrialSectorCode();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link LogItem }
     * 
     */
    public LogItem createLogItem() {
        return new LogItem();
    }

    /**
     * Create an instance of {@link LogItemCategoryCode }
     * 
     */
    public LogItemCategoryCode createLogItemCategoryCode() {
        return new LogItemCategoryCode();
    }

    /**
     * Create an instance of {@link LogItemNotePlaceholderSubstitutionList }
     * 
     */
    public LogItemNotePlaceholderSubstitutionList createLogItemNotePlaceholderSubstitutionList() {
        return new LogItemNotePlaceholderSubstitutionList();
    }

    /**
     * Create an instance of {@link MaritalStatusCode }
     * 
     */
    public MaritalStatusCode createMaritalStatusCode() {
        return new MaritalStatusCode();
    }

    /**
     * Create an instance of {@link Measure }
     * 
     */
    public Measure createMeasure() {
        return new Measure();
    }

    /**
     * Create an instance of {@link NamespaceURI }
     * 
     */
    public NamespaceURI createNamespaceURI() {
        return new NamespaceURI();
    }

    /**
     * Create an instance of {@link NielsenRegionCode }
     * 
     */
    public NielsenRegionCode createNielsenRegionCode() {
        return new NielsenRegionCode();
    }

    /**
     * Create an instance of {@link ObjectID }
     * 
     */
    public ObjectID createObjectID() {
        return new ObjectID();
    }

    /**
     * Create an instance of {@link OccupationCode }
     * 
     */
    public OccupationCode createOccupationCode() {
        return new OccupationCode();
    }

    /**
     * Create an instance of {@link OutputRequestFormTemplateCode }
     * 
     */
    public OutputRequestFormTemplateCode createOutputRequestFormTemplateCode() {
        return new OutputRequestFormTemplateCode();
    }

    /**
     * Create an instance of {@link PartyIdentifierTypeCode }
     * 
     */
    public PartyIdentifierTypeCode createPartyIdentifierTypeCode() {
        return new PartyIdentifierTypeCode();
    }

    /**
     * Create an instance of {@link PartyTaxID }
     * 
     */
    public PartyTaxID createPartyTaxID() {
        return new PartyTaxID();
    }

    /**
     * Create an instance of {@link PaymentBlockingReasonCode }
     * 
     */
    public PaymentBlockingReasonCode createPaymentBlockingReasonCode() {
        return new PaymentBlockingReasonCode();
    }

    /**
     * Create an instance of {@link PaymentCardBlockingReasonCode }
     * 
     */
    public PaymentCardBlockingReasonCode createPaymentCardBlockingReasonCode() {
        return new PaymentCardBlockingReasonCode();
    }

    /**
     * Create an instance of {@link PaymentCardID }
     * 
     */
    public PaymentCardID createPaymentCardID() {
        return new PaymentCardID();
    }

    /**
     * Create an instance of {@link PaymentCardTypeCode }
     * 
     */
    public PaymentCardTypeCode createPaymentCardTypeCode() {
        return new PaymentCardTypeCode();
    }

    /**
     * Create an instance of {@link QueryProcessingConditions }
     * 
     */
    public QueryProcessingConditions createQueryProcessingConditions() {
        return new QueryProcessingConditions();
    }

    /**
     * Create an instance of {@link RegionCode }
     * 
     */
    public RegionCode createRegionCode() {
        return new RegionCode();
    }

    /**
     * Create an instance of {@link ResponseProcessingConditions }
     * 
     */
    public ResponseProcessingConditions createResponseProcessingConditions() {
        return new ResponseProcessingConditions();
    }

    /**
     * Create an instance of {@link SystemAdministrativeData }
     * 
     */
    public SystemAdministrativeData createSystemAdministrativeData() {
        return new SystemAdministrativeData();
    }

    /**
     * Create an instance of {@link TaxExemptionCertificateID }
     * 
     */
    public TaxExemptionCertificateID createTaxExemptionCertificateID() {
        return new TaxExemptionCertificateID();
    }

    /**
     * Create an instance of {@link TaxExemptionCertificateTypeCode }
     * 
     */
    public TaxExemptionCertificateTypeCode createTaxExemptionCertificateTypeCode() {
        return new TaxExemptionCertificateTypeCode();
    }

    /**
     * Create an instance of {@link TaxExemptionReasonCode }
     * 
     */
    public TaxExemptionReasonCode createTaxExemptionReasonCode() {
        return new TaxExemptionReasonCode();
    }

    /**
     * Create an instance of {@link TaxIdentificationNumberTypeCode }
     * 
     */
    public TaxIdentificationNumberTypeCode createTaxIdentificationNumberTypeCode() {
        return new TaxIdentificationNumberTypeCode();
    }

    /**
     * Create an instance of {@link TaxJurisdictionCode }
     * 
     */
    public TaxJurisdictionCode createTaxJurisdictionCode() {
        return new TaxJurisdictionCode();
    }

    /**
     * Create an instance of {@link TaxPayerCategoryCode }
     * 
     */
    public TaxPayerCategoryCode createTaxPayerCategoryCode() {
        return new TaxPayerCategoryCode();
    }

    /**
     * Create an instance of {@link TaxTypeCode }
     * 
     */
    public TaxTypeCode createTaxTypeCode() {
        return new TaxTypeCode();
    }

    /**
     * Create an instance of {@link TextCollectionTextTypeCode }
     * 
     */
    public TextCollectionTextTypeCode createTextCollectionTextTypeCode() {
        return new TextCollectionTextTypeCode();
    }

    /**
     * Create an instance of {@link UPPEROPENTimePeriod }
     * 
     */
    public UPPEROPENTimePeriod createUPPEROPENTimePeriod() {
        return new UPPEROPENTimePeriod();
    }

    /**
     * Create an instance of {@link URI }
     * 
     */
    public URI createURI() {
        return new URI();
    }

    /**
     * Create an instance of {@link UUID }
     * 
     */
    public UUID createUUID() {
        return new UUID();
    }

    /**
     * Create an instance of {@link VIPReasonCode }
     * 
     */
    public VIPReasonCode createVIPReasonCode() {
        return new VIPReasonCode();
    }

    /**
     * Create an instance of {@link WeekdaySelection }
     * 
     */
    public WeekdaySelection createWeekdaySelection() {
        return new WeekdaySelection();
    }

    /**
     * Create an instance of {@link AccessAttachmentFolder }
     * 
     */
    public AccessAttachmentFolder createAccessAttachmentFolder() {
        return new AccessAttachmentFolder();
    }

    /**
     * Create an instance of {@link AccessAttachmentFolderDocument }
     * 
     */
    public AccessAttachmentFolderDocument createAccessAttachmentFolderDocument() {
        return new AccessAttachmentFolderDocument();
    }

    /**
     * Create an instance of {@link AccessAttachmentFolderDocumentProperty }
     * 
     */
    public AccessAttachmentFolderDocumentProperty createAccessAttachmentFolderDocumentProperty() {
        return new AccessAttachmentFolderDocumentProperty();
    }

    /**
     * Create an instance of {@link AccessAttachmentFolderDocumentPropertyPropertyValue }
     * 
     */
    public AccessAttachmentFolderDocumentPropertyPropertyValue createAccessAttachmentFolderDocumentPropertyPropertyValue() {
        return new AccessAttachmentFolderDocumentPropertyPropertyValue();
    }

    /**
     * Create an instance of {@link AccountDeterminationDebtorGroupCode }
     * 
     */
    public AccountDeterminationDebtorGroupCode createAccountDeterminationDebtorGroupCode() {
        return new AccountDeterminationDebtorGroupCode();
    }

    /**
     * Create an instance of {@link Code }
     * 
     */
    public Code createCode() {
        return new Code();
    }

    /**
     * Create an instance of {@link ExtSelectionByAmount }
     * 
     */
    public ExtSelectionByAmount createExtSelectionByAmount() {
        return new ExtSelectionByAmount();
    }

    /**
     * Create an instance of {@link ExtSelectionByCode }
     * 
     */
    public ExtSelectionByCode createExtSelectionByCode() {
        return new ExtSelectionByCode();
    }

    /**
     * Create an instance of {@link ExtSelectionByDate }
     * 
     */
    public ExtSelectionByDate createExtSelectionByDate() {
        return new ExtSelectionByDate();
    }

    /**
     * Create an instance of {@link ExtSelectionByDecimal }
     * 
     */
    public ExtSelectionByDecimal createExtSelectionByDecimal() {
        return new ExtSelectionByDecimal();
    }

    /**
     * Create an instance of {@link ExtSelectionByIdentifier }
     * 
     */
    public ExtSelectionByIdentifier createExtSelectionByIdentifier() {
        return new ExtSelectionByIdentifier();
    }

    /**
     * Create an instance of {@link ExtSelectionByIndicator }
     * 
     */
    public ExtSelectionByIndicator createExtSelectionByIndicator() {
        return new ExtSelectionByIndicator();
    }

    /**
     * Create an instance of {@link ExtSelectionByLongText }
     * 
     */
    public ExtSelectionByLongText createExtSelectionByLongText() {
        return new ExtSelectionByLongText();
    }

    /**
     * Create an instance of {@link ExtSelectionByMediumText }
     * 
     */
    public ExtSelectionByMediumText createExtSelectionByMediumText() {
        return new ExtSelectionByMediumText();
    }

    /**
     * Create an instance of {@link ExtSelectionByText }
     * 
     */
    public ExtSelectionByText createExtSelectionByText() {
        return new ExtSelectionByText();
    }

    /**
     * Create an instance of {@link XSLTStorageXSLTID }
     * 
     */
    public XSLTStorageXSLTID createXSLTStorageXSLTID() {
        return new XSLTStorageXSLTID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerByCommunicationDataQueryMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerByCommunicationDataQueryMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "CustomerByCommunicationDataQuery_sync")
    public JAXBElement<CustomerByCommunicationDataQueryMessageSync> createCustomerByCommunicationDataQuerySync(CustomerByCommunicationDataQueryMessageSync value) {
        return new JAXBElement<CustomerByCommunicationDataQueryMessageSync>(_CustomerByCommunicationDataQuerySync_QNAME, CustomerByCommunicationDataQueryMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerResponseMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerResponseMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "CustomerByCommunicationDataResponse_sync")
    public JAXBElement<CustomerResponseMessageSync> createCustomerByCommunicationDataResponseSync(CustomerResponseMessageSync value) {
        return new JAXBElement<CustomerResponseMessageSync>(_CustomerByCommunicationDataResponseSync_QNAME, CustomerResponseMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerByElementsQueryMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerByElementsQueryMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "CustomerByElementsQuery_sync")
    public JAXBElement<CustomerByElementsQueryMessageSync> createCustomerByElementsQuerySync(CustomerByElementsQueryMessageSync value) {
        return new JAXBElement<CustomerByElementsQueryMessageSync>(_CustomerByElementsQuerySync_QNAME, CustomerByElementsQueryMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerResponseMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerResponseMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "CustomerByElementsResponse_sync")
    public JAXBElement<CustomerResponseMessageSync> createCustomerByElementsResponseSync(CustomerResponseMessageSync value) {
        return new JAXBElement<CustomerResponseMessageSync>(_CustomerByElementsResponseSync_QNAME, CustomerResponseMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerByIdentificationQueryMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerByIdentificationQueryMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "CustomerByIdentificationQuery_sync")
    public JAXBElement<CustomerByIdentificationQueryMessageSync> createCustomerByIdentificationQuerySync(CustomerByIdentificationQueryMessageSync value) {
        return new JAXBElement<CustomerByIdentificationQueryMessageSync>(_CustomerByIdentificationQuerySync_QNAME, CustomerByIdentificationQueryMessageSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerResponseMessageSync }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerResponseMessageSync }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "CustomerByIdentificationResponse_sync")
    public JAXBElement<CustomerResponseMessageSync> createCustomerByIdentificationResponseSync(CustomerResponseMessageSync value) {
        return new JAXBElement<CustomerResponseMessageSync>(_CustomerByIdentificationResponseSync_QNAME, CustomerResponseMessageSync.class, null, value);
    }

}
