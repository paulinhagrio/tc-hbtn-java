


import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int codigo;
    private String nome;
    private  String cargo;
    private int idade;
    private double salario;

    private List<String> hobbies = new ArrayList<>();

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
        this.hobbies = hobbies;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return  String.format("[" + codigo + "]" + " %s" + " %s" + " %d" + " R$ %.6f",
                nome,cargo,idade,salario);
    }

}
