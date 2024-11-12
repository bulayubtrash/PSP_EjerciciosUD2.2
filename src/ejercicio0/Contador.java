package ejercicio0;

public class Contador {
	private int c = 0;

	Contador(int c) {
		this.c = c;
	}

	public synchronized void incrementa() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c = c + 1;
		
	}

	public synchronized void decrementa() {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c = c - 1;
	}
	
	public int getValor() {
		return c;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

}
