package ejemplo15finalize;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos.
	String matricula;
	String marca;
	String modelo;
	String averia;
	int quilometros;

	// Constructor explícito que tome los cinco valores de los atributos.
	Coche(String matricula, String marca, String modelo, String averia, int quilometros) {

		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.averia = averia;
		this.quilometros = quilometros;

	}

	// Constructor explícito que toma la matrícula, marca y modelo y deje el resto
	// de valores sin modificar.

	Coche(String matricula, String marca, String modelo) {

		this(matricula, marca, modelo, null, 0);
//		
//		this.matricula = matricula;
//		this.marca = marca;
//		this.modelo = modelo;
//		

	}

// leeDatos() pregunta al usuario los valores de las propiedades y los lee desde 
// la terminal.

	void leeDatos() {

		Scanner entrada = new Scanner(System.in);
		System.out.println("INTRODUCCION DE DATOS DEL COCHE");

		System.out.print("\nEscribe la matrícula del coche: ");
		matricula = entrada.nextLine();

		System.out.print("Escribe la marca del coche: ");
		marca = entrada.nextLine();

		System.out.print("Escribe el modelo del coche: ");
		modelo = entrada.nextLine();

		System.out.print("Describe la avería del coche: ");
		averia = entrada.nextLine();

		System.out.print("Escribe los quilómetros del coche: ");
		quilometros = entrada.nextInt();

	}

	// Muestra todas las propiedades del objeto.

	void mostrar() {

		System.out.println("\n**** DATOS DEL COCHE ****");
		System.out.println("\nMatrícula: " + matricula);

		System.out.println("Marca: " + marca);

		System.out.println("modelo: " + modelo);

		System.out.println("Avería: " + averia);

		System.out.println("Quilómetros: " + quilometros);

	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("ELIMINANDO OBJETO DE LA MEMORIA");

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAveria() {
		return averia;
	}

	public void setAveria(String averia) {
		this.averia = averia;
	}

	public int getQuilometros() {
		return quilometros;
	}

	public void setQuilometros(int quilometros) {
		this.quilometros = quilometros;
	}

}
