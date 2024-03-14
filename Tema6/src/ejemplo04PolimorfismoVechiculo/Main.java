package ejemplo04PolimorfismoVechiculo;

public class Main {

	public static void main(String[] args) {

		Vehiculo vehiculo1 = new Vehiculo("1020GTH", 5, 1000, "Seat", "Toledo", 115);

		Coche coche1 = new Coche("9121DES", 5, 1200, "Volkswagen", "Golf", 130, 5);

		Moto moto1 = new Moto("1234ABC", 2, 150, "Yamaha", "R6", 96, true);

		// Guardamos en vehiculo 2 un objeto Coche, ya que cualquier coche es un
		// vehículo.
		Vehiculo vehiculo2 = coche1;

		// Guardamos en coche2 un objeto Coche que está dentro de una variable Vehículo.

		Coche coche2 = (Coche) vehiculo2;

	}
}
