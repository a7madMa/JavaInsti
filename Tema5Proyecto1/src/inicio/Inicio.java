package inicio;

import java.util.Scanner;

import geometria.Cilindro;

public class Inicio {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// Primera forma
		Cilindro cilindro1 = new Cilindro();

		System.out.println("Escribe la altura:");
		cilindro1.setAltura(entrada.nextInt());
		System.out.println("Escribe el radio:");
		cilindro1.setRadio(entrada.nextInt());

		System.out.println("El área del cilindro 1 es: " + cilindro1.getArea() + " El volumen del cilindro 1 es: "
				+ cilindro1.getVolumen());

		// Segunda forma
		System.out.println("Escribe la altura:");
		int altura = entrada.nextInt();
		System.out.println("Escribe el radio:");
		int radio = entrada.nextInt();
		
		Cilindro cilindro2 = new Cilindro(altura, radio);

		System.out.println("\nEl área del cilindro es: " + cilindro2.getArea() + " El volumen del cilindro es: "
				+ cilindro2.getVolumen());

		// Tercera forma
		System.out.println("\n" + cilindro2.toString());

	}

}
