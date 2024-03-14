package ejemplo13CuentaBancaria;

public class Main {

	public static void main(String[] args) {

		CuentaBancaria cuenta = new CuentaBancaria(1000);

		System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
		cuenta.depostiar(200);

		boolean resultado = cuenta.retirar(100);
		if (!resultado) {

			System.out.println("No se ha podido hacer la retirada");

		}
		System.out.println("Saldo actual: " + cuenta.obtenerSaldo());

		resultado = cuenta.retirar(5000);
		if (!resultado) {

			System.out.println("No se ha podido hacer la retirada");

		}
		System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
		
		cuenta.depositar(100, 10);
		
		System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
		
		cuenta.retirar(100, 5);
		
		System.out.println("Saldo actual: " + cuenta.obtenerSaldo());

	}

}
