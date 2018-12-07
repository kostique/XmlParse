
package com.coreteka.main.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated& in the com.xyz.schema.generated& package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ComtecMobileCommunication_QNAME = new QName("", "comtec-mobile-communication");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xyz.schema.generated&
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalendarType }
     * 
     */
    public CalendarType createCalendarType() {
        return new CalendarType();
    }

    /**
     * Create an instance of {@link CalendarVersionType }
     * 
     */
    public CalendarVersionType createCalendarVersionType() {
        return new CalendarVersionType();
    }

    /**
     * Create an instance of {@link DayEntryType }
     * 
     */
    public DayEntryType createDayEntryType() {
        return new DayEntryType();
    }

    /**
     * Create an instance of {@link CapabilityType }
     * 
     */
    public CapabilityType createCapabilityType() {
        return new CapabilityType();
    }

    /**
     * Create an instance of {@link CompanyType }
     * 
     */
    public CompanyType createCompanyType() {
        return new CompanyType();
    }

    /**
     * Create an instance of {@link Resources }
     * 
     */
    public Resources createResourcesType() {
        return new Resources();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link ResourceStatusType }
     * 
     */
    public ResourceStatusType createResourceStatusType() {
        return new ResourceStatusType();
    }

    /**
     * Create an instance of {@link UdfieldType }
     * 
     */
    public UdfieldType createUdfieldType() {
        return new UdfieldType();
    }

    /**
     * Create an instance of {@link AddressKindType }
     * 
     */
    public AddressKindType createAddressKindType() {
        return new AddressKindType();
    }

    /**
     * Create an instance of {@link CoordinatesType }
     * 
     */
    public CoordinatesType createCoordinatesType() {
        return new CoordinatesType();
    }

    /**
     * Create an instance of {@link DivisionType }
     * 
     */
    public DivisionType createDivisionType() {
        return new DivisionType();
    }

    /**
     * Create an instance of {@link UdfieldsType }
     * 
     */
    public UdfieldsType createUdfieldsType() {
        return new UdfieldsType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link ResourceKindType }
     * 
     */
    public ResourceKindType createResourceKindType() {
        return new ResourceKindType();
    }

    /**
     * Create an instance of {@link PlanRegionType }
     * 
     */
    public PlanRegionType createPlanRegionType() {
        return new PlanRegionType();
    }

    /**
     * Create an instance of {@link MessageOutType }
     * 
     */
    public MessageOutType createMessageOutType() {
        return new MessageOutType();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResourceType() {
        return new Resource();
    }

    /**
     * Create an instance of {@link CalendarVersionsType }
     * 
     */
    public CalendarVersionsType createCalendarVersionsType() {
        return new CalendarVersionsType();
    }

    /**
     * Create an instance of {@link PlanGroupType }
     * 
     */
    public PlanGroupType createPlanGroupType() {
        return new PlanGroupType();
    }

    /**
     * Create an instance of {@link CapabilitiesType }
     * 
     */
    public CapabilitiesType createCapabilitiesType() {
        return new CapabilitiesType();
    }

    /**
     * Create an instance of {@link ComtecMobileCommunicationType }
     * 
     */
    public ComtecMobileCommunicationType createComtecMobileCommunicationType() {
        return new ComtecMobileCommunicationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComtecMobileCommunicationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "comtec-mobile-communication")
    public JAXBElement<ComtecMobileCommunicationType> createComtecMobileCommunication(ComtecMobileCommunicationType value) {
        return new JAXBElement<ComtecMobileCommunicationType>(_ComtecMobileCommunication_QNAME, ComtecMobileCommunicationType.class, null, value);
    }

}
