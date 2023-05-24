
package com.smart.focus.ceoapi.wsdl2.product_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * anonymous complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="standard" type="{http://sap.com/xi/AP/Common/Global}ExchangeFaultData"/&gt;
 *         &lt;element name="addition" type="{http://sap.com/xi/AP/Common/Global}StandardFaultMessageExtension"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "standard",
        "addition"
})
@XmlRootElement(name = "StandardFaultMessage", namespace = "http://sap.com/xi/AP/Common/Global")
public class StandardFaultMessage {

    @XmlElement(required = true)
    protected ExchangeFaultData standard;
    @XmlElement(required = true)
    protected StandardFaultMessageExtension addition;

    /**
     * standard 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ExchangeFaultData }
     * 
     */
    public ExchangeFaultData getStandard() {
        return standard;
    }

    /**
     * standard 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ExchangeFaultData }
     * 
     */
    public void setStandard(ExchangeFaultData value) {
        this.standard = value;
    }

    /**
     * addition 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link StandardFaultMessageExtension }
     * 
     */
    public StandardFaultMessageExtension getAddition() {
        return addition;
    }

    /**
     * addition 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link StandardFaultMessageExtension }
     * 
     */
    public void setAddition(StandardFaultMessageExtension value) {
        this.addition = value;
    }

}
