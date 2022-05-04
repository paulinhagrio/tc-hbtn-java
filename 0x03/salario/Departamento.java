

public class Departamento {

    double valorMeta;
    double valorAtingidoMeta;

    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public boolean alcancouMeta(){
        boolean resultado = false;

        if (valorAtingidoMeta >= valorMeta){
            resultado = true;
        }
        return resultado;
    }
}
