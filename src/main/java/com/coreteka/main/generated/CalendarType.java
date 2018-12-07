
package com.coreteka.main.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calendarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timezone_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="calendar_versions" type="{}calendar_versionsType"/>
 *         &lt;element name="date_entries" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calendarType", propOrder = {
    "timezoneCode",
    "calendarVersions",
    "dateEntries"
})
public class CalendarType {

    @XmlElement(name = "timezone_code", required = true)
    protected String timezoneCode;
    @XmlElement(name = "calendar_versions", required = true)
    protected CalendarVersionsType calendarVersions;
    @XmlElement(name = "date_entries", required = true)
    protected String dateEntries;

    /**
     * Gets the value of the timezoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezoneCode() {
        return timezoneCode;
    }

    /**
     * Sets the value of the timezoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezoneCode(String value) {
        this.timezoneCode = value;
    }

    /**
     * Gets the value of the calendarVersions property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarVersionsType }
     *     
     */
    public CalendarVersionsType getCalendarVersions() {
        return calendarVersions;
    }

    /**
     * Sets the value of the calendarVersions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarVersionsType }
     *     
     */
    public void setCalendarVersions(CalendarVersionsType value) {
        this.calendarVersions = value;
    }

    /**
     * Gets the value of the dateEntries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateEntries() {
        return dateEntries;
    }

    /**
     * Sets the value of the dateEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateEntries(String value) {
        this.dateEntries = value;
    }

}
