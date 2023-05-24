
package com.smart.focus.ceoapi.wsdl2.customer_v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>CustomerReponseCustomerRelationship complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="CustomerReponseCustomerRelationship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelationshipBusinessPartnerUUID" type="{http://sap.com/xi/AP/Common/GDT}UUID" minOccurs="0"/&gt;
 *         &lt;element name="RelationshipBusinessPartnerInternalID" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerInternalID" minOccurs="0"/&gt;
 *         &lt;element name="RoleCode" type="{http://sap.com/xi/AP/Common/GDT}BusinessPartnerRelationshipRoleCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerReponseCustomerRelationship", propOrder = {
    "relationshipBusinessPartnerUUID",
    "relationshipBusinessPartnerInternalID",
    "roleCode"
})
public class CustomerReponseCustomerRelationship {

    @XmlElement(name = "RelationshipBusinessPartnerUUID")
    protected UUID relationshipBusinessPartnerUUID;
    @XmlElement(name = "RelationshipBusinessPartnerInternalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String relationshipBusinessPartnerInternalID;
    @XmlElement(name = "RoleCode", required = true)
    protected BusinessPartnerRelationshipRoleCode roleCode;

    /**
     * relationshipBusinessPartnerUUID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link UUID }
     *     
     */
    public UUID getRelationshipBusinessPartnerUUID() {
        return relationshipBusinessPartnerUUID;
    }

    /**
     * relationshipBusinessPartnerUUID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link UUID }
     *     
     */
    public void setRelationshipBusinessPartnerUUID(UUID value) {
        this.relationshipBusinessPartnerUUID = value;
    }

    /**
     * relationshipBusinessPartnerInternalID 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipBusinessPartnerInternalID() {
        return relationshipBusinessPartnerInternalID;
    }

    /**
     * relationshipBusinessPartnerInternalID 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipBusinessPartnerInternalID(String value) {
        this.relationshipBusinessPartnerInternalID = value;
    }

    /**
     * roleCode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerRelationshipRoleCode }
     *     
     */
    public BusinessPartnerRelationshipRoleCode getRoleCode() {
        return roleCode;
    }

    /**
     * roleCode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerRelationshipRoleCode }
     *     
     */
    public void setRoleCode(BusinessPartnerRelationshipRoleCode value) {
        this.roleCode = value;
    }

}
