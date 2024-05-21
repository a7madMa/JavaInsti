package hoja1;

import java.lang.reflect.Array;

public class Ejer11 {

	/*
	 * Crea un método que permita obtener el mayor elemento de un array de números
	 * decimales (double).
	 */

	public static void main(String[] args) {

		double numeros[] = { 20.5, 1.4, 3.1, 90.2 };
		double max = max(numeros, numeros.length);
		System.out.println("El máximo del array es: " + max);

	}

	private static double max(double numeros[], int numElementos) {

		// Caso base.
		if (numElementos == 1) {
			return numeros[0];
		}
		// Caso recursivo.
		return maximo(max(numeros, numElementos - 1), numeros[numElementos - 1]);
	}

	private static double maximo(double a, double b) {

		return a > b ? a : b;

	}

}
