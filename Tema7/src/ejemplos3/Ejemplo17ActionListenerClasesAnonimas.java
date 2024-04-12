package ejemplos3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo17ActionListenerClasesAnonimas extends JFrame {

	private JButton btnAzul;
	private JButton btnRojo;
	private JLabel lblMensaje;
	private JLabel lblPulsaciones;
	private int numPulsaciones = 0;

	public Ejemplo17ActionListenerClasesAnonimas() {

		super("Elige tu destino");
		setSize(250, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		btnAzul = new JButton("Azul");
		btnAzul.setBackground(new Color(150, 150, 255));
		btnAzul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblMensaje.setText("Has tomado la pastilla azul");
				actualizaPulsaciones();

			}
		});

		btnRojo = new JButton("Roja");
		btnRojo.setBackground(Color.RED);

		btnRojo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				lblMensaje.setText("Has tomado la pastilla Roja");
				actualizaPulsaciones();

			}

		});

		lblMensaje = new JLabel("¡Elige una pastilla!");
		lblPulsaciones = new JLabel("");

		add(btnAzul);
		add(btnRojo);
		add(lblMensaje);
		add(lblPulsaciones);

		setVisible(true);

	}

	private void actualizaPulsaciones() {
		numPulsaciones++;
		lblPulsaciones.setText("Has pulsado " + numPulsaciones + " Veces.");
	}

	public static void main(String[] args) {
		new Ejemplo17ActionListenerClasesAnonimas();
	}

}