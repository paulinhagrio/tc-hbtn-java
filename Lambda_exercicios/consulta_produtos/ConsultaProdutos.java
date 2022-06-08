package consulta_produtos;

import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> produtos, CriterioFiltro criterioFiltro){
        List<Produto> produtosFiltrados = new ArrayList<>();
        produtos.forEach (teste ->{
            if (criterioFiltro.testar(teste)){
                produtosFiltrados.add(teste);
            }
            });
        return produtosFiltrados;

    }
}
