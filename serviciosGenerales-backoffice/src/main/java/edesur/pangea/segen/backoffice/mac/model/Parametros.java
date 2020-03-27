package edesur.pangea.segen.backoffice.mac.model;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public class Parametros {
    private static final Logger logger = LoggerFactory.getLogger(Parametros.class);

    public enum TipoVencimiento { Contacto, CT };

    private int    plazoRespuenta;
    private int    plazoCT;
    private String tipoContacto;
    private String sucursalPadre;
    private Collection<Date> feriados = new ArrayList<>();

    public int getPlazoRespuenta() {
        return plazoRespuenta;
    }

    public void setPlazoRespuenta(int plazoRespuenta) {
        this.plazoRespuenta = plazoRespuenta;
    }

    public String getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(String tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    public String getSucursalPadre() {
        return sucursalPadre;
    }

    public void setSucursalPadre(String sucursalPadre) {
        this.sucursalPadre = sucursalPadre;
    }

    public int getPlazoCT() {
        return plazoCT;
    }

    public void setPlazoCT(int plazoCT) {
        this.plazoCT = plazoCT;
    }

    public Date calcularFechaVencimiento(Date fechaInicio, TipoVencimiento tipoVencimiento) {
        int plazo = tipoVencimiento == TipoVencimiento.Contacto ? plazoRespuenta : plazoCT;
        logger.debug("Calcular Vencimiento {}: {} + {} dias", tipoVencimiento, sdf.format(fechaInicio), plazo);

        Date result = DateUtils.addDays(fechaInicio, plazo);
        Calendar calendat = Calendar.getInstance();

        for(int i = 0; i < 10; i++) {
            calendat.setTime(result);
            int dia = calendat.get(Calendar.DAY_OF_WEEK);
            if (dia ==  1 || dia == 7 || isFeriado(result) ) {
                result = DateUtils.addDays(result, 1);
            }
            else {
                break;
            }
        }

        logger.debug("Fecha Vencimiento {} {}", tipoVencimiento, sdf.format(result));

        return result;
    }

    private boolean isFeriado(Date fecha) {
        for(Date feriado: feriados) {
            if(fecha == feriado) {
                return true;
            }
        }
        return false;
    }

    public void setFeriados(Collection<Date> feriados) {
        this.feriados = feriados;
    }

    public Collection<Date> getFeriados() {
        return feriados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Parametros{");
        sb.append("plazoRespuenta=").append(plazoRespuenta);
        sb.append(", plazoCT=").append(plazoCT);
        sb.append(", tipoContacto='").append(tipoContacto).append('\'');
        sb.append(", sucursalPadre='").append(sucursalPadre).append('\'');
        sb.append(", feriados=").append(feriados);
        sb.append('}');
        return sb.toString();
    }

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

}
