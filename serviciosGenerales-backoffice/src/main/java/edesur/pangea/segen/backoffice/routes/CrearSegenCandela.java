package edesur.pangea.segen.backoffice.routes;

import edesur.pangea.bs.fuse.Estados;
import edesur.pangea.segen.backoffice.Configuracion;
import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.candela.Creacion;
import edesur.pangea.util.CamelUtil;
import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.PropertyInject;
import org.apache.camel.component.ssh.SshResult;

import java.util.Objects;

public class CrearSegenCandela extends BaseRouteBuilder {
    private static final String SP_CREAR_CANDELA = "id52_generactosoli";
    private static final String PATH_SSH_LOG = PATH_BASE + "ssh";

    @PropertyInject("t23.user")
    private String sshUser;
    @PropertyInject("t23.password")
    private String sshPassword;
    @PropertyInject("t23.server")
    private String sshServer;

    @Override
    public void configure() throws Exception {
        Objects.requireNonNull(sshUser);
        Objects.requireNonNull(sshPassword);
        Objects.requireNonNull(sshServer);

        super.configure();

        // hay que llamar a la ruta por medio de wireTap
        // para cerrar la transaccion anterior y abrir una nueva
        // de esta manera queda grabado que paso a generar orden
        from("direct:crear-candela")
                .routeId("crear-candela")
                .bean(Creacion.class, "setParametrosSP")
                .log(LoggingLevel.DEBUG, logname, CamelUtil.stringWithHeaders(SP_CREAR_CANDELA + "%s", Headers.PARAMETROS_SP))
                .transacted()
                .to(CamelUtil.spUriToHeader(SP_CREAR_CANDELA, Configuracion.CANDELA_DS))
                .setHeader(Headers.NUMERO_SOLICITUD, method(Creacion.class, "getNumeroSolicitud"))
                .setHeader(Headers.DATOS_EXTRA, method(Creacion.class, "getDatosExtra"))
                .bean("asyncRequest", "addDatosExtra")
                .bean("asyncRequest", "nextState")
                .log(LoggingLevel.DEBUG, logname, CamelUtil.stringWithHeaders("Fin Operacion %s", Headers.OPERACION))
                .choice()
                    .when(method(Creacion.class, "enviarRST").isEqualTo(Boolean.TRUE))
                        .wireTap("direct:ejecutar-ssh")
                .endChoice()
                .end()
                ;

        from("direct:ejecutar-ssh")
                .routeId("ejecutar-ssh")
                .streamCaching()
                .transacted()
                .log(LoggingLevel.DEBUG, logname, CamelUtil.stringWithHeaders("Iniciando ssh solicitud %s", Headers.NUMERO_SOLICITUD))
                .setBody(method(Creacion.class, "getComandoEnviarRST"))
                .to("ssh://" + sshUser + ":" + sshPassword + "@" + sshServer + "?synchronous=true")
                .log(LoggingLevel.DEBUG, logname, "Resultado: " + body().toString())
                .log(LoggingLevel.DEBUG, logname, CamelUtil.stringWithHeaders("Exit Value: %s", SshResult.EXIT_VALUE))
                .setHeader(Exchange.FILE_NAME, header(Headers.NUMERO_ORDEN).append("_ssh.log"))
                .to("file:" + PATH_SSH_LOG)
                .choice()
                    .when(header(SshResult.EXIT_VALUE).isNotEqualTo(0))
                        .setHeader(Headers.ESTADO_ORDEN, constant(Estados.ERROR_SSH))
                        .bean("asyncRequest", "setEstado")
                .end()
                ;
    }
}
