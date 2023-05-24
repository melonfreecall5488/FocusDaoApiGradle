
package com.smart.focus.ceoapi.wsdl2.product_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * ProductSpecification complex type에 대한 Java 클래스입니다.
 * 
 * <p>
 * 다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductSpecificationDescription" type="{http://sap.com/xi/AP/Common/GDT}MEDIUM_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSpecification", propOrder = {
        "productSpecificationDescription"
})
public class ProductSpecification {

    @XmlElement(name = "ProductSpecificationDescription")
    protected MEDIUMDescription productSpecificationDescription;

    /**
     * productSpecificationDescription 속성의 값을 가져옵니다.
     * 
     * @return
     *         possible object is
     *         {@link MEDIUMDescription }
     * 
     */
    public MEDIUMDescription getProductSpecificationDescription() {
        return productSpecificationDescription;
    }

    /**
     * productSpecificationDescription 속성의 값을 설정합니다.
     * 
     * @param value
     *              allowed object is
     *              {@link MEDIUMDescription }
     * 
     */
    public void setProductSpecificationDescription(MEDIUMDescription value) {
        this.productSpecificationDescription = value;
    }

}
