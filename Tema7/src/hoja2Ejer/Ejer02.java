package hoja2Ejer;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Ejer02 extends JFrame {

	public Ejer02() {

		super("Termostato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 400);

		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		JLabel lblTemperatura = new JLabel("Temperatura (ºC)");

		add(lblTemperatura);

		JSlider sldTemperatura = new JSlider(JSlider.VERTICAL, 0, 25, 17);
		sldTemperatura.setPaintLabels(true);
		sldTemperatura.setPaintTicks(true);
		sldTemperatura.setMajorTickSpacing(5);
		sldTemperatura.setMinorTickSpacing(1);

		add(sldTemperatura);
		add(lblTemperatura);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejer02 ventana = new Ejer02();

	}
}