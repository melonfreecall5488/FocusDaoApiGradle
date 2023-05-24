
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
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * CustomerReponseCustomerPaymentData complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerPaymentData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyID" type="{http://sap.com/xi/AP/Common/GDT}OrganisationalCentreID"/&gt;
 *         &lt;element name="UUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="AccountDeterminationDebtorGroupCode" type="{http://sap.com/xi/AP/FinancialAccounting/Global}AccountDeterminationDebtorGroupCode" minOccurs="0"/&gt;
 *         &lt;element name="AccountDebtorExternalID" type="{http://sap.com/xi/AP/Common/GDT}PartyPartyID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBlockingReasonCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentBlockingReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBlockExpirationDateTime" type="{http://sap.com/xi/BASIS/Global}GLOBAL_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="PaymentForm" type="{http://sap.com/xi/A1S/Global}CustomerReponseCustomerPaymentDataPaymentForm" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CreditLimitAmount" type="{http://sap.com/xi/AP/Common/GDT}Amount" minOccurs="0"/&gt;
 *         &lt;element name="DirectDebitBankDetailsID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerBankDetailsID" minOccurs="0"/&gt;
 *         &lt;element name="DirectDebitValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardDetailsID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerPaymentCardDetailsID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardValidityPeriod" type="{http://sap.com/xi/AP/Common/GDT}CLOSED_DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="BillOfExchangeBankDetailsID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerBankDetailsID" minOccurs="0"/&gt;
 *         &lt;element name="PaymentAdviceRequiredIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="FirstPaymentInstructionCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentInstructionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="SecondPaymentInstructionCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentInstructionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="ThirdPaymentInstructionCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentInstructionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="FourthPaymentInstructionCode" type="{http://sap.com/xi/AP/Common/GDT}PaymentInstructionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="BankChargeBearerCode" type="{http://sap.com/xi/AP/Common/GDT}BankChargeBearerCode" minOccurs="0"/&gt;
 *         &lt;element name="SinglePaymentIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;group ref="{http://sap.com/xi/AP/Globalization}CustomerPaymentDataQueryExtensionElements"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerPaymentData", propOrder = {
        "companyID",
        "uuid",
        "accountDeterminationDebtorGroupCode",
        "accountDebtorExternalID",
        "paymentBlockingReasonCode",
        "paymentBlockExpirationDateTime",
        "paymentForm",
        "creditLimitAmount",
        "directDebitBankDetailsID",
        "directDebitValidityPeriod",
        "paymentCardDetailsID",
        "paymentCardValidityPeriod",
        "billOfExchangeBankDetailsID",
        "paymentAdviceRequiredIndicator",
        "firstPaymentInstructionCode",
        "secondPaymentInstructionCode",
        "thirdPaymentInstructionCode",
        "fourthPaymentInstructionCode",
        "bankChargeBearerCode",
        "singlePaymentIndicator",
        "virtualAccountID"
})
public class CustomerReponseCustomerPaymentData {

    @XmlElement(name = "CompanyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyID;
    @XmlElement(name = "UUID")
    protected UUID uuid;
    @XmlElement(name = "AccountDeterminationDebtorGroupCode")
    protected AccountDeterminationDebtorGroupCode accountDeterminationDebtorGroupCode;
    @XmlElement(name = "AccountDebtorExternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountDebtorExternalID;
    @XmlElement(name = "PaymentBlockingReasonCode")
    protected PaymentBlockingReasonCode paymentBlockingReasonCode;
    @XmlElement(name = "PaymentBlockExpirationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentBlockExpirationDateTime;
    @XmlElement(name = "PaymentForm")
    protected List<CustomerReponseCustomerPaymentDataPaymentForm> paymentForm;
    @XmlElement(name = "CreditLimitAmount")
    protected Amount creditLimitAmount;
    @XmlElement(name = "DirectDebitBankDetailsID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String directDebitBankDetailsID;
    @XmlElement(name = "DirectDebitValidityPeriod")
    protected CLOSEDDatePeriod directDebitValidityPeriod;
    @XmlElement(name = "PaymentCardDetailsID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentCardDetailsID;
    @XmlElement(name = "PaymentCardValidityPeriod")
    protected CLOSEDDatePeriod paymentCardValidityPeriod;
    @XmlElement(name = "BillOfExchangeBankDetailsID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String billOfExchangeBankDetailsID;
    @XmlElement(name = "PaymentAdviceRequiredIndicator")
    protected Boolean paymentAdviceRequiredIndicator;
    @XmlElement(name = "FirstPaymentInstructionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstPaymentInstructionCode;
    @XmlElement(name = "SecondPaymentInstructionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String secondPaymentInstructionCode;
    @XmlElement(name = "ThirdPaymentInstructionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String thirdPaymentInstructionCode;
    @XmlElement(name = "FourthPaymentInstructionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fourthPaymentInstructionCode;
    @XmlElement(name = "BankChargeBearerCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankChargeBearerCode;
    @XmlElement(name = "SinglePaymentIndicator")
    protected Boolean singlePaymentIndicator;
    @XmlElement(name = "VirtualAccountID", namespace = "http://sap.com/xi/AP/Globalization")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String virtualAccountID;

    /**
     * companyID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * companyID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCompanyID(String value) {
        this.companyID = value;
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
     * accountDeterminationDebtorGroupCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link AccountDeterminationDebtorGroupCode }
     * 
     */
    public AccountDeterminationDebtorGroupCode getAccountDeterminationDebtorGroupCode() {
        return accountDeterminationDebtorGroupCode;
    }

    /**
     * accountDeterminationDebtorGroupCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link AccountDeterminationDebtorGroupCode }
     * 
     */
    public void setAccountDeterminationDebtorGroupCode(AccountDeterminationDebtorGroupCode value) {
        this.accountDeterminationDebtorGroupCode = value;
    }

    /**
     * accountDebtorExternalID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getAccountDebtorExternalID() {
        return accountDebtorExternalID;
    }

    /**
     * accountDebtorExternalID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setAccountDebtorExternalID(String value) {
        this.accountDebtorExternalID = value;
    }

    /**
     * paymentBlockingReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link PaymentBlockingReasonCode }
     * 
     */
    public PaymentBlockingReasonCode getPaymentBlockingReasonCode() {
        return paymentBlockingReasonCode;
    }

    /**
     * paymentBlockingReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link PaymentBlockingReasonCode }
     * 
     */
    public void setPaymentBlockingReasonCode(PaymentBlockingReasonCode value) {
        this.paymentBlockingReasonCode = value;
    }

    /**
     * paymentBlockExpirationDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getPaymentBlockExpirationDateTime() {
        return paymentBlockExpirationDateTime;
    }

    /**
     * paymentBlockExpirationDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link XMLGregorianCalendar }
     * 
     */
    public void setPaymentBlockExpirationDateTime(XMLGregorianCalendar value) {
        this.paymentBlockExpirationDateTime = value;
    }

    /**
     * Gets the value of the paymentForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentForm
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getPaymentForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerReponseCustomerPaymentDataPaymentForm }
     * 
     * 
     */
    public List<CustomerReponseCustomerPaymentDataPaymentForm> getPaymentForm() {
        if (paymentForm == null) {
            paymentForm = new ArrayList<CustomerReponseCustomerPaymentDataPaymentForm>();
        }
        return this.paymentForm;
    }

    /**
     * creditLimitAmount 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Amount }
     * 
     */
    public Amount getCreditLimitAmount() {
        return creditLimitAmount;
    }

    /**
     * creditLimitAmount 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Amount }
     * 
     */
    public void setCreditLimitAmount(Amount value) {
        this.creditLimitAmount = value;
    }

    /**
     * directDebitBankDetailsID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDirectDebitBankDetailsID() {
        return directDebitBankDetailsID;
    }

    /**
     * directDebitBankDetailsID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDirectDebitBankDetailsID(String value) {
        this.directDebitBankDetailsID = value;
    }

    /**
     * directDebitValidityPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CLOSEDDatePeriod }
     * 
     */
    public CLOSEDDatePeriod getDirectDebitValidityPeriod() {
        return directDebitValidityPeriod;
    }

    /**
     * directDebitValidityPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CLOSEDDatePeriod }
     * 
     */
    public void setDirectDebitValidityPeriod(CLOSEDDatePeriod value) {
        this.directDebitValidityPeriod = value;
    }

    /**
     * paymentCardDetailsID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPaymentCardDetailsID() {
        return paymentCardDetailsID;
    }

    /**
     * paymentCardDetailsID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPaymentCardDetailsID(String value) {
        this.paymentCardDetailsID = value;
    }

    /**
     * paymentCardValidityPeriod 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link CLOSEDDatePeriod }
     * 
     */
    public CLOSEDDatePeriod getPaymentCardValidityPeriod() {
        return paymentCardValidityPeriod;
    }

    /**
     * paymentCardValidityPeriod 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link CLOSEDDatePeriod }
     * 
     */
    public void setPaymentCardValidityPeriod(CLOSEDDatePeriod value) {
        this.paymentCardValidityPeriod = value;
    }

    /**
     * billOfExchangeBankDetailsID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getBillOfExchangeBankDetailsID() {
        return billOfExchangeBankDetailsID;
    }

    /**
     * billOfExchangeBankDetailsID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setBillOfExchangeBankDetailsID(String value) {
        this.billOfExchangeBankDetailsID = value;
    }

    /**
     * paymentAdviceRequiredIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isPaymentAdviceRequiredIndicator() {
        return paymentAdviceRequiredIndicator;
    }

    /**
     * paymentAdviceRequiredIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setPaymentAdviceRequiredIndicator(Boolean value) {
        this.paymentAdviceRequiredIndicator = value;
    }

    /**
     * firstPaymentInstructionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFirstPaymentInstructionCode() {
        return firstPaymentInstructionCode;
    }

    /**
     * firstPaymentInstructionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setFirstPaymentInstructionCode(String value) {
        this.firstPaymentInstructionCode = value;
    }

    /**
     * secondPaymentInstructionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getSecondPaymentInstructionCode() {
        return secondPaymentInstructionCode;
    }

    /**
     * secondPaymentInstructionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setSecondPaymentInstructionCode(String value) {
        this.secondPaymentInstructionCode = value;
    }

    /**
     * thirdPaymentInstructionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getThirdPaymentInstructionCode() {
        return thirdPaymentInstructionCode;
    }

    /**
     * thirdPaymentInstructionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setThirdPaymentInstructionCode(String value) {
        this.thirdPaymentInstructionCode = value;
    }

    /**
     * fourthPaymentInstructionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFourthPaymentInstructionCode() {
        return fourthPaymentInstructionCode;
    }

    /**
     * fourthPaymentInstructionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setFourthPaymentInstructionCode(String value) {
        this.fourthPaymentInstructionCode = value;
    }

    /**
     * bankChargeBearerCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getBankChargeBearerCode() {
        return bankChargeBearerCode;
    }

    /**
     * bankChargeBearerCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setBankChargeBearerCode(String value) {
        this.bankChargeBearerCode = value;
    }

    /**
     * singlePaymentIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isSinglePaymentIndicator() {
        return singlePaymentIndicator;
    }

    /**
     * singlePaymentIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setSinglePaymentIndicator(Boolean value) {
        this.singlePaymentIndicator = value;
    }

    /**
     * virtualAccountID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getVirtualAccountID() {
        return virtualAccountID;
    }

    /**
     * virtualAccountID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setVirtualAccountID(String value) {
        this.virtualAccountID = value;
    }

}
