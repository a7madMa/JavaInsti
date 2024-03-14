package ejercicios;

import java.util.Scanner;

import java.util.Scanner;

public class Ejer10 {
	// Escribe un método que escriba en pantalla el nombre de un mes a partir
	// de su número. En caso de que el número proporcionado no esté entre
	// 1 y 12, deberá terminar inmediatamente.
	public static void main(String[] args) {

		int mesNumero;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce el número del mes:");
		mesNumero = entrada.nextInt();

//		if(mesNumero > 12) {
//			break;
//		}

		encontrarMes(mesNumero);
	}

	static void encontrarMes(int mesNumero) {

		String[] mesNombres = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		if (mesNumero < 0 || mesNumero > 12) {
			return;
		}

		System.out.println(mesNombres[mesNumero - 1]);

	}

}