package edesur.pangea.segen.backoffice.beans;

import edesur.pangea.segen.webservice.model.ActuacionGenericaMessage;
import org.apache.camel.Body;

public class MessageProperties {
    public String getOperacion(@Body ActuacionGenericaMessage message) {
        return message.getOperacion();
    }

    public String getNumeroOrden(@Body ActuacionGenericaMessage message) {
        return message.getNumeroOrden();
    }

    public int getTarifa(@Body ActuacionGenericaMessage message) {
        return message.getClienteMapping().getTarifa();
    }

    public int getNumeroCliente(@Body ActuacionGenericaMessage message) {
        return message.getClienteMapping().getNumeroCliente();
    }
}
