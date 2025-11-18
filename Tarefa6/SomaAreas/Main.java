import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Superficie[] superficies = new Superficie[3];

		System.out.println("Insira o valor do raio da circunferencia:");
		double raio = scanner.nextDouble();

		superficies[0] = new Circunferencia(raio);
		
		System.out.println("Insira o valor do lado do quadrado:");
		double lado = scanner.nextDouble();
		
		superficies[1] = new Quadrado(lado);
		
		System.out.println("Insira o valor do base do triangulo:");
		double base = scanner.nextDouble();
		
		System.out.println("Insira o valor da altura do triangulo:");
		double altura = scanner.nextDouble();
		
		superficies[2] = new Triangulo(base, altura);
		
		double areaC1 = superficies[0].calculaArea();
		double areaQ1 = superficies[1].calculaArea();
		double areaT1 = superficies[2].calculaArea();
		
		double perimetroQ1 = ((Quadrado)superficies[1]).perimetro();

		System.out.println("Informacoes da circunferencia:");
		System.out.printf("Raio: %.2f", ((Circunferencia)superficies[0]).raio);
		System.out.printf("\nArea: %.2f", areaC1);
		
		System.out.println("\nInformacoes do quadrado:");
		System.out.printf("Lado: %.2f", ((Quadrado)superficies[1]).lado);
		System.out.printf("\nPerimetro: %.2f", perimetroQ1);
		System.out.printf("\nArea: %.2f", areaQ1);
		
		System.out.println("\nInformacoes do triangulo:");
		System.out.printf("Base: %.2f", ((Triangulo)superficies[2]).base);
		System.out.printf("\nAltura: %.2f", ((Triangulo)superficies[2]).altura);
		System.out.printf("\nArea: %.2f", areaT1);
	    
	    double areasExemplo = SomaAreas.somaAreas(superficies);
	    
	    System.out.printf("\nO resultado da soma das areas da circunferencia, do quadrado e do triangulo e de: %.2f", areasExemplo);
	}
}
