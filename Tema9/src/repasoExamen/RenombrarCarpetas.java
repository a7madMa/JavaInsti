package repasoExamen;

import java.io.File;
import java.util.Scanner;

public class RenombrarCarpetas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Preguntar al usuario qué nombre quiere dar a la carpeta y al archivocambiarle
		// el nombre
		// usando File.renameTo().

		System.out.println("Dime el nombre nuevo de la carpeta : ");
		String nombreCarpeta = entrada.nextLine();

		System.out.println("Dime el nombre nuevo del archivo: ");
		String nombreArchivo = entrada.nextLine();

		File rutaArchivo = new File("ficheros/archivoOriginal");
		File rutaCarpeta = new File("ficheros/carpetaOriginal");

		rutaCarpeta.renameTo(new File("ficheros/" + nombreCarpeta));
		rutaArchivo.renameTo(new File("ficheros/" + nombreArchivo));

	}

}
