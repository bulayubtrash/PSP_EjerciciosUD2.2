package ejercicio2;

public class Cliente extends Thread {
	private Cuenta cuenta;
	private String nombre;
	private double cantidad;
	private double total;

	public synchronized void run() {
		while (cuenta.getSaldo() >= cantidad) {
			cuenta.restarSaldo(cantidad);
			total = total + cantidad;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getNombre() + " ha retirado " + cantidad + ", lleva un total de " + total);
			System.out.println("");
			System.out.println("Saldo disponible "+cuenta.getSaldo());
		}

		System.out.println("El dinero total retirado es de " + total);
		System.out.println("Saldo final de la cuenta "+cuenta.getSaldo());

	}

	public Cliente(Cuenta cuenta, String nombre, double cantidad) {
		super();
		this.cuenta = cuenta;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
