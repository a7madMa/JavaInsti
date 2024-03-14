package prac2;

public class Condensador extends Componente implements Invertible{
	private double Capacidad;

	public Condensador(double intensidadMaxima, double longitud, double capacidad) {
		super(intensidadMaxima, longitud);
		this.Capacidad = capacidad;

	}



	@Override
	public void conectar() {
		System.out.println("Componente conectado");

	}

	@Override
	public void girar() {
		System.out.println("Componente girado");

		
	}

}
