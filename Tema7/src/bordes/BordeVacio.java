package bordes;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BordeVacio extends JFrame {
	public static void main(String[] args) {
		new BordeVacio();
	}

	public BordeVacio() {
		super("Bordes vacíos");
		setSize(270, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JPanel panel = (JPanel) this.getContentPane();
		panel.setBorder(BorderFactory.createEmptyBorder(40, 0, 0, 0));
		panel.setBackground(Color.GREEN);

		JLabel lblNombre = new JLabel("Nombre completo");
		JTextField txtNombre = new JTextField(15);

		add(lblNombre);
		add(txtNombre);
		setVisible(true);
	}
}