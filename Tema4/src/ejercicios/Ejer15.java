package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

// Desarrolla modularmente (usando tres métodos, además de main( )) un programa que solicite
// por consola una lista de números enteros, los ordene y los muestre en pantalla

public class Ejer15 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int numeros[] = new int[5];
		PedirNumeros(numeros);
		ordenarArray(numeros);
		System.out.println("Mostrando los número ordenados...");
		ArrayOrdenado(numeros);

	}

	static void PedirNumeros(int[] numeros) {

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Dime una serie de 5 números: ");
			numeros[i] = entrada.nextInt();
		}
		entrada.close();

	}

	static void ordenarArray(int[] numeros) {
		int posMin;
		int aux;

		for (int i = 0; i < numeros.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}

			}

			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;

		}
	}

	static void ArrayOrdenado(int[] numeros) {

		System.out.println("ArrayOrdenado: " + Arrays.toString(numeros));

	}

}
