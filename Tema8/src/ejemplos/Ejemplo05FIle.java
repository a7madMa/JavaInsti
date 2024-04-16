package ejemplos;

import java.io.File;

public class Ejemplo05FIle {

	public static void main(String[] args) {

		// Crear carpetas.
		File carpeta = new File("trabajos");

		boolean resultado = carpeta.mkdir();

		if (resultado == true) {
			System.out.println("Carpeta creada.");

		} else {
			System.out.println("No se ha podido crear la carpeta.");
		}

		// Crear una serie de carpetas. (No se puede crear 3 carpetas de golpe).(hay que
		// usar mkdirs)

		File carpeta2 = new File("apuntes/prog/tema8");
		resultado = carpeta2.mkdirs();

		if (resultado == true) {
			System.out.println("Carpeta creada.");

		} else {
			System.out.println("No se ha podido crear la carpeta.");
		}

		// Borrar una carpeta.

		resultado = carpeta.delete();

		if (resultado) {
			System.out.println("Carpeta Borrada.");

		} else {
			System.out.println("No se ha podido borrar la carpeta.");
		}

		// Borrar un archivo (igual a borrar una carpeta).

		File archivo = new File("ficheros/contactos.txt");

		resultado = archivo.delete();

		if (resultado) {
			System.out.println("Archivo Borrado.");

		} else {
			System.out.println("No se ha podido borrar el archivo.");
		}

	}

}
