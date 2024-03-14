package ejercicios;

import java.util.Scanner;

// Escribe un método llamado celsius() que tome como argumento una temperatura en grados
// Fahrenheit y devuelva la temperatura en grados centígrados.
public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Dime la temperatura: ");
		double temperatura = entrada.nextDouble();

		System.out.println("La temperatura en celsius es: " + celsius(temperatura));
	}

	static double celsius(double temperatura) {

		return (temperatura -32) * 5 / 9;

	}

}
