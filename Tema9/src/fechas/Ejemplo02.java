package fechas;

import java.time.LocalDateTime;

public class Ejemplo02 {

	public static void main(String[] args) {

		// Instantes de tiempo:

		LocalDateTime instante1 = LocalDateTime.parse("2024-05-22T17:20:00");
		System.out.println(instante1);

		LocalDateTime instante2 = LocalDateTime.of(2024, 5, 22, 15, 10, 0);
		System.out.println(instante2);

		LocalDateTime instante3 = LocalDateTime.now();
		System.out.println(instante3);
	}

}
