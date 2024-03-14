package ejercicios;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime el primer número:");
		int num1 = entrada.nextInt();
		System.out.println("Dime el segundo número:");
		int num2 = entrada.nextInt();

		System.out.println(max(num1, num2));
		System.out.println(min(num1, num2));
	}

	static int max(int x, int y) {

		if (x < y) {
			return y;
		}
		return x;

	}

	static int min(int x, int y) {

		if (x > y) {
			return y;
		}
		return x;

	}

}
