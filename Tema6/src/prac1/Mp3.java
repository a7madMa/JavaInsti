package prac1;

public class Mp3 extends Musica implements Guardable {

	public Mp3(String nombre, double duracion, String artista, String estilo, int modo) {
		super(nombre, duracion, artista, estilo);
		this.modo = modo;
	}

	private int modo;

	public boolean guardar() {
		System.out.println("Guardando...");
		return true;
	}

}
