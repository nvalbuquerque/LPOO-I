public class Main
{
	public static void main(String[] args) {
		System.out.println("Informações bicicletas:");
		Bicicleta b1 = new Bicicleta("b1");
		b1.getMarcha();
		b1.getNumMaxMarcha();
		b1.setMarcha(10);
		b1.pedalar(2,2);
		b1.frear(1);
		b1.imprimeEstado();
		
		Bicicleta b2 = new Bicicleta("b2", 15);
		b2.getMarcha();
		b2.getNumMaxMarcha();
		b2.setMarcha(20);
		b2.setMarcha(11);
		b2.pedalar(6,3);
		b2.frear(0.5);
		b2.imprimeEstado();
	}
}
