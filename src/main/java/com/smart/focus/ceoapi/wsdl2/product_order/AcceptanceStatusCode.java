
package com.smart.focus.ceoapi.wsdl2.product_order;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * AcceptanceStatusCode에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;simpleType name="AcceptanceStatusCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AJ"/&gt;
 *     &lt;enumeration value="AP"/&gt;
 *     &lt;enumeration value="RE"/&gt;
 *     &lt;maxLength value="2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcceptanceStatusCode", namespace = "http://sap.com/xi/AP/Common/GDT")
@XmlEnum
public enum AcceptanceStatusCode {

    AJ,
    AP,
    RE;

    public String value() {
        return name();
    }

    public static AcceptanceStatusCode fromValue(String v) {
        return valueOf(v);
    }

}
