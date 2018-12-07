
package com.coreteka.main.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coordinatesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coordinatesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="x_coord" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="y_coord" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coordinatesType", propOrder = {
    "xCoord",
    "yCoord"
})
public class CoordinatesType {

    @XmlElement(name = "x_coord", required = true)
    protected String xCoord;
    @XmlElement(name = "y_coord", required = true)
    protected String yCoord;

    /**
     * Gets the value of the xCoord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCoord() {
        return xCoord;
    }

    /**
     * Sets the value of the xCoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCoord(String value) {
        this.xCoord = value;
    }

    /**
     * Gets the value of the yCoord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYCoord() {
        return yCoord;
    }

    /**
     * Sets the value of the yCoord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYCoord(String value) {
        this.yCoord = value;
    }

}
