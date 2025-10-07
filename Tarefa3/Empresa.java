import java.util.Scanner;
import java.util.InputMismatchException;

public class Empresa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	    String[] nome = new String[10];
	    double[] salario = new double[10];
	    double soma = 0;

		for (int i = 0; i <10; i++) {
		    String nomeTemp = "";
		    
		    while (nomeTemp.trim().isEmpty()) {
		            System.out.println("Digite o nome do funcionário:");
			        nomeTemp = scanner.nextLine();
			    
			        if (nomeTemp.trim().isEmpty()) {
			        System.out.println("Nome vazio.");
			        }
		    }
		    
		    nome[i] = nomeTemp;
		    
		    boolean salarioValido = false;
		    
		    while(salarioValido = false) {
		        try {
		            System.out.println("Digite o salário do funcionário:");
        			salario[i] = scanner.nextDouble();
        			scanner.nextLine();
        			
        			if (salario[i] > 0) {
        			    salarioValido = true;
        			} else {
        			    System.out.println("Salário inválido.");
        			}
        			soma += salario[i];
		        } catch (InputMismatchException e) {
		            System.out.println("Entrada de dados inválida.");
		        }
		    }
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
