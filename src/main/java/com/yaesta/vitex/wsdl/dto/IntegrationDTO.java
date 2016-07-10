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
 * <p>Java class for IntegrationDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegrationDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AbacosDecryptKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AbacosKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AbacosWebService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AutoIntegration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BrandIdDefault" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CategoryIdDefault" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CheckoutVersion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ClientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisableUtmCampaignOnMultiStore" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EspecificationSkuOnUniqueProduct" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IVDecryptKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IgnoreBrandForExistingProducts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IgnoreCategoryForExistingProducts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IgnoreNameForExistingProductsAndSkus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateDiscountOnItem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateEAN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateEspecification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateGiftListOnOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateKitComponentOnOrder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegratePrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrateTelemarketing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IntegrationWarehouse" type="{http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts}ArrayOfIntegrationWarehouseDTO" minOccurs="0"/>
 *         &lt;element name="LogSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LogXml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentIdWithoutTaxes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="VtexDecryptKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegrationDTO", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", propOrder = {
    "abacosDecryptKey",
    "abacosKey",
    "abacosWebService",
    "autoIntegration",
    "brandIdDefault",
    "categoryIdDefault",
    "checkoutVersion",
    "clientName",
    "disableUtmCampaignOnMultiStore",
    "especificationSkuOnUniqueProduct",
    "ivDecryptKey",
    "id",
    "ignoreBrandForExistingProducts",
    "ignoreCategoryForExistingProducts",
    "ignoreNameForExistingProductsAndSkus",
    "integrateDescription",
    "integrateDiscountOnItem",
    "integrateEAN",
    "integrateEspecification",
    "integrateGiftListOnOrder",
    "integrateKitComponentOnOrder",
    "integratePrice",
    "integrateTelemarketing",
    "integrationWarehouse",
    "logSuccess",
    "logXml",
    "orderStatus",
    "paymentIdWithoutTaxes",
    "vtexDecryptKey"
})
public class IntegrationDTO {

