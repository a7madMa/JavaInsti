package ejercicios;

public class Ejer14 {

	public static void main(String[] args) {

		String[] planetas = { "Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno",
				"Plutón" };
		String cuerpo = "Tierra";

		int pos = buscar(planetas, cuerpo);
		if (pos == -1) {
			System.out.println(cuerpo + " no es un planeta.");
		} else {
			System.out.println(cuerpo + " está en la posición " + pos);
		}

	}

	static int buscar(String[] planetas, String cuerpo) {

		for (int i = 0; i < planetas.length; i++) {
			if (planetas[i].equals(cuerpo)) {
				return i;
			}
		}

		return -1;

	}

}