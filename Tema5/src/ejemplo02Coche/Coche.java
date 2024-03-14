package ejemplo02Coche;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos.
	String matricula;
	String marca;
	String modelo;
	String averia;
	int quilometros;

// leeDatos() pregunta al usuario los valores de las propiedades y los lee desde 
// la terminal.

	void leeDatos() {

		Scanner entrada = new Scanner(System.in);
		System.out.println("INTRODUCCION DE DATOS DEL COCHE");

		System.out.print("\nEscribe la matrícula del coche: ");
		matricula = entrada.nextLine();

		System.out.print("Escribe la marca del coche: ");
		marca = entrada.nextLine();

		System.out.print("Escribe el modelo del coche: ");
		modelo = entrada.nextLine();

		System.out.print("Describe la avería del coche: ");
		averia = entrada.nextLine();

		System.out.print("Escribe los quilómetros del coche: ");
		quilometros = entrada.nextInt();

	}

	// Muestra todas las propiedades del objeto.

	void mostrar() {

		System.out.println("\n**** DATOS DEL COCHE ****");
		System.out.println("\nMatrícula: " + matricula);

		System.out.println("Marca: " + marca);

		System.out.println("modelo: " + modelo);

		System.out.println("Avería: " + averia);

		System.out.println("Quilómetros: " + quilometros);

	}
}
