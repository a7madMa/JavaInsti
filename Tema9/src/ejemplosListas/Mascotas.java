package ejemplosListas;

public class Mascotas {

	private String nombre;
	private String raza;
	private int edad;

	public Mascotas(String nombre, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// TODO: Crear un método equals que compare dos mascotas mirando sus tres
	// atributos.
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
