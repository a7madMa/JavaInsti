package cadenasExtra;

import java.util.Iterator;

import java.util.Scanner;

public class Ejer03 {

//	Escribe un programa que pida al usuario una frase. Si su longitud es menor o igual

//	a 20 caracteres, la mostrará sin cambios. Pero si supera los 20 caracteres, 

//	mostrará los 17 primeros caracteres seguidos de tres puntos suspensivos, 

//	de manera que la longitud total sea de 20.

//	Usa un método llamado recortar() que reciba una cadena y devuelva la cadena original

//	o recortada, según corresponda.

	public static void main(String[] args) {

		String frase = "";

		System.out.println("Frase recortada:\n" + recortar(frase));

	}

	static String recortar(String frase) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Acortador de texto ***\n");

		System.out.println("Escribe una frase y la cortaré de manera que no exceda" + "los 20 caracteres: ");

		frase = entrada.nextLine();

		char longitudFrase = 20;

		String fraseRecortadaMas20 = "";

		String fraseRecortadaMenos20 = "";

		for (int i = 0; i < frase.length(); i++) {

			if (frase.length() >= longitudFrase) {

				fraseRecortadaMas20 = frase.substring(0, 17);

			} else {

				fraseRecortadaMenos20 = fraseRecortadaMenos20 + frase.charAt(i);

			}

		}

		if (frase.length() >= 20) {

			return fraseRecortadaMas20 + "...";

		} else {

			return fraseRecortadaMenos20;

		}

	}

}
