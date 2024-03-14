package ejercicios;
// Método que devuelve un array.
import java.util.Arrays;

public class Ejer13 {

	public static void main(String[] args) {

		int numero[] = { 12, 10, 56, 34, 2, 0, 76 };

		int[] edadesOrdenadas = ordenarArray(numero);
		System.out.println("Arry ordenado: \n " + Arrays.toString(edadesOrdenadas)); 

	}

	static int[] ordenarArray(int[] numeros) {
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

		return numeros;

	}

}