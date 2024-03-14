package auxiliar;

import java.util.Scanner;

public class Alumno {

	private int numExpediente;
	private String apellidos;
	private String nombre;
	private Grupo grupo;

	public Alumno() {

	}

	public Alumno(int numExpediente, String apellidos, String nombre, Grupo grupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}

	public String toString() {
		return "\n(" + numExpediente + ") " + nombre + " " + apellidos + "\nGrupo:" + grupo.toString();
	}

	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("****ALUMNO****");

		System.out.print("Número de expediente: ");
		numExpediente = entrada.nextInt();

		entrada.nextLine();

		System.out.print("Apellidos: ");
		apellidos = entrada.nextLine();

		System.out.print("Nombre: ");
		nombre = entrada.nextLine();

		grupo = new Grupo();

		grupo.leeDatos();

		entrada.close();

	}

	public int getNumExpediente() {
		return numExpediente;
	}

}