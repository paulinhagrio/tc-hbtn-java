package postagem_blog;

public class Autor implements Comparable<Autor>{
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }

    @Override
    public int compareTo(Autor o) {
        return this.toString().compareTo(o.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Autor autor = (Autor) o;

        if (nome != null ? !nome.equals(autor.nome) : autor.nome != null) return false;
        return sobrenome != null ? sobrenome.equals(autor.sobrenome) : autor.sobrenome == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (sobrenome != null ? sobrenome.hashCode() : 0);
        return result;
    }
}
