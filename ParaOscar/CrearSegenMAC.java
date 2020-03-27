package edesur.pangea.segen.backoffice.routes;

import edesur.pangea.segen.backoffice.Headers;
import org.apache.camel.PropertyInject;

public class CrearSegenMAC extends BaseRouteBuilder {
    @PropertyInject(value = "segen.creacion", defaultValue = "true")
    private boolean crearSegen;


    @Override
    public void configure() throws Exception {
        super.configure();

        // hay que llamar a la ruta por medio de wireTap
        // para cerrar la transaccion anterior y abrir una nueva
        // de esta manera queda grabado que paso a generar orden
        from("direct:crear-mac")
                .routeId("crear-mac")
                // cargar datos
                .setHeader(Headers.TIPO_PROCEDIMIENTO, constant("SEGEN"))
                .to("direct:cargar-datos-cliente")
                .to("direct:cargar-parametros")
                .to("direct:cargar-motivos")
                .to("direct:cargar-tema-trabajo")
                .to("direct:cargar-rol-destino")
                // crear objetos
                .to("direct:crear-contacto")
                .to("direct:crear-segen-mac")
                .to("direct:crear-orden")
                .to("direct:crear-etapa-orden") //LDV
                .to("direct:crear-contacto-segen") //LDV
                .choice()
                    .when(header(Headers.CODIGO_AGRUPACION).isNotNull())
                        .to("direct:cargar-datos_tecnicos")
                .end()
                // persist
                .transacted()
                .to("direct:grabar-contacto")
                .to("direct:grabar-segen-mac")
                .to("direct:grabar-orden")
                .to("direct:grabar-etapa-orden") //LDV
                .to("direct:grabar-contacto-segen") //LDV
                .choice()
                    .when(header(Headers.CODIGO_AGRUPACION).isNotNull())
                        .to("direct:crear-recrecuni")
                        .to("direct:grabar-recrecuni")
                .end()
                .bean("asyncRequest", "nextState")
                .choice()
                    .when(constant(Boolean.FALSE).isEqualTo(crearSegen))
                        .log("### No se crea SEGEN ###")
                        .throwException(new Exception("No se crear SEGEN"))
                .end();

    }
}
