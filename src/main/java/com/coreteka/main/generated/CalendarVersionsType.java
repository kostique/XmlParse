
package com.coreteka.main.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calendar_versionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calendar_versionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calendar_version" type="{}calendar_versionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calendar_versionsType", propOrder = {
    "calendarVersion"
})
public class CalendarVersionsType {

    @XmlElement(name = "calendar_version", required = true)
    protected CalendarVersionType calendarVersion;

    /**
     * Gets the value of the calendarVersion property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarVersionType }
     *     
     */
    public CalendarVersionType getCalendarVersion() {
        return calendarVersion;
    }

    /**
     * Sets the value of the calendarVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarVersionType }
     *     
     */
    public void setCalendarVersion(CalendarVersionType value) {
        this.calendarVersion = value;
    }

}
