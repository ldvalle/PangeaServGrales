package edesur.pangea.segen.backoffice.mac.beans;

import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.model.*;
import org.apache.camel.Header;

public class OtMacBuilder {
    public OtMac crear(
            @Header(Headers.DATOS_CLIENTE) DatosCliente cliente,
            @Header(Headers.PROCEDIMIENTO)Procedimiento procedimiento,
            @Header(Headers.TEMA_TRABAJO) TemaTrabajo temaTrabajo,
            @Header(Headers.AREA_DESTINO) String areaDestino,
            @Header(Headers.CONTACTO_SEGEN) ContactoSegen ctoSegen,
            @Header(Headers.DATOS_TECNICOS) DatosTecnicos dataTecni,
            @Header(Headers.PARAMETROS_CONTACTO) Parametros parametros
            ) {
		OtMac r = new OtMac();
		CodigoDescripcion cd = new CodigoDescripcion();

		r.setNumeroCliente(cliente.getNumero());
		r.setMensajeXnear(procedimiento.getNumeroMensaje());
		r.setSucursalPadre(cliente.getSucPadre());
		r.setSucursal(cliente.getSucursal());
		r.setSector(cliente.getPlan());
		r.setZona(cliente.getZona());
		r.setCorrelativoRuta(cliente.getCorrelativoRuta());
		r.setTipoTraba("SE" + cd.getCodigo(temaTrabajo.getTema()).substring(0,2));
		r.setAreaInterloc(areaDestino);
		r.setMotivo(cd.getCodigo(temaTrabajo.getTrabajo()).substring(0,4));
		r.setRolEjecuta(ctoSegen.getRolCreacion());
		r.setAreaEjecuta(ctoSegen.getAreaCreacion());
		r.setPotencia(cliente.getPotenciaContrato());
		r.setTension(dataTecni.getCodigoVoltaje());
		String sAcometida=dataTecni.getAcometida();
		if(sAcometida != null)
			r.setAcometida(sAcometida);
			
		r.setToma(cliente.getTipoEmpalme());
		r.setConexion(dataTecni.getTipoConexion());
		r.setFechaVto(parametros.calcularFechaVencimiento(ctoSegen.getFechaModif(), Parametros.TipoVencimiento.CT));

        return  r;
    }
    
}
