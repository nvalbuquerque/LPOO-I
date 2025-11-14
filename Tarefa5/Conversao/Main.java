import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Menu de conversão: \n");
	    System.out.println("1 - Conversão de Celsius para Farenheit");
	    System.out.println("2 - Conversão de Celsius para Kelvin");
	    System.out.println("3 - Conversão de Farenheit para Celsius");
	    System.out.println("4 - Conversão de Farenheit para Kelvin");
	    System.out.println("5 - Conversão de Kelvin para Celsius");
	    System.out.println("6 - Conversão de Kelvin para Farenheit");
	    
	    int op = scanner.nextInt();
	    
	    switch(op) {
	        case 1:
	            System.out.println("Digite o valor de Celsius:");
	            double c = scanner.nextInt();
	            System.out.println("A conversão de Celsius para Farenheit foi de: " + Conversao.CelsiusFarnheit(c));
	            break;
	        case 2:
	            System.out.println("Digite o valor de Celsius:");
	            double k = scanner.nextInt();
	            System.out.println("A conversão de Celsius para Kelvin foi de: " + Conversao.CelsiusKelvin(k));
	            break;
	        case 3:
	            System.out.println("Digite o valor de Farenheit:");
	            double f = scanner.nextInt();
	            System.out.println("A conversão de Farenheit para Celsius foi de: " + Conversao.FarnheitCelsius(f));
	            break;
	        case 4:
	            System.out.println("Digite o valor de Farenheit:");
	            f = scanner.nextInt();
	            System.out.println("A conversão de Farenheit para Kelvin foi de: " + Conversao.FarnheitKelvin(f));
	            break;
	        case 5:
	            System.out.println("Digite o valor de Kelvin:");
	            k = scanner.nextInt();
	            System.out.println("A conversão de Kelvin para Celsius foi de: " + Conversao.KelvinCelsius(k));
	            break;
	        case 6:
	            System.out.println("Digite o valor de Kelvin:");
	            k = scanner.nextInt();
	            System.out.println("A conversão de Kelvin para Farenheit foi de: " + Conversao.KelvinFarnheit(k));
	            break;
	    }
	}
}
