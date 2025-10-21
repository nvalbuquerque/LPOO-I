import java.util.Scanner;

public class SomaDiagonal
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Construindo uma matriz...\n");
		System.out.println("Qual é a dimensão da matriz desejada?\n");
		System.out.println("Linha: ");
		int numLinha = scanner.nextInt();
		System.out.println("Coluna: ");
		int numColuna = scanner.nextInt();
		
		
		int[][] matriz = new int[numLinha][numColuna];
		char[] elementos = gerarChar(numLinha*numColuna);
		int index = 0;
		
		for (int i = 0; i < numLinha; i++) {
		    for (int j = 0; j < numColuna; j++) {
		       System.out.println("Insira o elemento " + elementos[index] + ":");
		       matriz[i][j] = scanner.nextInt();
		       index++;
		    }
		}
		
		System.out.println("\nMatriz inserida:");
		for(int i = 0; i < numLinha; i++) {
		    for(int j = 0; j < numColuna; j++) {
		        System.out.print(matriz[i][j] + " ");
		    }
		    System.out.println();
		}
		
		if (numLinha != numColuna) {
		    System.out.println("Não há diagonal principal ou secundária em matrizes não quadráticas.");
		} else {
		    System.out.println("\nSoma da diagonal principal: " + somaDiagPrincipal(matriz));
		    System.out.println("\nSoma da diagonal secundária: " + somaDiagSecundaria(matriz)); 
		}

	}
	
    public static char[] gerarChar(int quantidade) {
        char[] labels = new char[quantidade];
        for (int i = 0; i < quantidade; i++) {
            labels[i] = (char) ('a' + i);
        }
        return labels;
    }
    
    public static float somaDiagPrincipal(int[][] matriz) {
        float soma = 0;
            for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
            }
        return soma;
    }
    
    public static float somaDiagSecundaria(int[][] matriz) {
        float soma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i; 
            soma += matriz[i][j];
        }
        return soma;
    }
}
