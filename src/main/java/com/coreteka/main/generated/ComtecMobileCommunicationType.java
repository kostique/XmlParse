
package com.coreteka.main.generated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for comtec-mobile-communicationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comtec-mobile-communicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message-out" type="{}message-outType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comtec-mobile-communicationType", propOrder = {
    "messageOut"
})
public class ComtecMobileCommunicationType {

    @XmlElement(name = "message-out", required = true)
    protected MessageOutType messageOut;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the messageOut property.
     * 
     * @return
     *     possible object is
     *     {@link MessageOutType }
     *     
     */
    public MessageOutType getMessageOut() {
        return messageOut;
    }

    /**
     * Sets the value of the messageOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageOutType }
     *     
     */
    public void setMessageOut(MessageOutType value) {
        this.messageOut = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
