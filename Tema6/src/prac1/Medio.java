package prac1;

public abstract class Medio {

	private String nombre;
	private double duracion;

	public Medio(String nombre, double duracion) {
		this.nombre = nombre;
		this.duracion = duracion;

	}

	public abstract void reproducir();

}
