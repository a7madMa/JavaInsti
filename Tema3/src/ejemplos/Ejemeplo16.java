package ejemplos;

public class Ejemeplo16 {

	public static void main(String[] args) {
		
		String alturas[][] = {

				{ "Manuel Díaz", "1.90"}, 
				{ "Rosa Sánchez", "1.70" }, 
				{ "María de la rosa", "1.65"},
				{ "Jorge Luis Martínez", "1.72"}

		};
		
		
		// Ejemplo de uso de printf
		
		float temp = 10;
		float humedad= 60;
		System.out.printf("Hoy hace %f grados y hay una humedad de %f %% \n" , temp , humedad);
		
		
		System.out.printf("\n%-20s %4s \n","Nombre", "Estatura");
		System.out.printf("%-20s %4s \n","====================", "========");
		for (int fila = 0; fila < alturas.length; fila++) {
			
			System.out.printf("%-20s %4s \n", alturas[fila][0], alturas[fila][1]);
			
		}
		


		

	}

}
