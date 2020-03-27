package edesur.pangea.segen.backoffice.mac.beans;

import com.google.common.base.Splitter;
import edesur.pangea.bs.fuse.ClavesDatosExtra;
import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.model.Cliente;
import edesur.pangea.segen.backoffice.mac.model.Contacto;
import edesur.pangea.segen.backoffice.mac.model.Motivo;
import edesur.pangea.segen.backoffice.mac.model.Parametros;
import edesur.pangea.segen.webservice.model.ActuacionGenericaMessage;
import edesur.pangea.segen.webservice.model.RequestBase;
import org.apache.camel.Body;
import org.apache.camel.Header;
import org.apache.camel.component.sql.SqlConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactoBuilder {
    Logger logger = LoggerFactory.getLogger(ContactoBuilder.class);

    public Contacto build(
            @Body ActuacionGenericaMessage mensaje,
            @Header(Headers.DATOS_CLIENTE) Cliente cliente,
            @Header(Headers.PARAMETROS_CONTACTO) Parametros parametros,
            @Header(Headers.MOTIVO_CONTACTO)Motivo motivo
            ) {
        RequestBase request = mensaje.getRequest();

        Contacto contacto = new Contacto();

        contacto.setFechaInicio(mensaje.getRecibido());

        contacto.setRolInicio(request.getSolicitante());
        contacto.setComentarios(request.getComentarios());

        contacto.setNumeroCliente(cliente.getNumero());
        contacto.setNombre(cliente.getNombre());
        contacto.setTipoDocumento(cliente.getTipoDocumento());
        contacto.setNumeroDocumento(cliente.getNumeroDocumento());
        contacto.setTelefono(cliente.getTelefono());
        contacto.setCuit(cliente.getCuit());
        contacto.setTarifa(cliente.getTarifa());
        contacto.setPartido(cliente.getPartido());
        contacto.setDireccion(cliente.getDireccion());
        contacto.setCodigoPostal(cliente.getCodigoPostal());
        contacto.setPlan(cliente.getPlan());
        contacto.setRolInicio("SF" + cliente.getSucursal());
        contacto.setCentroOperativo(cliente.getSucursal());


        contacto.setSucursalCliente(parametros.getSucursalPadre());
        contacto.setTipo(parametros.getTipoContacto());
        contacto.setFechaVencimiento(parametros.calcularFechaVencimiento(contacto.getFechaInicio(), Parametros.TipoVencimiento.Contacto));
        contacto.setFechaVencimientoCT(parametros.calcularFechaVencimiento(contacto.getFechaInicio(), Parametros.TipoVencimiento.CT));

        contacto.setMotivo(motivo.getMotivoCliente().getCodigo());
        contacto.setDescripcionMotivo(motivo.getMotivoCliente().getDescripcion());
        contacto.setMotivoEmpresa(motivo.getMotivoEmpresa().getCodigo());
        contacto.setDescripcionMotivoEmpresa(motivo.getMotivoEmpresa().getDescripcion());

        return contacto;
    }

    public Contacto setNumeroContacto(@Header(Headers.CONTACTO) Contacto contacto, @Header(SqlConstants.SQL_GENERATED_KEYS_DATA) List<Map<String, Object>> rows) {
        Integer numero = (Integer) rows.get(0).get("nu_co_numero");
        logger.debug("Numero Contacto {}", numero);
        contacto.setNumero(numero);
        return contacto;
    }

    public List<String> splitComentario(@Header(Headers.CONTACTO) Contacto contacto) {
        List<String> lista = new ArrayList<>();
        for(String s : Splitter.fixedLength(250).split(contacto.getComentarios())) {
            lista.add(s);
        }
        return lista;
    }

    public Map<String, String> getDatosExtra(
            @Header(Headers.DATOS_CLIENTE) Cliente cliente,
            @Header(Headers.CONTACTO) Contacto contacto
    ) {
        Map<String, String> datosExtra = new HashMap<>();
        datosExtra.put(ClavesDatosExtra.NumeroCliente, Integer.toString(cliente.getNumero()));
        datosExtra.put(ClavesDatosExtra.Tarifa, "1");
        datosExtra.put(ClavesDatosExtra.NumeroContacto, Integer.toString(contacto.getNumero()));
        return datosExtra;
    }
}
