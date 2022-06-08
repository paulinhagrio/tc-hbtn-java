package contas_especiais;

import contas_especiais.exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    int quantidadeTransacoes;
    double valorPenalidade;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }
    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        double tarifa = 0.10;
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        }
        else if(getSaldo() < valor){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }else{
           this.saldo -= tarifa;
        }
        this.saldo -= valor;
    }
    @Override
    public void depositar(double valor)throws OperacaoInvalidaException {
        double tarifa = 0.10;
        if (valor <= 0){
            throw new OperacaoInvalidaException ("Valor para deposito deve ser maior que 0");
        }else{
            valor -= tarifa;
        }
        saldo += valor;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
