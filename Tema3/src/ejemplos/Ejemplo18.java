package ejemplos;

public class Ejemplo18 {

	public static void main(String[] args) {

		// Cómo redondear cifras decimales.

		double num = 10.0 / 3;

		System.out.println("num sin redondear: " + num);
		
		// Para redondear con dos decimales mutliplicamos por 100.
		// Si fuera con un decimal, multiplicamos por 10.
		
		double numRedondeado = Math.round(num * 100)/100.0;

		System.out.println("num redondeado: " + numRedondeado);

	}

}
