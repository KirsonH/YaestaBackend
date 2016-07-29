//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.14 at 08:35:23 PM ECT 
//


package com.yaesta.integration.vitex.wsdl.dto;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import com.yaesta.integration.vitex.wsdl.base.TransactionAction;


/**
 * <p>Java class for GiftCardTransactionItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiftCardTransactionItemDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RedemptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StockKeepingUnitId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TransactionAction" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}TransactionAction" minOccurs="0"/>
 *         &lt;element name="TransactionConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiftCardTransactionItemDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "orderId",
    "redemptionCode",
    "stockKeepingUnitId",
    "transactionAction",
    "transactionConfirmed",
    "value"
})
public class GiftCardTransactionItemDTO {

    @XmlElementRef(name = "OrderId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<Integer> orderId;
    @XmlElementRef(name = "RedemptionCode", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<String> redemptionCode;
    @XmlElementRef(name = "StockKeepingUnitId", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<Integer> stockKeepingUnitId;
    @XmlElement(name = "TransactionAction")
    protected TransactionAction transactionAction;
    @XmlElement(name = "TransactionConfirmed")
    protected Boolean transactionConfirmed;
    @XmlElementRef(name = "Value", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> value;

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setOrderId(JAXBElement<Integer> value) {
        this.orderId = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the redemptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedemptionCode() {
        return redemptionCode;
    }

    /**
     * Sets the value of the redemptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedemptionCode(JAXBElement<String> value) {
        this.redemptionCode = ((JAXBElement<String> ) value);
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
     * Gets the value of the transactionAction property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAction }
     *     
     */
    public TransactionAction getTransactionAction() {
        return transactionAction;
    }

    /**
     * Sets the value of the transactionAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAction }
     *     
     */
    public void setTransactionAction(TransactionAction value) {
        this.transactionAction = value;
    }

    /**
     * Gets the value of the transactionConfirmed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransactionConfirmed() {
        return transactionConfirmed;
    }

    /**
     * Sets the value of the transactionConfirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransactionConfirmed(Boolean value) {
        this.transactionConfirmed = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValue(JAXBElement<BigDecimal> value) {
        this.value = ((JAXBElement<BigDecimal> ) value);
    }

}