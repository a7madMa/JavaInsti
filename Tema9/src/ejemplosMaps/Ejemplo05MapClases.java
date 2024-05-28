
package ejemplosMaps;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo05MapClases {

	public static void main(String[] args) {

		Map<Mascota, Propietario> clinica = new HashMap<>();

		Mascota mascota1 = new Mascota(123, "Jazz", "Perro");
		Mascota mascota2 = new Mascota(202, "Funky", "Gato");
		Mascota mascota3 = new Mascota(145, "Bebop", "Periquito");

		Propietario dueno1 = new Propietario("10020200G", "Agustín", "Lucero");
		Propietario dueno2 = new Propietario("20200300H", "Marga", "Rita");
		Propietario dueno3 = new Propietario("40500600K", "Tati", "Ana");

		clinica.put(mascota1, dueno1);
		clinica.put(mascota2, dueno2);
		clinica.put(mascota3, dueno3);

		System.out.println("LISTADO DE CLIENTES:");
		for (Mascota mascota : clinica.keySet()) {
			System.out.println(mascota.getNombre() + clinica.get(mascota).toString() + "\n");
		}

		// Este código va a fallar si no creamos los métodos hashCode() y equals() en
		// Propietario.

		System.out.println("¿El propietario Agustin está en el mapa?"
				+ clinica.containsValue(new Propietario("10020200G", "Agustín", "Lucero")));
	}

}
