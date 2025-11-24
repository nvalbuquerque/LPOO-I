public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();

        try {
            ret.setDimensoes(-5, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        try {
            ret.setDimensoes(10, 20);
            System.out.println("Área: " + ret.calcularArea());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}