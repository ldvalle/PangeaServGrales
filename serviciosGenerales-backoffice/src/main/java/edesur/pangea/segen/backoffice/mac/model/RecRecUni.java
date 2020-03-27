package edesur.pangea.segen.backoffice.mac.model;

import edesur.pangea.util.DateFormat;

import java.util.Date;

public class RecRecUni {
    private static final String tarifa = "T1";
    private static final String origen = "MAC";
    private static final String tipoDocumento = "SEGEN";
    private static final String tipoReclamo = "C";
    private static final String reclamoReincidente = "N";

    private long   numeroCliente;
    private long   numeroReclamo;
    private long   numeroMensaje;
    private String trabajoRequerido;
    private String motivoEmpresa;
    private String motivoCliente;
    private Date   fechaInicioContacto;
    private int    plazo;
    private Date   fechaVencimientoContacto;
    private Date   fechaVencimientoCT;
    private String nombreCliente;
    private String telefono;
    private String codigoCalle;
    private String calle;
    private String piso;
    private String dpto;
    private String numeroPuerta;
    private String codigoEntreCalle;
    private String entreCalle;
    private String codidogEntreCalle2;
    private String entreCalle2;
    private String numeroManzana;
    private String codigoLocalidad;
    private String localidad;
    private String codigoPartido;
    private String partido;
    private String sucursalTecnica;
    private String nombreSucursalTecnica;
    private String codigoSubestacion;
    private String nombreSubestacion;
    private String alimentador;
    private String centroTransformacion;
    private String codigoAgrupacion;
    private int    plazoTecnico;
    private String etapa;
    private String sinTecni;
    private String tipoSuministro;
    private Date   fechaInicioEdesur;
    private Date   fechaIngresoCT = new Date();


    public static String getTarifa() {
        return tarifa;
    }

    public static String getOrigen() {
        return origen;
    }

    public static String getTipoDocumento() {
        return tipoDocumento;
    }

    public static String getTipoReclamo() {
        return tipoReclamo;
    }

