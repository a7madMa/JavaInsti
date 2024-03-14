package ejemplo01Persona;

public class Main {

	public static void main(String[] args) {

//		Persona p1 = new Persona("López Martínez", "Juan", "10100100Y");
//		p1.mostrar();

//		Empleado emple1 = new Empleado();
//		emple1.mostrar();

		Cliente cliente1 = new Cliente("Pérez ortiz", "Rubén", "20100100R", "9012-1211-1732-1230");
		cliente1.mostrar();

		Directivo directivo1 = new Directivo("Rodríguez", "Miguel", "10200200R", 51, 200);

		directivo1.mostrar();
		

		

	}

}
