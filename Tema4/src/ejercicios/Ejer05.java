package ejercicios;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número");

		int numero = entrada.nextInt();

		System.out.println(cubo(numero));

	}

	static int cubo(int numero) {

		return numero * numero * numero;

	}

}