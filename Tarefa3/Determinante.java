import java.util.Scanner;

public class Determinante
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];
		char[] elementos = {'a','b','c','d','e','f','g','h','i'};
		
		System.out.println("Construindo uma matriz 3x3...\n");
		System.out.println("a b c \nd e f \ng h i\n");
		
		int index = 0;
		for (int linha = 0; linha < 3; linha++) {
		    for (int coluna = 0; coluna < 3; coluna++) {
		       System.out.println("Insira o elemento " + elementos[index] + ":");
		       matriz[linha][coluna] = scanner.nextInt();
		       index++;
		    }
		    
		}
		
		System.out.println("\nMatriz inserida:");
		for(int linha = 0; linha < 3; linha++) {
		    for(int coluna = 0; coluna < 3; coluna++) {
		        System.out.print(matriz[linha][coluna] + " ");
		    }
		    System.out.println();
		}
		
	    System.out.println("\nCalculando a determinante da matriz...");
	    float op1 = matriz[0][0]*matriz[1][1]*matriz[2][2]; 
	    float op2 = matriz[0][1]*matriz[1][2]*matriz[2][0];
      float op3 = matriz[0][2]*matriz[1][0]*matriz[2][1];
      float op4 = matriz[0][2]*matriz[1][1]*matriz[2][0];
      float op5 = matriz[0][0]*matriz[1][2]*matriz[2][1];
      float op6 = matriz[0][1]*matriz[1][0]*matriz[2][2];
        
        float determinante = (op1 + op2 + op3) - (op4 + op5 + op6);
        System.out.println("O determinante é: " + determinante);
	}
}