    @XmlElementRef(name = "AbacosDecryptKey", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<String> abacosDecryptKey;
    @XmlElementRef(name = "AbacosKey", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<String> abacosKey;
    @XmlElementRef(name = "AbacosWebService", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<String> abacosWebService;
    @XmlElement(name = "AutoIntegration")
    protected Boolean autoIntegration;
    @XmlElement(name = "BrandIdDefault")
    protected Integer brandIdDefault;
    @XmlElement(name = "CategoryIdDefault")
    protected Integer categoryIdDefault;
    @XmlElement(name = "CheckoutVersion")
    protected Integer checkoutVersion;
    @XmlElementRef(name = "ClientName", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<String> clientName;
    @XmlElement(name = "DisableUtmCampaignOnMultiStore")
    protected Boolean disableUtmCampaignOnMultiStore;
    @XmlElement(name = "EspecificationSkuOnUniqueProduct")
    protected Boolean especificationSkuOnUniqueProduct;
    @XmlElementRef(name = "IVDecryptKey", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<String> ivDecryptKey;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<Integer> id;
    @XmlElement(name = "IgnoreBrandForExistingProducts")
    protected Boolean ignoreBrandForExistingProducts;
    @XmlElement(name = "IgnoreCategoryForExistingProducts")
    protected Boolean ignoreCategoryForExistingProducts;
    @XmlElement(name = "IgnoreNameForExistingProductsAndSkus")
    protected Boolean ignoreNameForExistingProductsAndSkus;
    @XmlElement(name = "IntegrateDescription")
    protected Boolean integrateDescription;
    @XmlElement(name = "IntegrateDiscountOnItem")
    protected Boolean integrateDiscountOnItem;
    @XmlElement(name = "IntegrateEAN")
    protected Boolean integrateEAN;
    @XmlElement(name = "IntegrateEspecification")
    protected Boolean integrateEspecification;
    @XmlElement(name = "IntegrateGiftListOnOrder")
    protected Boolean integrateGiftListOnOrder;
    @XmlElement(name = "IntegrateKitComponentOnOrder")
    protected Boolean integrateKitComponentOnOrder;
    @XmlElement(name = "IntegratePrice")
    protected Boolean integratePrice;
    @XmlElement(name = "IntegrateTelemarketing")
    protected Boolean integrateTelemarketing;
    @XmlElementRef(name = "IntegrationWarehouse", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<ArrayOfIntegrationWarehouseDTO> integrationWarehouse;
    @XmlElement(name = "LogSuccess")
    protected Boolean logSuccess;
    @XmlElement(name = "LogXml")
    protected Boolean logXml;
    @XmlElementRef(name = "OrderStatus", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<String> orderStatus;
    @XmlElementRef(name = "PaymentIdWithoutTaxes", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<ArrayOfint> paymentIdWithoutTaxes;
    @XmlElementRef(name = "VtexDecryptKey", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts", type = JAXBElement.class)
    protected JAXBElement<String> vtexDecryptKey;

    /**
     * Gets the value of the abacosDecryptKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbacosDecryptKey() {
        return abacosDecryptKey;
    }

    /**
     * Sets the value of the abacosDecryptKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAbacosDecryptKey(JAXBElement<String> value) {
        this.abacosDecryptKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the abacosKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbacosKey() {
        return abacosKey;
    }

    /**
     * Sets the value of the abacosKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAbacosKey(JAXBElement<String> value) {
        this.abacosKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the abacosWebService property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbacosWebService() {
        return abacosWebService;
    }

    /**
     * Sets the value of the abacosWebService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAbacosWebService(JAXBElement<String> value) {
        this.abacosWebService = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the autoIntegration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoIntegration() {
        return autoIntegration;
    }

    /**
     * Sets the value of the autoIntegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoIntegration(Boolean value) {
        this.autoIntegration = value;
    }

    /**
     * Gets the value of the brandIdDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBrandIdDefault() {
        return brandIdDefault;
    }

    /**
     * Sets the value of the brandIdDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBrandIdDefault(Integer value) {
        this.brandIdDefault = value;
    }

    /**
     * Gets the value of the categoryIdDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCategoryIdDefault() {
        return categoryIdDefault;
    }

    /**
     * Sets the value of the categoryIdDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCategoryIdDefault(Integer value) {
        this.categoryIdDefault = value;
    }

    /**
     * Gets the value of the checkoutVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCheckoutVersion() {
        return checkoutVersion;
    }

    /**
     * Sets the value of the checkoutVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCheckoutVersion(Integer value) {
        this.checkoutVersion = value;
    }

    /**
     * Gets the value of the clientName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientName() {
        return clientName;
    }

    /**
     * Sets the value of the clientName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientName(JAXBElement<String> value) {
        this.clientName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the disableUtmCampaignOnMultiStore property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableUtmCampaignOnMultiStore() {
        return disableUtmCampaignOnMultiStore;
    }

    /**
     * Sets the value of the disableUtmCampaignOnMultiStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableUtmCampaignOnMultiStore(Boolean value) {
        this.disableUtmCampaignOnMultiStore = value;
    }

    /**
     * Gets the value of the especificationSkuOnUniqueProduct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEspecificationSkuOnUniqueProduct() {
        return especificationSkuOnUniqueProduct;
    }

    /**
     * Sets the value of the especificationSkuOnUniqueProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEspecificationSkuOnUniqueProduct(Boolean value) {
        this.especificationSkuOnUniqueProduct = value;
    }

    /**
     * Gets the value of the ivDecryptKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIVDecryptKey() {
        return ivDecryptKey;
    }

    /**
     * Sets the value of the ivDecryptKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIVDecryptKey(JAXBElement<String> value) {
        this.ivDecryptKey = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setId(JAXBElement<Integer> value) {
        this.id = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the ignoreBrandForExistingProducts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreBrandForExistingProducts() {
        return ignoreBrandForExistingProducts;
    }

    /**
     * Sets the value of the ignoreBrandForExistingProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreBrandForExistingProducts(Boolean value) {
        this.ignoreBrandForExistingProducts = value;
    }

    /**
     * Gets the value of the ignoreCategoryForExistingProducts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreCategoryForExistingProducts() {
        return ignoreCategoryForExistingProducts;
    }

    /**
     * Sets the value of the ignoreCategoryForExistingProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreCategoryForExistingProducts(Boolean value) {
        this.ignoreCategoryForExistingProducts = value;
    }

    /**
     * Gets the value of the ignoreNameForExistingProductsAndSkus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreNameForExistingProductsAndSkus() {
        return ignoreNameForExistingProductsAndSkus;
    }

    /**
     * Sets the value of the ignoreNameForExistingProductsAndSkus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreNameForExistingProductsAndSkus(Boolean value) {
        this.ignoreNameForExistingProductsAndSkus = value;
    }

    /**
     * Gets the value of the integrateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateDescription() {
        return integrateDescription;
    }

    /**
     * Sets the value of the integrateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateDescription(Boolean value) {
        this.integrateDescription = value;
    }

    /**
     * Gets the value of the integrateDiscountOnItem property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateDiscountOnItem() {
        return integrateDiscountOnItem;
    }

    /**
     * Sets the value of the integrateDiscountOnItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateDiscountOnItem(Boolean value) {
        this.integrateDiscountOnItem = value;
    }

    /**
     * Gets the value of the integrateEAN property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateEAN() {
        return integrateEAN;
    }

    /**
     * Sets the value of the integrateEAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateEAN(Boolean value) {
        this.integrateEAN = value;
    }

    /**
     * Gets the value of the integrateEspecification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateEspecification() {
        return integrateEspecification;
    }

    /**
     * Sets the value of the integrateEspecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateEspecification(Boolean value) {
        this.integrateEspecification = value;
    }

    /**
     * Gets the value of the integrateGiftListOnOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateGiftListOnOrder() {
        return integrateGiftListOnOrder;
    }

    /**
     * Sets the value of the integrateGiftListOnOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateGiftListOnOrder(Boolean value) {
        this.integrateGiftListOnOrder = value;
    }

    /**
     * Gets the value of the integrateKitComponentOnOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateKitComponentOnOrder() {
        return integrateKitComponentOnOrder;
    }

    /**
     * Sets the value of the integrateKitComponentOnOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateKitComponentOnOrder(Boolean value) {
        this.integrateKitComponentOnOrder = value;
    }

    /**
     * Gets the value of the integratePrice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratePrice() {
        return integratePrice;
    }

    /**
     * Sets the value of the integratePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratePrice(Boolean value) {
        this.integratePrice = value;
    }

    /**
     * Gets the value of the integrateTelemarketing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrateTelemarketing() {
        return integrateTelemarketing;
    }

    /**
     * Sets the value of the integrateTelemarketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrateTelemarketing(Boolean value) {
        this.integrateTelemarketing = value;
    }

    /**
     * Gets the value of the integrationWarehouse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIntegrationWarehouseDTO }{@code >}
     *     
     */
    public JAXBElement<ArrayOfIntegrationWarehouseDTO> getIntegrationWarehouse() {
        return integrationWarehouse;
    }

    /**
     * Sets the value of the integrationWarehouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIntegrationWarehouseDTO }{@code >}
     *     
     */
    public void setIntegrationWarehouse(JAXBElement<ArrayOfIntegrationWarehouseDTO> value) {
        this.integrationWarehouse = ((JAXBElement<ArrayOfIntegrationWarehouseDTO> ) value);
    }

    /**
     * Gets the value of the logSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogSuccess() {
        return logSuccess;
    }

    /**
     * Sets the value of the logSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogSuccess(Boolean value) {
        this.logSuccess = value;
    }

    /**
     * Gets the value of the logXml property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLogXml() {
        return logXml;
    }

    /**
     * Sets the value of the logXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLogXml(Boolean value) {
        this.logXml = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrderStatus(JAXBElement<String> value) {
        this.orderStatus = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the paymentIdWithoutTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getPaymentIdWithoutTaxes() {
        return paymentIdWithoutTaxes;
    }

    /**
     * Sets the value of the paymentIdWithoutTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setPaymentIdWithoutTaxes(JAXBElement<ArrayOfint> value) {
        this.paymentIdWithoutTaxes = ((JAXBElement<ArrayOfint> ) value);
    }

    /**
     * Gets the value of the vtexDecryptKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVtexDecryptKey() {
        return vtexDecryptKey;
    }

    /**
     * Sets the value of the vtexDecryptKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVtexDecryptKey(JAXBElement<String> value) {
        this.vtexDecryptKey = ((JAXBElement<String> ) value);
    }

}
