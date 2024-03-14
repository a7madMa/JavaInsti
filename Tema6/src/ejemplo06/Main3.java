package ejemplo06;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		try {
			dividirPor20();
		} catch (NumberFormatException nfe) {
			System.out.println("Tienes que escribir un número entero!");
		} catch (ArithmeticException ae) {
			System.out.println("¡No se puede dividir por cero!");
		} catch (Exception e) {
			System.out.println("Se ha producido un error inesperado.");
			System.out.println(e.toString());
		}

	}

	static void dividirPor20() throws NumberFormatException, ArithmeticException, Exception {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");
		String numero = entrada.nextLine();

		int num;

		num = Integer.parseInt(numero);
		System.out.println("La división de 20 entre " + num + " es " + 20 / num);

	}

}
