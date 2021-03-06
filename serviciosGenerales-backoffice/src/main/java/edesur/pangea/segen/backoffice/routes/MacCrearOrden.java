package edesur.pangea.segen.backoffice.routes;

import edesur.pangea.segen.backoffice.Configuracion;
import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.beans.ParamsUtils;
import edesur.pangea.segen.backoffice.mac.beans.OrdenBuilder;
import edesur.pangea.segen.backoffice.mac.beans.RecRecUniBuilder;
import edesur.pangea.segen.backoffice.mac.beans.SegenBuilder;
import edesur.pangea.segen.backoffice.mac.beans.ContactoBuilder; //LDV
import edesur.pangea.segen.backoffice.mac.beans.EtapaOrdenBuilder; //LDV
import edesur.pangea.segen.backoffice.mac.beans.OtMacBuilder; //LDV
import edesur.pangea.segen.backoffice.mac.beans.OtMacSapBuilder; //LDV
import edesur.pangea.segen.backoffice.mac.beans.ContactoSegenBuilder; //LDV
import edesur.pangea.util.CamelUtil;
import org.apache.camel.LoggingLevel;

public class MacCrearOrden extends BaseRouteBuilder {
    @Override
    public void configure() throws Exception {
        super.configure();

        from("direct:crear-orden")
                .routeId("crear-orden")
                .setHeader(Headers.ORDEN, method(OrdenBuilder.class, "crear"))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.ORDEN));

        from("direct:grabar-orden")
                .routeId("grabar-orden")
                .bean(OrdenBuilder.class, "setNumeroSegen")
                .to(CamelUtil.sqlUri("updateNumao", Configuracion.SYNERGIA_DS))
                .to(CamelUtil.sqlUri("selectNumao", Configuracion.SYNERGIA_DS, "outputType=SelectOne", "outputHeader=" + Headers.SQL_OUTPUT))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.stringWithHeaders("Numero Orden %s", Headers.SQL_OUTPUT))
                .bean(OrdenBuilder.class, "setNumeroOrden")
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.ORDEN))
                .bean(ParamsUtils.class, "getOrdenProperties")
                .to(CamelUtil.sqlUri("insertOrden", Configuracion.SYNERGIA_DS))
                .setHeader(Headers.DATOS_EXTRA, method(OrdenBuilder.class, "getDatosExtra"))
                .bean("asyncRequest", "addDatosExtra");

        from("direct:crear-etapa-orden")  //LDV
                .routeId("crear-etapa-orden")
                .setHeader(Headers.ETAPA_ORDEN, method(EtapaOrdenBuilder.class, "crear"))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.ETAPA_ORDEN));

        from("direct:grabar-etapa-orden")  //LDV
                .routeId("grabar-etapa-orden")
                .bean(ParamsUtils.class, "getEtapaOrdenProperties")
                .to(CamelUtil.sqlUri("insertEtapaOrden", Configuracion.SYNERGIA_DS));
                
        from("direct:crear-contacto-segen")  //LDV
                .routeId("crear-contacto-segen")
                .setHeader(Headers.CONTACTO_SEGEN, method(ContactoSegenBuilder.class, "crear"))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.CONTACTO_SEGEN));

        from("direct:grabar-contacto-segen")  //LDV
                .routeId("grabar-contacto-segen")
                .bean(ParamsUtils.class, "getContactoSegenProperties")
                .to(CamelUtil.sqlUri("insertContactoSegen", Configuracion.SYNERGIA_DS));
                
        from("direct:crear-recrecuni")
                .routeId("crear-recrecuni")
                .setHeader(Headers.REC_REC_UNI, method(RecRecUniBuilder.class, "crear"))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.REC_REC_UNI));

        from("direct:grabar-recrecuni")
                .routeId("grabar-recrecuni")
                .bean(ParamsUtils.class, "getRecRecUniProperties")
                .to(CamelUtil.sqlUri("insertRecRecUni", Configuracion.SYNERGIA_DS));
                
//TODO para las OTs                
        from("direct:crear-ot-mac")
                .routeId("crear-ot-mac")
                .setHeader(Headers.OT_MAC, method(OtMacBuilder.class, "crear"))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.OT_MAC));

        from("direct:grabar-ot-mac")
                .routeId("grabar-ot-mac")
                .bean(ParamsUtils.class, "getOtMacProperties")
                .to(CamelUtil.sqlUri("insertOtMac", Configuracion.SYNERGIA_DS));
                
                
		from("direct:grabar-ot-hiseven")
				.routeId("grabar-ot-hiseven")
				.to(CamelUtil.sqlUri("selectOtNroOrden", Configuracion.SYNERGIA_DS, "outputType=SelectOne", "outputHeader=" + Headers.SQL_OUTPUT))
				.log(LoggingLevel.DEBUG, logname, CamelUtil.stringWithHeaders("Numero Orden OT %s", Headers.SQL_OUTPUT))
                .bean(ParamsUtils.class, "getOtHisEvenProperties")
                .to(CamelUtil.sqlUri("insertOtHiseven", Configuracion.SYNERGIA_DS));
                
        from("direct:crear-ot-mac-sap")
                .routeId("crear-ot-mac-sap")
                .setHeader(Headers.OT_MAC_SAP, method(OtMacSapBuilder.class, "crear"))
                .log(LoggingLevel.DEBUG, logname, CamelUtil.simpleHeader(Headers.OT_MAC));

        from("direct:grabar-ot-mac-sap")
                .routeId("grabar-ot-mac-sap")
				.to(CamelUtil.sqlUri("selectOtNroOrden", Configuracion.SYNERGIA_DS, "outputType=SelectOne", "outputHeader=" + Headers.SQL_OUTPUT))
				.log(LoggingLevel.DEBUG, logname, CamelUtil.stringWithHeaders("Numero Orden OT MAC SAP %s", Headers.SQL_OUTPUT))
                .bean(ParamsUtils.class, "getOtMacSapProperties")
                .to(CamelUtil.sqlUri("insertOtMacSap", Configuracion.SYNERGIA_DS));       
       
    }
}
