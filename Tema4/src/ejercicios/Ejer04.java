package ejercicios;

import java.util.Scanner;

public class Ejer04 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número");

		int numero = entrada.nextInt();

		System.out.println(cuadrado(numero));

	}

	static int cuadrado(int numero) {

		return numero * numero;

	}

}