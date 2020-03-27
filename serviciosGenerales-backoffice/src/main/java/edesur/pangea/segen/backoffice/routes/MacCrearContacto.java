package edesur.pangea.segen.backoffice.routes;

import edesur.pangea.segen.backoffice.Configuracion;
import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.beans.ParamsUtils;
import edesur.pangea.segen.backoffice.mac.beans.ContactoBuilder;
import edesur.pangea.util.CamelUtil;
import org.apache.camel.LoggingLevel;
import org.apache.camel.component.sql.SqlConstants;

public class MacCrearContacto extends BaseRouteBuilder {

    @Override
    public void configure() throws Exception {
        super.configure();

        from("direct:crear-contacto")
                .routeId("crear-contacto")
                .setHeader(Headers.CONTACTO, method(ContactoBuilder.class, "build"))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.CONTACTO));


        from("direct:grabar-contacto")
                .routeId("grabar-contacto")
                // obtener numero contacto
                .setHeader(SqlConstants.SQL_RETRIEVE_GENERATED_KEYS, constant(true))
                .to(CamelUtil.sqlUri("insertNumeroContacto", Configuracion.CONTACTO_DS))
                .bean(ContactoBuilder.class, "setNumeroContacto")
                .removeHeader(SqlConstants.SQL_RETRIEVE_GENERATED_KEYS)
                // convertir pojo a map para hacer los insert
                .bean(ParamsUtils.class, "getContactoProperties")
                // insert contacto y motivo
                .to(CamelUtil.sqlUri("insertContacto", Configuracion.CONTACTO_DS))
                .to(CamelUtil.sqlUri("insertContactoMotivo", Configuracion.CONTACTO_DS))
                // insert comentarios
                .split().method(ContactoBuilder.class, "splitComentario")
                    .to(CamelUtil.sqlUri("insertContactoComentarios", Configuracion.CONTACTO_DS))
                .end()
                .setHeader(Headers.DATOS_EXTRA, method(ContactoBuilder.class, "getDatosExtra"))
                .bean("asyncRequest", "addDatosExtra");
    }
}
