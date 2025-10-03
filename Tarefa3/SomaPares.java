import java.util.Scanner;

public class SomaPares
{
	public static void main(String[] args) {
		int num = 0;
		int somaPares = 0;

		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <=20; i++) {
		    System.out.println("Digite valores inteiros ou reais:");
			
			try {
			    num = scanner.nextInt();
			    
				if (num % 2 == 0) {
				    somaPares += num;
				}
			} catch (Exception e) {
				System.out.println("Por favor, digite um número válido!");
				scanner.next();
				i--;
			}

		}

		System.out.printf("A soma dos números pares inseridos é %d.\n", somaPares);
	}
}
