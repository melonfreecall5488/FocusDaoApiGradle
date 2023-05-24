
package com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:3.0" xmlns="http://sap.com/xi/BASIS/Global" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:n1="http://sap.com/xi/SAPGlobal20/Global" xmlns:n2="http://sap.com/xi/AP/Common/Global" xmlns:n3="http://sap.com/xi/AP/Common/GDT" xmlns:n4="http://sap.com/xi/BASIS/Global" xmlns:n5="http://sap.com/xi/DocumentServices/Global" xmlns:rfc="urn:sap-com:sap:rfc:functions" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tns="http://sap.com/xi/A1S/Global" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsoap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:wsp="http://schemas.xmlsoap.org/ws/2004/09/policy" xmlns:wsu="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd" xmlns:xi0="http://sap.com/xi/SAPGlobal20/Global" xmlns:xi1="http://sap.com/xi/AP/Common/Global" xmlns:xi2="http://sap.com/xi/A1S/Global" xmlns:xi3="http://sap.com/xi/AP/Common/GDT" xmlns:xi4="http://sap.com/xi/BASIS/Global" xmlns:xi5="http://sap.com/xi/DocumentServices/Global" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;BinaryObject&lt;/ccts:RepresentationTerm&gt;
 * </pre>
 * 
 * 
 * <p>
 * BinaryObject complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BinaryObject"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;base64Binary"&gt;
 *       &lt;attribute name="mimeCode" type="{http://sap.com/xi/BASIS/Global}MIMECode" /&gt;
 *       &lt;attribute name="characterSetCode" type="{http://sap.com/xi/BASIS/Global}CharacterSetCode" /&gt;
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *       &lt;attribute name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryObject", namespace = "http://sap.com/xi/BASIS/Global", propOrder = {
        "value"
})
public class BinaryObject {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "mimeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mimeCode;
    @XmlAttribute(name = "characterSetCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String characterSetCode;
    @XmlAttribute(name = "format")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String format;
    @XmlAttribute(name = "fileName")
    protected String fileName;
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    /**
     * value 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * value 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * mimeCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getMimeCode() {
        return mimeCode;
    }

    /**
     * mimeCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setMimeCode(String value) {
        this.mimeCode = value;
    }

    /**
     * characterSetCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getCharacterSetCode() {
        return characterSetCode;
    }

    /**
     * characterSetCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setCharacterSetCode(String value) {
        this.characterSetCode = value;
    }

    /**
     * format 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFormat() {
        return format;
    }

    /**
     * format 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * fileName 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * fileName 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * uri 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getUri() {
        return uri;
    }

    /**
     * uri 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setUri(String value) {
        this.uri = value;
    }

}
