/* Implemente um programa que receba da linha de comando 3 argumentos. 
O primeiro e o segundo argumento são números reais e o terceiro argumento é a operação.*/

import java.util.Scanner;

public class Calculadora
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Digite um número real: ");
	    double numero1 = scanner.nextDouble();
	    
	    System.out.println("Digite outro número real: ");
	    double numero2 = scanner.nextDouble();
	    
	    scanner.nextLine();
	    
	    System.out.println("Digite o operador, dentre as seguintes opções: +, -, / e x");
	    String operador = scanner.nextLine();
	    
	    double resultado = 0;
	    boolean erro = false;
	    
	    switch (operador) {
	        case "+":
	            resultado = numero1 + numero2;
	            break;
	            
	       case "-":
	           resultado = numero1 - numero2;
	           break;
	           
	       case "/":
	           if (numero2 == 0) {
	               System.out.println("Erro: divisão por zero.");
	               erro = true;
	           } else {
	               resultado = numero1 / numero2;
	               break;  
	           }
	           
	       case "x":
	           resultado = numero1 * numero2;
	           break;
	       
	       default:
	           System.out.println("Operador inválido. As opções são as seguintes: +, -, / e x");
	           erro = true;
	           break;
	    }
	    if (erro = false) {
	        System.out.println(resultado);
	    }
	    }
	}
