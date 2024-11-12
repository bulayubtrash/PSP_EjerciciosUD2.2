package ejercicio0;

public class HiloB extends Thread {
	private Contador contador;
	
	public HiloB(String n, Contador c) {
		setName(n);
		
		contador =c;
		
	}
	
	public  void run()  {
		for (int i = 0; i < 300; i++) {
			
			contador.decrementa();
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName()+" contador vale "+contador .getValor());
			

			
		}
	}

}
