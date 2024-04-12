package ejemplos1;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo08ImagenIcon extends JFrame {

	public Ejemplo08ImagenIcon() {

		super("Botones con imágen");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		ImageIcon imgReproductor = new ImageIcon("iconos/39.png");
		JButton btnReproductor = new JButton(imgReproductor);

		ImageIcon imgCheck = new ImageIcon("iconos/94.png");
		JButton btnCheck = new JButton(imgCheck);

		add(btnReproductor);
		add(btnCheck);

		setVisible(true);
	}

	public static void main(String[] args) {

		Ejemplo08ImagenIcon ventana = new Ejemplo08ImagenIcon();

	}
}
