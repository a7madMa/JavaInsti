package ejemplo06;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");

		System.out.println("Escribe un nº entero: ");
		String numero = entrada.nextLine();

		int num;
		try {

			num = Integer.parseInt(numero);
			System.out.println("La división de 20 entre " + num + " es " + 20 / num);

		} catch (NumberFormatException | ArithmeticException e) {

			System.out.println("¡Tienes que escribir un número entero distinto de 0!");

		} catch (Exception e) {

			System.out.println("Se ha producido un error inesperado. El programa se cerrará.");
			System.out.println(e.toString());
			return;

		} finally {
			// El bloque finally se ejecutará tanto si ha habido una excepción como si no.
			// Observar que tiene prioridad sobre el return del último catch.

			System.out.println("Bien o mal, el try-catch ha finalizado.");
		}

		// Esto se ejecutará si no se produce ningún error o si se produce de tipo
		// NumberFormatException o Arithmetic Exception. En el caso de que se produzca
		// un Exception no se ejecutará, por el return.
		System.out.println("\nAhora seguiría el código fuera del catch...");

	}

}