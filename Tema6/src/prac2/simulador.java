package prac2;

public class simulador {

	public static void main(String[] args) {

		Componente co1 = new Condensador(120, 12, 2);
		Condensador c1 = new Condensador(150, 52, 125);
		Diodo d1 = new Diodo(100, 50, 120);
		Led l1 = new Led(200, 50, 100, "Rojo");

		d1.leeDatos();
		System.out.println(d1.toString());

		Componente componente2 = d1;
		d1 = l1;

	}

}
