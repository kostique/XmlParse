
package com.coreteka.main.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for plan_regionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="plan_regionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plan_group" type="{}plan_groupType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_regionType", propOrder = {
    "code",
    "name",
    "planGroup"
})
public class PlanRegionType {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "plan_group", required = true)
    protected PlanGroupType planGroup;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the planGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PlanGroupType }
     *     
     */
    public PlanGroupType getPlanGroup() {
        return planGroup;
    }

    /**
     * Sets the value of the planGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanGroupType }
     *     
     */
    public void setPlanGroup(PlanGroupType value) {
        this.planGroup = value;
    }

}
