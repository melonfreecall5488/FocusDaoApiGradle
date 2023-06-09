
package com.smart.focus.ceoapi.wsdl2.supplier;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Log complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="Log"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessDocumentProcessingResultCode" type="{http://sap.com/xi/AP/Common/GDT}ProcessingResultCode" minOccurs="0"/&gt;
 *         &lt;element name="MaximumLogItemSeverityCode" type="{http://sap.com/xi/AP/Common/GDT}LogItemSeverityCode" minOccurs="0"/&gt;
 *         &lt;element name="Item" type="{http://sap.com/xi/AP/Common/GDT}LogItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Log", propOrder = {
        "businessDocumentProcessingResultCode",
        "maximumLogItemSeverityCode",
        "item"
})
public class Log {

    @XmlElement(name = "BusinessDocumentProcessingResultCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessDocumentProcessingResultCode;
    @XmlElement(name = "MaximumLogItemSeverityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String maximumLogItemSeverityCode;
    @XmlElement(name = "Item")
    protected List<LogItem> item;

    /**
     * businessDocumentProcessingResultCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getBusinessDocumentProcessingResultCode() {
        return businessDocumentProcessingResultCode;
    }

    /**
     * businessDocumentProcessingResultCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setBusinessDocumentProcessingResultCode(String value) {
        this.businessDocumentProcessingResultCode = value;
    }

    /**
     * maximumLogItemSeverityCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getMaximumLogItemSeverityCode() {
        return maximumLogItemSeverityCode;
    }

    /**
     * maximumLogItemSeverityCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setMaximumLogItemSeverityCode(String value) {
        this.maximumLogItemSeverityCode = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogItem }
     * 
     * 
     */
    public List<LogItem> getItem() {
        if (item == null) {
            item = new ArrayList<LogItem>();
        }
        return this.item;
    }

}
