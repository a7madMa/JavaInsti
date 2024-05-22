package fechas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ejemplo01 {

	public static void main(String[] args) {

		// Fechas:

		LocalDate fecha1 = LocalDate.parse("2024-05-20");
		System.out.println(fecha1.toString());

		// Segunda opción sin tener que poner el 0 del mes.

		LocalDate fecha2 = LocalDate.of(2024, 5, 20);
		System.out.println(fecha2.toString());

		// Fecha del dia actual.

		LocalDate fecha3 = LocalDate.now();
		System.out.println(fecha3.toString());

		// Horas:

		LocalTime tiempo1 = LocalTime.parse("15:10:00");
		System.out.println(tiempo1.toString());

		// Segunda opción sin tener que poner el 0 de los minutos ni segundos.
		LocalTime tiempo2 = LocalTime.of(15, 5, 0);
		System.out.println(tiempo2.toString());

		LocalTime tiempo3 = LocalTime.now();
		System.out.println(tiempo3.toString());

	}

}
