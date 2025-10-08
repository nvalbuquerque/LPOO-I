import java.util.Scanner;

public class Palindromo
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String frase = "";
		
		System.out.println("Escreve uma frase e verifique se é um palíndromo:");
		frase = scanner.nextLine();
		
		char fraseChar = frase.toCharArray();
		
		int inicio = 0;
		int fim = fraseChar.length() - 1;
		
		System.out.print(fim);
		
		
	}
}
