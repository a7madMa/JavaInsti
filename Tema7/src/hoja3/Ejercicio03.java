package hoja3;

import java.awt.Color;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JProgressBar;

public class Ejercicio03 extends JFrame {

	public Ejercicio03() {

		super("Parámetros críticos");

		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JProgressBar prg1 = new JProgressBar(0, 100);

		prg1.setValue(20);
		prg1.setStringPainted(true);
		prg1.setForeground(Color.RED);
		prg1.setBackground(Color.WHITE);

		JLabel lblCombustible = new JLabel("Combustible");

		JProgressBar prg2 = new JProgressBar(0, 100);

		prg2.setValue(75);
		prg2.setStringPainted(true);
		prg2.setForeground(new Color(8, 158, 43));
		prg2.setBackground(Color.WHITE);

		JLabel lblMotor1 = new JLabel("Presión motor 1");

		JProgressBar prg3 = new JProgressBar(0, 100);

		prg3.setValue(75);
		prg3.setStringPainted(true);
		prg3.setForeground(new Color(8, 158, 43));
		prg3.setBackground(Color.WHITE);

		JLabel lblMotor2 = new JLabel("Presión motor 2");

		add(prg1);
		add(lblCombustible);
		add(prg2);
		add(lblMotor1);
		add(prg3);
		add(lblMotor2);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejercicio03();

	}

}