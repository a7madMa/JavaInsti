package ejemplo09Persona;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable persona1, de tipo Persona, y le asignamos un objeto de
		// tipo Persona. Usamos el constructor y así evitamos asignar valor a cada
		// atributo por separado.
		Persona persona1 = new Persona("Sánchez", "Mario", "22100100T", "10/10/1980");

		// Queremos mostrar algunos datos de persona1.
		System.out.println("Nuestra persona se llama " + persona1.getNombre() + " " + persona1.getApellidos() + ".");
		System.out.println("Nació el " + persona1.getFechaNacimiento() + ".");

		// Podemos cambiar cualquier propiedad.
		persona1.setApellidos("Sánchez Pérez");
		System.out.println("Nuestra persona se llama " + persona1.getNombre() + " " + persona1.getApellidos() + ".");

		// Podemos crear tantos objetos Persona como necesitemos.
		Persona persona2 = new Persona("Martínez López", "María");

		System.out.println("Nuestra persona 2 se llama " + persona2.getNombre() + " " + persona2.getApellidos() + ".");

		// Al crear persona2 no le dimos un valor a fechaNacimiento, por lo que será
		// null.
		System.out.println("María nació el " + persona2.getFechaNacimiento() + ".");

		// Creamos otras tres personas.
		Persona persona3 = new Persona("Lozano Peris", "Ana María", "10100100Y", "10/10/1990");
		Persona persona4 = new Persona("Mas Calatayud", "Pedro");
		Persona persona5 = new Persona("40123123G");

		persona3.mostrar();
		persona4.mostrar();
		persona5.mostrar();

		// Para que la siguiente instrucción funcione, es necesario haber escrito el
		// constructor implícito, ya que éste desaparece en el momento que creamos a
		// mano un constructor explícito.
		Persona persona6 = new Persona();

	}

}