package hoja1;

public class Ejer02 {

	public static void main(String[] args) {

		int num = 5;
		System.out.println(transforma(num));

	}

	private static String transforma(int n) {

		String resultado = "";

		if (n < 0) {
			return "ERROR";
		} else if (n == 0) {
			return "0";
		}

		while (n > 0) {

			resultado = n % 2 + resultado;
			n = n / 2;

		}
		return resultado;

	}
}
