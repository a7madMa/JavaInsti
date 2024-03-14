package prac1;

public class Musica extends Medio {

	public Musica(String nombre, double duracion, String artista, String estilo) {
		super(nombre, duracion);
		this.artista = artista;
		this.estilo = estilo;

	}

	private String artista;
	private String estilo;

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo...");

	}

}
