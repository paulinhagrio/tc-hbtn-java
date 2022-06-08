package plano_mordor;



import plano_mordor.humor.*;
//import plano_mordor.comida.*;


import java.util.List;

public class Personagem {
    private int pontosDeFelicidade;

    public Humor obterHumorAtual() {
        Humor humor = null;

        if (pontosDeFelicidade < -5) {
            humor = new Irritado();
        } else if(pontosDeFelicidade >=-5 && pontosDeFelicidade<=0){
            humor = new Triste();
        }else if (pontosDeFelicidade >= 1 && pontosDeFelicidade <= 15){
            humor = new Feliz();
        } else if (pontosDeFelicidade > 15){
            humor = new MuitoFeliz();
        }

        return humor;
    }

    public void comer(comida.Comida[] comidas){
        for (comida.Comida comida : comidas ) {
              this.pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    public String toString(){
        return this.pontosDeFelicidade +" - "+ obterHumorAtual().getClass().getSimpleName();
    }
}
