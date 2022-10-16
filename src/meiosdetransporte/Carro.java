package meiosdetransporte;


public class Carro extends Transporte{
    public int numPortas;
    public String placa;

    public Carro(int numPortas, String placa, String modelo, int numLugares, int comprimento, int ano, String cor) {
        super(modelo, numLugares, comprimento, ano, cor);
        this.numPortas = numPortas;
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
    
}
