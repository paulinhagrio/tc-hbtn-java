package armazem_especifico;

import java.util.Map;
import java.util.TreeMap;
public abstract class  Armazem <T> implements Armazenavel<T> {

    private Map<String, T> itens = new TreeMap<>();

//    public Armazem() {
//        this.itens = new TreeMap<>();
//    }



    @Override
    public void adicionarAoInventario(String nome, T valor) {

        itens.put(nome, valor);
    }

    @Override
    public T obterDoInventario(String nome)
    {
        return itens.get(nome);
    }
}
