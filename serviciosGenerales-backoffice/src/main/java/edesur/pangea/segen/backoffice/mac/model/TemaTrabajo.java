package edesur.pangea.segen.backoffice.mac.model;

public class TemaTrabajo {
    private CodigoDescripcion tema = new CodigoDescripcion();
    private CodigoDescripcion trabajo = new CodigoDescripcion();
    private String genOT;

    public CodigoDescripcion getTema() {
        return tema;
    }

    public void setTema(CodigoDescripcion tema) {
        this.tema = tema;
    }

    public CodigoDescripcion getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(CodigoDescripcion trabajo) {
        this.trabajo = trabajo;
    }

	public String getGenOT(){
		return this.genOT;
	}
	public void setGenOT(String sGenOt){
		this.genOT=sGenOt;
	}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TemaTrabajo{");
        sb.append("tema=").append(tema);
        sb.append(", trabajo=").append(trabajo);
        sb.append(", genOT='").append(genOT).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
