package consulta_produtos;

public interface CriterioFiltro {
    abstract boolean testar(Produto produto);
}
