package ejemplosMaps;

import java.util.Objects;

public class Cliente {

	private String apellidos;
	private String nombre;
	private String dni;

	public Cliente(String apellidos, String nombre, String dni) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Cliente cliente = (Cliente) obj;

		if (apellidos.equals(cliente.apellidos) && nombre.equals(cliente.nombre) && dni.equals(cliente.dni)) {
			return true;

		}
		return false;

	}

	@Override
	public String toString() {

		return nombre + " " + apellidos + " (" + dni + ")";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
