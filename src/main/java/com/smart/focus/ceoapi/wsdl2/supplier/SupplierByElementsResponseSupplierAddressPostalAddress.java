
package com.smart.focus.ceoapi.wsdl2.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * SupplierByElementsResponseSupplierAddressPostalAddress complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SupplierByElementsResponseSupplierAddressPostalAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="CareOfName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="StreetPrefixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalStreetPrefixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://sap.com/xi/AP/Common/GDT}StreetName" minOccurs="0"/&gt;
 *         &lt;element name="HouseID" type="{http://sap.com/xi/AP/Common/GDT}HouseID" minOccurs="0"/&gt;
 *         &lt;element name="StreetSuffixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalStreetSuffixName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="StreetPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalCityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="DistrictName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="CountyName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="CompanyPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="POBoxID" type="{http://sap.com/xi/AP/Common/GDT}POBoxID" minOccurs="0"/&gt;
 *         &lt;element name="POBoxPostalCode" type="{http://sap.com/xi/AP/Common/GDT}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingCountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingCityName" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="POBoxDeviatingRegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
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
@XmlType(name = "SupplierByElementsResponseSupplierAddressPostalAddress", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "countryCode",
        "careOfName",
        "streetPrefixName",
        "additionalStreetPrefixName",
        "streetName",
        "houseID",
        "streetSuffixName",
        "additionalStreetSuffixName",
        "cityName",
        "regionCode",
        "streetPostalCode",
        "additionalCityName",
        "districtName",
        "countyName",
        "companyPostalCode",
        "poBoxIndicator",
        "poBoxID",
        "poBoxPostalCode",
        "poBoxDeviatingCountryCode",
        "poBoxDeviatingCityName",
        "poBoxDeviatingRegionCode",
        "taxJurisdictionCode",
        "timeZoneCode"
})
public class SupplierByElementsResponseSupplierAddressPostalAddress {

    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "CareOfName")
    protected String careOfName;
    @XmlElement(name = "StreetPrefixName")
    protected String streetPrefixName;
    @XmlElement(name = "AdditionalStreetPrefixName")
    protected String additionalStreetPrefixName;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "HouseID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String houseID;
    @XmlElement(name = "StreetSuffixName")
    protected String streetSuffixName;
    @XmlElement(name = "AdditionalStreetSuffixName")
    protected String additionalStreetSuffixName;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "RegionCode")
    protected RegionCode regionCode;
    @XmlElement(name = "StreetPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String streetPostalCode;
    @XmlElement(name = "AdditionalCityName")
    protected String additionalCityName;
    @XmlElement(name = "DistrictName")
    protected String districtName;
    @XmlElement(name = "CountyName")
    protected String countyName;
    @XmlElement(name = "CompanyPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyPostalCode;
    @XmlElement(name = "POBoxIndicator")
    protected Boolean poBoxIndicator;
    @XmlElement(name = "POBoxID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxID;
    @XmlElement(name = "POBoxPostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxPostalCode;
    @XmlElement(name = "POBoxDeviatingCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxDeviatingCountryCode;
    @XmlElement(name = "POBoxDeviatingCityName")
    protected String poBoxDeviatingCityName;
    @XmlElement(name = "POBoxDeviatingRegionCode")
    protected RegionCode poBoxDeviatingRegionCode;
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
