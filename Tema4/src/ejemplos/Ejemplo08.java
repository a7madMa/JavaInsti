package ejemplos;

public class Ejemplo08 {

	public static void main(String[] args) {
		System.out.println("El área de un triangulo de base 10 y altura 5 es: " + areaTriangulo(10, 2));
	
		
		

	}
	// Devuelve el área de un triángulo con los argumentos de base y altura recibidos.
	static double areaTriangulo(double base, double altura) {
		return base * altura / 2;
		
	}

}
