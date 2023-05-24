
package com.smart.focus.ceoapi.wsdl2.goodsMovementCEO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GoodsMovementCBOReadByIDQueryMessage_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GoodsMovementCBOReadByIDQueryMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GoodsMovementCBO" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOReadByIDQuery"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsMovementCBOReadByIDQueryMessage_sync", propOrder = {
    "goodsMovementCBO"
})
public class GoodsMovementCBOReadByIDQueryMessageSync {

    @XmlElement(name = "GoodsMovementCBO", required = true)
    protected GoodsMovementCBOReadByIDQuery goodsMovementCBO;

    /**
     * goodsMovementCBO 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GoodsMovementCBOReadByIDQuery }
     *     
     */
    public GoodsMovementCBOReadByIDQuery getGoodsMovementCBO() {
        return goodsMovementCBO;
    }

    /**
     * goodsMovementCBO 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsMovementCBOReadByIDQuery }
     *     
     */
    public void setGoodsMovementCBO(GoodsMovementCBOReadByIDQuery value) {
        this.goodsMovementCBO = value;
    }

}
