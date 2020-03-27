package edesur.pangea.segen.backoffice.mac.model;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;

public class Segen extends Procedimiento {
    private static final SimpleDateFormat fmtFecha = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat fmtFechaCorta = new SimpleDateFormat("yy/MM/dd");
    private static final SimpleDateFormat fmtISO = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Segen(Contacto contacto, Cliente cliente, TemaTrabajo temaTrabajo, String rolDestino) {
        super();
        setProcedimiento("M_SEGEN");
        setRolDestino(rolDestino);
        setReferencia(crearReferencia(contacto));
        setTexto(crearText(contacto, cliente, temaTrabajo));
    }

    @Override
    public void setNumeroMensaje(long numeroMensaje) {
        super.setNumeroMensaje(numeroMensaje);
        setTexto(crearTextData(getTexto(), String.format("%08d", numeroMensaje)));
    }

    private String crearReferencia(Contacto contacto) {
        StringBuilder sb = new StringBuilder();
        sb.append(fmtFechaCorta.format(contacto.getFechaInicio()))
                .append("-")
                .append(Integer.parseInt(contacto.getMotivo()))
                .append("/")
                .append(Integer.parseInt(contacto.getMotivoEmpresa()))
                .append("-$0.00-Cl")
                .append(contacto.getNumeroCliente())
                .append("-Co");
        if (contacto.getNumero() > 0) {
            sb.append(contacto.getNumero());
        }
        else {
            // el número lo voy a agregar cuando lo tenga;
        }
        return sb.toString();
    }

    private String crearText(Contacto contacto, Cliente cliente, TemaTrabajo temaTrabajo) {
        StringBuilder sb = new StringBuilder();

        sb.append("-")
                .append(contacto.getRolInicio()).append("-RQ-").append(fmtFecha.format(contacto.getFechaInicio()));

        sb.append(StringUtils.repeat('-', 64 - sb.length())).append(LineEnding.DOS)
                .append("N.Contacto: ").append(contacto.getNumero())
                .append(" Motivo: ").append(contacto.getDescripcionMotivo()).append("/").append(contacto.getDescripcionMotivoEmpresa())
                .append(LineEnding.DOS);

        if (StringUtils.isNotEmpty(contacto.getComentarios())) {
            sb.append(contacto.getComentarios()).append(LineEnding.DOS);
        }

        String telefono = null;
        if (StringUtils.isNotEmpty(contacto.getTelefono())) {
            telefono = contacto.getTelefono();
        }
        else {
            if (StringUtils.isNotEmpty(cliente.getTelefono())) {
                telefono = cliente.getTelefono();
            }
        }
        if (telefono != null) {
            sb.append("Tel: ").append(telefono).append(LineEnding.DOS);
        }

        sb.append(crearTextData("", "", ""));

        sb.append(crearTextData(
                "",
                getRolDestino(),
                cliente.getNombre(),
                cliente.getDireccion(),
                String.format("%03d%05d%05d", cliente.getPlan(), cliente.getZona(), cliente.getCorrelativoRuta()),
                cliente.getLocalidad(),
                Long.toString(cliente.getNumeroMedidor()),
                "Atencion Comercial",
                temaTrabajo.getTema().getDescripcion(),
                temaTrabajo.getTrabajo().getDescripcion(),
                "Teléfono",
                Integer.toString(contacto.getNumeroCliente()),
                fmtFecha.format(contacto.getFechaVencimiento()),
                "AC",
                "0005",
                temaTrabajo.getTrabajo().getCodigo(),
                cliente.getNombreSucursal(),
                "",
                temaTrabajo.getTema().getCodigo(),
                cliente.getCuentaConver(),
                "",
                "",
                cliente.getSucursal(),
                ""
        ));

        return sb.toString();
    }
}
