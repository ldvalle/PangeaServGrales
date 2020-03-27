package edesur.pangea.segen.backoffice.mac.beans;

import edesur.pangea.bs.fuse.ClavesDatosExtra;
import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.model.*;
import org.apache.camel.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class SegenBuilder {
    Logger logger = LoggerFactory.getLogger(SegenBuilder.class);

    public Segen crearSegen(
            @Header(Headers.CONTACTO)Contacto contacto,
            @Header(Headers.DATOS_CLIENTE)Cliente cliente,
            @Header(Headers.TEMA_TRABAJO)TemaTrabajo temaTrabajo,
            @Header(Headers.ROL_DESTINO) String rolDestino
    ) {
        return new Segen(contacto, cliente, temaTrabajo, rolDestino);
    }

    public void setNumeroContacto(@Header(Headers.PROCEDIMIENTO) Segen segen, @Header(Headers.CONTACTO)Contacto contacto) {
        segen.setReferencia(segen.getReferencia() + contacto.getNumero());
    }

    public void setNumeroMensaje(@Header(Headers.PROCEDIMIENTO) Segen segen, @Header(Headers.SQL_OUTPUT) Long numero) {
        logger.debug("Numero Mensaje {}", numero);
        segen.setNumeroMensaje(numero);
    }

    public Map<String, String> getDatosExtra(
            @Header(Headers.PROCEDIMIENTO)Procedimiento procedimiento
            ) {
        Map<String, String> datosExtra = new HashMap<>();
        datosExtra.put(ClavesDatosExtra.NumeroSolicitud, Long.toString(procedimiento.getNumeroMensaje()));
        return datosExtra;
    }
}
