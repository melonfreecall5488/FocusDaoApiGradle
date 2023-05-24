
package com.smart.focus.ceoapi.wsdl2.material;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * MaterialByElementsQueryMessage_sync complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MaterialByElementsQueryMessage_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaterialSelectionByElements" type="{http://sap.com/xi/A1S/Global}MaterialByElementsQuerySelectionByElements" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}QueryProcessingConditions" minOccurs="0"/&gt;
 *         &lt;element name="RequestedElements" type="{http://sap.com/xi/A1S/Global}MaterialByElementsQueryRequestedElements" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaterialByElementsQueryMessage_sync", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "materialSelectionByElements",
        "processingConditions",
        "requestedElements"
})
public class MaterialByElementsQueryMessageSync {

    @XmlElement(name = "MaterialSelectionByElements")
    protected MaterialByElementsQuerySelectionByElements materialSelectionByElements;
    @XmlElement(name = "ProcessingConditions")
    protected QueryProcessingConditions processingConditions;
    @XmlElement(name = "RequestedElements")
    protected MaterialByElementsQueryRequestedElements requestedElements;

    /**
     * materialSelectionByElements 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link MaterialByElementsQuerySelectionByElements }
     * 
     */
    public MaterialByElementsQuerySelectionByElements getMaterialSelectionByElements() {
        return materialSelectionByElements;
    }

    /**
     * materialSelectionByElements 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link MaterialByElementsQuerySelectionByElements }
     * 
     */
    public void setMaterialSelectionByElements(MaterialByElementsQuerySelectionByElements value) {
        this.materialSelectionByElements = value;
    }

    /**
     * processingConditions 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link QueryProcessingConditions }
     * 
     */
    public QueryProcessingConditions getProcessingConditions() {
        return processingConditions;
    }

    /**
     * processingConditions 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link QueryProcessingConditions }
     * 
     */
    public void setProcessingConditions(QueryProcessingConditions value) {
        this.processingConditions = value;
    }

    /**
     * requestedElements 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link MaterialByElementsQueryRequestedElements }
     * 
     */
    public MaterialByElementsQueryRequestedElements getRequestedElements() {
        return requestedElements;
    }

    /**
     * requestedElements 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link MaterialByElementsQueryRequestedElements }
     * 
     */
    public void setRequestedElements(MaterialByElementsQueryRequestedElements value) {
        this.requestedElements = value;
    }

}
