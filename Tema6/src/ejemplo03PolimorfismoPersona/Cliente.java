package ejemplo03PolimorfismoPersona;

public class Cliente extends Persona {

	private String visa;

	public Cliente(String apellidos, String nombre, String dni, String visa) {
		// Pasamos los apellidos, nombre y dni como argumentos al constructor de la
		// clase padre, (Persona).
		super(apellidos, nombre, dni);

		// Inicializamos a mano el resto de atributos o propiedades que no son
		// heredados.
		this.visa = visa;

	}
	@Override
	public void mostrar() {
		System.out.println("\n" + getNombre() + " " + getApellidos() + ", con DNI " + getDni() + ".");
		System.out.println("Visa: " + visa + ".");

	}

}
