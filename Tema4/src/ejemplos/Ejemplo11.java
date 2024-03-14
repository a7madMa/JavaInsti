package ejemplos;

public class Ejemplo11 {
	// Variable global: su ámbito es toda la clase, ( se puede usar en todos los
	// métodos).
	static int edad;

	public static void main(String[] args) {

		edad = 50;
		mostrarEdad();

	}

	static void mostrarEdad() {
		System.out.println("La edad es " + edad + " años.");
		edad = 100;
		System.out.println("La edad es " + edad + " años.");
	}

}
