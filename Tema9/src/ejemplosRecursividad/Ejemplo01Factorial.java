package ejemplosRecursividad;

public class Ejemplo01Factorial {

	public static void main(String[] args) {

		System.out.println(factorial(5));

	}

	private static int factorial(int n) {

		if (n < 0) {
			System.out.println("Operación imposible");
			System.exit(0);
		}
		if (n > 0) {
			// Si n es mayor que 0, aplicamos la fórmula que nos calcula el factorial en
			// función de n-1.
			// Éste es el caso recursivo
			return n * factorial(n - 1);
		} else {
			// Si n es 0, el factorial sabemos que es 1.
			// Éste es el caso base.
			return 1;

		}
	}

}
