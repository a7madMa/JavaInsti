package fechas;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {

		// Array con la estructura:
		// Fecha | suceso

		LocalDate[] fechas = new LocalDate[5];

		// Pedir por terminal las cinco fechas y guardarlas en el array.

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < fechas.length; i++) {

			System.out.println("Introduce una fecha: ");
			fechas[i] = LocalDate.parse(entrada.nextLine());

		}
		// Mostrar por terminal la lista de fechas.

		System.out.println("\nFechas introducidas:");
		for (int i = 0; i < fechas.length; i++) {
			System.out.println(fechas[i].toString());

		}

		// Indicar la fecha mas antigua

		int posMin = 0;

		for (int i = 0; i < fechas.length; i++) {

			if (fechas[i].isBefore(fechas[posMin])) {
				posMin = i;

			}

		}
		System.out.println("La fecha más antigua es: " + fechas[posMin]);
	}

}
