package meiosdetransporte;

public class Transporte {
    public String modelo;
    public int numLugares;
    public int comprimento;
    public int ano;
    public String cor;

    public Transporte(String modelo, int numLugares, int comprimento, int ano, String cor) {
        this.modelo = modelo;
        this.numLugares = numLugares;
        this.comprimento = comprimento;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumLugares() {
        return numLugares;
    }

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    
    
   
}
