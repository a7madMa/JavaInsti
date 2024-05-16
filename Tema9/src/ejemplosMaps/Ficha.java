package ejemplosMaps;

public class Ficha {

	private int anyoNacimiento;
	private String nacionalidad;
	private String visa;

	public Ficha(int anyoNacimiento, String nacionalidad, String visa) {

		this.anyoNacimiento = anyoNacimiento;
		this.nacionalidad = nacionalidad;
		this.visa = visa;
	}

	@Override
	public String toString() {

		return "Año de nacimiento: " + anyoNacimiento + "\nNacionalidad: " + nacionalidad + "\nVisa: " + visa;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

}
