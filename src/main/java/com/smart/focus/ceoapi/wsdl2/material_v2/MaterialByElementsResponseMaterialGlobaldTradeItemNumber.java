
package com.smart.focus.ceoapi.wsdl2.material_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MaterialByElementsResponseMaterialGlobaldTradeItemNumber complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsResponseMaterialGlobaldTradeItemNumber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TradingUnitCode" type="{http://sap.com/xi/AP/Common/GDT}QuantityTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="GlobalTradeID" type="{http://sap.com/xi/AP/Common/GDT}ProductStandardID_V1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsResponseMaterialGlobaldTradeItemNumber", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
    "tradingUnitCode",
    "globalTradeID"
})
public class MaterialByElementsResponseMaterialGlobaldTradeItemNumber {

    @XmlElement(name = "TradingUnitCode")
    protected QuantityTypeCode tradingUnitCode;
    @XmlElement(name = "GlobalTradeID")
    protected ProductStandardIDV1 globalTradeID;

    /**
     * tradingUnitCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTypeCode }
     *     
     */
    public QuantityTypeCode getTradingUnitCode() {
        return tradingUnitCode;
    }

    /**
     * tradingUnitCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTypeCode }
     *     
     */
    public void setTradingUnitCode(QuantityTypeCode value) {
        this.tradingUnitCode = value;
    }

    /**
     * globalTradeID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ProductStandardIDV1 }
     *     
     */
    public ProductStandardIDV1 getGlobalTradeID() {
        return globalTradeID;
    }

    /**
     * globalTradeID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStandardIDV1 }
     *     
     */
    public void setGlobalTradeID(ProductStandardIDV1 value) {
        this.globalTradeID = value;
    }

}
