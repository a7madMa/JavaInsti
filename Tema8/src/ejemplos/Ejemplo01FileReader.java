package ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Ejemplo01FileReader {

	public static void main(String[] args) {

		try {

			// Creamos un FileReader para acceder al archivo.
			FileReader archivo = new FileReader("ficheros/nombres.txt");

			// Creamos un BufferedReader para acceder al archivo usando un buffer (más
			// eficiente).
			BufferedReader buffer = new BufferedReader(archivo);

//			// Leemos la primera Línea.
//			String linea = buffer.readLine();
//			System.out.println(linea);

//			// Leemos la segunda línea
//			linea = buffer.readLine();
//			System.out.println(linea);
//
//			// Leemos la tercera línea no es eficiente
//			linea = buffer.readLine();
//			System.out.println(linea);

			// Leemos el archivo línea a línea.
			String linea = buffer.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();

			}
			System.out.println("\nFin de la lectura");

			// Cuando cerramos el buffer.close tambien se cierra el archivo.
			// Cerramos el buffer de entrada.
			buffer.close();

		} catch (FileNotFoundException e) {
			System.out.println("Error: no se ha encontrado el archivo.");
		} catch (IOException e) {
			System.out.println("Se ha producido un error de entrada/Salida.");
		}

	}

}
