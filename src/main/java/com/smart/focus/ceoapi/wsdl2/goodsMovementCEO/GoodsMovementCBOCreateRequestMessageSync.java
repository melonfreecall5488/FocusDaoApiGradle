
package com.smart.focus.ceoapi.wsdl2.goodsMovementCEO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GoodsMovementCBOCreateRequestMessage_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="GoodsMovementCBOCreateRequestMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasicMessageHeader" type="{http://sap.com/xi/AP/Common/GDT}BusinessDocumentBasicMessageHeader"/&gt;
 *         &lt;element name="GoodsMovementCBO" type="{http://0027131779-one-off.sap.com/YHXNC1Z4Y_}GoodsMovementCBOCreateRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsMovementCBOCreateRequestMessage_sync", propOrder = {
    "basicMessageHeader",
    "goodsMovementCBO"
})
public class GoodsMovementCBOCreateRequestMessageSync {

    @XmlElement(name = "BasicMessageHeader", required = true)
    protected BusinessDocumentBasicMessageHeader basicMessageHeader;
    @XmlElement(name = "GoodsMovementCBO", required = true)
    protected GoodsMovementCBOCreateRequest goodsMovementCBO;

    /**
     * basicMessageHeader 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentBasicMessageHeader }
     *     
     */
    public BusinessDocumentBasicMessageHeader getBasicMessageHeader() {
        return basicMessageHeader;
    }

    /**
     * basicMessageHeader 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentBasicMessageHeader }
     *     
     */
    public void setBasicMessageHeader(BusinessDocumentBasicMessageHeader value) {
        this.basicMessageHeader = value;
    }

    /**
     * goodsMovementCBO 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link GoodsMovementCBOCreateRequest }
     *     
     */
    public GoodsMovementCBOCreateRequest getGoodsMovementCBO() {
        return goodsMovementCBO;
    }

    /**
     * goodsMovementCBO 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsMovementCBOCreateRequest }
     *     
     */
    public void setGoodsMovementCBO(GoodsMovementCBOCreateRequest value) {
        this.goodsMovementCBO = value;
    }

}
