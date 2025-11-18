public class Quadrado implements Superficie {
	public double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
	    double area = lado*lado;
	    return area;
	}
		
	public double perimetro() {
	    double perimetro = lado*4;
	    return perimetro;
	}
}

