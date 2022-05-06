
public class ContaBancariaControlada extends ContaBancariaBasica{

    double saldoMinimo;
    double valorPenalidade;

    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;

    }

    @Override
    public void aplicarAtualizacaoMensal(){
        super.aplicarAtualizacaoMensal();
        if (getSaldo() < saldoMinimo || getSaldo() == 0){
                this.saldo -= valorPenalidade;
        }
    }
}
