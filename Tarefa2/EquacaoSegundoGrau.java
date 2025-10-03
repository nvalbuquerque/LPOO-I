import java.util.Scanner;

public class EquacaoSegundoGrau
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Digite o valor de a:");
	    int a = scanner.nextInt();
	    
	    System.out.println("Digite o valor de b:");
	    int b = scanner.nextInt();
	    
	    System.out.println("Digite o valor de c:");
	    int c = scanner.nextInt();
	    
	    System.out.printf("A segunda coordenada é: (%d, %d, %d)\n", a, b, c);
	    
	    double x1 = (-b + Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
	    
	    double x2 = (-b - Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
	    
	    System.out.printf("O resultado de x1 e x2 é: %.2f, %.2f\n", x1, x2);
	}
}
