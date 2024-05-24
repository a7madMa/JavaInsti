package fechas;

import java.time.LocalDate;

public class Ejemplo06 {

	public static void main(String[] args) {

		LocalDate fecha = LocalDate.now();

		System.out.println(fecha.toString());

		System.out.println("Estamos a " + fecha(fecha));

	}

	private static String fecha(LocalDate fecha) {

		final String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
				"octubre", "noviembre", "diciembre" };

		int anyo = fecha.getYear();
		int mes = fecha.getMonthValue();
		int dia = fecha.getDayOfMonth();

		return dia + " de " + meses[mes - 1] + " del año " + anyo;

	}

}