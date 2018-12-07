
package com.coreteka.main.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="address_kind" type="{}address_kindType"/>
 *         &lt;element name="street_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="door_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="door_number_postfix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="area_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="state_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="country_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timezone_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contact_person" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contactAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="is_depot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="temporary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="plan_region" type="{}plan_regionType"/>
 *         &lt;element name="calendar" type="{}calendarType"/>
 *         &lt;element name="allowed_action_kinds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not_allowed_products" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not_allowed_product_kinds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not_allowed_resources" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not_allowed_resource_kinds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{}locationType"/>
 *         &lt;element name="resource_kind_turnaround_durations" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resource_turnaround_durations" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="udfields" type="{}udfieldsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressType", propOrder = {
    "id",
    "code",
    "name",
    "addressKind",
    "streetName",
    "doorNumber",
    "doorNumberPostfix",
    "areaDescription",
    "zipcode",
    "city",
    "stateName",
    "countryCode",
    "timezoneCode",
    "phone",
    "phone2",
    "fax",
    "email",
    "contactPerson",
    "contactAddress",
    "isDepot",
    "active",
    "temporary",
    "planRegion",
    "calendar",
    "allowedActionKinds",
    "notAllowedProducts",
    "notAllowedProductKinds",
    "notAllowedResources",
    "notAllowedResourceKinds",
    "location",
    "resourceKindTurnaroundDurations",
    "resourceTurnaroundDurations",
    "comment",
    "udfields"
})
public class AddressType {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "address_kind", required = true)
    protected AddressKindType addressKind;
    @XmlElement(name = "street_name", required = true)
    protected String streetName;
    @XmlElement(name = "door_number", required = true)
    protected String doorNumber;
    @XmlElement(name = "door_number_postfix", required = true)
    protected String doorNumberPostfix;
    @XmlElement(name = "area_description", required = true)
    protected String areaDescription;
    @XmlElement(required = true)
    protected String zipcode;
    @XmlElement(required = true)
    protected String city;
    @XmlElement(name = "state_name", required = true)
    protected String stateName;
    @XmlElement(name = "country_code", required = true)
    protected String countryCode;
    @XmlElement(name = "timezone_code", required = true)
    protected String timezoneCode;
    @XmlElement(required = true)
    protected String phone;
    @XmlElement(required = true)
    protected String phone2;
    @XmlElement(required = true)
    protected String fax;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(name = "contact_person", required = true)
    protected String contactPerson;
    @XmlElement(required = true)
    protected String contactAddress;
    @XmlElement(name = "is_depot", required = true)
    protected String isDepot;
    @XmlElement(required = true)
    protected String active;
    @XmlElement(required = true)
    protected String temporary;
    @XmlElement(name = "plan_region", required = true)
    protected PlanRegionType planRegion;
    @XmlElement(required = true)
    protected CalendarType calendar;
    @XmlElement(name = "allowed_action_kinds", required = true)
    protected String allowedActionKinds;
    @XmlElement(name = "not_allowed_products", required = true)
    protected String notAllowedProducts;
    @XmlElement(name = "not_allowed_product_kinds", required = true)
    protected String notAllowedProductKinds;
    @XmlElement(name = "not_allowed_resources", required = true)
    protected String notAllowedResources;
    @XmlElement(name = "not_allowed_resource_kinds", required = true)
    protected String notAllowedResourceKinds;
    @XmlElement(required = true)
    protected LocationType location;
    @XmlElement(name = "resource_kind_turnaround_durations", required = true)
    protected String resourceKindTurnaroundDurations;
    @XmlElement(name = "resource_turnaround_durations", required = true)
    protected String resourceTurnaroundDurations;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected UdfieldsType udfields;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Gets the value of the addressKind property.
     * 
     * @return
     *     possible object is
     *     {@link AddressKindType }
     *     
     */
    public AddressKindType getAddressKind() {
        return addressKind;
    }

    /**
     * Sets the value of the addressKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressKindType }
     *     
     */
    public void setAddressKind(AddressKindType value) {
        this.addressKind = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the doorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoorNumber() {
        return doorNumber;
    }

    /**
     * Sets the value of the doorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoorNumber(String value) {
        this.doorNumber = value;
    }

    /**
     * Gets the value of the doorNumberPostfix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoorNumberPostfix() {
        return doorNumberPostfix;
    }

    /**
     * Sets the value of the doorNumberPostfix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoorNumberPostfix(String value) {
        this.doorNumberPostfix = value;
    }

    /**
     * Gets the value of the areaDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaDescription() {
        return areaDescription;
    }

    /**
     * Sets the value of the areaDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaDescription(String value) {
        this.areaDescription = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipcode(String value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the stateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * Sets the value of the stateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateName(String value) {
        this.stateName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

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
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * Sets the value of the phone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone2(String value) {
        this.phone2 = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the contactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * Sets the value of the contactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * Gets the value of the contactAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactAddress() {
        return contactAddress;
    }

    /**
     * Sets the value of the contactAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactAddress(String value) {
        this.contactAddress = value;
    }

    /**
     * Gets the value of the isDepot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDepot() {
        return isDepot;
    }

    /**
     * Sets the value of the isDepot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDepot(String value) {
        this.isDepot = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the temporary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporary() {
        return temporary;
    }

    /**
     * Sets the value of the temporary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporary(String value) {
        this.temporary = value;
    }

    /**
     * Gets the value of the planRegion property.
     * 
     * @return
     *     possible object is
     *     {@link PlanRegionType }
     *     
     */
    public PlanRegionType getPlanRegion() {
        return planRegion;
    }

    /**
     * Sets the value of the planRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanRegionType }
     *     
     */
    public void setPlanRegion(PlanRegionType value) {
        this.planRegion = value;
    }

    /**
     * Gets the value of the calendar property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarType }
     *     
     */
    public CalendarType getCalendar() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarType }
     *     
     */
    public void setCalendar(CalendarType value) {
        this.calendar = value;
    }

    /**
     * Gets the value of the allowedActionKinds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedActionKinds() {
        return allowedActionKinds;
    }

    /**
     * Sets the value of the allowedActionKinds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedActionKinds(String value) {
        this.allowedActionKinds = value;
    }

    /**
     * Gets the value of the notAllowedProducts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAllowedProducts() {
        return notAllowedProducts;
    }

    /**
     * Sets the value of the notAllowedProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAllowedProducts(String value) {
        this.notAllowedProducts = value;
    }

    /**
     * Gets the value of the notAllowedProductKinds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAllowedProductKinds() {
        return notAllowedProductKinds;
    }

    /**
     * Sets the value of the notAllowedProductKinds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAllowedProductKinds(String value) {
        this.notAllowedProductKinds = value;
    }

    /**
     * Gets the value of the notAllowedResources property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAllowedResources() {
        return notAllowedResources;
    }

    /**
     * Sets the value of the notAllowedResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAllowedResources(String value) {
        this.notAllowedResources = value;
    }

    /**
     * Gets the value of the notAllowedResourceKinds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAllowedResourceKinds() {
        return notAllowedResourceKinds;
    }

    /**
     * Sets the value of the notAllowedResourceKinds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAllowedResourceKinds(String value) {
        this.notAllowedResourceKinds = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLocation(LocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the resourceKindTurnaroundDurations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceKindTurnaroundDurations() {
        return resourceKindTurnaroundDurations;
    }

    /**
     * Sets the value of the resourceKindTurnaroundDurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceKindTurnaroundDurations(String value) {
        this.resourceKindTurnaroundDurations = value;
    }

    /**
     * Gets the value of the resourceTurnaroundDurations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceTurnaroundDurations() {
        return resourceTurnaroundDurations;
    }

    /**
     * Sets the value of the resourceTurnaroundDurations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceTurnaroundDurations(String value) {
        this.resourceTurnaroundDurations = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the udfields property.
     * 
     * @return
     *     possible object is
     *     {@link UdfieldsType }
     *     
     */
    public UdfieldsType getUdfields() {
        return udfields;
    }

    /**
     * Sets the value of the udfields property.
     * 
     * @param value
     *     allowed object is
     *     {@link UdfieldsType }
     *     
     */
    public void setUdfields(UdfieldsType value) {
        this.udfields = value;
    }

}