    public long getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(long numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public long getNumeroReclamo() {
        return numeroReclamo;
    }

    public void setNumeroReclamo(long numeroReclamo) {
        this.numeroReclamo = numeroReclamo;
    }

    public long getNumeroMensaje() {
        return numeroMensaje;
    }

    public void setNumeroMensaje(long numeroMensaje) {
        this.numeroMensaje = numeroMensaje;
    }

    public String getTrabajoRequerido() {
        return trabajoRequerido;
    }

    public void setTrabajoRequerido(String trabajoRequerido) {
        this.trabajoRequerido = trabajoRequerido;
    }

    public String getMotivoEmpresa() {
        return motivoEmpresa;
    }

    public void setMotivoEmpresa(String motivoEmpresa) {
        this.motivoEmpresa = motivoEmpresa;
    }

    public String getMotivoCliente() {
        return motivoCliente;
    }

    public void setMotivoCliente(String motivoCliente) {
        this.motivoCliente = motivoCliente;
    }

    public Date getFechaInicioContacto() {
        return fechaInicioContacto;
    }

    public void setFechaInicioContacto(Date fechaInicioContacto) {
        this.fechaInicioContacto = fechaInicioContacto;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public Date getFechaVencimientoContacto() {
        return fechaVencimientoContacto;
    }

    public void setFechaVencimientoContacto(Date fechaVencimientoContacto) {
        this.fechaVencimientoContacto = fechaVencimientoContacto;
    }


    public Date getFechaVencimientoCT() {
        return fechaVencimientoCT;
    }

    public void setFechaVencimientoCT(Date fechaVencimientoCT) {
        this.fechaVencimientoCT = fechaVencimientoCT;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCodigoCalle() {
        return codigoCalle;
    }

    public void setCodigoCalle(String codigoCalle) {
        this.codigoCalle = codigoCalle;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(String numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public String getCodigoEntreCalle() {
        return codigoEntreCalle;
    }

    public void setCodigoEntreCalle(String codigoEntreCalle) {
        this.codigoEntreCalle = codigoEntreCalle;
    }

    public String getEntreCalle() {
        return entreCalle;
    }

    public void setEntreCalle(String entreCalle) {
        this.entreCalle = entreCalle;
    }

    public String getCodidogEntreCalle2() {
        return codidogEntreCalle2;
    }

    public void setCodidogEntreCalle2(String codidogEntreCalle2) {
        this.codidogEntreCalle2 = codidogEntreCalle2;
    }

    public String getEntreCalle2() {
        return entreCalle2;
    }

    public void setEntreCalle2(String entreCalle2) {
        this.entreCalle2 = entreCalle2;
    }

    public String getNumeroManzana() {
        return numeroManzana;
    }

    public void setNumeroManzana(String numeroManzana) {
        this.numeroManzana = numeroManzana;
    }

    public String getCodigoLocalidad() {
        return codigoLocalidad;
    }

    public void setCodigoLocalidad(String codigoLocalidad) {
        this.codigoLocalidad = codigoLocalidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCodigoPartido() {
        return codigoPartido;
    }

    public void setCodigoPartido(String codigoPartido) {
        this.codigoPartido = codigoPartido;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getSucursalTecnica() {
        return sucursalTecnica;
    }

    public void setSucursalTecnica(String sucursalTecnica) {
        this.sucursalTecnica = sucursalTecnica;
    }

    public String getNombreSucursalTecnica() {
        return nombreSucursalTecnica;
    }

    public void setNombreSucursalTecnica(String nombreSucursalTecnica) {
        this.nombreSucursalTecnica = nombreSucursalTecnica;
    }

    public String getCodigoSubestacion() {
        return codigoSubestacion;
    }

    public void setCodigoSubestacion(String codigoSubestacion) {
        this.codigoSubestacion = codigoSubestacion;
    }

    public String getNombreSubestacion() {
        return nombreSubestacion;
    }

    public void setNombreSubestacion(String nombreSubestacion) {
        this.nombreSubestacion = nombreSubestacion;
    }

    public String getAlimentador() {
        return alimentador;
    }

    public void setAlimentador(String alimentador) {
        this.alimentador = alimentador;
    }

    public String getCentroTransformacion() {
        return centroTransformacion;
    }

    public void setCentroTransformacion(String centroTransformacion) {
        this.centroTransformacion = centroTransformacion;
    }

    public String getCodigoAgrupacion() {
        return codigoAgrupacion;
    }

    public void setCodigoAgrupacion(String codigoAgrupacion) {
        this.codigoAgrupacion = codigoAgrupacion;
    }

    public String getReclamoReincidente() {
        return reclamoReincidente;
    }

    public int getPlazoTecnico() {
        return plazoTecnico;
    }

    public void setPlazoTecnico(int plazoTecnico) {
        this.plazoTecnico = plazoTecnico;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getSinTecni() {
        return sinTecni;
    }

    public void setSinTecni(String sinTecni) {
        this.sinTecni = sinTecni;
    }

    public String getTipoSuministro() {
        return tipoSuministro;
    }

    public void setTipoSuministro(String tipoSuministro) {
        this.tipoSuministro = tipoSuministro;
    }

    public Date getFechaInicioEdesur() {
        return fechaInicioEdesur;
    }

    public void setFechaInicioEdesur(Date fechaInicioEdesur) {
        this.fechaInicioEdesur = fechaInicioEdesur;
    }

    public Date getFechaIngresoCT() {
        return fechaIngresoCT;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RecRecUni{");
        sb.append("numeroCliente=").append(numeroCliente);
        sb.append(", numeroReclamo=").append(numeroReclamo);
        sb.append(", numeroMensaje=").append(numeroMensaje);
        sb.append(", trabajoRequerido='").append(trabajoRequerido).append('\'');
        sb.append(", motivoEmpresa='").append(motivoEmpresa).append('\'');
        sb.append(", motivoCliente='").append(motivoCliente).append('\'');
        sb.append(", fechaInicioContacto=").append(DateFormat.toDateTimeString(fechaInicioContacto));
        sb.append(", plazo=").append(plazo);
        sb.append(", fechaVencimientoContacto=").append(DateFormat.toDateTimeString(fechaVencimientoContacto));
        sb.append(", fechaVencimientoCT=").append(DateFormat.toDateTimeString(fechaVencimientoCT));
        sb.append(", nombreCliente='").append(nombreCliente).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", codigoCalle='").append(codigoCalle).append('\'');
        sb.append(", calle='").append(calle).append('\'');
        sb.append(", piso='").append(piso).append('\'');
        sb.append(", dpto='").append(dpto).append('\'');
        sb.append(", numeroPuerta='").append(numeroPuerta).append('\'');
        sb.append(", codigoEntreCalle='").append(codigoEntreCalle).append('\'');
        sb.append(", entreCalle='").append(entreCalle).append('\'');
        sb.append(", codidogEntreCalle2='").append(codidogEntreCalle2).append('\'');
        sb.append(", entreCalle2='").append(entreCalle2).append('\'');
        sb.append(", numeroManzana='").append(numeroManzana).append('\'');
        sb.append(", codigoLocalidad='").append(codigoLocalidad).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", codigoPartido='").append(codigoPartido).append('\'');
        sb.append(", partido='").append(partido).append('\'');
        sb.append(", sucursalTecnica='").append(sucursalTecnica).append('\'');
        sb.append(", nombreSucursalTecnica='").append(nombreSucursalTecnica).append('\'');
        sb.append(", codigoSubestacion='").append(codigoSubestacion).append('\'');
        sb.append(", nombreSubestacion='").append(nombreSubestacion).append('\'');
        sb.append(", alimentador='").append(alimentador).append('\'');
        sb.append(", centroTransformacion='").append(centroTransformacion).append('\'');
        sb.append(", codigoAgrupacion='").append(codigoAgrupacion).append('\'');
        sb.append(", plazoTecnico=").append(plazoTecnico);
        sb.append(", etapa='").append(etapa).append('\'');
        sb.append(", sinTecni='").append(sinTecni).append('\'');
        sb.append(", tipoSuministro='").append(tipoSuministro).append('\'');
        sb.append(", fechaInicioEdesur=").append(DateFormat.toDateTimeString(fechaInicioEdesur));
        sb.append(", fechaIngresoCT=").append(DateFormat.toDateTimeString(fechaIngresoCT));
        sb.append('}');
        return sb.toString();
    }
}
