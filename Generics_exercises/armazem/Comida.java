
import java.util.*;
public class Comida {
    private String nome;
    private int calorias;
    private Double preco;

    public Comida(String nome, int calorias, Double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }



    @Override
    public String toString() {
        return String.format(Locale.GERMANY,"[%s] %f R$ %f", nome, calorias, preco);
    }

//    @Override
//    public String toString() {
//        return "[" + nome +"] " + calorias + " R$ " + preco;
//    }
}
