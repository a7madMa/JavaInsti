package ejemplo13CuentaBancaria;

public class CuentaBancaria {

	private double saldo;

	CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}

	public void depostiar(int cantidad) {

		saldo += cantidad;
	}

	public void depositar(double cantidad, double comision) {
		
		saldo = saldo + cantidad - comision * cantidad / 100;

	}

	public boolean retirar(int cantidad) {

		if (cantidad <= saldo) {
			saldo -= cantidad;
			return true;
		} else {
			
			return false;

		}

	}
	 
	public boolean retirar(double cantidad, double comision) {
		
		double cantidadReal = cantidad + comision * cantidad / 100;
		if(cantidadReal <= saldo) {
			saldo = saldo - cantidadReal;
		}
		

		return false;
	}

	public double obtenerSaldo() {

		return saldo;
	}

}
