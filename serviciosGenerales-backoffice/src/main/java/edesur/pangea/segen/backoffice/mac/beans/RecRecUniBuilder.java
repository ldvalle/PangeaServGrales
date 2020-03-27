package edesur.pangea.segen.backoffice.mac.beans;

import edesur.pangea.segen.backoffice.Headers;
import edesur.pangea.segen.backoffice.mac.model.*;
import org.apache.camel.Header;

public class RecRecUniBuilder {
    public RecRecUni crear(
            @Header(Headers.DATOS_CLIENTE)Cliente cliente,
            @Header(Headers.CONTACTO) Contacto contacto,
            @Header(Headers.PROCEDIMIENTO)Procedimiento procedimiento,
            @Header(Headers.TEMA_TRABAJO) TemaTrabajo temaTrabajo,
            @Header(Headers.PARAMETROS_CONTACTO) Parametros parametros,
            @Header(Headers.DATOS_TECNICOS)DatosTecnicos datosTecnicos,
            @Header(Headers.CODIGO_AGRUPACION)String codigoAgrupacion
            ) {
        RecRecUni r = new RecRecUni();
        r.setNumeroCliente(cliente.getNumero());
        r.setNumeroReclamo(contacto.getNumero());
        r.setNumeroMensaje(procedimiento.getNumeroMensaje());
        r.setTrabajoRequerido(trabajoRequerido(temaTrabajo));
        r.setMotivoCliente(contacto.getMotivo());
        r.setMotivoEmpresa(contacto.getMotivoEmpresa());
        r.setFechaInicioContacto(contacto.getFechaInicio());
        r.setPlazo(parametros.getPlazoRespuenta());
        r.setFechaVencimientoContacto(contacto.getFechaVencimiento());
        r.setFechaVencimientoCT(contacto.getFechaVencimientoCT());
        r.setNombreCliente(cliente.getNombre());
        r.setTelefono(cliente.getTelefono());
        if (datosTecnicos == null) {
            setDireccion(r, cliente);
        }
        else {
            setDireccion(r, datosTecnicos);
        }
        r.setCodigoAgrupacion(codigoAgrupacion);
        r.setPlazoTecnico(parametros.getPlazoRespuenta());
        r.setEtapa(tipoReclamo(contacto));
        r.setTipoSuministro(tipoSuministro(datosTecnicos));
        r.setFechaInicioEdesur(contacto.getFechaInicio());
        return  r;
    }

    private String trabajoRequerido(TemaTrabajo temaTrabajo) {
        return String.join("-", temaTrabajo.getTema().getDescripcion(), temaTrabajo.getTrabajo().getDescripcion());
    }

    private void setDireccion(RecRecUni r, Cliente cliente) {
        r.setCodigoCalle(cliente.getCodigoCalle());
        r.setCalle(cliente.getCalle());
        r.setPiso(cliente.getPiso());
        r.setDpto(cliente.getDepto());
        r.setNumeroPuerta(cliente.getNumeroDireccion());
        r.setCodigoEntreCalle(cliente.getCodigoEntreCalle1());
        r.setEntreCalle(cliente.getEntreCalle1());
        r.setCodidogEntreCalle2(cliente.getCodigoEntreCalle2());
        r.setEntreCalle2(cliente.getEntreCalle2());
        r.setCodigoLocalidad(cliente.getCodigoLocalidad());
        r.setLocalidad(cliente.getLocalidad());
        r.setCodigoPartido(cliente.getCodigoPartido());
        r.setPartido(cliente.getPartido());
        r.setSucursalTecnica(cliente.getSucursal());
        r.setNombreSucursalTecnica(cliente.getNombreSucursal());
        r.setSinTecni("S");
    }

    private void setDireccion(RecRecUni r, DatosTecnicos datosTecnicos) {
        r.setCodigoCalle(datosTecnicos.getCodigoCalle());
        r.setCalle(datosTecnicos.getCalle());
        r.setPiso(datosTecnicos.getPiso());
        r.setDpto(datosTecnicos.getDepto());
        r.setNumeroPuerta(datosTecnicos.getNumero());
        r.setCodigoEntreCalle(datosTecnicos.getCodigoEntreCalle1());
        r.setEntreCalle(datosTecnicos.getEntreCalle1());
        r.setCodidogEntreCalle2(datosTecnicos.getCodigoEntreCalle2());
        r.setEntreCalle2(datosTecnicos.getEntreCalle2());
        r.setNumeroManzana(datosTecnicos.getManzana());
        r.setCodigoLocalidad(datosTecnicos.getCodigoLocalidad());
        r.setLocalidad(datosTecnicos.getLocalidad());
        r.setCodigoPartido(datosTecnicos.getCodigoPartido());
        r.setPartido(datosTecnicos.getPartido());
        r.setSucursalTecnica(datosTecnicos.getCodigoSucursal());
        r.setNombreSucursalTecnica(datosTecnicos.getSucursal());
        r.setCodigoSubestacion(datosTecnicos.getSubestacion());
        r.setNombreSubestacion(datosTecnicos.getNombreSubestacion());
        r.setAlimentador(datosTecnicos.getAlimentador());
        r.setCentroTransformacion(datosTecnicos.getCentroTransformacion());
        r.setSinTecni("N");
    }

    private String tipoReclamo(Contacto contacto) {
        switch (contacto.getTipo()) {
            case "0":
                return "Consulta";
            case "1":
                return "Reclamo";
            case "2":
                return "Requerimiento";
            case "3":
                return "Consulta Rapida";
        }
        return null;
    }

    private String tipoSuministro(DatosTecnicos datosTecnicos) {
        return "1".equals(datosTecnicos.getCodigoVoltaje()) ? "1" : "2";
    }
}
