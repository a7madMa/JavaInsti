package multiplesVentanas;

public class Identidad {

	private String apellido;
	private String nombre;

	public Identidad(String apellido, String nombre) {

		this.apellido = apellido;
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
