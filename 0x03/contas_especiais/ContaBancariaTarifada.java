import exceptions.*;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    int quantidadeTransacoes;
    double valorPenalidade;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }
    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }
        if (getSaldo() < valor){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }

        if (getQuantidadeTransacoes() <= 0){
            valor += valorPenalidade;
        }

        saldo -= valor;
    }
    @Override
    public void depositar(double valor)throws OperacaoInvalidaException {
        if (valor <= 0){
            throw new OperacaoInvalidaException ("Valor para deposito deve ser maior que 0");
        }

        if (getQuantidadeTransacoes() <= 0){
            valor += valorPenalidade;
        }
        saldo += valor;

    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
