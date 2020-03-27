package edesur.pangea.segen.backoffice.routes;

import edesur.pangea.segen.backoffice.Configuracion;
import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.beans.ParamsUtils;
import edesur.pangea.segen.backoffice.mac.beans.SegenBuilder;
import edesur.pangea.util.CamelUtil;
import org.apache.camel.LoggingLevel;
import org.apache.camel.component.jdbc.JdbcConstants;

public class MacCrearSegen extends BaseRouteBuilder {
    @Override
    public void configure() throws Exception {
        super.configure();

        from("direct:crear-segen-mac")
                .routeId("crear-segen-mac")
                .setHeader(Headers.PROCEDIMIENTO, method(SegenBuilder.class, "crearSegen"))
                .log(LoggingLevel.DEBUG, logname, "Referencia: ${header.Procedimiento.getReferencia()}")
                .log(LoggingLevel.DEBUG, logname, "Texto: ${header.Procedimiento.getTexto()}");

        from("direct:grabar-segen-mac")
                .routeId("grabar-segen-mac")
                .bean(SegenBuilder.class, "setNumeroContacto")
                .to(CamelUtil.sqlUri("updateSecuenciaXnear", Configuracion.SYNERGIA_DS))
                .to(CamelUtil.sqlUri("getSecuenciaXnear", Configuracion.SYNERGIA_DS, "outputType=SelectOne", "outputHeader=" + Headers.SQL_OUTPUT))
                .bean(SegenBuilder.class, "setNumeroMensaje")
                .setHeader(JdbcConstants.JDBC_PARAMETERS, method(ParamsUtils.class, "getProcedimientoProperties"))
                .setBody(simple("resource:classpath:sql/xpro_enviar.sql"))
                .to("jdbc:" + Configuracion.SYNERGIA_DS + "?" +
                        String.join("&",
                                "outputType=SelectOne",
                                "transacted=true",
                                "useHeadersAsParameters=true",
                                "resetAutoCommit=false"
                        )
                )
                .setHeader(Headers.DATOS_EXTRA, method(SegenBuilder.class, "getDatosExtra"))
                .bean("asyncRequest", "addDatosExtra");
    }
}
