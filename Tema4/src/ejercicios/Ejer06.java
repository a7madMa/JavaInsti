package ejercicios;

import java.util.Scanner;

// Escribe un método llamado fahrenheit() que tome como argumento una temperatura en grados
// centígrados y devuelva la temperatura en grados Fahrenheit.
public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime la temperatura: ");
		double temperatura = entrada.nextDouble();

		System.out.println("La temperatura en fahrenheit es: " + fahrenheit(temperatura));
	}

	static double fahrenheit(double temperatura) {

		return (temperatura * 9 / 5) + 32;

	}

}
