
package com.smart.focus.ceoapi.wsdl2.supplier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:3.0" xmlns="http://sap.com/xi/AP/Common/GDT" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:n1="http://sap.com/xi/AP/Common/Global" xmlns:n10="http://sap.com/xi/AP/FO/PriceAndTax/Global" xmlns:n11="http://sap.com/xi/AP/FO/WithholdingTax/Global" xmlns:n2="http://sap.com/xi/SAPGlobal20/Global" xmlns:n3="http://sap.com/xi/AP/Common/GDT" xmlns:n4="http://sap.com/xi/DocumentServices/Global" xmlns:n5="http://sap.com/xi/AP/FinancialAccounting/Global" xmlns:n6="http://sap.com/xi/BASIS/Global" xmlns:n7="http://sap.com/xi/Extensibility/Global" xmlns:n8="http://sap.com/xi/AP/PDI/ABSL" xmlns:n9="http://sap.com/xi/AP/Globalization" xmlns:rfc="urn:sap-com:sap:rfc:functions" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://sap.com/xi/A1S/Global" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsoap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:wsp="http://schemas.xmlsoap.org/ws/2004/09/policy" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" xmlns:xi11="http://sap.com/xi/AP/Common/Global" xmlns:xi12="http://sap.com/xi/SAPGlobal20/Global" xmlns:xi13="http://sap.com/xi/A1S/Global" xmlns:xi14="http://sap.com/xi/AP/Common/GDT" xmlns:xi16="http://sap.com/xi/DocumentServices/Global" xmlns:xi17="http://sap.com/xi/AP/FinancialAccounting/Global" xmlns:xi18="http://sap.com/xi/BASIS/Global" xmlns:xi22="http://sap.com/xi/Extensibility/Global" xmlns:xi23="http://sap.com/xi/AP/PDI/ABSL" xmlns:xi24="http://sap.com/xi/AP/Globalization" xmlns:xi27="http://sap.com/xi/AP/FO/PriceAndTax/Global" xmlns:xi28="http://sap.com/xi/AP/FO/WithholdingTax/Global" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code&lt;/ccts:RepresentationTerm&gt;
 * </pre>
 * 
 * 
 * <p>
 * VIPReasonCode complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="VIPReasonCode"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://sap.com/xi/AP/Common/GDT&gt;VIPReasonCode.Content"&gt;
 *       &lt;attribute name="listID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;maxLength value="60"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="listAgencyID"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;maxLength value="60"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VIPReasonCode", propOrder = {
        "value"
})
public class VIPReasonCode {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "listID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String listID;
    @XmlAttribute(name = "listAgencyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String listAgencyID;

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * listID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getListID() {
        return listID;
    }

    /**
     * listID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setListID(String value) {
        this.listID = value;
    }

    /**
     * listAgencyID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getListAgencyID() {
        return listAgencyID;
    }

    /**
     * listAgencyID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setListAgencyID(String value) {
        this.listAgencyID = value;
    }

}
