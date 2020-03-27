package edesur.pangea.segen.backoffice.mac.model;

import edesur.pangea.util.DateFormat;
import java.util.Date;


//LDV

public class ContactoSegen {
	private int		se_servidor;
	private long	se_mensaje;
	private String	se_orden;
	private String	se_cod_mot_empresa;
	private String	se_cod_motivo;
	private long	se_co_numero;
	private String	se_suc_contacto;
	private Date	se_fecha_creacion;
	private	String	se_rol_creacion;
	private String	se_area_creacion; 
	private Date	se_fecha_vto_real; 
	private Date	se_fecha_vto;
	private Date	se_fecha_modif;
	private static final String se_etapa="MODIFICACION";
	private static final String	se_estado="0";
	private static final String	se_sub_estado="0";
	private String	se_rol_destino;
	private String	se_tema; 
	private	String	se_trabajo;

	public int getServidor(){
		return this.se_servidor;
	}
	public void setServidor(int servidor){
		this.se_servidor = servidor;
	}
	
	public long getMensaje(){
		return this.se_mensaje;
	}
	public void setMensaje(long mensaje){
		this.se_mensaje=mensaje;
	}
	
	public String getOrden(){
		return this.se_orden;
	}
	public void setOrden(String orden){
		this.se_orden=orden;
	}
	
	public String getMotEmpresa(){
		return this.se_cod_mot_empresa;
	}
	public void setMotEmpresa(String motEmpresa){
		this.se_cod_mot_empresa=motEmpresa;
	}
	
	public String getMotCliente(){
		return this.se_cod_motivo;
	}
	public void setMotCliente(String motCliente){
		this.se_cod_motivo=motCliente;
	}
	
	public long getNroContacto(){
		return this.se_co_numero;
	}
	public void setNroContacto(long coNumero){
		this.se_co_numero = coNumero;
	}
	
	public String getSucContacto(){
		return this.se_suc_contacto;
	}
	public void setSucContacto(String sucContacto){
		this.se_suc_contacto = sucContacto;
	}
	
	public Date getFechaCreacion(){
		return this.se_fecha_creacion;
	}
	public void setFechaCreacion(Date fecha){
		this.se_fecha_creacion=fecha;
	}
	
	public String getRolCreacion(){
		return this.se_rol_creacion;
	}
	public void setRolCreacion(String rol){
		this.se_rol_creacion=rol;
	}

	public String getAreaCreacion(){
		return this.se_area_creacion;
	}
	public void setAreaCreacion(String area){
		this.se_area_creacion=area;
	}
	
	public Date getFechaVtoReal(){
		return this.se_fecha_vto_real;
	}
	public void setFechaVtoReal(Date fecha){
		this.se_fecha_vto_real=fecha;
	}
	
	public Date getFechaVto(){
		return this.se_fecha_vto;
	}
	public void setFechaVto(Date fecha){
		this.se_fecha_vto=fecha;
	}

	public Date getFechaModif(){
		return this.se_fecha_modif;
	}
	public void setFechaModif(Date fecha){
		this.se_fecha_modif=fecha;
	}
	
	public String getEtapa(){
		return this.se_etapa;
	}
	public String getEstado(){
		return this.se_estado;
	}
	public String getSubEstado(){
		return this.se_sub_estado;
	}
	
	public String getRolDestino(){
		return this.se_rol_destino;
	}
	public void setRolDestino(String rol){
		this.se_rol_destino = rol;
	}
	
	public String getTema(){
		return this.se_tema;
	}
	public void setTema(String tema){
		this.se_tema=tema;
	}
	
	public String getTrabajo(){
		return this.se_trabajo;
	}
	public void setTrabajo(String trabajo){
		this.se_trabajo=trabajo;
	}
	
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContactoSegen{");
        sb.append("se_servidor=").append(se_servidor);
        sb.append(", se_mensaje=").append(se_mensaje);
        sb.append(", se_orden='").append(se_orden).append('\'');
        sb.append(", se_cod_mot_empresa='").append(se_cod_mot_empresa).append('\'');
        sb.append(", se_cod_motivo='").append(se_cod_motivo).append('\'');
        sb.append(", se_co_numero=").append(se_co_numero);
        sb.append(", se_suc_contacto='").append(se_suc_contacto).append('\'');
        sb.append(", se_fecha_creacion=").append(DateFormat.toDateTimeString(se_fecha_creacion));
        sb.append(", se_rol_creacion='").append(se_rol_creacion).append('\'');
        sb.append(", se_area_creacion='").append(se_area_creacion).append('\'');
        sb.append(", se_fecha_vto_real=").append(DateFormat.toDateTimeString(se_fecha_vto_real));
        sb.append(", se_fecha_vto=").append(DateFormat.toDateTimeString(se_fecha_vto));
        sb.append(", se_fecha_modif=").append(DateFormat.toDateTimeString(se_fecha_modif));
        sb.append(", se_etapa='").append(se_etapa).append('\'');
        sb.append(", se_estado='").append(se_estado).append('\'');
        sb.append(", se_sub_estado='").append(se_sub_estado).append('\'');
        sb.append(", se_rol_destino='").append(se_rol_destino).append('\'');
        sb.append(", se_tema='").append(se_tema).append('\'');
        sb.append(", se_trabajo='").append(se_trabajo).append('\'');
        sb.append('}');
        return sb.toString();
    }	
	
}

