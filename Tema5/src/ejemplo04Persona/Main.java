package ejemplo04Persona;

import java.util.TooManyListenersException;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable person1, de tipo Persona y le asignamos un objeto de
		// tipo Persona.
		Persona persona1 = new Persona("Sánchez", "Mario","22210010T", "10/10/1980" );

		
		// Queremos mostrar algunos datos de persona1.

		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");
		System.out.println("Nació el " + persona1.fechaNacimiento + ".");

		// Podemos cambiar cualquier propiedad.
		persona1.apellidos = "Sánchez Pérez";

		System.out.println("\nNuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");

		// Podemos crear tantos objetos Persona como necesitemos.

		Persona persona2; // Declaramos la variable de tipo persona
		persona2 = new Persona(); // Le asignamos un nuevo objeto de tipo persona

		persona2.apellidos = "Martínez López";
		persona2.nombre = "María";
		System.out.println("\nNuestra persona se llama " + persona2.nombre + " " + persona2.apellidos + ".");

		// Cuando no damos un valor a una propiedad ésta recibe un valor por defecto.
		// Si es un objeto, valdrá null, si es número, valrá 0 y si es un boolean,
		// valdrá false.
		System.out.println("María nació el " + persona2.fechaNacimiento + ".");

		// Podemos llamar al método mostrar() de Persona.
		persona1.mostrar();
		persona2.mostrar();

		// Probamos el método tieneDni().
		if (persona1.tieneDni()) {
			System.out.println(persona1.nombre + " tiene DNI");

		} else {
			System.out.println(persona1.nombre + " no tiene DNI");
		}

		if (persona2.tieneDni()) {
			System.out.println(persona2.nombre + " tiene DNI");

		} else {
			System.out.println(persona2.nombre + " no tiene DNI");
		}

		// Probamos el método anyoNacimiento().
		if (persona2.anyoNacimiento() == null) {
			System.out.println(persona2.nombre + " no tiene fecha de nacimiento");
		} else {
			System.out.println(persona2.nombre + " nació el año " + persona1.fechaNacimiento + ".");
		}
		
		// Creamos otra persona.
		Persona persona3 = new Persona("Lozano Peris","Ana María","35196564R","09/09/1976");
		
		Persona persona4 = new Persona("Mas Calatyud","Pedro");
		
		persona3.mostrar();
		persona4.mostrar();
		
		Persona persona5 = new Persona("67898723F");
		
		persona5.mostrar();
		
		// Para que la siguiente instrucción funcione, es necesario haber escrito el 
		// constructor implícito, ya que éste desaparece en el momento que creamos a
		// mano un constructor explícito.
		Persona persona6 = new Persona();
		
		
		
	
	}

}
