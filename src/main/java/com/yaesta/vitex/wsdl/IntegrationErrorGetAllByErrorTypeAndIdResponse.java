//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.14 at 08:35:23 PM ECT 
//


package com.yaesta.vitex.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.yaesta.vitex.wsdl.dto.ArrayOfIntegrationErrorDTO;


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
 *         &lt;element name="IntegrationErrorGetAllByErrorTypeAndIdResult" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfIntegrationErrorDTO" minOccurs="0"/>
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
    "integrationErrorGetAllByErrorTypeAndIdResult"
})
@XmlRootElement(name = "IntegrationErrorGetAllByErrorTypeAndIdResponse")
public class IntegrationErrorGetAllByErrorTypeAndIdResponse {

    @XmlElementRef(name = "IntegrationErrorGetAllByErrorTypeAndIdResult", namespace = "http://tempuri.org/", type = JAXBElement.class)
    protected JAXBElement<ArrayOfIntegrationErrorDTO> integrationErrorGetAllByErrorTypeAndIdResult;

    /**
     * Gets the value of the integrationErrorGetAllByErrorTypeAndIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIntegrationErrorDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfIntegrationErrorDTO> getIntegrationErrorGetAllByErrorTypeAndIdResult() {
        return integrationErrorGetAllByErrorTypeAndIdResult;
    }

    /**
     * Sets the value of the integrationErrorGetAllByErrorTypeAndIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIntegrationErrorDTO }{@code >}
     *     
     */
    public void setIntegrationErrorGetAllByErrorTypeAndIdResult(JAXBElement<ArrayOfIntegrationErrorDTO> value) {
        this.integrationErrorGetAllByErrorTypeAndIdResult = ((JAXBElement<ArrayOfIntegrationErrorDTO> ) value);
    }

}
