package edesur.pangea.segen.backoffice.mac.model;

import org.apache.commons.lang3.StringUtils;
import java.util.Date;
import java.util.Collection;
import java.util.Vector;

public class OtMacSap{
	private String	nro_orden;
	private static final String	tipo_ifaz="G001";
	private String	tipo_traba="";
	private String	sucursal="";
	private String	area_ejecuta="";
	private String	motivo="";
	private String	obs_dir="";
	private String	obs_lectu="";
	private String	obs_segen="";
	private String	area_interloc="";
	private Long	nro_medidor;
	private String	marca_med="";
	private String	modelo_med="";
	private String	cla_servi="";
	private Double	potencia;
	private String	tension="";
	private String	acometida="";
	private String	toma="";
	private String	conexion="";
	private String	pre1_ubic="";
	private String	pre2_ubic="";
	private String	pre3_ubic="";
	private String	ruta_lectura="";
	private String	nombre_cli="";
	private Long	nro_cli;
	private String	nom_entre="";
	private String	nom_entre1="";
	private String	telefono="";
	private String	nom_calle="";
	private String	nro_dir="";
	private String	nom_partido="";
	private String	piso_dir="";
	private String	depto_dir="";
	private String	nom_comuna="";
	private int		cod_postal;
	private Date	fecha_vto;
	private String	rol_creador="";
	private static final String	nombre_rol="SALESFORCE";
	private static final String	proced="M_SEGEN";
	private Long	nro_proced;
	private String	cod_barrio="";
	private String	nom_barrio="";
	private String	cod_barra="";

	//Setters & getters
	public void setNroOrden(String nroOrden){
		this.nro_orden=nroOrden;
	}
	public String getNroOrden(){
		return this.nro_orden;
	}
	
	public String getTipoIfaz(){
		return this.tipo_ifaz;
	}
	
	public void setTipoTraba(String tipoTraba){
		this.tipo_traba=tipoTraba;
	}
	public String getTipoTraba(){
		return this.tipo_traba;
	}	

	public void setSucursal(String sucursal){
		this.sucursal=sucursal;
	}
	public String getSucursal(){
		return this.sucursal;
	}	

	public void setAreaEjecuta(String area){
		this.area_ejecuta=area;
	}
	public String getAreaEjecuta(){
		return this.area_ejecuta;
	}

	public void setMotivo(String motivo){
		this.motivo=motivo;
	}
	public String getMotivo(){
		return this.motivo;
	}

	public void setObsDir(String obs){
		this.obs_dir=obs;
	}
	public String getObsDir(){
		return this.obs_dir;
	}

	public void setObsLectu(String obs){
		this.obs_lectu=obs;
	}
	public String getObsLectu(){
		return this.obs_lectu;
	}

	public void setObsSegen(String obs){
		this.obs_segen=obs;
	}
	public String getObsSegen(){
		return this.obs_segen;
	}

	public void setAreaInterloc(String interloc){
		this.area_interloc=interloc;
	}
	public String getAreaInterloc(){
		return this.area_interloc;
	}

	public void setNroMedidor(Long nro){
		this.nro_medidor = nro;
	}
	public Long getNroMedidor(){
		return this.nro_medidor;
	}

	public void setMarcaMed(String marca){
		this.marca_med=marca;
	}
	public String getMarcaMed(){
		return this.marca_med;
	}

	public void setModeloMed(String modelo){
		this.modelo_med=modelo;
	}
	public String getModeloMed(){
		return this.modelo_med;
	}

	public void setClaServi(String clase){
		this.cla_servi=clase;
	}
	public String getClaServi(){
		return this.cla_servi;
	}
	
	public void setPotencia(Double potencia){
		this.potencia=potencia;
	}
	public Double getPotencia(){
		return this.potencia;
	}
	
	public void setTension(String tension){
		this.tension=tension;
	}
	public String getTension(){
		return this.tension;
	}

	public void setAcometida(String acometida){
		this.acometida=acometida;
	}
	public String getAcometida(){
		return this.acometida;
	}

	public void setToma(String toma){
		this.toma=toma;
	}
	public String getToma(){
		return this.toma;
	}

	public void setConexion(String conexion){
		this.conexion=conexion;
	}
	public String getConexion(){
		return this.conexion;
	}

	public void setPreUbic1(String precinto){
		this.pre1_ubic=precinto;
	}
	public String getPreUbic1(){
		return this.pre1_ubic;
	}

	public void setPreUbic2(String precinto){
		this.pre2_ubic=precinto;
	}
	public String getPreUbic2(){
		return this.pre2_ubic;
	}
	
	public void setPreUbic3(String precinto){
		this.pre3_ubic=precinto;
	}
	public String getPreUbic3(){
		return this.pre3_ubic;
	}
		
	public void setRutaLectura(String ruta){
		this.ruta_lectura=ruta;
	}
	public String getRutaLectura(){
		return this.ruta_lectura;
	}

	public void setNombreCliente(String nombre){
		this.nombre_cli=nombre;
	}
	public String getNombreCliente(){
		return this.nombre_cli;
	}

	public void setNroCliente(Long nro){
		this.nro_cli=nro;
	}
	public Long getNroCliente(){
		return this.nro_cli;
	}
	
	public void setNomEntreCalle(String calle){
		this.nom_entre=calle;
	}
	public String getNomEntreCalle(){
		return this.nom_entre;
	}

