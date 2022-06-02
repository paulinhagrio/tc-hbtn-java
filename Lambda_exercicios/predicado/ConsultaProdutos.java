

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, Predicate<Produto> prod) {
        List<Produto> produtosFiltrados = new ArrayList<>();
        produtos.forEach (teste ->{
            if (prod.test(teste)){
                produtosFiltrados.add(teste);
            }
            });
        return produtosFiltrados;

    }
}
