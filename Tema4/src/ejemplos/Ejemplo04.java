package ejemplos;

public class Ejemplo04 {

	public static void main(String[] args) {
		
		System.out.println("El doble de 15 es: " + doblar(15));
		
		int doble = doblar(20);
		System.out.println("El doble de 20 es " + doble);
		

	}
	
	// El método sumar recibe un argumentos, num, de tipo entero
	// Devuelve el doble de num.
	static int doblar(int num) {
		return 2 * num;

	}

}
