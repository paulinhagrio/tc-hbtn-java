


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> map;

    public ListaTelefonica() {
        this.map = new HashMap<>();
    }


    public void adicionarTelefone(String nome, Telefone tel) {

        HashSet<Telefone> hashSet = new HashSet<>();

        boolean encontrouTelefone = false;

        for (Map.Entry<String, HashSet<Telefone>> entry : map.entrySet()) {
            String key = entry.getKey();
            HashSet<Telefone> value = entry.getValue();

            if (value.contains(tel)) {
                encontrouTelefone = true;

            if (key.equals(nome)) {
                System.out.println("Telefone jah existente para essa pessoa");
            } else {
                System.out.println("Telefone jah pertence a outra pessoa");
                }
            }
        }
        if (!encontrouTelefone) {
            if (map.containsKey(nome)) {
                map.get(nome).add(tel);
            } else {
                hashSet.add(tel);
                map.put(nome, hashSet);
            }
        }
    }

    public HashSet<Telefone> buscar(String nome){
        return  map.get(nome);
    }
}



