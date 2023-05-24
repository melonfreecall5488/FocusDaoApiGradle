
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
 * CustomerReponseCustomerAddressPostalAddress complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerAddressPostalAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode"/&gt;
 *         &lt;element name="RegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="CountyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalCityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="DistrictName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="StreetPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="CompanyPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="StreetPrefixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalStreetPrefixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://sap.com/xi/AP/Common/GDT}StreetName" minOccurs="0"/&gt;
 *         &lt;element name="StreetSuffixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalStreetSuffixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="HouseID" type="{http://sap.com/xi/AP/Common/GDT}HouseID" minOccurs="0"/&gt;
 *         &lt;element name="CareOfName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingRegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingCityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="POBoxID" type="{http://sap.com/xi/AP/Common/GDT}POBoxID" minOccurs="0"/&gt;
 *         &lt;element name="POBoxIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="TaxJurisdictionCode" type="{http://sap.com/xi/AP/Common/GDT}TaxJurisdictionCode" minOccurs="0"/&gt;
 *         &lt;element name="TimeZoneCode" type="{http://sap.com/xi/AP/Common/GDT}TimeZoneCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerAddressPostalAddress", propOrder = {
        "countryCode",
        "regionCode",
        "countyName",
        "cityName",
        "additionalCityName",
        "districtName",
        "streetPostalCode",
        "poBoxPostalCode",
        "companyPostalCode",
        "streetPrefixName",
        "additionalStreetPrefixName",
        "streetName",
        "streetSuffixName",
        "additionalStreetSuffixName",
        "houseID",
        "careOfName",
        "poBoxDeviatingCountryCode",
        "poBoxDeviatingRegionCode",
        "poBoxDeviatingCityName",
        "poBoxID",
        "poBoxIndicator",
        "taxJurisdictionCode",
        "timeZoneCode"
})
public class CustomerReponseCustomerAddressPostalAddress {

    @XmlElement(name = "CountryCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "RegionCode")
    protected RegionCode regionCode;
    @XmlElement(name = "CountyName")
    protected String countyName;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "AdditionalCityName")
    protected String additionalCityName;
    @XmlElement(name = "DistrictName")
    protected String districtName;
    @XmlElement(name = "StreetPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String streetPostalCode;
    @XmlElement(name = "POBoxPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxPostalCode;
    @XmlElement(name = "CompanyPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyPostalCode;
    @XmlElement(name = "StreetPrefixName")
    protected String streetPrefixName;
    @XmlElement(name = "AdditionalStreetPrefixName")
    protected String additionalStreetPrefixName;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "StreetSuffixName")
    protected String streetSuffixName;
    @XmlElement(name = "AdditionalStreetSuffixName")
    protected String additionalStreetSuffixName;
    @XmlElement(name = "HouseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String houseID;
    @XmlElement(name = "CareOfName")
    protected String careOfName;
    @XmlElement(name = "POBoxDeviatingCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxDeviatingCountryCode;
    @XmlElement(name = "POBoxDeviatingRegionCode")
    protected RegionCode poBoxDeviatingRegionCode;
    @XmlElement(name = "POBoxDeviatingCityName")
    protected String poBoxDeviatingCityName;
    @XmlElement(name = "POBoxID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxID;
    @XmlElement(name = "POBoxIndicator")
    protected Boolean poBoxIndicator;
    @XmlElement(name = "TaxJurisdictionCode")
    protected TaxJurisdictionCode taxJurisdictionCode;
    @XmlElement(name = "TimeZoneCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeZoneCode;

    /**
     * countryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * countryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * regionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link RegionCode }
     * 
     */
    public RegionCode getRegionCode() {
        return regionCode;
    }

    /**
     * regionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link RegionCode }
     * 
     */
    public void setRegionCode(RegionCode value) {
        this.regionCode = value;
    }

    /**
     * countyName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCountyName() {
        return countyName;
    }

    /**
     * countyName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCountyName(String value) {
        this.countyName = value;
    }

    /**
     * cityName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * cityName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * additionalCityName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getAdditionalCityName() {
        return additionalCityName;
    }

    /**
     * additionalCityName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setAdditionalCityName(String value) {
        this.additionalCityName = value;
    }

    /**
     * districtName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * districtName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }

    /**
     * streetPostalCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getStreetPostalCode() {
        return streetPostalCode;
    }

    /**
     * streetPostalCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setStreetPostalCode(String value) {
        this.streetPostalCode = value;
    }

    /**
     * poBoxPostalCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPOBoxPostalCode() {
        return poBoxPostalCode;
    }

    /**
     * poBoxPostalCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPOBoxPostalCode(String value) {
        this.poBoxPostalCode = value;
    }

    /**
     * companyPostalCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCompanyPostalCode() {
        return companyPostalCode;
    }

    /**
     * companyPostalCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCompanyPostalCode(String value) {
        this.companyPostalCode = value;
    }

    /**
     * streetPrefixName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getStreetPrefixName() {
        return streetPrefixName;
    }

    /**
     * streetPrefixName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setStreetPrefixName(String value) {
        this.streetPrefixName = value;
    }

    /**
     * additionalStreetPrefixName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getAdditionalStreetPrefixName() {
        return additionalStreetPrefixName;
    }

    /**
     * additionalStreetPrefixName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setAdditionalStreetPrefixName(String value) {
        this.additionalStreetPrefixName = value;
    }

    /**
     * streetName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * streetName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * streetSuffixName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getStreetSuffixName() {
        return streetSuffixName;
    }

    /**
     * streetSuffixName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setStreetSuffixName(String value) {
        this.streetSuffixName = value;
    }

    /**
     * additionalStreetSuffixName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getAdditionalStreetSuffixName() {
        return additionalStreetSuffixName;
    }

    /**
     * additionalStreetSuffixName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setAdditionalStreetSuffixName(String value) {
        this.additionalStreetSuffixName = value;
    }

    /**
     * houseID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getHouseID() {
        return houseID;
    }

    /**
     * houseID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setHouseID(String value) {
        this.houseID = value;
    }

    /**
     * careOfName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCareOfName() {
        return careOfName;
    }

    /**
     * careOfName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCareOfName(String value) {
        this.careOfName = value;
    }

    /**
     * poBoxDeviatingCountryCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPOBoxDeviatingCountryCode() {
        return poBoxDeviatingCountryCode;
    }

    /**
     * poBoxDeviatingCountryCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPOBoxDeviatingCountryCode(String value) {
        this.poBoxDeviatingCountryCode = value;
    }

    /**
     * poBoxDeviatingRegionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link RegionCode }
     * 
     */
    public RegionCode getPOBoxDeviatingRegionCode() {
        return poBoxDeviatingRegionCode;
    }

    /**
     * poBoxDeviatingRegionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link RegionCode }
     * 
     */
    public void setPOBoxDeviatingRegionCode(RegionCode value) {
        this.poBoxDeviatingRegionCode = value;
    }

    /**
     * poBoxDeviatingCityName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPOBoxDeviatingCityName() {
        return poBoxDeviatingCityName;
    }

    /**
     * poBoxDeviatingCityName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPOBoxDeviatingCityName(String value) {
        this.poBoxDeviatingCityName = value;
    }

    /**
     * poBoxID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getPOBoxID() {
        return poBoxID;
    }

    /**
     * poBoxID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setPOBoxID(String value) {
        this.poBoxID = value;
    }

    /**
     * poBoxIndicator 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isPOBoxIndicator() {
        return poBoxIndicator;
    }

    /**
     * poBoxIndicator 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setPOBoxIndicator(Boolean value) {
        this.poBoxIndicator = value;
    }

    /**
     * taxJurisdictionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link TaxJurisdictionCode }
     * 
     */
    public TaxJurisdictionCode getTaxJurisdictionCode() {
        return taxJurisdictionCode;
    }

    /**
     * taxJurisdictionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link TaxJurisdictionCode }
     * 
     */
    public void setTaxJurisdictionCode(TaxJurisdictionCode value) {
        this.taxJurisdictionCode = value;
    }

    /**
     * timeZoneCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getTimeZoneCode() {
        return timeZoneCode;
    }

    /**
     * timeZoneCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setTimeZoneCode(String value) {
        this.timeZoneCode = value;
    }

}
