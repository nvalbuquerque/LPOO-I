public class Circunferencia {
	public double raio;

	public Circunferencia(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea() {
	    double pi = Math.PI;
	    double area = 0;
        area = pi * Math.pow(this.raio, 2);  
	    return area;
	}
}


