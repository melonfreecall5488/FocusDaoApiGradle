
package com.smart.focus.ceoapi.wsdl2.product_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * InspectionSamplingDetails complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="InspectionSamplingDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductId" type="{http://sap.com/xi/AP/Common/GDT}ProductID" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{http://sap.com/xi/AP/Common/GDT}LANGUAGEINDEPENDENT_SHORT_Description" minOccurs="0"/&gt;
 *         &lt;element name="IdentifiedStockId" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockID" minOccurs="0"/&gt;
 *         &lt;element name="IdentifiedStockType" type="{http://sap.com/xi/AP/Common/GDT}IdentifiedStockTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="LotQuantity" type="{http://sap.com/xi/AP/Common/GDT}NONNEGATIVE_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="LotSize" type="{http://sap.com/xi/AP/Common/GDT}NONNEGATIVE_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="SampleSize" type="{http://sap.com/xi/AP/Common/GDT}NONNEGATIVE_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="SampleQuantity" type="{http://sap.com/xi/AP/Common/GDT}NONNEGATIVE_Quantity" minOccurs="0"/&gt;
 *         &lt;element name="SampleRecords" type="{http://sap.com/xi/AP/Common/GDT}Indicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InspectionSamplingDetails", propOrder = {
        "productId",
        "productDescription",
        "identifiedStockId",
        "identifiedStockType",
        "lotQuantity",
        "lotSize",
        "sampleSize",
        "sampleQuantity",
        "sampleRecords"
})
public class InspectionSamplingDetails {

    @XmlElement(name = "ProductId")
    protected ProductID productId;
    @XmlElement(name = "ProductDescription")
    protected String productDescription;
    @XmlElement(name = "IdentifiedStockId")
    protected IdentifiedStockID identifiedStockId;
    @XmlElement(name = "IdentifiedStockType")
    protected IdentifiedStockTypeCode identifiedStockType;
    @XmlElement(name = "LotQuantity")
    protected NONNEGATIVEQuantity lotQuantity;
    @XmlElement(name = "LotSize")
    protected NONNEGATIVEQuantity lotSize;
    @XmlElement(name = "SampleSize")
    protected NONNEGATIVEQuantity sampleSize;
    @XmlElement(name = "SampleQuantity")
    protected NONNEGATIVEQuantity sampleQuantity;
    @XmlElement(name = "SampleRecords")
    protected Boolean sampleRecords;

    /**
     * productId 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductID }
     * 
     */
    public ProductID getProductId() {
        return productId;
    }

    /**
     * productId 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductID }
     * 
     */
    public void setProductId(ProductID value) {
        this.productId = value;
    }

    /**
     * productDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * productDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * identifiedStockId 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link IdentifiedStockID }
     * 
     */
    public IdentifiedStockID getIdentifiedStockId() {
        return identifiedStockId;
    }

    /**
     * identifiedStockId 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link IdentifiedStockID }
     * 
     */
    public void setIdentifiedStockId(IdentifiedStockID value) {
        this.identifiedStockId = value;
    }

    /**
     * identifiedStockType 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link IdentifiedStockTypeCode }
     * 
     */
    public IdentifiedStockTypeCode getIdentifiedStockType() {
        return identifiedStockType;
    }

    /**
     * identifiedStockType 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link IdentifiedStockTypeCode }
     * 
     */
    public void setIdentifiedStockType(IdentifiedStockTypeCode value) {
        this.identifiedStockType = value;
    }

    /**
     * lotQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link NONNEGATIVEQuantity }
     * 
     */
    public NONNEGATIVEQuantity getLotQuantity() {
        return lotQuantity;
    }

    /**
     * lotQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link NONNEGATIVEQuantity }
     * 
     */
    public void setLotQuantity(NONNEGATIVEQuantity value) {
        this.lotQuantity = value;
    }

    /**
     * lotSize 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link NONNEGATIVEQuantity }
     * 
     */
    public NONNEGATIVEQuantity getLotSize() {
        return lotSize;
    }

    /**
     * lotSize 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link NONNEGATIVEQuantity }
     * 
     */
    public void setLotSize(NONNEGATIVEQuantity value) {
        this.lotSize = value;
    }

    /**
     * sampleSize 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link NONNEGATIVEQuantity }
     * 
     */
    public NONNEGATIVEQuantity getSampleSize() {
        return sampleSize;
    }

    /**
     * sampleSize 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link NONNEGATIVEQuantity }
     * 
     */
    public void setSampleSize(NONNEGATIVEQuantity value) {
        this.sampleSize = value;
    }

    /**
     * sampleQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link NONNEGATIVEQuantity }
     * 
     */
    public NONNEGATIVEQuantity getSampleQuantity() {
        return sampleQuantity;
    }

    /**
     * sampleQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link NONNEGATIVEQuantity }
     * 
     */
    public void setSampleQuantity(NONNEGATIVEQuantity value) {
        this.sampleQuantity = value;
    }

    /**
     * sampleRecords 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Boolean }
     * 
     */
    public Boolean isSampleRecords() {
        return sampleRecords;
    }

    /**
     * sampleRecords 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Boolean }
     * 
     */
    public void setSampleRecords(Boolean value) {
        this.sampleRecords = value;
    }

}
