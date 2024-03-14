package inicio;

import java.util.Scanner;

import biblioteca.Autor;

import biblioteca.Libro;

public class Inicio {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Autor autor1 = leerAutor();

		System.out.println("\nDatos del autor: " + autor1.toString());

		Autor autor2 = leerAutor();

		System.out.println("\nDatos del autor: " + autor2.toString());

		// Leemos los datos de un libro (suponemos que del autor anterios) los guardamos
		// en un objeto Libro.

		System.out.println("\n===== ALTA DE LIBRO =====");

		// Limpiamos el buffer de entrada para evitar que se salte la siguiente lectura.

		sc.nextLine();

		System.out.print("Titulo: ");

		String titulo = sc.nextLine();

		System.out.print("ISBN: ");

		String isbn = sc.nextLine();

		System.out.print("Año actual: ");

		int anyo = sc.nextInt();

		// Creo un array con los autores del libro

		Autor[] autores = { autor1, autor2 };

		Libro libro1 = new Libro(titulo, isbn, autores);

		Libro.setAnyoActual(anyo);

		System.out.println("\n Datos del libro: " + libro1.toString());
		
		System.out.println("\nAutores del libro:");
		System.out.println(libro1.muestraAutores());

		sc.close();

	}

	private static Autor leerAutor() {

		Scanner sc = new Scanner(System.in);

		// Leemos los datos de un autor y los guardamos en un objeto de la clase Autor.

		System.out.println("======= ALTA DE AUTOR =======");

		System.out.print("Nombre del autor: ");

		String nombre = sc.nextLine();

		System.out.print("Email del autor: ");

		String email = sc.nextLine();

		System.out.print("Año de nacimiento del autor:");

		int anyo = sc.nextInt();

		// Vaciamos el buffer de entrada para evitar que se salte el próximo nextLine().

		sc.nextLine();

		sc.close();

		return new Autor(nombre, email, anyo);

	}

}