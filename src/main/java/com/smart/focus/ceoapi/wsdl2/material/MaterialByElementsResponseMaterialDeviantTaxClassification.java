
package com.smart.focus.ceoapi.wsdl2.material;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * MaterialByElementsResponseMaterialDeviantTaxClassification complex type에 대한
 * Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialDeviantTaxClassification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCode" type="{http://sap.com/xi/AP/Common/GDT}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://sap.com/xi/AP/Common/GDT}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxRateTypeCode" type="{http://sap.com/xi/AP/Common/GDT}TaxRateTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemptionReasonCode" type="{http://sap.com/xi/AP/Common/GDT}TaxExemptionReasonCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialDeviantTaxClassification", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "countryCode",
        "regionCode",
        "taxTypeCode",
        "taxRateTypeCode",
        "taxExemptionReasonCode"
})
public class MaterialByElementsResponseMaterialDeviantTaxClassification {

    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "RegionCode")
    protected RegionCode regionCode;
    @XmlElement(name = "TaxTypeCode")
    protected TaxTypeCode taxTypeCode;
    @XmlElement(name = "TaxRateTypeCode")
    protected TaxRateTypeCode taxRateTypeCode;
    @XmlElement(name = "TaxExemptionReasonCode")
    protected TaxExemptionReasonCode taxExemptionReasonCode;

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
     * taxTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link TaxTypeCode }
     * 
     */
    public TaxTypeCode getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * taxTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link TaxTypeCode }
     * 
     */
    public void setTaxTypeCode(TaxTypeCode value) {
        this.taxTypeCode = value;
    }

    /**
     * taxRateTypeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link TaxRateTypeCode }
     * 
     */
    public TaxRateTypeCode getTaxRateTypeCode() {
        return taxRateTypeCode;
    }

    /**
     * taxRateTypeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link TaxRateTypeCode }
     * 
     */
    public void setTaxRateTypeCode(TaxRateTypeCode value) {
        this.taxRateTypeCode = value;
    }

    /**
     * taxExemptionReasonCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link TaxExemptionReasonCode }
     * 
     */
    public TaxExemptionReasonCode getTaxExemptionReasonCode() {
        return taxExemptionReasonCode;
    }

    /**
     * taxExemptionReasonCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link TaxExemptionReasonCode }
     * 
     */
    public void setTaxExemptionReasonCode(TaxExemptionReasonCode value) {
        this.taxExemptionReasonCode = value;
    }

}
