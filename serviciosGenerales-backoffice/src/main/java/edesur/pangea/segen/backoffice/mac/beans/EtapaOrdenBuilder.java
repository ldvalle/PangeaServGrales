package edesur.pangea.segen.backoffice.mac.beans;

import edesur.pangea.bs.fuse.ClavesDatosExtra;
import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.model.*;
import org.apache.camel.Header;

import java.util.HashMap;
import java.util.Map;

//LDV

public class EtapaOrdenBuilder {
    public EtapaOrden crear(
            @Header(Headers.PROCEDIMIENTO)Procedimiento procedimiento ) {
        EtapaOrden eOrden = new EtapaOrden();
        eOrden.setMensajeXnear(procedimiento.getNumeroMensaje());
        return eOrden;
    }

    public void setNumeroSegen(@Header(Headers.PROCEDIMIENTO) Procedimiento procedimiento, @Header(Headers.ETAPA_ORDEN) EtapaOrden eOrden) {
        eOrden.setMensajeXnear(procedimiento.getNumeroMensaje());
    }

    public Map<String, String> getDatosExtra(
            @Header(Headers.ETAPA_ORDEN)EtapaOrden eOrden
    ) {
        Map<String, String> datosExtra = new HashMap<>();
        datosExtra.put(ClavesDatosExtra.NumeroMensaje, orden.getNumeroMensaje());
        return datosExtra;
    }
}
