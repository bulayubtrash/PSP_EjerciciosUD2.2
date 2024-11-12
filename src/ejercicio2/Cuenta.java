package ejercicio2;

public class Cuenta {
	private double saldo;
	private double numero_reintegros;

	public Cuenta() {
		super();
	}

	public Cuenta(double saldo, double numero_reintegros) {
		super();
		this.saldo = saldo;
		this.numero_reintegros = numero_reintegros;
	}

	public double devolverSaldo() {
		return getSaldo();
	}

	public void restarSaldo(double cantidad) {
		setSaldo(getSaldo()-cantidad);
	}
	
	public void comprobar(double cantidad) {
		if(cantidad>getSaldo()) {
			System.out.println("Saldo insuficiente");
		}else {
			System.out.println("Saldo disponible");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getNumero_reintegros() {
		return numero_reintegros;
	}

	public void setNumero_reintegros(double numero_reintegros) {
		this.numero_reintegros = numero_reintegros;
	}

}
