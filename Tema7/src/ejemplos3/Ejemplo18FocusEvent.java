package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ejemplo18FocusEvent extends JFrame implements FocusListener {

	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JLabel lblPromedio;

	public Ejemplo18FocusEvent() {

		super("Media aritmética");
		setSize(250, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		txtNum1 = new JTextField("0", 5);
		txtNum1.addFocusListener(this);

		txtNum2 = new JTextField("0", 5);
		txtNum2.addFocusListener(this);

		txtNum3 = new JTextField("0", 5);
		txtNum3.addFocusListener(this);

		lblPromedio = new JLabel("Promedio = 0");

		add(txtNum1);
		add(txtNum2);
		add(txtNum3);
		add(lblPromedio);

		setVisible(true);

	}

	@Override
	public void focusGained(FocusEvent arg0) {

		try {

			int num1 = Integer.parseInt(txtNum1.getText());
			int num2 = Integer.parseInt(txtNum2.getText());
			int num3 = Integer.parseInt(txtNum3.getText());

			double promedio = (num1 + num2 + num3) / 3.0;
			lblPromedio.setText("Promedio = " + promedio);

		} catch (NumberFormatException nfe) {
			lblPromedio.setText("Error");
		}

	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// No usaremos este método
	}

	public static void main(String[] args) {

		new Ejemplo18FocusEvent();
	}

}
