package ejemplosSets;

import java.util.HashSet;
import java.util.Set;

public class Ejemplo02 {

	public static void main(String[] args) {

		Set<Mascota> mascotas = new HashSet<>();

		mascotas.add(new Mascota(1, "Milú", "Perro"));
		mascotas.add(new Mascota(2, "Flufy", "Gato"));
		mascotas.add(new Mascota(3, "Piolín", "Canario"));
		mascotas.add(new Mascota(4, "Wilson", "Conejo"));
		mascotas.add(new Mascota(2, "Flufy", "Gato"));

		System.out.println("Hay " + mascotas.size() + " mascotas.");

	}
}
