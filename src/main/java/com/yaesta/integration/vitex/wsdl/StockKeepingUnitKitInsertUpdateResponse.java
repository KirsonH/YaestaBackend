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

import com.yaesta.integration.vitex.wsdl.dto.StockKeepingUnitKitDTO;


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
 *         &lt;element name="StockKeepingUnitKitInsertUpdateResult" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}StockKeepingUnitKitDTO" minOccurs="0"/>
 *         &lt;element name="stockKeepingUnitKitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "stockKeepingUnitKitInsertUpdateResult",
    "stockKeepingUnitKitId"
})
@XmlRootElement(name = "StockKeepingUnitKitInsertUpdateResponse")
public class StockKeepingUnitKitInsertUpdateResponse {

    @XmlElementRef(name = "StockKeepingUnitKitInsertUpdateResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<StockKeepingUnitKitDTO> stockKeepingUnitKitInsertUpdateResult;
    @XmlElementRef(name = "stockKeepingUnitKitId", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<Integer> stockKeepingUnitKitId;

    /**
     * Gets the value of the stockKeepingUnitKitInsertUpdateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StockKeepingUnitKitDTO }{@code >}
     *     
     */
    public JAXBElement<StockKeepingUnitKitDTO> getStockKeepingUnitKitInsertUpdateResult() {
        return stockKeepingUnitKitInsertUpdateResult;
    }

    /**
     * Sets the value of the stockKeepingUnitKitInsertUpdateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StockKeepingUnitKitDTO }{@code >}
     *     
     */
    public void setStockKeepingUnitKitInsertUpdateResult(JAXBElement<StockKeepingUnitKitDTO> value) {
        this.stockKeepingUnitKitInsertUpdateResult = ((JAXBElement<StockKeepingUnitKitDTO> ) value);
    }

    /**
     * Gets the value of the stockKeepingUnitKitId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStockKeepingUnitKitId() {
        return stockKeepingUnitKitId;
    }

    /**
     * Sets the value of the stockKeepingUnitKitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStockKeepingUnitKitId(JAXBElement<Integer> value) {
        this.stockKeepingUnitKitId = ((JAXBElement<Integer> ) value);
    }

}