	public void setNomEntreCalle1(String calle){
		this.nom_entre1=calle;
	}
	public String getNomEntreCalle1(){
		return this.nom_entre1;
	}

	public void setTelefono(String telefono){
		this.telefono=telefono;
	}
	public String getTelefono(){
		return this.telefono;
	}

	public void setNomCalle(String calle){
		this.nom_calle=calle;
	}
	public String getNomCalle(){
		return this.nom_calle;
	}

	public void setNroDir(String altura){
		this.nro_dir=altura;
	}
	public String getNroDir(){
		return this.nro_dir;
	}
	
	public void setNomPartido(String partido){
		this.nom_partido=partido;
	}
	public String getNomPartido(){
		return this.nom_partido;
	}
	
	public void setPisoDir(String piso){
		this.piso_dir=piso;
	}
	public String getPisoDir(){
		return this.piso_dir;
	}	

	public void setDeptoDir(String depto){
		this.depto_dir=depto;
	}
	public String getDeptoDir(){
		return this.depto_dir;
	}
	
	public void setNomComuna(String comuna){
		this.nom_comuna=comuna;
	}
	public String getNomComuna(){
		return this.nom_comuna;
	}
	
	public void setCodPostal(int codPostal){
		this.cod_postal=codPostal;
	}
	public int getCodPostal(){
		return this.cod_postal;
	}

	public void setFechaVto(Date fecha){
		this.fecha_vto=fecha;
	}
	public Date getFechaVto(){
		return this.fecha_vto;
	}
	
	public void setRolCreador(String rol){
		this.rol_creador=rol;
	}
	public String getRolCreador(){
		return this.rol_creador;
	}

	public String getNombreRol(){
		return this.nombre_rol;
	}	

	public String getProced(){
		return this.proced;
	}
	
	public void setNroProced(Long proced){
		this.nro_proced=proced;
	}
	public Long getNroProced(){
		return this.nro_proced;
	}
	
	public void setCodBarrio(String barrio){
		this.cod_barrio=barrio;
	}
	public String getCodBarrio(){
		return this.cod_barrio;
	}
	
	public void setNomBarrio(String barrio){
		this.nom_barrio=barrio;
	}
	public String getNomBarrio(){
		return this.nom_barrio;
	}
	
	public void setCodBarra(String barra){
		this.cod_barra=barra;
	}
	public String getCodBarra(){
		return this.cod_barra;
	}
	
    @Override
    public String toString() {
		int i=0;
		
        final StringBuilder sb = new StringBuilder("OtMacSap{");
		sb.append("nro_orden='").append(nro_orden).append('\'');
		sb.append(", tipo_ifaz='").append(tipo_ifaz).append('\'');
		sb.append(", tipo_traba='").append(tipo_traba).append('\'');
		sb.append(", sucursal='").append(sucursal).append('\'');
		sb.append(", area_ejecuta='").append(area_ejecuta).append('\'');
		sb.append(", motivo='").append(motivo).append('\'');
		sb.append(", obs_dir='").append(obs_dir).append('\'');
		sb.append(", obs_lectu='").append(obs_lectu).append('\'');
		sb.append(", obs_segen='").append(obs_segen).append('\'');
		sb.append(", area_interloc='").append(area_interloc).append('\'');
		sb.append(", nro_medidor=").append(nro_medidor);
		sb.append(", marca_med='").append(marca_med).append('\'');
		sb.append(", modelo_med='").append(modelo_med).append('\'');
		sb.append(", cla_servi='").append(cla_servi).append('\'');
		sb.append(", potencia=").append(potencia);
		sb.append(", tension='").append(tension).append('\'');
		sb.append(", acometida='").append(acometida).append('\'');
		sb.append(", toma='").append(toma).append('\'');
		sb.append(", conexion='").append(conexion).append('\'');
		sb.append(", pre1_ubic='").append(pre1_ubic).append('\'');
		sb.append(", pre2_ubic='").append(pre2_ubic).append('\'');
		sb.append(", pre3_ubic='").append(pre3_ubic).append('\'');
		sb.append(", ruta_lectura='").append(ruta_lectura).append('\'');
		sb.append(", ruta_lectura='").append(ruta_lectura).append('\'');
		sb.append(", nro_cli=").append(nro_cli);
		sb.append(", nom_entre='").append(nom_entre).append('\'');
		sb.append(", nom_entre1='").append(nom_entre1).append('\'');		
		sb.append(", telefono='").append(telefono).append('\'');
		sb.append(", nom_calle='").append(nom_calle).append('\'');
		sb.append(", nro_dir='").append(nro_dir).append('\'');
		sb.append(", nom_partido='").append(nom_partido).append('\'');
		sb.append(", piso_dir='").append(piso_dir).append('\'');
		sb.append(", depto_dir='").append(depto_dir).append('\'');
		sb.append(", nom_comuna='").append(nom_comuna).append('\'');
		sb.append(", cod_postal=").append(cod_postal);
		sb.append(", fecha_vto=").append(fecha_vto);
		sb.append(", rol_creador='").append(rol_creador).append('\'');
		sb.append(", nombre_rol='").append(nombre_rol).append('\'');
		sb.append(", proced='").append(proced).append('\'');
		sb.append(", nro_proced=").append(nro_proced);
		sb.append(", cod_barrio='").append(cod_barrio).append('\'');
		sb.append(", nom_barrio='").append(nom_barrio).append('\'');
		sb.append(", cod_barra='").append(cod_barra).append('\'');
        sb.append('}');
        
        return sb.toString();
    }

}
