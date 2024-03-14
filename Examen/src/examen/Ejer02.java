package examen;

import java.util.Scanner;

public class Ejer02 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		double movimientos[] = new double[6];
		int posMin;
		double aux;

		System.out.println("Introduzca los movimientos del día");
		System.out.println("Un valor positivo es un ingreso, y un valor negativo es un gasto.");

		for (int i = 0; i < movimientos.length; i++) {

			System.out.println("\nMovimiento: ");
			movimientos[i] = entrada.nextDouble();

		}

		for (int i = 0; i < movimientos.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < movimientos.length; j++) {

				if (movimientos[j] > movimientos[posMin]) {

					posMin = j;
				}

			}

			aux = movimientos[i];
			movimientos[i] = movimientos[posMin];
			movimientos[posMin] = aux;

		}

		double ingresado = 0;
		double gastado = 0;

		double suma = 0;
		System.out.println("\nLos movimientos, ordenados de mayor a menor, quedan: ");
		for (int i = 0; i < movimientos.length; i++) {

			System.out.print(movimientos[i] + " ");

			suma = suma + movimientos[i];

			if (movimientos[i] > 0) {

				ingresado = ingresado + movimientos[i];

			}else {
				gastado = gastado + movimientos[i];
			}

		}
		System.out.println("\n\nEl total de todos los movimientos es: " + suma + " euros.");

		System.out.println("\nEn este periodo de tiempo, hemos ingresado " + ingresado + " €, y gastado " + gastado + " €.");

	}

}