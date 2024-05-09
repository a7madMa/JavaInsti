package ejemplosRecursividad;

public class Ejemplo04ComparacionTiempos {

	public static void main(String[] args) {

		int edades[] = new int[1000];

		for (int i = 0; i < edades.length; i++) {
			edades[i] = i * 10;

			int tiempoInicio = (int) System.currentTimeMillis();
			System.out.println(tiempoInicio);

		}
		int x = 20;
		int pos = busquedaBinaria(x, edades);

		System.out.println("--- Búsqueda binaria ---");
		if (pos != -1) {
			System.out.println("El número " + x + " está en la posición " + pos);
		} else {
			System.out.println("El número " + x + " no se encuentra en el array.");
		}

		pos = busquedaSecuencial(x, edades);

		System.out.println("\n--- Busqueda Secuencial ---");
		if (pos != -1) {
			System.out.println("El número " + x + " está en la posición " + pos);
		} else {
			System.out.println("El número " + x + " no se encuentra en el array.");
		}

	}

	private static int busquedaBinaria(int x, int[] numeros) {

		// Instante en que empezamos a medir el tiempo. Esta función nos devuelve el
		// tiempo en milisegundos que ha pasado desde el 1 de enero del 1970.
		long tiempoInicio = System.currentTimeMillis();

		// Instante en que termina el método
		long tiempoFin;

		int i = 0; // Extremo izquierdo de búsqueda
		int f = numeros.length - 1; // Extremo derecho de búsqueda
		int m; // Punto medio entre i y f

		while (i <= f) {

			// Calculamos la posición en medio de i y f
			m = (i + f) / 2;

			// Comparamos el valor en m con el valor buscado.
			if (x == numeros[m]) {
				// Hemos encontrado el valor buscado.
				tiempoFin = System.currentTimeMillis();
				System.out.println("Tiempo de ejecución: " + (tiempoFin - tiempoInicio) + " ms");
				return m;

			} else if (x < numeros[m]) {
				f = m - 1;
			} else {

				i = m + 1;

			}
		}
		tiempoFin = System.currentTimeMillis();
		System.out.println("Tiempo de ejecución: " + (tiempoFin - tiempoInicio) + " ms");
		return -1;

	}

	private static int busquedaSecuencial(int x, int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] == x) {
				return i;
			}

		}
		return -1;

	}

}
