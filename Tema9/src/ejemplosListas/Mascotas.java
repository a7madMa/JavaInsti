package ejemplosListas;

import java.util.Objects;

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

	// TODO: Crear un método equals que compare dos mascotas mirando sus tres
	// atributos:

	public String getNombre() {
		return nombre;
	}

	public String getRaza() {
		return raza;
	}

	public int getEdad() {
		return edad;
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

		// Casting de objeto obj para poder después comparar:
		Mascotas mascotas = (Mascotas) obj;

		// Comparación:
		return edad == mascotas.edad && Objects.equals(nombre, mascotas.nombre) && Objects.equals(raza, mascotas.raza);

	}

	public static void main(String[] args) {

		// Creamos dos objetos de tipo Mascotas con los mismos atributos
		Mascotas mascota1 = new Mascotas("Jazz", "Labrador", 10);
		Mascotas mascota2 = new Mascotas("Jazz", "Labrador", 10);

		// Probamos si los objetos son iguales usando el método equals()
		boolean sonIguales = mascota1.equals(mascota2);
		System.out.println("¿Las mascotas son iguales? " + sonIguales); // Debería salir "true"

		// Creamos dos objetos de tipo Mascotas con diferentes atributos
		Mascotas mascota3 = new Mascotas("Funky", "Pitbull", 3);
		Mascotas mascota4 = new Mascotas("Jazz", "Labrador", 10);

		// Probamos si los objetos son iguales usando el método equals
		sonIguales = mascota3.equals(mascota4);
		System.out.println("¿Las mascotas son iguales? " + sonIguales); // Debería salir "false"

	}

}