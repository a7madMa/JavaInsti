
package hoja1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String nombre;
		String apellidos;
		String telefono;

		try {
			FileWriter archivo = new FileWriter("ficheros/contactos.txt");

			BufferedWriter buffer = new BufferedWriter(archivo);

			for (int i = 0; i < 3; i++) {

				System.out.println("Escribe tu nombre: ");
				nombre = entrada.nextLine();

				System.out.println("Escribe tus apellidos: ");
				apellidos = entrada.nextLine();

				System.out.println("Escribe tu número de teléfono:");
				telefono = entrada.nextLine();

				// Escribimos en el archivo el nombre indicado.
				buffer.write(apellidos + "," + nombre + "," + telefono + "\n");

			}

			buffer.close();

		} catch (IOException e) {
			System.out.println("Error de escritura en disco.");
		}

	}

}
