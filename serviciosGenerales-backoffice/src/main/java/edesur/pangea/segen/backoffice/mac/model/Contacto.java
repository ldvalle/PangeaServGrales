package edesur.pangea.segen.backoffice.mac.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import edesur.pangea.util.DateFormat;

import java.util.Date;

public class Contacto {
    private int numero;
    private int  numeroCliente;
    private String tipoDocumento;
    private String numeroDocumento;
    private String tarifa;
    private String sucursalCliente;
    private String centroOperativo;
    private long   plan;
    private String nombre;
    private String telefono;
    private Date   fechaVencimiento;
    private Date   fechaVencimientoCT;
    private String direccion;
    private String partido;
    private String codigoPostal;
    private String cuit;
    private String rolInicio;
    private String motivo;
    private String motivoEmpresa;
    private Date   fechaInicio;
    private String comentarios;
    private String tipo;
    private String descripcionMotivo;
    private String descripcionMotivoEmpresa;

    private static final String esCliente = "0";
    private static final String  backoffice = "B";
    private static final String  sucAgContacto = "0100";
    private static final String  sucContacto = "0100";
    private static final String  oficina = "0100";
    private static final String  coMulti = "0";
    private static final String  medio = "25";
    private static final String  principal = "1";
    private static final String  estado = "C";

    private final Date fechaEstado = new Date();
    private final Date fechaProceso = new Date();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getCentroOperativo() {
        return centroOperativo;
    }

    public void setCentroOperativo(String centroOperativo) {
        this.centroOperativo = centroOperativo;
    }

    public long getPlan() {
        return plan;
    }

    public void setPlan(long plan) {
        this.plan = plan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "America/Argentina/Buenos_Aires")
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "America/Argentina/Buenos_Aires")
    public Date getFechaVencimientoCT() {
        return fechaVencimientoCT;
    }

    public void setFechaVencimientoCT(Date fechaVencimientoCT) {
        this.fechaVencimientoCT = fechaVencimientoCT;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRolInicio() {
        return rolInicio;
    }

    public void setRolInicio(String rolInicio) {
        this.rolInicio = rolInicio;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getMotivoEmpresa() {
        return motivoEmpresa;
    }

    public void setMotivoEmpresa(String motivoEmpresa) {
        this.motivoEmpresa = motivoEmpresa;
    }

    public String getSucursalCliente() {
        return sucursalCliente;
    }

    public void setSucursalCliente(String sucursalCliente) {
        this.sucursalCliente = sucursalCliente;
    }

    public static String getEsCliente() {
        return esCliente;
    }

    public static String getBackoffice() {
        return backoffice;
    }

    public static String getMedio() {
        return medio;
    }


    public static String getSucAgContacto() {
        return sucAgContacto;
    }

    public static String getSucContacto() {
        return sucContacto;
    }

    public static String getCoMulti() {
        return coMulti;
    }

    public static String getOficina() {
        return oficina;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "America/Argentina/Buenos_Aires")
    public Date getFechaEstado() {
        return fechaEstado;
    }

    public Date getFechaProceso() {
        return fechaProceso;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "America/Argentina/Buenos_Aires")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public static String getPrincipal() {
        return principal;
    }

    public static String getEstado() {
        return estado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getDescripcionMotivo() {
        return descripcionMotivo;
    }

    public void setDescripcionMotivo(String descripcionMotivo) {
        this.descripcionMotivo = descripcionMotivo;
    }

    public String getDescripcionMotivoEmpresa() {
        return descripcionMotivoEmpresa;
    }

    public void setDescripcionMotivoEmpresa(String descripcionMotivoEmpresa) {
        this.descripcionMotivoEmpresa = descripcionMotivoEmpresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contacto{");
        sb.append("numero=").append(numero);
        sb.append(", numeroCliente=").append(numeroCliente);
        sb.append(", tipoDocumento='").append(tipoDocumento).append('\'');
        sb.append(", numeroDocumento='").append(numeroDocumento).append('\'');
        sb.append(", tarifa='").append(tarifa).append('\'');
        sb.append(", sucursalCliente='").append(sucursalCliente).append('\'');
        sb.append(", centroOperativo='").append(centroOperativo).append('\'');
        sb.append(", plan=").append(plan);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", fechaVencimiento=").append(DateFormat.toDateTimeString(fechaVencimiento));
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", partido='").append(partido).append('\'');
        sb.append(", codigoPostal='").append(codigoPostal).append('\'');
        sb.append(", cuit='").append(cuit).append('\'');
        sb.append(", rolInicio='").append(rolInicio).append('\'');
        sb.append(", motivo='").append(motivo).append('\'');
        sb.append(", motivoEmpresa='").append(motivoEmpresa).append('\'');
        sb.append(", fechaInicio=").append(DateFormat.toDateTimeString(fechaInicio));
        sb.append(", comentarios='").append(comentarios).append('\'');
        sb.append(", tipo='").append(tipo).append('\'');
        sb.append(", descripcionMotivo='").append(descripcionMotivo).append('\'');
        sb.append(", descripcionMotivoEmpresa='").append(descripcionMotivoEmpresa).append('\'');
        sb.append(", fechaEstado=").append(DateFormat.toDateTimeString(fechaEstado));
        sb.append(", fechaProceso=").append(DateFormat.toDateTimeString(fechaProceso));
        sb.append('}');
        return sb.toString();
    }
}
