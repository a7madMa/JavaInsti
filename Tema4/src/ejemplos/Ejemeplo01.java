package ejemplos;

public class Ejemeplo01 {

	public static void main(String[] args) {

		System.out.println("Llamando al mayordomo. ");

		// Llamamos al método mayordomo().
		mayordomo();

		System.out.println("Tráigame unos turrones.");

		// Volvemos a llamar al método mayordomo().

		mayordomo();
		mayordomo();

	}

	// Definimos el método mayordomo().
	// Este método no devuelve nada y no toma ningún argumento.
	// Es decir no hay nada dentro del parentesis de mayordomo(NO HAY NADA);
	static void mayordomo() {
		System.out.println("¿Qué desea, señor?");

	}

}
