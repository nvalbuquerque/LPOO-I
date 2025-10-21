import java.util.Scanner;
import java.lang.Math;

public class DesvioPadrao
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é o tamanho da amostra?");
		int tamAmostra = scanner.nextInt();
		
		double[] amostra = new double[tamAmostra];
		
		for(int i = 0; i < tamAmostra; i++) {
		    System.out.println("Insira o valor do elemento " + (i+1) + ":");
		    amostra[i] = scanner.nextFloat();
		}
		
		System.out.println("\nElementos da amostra:");
        for(int i = 0; i < tamAmostra; i++) {
            System.out.println(amostra[i]);
        }
        
        double soma = 0;
        for (int i = 0; i < amostra.length; i++) {
            soma += amostra[i];
        }
        
        double media = 0;
        media = soma / tamAmostra;
        
        double quadrados = 0;
        double somaQuadrados = 0;
        
        for (int i = 0; i < tamAmostra; i++) {
            quadrados = Math.pow((amostra[i] - media),2);
            somaQuadrados += quadrados;
        }
        
        double variancia = 0;
        variancia = somaQuadrados / tamAmostra;
        
        double desvioPadrao = 0;
        desvioPadrao = Math.sqrt(variancia);
        System.out.println("\nCálculo do desvio padrão:");
        System.out.print(desvioPadrao);   
    }
}
