package edesur.pangea.segen.backoffice.mac.beans;

import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.model.*;
import org.apache.camel.Header;

public class OtMacBuilder {
    public OtMac crear(
            @Header(Headers.DATOS_CLIENTE) DatosCliente cliente
            @Header(Headers.PROCEDIMIENTO)Procedimiento procedimiento,
            @Header(Headers.TEMA_TRABAJO) TemaTrabajo temaTrabajo
            ) {
		OtMac r = new OtMac();

		r.numero_cliente = cliente.getNumero();
		r.mensaje_xnear = procedimiento.getNumeroMensaje();
		r.sucursal_padre = cliente.getSucPadre();
		r.sucursal = cliente.getSucursal();
		r.sector = cliente.getPlan();
		r.zona = cliente.getZona();
		r.correlativo_ruta = cliente.getCorrelativoRuta();
		r.tipo_traba = "SE" + temaTrabajo.getTema.getCodigo.substring(0,2);
		r.area_interloc
		r.motivo
		r.rol_ejecuta
		r.area_ejecuta
		r.potencia
		r.tension
		r.acometida
		r.toma
		r.conexion
		r.fecha_vto
		r.proyecto


/*
		r.setServidor(1);
		r.setMensaje(procedimiento.getNumeroMensaje());
		r.setOrden(orden.getNumeroOrden());
		r.setMotEmpresa(contacto.getMotivoEmpresa());
		r.setMotCliente(contacto.getMotivo());
		r.setNroContacto(contacto.getNumero())
		r.setSucContacto(contacto.getSucContacto());
		r.setFechaCreacion(contacto.getFechaInicio());
		r.setRolCreacion(contacto.getRolInicio());
		r.setAreaCreacion(orden.getAreaEmisora());
		r.setFechaVtoReal(contacto.getFechaVencimiento());
		r.setFechaVto(contacto.getFechaVencimiento());
		r.setFechaModif(contacto.getFechaInicio());
		r.setRolDestino(procedimiento.getRolDestino());
		r.setTema(orden.getTema());
        r.setTrabajo(orden.getTrabajo());
*/
        return  r;
    }
    
}
