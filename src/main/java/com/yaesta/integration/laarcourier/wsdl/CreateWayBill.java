//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.09.02 a las 09:44:25 AM ECT 
//


package com.yaesta.integration.laarcourier.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objWayBillDetails" type="{http://schemas.datacontract.org/2004/07/WarehouseServices}WayBill" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "objWayBillDetails"
})
@XmlRootElement(name = "CreateWayBill", namespace = "http://tempuri.org/")
public class CreateWayBill {

    @XmlElementRef(name = "objWayBillDetails", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<WayBill> objWayBillDetails;

    /**
     * Obtiene el valor de la propiedad objWayBillDetails.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WayBill }{@code >}
     *     
     */
    public JAXBElement<WayBill> getObjWayBillDetails() {
        return objWayBillDetails;
    }

    /**
     * Define el valor de la propiedad objWayBillDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WayBill }{@code >}
     *     
     */
    public void setObjWayBillDetails(JAXBElement<WayBill> value) {
        this.objWayBillDetails = value;
    }

}
