package hoja1;

public class Ejer04 {

	public static void main(String[] args) {

		/*
		 * 
		 * - Escribe un método recursivo que permita calcular la división entera de dos
		 * 
		 * números enteros haciendo restas sucesivas.
		 *
		 * 
		 * 
		 * Ejemplo:
		 *
		 * 
		 * 
		 * División entera de 20 entre 6: 20 / 6 = 3
		 *
		 * 
		 * 
		 * Método de restas sucesivas:
		 *
		 * 
		 * 
		 * 20 – 6 = 14 1 resta 14 – 6 = 8 2 restas 8–6=2 3 restas
		 *
		 * 
		 * 
		 * Ahora el resultado, 2, es menor que el divisor, 6. Ya no podemos restar más.
		 * 
		 * El resultado de la división entera es el número de restas, 3.
		 * 
		 */

		System.out.println("se ha dividido " + calculoDivision(20, 6, 0) + " veces.");

	}

	private static int calculoDivision(int num1, int num2, int numDivisones) {

// Caso base: cuando num1 es menor que num2, hemos terminado la división

		if (num1 < num2) {

			return numDivisones;

		}

// Restamos num2 de num1 y llamamos recursivamente a la función con los nuevos

// valores

		return calculoDivision((num1 - num2), num2, numDivisones + 1);

	}
}
