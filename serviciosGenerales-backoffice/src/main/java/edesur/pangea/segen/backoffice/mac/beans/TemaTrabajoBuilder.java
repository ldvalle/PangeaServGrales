package edesur.pangea.segen.backoffice.mac.beans;

import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.model.TemaTrabajo;
import org.apache.camel.Header;

import java.util.Map;

public class TemaTrabajoBuilder {
    public TemaTrabajo crear(@Header(Headers.SQL_OUTPUT) Map<String, Object> resultado) {
        TemaTrabajo temaTrabajo = new TemaTrabajo();
        temaTrabajo.getTema().setCodigo(resultado.get("tema_codigo").toString());
        temaTrabajo.getTema().setDescripcion(resultado.get("tema_descripcion").toString());
        temaTrabajo.getTrabajo().setCodigo(resultado.get("trabajo_codigo").toString());
        temaTrabajo.getTrabajo().setDescripcion(resultado.get("trabajo_descripcion").toString());
        return temaTrabajo;
    }
}
