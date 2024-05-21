package hoja1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejer12 {

	public static void main(String[] args) {

		char[] ejemplo = { 'A', 'L', 'A' };
		char[] ejemplo3 = { 'A', 'L', 'L', 'I', 'V', 'E', 'S', 'S', 'E', 'V', 'I', 'L', 'L', 'A' };
		char[] ejemplo2 = { 'B', 'A', 'A', };

		System.out.println(esPalindromo(ejemplo, 0, ejemplo.length - 1));

	}

	private static boolean esPalindromo(char frase[], int inicio, int fin) {

		// Caso base.
		if (fin <= inicio) {
			return true; // Si fin vale menos o igual a inicio, es palindromo

		}
		if (frase[inicio] == frase[fin]) {
			return esPalindromo(frase, inicio + 1, fin - 1);

		}
		return false; // Los caracteres no coinciden, no es un palíndromo
	}
}
