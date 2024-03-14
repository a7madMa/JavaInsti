package ejemplo02Vechiculo;

// Como prueba hemos hecho esta clase de tipo final.
// Esto significa que no podemos crear clases hijas.

public final class Moto extends Vehiculo {

	private boolean baul;

	public Moto(String matricula, int capacidad, double peso, String marca, String modelo, int potencia, boolean baul) {
		super(matricula, capacidad, peso, marca, modelo, potencia);

		this.baul = baul;

	}

	@Override
	public String toString() {

		String tieneBaul = (baul == true) ? "Sí" : "No";

		return super.toString() + "\nBaul: " + tieneBaul;
	}

	@Override
	public void matricular() {

	}

}
