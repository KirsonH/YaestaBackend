//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.14 at 08:35:23 PM ECT 
//


package com.yaesta.vitex.wsdl.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StockKeepingUnitComplementDTO.ComplementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StockKeepingUnitComplementDTO.ComplementTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accessory"/>
 *     &lt;enumeration value="Sugestion"/>
 *     &lt;enumeration value="Similarly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StockKeepingUnitComplementDTO.ComplementTypeEnum", namespace = "http://schemas.datacontract.org/2004/07/Vtex.Commerce.WebApps.AdminWcfService.Contracts")
@XmlEnum
public enum StockKeepingUnitComplementDTOComplementTypeEnum {

    @XmlEnumValue("Accessory")
    ACCESSORY("Accessory"),
    @XmlEnumValue("Sugestion")
    SUGESTION("Sugestion"),
    @XmlEnumValue("Similarly")
    SIMILARLY("Similarly");
    private final String value;

    StockKeepingUnitComplementDTOComplementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StockKeepingUnitComplementDTOComplementTypeEnum fromValue(String v) {
        for (StockKeepingUnitComplementDTOComplementTypeEnum c: StockKeepingUnitComplementDTOComplementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
