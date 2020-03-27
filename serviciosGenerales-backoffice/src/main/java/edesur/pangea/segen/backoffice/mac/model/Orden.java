package edesur.pangea.segen.backoffice.mac.model;

import edesur.pangea.util.DateFormat;

import java.util.Date;

public class Orden {
    private static final String tipoOrden = "AC";
    private static final int servidor = 1;
    private static final String identEtapa = "RQ";
    private static final String termDir = "SALESFORCE";
    private static final String prioridad = "N";
    private static final String estado = "0";
    private static final String areaEmisora = "SALESFORCE";
    private static final String rolUsuario = "SALESFORCE";
    private static final String clase = "0005";
    private static final int numeroOrdenRel = 0;
    private static final int valorCobro = 0;
    private static final String sucursalUsuario = "0000";

    private String numeroOrden;
    private long mensajeXnear;
    private String sucursal;
    private String areaEjecutora;
    private String tema;
    private String trabajo;
    private long numeroCliente;
    private Date vencimiento;
    private String cuentaConver;
    private Date fechaIinicio = new Date();


    public static String getTipoOrden() {
        return tipoOrden;
    }

    public static int getServidor() {
        return servidor;
    }

    public static String getIdentEtapa() {
        return identEtapa;
    }

    public static String getTermDir() {
        return termDir;
    }

    public static String getPrioridad() {
        return prioridad;
    }

    public static String getEstado() {
        return estado;
    }

    public String getAreaEmisora() {
        return areaEmisora;
    }

    public static String getRolUsuario() {
        return rolUsuario;
    }

    public static String getClase() {
        return clase;
    }

    public static int getNumeroOrdenRel() {
        return numeroOrdenRel;
    }

    public static int getValorCobro() {
        return valorCobro;
    }

    public static String getSucursalUsuario() {
        return sucursalUsuario;
    }

    public Date getFechaIinicio() {
        return fechaIinicio;
    }



    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public long getMensajeXnear() {
        return mensajeXnear;
    }

    public void setMensajeXnear(long mensajeXnear) {
        this.mensajeXnear = mensajeXnear;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getAreaEjecutora() {
        return areaEjecutora;
    }

    public void setAreaEjecutora(String areaEjecutora) {
        this.areaEjecutora = areaEjecutora;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public long getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(long numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getCuentaConver() {
        return cuentaConver;
    }

    public void setCuentaConver(String cuentaConver) {
        this.cuentaConver = cuentaConver;
    }

    public void setFechaIinicio(Date fechaIinicio) {
        this.fechaIinicio = fechaIinicio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orden{");
        sb.append("numeroOrden='").append(numeroOrden).append('\'');
        sb.append(", mensajeXnear=").append(mensajeXnear);
        sb.append(", sucursal='").append(sucursal).append('\'');
        sb.append(", areaEjecutora='").append(areaEjecutora).append('\'');
        sb.append(", tema='").append(tema).append('\'');
        sb.append(", trabajo='").append(trabajo).append('\'');
        sb.append(", numeroCliente=").append(numeroCliente);
        sb.append(", vencimiento=").append(vencimiento);
        sb.append(", cuentaConver='").append(cuentaConver).append('\'');
        sb.append(", fechaIinicio=").append(DateFormat.toDateTimeString(fechaIinicio));
        sb.append('}');
        return sb.toString();
    }
}
