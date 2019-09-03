package lista2;

public class AparelhoConvencional extends DispositivosTelefonia {
    private int ComprimentoCabo;
    private Boolean Fixaçaoparede;

    public int getComprimentoCabo() {
        return ComprimentoCabo;
    }

    public void setComprimentoCabo(int ComprimentoCabo) {
        this.ComprimentoCabo = ComprimentoCabo;
    }

    public Boolean getFixaçaoparede() {
        return Fixaçaoparede;
    }

    public void setFixaçaoparede(Boolean Fixaçaoparede) {
        this.Fixaçaoparede = Fixaçaoparede;
    }

    public AparelhoConvencional(int ComprimentoCabo, Boolean Fixaçaoparede, String cor, String formato) {
        super(cor, formato);
        this.ComprimentoCabo = ComprimentoCabo;
        this.Fixaçaoparede = Fixaçaoparede;
    }
    

    public AparelhoConvencional(String cor, String formato) {
        super(cor, formato);
    }
}
