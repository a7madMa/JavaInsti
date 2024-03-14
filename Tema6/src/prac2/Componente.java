package prac2;

public abstract class Componente {

	private double intensidadMaxima;
	private double longitud;

	public Componente(double intensidadMaxima, double longitud) {
		this.setIntensidadMaxima(intensidadMaxima);
		this.setLongitud(longitud);

	}

	public abstract void conectar();

	public void setIntensidadMaxima(double intensidadMaxima) {
		this.intensidadMaxima = intensidadMaxima;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

}
