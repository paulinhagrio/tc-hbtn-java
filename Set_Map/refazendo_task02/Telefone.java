package refazendo_task02;

public class Telefone {

    private String codigoArea;
    private String numero;


    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

//    public String getCodigoArea() {
//        return codigoArea;
//    }
//
//    public void setCodigoArea(String codigoArea) {
//        this.codigoArea = codigoArea;
//    }
//
//    public String getNumero() {
//        return numero;
//    }
//
//    public void setNumero(String numero) {
//        this.numero = numero;
//    }


    @Override
    public String toString() {
        return "(" + this.codigoArea +") " + this.numero;
    }

//    public boolean equals(Object obj) {
//        Telefone outro = (Telefone) obj;
//        return this.numero.equals(outro.numero);
//    }
//
//    @Override
//    public int hashCode() {
//        return this.numero.hashCode();
//    }

}
