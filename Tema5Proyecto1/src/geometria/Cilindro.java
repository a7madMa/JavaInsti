package geometria;

public class Cilindro {

	private int altura;
	private int radio;
	private final double PI = 3.141593;

	public Cilindro() {

	}

	public Cilindro(int altura, int radio) {

		this.altura = altura;
		this.radio = radio;
	}

	// MÉTODOS DE ACCESO (GETTERS Y SETTERS).

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double getArea() {

		return 2 * PI * radio * altura + 2 * PI * radio * radio;
	}

	public double getVolumen() {

		return PI * radio * radio * altura;
	}

	@Override
	public String toString() {
		return "Cilindro [altura=" + altura + ", radio=" + radio + ", PI=" + PI + "]";
	}

}
