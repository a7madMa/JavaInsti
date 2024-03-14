package examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer03 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int posMin = 0;
		double promedio = 0;
		int inferior = 0;

		String datos[][] = { { "Ribes", "Cecilio", "20" }, { "Alfonso", "María Paloma", "30" },
				{ "Losada", "Alejandra", "12" }, { "Clemente", "José Juan", "4" }, { "Prat", "Lucía", "26.5" }, };

		System.out.println("Relación de saldos:");
		System.out.printf("\n%-10s %-15s %-10s", "Apellido", "Nombre", "Saldo");
		System.out.printf("\n%-10s %-15s %-10s", "==========","========", "=======");

		// Mostramos los datos y calculamos el promedio, tambien contamos cuantas
		// personas tienen menos de 15 euros de saldo en su cuenta.

		for (int fila = 0; fila < datos.length; fila++) {
			System.out.printf("\n%-10s %-15s %-10s", datos[fila][0], datos[fila][1], datos[fila][2]);

			// Calcular el minimo.

			if (Double.parseDouble(datos[fila][2]) < Double.parseDouble(datos[posMin][2])) {
				posMin = fila;
			}
				// Calcular promedio
				promedio = promedio + Double.parseDouble(datos[fila][2]);

			

		}
			promedio = promedio / datos.length;

		for (int i = 0; i < datos.length; i++) {

			// Ver si saldo es inferior a 15
			if ((Double.parseDouble(datos[i][2]) < 15)) {
				inferior++;

			} else if (Double.parseDouble(datos[i][2]) >= 15) {
				
				
				// System.out.println("Todos los clientes tienen, al menos, 15 euros en su saldo.");
			}

		}

		System.out.println("\n\nEl cliente con menor saldo es " + datos[posMin][1] + " " + datos[posMin][0] + ", con "
				+ datos[posMin][2] + " euros.");

		System.out.println("\nEl saldo promedio son " + promedio + " euros.");

		System.out.println("\nHay " + inferior + " clientes que tienen menos de 15 euros en su saldo.");

	}

}