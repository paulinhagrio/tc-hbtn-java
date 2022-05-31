

public class Eletronico {
    private String descricao;
    private Double valor;

    public Eletronico(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "[" + descricao +"] R$ " + valor;
    }
}
