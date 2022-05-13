package provedores;

public class JadLog implements ProvedorFrete {
    public Frete calcularFrete(double peso, double valor){

        double valorFrete;

        if (peso > 2000){
            valorFrete = valor * 0.07;
        }else {
            valorFrete = valor * 0.045;
        }
        Frete frete = new Frete(obterTipoProvedorFrete(), valorFrete);
        return frete;
    }

    public TipoProvedorFrete obterTipoProvedorFrete(){
        return TipoProvedorFrete.JADLOG;
    }
}
