package ejemplo02Vechiculo;

public class Main {

	public static void main(String[] args) {

//		Vehiculo vehiculo1 = new Vehiculo("1020GTH", 5, 1000, "Seat", "Toledo", 115);

		Coche coche1 = new Coche("9121DES", 5, 1200, "Volkswagen", "Golf", 130, 5);

//		System.out.println(vehiculo1.toString());
		System.out.println("\n" + coche1.toString());

		Moto moto1 = new Moto("1234ABC", 2, 150, "Yamaha", "R6", 96, true);
		
		System.out.println("\n" + moto1.toString());

	}
}
