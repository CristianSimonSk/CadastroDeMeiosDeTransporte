
package meiosdetransporte;

import java.util.ArrayList;

public class MeiosDeTransporte {
    private ArrayList<Carro> carros;
    private ArrayList<Aviao> avioes;
    private ArrayList<Lancha> lanchas;

    public MeiosDeTransporte() {
        carros = new ArrayList<Carro>();
        avioes = new ArrayList<Aviao>();
        lanchas = new ArrayList<Lancha>();
    }

    public ArrayList<Carro> getCarro() {
        return carros;
    }

    public void setCarro(ArrayList<Carro> carro) {
        this.carros = carro;
    }

    public ArrayList<Aviao> getAviao() {
        return avioes;
    }

    public void setAviao(ArrayList<Aviao> aviao) {
        this.avioes = aviao;
    }

    public ArrayList<Lancha> getLancha() {
        return lanchas;
    }

    public void setLancha(ArrayList<Lancha> lancha) {
        this.lanchas = lancha;
    }  
    
    
    public void newCarro(Carro novoCarro) {
        carros.add(novoCarro);
    }

    public void newAviao(Aviao novoAviao) {
        avioes.add(novoAviao);
    }

    public void newLancha(Lancha novaLancha) {
        lanchas.add(novaLancha);
    }  
}
