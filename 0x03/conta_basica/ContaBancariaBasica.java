import exceptions.*;

public class ContaBancariaBasica {
    String numeracao;
    double saldo = 0;
    double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void depositar(double valor)throws OperacaoInvalidaException {
        if (valor <= 0){
            throw new OperacaoInvalidaException ("Valor para deposito deve ser maior que 0");
        }
        saldo += valor;

    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }
        if (getSaldo() < valor){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }

        saldo -= valor;
    }

        public double calcularTarifaMensal(){
            double tarifaMensal = 0;
            double valorMaxTarifa = 10.0;
            double valorPorcentagemTarifa = (saldo * 0.1);


            if (valorPorcentagemTarifa > valorMaxTarifa) {
                tarifaMensal = valorMaxTarifa;
            }else{
                tarifaMensal = valorPorcentagemTarifa;}

            return tarifaMensal;
        }

        public double calcularJurosMensal() {
            double taxaMensal = 0;

            if (saldo <= 0) {
                taxaMensal = 0;
            } else {
                taxaMensal = getSaldo() * ((getTaxaJurosAnual() / 12) / 100);
            }

            return taxaMensal;
        }

        public void aplicarAtualizacaoMensal(){
            double tarifa = calcularTarifaMensal();
            double juros = calcularJurosMensal();

            this.saldo -= tarifa;
            this.saldo += juros;


        }
}


