package cookies;

import java.util.ArrayList;

public class Pedido {

    ArrayList<PedidoCookie> cookies;

    public Pedido() {
        this.cookies = new ArrayList<PedidoCookie>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        cookies.add(pedidoCookie);
    }


    public int obterTotalCaixas(){
        int quantidadeTotal = 0;
        for (PedidoCookie pedido: cookies ) {
            quantidadeTotal += pedido.getQuantidadeCaixas();
        }
        return quantidadeTotal;
    }

    public int removerSabor(String sabor){
        int quantidadeTotalCaixasRemovidas = 0;
        for (int i=0; i<cookies.size(); i++) {
            if (cookies.get(i).getSabor().equals(sabor)){
                quantidadeTotalCaixasRemovidas += cookies.get(i).getQuantidadeCaixas();
                cookies.remove(i);
            }
        }
        return quantidadeTotalCaixasRemovidas;
    }
}
