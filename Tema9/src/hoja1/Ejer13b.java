package hoja1;

public class Ejer13b {

	public static void main(String[] args) {

		String frase = "AL B G A";
		frase = quitarEspacios(frase);

		System.out.println(esPalindromo(frase, 0, frase.length() - 1));

	}

	private static String quitarEspacios(String frase) {

		// Creamos un array con las palabras sueltas de la frase.
		String[] palabras = frase.split(" ");

		String fraseSinEspacios = "";

		// Concatenamos las palabras del array para obtener la frase original sin
		// espacios.
		for (String palabra : palabras) {
			fraseSinEspacios = fraseSinEspacios + palabra;
		}

		return fraseSinEspacios;

	}

	private static boolean esPalindromo(String frase, int inicio, int fin) {

		// Caso base
		if (inicio >= fin) {

			return true;

		}

		// Caso recursivo.
		if (frase.charAt(inicio) == frase.charAt(fin)) {

			return esPalindromo(frase, inicio + 1, fin - 1);

		} else {

			return false;

		}

	}

}