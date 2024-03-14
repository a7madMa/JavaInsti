package ejercicios;

public class Ejer11 {

	public static void main(String[] args) {
		int año = 2024;
		if (esBisiesto(año)) {
			System.out.println(año + " es un año bisiesto.");
		} else {
			System.out.println(año + " no es un año bisiesto.");
		}
	}

	static boolean esBisiesto(int año) {
		if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
}