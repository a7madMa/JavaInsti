package prac1;

public class Main {

	public static void main(String[] args) {

		// Al poner Media como abstracto no podemos crear un objeto en la Clase Main
//		Medio m1 = new Medio();

		Medio m1 = new Mp3("Bandit", 180, "Don Toliver", "Hip-Hop", 1);

		m1.reproducir();
		((Mp3) m1).guardar();
		
		Guardable g1 = new Ogg("Carmen",1000,"Bizet","Ópera",2);
		
		

	}
}
