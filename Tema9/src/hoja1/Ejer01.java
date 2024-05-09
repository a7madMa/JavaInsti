package hoja1;

public class Ejer01 {

	public static void main(String[] args) {

		System.out.println(transforma(13));

	}

	private static String transforma(int n) {

		if (n > 1) {
			// Caso recursivo.
			return transforma(n / 2) + n % 2;
		} else if (n == 1 || n == 0) {
			// Caso base.
			return "" + n;
		} else {
			return "ERROR";
		}

//		int residuo = 0;
//		int resto = 0;
//		String resultado = String.valueOf(residuo);
//
//		residuo = dato / 2;
//		resto = dato % 2;
//		if (dato == 0) {

		// Caso recursivo
//			return resultado;
//
//		} else {
//

	}

}
