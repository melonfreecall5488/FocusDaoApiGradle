
package com.smart.focus.ceoapi.wsdl2.consumptionCostCEO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ConsumptionCostCBOReadByIDQueryMessage_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ConsumptionCostCBOReadByIDQueryMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsumptionCostCBO" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}ConsumptionCostCBOReadByIDQuery"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumptionCostCBOReadByIDQueryMessage_sync", propOrder = {
    "consumptionCostCBO"
})
public class ConsumptionCostCBOReadByIDQueryMessageSync {

    @XmlElement(name = "ConsumptionCostCBO", required = true)
    protected ConsumptionCostCBOReadByIDQuery consumptionCostCBO;

    /**
     * consumptionCostCBO 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ConsumptionCostCBOReadByIDQuery }
     *     
     */
    public ConsumptionCostCBOReadByIDQuery getConsumptionCostCBO() {
        return consumptionCostCBO;
    }

    /**
     * consumptionCostCBO 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumptionCostCBOReadByIDQuery }
     *     
     */
    public void setConsumptionCostCBO(ConsumptionCostCBOReadByIDQuery value) {
        this.consumptionCostCBO = value;
    }

}
