
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
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strCodigoCD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strRemInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strRemFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "strCodigoCD",
    "strRemInicial",
    "strRemFinal",
    "informacion",
    "respuesta",
    "mensaje"
})
@XmlRootElement(name = "ConsultarEstatusRemesasRangoCD")
public class ConsultarEstatusRemesasRangoCD {

    protected String clave;
    protected String strCodigoCD;
    protected String strRemInicial;
    protected String strRemFinal;
    protected String informacion;
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
     * Obtiene el valor de la propiedad strCodigoCD.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrCodigoCD() {
        return strCodigoCD;
    }

    /**
     * Define el valor de la propiedad strCodigoCD.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrCodigoCD(String value) {
        this.strCodigoCD = value;
    }

    /**
     * Obtiene el valor de la propiedad strRemInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrRemInicial() {
        return strRemInicial;
    }

    /**
     * Define el valor de la propiedad strRemInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrRemInicial(String value) {
        this.strRemInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad strRemFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrRemFinal() {
        return strRemFinal;
    }

    /**
     * Define el valor de la propiedad strRemFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrRemFinal(String value) {
        this.strRemFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad informacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacion() {
        return informacion;
    }

    /**
     * Define el valor de la propiedad informacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacion(String value) {
        this.informacion = value;
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
