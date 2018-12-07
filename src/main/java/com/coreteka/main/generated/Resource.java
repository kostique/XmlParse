
package com.coreteka.main.generated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for resourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="driverId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="driverCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="drivername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resource_kind" type="{}resource_kindType"/>
 *         &lt;element name="resource_tag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resource_status" type="{}resource_statusType"/>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subcontractorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="division" type="{}divisionType"/>
 *         &lt;element name="address" type="{}addressType"/>
 *         &lt;element name="comm_code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="capabilities" type="{}capabilitiesType"/>
 *         &lt;element name="calendar" type="{}calendarType"/>
 *         &lt;element name="allowed_plan_regions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not_allowed_addresses" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not_allowed_address_kinds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not_allowed_products" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not_allowed_product_kinds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not_allowed_resources" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not_allowed_resource_kinds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not_allowed_stations" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="not_allowed_station_kinds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="udfields" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="company" type="{}companyType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceType", propOrder = {
    "driverId",
    "driverCode",
    "drivername",
    "id",
    "code",
    "name",
    "resourceKind",
    "resourceTag",
    "resourceStatus",
    "active",
    "subcontractorId",
    "division",
    "address",
    "commCode",
    "comment",
    "capabilities",
    "calendar",
    "allowedPlanRegions",
    "notAllowedAddresses",
    "notAllowedAddressKinds",
    "notAllowedProducts",
    "notAllowedProductKinds",
    "notAllowedResources",
    "notAllowedResourceKinds",
    "notAllowedStations",
    "notAllowedStationKinds",
    "udfields",
    "company"
})
public class Resource {

    @XmlElement(required = true)
    protected String driverId;
    @XmlElement(required = true)
    protected String driverCode;
    @XmlElement(required = true)
    protected String drivername;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "resource_kind", required = true)
    protected ResourceKindType resourceKind;
    @XmlElement(name = "resource_tag", required = true)
    protected String resourceTag;
    @XmlElement(name = "resource_status", required = true)
    protected ResourceStatusType resourceStatus;
    @XmlElement(required = true)
    protected String active;
    @XmlElement(required = true)
    protected String subcontractorId;
    @XmlElement(required = true)
    protected DivisionType division;
    @XmlElement(required = true)
    protected AddressType address;
    @XmlElement(name = "comm_code", required = true)
    protected String commCode;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected CapabilitiesType capabilities;
    @XmlElement(required = true)
    protected CalendarType calendar;
    @XmlElement(name = "allowed_plan_regions", required = true)
    protected String allowedPlanRegions;
    @XmlElement(name = "not_allowed_addresses", required = true)
    protected String notAllowedAddresses;
    @XmlElement(name = "not_allowed_address_kinds", required = true)
    protected String notAllowedAddressKinds;
    @XmlElement(name = "not_allowed_products", required = true)
    protected String notAllowedProducts;
    @XmlElement(name = "not_allowed_product_kinds", required = true)
    protected String notAllowedProductKinds;
    @XmlElement(name = "not_allowed_resources", required = true)
    protected String notAllowedResources;
    @XmlElement(name = "not_allowed_resource_kinds", required = true)
    protected String notAllowedResourceKinds;
    @XmlElement(name = "not_allowed_stations", required = true)
    protected String notAllowedStations;
    @XmlElement(name = "not_allowed_station_kinds", required = true)
    protected String notAllowedStationKinds;
    @XmlElement(required = true)
    protected String udfields;
    @XmlElement(required = true)
    protected CompanyType company;
    @XmlAttribute(name = "id")
    protected String idAttribute;

    /**
     * Gets the value of the driverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverId(String value) {
        this.driverId = value;
    }

    /**
     * Gets the value of the driverCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverCode() {
        return driverCode;
    }

    /**
     * Sets the value of the driverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverCode(String value) {
        this.driverCode = value;
    }

    /**
     * Gets the value of the drivername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrivername() {
        return drivername;
    }

    /**
     * Sets the value of the drivername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrivername(String value) {
        this.drivername = value;
    }

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
     * Gets the value of the resourceKind property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceKindType }
     *     
     */
    public ResourceKindType getResourceKind() {
        return resourceKind;
    }

    /**
     * Sets the value of the resourceKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceKindType }
     *     
     */
    public void setResourceKind(ResourceKindType value) {
        this.resourceKind = value;
    }

    /**
     * Gets the value of the resourceTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceTag() {
        return resourceTag;
    }

    /**
     * Sets the value of the resourceTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceTag(String value) {
        this.resourceTag = value;
    }

    /**
     * Gets the value of the resourceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceStatusType }
     *     
     */
    public ResourceStatusType getResourceStatus() {
        return resourceStatus;
    }

    /**
     * Sets the value of the resourceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceStatusType }
     *     
     */
    public void setResourceStatus(ResourceStatusType value) {
        this.resourceStatus = value;
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
     * Gets the value of the subcontractorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcontractorId() {
        return subcontractorId;
    }

    /**
     * Sets the value of the subcontractorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcontractorId(String value) {
        this.subcontractorId = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link DivisionType }
     *     
     */
    public DivisionType getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivisionType }
     *     
     */
    public void setDivision(DivisionType value) {
        this.division = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the commCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommCode() {
        return commCode;
    }

    /**
     * Sets the value of the commCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommCode(String value) {
        this.commCode = value;
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
     * Gets the value of the capabilities property.
     * 
     * @return
     *     possible object is
     *     {@link CapabilitiesType }
     *     
     */
    public CapabilitiesType getCapabilities() {
        return capabilities;
    }

    /**
     * Sets the value of the capabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilitiesType }
     *     
     */
    public void setCapabilities(CapabilitiesType value) {
        this.capabilities = value;
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
     * Gets the value of the allowedPlanRegions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowedPlanRegions() {
        return allowedPlanRegions;
    }

    /**
     * Sets the value of the allowedPlanRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowedPlanRegions(String value) {
        this.allowedPlanRegions = value;
    }

    /**
     * Gets the value of the notAllowedAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAllowedAddresses() {
        return notAllowedAddresses;
    }

    /**
     * Sets the value of the notAllowedAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAllowedAddresses(String value) {
        this.notAllowedAddresses = value;
    }

    /**
     * Gets the value of the notAllowedAddressKinds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAllowedAddressKinds() {
        return notAllowedAddressKinds;
    }

    /**
     * Sets the value of the notAllowedAddressKinds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAllowedAddressKinds(String value) {
        this.notAllowedAddressKinds = value;
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
     * Gets the value of the notAllowedStations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAllowedStations() {
        return notAllowedStations;
    }

    /**
     * Sets the value of the notAllowedStations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAllowedStations(String value) {
        this.notAllowedStations = value;
    }

    /**
     * Gets the value of the notAllowedStationKinds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotAllowedStationKinds() {
        return notAllowedStationKinds;
    }

    /**
     * Sets the value of the notAllowedStationKinds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotAllowedStationKinds(String value) {
        this.notAllowedStationKinds = value;
    }

    /**
     * Gets the value of the udfields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdfields() {
        return udfields;
    }

    /**
     * Sets the value of the udfields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdfields(String value) {
        this.udfields = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyType }
     *     
     */
    public CompanyType getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyType }
     *     
     */
    public void setCompany(CompanyType value) {
        this.company = value;
    }

    /**
     * Gets the value of the idAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAttribute() {
        return idAttribute;
    }

    /**
     * Sets the value of the idAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAttribute(String value) {
        this.idAttribute = value;
    }

}
