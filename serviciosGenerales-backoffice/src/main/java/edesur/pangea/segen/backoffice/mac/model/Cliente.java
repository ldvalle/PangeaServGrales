package edesur.pangea.segen.backoffice.mac.model;

import org.apache.commons.lang3.StringUtils;
import java.utli.Collection;
import java.util.Vector;

public class Cliente {
    private int numero;
    private String nombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private String sucursal;
    private long plan;
    private long zona;
    private long correlativoRuta;
    private String telefono;
    private String cuit;
    private String partido;
    private String localidad;
    private String codigoPostal;
    private String calle;
    private String numeroDireccion;
    private String piso;
    private String depto;
    private String tarifa;
    private long numeroMedidor;
    private String nombreSucursal;
    private String cuentaConver;
    private String codigoPartido;
    private String codigoLocalidad;
    private String codigoCalle;
    private String codigoEntreCalle1;
    private String entreCalle1;
    private String codigoEntreCalle2;
    private String entreCalle2;
    private String marcaMedidor; //LDV
    private String modeloMedidor; //LDV
    private String mod_nrocb; //LDV
    private String suc_padre; //LDV
    private Collection<String> lstPrecintos; //LDV
	
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public long getPlan() {
        return plan;
    }

    public void setPlan(long plan) {
        this.plan = plan;
    }

    public long getZona() {
        return zona;
    }

    public void setZona(long zona) {
        this.zona = zona;
    }

    public long getCorrelativoRuta() {
        return correlativoRuta;
    }

    public void setCorrelativoRuta(long correlativoRuta) {
        this.correlativoRuta = correlativoRuta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codiogPostal) {
        this.codigoPostal = codiogPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroDireccion() {
        return numeroDireccion;
    }

    public void setNumeroDireccion(String numeroDireccion) {
        this.numeroDireccion = numeroDireccion;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public long getNumeroMedidor() {
        return numeroMedidor;
    }

    public void setNumeroMedidor(long numeroMedidor) {
        this.numeroMedidor = numeroMedidor;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getCuentaConver() {
        return cuentaConver;
    }

    public void setCuentaConver(String cuentaConver) {
        this.cuentaConver = cuentaConver;
    }

    public String getCodigoPartido() {
        return codigoPartido;
    }

    public void setCodigoPartido(String codigoPartido) {
        this.codigoPartido = codigoPartido;
    }

    public String getCodigoLocalidad() {
        return codigoLocalidad;
    }

    public void setCodigoLocalidad(String codigoLocalidad) {
        this.codigoLocalidad = codigoLocalidad;
    }

    public String getCodigoCalle() {
        return codigoCalle;
    }

    public void setCodigoCalle(String codigoCalle) {
        this.codigoCalle = codigoCalle;
    }

    public String getCodigoEntreCalle1() {
        return codigoEntreCalle1;
    }

    public void setCodigoEntreCalle1(String codigoEntreCalle1) {
        this.codigoEntreCalle1 = codigoEntreCalle1;
    }

    public String getEntreCalle1() {
        return entreCalle1;
    }

    public void setEntreCalle1(String entreCalle1) {
        this.entreCalle1 = entreCalle1;
    }

    public String getCodigoEntreCalle2() {
        return codigoEntreCalle2;
    }

    public void setCodigoEntreCalle2(String codigoEntreCalle2) {
        this.codigoEntreCalle2 = codigoEntreCalle2;
    }

    public String getEntreCalle2() {
        return entreCalle2;
    }

    public void setEntreCalle2(String entreCalle2) {
        this.entreCalle2 = entreCalle2;
    }

	public String getMarcaMedidor(){
		return this.marcaMedidor;
	}
	public void setMarcaMedidor(String sMarca){
		this.marcaMedidor = sMarca;
	}

	public String getModeloMedidor(){
		return this.modeloMedidor;
	}
	public void setModeloMedidor(String sModelo){
		this.modeloMedidor = sModelo;
	}
	
	public String getNroCb(){
		return this.mod_nrocb;
	}
	public void setNroCb(String sNroCb){
		this.mod_nrocb = sNroCb;
	}

	public String getSucPadre(){
		return this.suc_padre;
	}
	public void setSucPadre(String sSucPadre){
		this.suc_padre=sSucPadre;
	}
	
	public Collection<String> getLstPrecintos(){
		return this.lstPrecintos;
	}
	public void setLstPrecintos(Vector<String> miLst){
		this.lstPrecintos= miLst;
	}
	
    public String getDireccion() {
        StringBuilder builder = new StringBuilder();
        builder.append(calle);
        builder.append(" ");
        builder.append(numeroDireccion);
        if (!StringUtils.isEmpty(piso)) {
            builder.append(" piso: ");
            builder.append(piso);
        }
        if(!StringUtils.isEmpty(depto)) {
            builder.append(" dpto: ");
            builder.append(depto);
        }
        return builder.toString();
    }

    @Override
    public String toString() {
		int i=0;
		
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("numero=").append(numero);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tipoDocumento='").append(tipoDocumento).append('\'');
        sb.append(", numeroDocumento='").append(numeroDocumento).append('\'');
        sb.append(", sucursal='").append(sucursal).append('\'');
        sb.append(", plan=").append(plan);
        sb.append(", zona=").append(zona);
        sb.append(", correlativoRuta=").append(correlativoRuta);
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append(", cuit='").append(cuit).append('\'');
        sb.append(", partido='").append(partido).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", codigoPostal='").append(codigoPostal).append('\'');
        sb.append(", calle='").append(calle).append('\'');
        sb.append(", numeroDireccion='").append(numeroDireccion).append('\'');
        sb.append(", piso='").append(piso).append('\'');
        sb.append(", depto='").append(depto).append('\'');
        sb.append(", tarifa='").append(tarifa).append('\'');
        sb.append(", numeroMedidor=").append(numeroMedidor);
        sb.append(", nombreSucursal='").append(nombreSucursal).append('\'');
        sb.append(", cuentaConver='").append(cuentaConver).append('\'');
        sb.append(", marcaMedidor='").append(marcaMedidor).append('\'');
        sb.append(", modeloMedidor='").append(modeloMedidor).append('\'');
        sb.append(", mod_nrocb='").append(mod_nrocb).append('\'');
        sb.append(", suc_padre='").append(suc_padre).append('\'');
        
        sb.append('}');
        return sb.toString();
    }
}
