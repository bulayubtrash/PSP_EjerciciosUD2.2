package ejercicio0;

public class Ejecutador {
	public static void main(String[] args) {
		Contador cnt = new Contador(100);
		HiloA a = new HiloA("HiloA", cnt);
		HiloB b = new HiloB("HiloB", cnt);
		a.start();
		b.start();
	}

}
