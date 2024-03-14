package ejemplo12Static;

public class Main {

	public static void main(String[] args) {

		// El atributo PI es estático. No es necesario crear un objeto de la clase
		// Unidades para luego acceder a PI desde él.
		// Podemos acceder a PI simplemente poniendo el nombre de la clase (Unidades)
		// delante.
		System.out.println("El número pi es " + Unidades.PI);

		// Igualmente podemos acceder al atributo estático anteponiendo el nombre de la
		// clase (Unidades).
		// Cuantos litros son 50cl.
		System.out.println("50 cl son " + 50 * Unidades.centilitros + " litros");

		// Igualmente podemos acceder al atributo estático anteponiendo el nombre de la
		// clase (Unidades).
		// Cuantos metros son 2.5km
		System.out.println("2.5 km son " + 2.5 * Unidades.quilometros + " metros");

		// Comprobamos que al cambiar el atributo PI en un objeto, cambia en cualquier
		// otro objeto de la clase. Esto se debe a que PI es un atributo estático.

		Unidades u1 = new Unidades();
		Unidades u2 = new Unidades();

		u1.PI = 3.1416;

		// Al haber cambiado u1.PI, ha cambiado tambien u2.PI.
		System.out.println(u2.PI);

		// La forma correcta de acceder a atributos estáticos es poniendo delante el
		// nombre de la clase, para evitar malentendidos.
		Unidades.PI = 3.1416;

		// Llamamos al método areaCirculo(). Como es estático, podemos llamarlo a partir
		// del nombre de la clase. No es necesario crear un objeto Unidades y usarlo
		// para llamar al método.
		System.out.println("Área del círculo de radio 20 = " + Unidades.areaCirculo(20));
		

	}

}
