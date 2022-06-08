package status;

public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;

        if (getSaudeAtual() > 0){
           this.status = "vivo";
        }else {
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public  int tomarDano(int quantidadeDeDano){
       if (saudeAtual - quantidadeDeDano < 0){
           setSaudeAtual(0);
       } else {
           setSaudeAtual(getSaudeAtual() - quantidadeDeDano);
       }
        return  saudeAtual;
    }

    public int receberCura(int quantidadeDeCura){
            if(saudeAtual + quantidadeDeCura > 100) {
                setSaudeAtual(100);
            }else{
                setSaudeAtual(getSaudeAtual() + quantidadeDeCura);
            }
        return saudeAtual;
    }
}
