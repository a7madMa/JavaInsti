package hoja4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejer01 extends JFrame implements ActionListener {

	private JLabel lblImagen;
	private JButton btnWinslow;
	private JButton btnBlackRain;
	private JButton btnAsalto;
	private JButton btnBlade;

	public Ejer01() {

		super("Fotogramas");
		setSize(1200, 900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JPanel panelSuperior = new JPanel();
		panelSuperior.setLayout(new FlowLayout());

		btnBlackRain = new JButton("Black Rain");
		btnWinslow = new JButton("El caso Winslow");
		btnAsalto = new JButton("Asalto al distrito 13");
		btnBlade = new JButton("Blade Runner");

		panelSuperior.add(btnBlackRain);
		panelSuperior.add(btnWinslow);
		panelSuperior.add(btnAsalto);
		panelSuperior.add(btnBlade);

		// Panel Inferior

		JPanel panelInferior = new JPanel();
		panelInferior.setLayout(new FlowLayout());

		lblImagen = new JLabel(new ImageIcon("iconos/Black_Rain.jpg"));

		panelInferior.add(lblImagen);

		// Ventana

		add(panelSuperior, BorderLayout.NORTH);
		add(panelInferior, BorderLayout.CENTER);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton btnPulsado = (JButton) e.getSource();

		if (btnPulsado == btnBlackRain) {

			lblImagen.setIcon(new ImageIcon("/pelis/Black_Rain.jpg"));

		} else if (btnPulsado == btnWinslow) {

			lblImagen.setIcon(new ImageIcon("/pelis/winslow.jpeg"));

		} else if (btnPulsado == btnAsalto) {

			lblImagen.setIcon(new ImageIcon("/pelis/asalto.jpeg"));

		} else {

			lblImagen.setIcon(new ImageIcon("/pelis/Blade.jpeg"));

		}

	}

	public static void main(String[] args) {
		new Ejer01();
	}

}
