package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo12 {

	public static void main(String[] args) {
		// Escribe una aplicación que pregunte al usuario un número entre 1 y 5.
		// Si responde "3", se le felicitará por haber acertado.
		// Si no, se le seguirá pidiendo más números

		Scanner entrada = new Scanner(System.in);

		int num;

		// Una variable semáforo es siempre booleana.
		boolean PararDePreguntar = false;
		do {

			System.out.print("Dime un número del 1 al 5: ");
			num = entrada.nextInt();

			// Cuando se cumpla la condición de parada (num==3)
			// Cambiamos el valor de la variable semáforo, para que
			// la condición del bucle sea falsa y termine.

			if (num == 3) {

				PararDePreguntar = true;
			}
			// Ponemos la exclamación (NOT) para que si ParaDePreguntar
			// es true, la condición sea flase y el bucle termine.
			// Y viceversa.

		} while (!PararDePreguntar);

		System.out.println("\nFelicidades has acertado!!");
	}

}
