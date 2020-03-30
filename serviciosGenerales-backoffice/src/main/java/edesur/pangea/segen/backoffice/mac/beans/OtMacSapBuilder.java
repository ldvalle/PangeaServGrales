package edesur.pangea.segen.backoffice.mac.beans;

import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.model.*;
import org.apache.camel.Header;

public class OtMacSapBuilder {
    public OtMacSap crear(
            
            @Header(Headers.PROCEDIMIENTO)Procedimiento procedimiento,
            @Header(Headers.TEMA_TRABAJO) TemaTrabajo temaTrabajo,
            @Header(Headers.AREA_DESTINO) String areaDestino,
            @Header(Headers.CONTACTO_SEGEN) ContactoSegen ctoSegen,
            
            @Header(Headers.PARAMETROS_CONTACTO) Parametros parametros,
            
            @Header(Headers.OT_MAC) OtMac ot,
            @Header(Headers.DATOS_CLIENTE) DatosCliente cliente,
            @Header(Headers.TEMA_TRABAJO) TemaTrabajo temaTrabajo,
            @Header(Headers.DATOS_TECNICOS) DatosTecnicos dataTecni,
            ) {
		OtMacSap r = new OtMacSap();
		CodigoDescripcion cd = new CodigoDescripcion();
		String[] sPrecintos = cliente.getLstPrecintos();
		int iMax=sPrecintos.length;
		int i;
		String sRutaLectura = cliente.getSucursal() + "-" + String.format("%d03", cliente.getPlan()) + "-" + String.format("%d05", cliente.getZona()) + "-" + String.format("%d05", cliente.getCorrelativoRuta());
		String sCodBarra = String.format("%d03", Integer.parseInt(cliente.getNroCb())) + String.format("%d09", cliente.getNumeroMedidor());
		
		
		//r.setNroOrden();
		r.setTipoTraba(ot.getTipoTraba());
		r.setSucursal(ot.getSucursal());
		r.setAreaEjecuta(ot.getAreaEjecuta);
		r.setMotivo(r.getMotivo());
		r.setObsDir(cliente.getObsDir());
		r.setObsLectu(cliente.getObsLectu());
		r.setObsSegen(cd.getDescripcion(temaTrabajo.getTrabajo()));
		r.setAreaInterloc(ot.getAreaInterloc());
		r.setNroMedidor(cliente.getNumeroMedidor());
		r.setMarcaMed(cliente.getMarcaMedidor());
		r.setModeloMed(cliente.getModeloMedidor());
		r.setClaServi(cliente.getTipoCliente());
		r.setPotencia(cliente.getPotenciaContrato());
		r.setTension(dataTecni.getCodigoVoltaje());
		
		if(dtaTecni.getAcometida() != null)
			r.setAcometida(dataTecni.getAcometida());

		r.setToma(cliente.getTipoEmpalme());
		r.setConexion(dataTecni.getTipoConexion());

		if(iMax>3)
			iMax=3;
			
		for(i=0; i<= iMax; i++){
			switch(i){
				case 0:
					r.setPreUbic1(sPrecintos[i]);
					break;
				case 1:
					r.setPreUbic2(sPrecintos[i]);
					break;
				case 2:
					r.setPreUbic3(sPrecintos[i]);
					break;
			}
			
		}
		r.setRutaLectura(sRutaLectura);
		r.setNombreCliente(cliente.getNombre());
		r.setNroCliente(cliente.getNumero());
		r.setNomEntreCalle(cliente.getEntreCalle1());
		r.setNomEntreCalle1(cliente.getEntreCalle2());
		r.setTelefono(cliente.getTelefono());
		r.setNomCalle(cliente.getCalle());
		r.setNroDir(cliente.getNumeroDireccion());
		r.setNomPartido(cliente.getPartido());
		r.setPisoDir(cliente.getPiso());
		r.setDeptoDir(cliente.getDepto());
		r.setNomComuna(cliente.getLocalidad());
		r.setCodPostal(cliente.getCodigoPostal());
		r.setFechaVto(ot.getFechaVto());
		r.setRolCreador(ot.getRolEjecuta());
		r.setNroProced(ot.getMensajeXnear());
		r.setCodBarrio(cliente.getCodBarrio());
		r.setNomBarrio(cliente.getNomBarrio());
		r.setCodBarra(sCodBarra);

        return  r;
    }
    
}
