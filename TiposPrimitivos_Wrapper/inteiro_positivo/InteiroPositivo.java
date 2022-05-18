

public class InteiroPositivo {
    private int valor;

    public InteiroPositivo(int valor) {
        this.setValor(valor);
    }

    public InteiroPositivo(String valor) {
        this.setValor(Integer.parseInt(valor));
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        } else {
            this.valor = valor;
        }
    }

        public Boolean ehPrimo () {

            if (valor <= 1) {
                return false;
            } else if (valor == 2) {
                return true;
            }

            for (int j = 2; j < valor; j++) {
                if (valor % j == 0)
                    return false;
            }
            return true;
        }
    }
