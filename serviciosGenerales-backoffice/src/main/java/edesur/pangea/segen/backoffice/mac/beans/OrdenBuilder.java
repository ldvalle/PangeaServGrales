package edesur.pangea.segen.backoffice.mac.beans;

import edesur.pangea.bs.fuse.ClavesDatosExtra;
import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.model.*;
import org.apache.camel.Header;

import java.util.HashMap;
import java.util.Map;

public class OrdenBuilder {
    public Orden crear(
            @Header(Headers.CONTACTO) Contacto contacto,
            @Header(Headers.TEMA_TRABAJO) TemaTrabajo temaTrabajo,
            @Header(Headers.DATOS_CLIENTE) Cliente cliente,
            @Header(Headers.PROCEDIMIENTO)Procedimiento procedimiento,
            @Header(Headers.AREA_DESTINO) String areaDestino) {
        Orden orden = new Orden();
        orden.setMensajeXnear(procedimiento.getNumeroMensaje());
        orden.setSucursal(contacto.getSucursalCliente());
        orden.setAreaEjecutora(areaDestino);
        orden.setTema(temaTrabajo.getTema().getCodigo());
        orden.setTrabajo(temaTrabajo.getTrabajo().getCodigo());
        orden.setNumeroCliente(contacto.getNumeroCliente());
        orden.setVencimiento(contacto.getFechaVencimiento());
        orden.setCuentaConver(cliente.getCuentaConver());
        return orden;
    }

    public void setNumeroSegen(@Header(Headers.PROCEDIMIENTO) Procedimiento procedimiento, @Header(Headers.ORDEN) Orden orden) {
        orden.setMensajeXnear(procedimiento.getNumeroMensaje());
    }

    public void setNumeroOrden(@Header(Headers.ORDEN) Orden orden, @Header(Headers.SQL_OUTPUT) String numeroOrden) {
        orden.setNumeroOrden(numeroOrden);
    }

    public Map<String, String> getDatosExtra(
            @Header(Headers.ORDEN)Orden orden
    ) {
        Map<String, String> datosExtra = new HashMap<>();
        datosExtra.put(ClavesDatosExtra.NumeroOrden, orden.getNumeroOrden());
        return datosExtra;
    }
}
