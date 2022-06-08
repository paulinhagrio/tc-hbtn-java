package pedido_livraria;

// import produtos.*;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;


    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public double calcularTotal(){
        double totalProdutos = 0;
        for (int i=0; i< itens.length; i++){
            totalProdutos += itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade();
        }

        double desconto = totalProdutos * (getPercentualDesconto()/100);
        totalProdutos -= desconto;

        return totalProdutos;
    }




}
