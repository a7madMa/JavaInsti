package ejemplo02Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche();

		coche1.matricula = "3567CMD";
		coche1.marca = "Mercedes-Benz";
		coche1.modelo = "Maybach Clase S";
		coche1.averia = "Aire acondicionado no funciona";
		coche1.quilometros = 50_000;

		Coche coche2 = new Coche();
		coche2.leeDatos();
		coche2.mostrar();

	}

}
