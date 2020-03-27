package edesur.pangea.segen.backoffice.routes;

import edesur.pangea.config.Headers;
import edesur.pangea.segen.backoffice.Configuracion;
import edesur.pangea.segen.backoffice.beans.MessageProperties;
import edesur.pangea.segen.webservice.model.ActuacionGenericaMessage;
import edesur.pangea.util.CamelUtil;
import org.apache.camel.LoggingLevel;
import org.apache.camel.model.dataformat.JsonLibrary;

public class StartRoute extends BaseRouteBuilder {
    private static final String QUEUE_URI =
            Configuracion.ACTIVE_MQ_BEAN_NAME + ":queue:" +
            edesur.pangea.segen.webservice.Configuracion.QUEUE_NAME + "?" +
            String.join("&", "" +
                    "exchangePattern=InOnly",
                    "jmsMessageType=Text",
                    "headerFilterStrategy=#removeHeaders");

    @Override
    public void configure() throws Exception {
        super.configure();

        from(QUEUE_URI)
                .routeId("start")
                .log(LoggingLevel.DEBUG, logname, "${body}")
                .unmarshal().json(JsonLibrary.Jackson, ActuacionGenericaMessage.class)
                .setHeader(Headers.OPERACION , method(MessageProperties.class, "getOperacion"))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.stringWithHeaders("Operacion %s", Headers.OPERACION))
                .choice()
                    .when(header(Headers.OPERACION).isEqualTo("crear-orden"))
                        .to("direct:crear-segen")
                    .when(header(Headers.OPERACION).isEqualTo("actualizar-orden"))
                        .to("direct:actualizar-segen")
                    .otherwise()
                        .log(LoggingLevel.WARN, logname, CamelUtil.stringWithHeaders("Operacion no implementada: %s", Headers.OPERACION))
                .end();
    }
}
