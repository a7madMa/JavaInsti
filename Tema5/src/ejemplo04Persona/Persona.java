package ejemplo04Persona;

public class Persona {

	// Propiedades o atributos de la clase.
	String apellidos;
	String nombre;
	String dni;
	String fechaNacimiento;

	// MÉTODOS.

	// Constructor implícito de la clase. ( no lleva void) (siempre lleva el nombre
	// de la propia clase y comienza en MAYUS)
	Persona() {

	}

	// Constructor explícito. Nos permite pasarle argumentos.
	// this se refiere al objeto que estamos creando.
	// this.apellidos se refiere al atributo apellidos. por ejemplo.
	Persona(String apellidos, String nombre, String dni, String fechanacimiento) {

		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechanacimiento;

	}

	// Constructor explícito. Le pasamos los apellidos y el nombre de la persona
	// y dejamos los otros datos con valores por defecto.
	Persona(String apellidos, String nombre) {

		this(apellidos, nombre, "Sin DNI", null);

	}

	// Constructor explícito. Le pasamos el dni y dejamos el resto de atributos con
	// valor null.
	Persona(String dni) {
		this.dni = dni;
		
		
		// lo mismo podría hacerse con "this(null, null, dni, null);"
	}

	// Muestra en la terminal todos los valores de los atributos.
	void mostrar() {
		System.out.println("\nNombre completo: " + apellidos + " " + nombre + ".");
		System.out.println("DNI:" + dni + ".");
		System.out.println("Fecha de nacimiento: " + fechaNacimiento + ".");

	}

	// tieneDni() devuelve true si la persona tiene dni y false si no lo tiene.

	boolean tieneDni() {

		if (dni == null || dni.equals(" Sin DNI")) {
			return false;

		}
		return true;

	}

	// anyoNacimiento() devuelve el año de nacimiento (suponiendo que la fecha esta
	// en formato está
	// en formato dd/mm/aaaa.

	String anyoNacimiento() {
		if (fechaNacimiento == null) {
			return null;
		}
		return fechaNacimiento.substring(6);

	}

}
