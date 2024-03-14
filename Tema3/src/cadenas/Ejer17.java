package cadenas;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe un frase: ");

		String frase = entrada.nextLine();

		int espacio = frase.lastIndexOf(" ");

		for (int i = 0; i < frase.length(); i++) {

			if (i < espacio) {

				System.out.print(frase.charAt(i));

			}

		}

	}

}
