package ejemplo07Visibilidad;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos.
	 private String matricula;
	 String marca;
	 public String modelo;
	
	String averia;
	int quilometros;

	// Constructor explícito que tome los cinco valores de los atributos.
	Coche(String matricula, String marca, String modelo, String averia, int quilometros) {

		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.averia = averia;
		this.quilometros = quilometros;

	}

	// Constructor explícito que toma la matrícula, marca y modelo y deje el resto
	// de valores sin modificar.
	
	Coche(String matricula, String marca, String modelo){
		
		this(matricula, marca, modelo,null,0);
//		
//		this.matricula = matricula;
//		this.marca = marca;
//		this.modelo = modelo;
//		
		
		
	}

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
