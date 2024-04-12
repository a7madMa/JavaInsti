package ejemplos1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo02JButton extends JFrame {

	public Ejemplo02JButton() {
		super("Concurso");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblPregunta = new JLabel("¿Cómo se escribe 11 en hexadeciaml?");
		JButton btnRespuestaA = new JButton("A");
		JButton btnRespuestaB = new JButton("B");
		JButton btnRespuestaC = new JButton("C");
		JButton btnRespuestaD = new JButton("D");
		JButton btnRespuestaE = new JButton("E");

		JLabel lblBoton = new JLabel("Pulsa la respuesta correcta.");

		add(lblPregunta);

		add(btnRespuestaA);
		add(btnRespuestaB);
		add(btnRespuestaC);
		add(btnRespuestaD);
		add(btnRespuestaE);

		add(lblBoton);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejemplo02JButton ventana = new Ejemplo02JButton();
	}

}
