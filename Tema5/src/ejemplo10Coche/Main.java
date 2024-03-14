package ejemplo10Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche("2121DEF", "Volkswagen", "Taigo", "Aire acondicionado no funciona", 50000);
		coche1.mostrar();

		Coche coche2 = new Coche("1991HBH", "Seat", "Toledo");
		coche2.mostrar();

		coche2.setAveria("No gira el volante");
		coche2.setQuilometros(100000);

		coche2.mostrar();

		// Hemos puesto en el setter una restricción de forma que sólo se guarde un
		// valor positivo.
		coche2.setQuilometros(-10000);

		// Vemos que coche2 sigue con 100.000 km.
		coche2.mostrar();
	}

}