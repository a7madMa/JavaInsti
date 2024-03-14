package ejemplo15finalize;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {
			Coche coche = new Coche("1001DFT", "Seat", "Toledo");
			coche = null; // Coche deja de apuntar a la posición de memoria.

		}

		System.gc();

		System.out.println("Fin");

	}

}
