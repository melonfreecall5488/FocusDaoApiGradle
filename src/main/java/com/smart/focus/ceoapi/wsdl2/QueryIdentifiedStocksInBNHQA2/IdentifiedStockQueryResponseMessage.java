
package com.smart.focus.ceoapi.wsdl2.QueryIdentifiedStocksInBNHQA2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * IdentifiedStockQueryResponseMessage complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IdentifiedStockQueryResponseMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}ResponseProcessingConditions"/&gt;
 *         &lt;element name="Log" type="{http://sap.com/xi/AP/Common/GDT}Log"/&gt;
 *         &lt;element name="IdentifiedStock" type="{http://sap.com/xi/A1S/Global}IdentifiedStockQueryResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifiedStockQueryResponseMessage", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "processingConditions",
        "log",
        "identifiedStock"
})
public class IdentifiedStockQueryResponseMessage {

    @XmlElement(name = "ProcessingConditions", required = true)
    protected ResponseProcessingConditions processingConditions;
    @XmlElement(name = "Log", required = true)
    protected Log log;
    @XmlElement(name = "IdentifiedStock")
    protected List<IdentifiedStockQueryResponse> identifiedStock;

    /**
     * processingConditions 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ResponseProcessingConditions }
     * 
     */
    public ResponseProcessingConditions getProcessingConditions() {
        return processingConditions;
    }

    /**
     * processingConditions 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ResponseProcessingConditions }
     * 
     */
    public void setProcessingConditions(ResponseProcessingConditions value) {
        this.processingConditions = value;
    }

    /**
     * log 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Log }
     * 
     */
    public Log getLog() {
        return log;
    }

    /**
     * log 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Log }
     * 
     */
    public void setLog(Log value) {
        this.log = value;
    }

    /**
     * Gets the value of the identifiedStock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiedStock
     * property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getIdentifiedStock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentifiedStockQueryResponse }
     * 
     * 
     */
    public List<IdentifiedStockQueryResponse> getIdentifiedStock() {
        if (identifiedStock == null) {
            identifiedStock = new ArrayList<IdentifiedStockQueryResponse>();
        }
        return this.identifiedStock;
    }

}
