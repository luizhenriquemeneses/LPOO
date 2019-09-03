package lista2;

public class AparelhosCelulares extends DispositivosTelefonia.java {
    private String baterias;
    private Float frequencia;
    private Boolean TelaTouch;
    private Boolean Reprodutor;
    private Boolean Sintonizador;

    public String getBaterias() {
        return baterias;
    }

    public void setBaterias(String baterias) {
        this.baterias = baterias;
    }

    public Float getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Float frequencia) {
        this.frequencia = frequencia;
    }

    public Boolean getTelaTouch() {
        return TelaTouch;
    }

    public void setTelaTouch(Boolean TelaTouch) {
        this.TelaTouch = TelaTouch;
    }

    public Boolean getReprodutor() {
        return Reprodutor;
    }

    public void setReprodutor(Boolean Reprodutor) {
        this.Reprodutor = Reprodutor;
    }

    public Boolean getSintonizador() {
        return Sintonizador;
    }

    public void setSintonizador(Boolean Sintonizador) {
        this.Sintonizador = Sintonizador;
    }

    public AparelhosCelulares(String baterias, Float frequencia, Boolean TelaTouch, Boolean Reprodutor, Boolean Sintonizador) {
        this.baterias = baterias;
        this.frequencia = frequencia;
        this.TelaTouch = TelaTouch;
        this.Reprodutor = Reprodutor;
        this.Sintonizador = Sintonizador;
    }
    
}
