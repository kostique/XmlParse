
package com.coreteka.main.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for udfieldsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="udfieldsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="udfield" type="{}udfieldType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "udfieldsType", propOrder = {
    "udfield"
})
public class UdfieldsType {

    @XmlElement(required = true)
    protected UdfieldType udfield;

    /**
     * Gets the value of the udfield property.
     * 
     * @return
     *     possible object is
     *     {@link UdfieldType }
     *     
     */
    public UdfieldType getUdfield() {
        return udfield;
    }

    /**
     * Sets the value of the udfield property.
     * 
     * @param value
     *     allowed object is
     *     {@link UdfieldType }
     *     
     */
    public void setUdfield(UdfieldType value) {
        this.udfield = value;
    }

}
