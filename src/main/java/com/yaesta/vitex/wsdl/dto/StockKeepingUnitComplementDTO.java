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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import com.yaesta.vitex.wsdl.base.ArrayOfint;


/**
 * <p>Java class for StockKeepingUnitComplementDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StockKeepingUnitComplementDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComplementType" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}StockKeepingUnitComplementDTO.ComplementTypeEnum" minOccurs="0"/>
 *         &lt;element name="StockKeepingUnitComplements" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="StockKeepingUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StockKeepingUnitComplementDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "complementType",
    "stockKeepingUnitComplements",
    "stockKeepingUnitId"
})
public class StockKeepingUnitComplementDTO {

    @XmlElement(name = "ComplementType")
    protected StockKeepingUnitComplementDTOComplementTypeEnum complementType;
    @XmlElementRef(name = "StockKeepingUnitComplements", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<ArrayOfint> stockKeepingUnitComplements;
    @XmlElement(name = "StockKeepingUnitId")
    protected Integer stockKeepingUnitId;

    /**
     * Gets the value of the complementType property.
     * 
     * @return
     *     possible object is
     *     {@link StockKeepingUnitComplementDTOComplementTypeEnum }
     *     
     */
    public StockKeepingUnitComplementDTOComplementTypeEnum getComplementType() {
        return complementType;
    }

    /**
     * Sets the value of the complementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockKeepingUnitComplementDTOComplementTypeEnum }
     *     
     */
    public void setComplementType(StockKeepingUnitComplementDTOComplementTypeEnum value) {
        this.complementType = value;
    }

    /**
     * Gets the value of the stockKeepingUnitComplements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getStockKeepingUnitComplements() {
        return stockKeepingUnitComplements;
    }

    /**
     * Sets the value of the stockKeepingUnitComplements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setStockKeepingUnitComplements(JAXBElement<ArrayOfint> value) {
        this.stockKeepingUnitComplements = ((JAXBElement<ArrayOfint> ) value);
    }

    /**
     * Gets the value of the stockKeepingUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStockKeepingUnitId() {
        return stockKeepingUnitId;
    }

    /**
     * Sets the value of the stockKeepingUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStockKeepingUnitId(Integer value) {
        this.stockKeepingUnitId = value;
    }

}
