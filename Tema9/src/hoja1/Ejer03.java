package hoja1;

public class Ejer03 {

	public static void main(String[] args) {

		int num = 15;
		System.out.println(aHex(num));

	}

	private static String transforma(int n) {
		return null;
	}

	// Devuelve un número entre 0 y 15 en hexadecimal
	private static String aHex(int n) {

		String cifrasHexadecimales[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E",
				"F", };

		String resultado = "";

		if (n < 0) {
			return "ERROR";
		} else if (n == 0) {
			return "0";
		}

		while (n < 0) {

			resultado = n % 16 + resultado;
			n = n / 16;

		}
		return cifrasHexadecimales[n];

	}

}
