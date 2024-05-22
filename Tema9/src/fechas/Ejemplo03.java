package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ejemplo03 {

	public static void main(String[] args) {

		// Comparaciones de fechas.

		LocalDate fecha1 = LocalDate.parse("2024-01-01");
		LocalDate fecha2 = LocalDate.parse("2024-06-01");

		System.out.println("¿fecha1 es anterior a fecha2? " + fecha1.isAfter(fecha2));

		// Comparaciones de horas.

		LocalTime hora1 = LocalTime.parse("15:10");
		LocalTime hora2 = LocalTime.parse("17:55");

		System.out.println("¿hora1 es anterior a hora2? " + hora1.isAfter(hora2));

		// Comparaciones de instantes (fecha y hora juntas).

		LocalDateTime instante1 = LocalDateTime.parse("2024-05-22T17:34:00");
		LocalDateTime instante2 = LocalDateTime.of(fecha1, hora1);

		System.out.println("¿instante1 es anterior a instante2?" + instante1.isBefore(instante2));
	}

}
