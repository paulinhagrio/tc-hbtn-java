package refazendo_task03;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> map;

    public ListaTelefonica() {
        this.map = new HashMap<>();
    }


    public HashSet<Telefone> adicionarTelefone(String nome, Telefone tel) {

        boolean encontrouTelefone = false;

        for (Map.Entry<String, HashSet<Telefone>> entry : map.entrySet()) {
            String key = entry.getKey();
            HashSet<Telefone> value = entry.getValue();

            if (value.contains(tel)) {
                encontrouTelefone = true;

                if (key.equals(nome)) {
                    throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
                } else {
                    throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
                }
            }
        }

        if (map.containsKey(nome)) {
            map.get(nome).add(tel);
        } else {
            HashSet<Telefone> hashSet = new HashSet<>();
            hashSet.add(tel);
            map.put(nome, hashSet);


        }
        return map.get(nome);  //verificar se esse retorno está correto
    }

    public HashSet<Telefone> buscar(String nome)
    {
        return  map.get(nome);
    }
}



