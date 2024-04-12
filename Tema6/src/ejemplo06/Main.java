package ejemplo06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");

		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();

		int num;

		// Colocamos en un bloque try instrucciones que pueden lanzar un error.
		try {

			// La siguiente instrucción puede lanzar un error (NumberFormatException) si lo
			// que escribe el usuario no es un entero.
			num = Integer.parseInt(numero);

			// La siguiente instrucción puede lanzar un error (ArithmeticException) si lo
			// que escribe el usuario es un 0.
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);

		} catch (NumberFormatException nfe) {
			// Esto se ejecutará si se ha producido un error de tipo NumberFormatException.
			System.out.println("¡Tienes que escribir un número entero!");

			// Ahora el programa saltará fuera del bloque try-catch.

		} catch (ArithmeticException ae) {
			// Esto se ejecutará si se ha producido un error de tipo ArithmeticException.

			System.out.println("¡No se puede dividir por cero!");

			// Ahora el programa saltará fuera del bloque try-catch.

		} catch (Exception e) {
			// Esto se ejecutará si se ha producido un error de cualquier tipo.

			System.out.println("Se ha producido un error inesperado.");
			System.out.println(e.toString());

		}

		// Este código se ejecutará tras el try-catch aunque se haya producido una
		// excepción.
		System.out.println("\nAhora seguiría el código fuera del catch...");

	}

}