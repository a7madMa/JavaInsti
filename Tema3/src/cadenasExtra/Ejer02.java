package cadenasExtra;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Separador de nombre y extensión de archivos ***\n");

		System.out.println("Escribe un nombre de archivo con su extensión:");
		String archivo = entrada.nextLine();

		System.out.print("\nNombre: " + nombreArchivo(archivo));
		System.out.print("\nExtensión: " + extensionArchivo(archivo));
	}

	static String nombreArchivo(String archivo) {
		String[] nombre = archivo.split("\\.");

		return nombre[0];
	}

	static String extensionArchivo(String archivo) {
		String[] extension = archivo.split("\\.");

		return extension[1];
	}

}