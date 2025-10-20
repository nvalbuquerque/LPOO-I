import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira uma frase: ");
        String frase = scanner.nextLine();
        
        char[] letras = frase.replaceAll("[\\p{Punct}\\s]", "").toLowerCase().toCharArray();
        
        System.out.println("Frase limpa: " + new String(letras));
        
        int inicio = 0;
        int fim = letras.length - 1;
        boolean ehPalindromo = true;
        
        while (inicio < fim) {
            if (letras[inicio] != letras[fim]) {
                System.out.println("A frase não é um palíndromo.");
                ehPalindromo = false;
                break;
            }
            
            inicio++;
            fim--;
        }
        
        if (ehPalindromo) {
            System.out.println("A frase é um palíndromo!");
        }
    }
}
