package ejemplo12Static;

public class Unidades {

	// Los siguientes atributos son estáticos. Esto hace que tenga el mismo valor
	// para cualquier objeto de la clase uniadades.

	static double PI = 3.141593;

	// Factor de conversión de quilómetros a metors
	static double quilometros = 1000;

	// Factor de conversión de centiílitros a lítros.
	static double centilitros = 0.01;

	// Método que dado un número nos devuelve el área del círculo cuyo radio es ese
	// numero.

	// El siguiente método es estático. Eso significa que podemos llamarlo desde el
	// nombre de la clase. sin necesidad de crear un objeto previamente.
	public static double areaCirculo(double radio) {
		return PI * radio * radio;
	}

}
