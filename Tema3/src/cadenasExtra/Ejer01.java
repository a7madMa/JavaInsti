package cadenasExtra;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Palabras capicúa (palíndromos) ***\n");
		System.out.println("Escribe una palabra y te diré si es capicúa");

		String palabra = entrada.nextLine();

		boolean capicua = esCapicua(palabra);

		if (capicua) {
			System.out.println("Es capicúa");

		} else {
			System.out.println("No es capicúa");

		}
	}

	static boolean esCapicua(String palabra) {

		int izq = 0, der = palabra.length() - 1;

		while (der > izq) {

			if (palabra.charAt(izq) != palabra.charAt(der)) {
				return false;
			}
			izq++;
			der--;
		}

		return true;

	}

}
