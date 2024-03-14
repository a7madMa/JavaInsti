package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor[] autores;
	private static int anyoActual;

	public Libro(String titulo, String isbn, Autor[] autores) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
	}

	public Libro(String titulo) {
		this.titulo = titulo;
		// this(titulo, null, null);

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor[] getAutores() {
		return autores;
	}

	public void setAutores(String autor, Autor[] autores) {
		this.autores = autores;
	}

	public int getAnyoActual() {
		return anyoActual;
	}

	public static void setAnyoActual(int anyoActual) {
		// anyoActual es estático y vale lo mismo en cualquier objeto Libro.
		// En vez de usar this.anyoActual, que daría la impresión de que podemos
		// modificar
		// el atributo de forma distinta para objetos distintos.
		// Por eso, usamos el nombre de la clase: Libro.anyoActual.
		Libro.anyoActual = anyoActual;
	}

	@Override
	public String toString() {

		if (autores.length == 1) {
			return "Libro [titulo: " + titulo + ", isbn: " + isbn + ", Autor: " + autores[0].getNombre()
					+ ", añoActual: " + anyoActual + "]";
		}

		return "Libro [titulo: " + titulo + ", isbn: " + isbn + ", Autor: Varios autores" + ", añoActual: " + anyoActual
				+ "]";
	}

}
