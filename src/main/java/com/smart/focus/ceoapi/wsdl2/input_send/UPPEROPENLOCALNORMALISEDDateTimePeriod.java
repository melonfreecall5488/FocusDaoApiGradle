
package com.smart.focus.ceoapi.wsdl2.input_send;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * UPPEROPEN_LOCALNORMALISED_DateTimePeriod complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="UPPEROPEN_LOCALNORMALISED_DateTimePeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDateTime" type="{http://sap.com/xi/BASIS/Global}LOCALNORMALISED_DateTime" minOccurs="0"/&gt;
 *         &lt;element name="EndDateTime" type="{http://sap.com/xi/BASIS/Global}LOCALNORMALISED_DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UPPEROPEN_LOCALNORMALISED_DateTimePeriod", propOrder = {
        "startDateTime",
        "endDateTime"
})
public class UPPEROPENLOCALNORMALISEDDateTimePeriod {

    @XmlElement(name = "StartDateTime")
    protected LOCALNORMALISEDDateTime startDateTime;
    @XmlElement(name = "EndDateTime")
    protected LOCALNORMALISEDDateTime endDateTime;

    /**
     * startDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link LOCALNORMALISEDDateTime }
     * 
     */
    public LOCALNORMALISEDDateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * startDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link LOCALNORMALISEDDateTime }
     * 
     */
    public void setStartDateTime(LOCALNORMALISEDDateTime value) {
        this.startDateTime = value;
    }

    /**
     * endDateTime 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link LOCALNORMALISEDDateTime }
     * 
     */
    public LOCALNORMALISEDDateTime getEndDateTime() {
        return endDateTime;
    }

    /**
     * endDateTime 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link LOCALNORMALISEDDateTime }
     * 
     */
    public void setEndDateTime(LOCALNORMALISEDDateTime value) {
        this.endDateTime = value;
    }

}
