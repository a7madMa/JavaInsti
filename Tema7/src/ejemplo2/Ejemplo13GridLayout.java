package ejemplo2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo13GridLayout extends JFrame {

	public Ejemplo13GridLayout() {

		super("Stream Deck");
		setSize(600, 310);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new GridLayout(2, 4, 10, 10));

		JButton btnStream = new JButton("Stream");
		JButton btnCamara = new JButton("Cámara");
		JButton btnSubirVolumen = new JButton("Subir volumen");
		JButton btnBajarVolumen = new JButton("Bajar volumen");
		JButton btnPublicidad = new JButton("Publicidad");
		JButton btnSilenciar = new JButton("Silenciar micro ");
		JButton btnEscena1 = new JButton("Escena1");
		JButton btnEscena2 = new JButton("Escena2");

		add(btnStream);
		add(btnCamara);
		add(btnSubirVolumen);
		add(btnBajarVolumen);
		add(btnPublicidad);
		add(btnSilenciar);
		add(btnEscena1);
		add(btnEscena2);

		setLocationRelativeTo(null);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo13GridLayout();
	}

}
