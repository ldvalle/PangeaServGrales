package edesur.pangea.segen.backoffice.mac.beans;

import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.model.Parametros;
import org.apache.camel.Body;
import org.apache.camel.Header;

import java.util.Date;
import java.util.Map;

public class Aggregation {
    public void sucursalPadre(
            @Header(Headers.PARAMETROS_CONTACTO)Parametros parametros,
            @Header(Headers.SQL_OUTPUT) String sucursal
    ) {
        parametros.setSucursalPadre(sucursal);
    }

    public void addFeridado(
            @Header(Headers.PARAMETROS_CONTACTO)Parametros parametros,
            @Body Map<String, Object> row
    ) {
        parametros.getFeriados().add((Date) row.get("fecha"));
    }
}
