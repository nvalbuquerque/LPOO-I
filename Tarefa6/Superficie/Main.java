import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira o valor do raio da circunferência:");
		double raio = scanner.nextDouble();

		Circunferencia c1 = new Circunferencia(raio);
		
		System.out.println("Insira o valor do lado do quadrado:");
		double lado = scanner.nextDouble();
		
		Quadrado q1 = new Quadrado(lado);
		
		double areaC1 = c1.calculaArea();
		double areaQ1 = q1.calculaArea();

		System.out.println("Informações da circunferência:");
		System.out.printf("Raio: %.2f", c1.raio);
		System.out.printf("\nÁrea: %.2f", areaC1);
		System.out.println("\nInformações do quadrado:");
		System.out.printf("Lado: %.2f", q1.lado);
		System.out.printf("\nÁrea: %.2f", areaQ1);
	}
}
