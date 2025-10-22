import java.util.Scanner;

public class UsaCircunferencia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira o valor do raio da circunferência:");
		double raio = scanner.nextDouble();

		Circunferencia c1 = new Circunferencia(raio);
		
		double areaC1 = c1.calculaArea();

		System.out.println("Informações da circunferência:");
		System.out.printf("Raio: %.2f", c1.raio);
		System.out.printf("\nÁrea: %.2f", areaC1);
	}
}
