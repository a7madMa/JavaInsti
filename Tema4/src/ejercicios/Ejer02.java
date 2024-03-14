package ejercicios;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("nombre: ");
		String nombre = entrada.nextLine();

		System.out.println("edad: ");
		int edad = entrada.nextInt();
		
		System.out.println(nombreEdad(nombre, edad));

	}

	static String nombreEdad(String nombre, int edad) {

		return ("Hola, " + nombre +", no parece que tengas " + edad + " años");

	}
}
