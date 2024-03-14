package prueba;

import java.util.Scanner;

public class Ejemplo05 {
	// Programa que te pregunta en que color esta un semáforo
	// y te diga si tienes que pasar, o frenar, o si te da tiempo.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("¿En que color esta el semáforo?");

		String color = entrada.nextLine();

		color = color.toLowerCase();
		if (color.equals("verde")) {
			System.out.println("Pasar");

		} else if (color.equals("rojo")) {
			System.out.println("Parar");
		} else if (color.equals("amarillo")) {
			System.out.println("Frenar si estamos a tiempo");
		} else {
			System.out.println("Te has equivcado de color!!!");

		}
		System.out.println("Gracias!");

	}

}
