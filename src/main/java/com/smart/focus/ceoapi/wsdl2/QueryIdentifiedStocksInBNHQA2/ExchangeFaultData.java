
package com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ExchangeFaultData complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ExchangeFaultData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faultText" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faultUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="faultDetail" type="{http://sap.com/xi/AP/Common/Global}ExchangeLogData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeFaultData", namespace = "http://sap.com/xi/AP/Common/Global", propOrder = {
        "faultText",
        "faultUrl",
        "faultDetail"
})
public class ExchangeFaultData {

    @XmlElement(required = true)
    protected String faultText;
    protected String faultUrl;
    protected List<ExchangeLogData> faultDetail;

    /**
     * faultText 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFaultText() {
        return faultText;
    }

    /**
     * faultText 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setFaultText(String value) {
        this.faultText = value;
    }

    /**
     * faultUrl 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getFaultUrl() {
        return faultUrl;
    }

    /**
     * faultUrl 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setFaultUrl(String value) {
        this.faultUrl = value;
    }

    /**
     * Gets the value of the faultDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultDetail
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getFaultDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeLogData }
     * 
     * 
     */
    public List<ExchangeLogData> getFaultDetail() {
        if (faultDetail == null) {
            faultDetail = new ArrayList<ExchangeLogData>();
        }
        return this.faultDetail;
    }

}
