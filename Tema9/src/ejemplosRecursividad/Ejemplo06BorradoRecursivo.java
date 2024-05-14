package ejemplosRecursividad;

import java.io.File;

public class Ejemplo06BorradoRecursivo {

	public static void main(String[] args) {

		borrar(new File("daw"));

	}

	private static void borrar(File file) {

		// Caso recursivo: file es una carpeta, luego voy llamanado al método borrar()
		// recursivamente pásandole cada archivo o caprpeta que contenga.

		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				System.out.println("Entrando en " + f.toString());
				borrar(f);

			}

		}
		// Caso base: file es un archivo y, por tanto puedo borrarlo
		// con el método delete() de File.
		System.out.println("Borrando " + file.toString());
		file.delete();

	}

}
