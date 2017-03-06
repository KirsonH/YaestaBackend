
package co.com.tcc.clientes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrRemesasIn" type="{http://clientes.tcc.com.co/}ArrayOfClsRemesa" minOccurs="0"/>
 *         &lt;element name="arrRemesasOUT" type="{http://clientes.tcc.com.co/}ArrayOfClsRemesa" minOccurs="0"/>
 *         &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "clave",
    "arrRemesasIn",
    "arrRemesasOUT",
    "respuesta",
    "mensaje"
})
@XmlRootElement(name = "ConsultarInformacionRemesasVariasSmartphoneOSB")
public class ConsultarInformacionRemesasVariasSmartphoneOSB {

    @XmlElement(name = "Clave")
    protected String clave;
    protected ArrayOfClsRemesa arrRemesasIn;
    protected ArrayOfClsRemesa arrRemesasOUT;
    @XmlElement(name = "Respuesta")
    protected int respuesta;
    @XmlElement(name = "Mensaje")
    protected String mensaje;

    /**
     * Obtiene el valor de la propiedad clave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Define el valor de la propiedad clave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Obtiene el valor de la propiedad arrRemesasIn.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsRemesa }
     *     
     */
    public ArrayOfClsRemesa getArrRemesasIn() {
        return arrRemesasIn;
    }

    /**
     * Define el valor de la propiedad arrRemesasIn.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsRemesa }
     *     
     */
    public void setArrRemesasIn(ArrayOfClsRemesa value) {
        this.arrRemesasIn = value;
    }

    /**
     * Obtiene el valor de la propiedad arrRemesasOUT.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsRemesa }
     *     
     */
    public ArrayOfClsRemesa getArrRemesasOUT() {
        return arrRemesasOUT;
    }

    /**
     * Define el valor de la propiedad arrRemesasOUT.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsRemesa }
     *     
     */
    public void setArrRemesasOUT(ArrayOfClsRemesa value) {
        this.arrRemesasOUT = value;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     */
    public int getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     */
    public void setRespuesta(int value) {
        this.respuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad mensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Define el valor de la propiedad mensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

}
