package ejercicio2;

public class Banco {
	public static void main(String[] args) {
		Cuenta c1= new Cuenta(1000,0);
		
		Cliente cl1= new Cliente(c1,"cliente1", 55);
		Cliente cl2=new Cliente(c1,"cliente2",25);
		
		cl1.start();
		cl2.start();
		
		

	}
}
