import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args) {
	  
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Digite um número inteiro positivo:");
	    int num = scanner.nextInt();
	    
	    if (num < 0) {
	        System.out.println("Por favor, digite um número positivo.");
            return;
        }
	    
	    int a = 0;
	    int b = 1;

        System.out.println("Sequência de Fibonacci até passar de " + num + ": ");

	    while (a <= num) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        System.out.println(a);
	    System.out.printf("O número %d da sequência de Fibonacci é maior que o número inserido %d.", a, num);
	}
}

