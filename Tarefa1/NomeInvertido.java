/* Crie um programa "Nome" que leia um nome completo na linha de comando e imprima-o ao contrário. */

import java.util.Scanner;

public class NomeInvertido
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Digite seu nome completo: ");
	    String nome = scanner.nextLine();
	    
	    String[] nomeSplit = nome.split(" ");
	    
	    for (int i = nomeSplit.length - 1; i >= 0; i--) {
	        System.out.println(nomeSplit[i]);
	    }
	}
}
