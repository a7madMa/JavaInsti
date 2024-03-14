package Ejemplo17ActionEvent;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo16ActionEvent2 extends JFrame implements ActionListener {

	private JLabel lblMensaje;

	public Ejemplo16ActionEvent2() {

		super("Eventos");
		setSize(400, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JButton btnPulsar = new JButton("Púlsame");
		btnPulsar.addActionListener(this);
		btnPulsar.addActionListener(new Ejemplo15ActionListener());

		lblMensaje = new JLabel("Aún no has pulsado el botón");

		add(btnPulsar);
		add(lblMensaje);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo16ActionEvent2();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		lblMensaje.setText("¡Bien Pulsado!");

	}

}