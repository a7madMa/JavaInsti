package ejemplos1;

import javax.swing.UIManager;

public class Ejemplo05DetectarLookAndFeels {

	public Ejemplo05DetectarLookAndFeels() {
		UIManager.LookAndFeelInfo[] laf = UIManager.getInstalledLookAndFeels();
		for (int i = 0; i < laf.length; i++) {
			System.out.println("Class name: " + laf[i].getClassName());
			System.out.println("Name: " + laf[i].getName() + "\n");
		}
	}

	public static void main(String[] arguments) {
		Ejemplo05DetectarLookAndFeels dialog = new Ejemplo05DetectarLookAndFeels();
	}
}
