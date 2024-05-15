package ejemplosMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Mapa que relacione DNI y persona (valor).

		Map<String, String> personas = new HashMap<>();

		// Añadimos 4 personas
		personas.put("12345678X", "Juan Castell");
		personas.put("12476578R", "Lucas Hugo Alfonso Beaumont");
		personas.put("65874584F", "Manuel Maria del castillo");
		personas.put("37237892E", "Laura Martínez");

		// Preguntamos al ususrio un DNI y le decimos el nombre de la persona.

		System.out.println("Introduzca un DNI y le diré el nombre de la persona.");
		String dni = entrada.nextLine();

		if (personas.containsKey(dni)) {
			System.out.println("\nEl nombre es: " + personas.get(dni));
		} else {
			System.out.println("DNI No encontrado.");
		}

		// Eliminamos a la persona cuyo DNI hemos leído.

		personas.remove(dni);
		System.out.println(personas.toString());

		// Ver en forma de tabla la información del mapa.
		System.out.println("Contenido del mapa");
		for (String clave : personas.keySet()) {
			System.out.println(clave + "=>" + personas.get(clave));
		}

		// Lista de nombres en el mapa.
		System.out.println("\nNombres guardados en el mapa.");
		for (String nombre : personas.values()) {
			System.out.println(nombre);

		}
		
		
		

	}

}
