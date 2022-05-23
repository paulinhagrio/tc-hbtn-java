

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public Agencia buscarAgencia(String nomeAgencia){
        for (int j=0; j<agencias.size(); j++){
            if (agencias.get(j).getNome().equals(nomeAgencia)){
                return agencias.get(j);
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String AgenciaNome){

            if (buscarAgencia(AgenciaNome) != null){
                return false;
            }else{
                Agencia novaAgencia = new Agencia(AgenciaNome);
                agencias.add(novaAgencia);
            }
        return true;
    }

    public boolean adicionarCliente(String nomeAg, String nomeCliente, double transacaoInicial ){

            for (Agencia cliente : agencias) {
            if (buscarAgencia(nomeAg) == null && (cliente.buscarCliente(nomeAg) != null)){
                return false;
            }
            buscarAgencia(nomeAg).novoCliente(nomeCliente,transacaoInicial);
            buscarAgencia(nomeAg).adicionarTransacaoCliente(nomeCliente,transacaoInicial);
            }

        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double transacoes) {

            for (Agencia cliente : agencias) {

                    if ((buscarAgencia(nomeAgencia)) == null && (cliente.buscarCliente(nomeCliente)) == null) {
                        return false;
                    }
                    buscarAgencia(nomeAgencia).adicionarTransacaoCliente(nomeCliente, transacoes);

            }
        return true;
    }

    public boolean listarClientes(String nomeAg, boolean imprimeTransacoes){
          Agencia minhaAgencia = buscarAgencia(nomeAg);

          if(minhaAgencia == null){
                return false;

            }
          for (int i=0; i<minhaAgencia.getClientes().size(); i++){
              System.out.println("Cliente: " + minhaAgencia.getClientes().get(i).getNome() +" ["+ (i + 1) +"]");
              if (imprimeTransacoes == true){
                  for ( int j=0; j<minhaAgencia.getClientes().get(i).getTransacoes().size(); j++)
                  System.out.println("  [" +(j + 1)+"] valor " + minhaAgencia.getClientes().get(i).getTransacoes().get(j));
              }
          }
        return true;
    }
}
