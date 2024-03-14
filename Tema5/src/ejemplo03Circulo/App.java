package ejemplo03Circulo;

import java.util.Scanner;

public class App {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		Circulo circulo1 = new Circulo();
		
		circulo1.x = 0;
		circulo1.y = 0;
		circulo1.radio = 15;
		
		
		System.out.println("El radio del círculo es " + circulo1.radio);
		System.out.println("El área del círculo es " + circulo1.area());
		
		
		System.out.println("El perímetro del círculo es " + circulo1.premietro());
		
		
		// Creamos un nuevo círculo y le preguntamos al usuario sus propiedades.
		
		Circulo circulo2 = new Circulo();
		
		
		System.out.println("\nx?");
		circulo2.x = entrada.nextDouble();
		
		System.out.println("y?");
		circulo2.y = entrada.nextDouble();
		
		System.out.println("radio?");
		circulo2.radio = entrada.nextDouble();
		
		
		System.out.println("**** PROPIDADES DEL CÍRCULO");
		System.out.println("\nEl radio del círculo es " + circulo2.radio);
		System.out.println("El área del círculo es " + circulo2.area());
		
		
		System.out.println("El perímetro del círculo es " + circulo2.premietro());
		
		
	
		
		
	}

}
