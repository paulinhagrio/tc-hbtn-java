package banco;

import java.util.ArrayList;

public class Agencia {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente buscarCliente(String nomeCliente){
        for (int j=0; j<clientes.size(); j++){
            if (clientes.get(j).getNome().equals(nomeCliente)){
                return clientes.get(j);
            }
        }
        return null;
    }

    public boolean novoCliente(String nomeCliente, double valorTransacaoInicial){

            if (buscarCliente(nomeCliente) != null){
                return false;
            }
            Cliente novoCliente = new Cliente(nomeCliente, valorTransacaoInicial);

            clientes.add(novoCliente);

        return true;
    }

    public boolean adicionarTransacaoCliente(String nome, double valorTransacao){

                if ((buscarCliente(nome)) == null) {
                    return false;
                } buscarCliente(nome).adicionarTransacao(valorTransacao);

        return true;
    }
}
