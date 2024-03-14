package ejemplos3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo17ActionListener extends JFrame implements ActionListener {

	private JButton btnAzul;
	private JButton btnRojo;
	private JLabel lblMensaje;
	private JLabel lblPulsaciones;

	public Ejemplo17ActionListener() {

		super("Elige tu destino");
		setSize(250, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		btnAzul = new JButton("Azul");
		btnAzul.setBackground(new Color(100, 100, 255));

		btnAzul.addActionListener(this);

		btnRojo = new JButton("Roja");
		btnRojo.setBackground(Color.RED);

		btnRojo.addActionListener(this);

		lblMensaje = new JLabel("¡Elige una pastilla!");

		lblPulsaciones = new JLabel("Contador de pulsaciones");

		add(btnAzul);
		add(btnRojo);
		add(lblMensaje);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btnPulsado = (JButton) e.getSource();

		if (btnPulsado == btnAzul) {
			lblMensaje.setText("Has tomado la pastilla azul");

		} else {
			lblMensaje.setText("Has tomado la pastilla Roja");

		}
	}

	public static void main(String[] args) {
		new Ejemplo17ActionListener();
	}

}