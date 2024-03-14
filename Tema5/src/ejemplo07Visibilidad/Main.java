package ejemplo07Visibilidad;

import ejemplo08Visibilidad.Persona;

public class Main {

	public static void main(String[] args) {

		// La clase Coche está en el mismo paquete que esta clase Main.
		Coche coche1 = new Coche("1000FRD", "Renault", "Clio");

		// No podemos acceder a coche1.matricula ya que lo hemos hecho private.

		// Podemos acceder a coche1.marca ya que no le hemos puesto ningún modificador y
		// por tanto, tiene visibilidad en todo el paquete.
		coche1.marca = "Seat";

		// Podemos acceder a coche1.modelo ya que le hemos puesto modificador "public" y
		// por tanto, tiene visibilidad en todo el proyecto.
		coche1.modelo = "Toledo";

		// La clase persona está en un paquete distinto que esta clase Main.
		// Para poder crear un objeto Persona he tenido que poner el constructor como
		// "public".
		Persona persona1 = new Persona();

		// No podemos acceder a persona1.apellidos ya que lo hemos hecho "private".

		// No podemos acceder a persona1.nombre ya que no tiene ningún modificador y
		// sólo es visible desde su mismo paquete.
		

		// Podemos acceder a persona1.dni ya que le hemos puesto modificador "public" y
		// por tanto, tiene visibilidad en todo el proyecto.
		persona1.dni = "20200200E";
		

	}

}
