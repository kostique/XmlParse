
package com.coreteka.main.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for day_entryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="day_entryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availability">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="closed"/>
 *               &lt;enumeration value="open"/>
 *               &lt;enumeration value="available"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="week_index" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="day_of_week">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="su"/>
 *               &lt;enumeration value="mo"/>
 *               &lt;enumeration value="tu"/>
 *               &lt;enumeration value="we"/>
 *               &lt;enumeration value="th"/>
 *               &lt;enumeration value="fr"/>
 *               &lt;enumeration value="sa"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="from_time">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="00:00:00"/>
 *               &lt;enumeration value="09:00:00"/>
 *               &lt;enumeration value="18:30:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="till_time">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="24:00:00"/>
 *               &lt;enumeration value="09:00:00"/>
 *               &lt;enumeration value="18:30:00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "day_entryType", propOrder = {
    "availability",
    "weekIndex",
    "dayOfWeek",
    "fromTime",
    "tillTime"
})
public class DayEntryType {

    @XmlElement(required = true)
    protected String availability;
    @XmlElement(name = "week_index", required = true)
    protected String weekIndex;
    @XmlElement(name = "day_of_week", required = true)
    protected String dayOfWeek;
    @XmlElement(name = "from_time", required = true)
    protected String fromTime;
    @XmlElement(name = "till_time", required = true)
    protected String tillTime;

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Gets the value of the weekIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeekIndex() {
        return weekIndex;
    }

    /**
     * Sets the value of the weekIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeekIndex(String value) {
        this.weekIndex = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfWeek(String value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the fromTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTime() {
        return fromTime;
    }

    /**
     * Sets the value of the fromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTime(String value) {
        this.fromTime = value;
    }

    /**
     * Gets the value of the tillTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTillTime() {
        return tillTime;
    }

    /**
     * Sets the value of the tillTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTillTime(String value) {
        this.tillTime = value;
    }

}
