

import produtos.Dvd;
import produtos.Livro;

//import resumo_pedido.produtos.Livro;

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

        return totalProdutos;
    }

    public void apresentarResumoPedido(){
        System.out.println("------- RESUMO PEDIDO -------");

        for (int i=0; i<itens.length; i++){
            if (itens[i].getProduto() instanceof Livro){
                System.out.printf("Tipo: Livro  ");
            }else {
                System.out.printf("Tipo: Dvd  ");
            }
            System.out.printf("Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f\n",
                    itens[i].getProduto().getTitulo(),
                    itens[i].getProduto().obterPrecoLiquido(),
                    itens[i].getQuantidade(),
                    itens[i].getProduto().obterPrecoLiquido() * itens[i].getQuantidade());
        }
        System.out.printf("----------------------------\n"
        + "DESCONTO: %.2f\n" + "TOTAL PRODUTOS: %.2f\n----------------------------\n"+
                "TOTAL PEDIDO: %.2f\n----------------------------\n", calcularDesconto(), calcularTotal(), calcularTotalComDesconto());
    }

    public double calcularDesconto(){
        return calcularTotal() * (getPercentualDesconto()/100);
    }

    public double calcularTotalComDesconto(){
        return calcularTotal() - calcularDesconto();
    }
}
