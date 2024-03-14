package biblioteca;

public class Autor {

	private String nombre;
	private String email;
	private int anyonacimiento;

	public Autor(String nombre, String email, int anyonacimiento) {

		this.nombre = nombre;
		this.email = email;
		this.anyonacimiento = anyonacimiento;
	}

	public Autor(String nombre) {
		this(nombre, "Unknown", 0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAnyonacimiento() {
		return anyonacimiento;
	}

	public void setAnyonacimiento(int anyonacimiento) {
		this.anyonacimiento = anyonacimiento;
	}

	@Override
	public String toString() {
		return "Autor [nombre: " + nombre + ", email: " + email + ", anyonacimiento: " + anyonacimiento + "]";
	}

}
