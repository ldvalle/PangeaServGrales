package edesur.pangea.segen.backoffice.routes;

import edesur.pangea.segen.backoffice.Configuracion;
import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.beans.Aggregation;
import edesur.pangea.segen.backoffice.mac.beans.Destino;
import edesur.pangea.segen.backoffice.mac.beans.MotivoBuilder;
import edesur.pangea.segen.backoffice.mac.beans.TemaTrabajoBuilder;
import edesur.pangea.segen.backoffice.mac.model.Cliente;
import edesur.pangea.segen.backoffice.mac.model.DatosTecnicos;
import edesur.pangea.segen.backoffice.mac.model.Parametros;
import edesur.pangea.util.CamelUtil;
import org.apache.camel.LoggingLevel;

import javax.ws.rs.HEAD;

public class MacCargarDatos extends BaseRouteBuilder {
    @Override
    public void configure() throws Exception {
        super.configure();

        from("direct:cargar-datos-cliente")
                .routeId("cargar-datos-cliente")
                .to(CamelUtil.sqlUriToHeader("cliente", Configuracion.SYNERGIA_DS, Headers.DATOS_CLIENTE, Cliente.class))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.DATOS_CLIENTE));

        from("direct:cargar-parametros")
                .routeId("cargar-parametros")
                .to(CamelUtil.sqlUriToHeader("plazoTipoContacto", Configuracion.CONTACTO_DS, Headers.PARAMETROS_CONTACTO, Parametros.class))
                .to(CamelUtil.sqlUriToHeaderSelectOne("sucursalPadre", Configuracion.CONTACTO_DS, Headers.SQL_OUTPUT))
                .bean(Aggregation.class, "sucursalPadre")
                .to(CamelUtil.sqlUriToHeader("feriados", Configuracion.SYNERGIA_DS, Headers.SQL_OUTPUT))
                .split(header(Headers.SQL_OUTPUT))
                    .bean(Aggregation.class, "addFeridado")
                .end()
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.PARAMETROS_CONTACTO));

        from("direct:cargar-motivos")
                .routeId("cargar-motivos")
                .setHeader(Headers.MOTIVO_CONTACTO, method(MotivoBuilder.class, "crear"))
                .to(CamelUtil.sqlUriToHeaderSelectOne("descripcionMotivo", Configuracion.CONTACTO_DS, Headers.SQL_OUTPUT))
                .bean(MotivoBuilder.class, "setDescipciones")
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.MOTIVO_CONTACTO));

        from("direct:cargar-tema-trabajo")
                .routeId("cargar-tema-trabajo")
                .to(CamelUtil.sqlUriToHeaderSelectOne("temaTrabajo", Configuracion.CONTACTO_DS, Headers.SQL_OUTPUT))
                .setHeader(Headers.TEMA_TRABAJO, method(TemaTrabajoBuilder.class, "crear"))
                .setHeader(Headers.GENERA_OT, method(TemaTrabajo.class,"getGenOT"))  //LDV
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.TEMA_TRABAJO));

        from("direct:cargar-rol-destino")
                .routeId("cargar-rol-destino")
                .to(CamelUtil.sqlUriToHeaderSelectOne("rolDestino", Configuracion.SYNERGIA_DS, Headers.SQL_OUTPUT))
                .setHeader(Headers.ROL_DESTINO, method(Destino.class, "getDestino"))
                .setHeader(Headers.CODIGO_AGRUPACION, method(Destino.class, "getCodigoAgrupacion"))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.stringWithHeaders("Rol Destino %s", Headers.ROL_DESTINO))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.stringWithHeaders("Codigo Agrupacion %s", Headers.CODIGO_AGRUPACION))
                .to(CamelUtil.sqlUriToHeaderSelectOne("areaDestino", Configuracion.SYNERGIA_DS, Headers.AREA_DESTINO))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.stringWithHeaders("Area Destino %s", Headers.AREA_DESTINO));

        from("direct:cargar-datos_tecnicos")
                .routeId("cargar-datos_tecnicos")
                .to(CamelUtil.sqlUriToHeader("datosTecnicos", Configuracion.SYNERGIA_DS, Headers.DATOS_TECNICOS, DatosTecnicos.class))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.DATOS_TECNICOS));
    }
}
