
package com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * IdentifiedStockQuantityConversionMaintainRequestBundle complex type에 대한 Java
 * 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="IdentifiedStockQuantityConversionMaintainRequestBundle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectNodeSenderTechnicalID" type="{http://sap.com/xi/AP/Common/GDT}ObjectNodePartyTechnicalID" minOccurs="0"/&gt;
 *         &lt;element name="BaseQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="CorrespondingQuantity" type="{http://sap.com/xi/AP/Common/GDT}Quantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ActionCode" type="{http://sap.com/xi/AP/Common/GDT}ActionCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifiedStockQuantityConversionMaintainRequestBundle", namespace = "http://sap.com/xi/A1S/Global", propOrder = {
        "objectNodeSenderTechnicalID",
        "baseQuantity",
        "correspondingQuantity"
})
public class IdentifiedStockQuantityConversionMaintainRequestBundle {

    @XmlElement(name = "ObjectNodeSenderTechnicalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectNodeSenderTechnicalID;
    @XmlElement(name = "BaseQuantity")
    protected Quantity baseQuantity;
    @XmlElement(name = "CorrespondingQuantity")
    protected Quantity correspondingQuantity;
    @XmlAttribute(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actionCode;

    /**
     * objectNodeSenderTechnicalID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getObjectNodeSenderTechnicalID() {
        return objectNodeSenderTechnicalID;
    }

    /**
     * objectNodeSenderTechnicalID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setObjectNodeSenderTechnicalID(String value) {
        this.objectNodeSenderTechnicalID = value;
    }

    /**
     * baseQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getBaseQuantity() {
        return baseQuantity;
    }

    /**
     * baseQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setBaseQuantity(Quantity value) {
        this.baseQuantity = value;
    }

    /**
     * correspondingQuantity 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link Quantity }
     * 
     */
    public Quantity getCorrespondingQuantity() {
        return correspondingQuantity;
    }

    /**
     * correspondingQuantity 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link Quantity }
     * 
     */
    public void setCorrespondingQuantity(Quantity value) {
        this.correspondingQuantity = value;
    }

    /**
     * actionCode 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * actionCode 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

}
