
package com.smart.focus.ceoapi.wsdl2.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * QueryProcessingConditions complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="QueryProcessingConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QueryHitsMaximumNumberValue" type="{http://sap.com/xi/AP/Common/GDT}NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="QueryHitsUnlimitedIndicator" type="{http://sap.com/xi/AP/Common/GDT}Indicator"/&gt;
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
@XmlType(name = "QueryProcessingConditions", propOrder = {
        "queryHitsMaximumNumberValue",
        "queryHitsUnlimitedIndicator",
        "lastReturnedObjectID"
})
public class QueryProcessingConditions {

    @XmlElement(name = "QueryHitsMaximumNumberValue")
    protected Integer queryHitsMaximumNumberValue;
    @XmlElement(name = "QueryHitsUnlimitedIndicator")
    protected boolean queryHitsUnlimitedIndicator;
    @XmlElement(name = "LastReturnedObjectID")
    protected ObjectID lastReturnedObjectID;

    /**
     * queryHitsMaximumNumberValue 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Integer }
     * 
     */
    public Integer getQueryHitsMaximumNumberValue() {
        return queryHitsMaximumNumberValue;
    }

    /**
     * queryHitsMaximumNumberValue 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Integer }
     * 
     */
    public void setQueryHitsMaximumNumberValue(Integer value) {
        this.queryHitsMaximumNumberValue = value;
    }

    /**
     * queryHitsUnlimitedIndicator 속성의 값을 가져옵니다.
     * 
     */
    public boolean isQueryHitsUnlimitedIndicator() {
        return queryHitsUnlimitedIndicator;
    }

    /**
     * queryHitsUnlimitedIndicator 속성의 값을 설정합니다.
     * 
     */
    public void setQueryHitsUnlimitedIndicator(boolean value) {
        this.queryHitsUnlimitedIndicator = value;
    }

    /**
     * lastReturnedObjectID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ObjectID }
     * 
     */
    public ObjectID getLastReturnedObjectID() {
        return lastReturnedObjectID;
    }

    /**
     * lastReturnedObjectID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ObjectID }
     * 
     */
    public void setLastReturnedObjectID(ObjectID value) {
        this.lastReturnedObjectID = value;
    }

}
