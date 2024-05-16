package ejemplosMaps;

public class Propietario {

	private String dni;
	private String nombre;
	private String apellidos;

	public Propietario(String dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	// Métodos:
	public String toString() {
		return "\nDNI: " + dni + "\nNombre: " + nombre + "\nApellidos: " + apellidos;
	}

	// getters y setters:
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}