package edesur.pangea.segen.backoffice.mac.model;

public class Procedimiento {
    private static final char TEXST_DELIMITER = 254;

    private static final String privacidad = "1";
    private static final String urgencia = "4";
    private static final String encriptado = "N";
    private static final int    empresa = 1;
    private static final String rolOrigen = "SALESFORCE";
    private static final String areaOrigen = "SF00";
    private static final String etapa = "MODIFICACION";

    private long   numeroMensaje;
    private String procedimiento;
    private String referencia;
    private String rolDestino;
    private String texto;


    protected String crearTextData(String... datos) {
        return String.join(String.valueOf(TEXST_DELIMITER), datos);
    }

    // Constantes
    public String getPrivacidad() {
        return privacidad;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public String getEncriptado() {
        return encriptado;
    }

    public int getEmpresa() {
        return empresa;
    }

    public String getRolOrigen() {
        return rolOrigen;
    }

    public String getAreaOrigen() {
        return areaOrigen;
    }

    public String getEtapa() {
        return etapa;
    }


    // Propiedades
    public long getNumeroMensaje() {
        return numeroMensaje;
    }

    public void setNumeroMensaje(long numeroMensaje) {
        this.numeroMensaje = numeroMensaje;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    protected void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getRolDestino() {
        return rolDestino;
    }

    public void setRolDestino(String rolDestino) {
        this.rolDestino = rolDestino;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


    enum LineEnding {
        DOS("\r\n");

        private String lineSeparator;

        LineEnding(String lineSeparator) {
            this.lineSeparator = lineSeparator;
        }

        public String getLineSeparator() {
            return lineSeparator;
        }

        @Override
        public String toString() {
            return lineSeparator;
        }
    }
}
