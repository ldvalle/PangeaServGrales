package edesur.pangea.segen.backoffice.routes;

import org.apache.camel.LoggingLevel;

public class ActualizarRoute extends BaseRouteBuilder {
    @Override
    public void configure() throws Exception {
        super.configure();

        from("direct:actualizar-segen")
                .routeId("actualizar-segen")
                .log(LoggingLevel.WARN, logname, "Actualizar NO Implementado")
                .end();
    }
}
