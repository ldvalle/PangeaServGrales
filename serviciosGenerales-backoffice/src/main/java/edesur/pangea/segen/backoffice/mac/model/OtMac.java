package edesur.pangea.segen.backoffice.mac.model;

import org.apache.commons.lang3.StringUtils;
import java.util.Date;

public class OtMac {

	private long	numero_cliente;
	private static final String	envia_sap="S";
	private long	mensaje_xnear;
	private static final String	proced="M_SEGEN";
	private static final String	estado="C";
	private static final String	status="INIC";
	private String	sucursal_padre="";
	private String	sucursal="";
	private int		sector;
	private int		zona;
	private long	correlativo_ruta;
	private String	tipo_traba="";
	private String	area_interloc="";
	private String	motivo="";
	private String	rol_ejecuta="";
	private String	area_ejecuta="";
	private double	potencia;
	private String	tension="";
	private String	acometida="";
	private String 	toma="";
	private String	conexion="";
	private Date	fecha_vto;
	private String	proyecto="";

	public void setNumeroCliente(long nroCliente){
		this.numero_cliente = nroCliente;
	}
	public long getNumeroCliente(){
		return this.numero_cliente;
	}

	public String getEnviaSap(){
		return this.envia_sap;
	}

	public void setMensajeXnear(long mensaje){
		this.mensaje_xnear = mensaje;
	}
	public long getMensajeXnear(){
		return this.mensaje_xnear;
	}
	
	public String getProced(){
		return this.proced;
	}
	
	public String getEstado(){
		return this.estado;
	}

	public String getStatus(){
		return this.status;
	}
	
	public void setSucursalPadre(String sucur){
		this.sucursal_padre = sucur;
	}
	public String getSucursalPadre(){
		return this.sucursal_padre;
	}
	
	public void setSucursal(String sucur){
		this.sucursal = sucur;
	}
	public String getSucursal(){
		return this.sucursal;
	}
	
	public void setSector(int sector){
		this.sector=sector;
	}
	public int getSector(){
		return this.sector;
	}
	
	public void setZona(int zona){
		this.zona=zona;
	}
	public int getZona(){
		return this.zona;
	}
	
	public void setCorrelativoRuta(long correlativo){
		this.correlativo_ruta=correlativo;
	}
	public long getCorrelativoRuta(){
		return this.correlativo_ruta;
	}
	
	public void setTipoTraba(String tipoTrabajo){
		this.tipo_traba = tipoTrabajo;
	}
	public String getTipoTraba(){
		return this.tipo_traba;
	}

	public void setAreaInterloc(String areaInterloc){
		this.area_interloc = areaInterloc;
	}
	public String getAreaInterloc(){
		return this.area_interloc;
	}

	public void setMotivo(String motivo){
		this.motivo = motivo;
	}
	public String getMotivo(){
		return this.motivo;
	}
	
	public void setRolEjecuta(String rolEjecuta){
		this.rol_ejecuta = rolEjecuta;
	}
	public String getRolEjecuta(){
		return this.rol_ejecuta;
	}

	public void setAreaEjecuta(String areaEjecuta){
		this.area_ejecuta = areaEjecuta;
	}
	public String getAreaEjecuta(){
		return this.area_ejecuta;
	}
	
	public void setPotencia(double potencia){
		this.potencia=potencia;
	}
	public double getPotencia(){
		return this.potencia;
	}
	
	public void setTension(String tension){
		this.tension = tension;
	}
	public String getTension(){
		return this.tension;
	}
	
	public void setAcometida(String acometida){
		this.acometida = acometida;
	}
	public String getAcometida(){
		return this.acometida;
	}
	
	public void setToma(String toma){
		this.toma = toma;
	}
	public String getToma(){
		return this.toma;
	}	

	public void setConexion(String conexion){
		this.conexion = conexion;
	}
	public String getConexion(){
		return this.conexion;
	}	
	
	public void setFechaVto(Date fecha){
		this.fecha_vto = fecha;
	}
	public Date getFechaVto(){
		return this.fecha_vto;
	}	
	
	public void setProyecto(String proyecto){
		this.proyecto = proyecto;
	}
	public String getProyecto(){
		return this.proyecto;
	}
	
		
    @Override
    public String toString() {
		int i=0;
		
        final StringBuilder sb = new StringBuilder("OtMac{");
        sb.append("numero_cliente=").append(numero_cliente);
        sb.append(", envia_sap='").append(envia_sap).append('\'');
        sb.append(", mensaje_xnear=").append(mensaje_xnear);
        sb.append(", proced='").append(proced).append('\'');
        sb.append(", estado='").append(estado).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", sucursal_padre='").append(sucursal_padre).append('\'');
        sb.append(", sucursal='").append(sucursal).append('\'');
        sb.append(", sector=").append(sector);
        sb.append(", zona=").append(zona);
        sb.append(", correlativo_ruta=").append(correlativo_ruta);
        sb.append(", tipo_traba='").append(tipo_traba).append('\'');
        sb.append(", area_interloc='").append(area_interloc).append('\'');        
        sb.append(", motivo='").append(motivo).append('\'');        
        sb.append(", rol_ejecuta='").append(rol_ejecuta).append('\'');
        sb.append(", area_ejecuta='").append(area_ejecuta).append('\'');
		sb.append(", potencia=").append(potencia);
        sb.append(", tension='").append(tension).append('\'');
        sb.append(", acometida='").append(acometida).append('\'');
        sb.append(", toma='").append(toma).append('\'');
        sb.append(", conexion='").append(conexion).append('\'');        
        sb.append(", fecha_vto=").append(fecha_vto);
        sb.append(", proyecto='").append(proyecto).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
