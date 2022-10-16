/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meiosdetransporte;


public class Aviao extends Transporte {
    public String prefixo;
    public int numTurbinas;

    public Aviao(String prefixo, int numTurbinas, String modelo, int numLugares, int comprimento, int ano, String cor) {
        super(modelo, numLugares, comprimento, ano, cor);
        this.prefixo = prefixo;
        this.numTurbinas = numTurbinas;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getNumTurbinas() {
        return numTurbinas;
    }

    public void setNumTurbinas(int numTurbinas) {
        this.numTurbinas = numTurbinas;
    }
    
    
    
}
