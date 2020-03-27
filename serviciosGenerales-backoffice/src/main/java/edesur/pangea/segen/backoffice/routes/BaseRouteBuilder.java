package edesur.pangea.segen.backoffice.routes;

import edesur.pangea.segen.backoffice.beans.MensajeErrorBean;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

abstract class BaseRouteBuilder extends RouteBuilder {
    static final String PATH_BASE    = "work/serviciosGenerales/";

    String logname;

    @SuppressWarnings("WeakerAccess")
    @Override
    public void configure() throws Exception {
        logname = getContext().getName();

        onException(Exception.class)
                .routeId("exception-route")
                .handled(true)
                .maximumRedeliveries(0)
                .to("log:" + logname + "?level=ERROR&showAll=true&multiline=true")
                .bean(MensajeErrorBean.class, "crearMensajeError")
                .marshal().json(JsonLibrary.Jackson, true)
                // va en otro thread para que no lo afecte el rollback
                .wireTap(ErrorRoute.ERROR_QUEUE_URI)
                .markRollbackOnly()
                .end();

    }
}
