package inicio;

import auxiliar.Alumno;
import auxiliar.Grupo;
import instituto.Instituto;

public class Inicio {

	public static void main(String[] args) {

		// Creamos un objeto Grupo paśandole los datos en el constructor.
		Grupo grupo1 = new Grupo(12, "ESO", 3, "B");

		System.out.println(grupo1.toString());

		// Creamos un objeto Grupo sin pasarle ningún dato, y luego usamos leeDatos()
		// para inicializar todos sus atributos.
		Grupo grupo2 = new Grupo();

//		grupo2.leeDatos();
//		System.out.println(grupo2.toString());

		// Creamos un objeto Alumno pasándole los datos al constructor (le asignamos el
		// grupo 3º B).
		Alumno alumno1 = new Alumno(100, "Pérez López", "Luis", grupo1);
//		System.out.println(alumno1.toString());

		// Creamos un objeto Alumno llamando al método leeDatos().
//		Alumno alumno2 = new Alumno();
//		alumno2.leeDatos();
//		System.out.println(alumno2.toString());

		Alumno alumno3 = new Alumno(101, "Martínez López", "Carlos", grupo1);
		Alumno alumno4 = new Alumno(102, "Aragónes Fernández", "Marta", grupo1);
		Alumno alumno5 = new Alumno(103, "Rodríguez Juan", "Laura", grupo1);

		Instituto insti = new Instituto();

		insti.addAlumno(alumno1);
		insti.addAlumno(alumno3);
		insti.addAlumno(alumno4);

		insti.muestraAlumnos();

		insti.delAlumno(100);
		insti.muestraAlumnos();

		insti.delAlumno(50);
		insti.muestraAlumnos();

		insti.addAlumno(alumno5);
		insti.muestraAlumnos();

		System.out.println("Hay " + insti.numAlumnos() + " alumnos.");

		System.out.println("EL alumno con número de expediente 50 está en la posición " + insti.buscaAlumno(103) + ".");

	}

}