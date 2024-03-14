package ejercicios;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		System.out.println("El nombre introducido es: " + preguntarNombre());

	}

	static String preguntarNombre() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();

		return nombre;
	}

}
