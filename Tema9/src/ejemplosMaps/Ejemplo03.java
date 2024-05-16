package ejemplosMaps;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo03 {

	public static void main(String[] args) {

		Map<Integer, String> coches = new HashMap<>();

		coches.put(1, "Seat Panda");
		coches.put(2, "Peugeot 3008");
		System.out.println(coches.toString());

	}

}
