package ejemplos;

public class Ejemplo07 {

	public static void main(String[] args) {
		
		String unaPalabra = "hola";
		System.out.println("La inicial de " + unaPalabra + " és " + inicial(unaPalabra)	 );

	}

	// Devuelve la inicial de la palabra recibida como parámetro.
	static char inicial(String palabra) {
		
		return palabra.charAt(0);
		

	}

}
