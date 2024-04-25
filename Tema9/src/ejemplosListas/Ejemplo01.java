package ejemplosListas;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo01 {

	public static void main(String[] args) {

		List<String> idiomas = new ArrayList<>();
		idiomas.add("Esperanto");
		idiomas.add("Arameo");
		idiomas.add(1, "Español");

		System.out.println("En la posición 0 está el " + idiomas.get(0));
		System.out.println("En la posición 1 está el " + idiomas.get(1));

		mostrarLista(idiomas);

		System.out.println("\nEliminamos el español, que está en la posición 1:");
		String borrado = idiomas.remove(1);
		System.out.println("\nSe ha borrado el idioma " + borrado + ".");

		mostrarLista(idiomas);

		// Eliminamos el Arameo. Esto funcioan porque la clase String ya tiene un método
		// equals() sobreescrito.
		System.out.println("\nEliminamos el arameo, directamente(sin poner posición):");
		boolean resultado = idiomas.remove("Arameo");
		System.out.println("Resultado de borar Arameo: " + resultado);

		mostrarLista(idiomas);

		System.out.println("\nSustituímos Esperanto por Italiano:");
		borrado = idiomas.set(0, "Italiano");
		System.out.println("Se ha borrado " + borrado + ".");
		mostrarLista(idiomas);

		System.out.println("\nAñadimos algunos idiomas más...");
		idiomas.add("Francés");
		idiomas.add("Inglés");
		idiomas.add("Portugués");
		idiomas.add("Catalán");

		mostrarLista(idiomas);

		System.out.println("\nBuscamos el idioma inglés");
		boolean existe = idiomas.contains("Inglés");
		System.out.println("¿Existe el Inglés? " + existe);
	}

	private static void mostrarLista(List<String> lista) {

		// for (int i = 0; i < idiomas.size(); i++) {
		// System.out.println("En la posición " + i + " está el " + idiomas.get(i));
		// }

		// for-each o for mejorado.
		for (String idioma : lista) {
			System.out.println("- " + idioma);
		}

	}
}
