package ejemplo05Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche("3567CMD", "Mercedes-Benz", "Maybach Clase S", "Aire acondicionado no funciona",
				50_000);
		
		Coche coche2 = new Coche("3456MCV", "Rolls Royce","Phantom");
		
		coche2.mostrar();
		
		

	}

}
