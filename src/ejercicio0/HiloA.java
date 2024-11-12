package ejercicio0;

public class HiloA extends Thread {
	private Contador contador;

	public HiloA(String n, Contador c) {
		setName(n);
		contador = c;

	}

	public synchronized void run() {
		for (int j = 0; j < 300; j++) {

			contador.incrementa();

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName() + " contador vale " + contador.getValor());
			
		}
	}

}
