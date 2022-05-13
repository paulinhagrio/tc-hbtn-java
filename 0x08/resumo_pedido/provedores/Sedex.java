package provedores;

public class Sedex implements ProvedorFrete{
    public Frete calcularFrete(double peso, double valor){

        double valorFrete;



        if (peso > 1000){
            valorFrete = valor * 0.1;
        }else {
            valorFrete = valor * 0.05;
        }
        Frete frete = new Frete(obterTipoProvedorFrete(), valorFrete);
        return frete;
    }

    public TipoProvedorFrete obterTipoProvedorFrete(){
        return TipoProvedorFrete.SEDEX;

    }
}
