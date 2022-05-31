
import java.util.*;

public class Eletronico {
    private String descricao;
    private Double valor;

    public Eletronico(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }


    @Override
    public String toString() {
        return String.format(Locale.GERMANY, "[%s] R$ %f", this.getDescricao(), this.getValor());

//    @Override
//    public String toString() {
//        return "[" + descricao +"] R$ " + valor;
//    }
    }
}


