package prac1;

public class Video extends Medio {

	public Video(String nombre, double duracion, String director, String idioma) {
		super(nombre, duracion);
		this.director = director;
		this.idioma = idioma;

	}

	private String director;
	private String idioma;

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo...");

	}

}
