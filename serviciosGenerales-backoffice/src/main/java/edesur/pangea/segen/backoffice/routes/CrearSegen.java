package edesur.pangea.segen.backoffice.routes;

import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.beans.MessageProperties;
import edesur.pangea.util.CamelUtil;
import org.apache.camel.LoggingLevel;

public class CrearSegen extends BaseRouteBuilder {
    @Override
    public void configure() throws Exception {
        super.configure();

        from("direct:crear-segen")
                .routeId("crear-segen")
                .transacted()
                .setHeader(Headers.NUMERO_ORDEN, method(MessageProperties.class, "getNumeroOrden"))
                .setHeader(Headers.TARIFA_CLIENTE, method(MessageProperties.class, "getTarifa"))
                .setHeader(Headers.NUMERO_CLIENTE, method(MessageProperties.class, "getNumeroCliente"))
                .bean("asyncRequest", "nextState")
                .log(LoggingLevel.DEBUG, logname, CamelUtil.stringWithHeaders("Tarifa %s", Headers.TARIFA_CLIENTE))
                .choice()
                    .when(header(Headers.TARIFA_CLIENTE).isEqualTo(1)).wireTap("direct:crear-mac").end()
                    .otherwise().wireTap("direct:crear-candela")
                .end()
                ;
    }
}
