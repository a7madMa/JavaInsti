package hoja1;

public class Ejer03 {

	public static void main(String[] args) {

		int num = 42;
		System.out.println(transforma(num));

	}

	private static String transforma(int n) {

		if (n > 15) {
			// Caso recursivo
			return transforma(n / 16) + aHex(n % 16);
		} else if (n >= 0 && n <= 15) {
			// Caso base
			return "" + aHex(n);
		} else {
			return "ERROR";
		}
	}

	// Devuelve un número entre 0 y 15 en hexadecimal
	private static String aHex(int n) {

		String cifrasHexadecimales[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E",
				"F", };

		return cifrasHexadecimales[n];

	}

}
