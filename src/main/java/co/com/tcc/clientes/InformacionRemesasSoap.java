
package co.com.tcc.clientes;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InformacionRemesasSoap", targetNamespace = "http://clientes.tcc.com.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InformacionRemesasSoap {


    /**
     * Recibe una clave de remesa y consulta la información básica correspondiente a esa remesa. Devuelve la información consultada en formato XML
     * 
     * @param clave
     * @param informacion
     * @param claveRemesa
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarInformacionRemesa", action = "http://clientes.tcc.com.co/ConsultarInformacionRemesa")
    @RequestWrapper(localName = "ConsultarInformacionRemesa", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarInformacionRemesa")
    @ResponseWrapper(localName = "ConsultarInformacionRemesaResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarInformacionRemesaResponse")
    public void consultarInformacionRemesa(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "claveRemesa", targetNamespace = "http://clientes.tcc.com.co/")
        String claveRemesa,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Recibe una clave de remesa y consulta la información de las novedades correspondientes a esa remesa en formato XML
     * 
     * @param clave
     * @param informacion
     * @param claveRemesa
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultaInformacionNovedades", action = "http://clientes.tcc.com.co/ConsultaInformacionNovedades")
    @RequestWrapper(localName = "ConsultaInformacionNovedades", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultaInformacionNovedades")
    @ResponseWrapper(localName = "ConsultaInformacionNovedadesResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultaInformacionNovedadesResponse")
    public void consultaInformacionNovedades(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "claveRemesa", targetNamespace = "http://clientes.tcc.com.co/")
        String claveRemesa,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Recibe el código de una novedad y devuelve la información del seguimiento de dicha novedad en formato XML
     * 
     * @param clave
     * @param informacion
     * @param codNovedad
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultaSeguimientoNovedades", action = "http://clientes.tcc.com.co/ConsultaSeguimientoNovedades")
    @RequestWrapper(localName = "ConsultaSeguimientoNovedades", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultaSeguimientoNovedades")
    @ResponseWrapper(localName = "ConsultaSeguimientoNovedadesResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultaSeguimientoNovedadesResponse")
    public void consultaSeguimientoNovedades(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "codNovedad", targetNamespace = "http://clientes.tcc.com.co/")
        String codNovedad,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Consulta un status corto de las remesas de un cliente para un rango de fechas. Devuelve la información consultada en formato XML
     * 
     * @param clave
     * @param fechaInicial
     * @param informacion
     * @param fechaFinal
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarEstatusCortoRemesasRangoFechas", action = "http://clientes.tcc.com.co/ConsultarEstatusCortoRemesasRangoFechas")
    @RequestWrapper(localName = "ConsultarEstatusCortoRemesasRangoFechas", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusCortoRemesasRangoFechas")
    @ResponseWrapper(localName = "ConsultarEstatusCortoRemesasRangoFechasResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusCortoRemesasRangoFechasResponse")
    public void consultarEstatusCortoRemesasRangoFechas(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "fechaInicial", targetNamespace = "http://clientes.tcc.com.co/")
        String fechaInicial,
        @WebParam(name = "fechaFinal", targetNamespace = "http://clientes.tcc.com.co/")
        String fechaFinal,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Consulta la información de la remesa cuyo número se ingrese en la propiedad NroRemesa.
     * 
     * @param clave
     * @param remesa
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarInformacionRemesaSmartphone", action = "http://clientes.tcc.com.co/ConsultarInformacionRemesaSmartphone")
    @RequestWrapper(localName = "ConsultarInformacionRemesaSmartphone", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarInformacionRemesaSmartphone")
    @ResponseWrapper(localName = "ConsultarInformacionRemesaSmartphoneResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarInformacionRemesaSmartphoneResponse")
    public void consultarInformacionRemesaSmartphone(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "Remesa", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<ClsRemesa> remesa,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Consulta la información de un arreglo de remesas de tipo clsRemesa, en donde el número de cada remesa a consultar se ingresa en la propiedad NroRemesa.
     * 
     * @param clave
     * @param arrRemesas
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarInformacionRemesasVariasSmartphone", action = "http://clientes.tcc.com.co/ConsultarInformacionRemesasVariasSmartphone")
    @RequestWrapper(localName = "ConsultarInformacionRemesasVariasSmartphone", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarInformacionRemesasVariasSmartphone")
    @ResponseWrapper(localName = "ConsultarInformacionRemesasVariasSmartphoneResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarInformacionRemesasVariasSmartphoneResponse")
    public void consultarInformacionRemesasVariasSmartphone(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "arrRemesas", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<ArrayOfClsRemesa> arrRemesas,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Consulta la información de un arreglo de remesas de tipo clsRemesa, en donde el número de cada remesa a consultar se ingresa en la propiedad NroRemesa (Fuente OSB)
     * 
     * @param clave
     * @param arrRemesasOUT
     * @param respuesta
     * @param mensaje
     * @param arrRemesasIn
     */
    @WebMethod(operationName = "ConsultarInformacionRemesasVariasSmartphoneOSB", action = "http://clientes.tcc.com.co/ConsultarInformacionRemesasVariasSmartphoneOSB")
    @RequestWrapper(localName = "ConsultarInformacionRemesasVariasSmartphoneOSB", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarInformacionRemesasVariasSmartphoneOSB")
    @ResponseWrapper(localName = "ConsultarInformacionRemesasVariasSmartphoneOSBResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarInformacionRemesasVariasSmartphoneOSBResponse")
    public void consultarInformacionRemesasVariasSmartphoneOSB(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "arrRemesasIn", targetNamespace = "http://clientes.tcc.com.co/")
        ArrayOfClsRemesa arrRemesasIn,
        @WebParam(name = "arrRemesasOUT", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<ArrayOfClsRemesa> arrRemesasOUT,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Consulta la información de un arreglo de remesas de tipo clsRemesa, en donde el número de cada remesa a consultar se ingresa en la propiedad NroRemesa (Fuente OSB)
     * 
     * @param clave
     * @param remesasrespuesta
     * @param remesas
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarInformacionRemesasEstados", action = "http://clientes.tcc.com.co/ConsultarInformacionRemesasEstados")
    @RequestWrapper(localName = "ConsultarInformacionRemesasEstados", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarInformacionRemesasEstados")
    @ResponseWrapper(localName = "ConsultarInformacionRemesasEstadosResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarInformacionRemesasEstadosResponse")
    public void consultarInformacionRemesasEstados(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "remesas", targetNamespace = "http://clientes.tcc.com.co/")
        ArrayOfRemesa remesas,
        @WebParam(name = "remesasrespuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<ArrayOfRemesaEstados> remesasrespuesta,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Consulta la información de las remesas de hasta 3 números de relación de envíos devolviendo la información en el arreglo de clases de tipo clsRemesa arrRemesas.
     * 
     * @param clave
     * @param arrRemesas
     * @param respuesta
     * @param mensaje
     * @param relacion3
     * @param relacion2
     * @param relacion1
     */
    @WebMethod(operationName = "ConsultarRelacionesEnvioSmartphone", action = "http://clientes.tcc.com.co/ConsultarRelacionesEnvioSmartphone")
    @RequestWrapper(localName = "ConsultarRelacionesEnvioSmartphone", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarRelacionesEnvioSmartphone")
    @ResponseWrapper(localName = "ConsultarRelacionesEnvioSmartphoneResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarRelacionesEnvioSmartphoneResponse")
    public void consultarRelacionesEnvioSmartphone(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "Relacion1", targetNamespace = "http://clientes.tcc.com.co/")
        int relacion1,
        @WebParam(name = "Relacion2", targetNamespace = "http://clientes.tcc.com.co/")
        int relacion2,
        @WebParam(name = "Relacion3", targetNamespace = "http://clientes.tcc.com.co/")
        int relacion3,
        @WebParam(name = "arrRemesas", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<ArrayOfClsRemesa> arrRemesas,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Recibe una remesa inicial y una remesa final para consultar el estatus de las remesas en dicho rango. Devuelve la información consultada en formato XML
     * 
     * @param clave
     * @param strRemFinal
     * @param informacion
     * @param strRemInicial
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarEstatusRemesasRango", action = "http://clientes.tcc.com.co/ConsultarEstatusRemesasRango")
    @RequestWrapper(localName = "ConsultarEstatusRemesasRango", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasRango")
    @ResponseWrapper(localName = "ConsultarEstatusRemesasRangoResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasRangoResponse")
    public void consultarEstatusRemesasRango(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "strRemInicial", targetNamespace = "http://clientes.tcc.com.co/")
        String strRemInicial,
        @WebParam(name = "strRemFinal", targetNamespace = "http://clientes.tcc.com.co/")
        String strRemFinal,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Recibe una lista de remesas para consultar el estatus de las remesas en dicho rango. Devuelve la información consultada en formato XML
     * 
     * @param clave
     * @param informacion
     * @param remesas
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarEstatusRemesasLista", action = "http://clientes.tcc.com.co/ConsultarEstatusRemesasLista")
    @RequestWrapper(localName = "ConsultarEstatusRemesasLista", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasLista")
    @ResponseWrapper(localName = "ConsultarEstatusRemesasListaResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasListaResponse")
    public void consultarEstatusRemesasLista(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "remesas", targetNamespace = "http://clientes.tcc.com.co/")
        String remesas,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Recibe una lista de remesas para consultar el estatus de las remesas en dicho rango. Devuelve la información consultada en formato XML
     * 
     * @param clave
     * @param informacion
     * @param remesas
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarEstatusRemesasListaBE", action = "http://clientes.tcc.com.co/ConsultarEstatusRemesasListaBE")
    @RequestWrapper(localName = "ConsultarEstatusRemesasListaBE", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasListaBE")
    @ResponseWrapper(localName = "ConsultarEstatusRemesasListaBEResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasListaBEResponse")
    public void consultarEstatusRemesasListaBE(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "remesas", targetNamespace = "http://clientes.tcc.com.co/")
        String remesas,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Recibe una lista de remesas para consultar el estatus de las remesas en dicho rango. Devuelve la información consultada en formato XML
     * 
     * @param consultar
     * @return
     *     returns co.com.tcc.clientes.TpSalida
     */
    @WebMethod(operationName = "ConsultarInformacionRemesasDetalle", action = "http://clientes.tcc.com.co/ConsultarInformacionRemesasDetalle")
    @WebResult(name = "ConsultarInformacionRemesasDetalleResult", targetNamespace = "http://clientes.tcc.com.co/")
    @RequestWrapper(localName = "ConsultarInformacionRemesasDetalle", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarInformacionRemesasDetalle")
    @ResponseWrapper(localName = "ConsultarInformacionRemesasDetalleResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarInformacionRemesasDetalleResponse")
    public TpSalida consultarInformacionRemesasDetalle(
        @WebParam(name = "consultar", targetNamespace = "http://clientes.tcc.com.co/")
        TpEntrada consultar);

    /**
     * Recibe una lista de remesas para consultar el estatus de las remesas en dicho rango. Devuelve la información consultada en formato XML
     * 
     * @param clave
     * @param informacion
     * @param remesas
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarEstatusRemesasListaOSB", action = "http://clientes.tcc.com.co/ConsultarEstatusRemesasListaOSB")
    @RequestWrapper(localName = "ConsultarEstatusRemesasListaOSB", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasListaOSB")
    @ResponseWrapper(localName = "ConsultarEstatusRemesasListaOSBResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasListaOSBResponse")
    public void consultarEstatusRemesasListaOSB(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "remesas", targetNamespace = "http://clientes.tcc.com.co/")
        String remesas,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Recibe una lista de remesas para consultar el estatus de las remesas en dicho rango con un origen determinado. Devuelve la información consultada en formato XML
     * 
     * @param clave
     * @param strRemFinal
     * @param informacion
     * @param strRemInicial
     * @param strCodigoCD
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarEstatusRemesasRangoCD", action = "http://clientes.tcc.com.co/ConsultarEstatusRemesasRangoCD")
    @RequestWrapper(localName = "ConsultarEstatusRemesasRangoCD", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasRangoCD")
    @ResponseWrapper(localName = "ConsultarEstatusRemesasRangoCDResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasRangoCDResponse")
    public void consultarEstatusRemesasRangoCD(
        @WebParam(name = "clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "strCodigoCD", targetNamespace = "http://clientes.tcc.com.co/")
        String strCodigoCD,
        @WebParam(name = "strRemInicial", targetNamespace = "http://clientes.tcc.com.co/")
        String strRemInicial,
        @WebParam(name = "strRemFinal", targetNamespace = "http://clientes.tcc.com.co/")
        String strRemFinal,
        @WebParam(name = "informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Recibe una lista de remesas para consultar el estatus de las remesas de dicha lista con un centro de distribución de origen. Devuelve la información consultada en formato XML
     * 
     * @param clave
     * @param informacion
     * @param remesas
     * @param strCodigoCD
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarEstatusRemesasListaCD", action = "http://clientes.tcc.com.co/ConsultarEstatusRemesasListaCD")
    @RequestWrapper(localName = "ConsultarEstatusRemesasListaCD", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasListaCD")
    @ResponseWrapper(localName = "ConsultarEstatusRemesasListaCDResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasListaCDResponse")
    public void consultarEstatusRemesasListaCD(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "remesas", targetNamespace = "http://clientes.tcc.com.co/")
        String remesas,
        @WebParam(name = "strCodigoCD", targetNamespace = "http://clientes.tcc.com.co/")
        String strCodigoCD,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Consulta las remesas de un cliente para un rango de fechas. Devuelve la información consultada en formato XML
     * 
     * @param clave
     * @param fechaInicial
     * @param informacion
     * @param fechaFinal
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarEstatusRemesasRangoFechas", action = "http://clientes.tcc.com.co/ConsultarEstatusRemesasRangoFechas")
    @RequestWrapper(localName = "ConsultarEstatusRemesasRangoFechas", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasRangoFechas")
    @ResponseWrapper(localName = "ConsultarEstatusRemesasRangoFechasResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasRangoFechasResponse")
    public void consultarEstatusRemesasRangoFechas(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "fechaInicial", targetNamespace = "http://clientes.tcc.com.co/")
        String fechaInicial,
        @WebParam(name = "fechaFinal", targetNamespace = "http://clientes.tcc.com.co/")
        String fechaFinal,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Consulta las remesas de un cliente para un rango de fechas. Devuelve la información consultada en formato XML, con tipo y número de documento referencia
     * 
     * @param clave
     * @param fechaInicial
     * @param informacion
     * @param fechaFinal
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarEstatusRemesasRangoFechasDocRef", action = "http://clientes.tcc.com.co/ConsultarEstatusRemesasRangoFechasDocRef")
    @RequestWrapper(localName = "ConsultarEstatusRemesasRangoFechasDocRef", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasRangoFechasDocRef")
    @ResponseWrapper(localName = "ConsultarEstatusRemesasRangoFechasDocRefResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasRangoFechasDocRefResponse")
    public void consultarEstatusRemesasRangoFechasDocRef(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "fechaInicial", targetNamespace = "http://clientes.tcc.com.co/")
        String fechaInicial,
        @WebParam(name = "fechaFinal", targetNamespace = "http://clientes.tcc.com.co/")
        String fechaFinal,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Recibe un documento referencia para consultar el estatus de la remesa segun el documento enviado. Devuelve la información consultada en formato XML
     * 
     * @param clave
     * @param informacion
     * @param respuesta
     * @param mensaje
     * @param documentoReferencia
     */
    @WebMethod(operationName = "ConsultarEstatusRemesasDocReferenciaOSB", action = "http://clientes.tcc.com.co/ConsultarEstatusRemesasDocReferenciaOSB")
    @RequestWrapper(localName = "ConsultarEstatusRemesasDocReferenciaOSB", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasDocReferenciaOSB")
    @ResponseWrapper(localName = "ConsultarEstatusRemesasDocReferenciaOSBResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasDocReferenciaOSBResponse")
    public void consultarEstatusRemesasDocReferenciaOSB(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "DocumentoReferencia", targetNamespace = "http://clientes.tcc.com.co/")
        String documentoReferencia,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Recibe un documento de referencia, una clave de remesa, una fecha inicial, una fecha final, el loguin del contacto y el estado de la remesa y devuelve la información de la remesa, el tracking,las novedades y el seguimiento
     * 
     * @param infoRemesaTracking
     * @param clave
     * @param fechaInicial
     * @param remesa
     * @param fechaFinal
     * @param usuarioLoguin
     * @param respuesta
     * @param mensaje
     * @param docReferencia
     * @param estadoRemesa
     */
    @WebMethod(operationName = "ConsultarRemesasTrackingMensajeria", action = "http://clientes.tcc.com.co/ConsultarRemesasTrackingMensajeria")
    @RequestWrapper(localName = "ConsultarRemesasTrackingMensajeria", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarRemesasTrackingMensajeria")
    @ResponseWrapper(localName = "ConsultarRemesasTrackingMensajeriaResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarRemesasTrackingMensajeriaResponse")
    public void consultarRemesasTrackingMensajeria(
        @WebParam(name = "clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "docReferencia", targetNamespace = "http://clientes.tcc.com.co/")
        String docReferencia,
        @WebParam(name = "remesa", targetNamespace = "http://clientes.tcc.com.co/")
        String remesa,
        @WebParam(name = "fechaInicial", targetNamespace = "http://clientes.tcc.com.co/")
        String fechaInicial,
        @WebParam(name = "fechaFinal", targetNamespace = "http://clientes.tcc.com.co/")
        String fechaFinal,
        @WebParam(name = "usuarioLoguin", targetNamespace = "http://clientes.tcc.com.co/")
        String usuarioLoguin,
        @WebParam(name = "estadoRemesa", targetNamespace = "http://clientes.tcc.com.co/")
        int estadoRemesa,
        @WebParam(name = "infoRemesaTracking", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> infoRemesaTracking,
        @WebParam(name = "respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Recibe un documento de referencia, una clave de remesa, una fecha inicial, una fecha final, el login del contacto y el estado de la remesa y devuelve la información de la remesa, el tracking, las novedades y el seguimiento
     * 
     * @param clave
     * @param fechaInicial
     * @param remesa
     * @param usuarioLogin
     * @param fechaFinal
     * @param respuesta
     * @param mensaje
     * @param consultarRemesasTrackingMensajeriaCRCResult
     * @param docReferencia
     * @param estadoRemesa
     */
    @WebMethod(operationName = "ConsultarRemesasTrackingMensajeriaCRC", action = "http://clientes.tcc.com.co/ConsultarRemesasTrackingMensajeriaCRC")
    @RequestWrapper(localName = "ConsultarRemesasTrackingMensajeriaCRC", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarRemesasTrackingMensajeriaCRC")
    @ResponseWrapper(localName = "ConsultarRemesasTrackingMensajeriaCRCResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarRemesasTrackingMensajeriaCRCResponse")
    public void consultarRemesasTrackingMensajeriaCRC(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "DocReferencia", targetNamespace = "http://clientes.tcc.com.co/")
        String docReferencia,
        @WebParam(name = "Remesa", targetNamespace = "http://clientes.tcc.com.co/")
        String remesa,
        @WebParam(name = "FechaInicial", targetNamespace = "http://clientes.tcc.com.co/")
        String fechaInicial,
        @WebParam(name = "FechaFinal", targetNamespace = "http://clientes.tcc.com.co/")
        String fechaFinal,
        @WebParam(name = "UsuarioLogin", targetNamespace = "http://clientes.tcc.com.co/")
        String usuarioLogin,
        @WebParam(name = "EstadoRemesa", targetNamespace = "http://clientes.tcc.com.co/")
        Integer estadoRemesa,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje,
        @WebParam(name = "ConsultarRemesasTrackingMensajeriaCRCResult", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.OUT)
        Holder<ArrayOfClsInfoRemesa> consultarRemesasTrackingMensajeriaCRCResult);

    /**
     * Consulta los puntos de venta cercanos a la latitud y longitud suministrada
     * 
     * @param clave
     * @param latitud
     * @param longitud
     * @param pdVs
     * @param cercaniaKMS
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarPDVsCercanos", action = "http://clientes.tcc.com.co/ConsultarPDVsCercanos")
    @RequestWrapper(localName = "ConsultarPDVsCercanos", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarPDVsCercanos")
    @ResponseWrapper(localName = "ConsultarPDVsCercanosResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarPDVsCercanosResponse")
    public void consultarPDVsCercanos(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "Latitud", targetNamespace = "http://clientes.tcc.com.co/")
        double latitud,
        @WebParam(name = "Longitud", targetNamespace = "http://clientes.tcc.com.co/")
        double longitud,
        @WebParam(name = "CercaniaKMS", targetNamespace = "http://clientes.tcc.com.co/")
        double cercaniaKMS,
        @WebParam(name = "PDVs", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<ArrayOfClsPuntoDeVenta> pdVs,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

    /**
     * Recibe una lista de documentos referencia del cliente para consultar el estatus de las remesas en dicho rango. Devuelve la información consultada en formato XML
     * 
     * @param clave
     * @param documentos
     * @param informacion
     * @param respuesta
     * @param mensaje
     */
    @WebMethod(operationName = "ConsultarEstatusRemesasListaDocumentos", action = "http://clientes.tcc.com.co/ConsultarEstatusRemesasListaDocumentos")
    @RequestWrapper(localName = "ConsultarEstatusRemesasListaDocumentos", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasListaDocumentos")
    @ResponseWrapper(localName = "ConsultarEstatusRemesasListaDocumentosResponse", targetNamespace = "http://clientes.tcc.com.co/", className = "co.com.tcc.clientes.ConsultarEstatusRemesasListaDocumentosResponse")
    public void consultarEstatusRemesasListaDocumentos(
        @WebParam(name = "Clave", targetNamespace = "http://clientes.tcc.com.co/")
        String clave,
        @WebParam(name = "documentos", targetNamespace = "http://clientes.tcc.com.co/")
        String documentos,
        @WebParam(name = "Informacion", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> informacion,
        @WebParam(name = "Respuesta", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<Integer> respuesta,
        @WebParam(name = "Mensaje", targetNamespace = "http://clientes.tcc.com.co/", mode = WebParam.Mode.INOUT)
        Holder<String> mensaje);

}
