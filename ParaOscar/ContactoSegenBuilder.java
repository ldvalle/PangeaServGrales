package edesur.pangea.segen.backoffice.mac.beans;

import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.model.*;
import org.apache.camel.Header;

public class ContactoSegenBuilder {
    public ContactoSegen crear(
            @Header(Headers.CONTACTO) Contacto contacto,
            @Header(Headers.PROCEDIMIENTO)Procedimiento procedimiento,
            @Header(Headers.TEMA_TRABAJO) TemaTrabajo temaTrabajo,
            @Header(Headers.ORDEN) Orden orden,
            ) {
        ContactoSegen r = new ContactoSegen();

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
        return  r;
    }
    
}


