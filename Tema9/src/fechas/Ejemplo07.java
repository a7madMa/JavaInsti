package fechas;

import java.time.LocalTime;

public class Ejemplo07 {

	public static void main(String[] args) {

		LocalTime hora = LocalTime.now();

		System.out.println(hora12(hora));

	}

	// Método que devuelve la hora en formato de 12 horas.
	private static String hora12(LocalTime tiempo) {

		int hora = tiempo.getHour();
		int minutos = tiempo.getMinute();

		String franja = "AM";

		if (hora > 12) {
			hora = hora - 12;
			franja = "PM";
		}

		return hora + ":" + minutos + " " + franja;

	}

}