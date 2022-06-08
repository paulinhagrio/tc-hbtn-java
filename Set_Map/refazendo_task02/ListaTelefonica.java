package refazendo_task02;

import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {
    private HashMap<String, ArrayList<Telefone>> listaTelefones;

    public ListaTelefonica() {
        this.listaTelefones = new HashMap<>();
    }


    public void adicionarTelefone(String nome, Telefone tel){

        ArrayList<Telefone> list = new ArrayList<>();

        if(listaTelefones.containsKey(nome)){
            listaTelefones.get(nome).add(tel);
        }else {
            list.add(tel);
            listaTelefones.put(nome, list);
        }
    }

    public ArrayList<Telefone> buscar(String nome){
       return listaTelefones.get(nome);
    }
}
