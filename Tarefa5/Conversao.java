////// RASCUNHO

public class Conversao {
    double f = 0;
    double c = 0;
    double k = 0
    
    public static CelsiusFarnheit (double f, double c) {
        f = 9 * (c/5) + 32;
    }
    
    public static CelsiusKelvin (double k, double c) {
        k = c + 273;
    }
}


import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Menu de conversão: \n");
	    System.out.println("1 - Conversão de Celsius para Farenheit");
	    System.out.println("2 - Conversão de Celsius para Kelvin");
	    System.out.println("3 - Conversão de Farenheit para Celsius");
	    System.out.println("4 - Conversão de Farenheit para Kelvin");
	    System.out.println("5 - Conversão de Kelvin para Celsiu");
	    System.out.println("6 - Conversão de Kelvin para Farenheit");
	    
	    
	    
		System.out.println("Hello World");
	}
}
