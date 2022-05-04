

public class Empregado {

    double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularBonus(Departamento departamento){
        double bonus = 0;
        if(departamento.alcancouMeta()){
            bonus = salarioFixo * 0.1;
        }
        return bonus;
    }

    public double calcularSalarioTotal(Departamento departamento){
        return salarioFixo + calcularBonus(departamento);
    }
}
