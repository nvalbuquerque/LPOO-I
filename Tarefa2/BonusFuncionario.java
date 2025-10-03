import java.util.Scanner;

public class BonusFuncionario
{
	public static void main(String[] args) {
	    
	    double bonus = 0; 
	    boolean erro = false;
	    
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Digite o cargo do funcionário:");
	    String cargo = scanner.nextLine();
	    
	    System.out.println("Digite o salário atual do funcionário:");
	    double salario = scanner.nextDouble();
	    
	    switch (cargo) {
	        case "Diretor" :
	            System.out.println("Quantos departamentos são gerenciados por esse diretor?");
	            int qtdeDepartamentos = scanner.nextInt();
	            bonus = (4 * salario) + (3000 * qtdeDepartamentos);
	            break;
	       case "Gerente":
	           System.out.println("Quantas pessoas são gerenciadas por esse gerente?");
	           int qtdeFunGerenciados = scanner.nextInt();
	           bonus = (2 * salario) + (100 * qtdeFunGerenciados);
	           break;
	       case "Analista":
	           bonus = 1 * salario;
	           break;
	       case "Programador":
	           bonus = 0.8 * salario;
	           break;
	       case "Auxiliar de limpeza":
	           bonus = 0.5 * salario;
	           break;
	       default:
	           System.out.println("Esse cargo não existe na empresa.");
	           erro = true;
	    }
	   
	   if (erro == false) {
	       System.out.printf("O bônus do funcionário é de R$ %2.f/n", bonus);
	   }
	}
}
