package prac2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diodo extends Componente {
	private double tensionInversa;

	public Diodo(double intensidadMaxima, double longitud, double tensionInversa) {
		super(intensidadMaxima, longitud);
		this.tensionInversa = tensionInversa;

	}

	@Override
	public void conectar() {
		System.out.println("Componente conectado");

	}

	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Intensidad Máxima:");

			System.out.println("Longitud: ");

			System.out.println("Tension Inversa:");
			double tensionInversa = entrada.nextDouble();

			// Acutalizamos los atributos aquí y de esa forma, si se produce cualquier error
			// no va a cambiar ninguno.
			setIntensidadMaxima(entrada.nextDouble());
			setLongitud(entrada.nextDouble());
			this.tensionInversa = tensionInversa;

		} catch (InputMismatchException ime) {
			System.out.println("¡ERROR!, tienes que poner un número!!!");
		} catch (Exception e) {
			e.printStackTrace();
			return;
			// El bloque finally se mostrará en todos los casos, como si da error como no.
		} finally {
			System.out.println("Fin de lectura de datos.");
		}

	}

}
