package hoja2Ejer;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejer03 extends JFrame {

	public Ejer03() {

		super("Comentarios");
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JLabel lblComentarios = new JLabel("Deja un comentario");

		JTextArea txtComentarios = new JTextArea();
		JScrollPane scrComentarios = new JScrollPane(txtComentarios);
		scrComentarios.setPreferredSize(new Dimension(450, 200));

		JButton btnEnviar = new JButton("Enviar");

		add(lblComentarios);
		add(scrComentarios);
		add(btnEnviar);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer03();
	}
}
