package edesur.pangea.segen.backoffice.beans;

import edesur.pangea.config.Headers;
import edesur.pangea.segen.backoffice.model.MensajeError;
import org.apache.camel.Body;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangeProperty;
import org.apache.camel.Header;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

public class MensajeErrorBean {
    public MensajeError crearMensajeError(
            @Header(Headers.NUMERO_ORDEN) String numeroOrden,
            @ExchangeProperty(Exchange.EXCEPTION_CAUGHT) Exception exception
    ) {
        MensajeError mensajeError = new MensajeError();
        mensajeError.setNumeroOrden(numeroOrden);
        mensajeError.setExceptionType(exception.getClass().getName());
        mensajeError.setMensaje(exception.getMessage());
        return mensajeError;
    }

    public void setHeaders(@Body MensajeError mensajeError, @org.apache.camel.Headers Map<String, Object> headers) {
        headers.put(Headers.NUMERO_ORDEN, mensajeError.getNumeroOrden());
        headers.put(Headers.MENSAJE_ERROR, StringUtils.defaultIfEmpty(mensajeError.getMensaje(), mensajeError.getExceptionType()));
    }
}
