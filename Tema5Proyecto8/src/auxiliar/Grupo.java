package auxiliar;

import java.util.Scanner;

public class Grupo {

	private int id;
	private String nivel;
	private int curso;
	private String clase;
	
	public Grupo() {
		
	}
	
	public Grupo(int id, String nivel, int curso, String clase) {
		this.id = id;
		this.nivel = nivel;
		this.curso = curso;
		this.clase = clase;
	}
	
	public String toString() {
		return "\nID: " + id + "\nClase: " + curso + "º " + nivel + " " + clase;
	}
	
	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDime el id de la clase: ");
		id = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Dime el nivel: ");
		nivel = entrada.nextLine();
		
		System.out.print("Dime el curso: ");
		curso = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Dime la clase: ");
		clase = entrada.nextLine();
		
		entrada.close();
	}
	
}