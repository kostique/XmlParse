
package com.coreteka.main.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for calendar_versionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calendar_versionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="from_date">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2014-08-04"/>
 *               &lt;enumeration value="1981-04-01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="till_date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nof_weeks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="day_entry" type="{}day_entryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calendar_versionType", propOrder = {
    "fromDate",
    "tillDate",
    "nofWeeks",
    "dayEntry"
})
public class CalendarVersionType {

    @XmlElement(name = "from_date", required = true)
    protected String fromDate;
    @XmlElement(name = "till_date", required = true)
    protected String tillDate;
    @XmlElement(name = "nof_weeks", required = true)
    protected String nofWeeks;
    @XmlElement(name = "day_entry")
    protected List<DayEntryType> dayEntry;

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDate(String value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the tillDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTillDate() {
        return tillDate;
    }

    /**
     * Sets the value of the tillDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTillDate(String value) {
        this.tillDate = value;
    }

    /**
     * Gets the value of the nofWeeks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNofWeeks() {
        return nofWeeks;
    }

    /**
     * Sets the value of the nofWeeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNofWeeks(String value) {
        this.nofWeeks = value;
    }

    /**
     * Gets the value of the dayEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayEntryType }
     * 
     * 
     */
    public List<DayEntryType> getDayEntry() {
        if (dayEntry == null) {
            dayEntry = new ArrayList<DayEntryType>();
        }
        return this.dayEntry;
    }

}
