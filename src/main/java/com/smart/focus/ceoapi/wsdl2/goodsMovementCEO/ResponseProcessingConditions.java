
package com.smart.focus.ceoapi.wsdl2.goodsMovementCEO;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResponseProcessingConditions complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ResponseProcessingConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnedQueryHitsNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue"/&gt;
 *         &lt;element name="MoreHitsAvailableIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator"/&gt;
 *         &lt;element name="LastReturnedObjectID" type="{http://sap.com/xi/AP/Common/GDT}ObjectID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseProcessingConditions", namespace = "http://sap.com/xi/AP/Common/GDT", propOrder = {
    "returnedQueryHitsNumberValue",
    "moreHitsAvailableIndicator",
    "lastReturnedObjectID"
})
public class ResponseProcessingConditions {

    @XmlElement(name = "ReturnedQueryHitsNumberValue")
    protected int returnedQueryHitsNumberValue;
    @XmlElement(name = "MoreHitsAvailableIndicator")
    protected boolean moreHitsAvailableIndicator;
    @XmlElement(name = "LastReturnedObjectID")
    protected ObjectID lastReturnedObjectID;

    /**
     * returnedQueryHitsNumberValue 속성의 값을 가져옵니다.
     * 
     */
    public int getReturnedQueryHitsNumberValue() {
        return returnedQueryHitsNumberValue;
    }

    /**
     * returnedQueryHitsNumberValue 속성의 값을 설정합니다.
     * 
     */
    public void setReturnedQueryHitsNumberValue(int value) {
        this.returnedQueryHitsNumberValue = value;
    }

    /**
     * moreHitsAvailableIndicator 속성의 값을 가져옵니다.
     * 
     */
    public boolean isMoreHitsAvailableIndicator() {
        return moreHitsAvailableIndicator;
    }

    /**
     * moreHitsAvailableIndicator 속성의 값을 설정합니다.
     * 
     */
    public void setMoreHitsAvailableIndicator(boolean value) {
        this.moreHitsAvailableIndicator = value;
    }

    /**
     * lastReturnedObjectID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ObjectID }
     *     
     */
    public ObjectID getLastReturnedObjectID() {
        return lastReturnedObjectID;
    }

    /**
     * lastReturnedObjectID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectID }
     *     
     */
    public void setLastReturnedObjectID(ObjectID value) {
        this.lastReturnedObjectID = value;
    }

}
