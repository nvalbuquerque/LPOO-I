public class Retangulo {
    private double base;
    private double altura;

    public void setDimensoes(double base, double altura) {
        if (base < 0 || altura < 0) {
            throw new IllegalArgumentException("Base e altura não podem ser negativas.");
        }
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}