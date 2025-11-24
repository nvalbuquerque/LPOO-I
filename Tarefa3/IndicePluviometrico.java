import java.util.Scanner;

public class IndicePluviometrico {
    public double indice;
	public String diaSemana;
    
    public IndicePluviometrico(double indice, String diaSemana) {
        this.indice = indice;
        this.diaSemana = diaSemana;
    }
    
    public double getIndice() {
        return this.indice;
    }
    
    public String getDiaSemana() {
        return this.diaSemana;
    }
    
    public static double soma(IndicePluviometrico[] coletas) {
        double soma = 0;
        for (IndicePluviometrico ip : coletas) {
            soma += ip.getIndice();
        }
        return soma;
    }
    
    public static double media(IndicePluviometrico[] coletas) {
        return soma(coletas) / 7;
    }
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IndicePluviometrico[] coletas = new IndicePluviometrico[7];

		for (int i = 0; i <7; i++) {
		    System.out.println("Digite o dia da semana:");
			String diaSemana = scanner.nextLine();
		    
		    System.out.println("Digite o índice pluviométrico:");
			double indice = scanner.nextDouble();
			scanner.nextLine();
			
			coletas[i] = new IndicePluviometrico(indice, diaSemana);
		}
		
		double maior = coletas[0].getIndice();
        double menor = coletas[0].getIndice();
        String diaMaior = coletas[0].getDiaSemana();
        String diaMenor = coletas[0].getDiaSemana();
		
		for (IndicePluviometrico ip : coletas) {
            double indiceAtual = ip.getIndice();
            String diaAtual = ip.getDiaSemana();
            
            if (indiceAtual > maior) {
                maior = indiceAtual;
                diaMaior = diaAtual;
            }
            if (indiceAtual < menor) {
                menor = indiceAtual;
                diaMenor = diaAtual;
            }
        }
		
        System.out.printf("O índice pluviométrico médio foi de %.2f mm.\n", media(coletas));
        System.out.printf("O índice pluviométrico máximo foi de %.2f mm e o dia de ocorrência foi %s.\n", maior, diaMaior);
        System.out.printf("O índice pluviométrico mínimo foi de %.2f mm e o dia de ocorrência foi %s.\n", menor, diaMenor);

	}
}
