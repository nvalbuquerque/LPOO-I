import java.util.Scanner;

class Circunferencia {
	public double raio;

	public Circunferencia(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea() {
	    double pi = Math.PI;
	    double area = 0;
        area = pi * Math.pow(this.raio, 2);  
	    return area;
	}
}

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

