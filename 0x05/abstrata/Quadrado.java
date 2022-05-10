

public class Quadrado extends Retangulo {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws IllegalArgumentException {
        if (getLado() < 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        } else {
            this.lado = lado;
            this.altura = lado;
            this.largura = lado;
        }
    }

    public String toString() {
        return String.format("[Quadrado] %.2f", lado);
    }
}
