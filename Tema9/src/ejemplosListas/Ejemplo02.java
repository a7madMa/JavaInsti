package ejemplosListas;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo02 {

	public static void main(String[] args) {

		// Creamos un ArrayList que va a almacenar objetos Cliente

		List<Cliente> clientes = new ArrayList<>();

		// Creamos unos clientes

		Cliente cliente1 = new Cliente("Martínez", "Luís", "2200177H");
		Cliente cliente2 = new Cliente("Fernández", "Amaya", "18922811D");
		Cliente cliente3 = new Cliente("López", "Marta", "16177399A");

		// Los añadimos al ArrayList.

		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);

		// Mostramos los valores del ArrayList.

		for (Cliente cliente : clientes) {
			System.out.println(cliente.toString());

		}

		// Queremos eliminar a Amaya Fernandez.

		clientes.remove(new Cliente("Fernández", "Amaya", "18922811D"));

		System.out.println();
		for (Cliente cliente : clientes) {
			System.out.println(cliente.toString());

		}

		// Algunas pruebas con el equals() de Cliente.
		// Primer Caso --->
//		System.out.println(cliente1.equals(cliente1));

		// Segundo Caso --->
//		System.out.println(cliente1.equals(null));

		// Tercer Caso --->
//		System.out.println(cliente1.equals("Pulpo"));

		
		
		
	}
}
