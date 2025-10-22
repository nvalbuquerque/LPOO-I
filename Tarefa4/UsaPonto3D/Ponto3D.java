public class Ponto3D {
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
