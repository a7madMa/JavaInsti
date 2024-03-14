package prueba;

import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// ejemplo de if - else if - else

		// Tenemos un rifa donde se saca un número de 4 cifras al azar.
		// si el jugador accierta un numero , cobrará 10€,
		// si acierta dos números, cobrará 30€, si acierta tres numeros.
		// cobrará 50€ y si acierta los cuatro números, cobrará 100€

		System.out.println("Cuantos numeros has acertado?");

		int numero = entrada.nextInt();

		if (numero == 1) {
			System.out.println("HAS GANADO 10€");

		} else if (numero == 2) {
			System.out.println("HAS GANADO 30€");
		} else if (numero == 3) {
			System.out.println("HAS GANADO 50€");
		} else if (numero == 4) {
			System.out.println("HAS GANADO 100€");
		} else {
			System.out.println("Sólo puede ser un número del 1 al 4");

		}

		System.out.println("Gracias por jugar!!");
		
		entrada.close();
	}
	

}
