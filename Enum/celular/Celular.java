

import java.util.ArrayList;
import java.util.List;

public class Celular {
    private ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<Contato>();
    }

    public int obterPosicaoContato(String nome){

        for (int j=0; j< contatos.size(); j++){
            if (contatos.get(j).getNome().equals(nome)){
                return j;
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato){
        if (obterPosicaoContato(contato.getNome()) != -1){
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
        contatos.add(contato);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato){
        int posicao = obterPosicaoContato(contatoAntigo.getNome());

        if (posicao == -1){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        }else if(obterPosicaoContato(novoContato.getNome()) != -1 && novoContato.getNome() != contatoAntigo.getNome()){
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        }else {
            contatos.set(posicao, novoContato);
        }
    }

    public void removerContato(Contato contato){
        if (obterPosicaoContato(contato.getNome()) == -1){
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }else {
            contatos.remove(obterPosicaoContato(contato.getNome()));
        }
    }

        public void listarContatos(){
            for (Contato contato : contatos) {
                System.out.println(contato.getNome() + " -> " + contato.getNumeroTelefone() + " ("+contato.getTipo() +")");
            }
        }
}
