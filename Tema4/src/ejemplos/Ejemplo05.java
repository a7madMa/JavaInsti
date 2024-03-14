package ejemplos;

public class Ejemplo05 {

	public static void main(String[] args) {

		System.out.println("Sumando 12 y 15" + sumar(12,15));
		
		int suma = sumar(10,20);
		System.out.println("La suma de 10 y 20 es " + suma);

	}

	// El método sumar recibe dos argumentos, a y b, de tipo entero
	// Devuelve la suma de ambos números.
	static int sumar(int a, int b) {
		return a + b;

	}

}
