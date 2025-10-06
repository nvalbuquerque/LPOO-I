import java.util.Scanner;

public class Empresa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    String[] nome = new String[10];
	    double[] salario = new double[10];
	    double soma = 0;

		for (int i = 0; i <10; i++) {
		    System.out.println("Digite o nome do funcionário:");
			nome[i] = scanner.nextLine();
		    
		    System.out.println("Digite o salário do funcionário:");
			salario[i] = scanner.nextDouble();
			scanner.nextLine();
			
			soma += salario[i];
			}
		
		double media = soma / 10;
		System.out.printf("A média salarial dos funcionários é de R$ %.2f.\n", media);
		
		System.out.println("Os funcionários com salário acima da média são:");
		
		boolean controle = false;
		
		for (int i = 0; i < 10; i++) {
		    if (salario[i] > media) {
		       System.out.printf("%s - R$ %.2f\n", nome[i], salario[i]);
		       controle = true;
		    }
		    
		if (controle = false) {
		    System.out.println("Nenhum funcinário possui salário acima da média.");
		}
		}
	}
}
