package electrodomesticos;

public class Inicio {

	public static void main(String[] args) {

		// Creamos un objeto Motor paśandole los datos en el constructor.
		Motor motor1 = new Motor(1, "Bosh", "V3");
		Motor motor2 = new Motor(2, "Samsung", "A1");

		Lavadora lavadora1 = new Lavadora(201, motor1, "Balay", 450);
		Lavadora lavadora2 = new Lavadora(202, motor2, "Edesa", 410);

		Taller taller1 = new Taller();

		System.out.println("--- Primera Lavadora ---");

		System.out.println(lavadora1.toString());
		System.out.println();

		// Añadimos la lavadora
		taller1.addLavadora(lavadora1);
		taller1.addLavadora(lavadora2);

		// Mostramos la lavadora
		taller1.listaLavadoras();

		// Borramos la lavadora
		taller1.borraLavadora(5);
		System.out.println();
		taller1.listaLavadoras();

		// Volvemos a añadir
		taller1.addLavadora(lavadora2);

		// Buscamos la lavadora
		System.out.println("Posición de la lavadora en el array: " + taller1.buscaLavadora(5));

	}

}
