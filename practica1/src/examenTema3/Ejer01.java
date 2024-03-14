package examen;

import java.util.Scanner;

public class Ejer01 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		String telefono;
		
		System.out.println("Escribe un teléfono con el format correcto: ");
		telefono = entrada.nextLine();
		
		String prefijo [] = telefono.split(" ");
		String numero [] = telefono.split(" ");
		int ex = telefono.lastIndexOf(telefono);
		
	
		
		
		
		
		System.out.println("\nDatos del teléfono:");
	
		System.out.println("   * Prefijo de país: " + prefijo[0] );
		System.out.println("   * Teléfono: " );
		System.out.println("   * Extensión: " + ex);
		
		
		
	
		

	}

}
