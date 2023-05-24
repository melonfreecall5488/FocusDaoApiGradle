
package com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * RequirementSpecificationKey complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="RequirementSpecificationKey"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequirementSpecificationID" type="{http://sap.com/xi/AP/Common/GDT}RequirementSpecificationID"/&gt;
 *         &lt;element name="RequirementSpecificationVersionID" type="{http://sap.com/xi/AP/Common/GDT}VersionID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequirementSpecificationKey", namespace = "http://sap.com/xi/AP/Common/Global", propOrder = {
        "requirementSpecificationID",
        "requirementSpecificationVersionID"
})
public class RequirementSpecificationKey {

    @XmlElement(name = "RequirementSpecificationID", required = true)
    protected RequirementSpecificationID requirementSpecificationID;
    @XmlElement(name = "RequirementSpecificationVersionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String requirementSpecificationVersionID;

    /**
     * requirementSpecificationID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link RequirementSpecificationID }
     * 
     */
    public RequirementSpecificationID getRequirementSpecificationID() {
        return requirementSpecificationID;
    }

    /**
     * requirementSpecificationID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link RequirementSpecificationID }
     * 
     */
    public void setRequirementSpecificationID(RequirementSpecificationID value) {
        this.requirementSpecificationID = value;
    }

    /**
     * requirementSpecificationVersionID 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link String }
     * 
     */
    public String getRequirementSpecificationVersionID() {
        return requirementSpecificationVersionID;
    }

    /**
     * requirementSpecificationVersionID 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link String }
     * 
     */
    public void setRequirementSpecificationVersionID(String value) {
        this.requirementSpecificationVersionID = value;
    }

}
