package edesur.pangea.segen.backoffice.mac.model;

import edesur.pangea.util.DateFormat;
import java.util.Date;


//LDV

public class EtapaOrden {
    private long mensajeXnear;
    private static final String identEtapa = "RQ";
    private Date fechaIinicio = new Date();


    public long getMensajeXnear() {
        return mensajeXnear;
    }

    public void setMensajeXnear(long mensajeXnear) {
        this.mensajeXnear = mensajeXnear;
    }
    
    
    public static String getIdentEtapa() {
        return identEtapa;
    }

    public void setFechaIinicio(Date fechaIinicio) {
        this.fechaIinicio = fechaIinicio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EtapaOrden{");
        sb.append(", mensajeXnear=").append(mensajeXnear);
        sb.append(", identEtapa='").append(identEtapa).append('\'');
        sb.append(", fechaIinicio=").append(DateFormat.toDateTimeString(fechaIinicio));
        sb.append('}');
        return sb.toString();
    }
}
