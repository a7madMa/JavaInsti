package notasIncompleto;

public class Nota {

	private String titulo;
	private String descripcion;
// hola que tal
	public Nota(String titulo, String descripcion) {
		this.titulo = titulo;
		this.descripcion = descripcion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
