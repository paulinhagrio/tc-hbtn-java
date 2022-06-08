package preco_minimo;

public class Produto {
    private int codigo;
    private String nome;
    private CategoriaProduto categoria;
    private double preco;

    public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return String.format("[%d] " + "%s " + "%s " + "R$ %.2f", getCodigo(), getNome(), getCategoria(), getPreco());
        //[<codigo>] <nome> <categoria> R$ <preco>, preço com apenas 2 casas decimais.
    }
}
