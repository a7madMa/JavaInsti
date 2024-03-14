package ejemplo09Persona;

public class Persona {

	// Propiedades o atributos de la clase.
	private String apellidos;
	private String nombre;
	private String dni;
	private String fechaNacimiento;

	// METÓDOS.

	// Constructor implícito de la clase.
	public Persona() {

	}

	// Constructor explícito. Nos permite pasarle argumentos.
	// this se refiere al objeto que estamos creando.
	// this.apellidos se refiere al atributo apellidos, por ejemplo.
	public Persona(String apellidos, String nombre, String dni, String fechaNacimiento) {

		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;

	}

	// Constructor explícito. Le pasamos los apellidos y el nombre de la persona,
	// y dejamos los otros datos con valores por defecto.
	public Persona(String apellidos, String nombre) {

		// Podemos llamar al constructor anterior usando la palabra clave "this".
		this(apellidos, nombre, "Sin DNI", null);

	}

	// Constructor explícito. Le pasamos el dni y dejamos el resto de atributos con
	// valor null.
	public Persona(String dni) {

		this.dni = dni;

		// Lo mismo podría hacerse con "this(null, null, dni, null)";

	}

	// Muestra en la terminal todos los valores de los atributos.
	public void mostrar() {
		System.out.println("\nNombre completo: " + apellidos + ", " + nombre + ".");
		System.out.println("DNI: " + dni + ".");
		System.out.println("Fecha de nacimiento: " + fechaNacimiento + ".");
	}

	// tieneDni() devuelve true si la persona tiene dni y false si no lo tiene.
	public boolean tieneDni() {
		if (dni == null || dni.equals("Sin DNI")) {
			return false;
		}
		return true;
	}

	// anyoNacimiento() devuelve el año de nacimiento (suponiendo que la fecha está
	// en formato dd/mm/aaaa).
	public String anyoNacimiento() {
		if (fechaNacimiento == null) {
			return null;
		}
		return fechaNacimiento.substring(6);
	}

	// MÉTODOS DE ACCESO

	// Método que nos permite leer el atributo apellidos.
	public String getApellidos() {
		return apellidos;
	}

	// Método que nos permite escribir el atributo apellidos.
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	// Método que nos permite leer el atributo nombre.
	public String getNombre() {
		return nombre;
	}

	// Método que nos permite dar un valor al atributo nombre.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Método que nos permite leer el atributo dni.
	public String getDni() {
		return dni;
	}

	// Método que nos permite dar un valor al atributo dni.
	public void setDni(String dni) {
		this.dni = dni;
	}

	// Método que nos permite leer el atributo fechaNacimiento.
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	// Método que nos permite dar un valor al atributo fechaNacimiento.
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento =  fechaNacimiento;
	}

}