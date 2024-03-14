package ejercicios;

import java.util.Arrays;

public class Ejer12 {

	public static void main(String[] args) {

		int numero[] = { 12, 10, 56, 34, 2, 0, 76 };

		ordenarArray(numero);

	}

	static void ordenarArray(int[] numeros) {
		int posMin;
		int aux ;

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
		System.out.println("Arry ordenado: \n " + Arrays.toString(numeros));

	}

}
