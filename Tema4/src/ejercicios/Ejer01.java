package ejercicios;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("nombre: ");
		String nombre = entrada.nextLine();

		System.out.println("edad: ");
		int edad = entrada.nextInt();
		
		nombreEdad(nombre, edad);

	}
	
	static void nombreEdad (String nombre, int edad) {
		
		
	System.out.println("Hola,"+ nombre + ","+ "no parece que tengas"+ edad +"años");
	
	}
}
	
	
	


