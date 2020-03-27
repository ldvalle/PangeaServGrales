package edesur.pangea.segen.backoffice.candela;

import edesur.pangea.bs.candela.CodigosRST;
import edesur.pangea.bs.fuse.ClavesDatosExtra;
import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.webservice.model.ActuacionGenericaMessage;
import org.apache.camel.Body;
import org.apache.camel.Header;
import org.apache.camel.PropertyInject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Creacion {
    private static final Logger logger = LoggerFactory.getLogger(Creacion.class);

    @PropertyInject("segen.enviorst")
    private String programaRST;


    public boolean enviarRST(@Body ActuacionGenericaMessage message) {
        String motivo = message.getRequest().getMotivo();
        String submotivo = message.getRequest().getSubMotivo();
        boolean enviarRST = CodigosRST.enviarRST(motivo, submotivo);

        logger.info("Motivo {}, Submotivo {} -> Enviar a RST: {}", motivo, motivo, enviarRST);

        return enviarRST;
    }

    public void setParametrosSP(@Body ActuacionGenericaMessage message, @org.apache.camel.Headers Map<String, Object> headers ) {
        List<Object> parametros = new ArrayList<>();
        parametros.add(message.getRequest().getNumeroCasoSFDC());
        parametros.add(message.getClienteMapping().getNumeroCliente());
        parametros.add(message.getRequest().getMotivo());
        parametros.add(message.getRequest().getSubMotivo());
        parametros.add("41");
        parametros.add(message.getRequest().getComentarios());
        parametros.add(message.getRequest().getDescripcion());
        parametros.add(message.getRequest().getSolicitante());
        parametros.add(message.getRequest().getNombreRepresentante());
        parametros.add(message.getRequest().getTelefonoRepresentante());
        parametros.add(message.getRequest().getTipoDocumento());
        parametros.add(message.getRequest().getNumeroDocumento());
        headers.put(Headers.PARAMETROS_SP, parametros);
    }

    public String getNumeroSolicitud(@Header(Headers.OUTPUT_STORED_PROCEDURE) Map<String, Object> outputSP) {
        return (outputSP == null ? "-1" : outputSP.get(Headers.NUMERO_SOLICITUD).toString());
    }

    public Map<String, String> getDatosExtra(
            @Header(Headers.NUMERO_CLIENTE) String numeroCliente,
            @Header(Headers.TARIFA_CLIENTE) String tarifa,
            @Header(Headers.NUMERO_SOLICITUD) String numeroSolicitud
    ) {
        Map<String, String> datosExtra = new HashMap<>();
        datosExtra.put(ClavesDatosExtra.NumeroCliente, numeroCliente);
        datosExtra.put(ClavesDatosExtra.Tarifa, tarifa);
        datosExtra.put(ClavesDatosExtra.NumeroSolicitud, numeroSolicitud);
        return datosExtra;
    }

    public String getComandoEnviarRST(@Header(Headers.NUMERO_SOLICITUD) String numeroSolictud) throws Exception {
        if (programaRST == null) {
            throw new Exception("No tengo el programa a invocar");
        }
        String cmd = programaRST + " " + numeroSolictud + " 2>&1";
        logger.debug("cmd ssh: {}", cmd);
        return cmd;
    }
}
