public class UsaBicicleta {
    public static void main(String[] args) {
        try {
            System.out.println("Tentando criar bicicleta válida...");
            Bicicleta b1 = new Bicicleta(80, 30, 18);
            b1.printStates();

            System.out.println("\nTentando definir velocidade inválida...");
            b1.setVelocidade(120); 
        } catch (BicicletaException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        try {
            System.out.println("\nTentando criar bicicleta com marcha inválida...");
            Bicicleta b2 = new Bicicleta(50, 10, 30);
        } catch (BicicletaException e) {
            System.out.println("Erro capturado no construtor: " + e.getMessage());
        }
    }
}