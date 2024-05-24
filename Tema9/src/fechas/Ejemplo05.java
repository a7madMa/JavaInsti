package fechas;

import java.time.LocalTime;

public class Ejemplo05 {

	public static void main(String[] args) {

		// Array con la estructura:
		// Hora | paciente

		String[][] citas = { { "08:20", "Álex Cáceres" }, { "08:40", "Agustín Riera" }, { "08:50", "Joel Álvaro" },
				{ "08:10", "Daniel Sims" }, { "09:00", "Juan López" }, };

		// Buscar la primera cita de la mañana.

		int posMin = 0;

		for (int i = 1; i < citas.length; i++) {
			if (LocalTime.parse(citas[i][0]).isBefore(LocalTime.parse(citas[posMin][0]))) {
				posMin = i;
			}
		}

		System.out.println(
				"La primera cita de la mañana la tiene " + citas[posMin][1] + ", a las " + citas[posMin][0] + ".");

		// Ordenamos el array por hora.

		String[] aux;

		// Recorremos el array de arriba hacia abajo.
		for (int i = 0; i < citas.length - 1; i++) {

			// Buscamos el mínimo entre la fila i y el final del array.
			posMin = i;
			for (int j = i + 1; j < citas.length; j++) {
				if (LocalTime.parse(citas[j][0]).isBefore(LocalTime.parse(citas[posMin][0]))) {
					posMin = j;
				}
			}

			// Sabemos que la fecha más pequeña entre i y el final del array está en la
			// posición posMin.

			// Intercambiamos la fila i y la fila posMin.
			aux = citas[i];
			citas[i] = citas[posMin];
			citas[posMin] = aux;

		}

		// Mostramos el array.
		for (int i = 0; i < citas.length; i++) {
			System.out.println(citas[i][0] + " " + citas[i][1]);
		}

	}

}