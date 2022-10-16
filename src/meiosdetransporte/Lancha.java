package meiosdetransporte;


public class Lancha extends Transporte{
    
    private int numMotores;
    private String marca;

    public Lancha(int numMotores, String modelo, int numLugares, int comprimento, int ano, String cor, String marca) {
        super(modelo, numLugares, comprimento, ano, cor);
        this.numMotores = numMotores;
        this.marca = marca;
    }

    public int getNumMotores() {
        return numMotores;
    }

    public void setNumMotores(int numMotores) {
        this.numMotores = numMotores;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
