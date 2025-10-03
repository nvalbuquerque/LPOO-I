import java.util.Scanner;

public class Media
{
	public static void main(String[] args) {
		String op = "";
		int contador = 0;
		int soma = 0;

		Scanner scanner = new Scanner(System.in);

		while (!op.equals("S")) {
		System.out.println("Digite valores inteiros ou reais:");
			op = scanner.next();
			
			if (op.equals("S")) {
				break;
			}
			
			try {
				int num = Integer.parseInt(op);
				soma += num;
				contador++;
			} catch (NumberFormatException e) {
				System.out.println("Por favor, digite um número válido!");
			}

		}

		if (contador > 0) {
		double media = soma / contador;
		System.out.printf("A média dos números inseridos é %.2f.\n", media);
		} else {
			System.out.println("Nenhum número foi informado.");
		}
	}
}
