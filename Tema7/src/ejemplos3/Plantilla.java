package ejemplos3;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Plantilla extends JFrame {

	public Plantilla() {

		super("");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		setVisible(true);

	}

}
