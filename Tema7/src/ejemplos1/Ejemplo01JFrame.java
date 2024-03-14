package ejemplos1;

import java.time.OffsetDateTime;

import javax.swing.JFrame;

public class Ejemplo01JFrame extends JFrame {

	public Ejemplo01JFrame() {

		super("Hola, Mundo!");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocationRelativeTo(null);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejemplo01JFrame ejemplo = new Ejemplo01JFrame();

	}

}
