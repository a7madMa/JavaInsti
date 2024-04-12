package ejemplo2;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejemplo14GridLayout extends JFrame {

	public Ejemplo14GridLayout() {

		super("");
		setSize(500, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new GridLayout(1, 2));

		setLocationRelativeTo(null);

		// Parte izquierda.

		JPanel panelizq = new JPanel();
		panelizq.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lbltitulo = new JLabel("Título");
		JTextField txtTitulo = new JTextField(20);

		JLabel lblAutor = new JLabel("Autor");
		JTextField txtAutor = new JTextField(20);

		panelizq.add(lbltitulo);
		panelizq.add(txtTitulo);
		panelizq.add(lblAutor);
		panelizq.add(txtAutor);

		// Parte Derecha.

		JButton btnAlta = new JButton("Alta");

		// Ventana.
		add(panelizq);
		add(btnAlta);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo14GridLayout();
	}

}
