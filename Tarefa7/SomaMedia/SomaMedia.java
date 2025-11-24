import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int quantidade = 0;
        int contador = 1;

        System.out.println("Informe os números. Para sair digite 'S'.");

        while (true) {
            System.out.print("Numero " + contador + " = ");
            String entrada = scanner.next();

            if (entrada.equalsIgnoreCase("S")) {
                break;
            }

            try {
                double numero = Double.parseDouble(entrada);
                soma += numero;
                quantidade++;
                contador++;
            } catch (NumberFormatException e) {
                System.out.println("Erro de entrada.");
                System.out.println(entrada + " não é um numérico válido. Tente novamente ou digite S para sair.");
            }
        }

        System.out.println("A soma dos números digitados é = " + soma);
        if (quantidade > 0) {
            System.out.println("A média dos números digitados é = " + (soma / quantidade));
        } else {
            System.out.println("Nenhum número foi digitado.");
        }
        scanner.close();
    }
}