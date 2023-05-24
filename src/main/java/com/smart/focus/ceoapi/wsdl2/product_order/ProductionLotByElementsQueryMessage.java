
package com.smart.focus.ceoapi.wsdl2.product_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ProductionLotByElementsQueryMessage complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductionLotByElementsQueryMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductionLotSelectionByElements" type="{http://sap.com/xi/A1S/Global}ProductionLotSelectionByElements" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingConditions" type="{http://sap.com/xi/AP/Common/GDT}QueryProcessingConditions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductionLotByElementsQueryMessage", propOrder = {
        "productionLotSelectionByElements",
        "processingConditions"
})
public class ProductionLotByElementsQueryMessage {

    @XmlElement(name = "ProductionLotSelectionByElements")
    protected ProductionLotSelectionByElements productionLotSelectionByElements;
    @XmlElement(name = "ProcessingConditions")
    protected QueryProcessingConditions processingConditions;

    /**
     * productionLotSelectionByElements 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link ProductionLotSelectionByElements }
     * 
     */
    public ProductionLotSelectionByElements getProductionLotSelectionByElements() {
        return productionLotSelectionByElements;
    }

    /**
     * productionLotSelectionByElements 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link ProductionLotSelectionByElements }
     * 
     */
    public void setProductionLotSelectionByElements(ProductionLotSelectionByElements value) {
        this.productionLotSelectionByElements = value;
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

}
