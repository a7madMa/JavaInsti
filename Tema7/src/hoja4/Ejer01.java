package hoja4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejer01 extends JFrame {

	private JLabel lblImagen;

	public Ejer01() {

		super("Fotogramas");
		setSize(1200, 900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JPanel panelSuperior = new JPanel();
		panelSuperior.setLayout(new FlowLayout());

		JButton btnBlackRain = new JButton("Black Rain");
		JButton btnWinslow = new JButton("El caso Winslow");
		JButton btnAsalto = new JButton("Asalto al distrito 13");
		JButton btnBlade = new JButton("Blade Runner");

		panelSuperior.add(btnBlackRain);
		panelSuperior.add(btnWinslow);
		panelSuperior.add(btnAsalto);
		panelSuperior.add(btnBlade);

		// Panel Inferior

		JPanel panelInferior = new JPanel();
		panelInferior.setLayout(new FlowLayout());

		lblImagen = new JLabel(new ImageIcon("iconos/Black_Rain.jpg"));
		ImageIcon imgBlackRain = new ImageIcon("iconos/Black_Rain.jpg");

		panelInferior.add(lblImagen);

		// Ventana

		add(panelSuperior, BorderLayout.NORTH);
		add(panelInferior, BorderLayout.CENTER);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer01();
	}

}
