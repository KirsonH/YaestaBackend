//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.14 at 08:35:23 PM ECT 
//


package com.yaesta.vitex.wsdl.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WareHouseIStockableDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WareHouseIStockableDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailableQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ReservedQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StockKeepingUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WareHouseId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="WareHouseIdV3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WareHouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WareHouseIStockableDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "availableQuantity",
    "reservedQuantity",
    "stockKeepingUnitId",
    "totalQuantity",
    "wareHouseId",
    "wareHouseIdV3",
    "wareHouseName"
})
public class WareHouseIStockableDTO {

    @XmlElementRef(name = "AvailableQuantity", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<Integer> availableQuantity;
    @XmlElementRef(name = "ReservedQuantity", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<Integer> reservedQuantity;
    @XmlElementRef(name = "StockKeepingUnitId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<Integer> stockKeepingUnitId;
    @XmlElementRef(name = "TotalQuantity", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<Integer> totalQuantity;
    @XmlElementRef(name = "WareHouseId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<Integer> wareHouseId;
    @XmlElementRef(name = "WareHouseIdV3", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<String> wareHouseIdV3;
    @XmlElementRef(name = "WareHouseName", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<String> wareHouseName;

    /**
     * Gets the value of the availableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Sets the value of the availableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAvailableQuantity(JAXBElement<Integer> value) {
        this.availableQuantity = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the reservedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReservedQuantity() {
        return reservedQuantity;
    }

    /**
     * Sets the value of the reservedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReservedQuantity(JAXBElement<Integer> value) {
        this.reservedQuantity = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the stockKeepingUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStockKeepingUnitId() {
        return stockKeepingUnitId;
    }

    /**
     * Sets the value of the stockKeepingUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStockKeepingUnitId(JAXBElement<Integer> value) {
        this.stockKeepingUnitId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the totalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTotalQuantity(JAXBElement<Integer> value) {
        this.totalQuantity = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the wareHouseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getWareHouseId() {
        return wareHouseId;
    }

    /**
     * Sets the value of the wareHouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setWareHouseId(JAXBElement<Integer> value) {
        this.wareHouseId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the wareHouseIdV3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWareHouseIdV3() {
        return wareHouseIdV3;
    }

    /**
     * Sets the value of the wareHouseIdV3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWareHouseIdV3(JAXBElement<String> value) {
        this.wareHouseIdV3 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the wareHouseName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWareHouseName() {
        return wareHouseName;
    }

    /**
     * Sets the value of the wareHouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWareHouseName(JAXBElement<String> value) {
        this.wareHouseName = ((JAXBElement<String> ) value);
    }

}
