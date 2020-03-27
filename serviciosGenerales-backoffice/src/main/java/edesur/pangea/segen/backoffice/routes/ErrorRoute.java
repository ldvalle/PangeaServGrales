package edesur.pangea.segen.backoffice.routes;

import edesur.pangea.config.Headers;
import edesur.pangea.segen.backoffice.Configuracion;
import edesur.pangea.segen.backoffice.beans.MensajeErrorBean;
import edesur.pangea.segen.backoffice.model.MensajeError;
import edesur.pangea.util.CamelUtil;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

public class ErrorRoute extends RouteBuilder {
    final static String ERROR_QUEUE_URI =
            Configuracion.ACTIVE_MQ_BEAN_NAME + ":queue:" +
            edesur.pangea.segen.webservice.Configuracion.QUEUE_NAME + ".error?exchangePattern=InOnly";

    @Override
    public void configure() throws Exception {
        String logname = getContext().getName();

        from(ERROR_QUEUE_URI)
                .routeId("error-route")
                .unmarshal().json(JsonLibrary.Jackson, MensajeError.class)
                .bean(MensajeErrorBean.class, "setHeaders")
                .log(LoggingLevel.ERROR, logname, CamelUtil.stringWithHeaders("Orden: %s, Error: %s", Headers.NUMERO_ORDEN, Headers.MENSAJE_ERROR))
                .transacted()
                .bean("asyncRequest", "errorStateMessage")
                ;
    }
}
