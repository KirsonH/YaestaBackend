//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.14 at 08:35:23 PM ECT 
//


package com.yaesta.integration.vitex.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="giftListTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="giftListId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eventDateSince" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="eventDateUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "giftListTypeId",
    "giftListId",
    "clientId",
    "eventDateSince",
    "eventDateUntil",
    "isActive"
})
@XmlRootElement(name = "GiftListV2Filters")
public class GiftListV2Filters {

    @XmlElementRef(name = "giftListTypeId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Integer> giftListTypeId;
    @XmlElementRef(name = "giftListId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Integer> giftListId;
    @XmlElementRef(name = "clientId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Integer> clientId;
    @XmlElementRef(name = "eventDateSince", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> eventDateSince;
    @XmlElementRef(name = "eventDateUntil", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> eventDateUntil;
    @XmlElementRef(name = "isActive", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Boolean> isActive;

    /**
     * Gets the value of the giftListTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGiftListTypeId() {
        return giftListTypeId;
    }

    /**
     * Sets the value of the giftListTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGiftListTypeId(JAXBElement<Integer> value) {
        this.giftListTypeId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the giftListId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGiftListId() {
        return giftListId;
    }

    /**
     * Sets the value of the giftListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGiftListId(JAXBElement<Integer> value) {
        this.giftListId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setClientId(JAXBElement<Integer> value) {
        this.clientId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the eventDateSince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEventDateSince() {
        return eventDateSince;
    }

    /**
     * Sets the value of the eventDateSince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEventDateSince(JAXBElement<XMLGregorianCalendar> value) {
        this.eventDateSince = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the eventDateUntil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEventDateUntil() {
        return eventDateUntil;
    }

    /**
     * Sets the value of the eventDateUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEventDateUntil(JAXBElement<XMLGregorianCalendar> value) {
        this.eventDateUntil = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsActive(JAXBElement<Boolean> value) {
        this.isActive = ((JAXBElement<Boolean> ) value);
    }

}