import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Iniciando o programa...");
		
		System.out.println("Instanciando C_12 sem parametros.");
		C_12 objC1 = new C_12();
		
		System.out.println("Instanciando C_12 com parametros.");
		C_12 objC2 = new C_12("XPTO", 3.141516f);
		
		System.out.println("Chamando operacoes na instancia 1:");
		objC1.operacao1();
		objC1.operacao2();
		
		System.out.println("Chamando operacoes na instancia 2:");
		objC2.operacao1();
		objC2.operacao2();
		
		System.out.println ("Instanciando objeto em referencia para interface.");
		I1 objC3 = new C_12("YSBC", 1.99f);
		
        System.out.println ("Chamando operacoes na referencia para interface:");
        objC3.operacao1();
	}
}