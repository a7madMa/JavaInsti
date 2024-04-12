package ejemplo05Interfaces;

public class Rectangulo implements Figura2D, Mostrable {

	private int base, altura;

	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void mostrar() {
		System.out.println("Rectángulo de base " + base + " y altura " + altura);

	}

	@Override
	public double perimetro() {

		return 2 * base + 2 * altura;
	}

	@Override
	public double area() {

		return base * altura;
	}

}
