package edesur.pangea.segen.backoffice.mac.model;

public class DatosTecnicos {
    private String codigoVoltaje;
    private String codigoSucursal;
    private String sucursal;
    private String codigoPartido;
    private String partido;
    private String codigoLocalidad;
    private String localidad;
    private String codigoCalle;
    private String calle;
    private String numero;
    private String piso;
    private String depto;
    private String codigoEntreCalle1;
    private String entreCalle1;
    private String codigoEntreCalle2;
    private String entreCalle2;
    private String manzana;
    private String centroTransformacion;
    private String alimentador;
    private String subestacion;
    private String nombreSubestacion;
	private String acometida;
	private String tipo_conexion;
	
    public String getCodigoVoltaje() {
        return codigoVoltaje;
    }

    public void setCodigoVoltaje(String codigoVoltaje) {
        this.codigoVoltaje = codigoVoltaje;
    }

    public String getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getCentroTransformacion() {
        return centroTransformacion;
    }

    public void setCentroTransformacion(String centroTransformacion) {
        this.centroTransformacion = centroTransformacion;
    }

    public String getAlimentador() {
        return alimentador;
    }

    public void setAlimentador(String alimentador) {
        this.alimentador = alimentador;
    }

    public String getSubestacion() {
        return subestacion;
    }

    public void setSubestacion(String subestacion) {
        this.subestacion = subestacion;
    }

    public String getNombreSubestacion() {
        return nombreSubestacion;
    }

    public void setNombreSubestacion(String nombreSubestacion) {
        this.nombreSubestacion = nombreSubestacion;
    }


    public String getAcometida() {
        return this.acometida;
    }
    public void setAcometida(String acometida) {
        this.acometida = acometida;
    }

    public String getTipoConexion() {
        return this.tipo_conexion;
    }
    public void setTipoConexion(String conexion) {
        this.tipo_conexion = conexion;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DatosTecnicos{");
        sb.append("codigoVoltaje='").append(codigoVoltaje).append('\'');
        sb.append(", codigoSucursal='").append(codigoSucursal).append('\'');
        sb.append(", sucursal='").append(sucursal).append('\'');
        sb.append(", codigoPartido='").append(codigoPartido).append('\'');
        sb.append(", partido='").append(partido).append('\'');
        sb.append(", codigoLocalidad='").append(codigoLocalidad).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", codigoCalle='").append(codigoCalle).append('\'');
        sb.append(", calle='").append(calle).append('\'');
        sb.append(", numero='").append(numero).append('\'');
        sb.append(", piso='").append(piso).append('\'');
        sb.append(", depto='").append(depto).append('\'');
        sb.append(", codigoEntreCalle1='").append(codigoEntreCalle1).append('\'');
        sb.append(", entreCalle1='").append(entreCalle1).append('\'');
        sb.append(", codigoEntreCalle2='").append(codigoEntreCalle2).append('\'');
        sb.append(", entreCalle2='").append(entreCalle2).append('\'');
        sb.append(", manzana='").append(manzana).append('\'');
        sb.append(", centroTransformacion='").append(centroTransformacion).append('\'');
        sb.append(", alimentador='").append(alimentador).append('\'');
        sb.append(", subestacion='").append(subestacion).append('\'');
        sb.append(", nombreSubestacion='").append(nombreSubestacion).append('\'');
        sb.append(", acometida='").append(acometida).append('\'');
        sb.append(", tipo_conexion='").append(tipo_conexion).append('\'');
        
        
        sb.append('}');
        return sb.toString();
    }
}
