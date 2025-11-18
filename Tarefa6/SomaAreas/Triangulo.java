public class Triangulo implements Superficie {
	public double base;
	public double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calculaArea() {
	    double area = (base * altura) / 2;
	    return area;
	}
	
}
