import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira o valor do raio da circunferencia:");
		double raio = scanner.nextDouble();

		Circunferencia c1 = new Circunferencia(raio);
		
		System.out.println("Insira o valor do lado do quadrado:");
		double lado = scanner.nextDouble();
		
		Quadrado q1 = new Quadrado(lado);
		
		System.out.println("Insira o valor do base do triangulo:");
		double base = scanner.nextDouble();
		
		System.out.println("Insira o valor da altura do triangulo:");
		double altura = scanner.nextDouble();
		
		Triangulo t1 = new Triangulo(base, altura);
		
		double areaC1 = c1.calculaArea();
		double areaQ1 = q1.calculaArea();
		double areaT1 = t1.calculaArea();
		
		double perimetroQ1 = q1.perimetro();

		System.out.println("Informacoes da circunferencia:");
		System.out.printf("Raio: %.2f", c1.raio);
		System.out.printf("\nArea: %.2f", areaC1);
		
		System.out.println("\nInformacoes do quadrado:");
		System.out.printf("Lado: %.2f", q1.lado);
		System.out.printf("\nPerimetro: %.2f", perimetroQ1);
		System.out.printf("\nArea: %.2f", areaQ1);
		
		System.out.println("\nInformacoes do triangulo:");
		System.out.printf("Base: %.2f", t1.base);
		System.out.printf("\nAltura: %.2f", t1.altura);
		System.out.printf("\nArea: %.2f", areaT1);
	    
	    double areasExemplo = somaAreas(areaC1, areaQ1, areaT1);
	    
	    System.out.printf("\nO resultado da soma das areas da circunferencia, do quadrado e do triangulo e de: %.2f", areasExemplo);
	}
	
    public static double somaAreas(double area1, double area2, double area3) {
        double area = area1 + area2 + area3;
        return area;
	}
}
