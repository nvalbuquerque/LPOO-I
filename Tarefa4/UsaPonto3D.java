import java.util.Scanner;

class Ponto3D {
	public int x;
	public int y;
	public int z;
	public String cor;
	public String intensidade;

	public Ponto3D(int x, int y, int z, String cor, String intensidade) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.cor = cor;
		this.intensidade = intensidade;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public String getCor() {
		return cor;
	}

	public String getIntensidade() {
		return intensidade;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}

	public double calculaDistancia(Ponto3D p) {
		double distancia = 0;

		double opX = Math.pow((this.x - p.x),2);
		double opY = Math.pow((this.y - p.y),2);
		double opZ = Math.pow((this.z - p.z),2);

		distancia = Math.sqrt(opX + opY + opZ);

		return distancia;
	}
}

public class UsaPonto3D {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira os dados do ponto 3D.");

		System.out.println("Insira o valor de x:");
		int x = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Insira o valor de y:");
		int y = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Insira o valor de z:");
		int z = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Insira a cor:");
		String cor = scanner.nextLine();

		System.out.println("Insira a intensidade:");
		String intensidade = scanner.nextLine();

		Ponto3D ponto = new Ponto3D(x, y, z, cor, intensidade);

		System.out.println("Insira os dados do objeto.");

		System.out.println("Insira o valor de x:");
		int xObj = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Insira o valor de y:");
		int yObj = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Insira o valor de z:");
		int zObj = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Insira a cor:");
		String corObj = scanner.nextLine();

		System.out.println("Insira a intensidade:");
		String intensidadeObj = scanner.nextLine();

		Ponto3D pontoObj = new Ponto3D(xObj, yObj, zObj, corObj, intensidadeObj);

		double distancia = ponto.calculaDistancia(pontoObj);

		System.out.println("Dados do ponto inserido:");
		System.out.printf("Ponto3D(%d, %d, %d) - Cor: %s, Intensidade: %s", ponto.x, ponto.y, ponto.z, ponto.cor, ponto.intensidade);
		System.out.println("\nDados do objeto inserido:");
		System.out.printf("Ponto3D(%d, %d, %d) - Cor: %s, Intensidade: %s", pontoObj.x, pontoObj.y, pontoObj.z, pontoObj.cor, pontoObj.intensidade);
		System.out.printf("\nDistância entre os pontos: %.2f\n", distancia);
		
		System.out.println("Modificando o ponto com os sets:");
        ponto.setX(10);
        ponto.setY(20);
        ponto.setZ(30);
        ponto.setCor("Verde");
        ponto.setIntensidade("Baixa");
        
        System.out.println("Ponto modificado:");
        System.out.printf("Ponto3D(%d, %d, %d) - Cor: %s, Intensidade: %s", ponto.x, ponto.y, ponto.z, ponto.cor, ponto.intensidade);

        double distanciaModificada = ponto.calculaDistancia(pontoObj);
        System.out.printf("\nNova distância entre os pontos: %.2f\n\n", distanciaModificada);
		
	}
}

