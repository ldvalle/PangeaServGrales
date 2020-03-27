package edesur.pangea.segen.backoffice.mac.beans;

import edesur.pangea.segen.backoffice.Headers;
import org.apache.camel.Header;

import java.util.Map;

public class Destino {
    public String getDestino(@Header(Headers.SQL_OUTPUT)Map<String, Object> row) {
        return row.get("destino").toString();
    }

    public String getCodigoAgrupacion(@Header(Headers.SQL_OUTPUT)Map<String, Object> row) {
        return row.get("codigo_agrupacion").toString();
    }
}
