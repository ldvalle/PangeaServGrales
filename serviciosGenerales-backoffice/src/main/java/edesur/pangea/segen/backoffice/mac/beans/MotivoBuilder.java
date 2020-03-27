package edesur.pangea.segen.backoffice.mac.beans;

import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.model.Motivo;
import edesur.pangea.segen.webservice.model.ActuacionGenericaMessage;
import org.apache.camel.Body;
import org.apache.camel.Header;

import java.util.Map;

public class MotivoBuilder {
    public Motivo crear(@Body ActuacionGenericaMessage mensaje) {
        Motivo motivo = new Motivo();
        motivo.getMotivoCliente().setCodigo(mensaje.getRequest().getMotivo());
        motivo.getMotivoEmpresa().setCodigo(mensaje.getRequest().getSubMotivo());
        return motivo;
    }

    public void setDescipciones(@Header(Headers.MOTIVO_CONTACTO) Motivo motivo, @Header(Headers.SQL_OUTPUT)Map<String, Object> resultado) {
        motivo.getMotivoCliente().setDescripcion(resultado.get("motivo_cliente").toString());
        motivo.getMotivoEmpresa().setDescripcion(resultado.get("motivo_empresa").toString());
    }
}
