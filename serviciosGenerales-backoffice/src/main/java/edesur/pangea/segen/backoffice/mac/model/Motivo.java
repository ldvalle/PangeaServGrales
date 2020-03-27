package edesur.pangea.segen.backoffice.mac.model;

public class Motivo {
    private CodigoDescripcion motivoCliente = new CodigoDescripcion();
    private CodigoDescripcion motivoEmpresa = new CodigoDescripcion();

    public CodigoDescripcion getMotivoCliente() {
        return motivoCliente;
    }

    public void setMotivoCliente(CodigoDescripcion motivoCliente) {
        this.motivoCliente = motivoCliente;
    }

    public CodigoDescripcion getMotivoEmpresa() {
        return motivoEmpresa;
    }

    public void setMotivoEmpresa(CodigoDescripcion motivoEmpresa) {
        this.motivoEmpresa = motivoEmpresa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Motivo{");
        sb.append("motivoCliente=").append(motivoCliente);
        sb.append(", motivoEmpresa=").append(motivoEmpresa);
        sb.append('}');
        return sb.toString();
    }
}
