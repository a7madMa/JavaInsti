package hoja2Ejer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JuegoAdivinaNumero extends JFrame implements ActionListener {
	private int numeroSecreto;
	private int intentosDisponibles;
	private JTextField textField;
	private JLabel labelResultado;

	public JuegoAdivinaNumero() {
		super("Adivina el número");

		// Generar un número aleatorio entre 1 y 100
		numeroSecreto = (int) (Math.random() * 100) + 1;
		intentosDisponibles = 5;

		// Configuración del frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		setLayout(new GridLayout(3, 1));

		// Componentes
		JLabel labelInstrucciones = new JLabel("Adivina un número entre 1 y 100:");
		textField = new JTextField();
		JButton botonAdivinar = new JButton("Adivinar");
		labelResultado = new JLabel("");

		// Agregar componentes al frame
		add(labelInstrucciones);
		add(textField);
		add(botonAdivinar);
		add(labelResultado);

		// Agregar listener al botón
		botonAdivinar.addActionListener(this);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int intento = Integer.parseInt(textField.getText());
			intentosDisponibles--;

			if (intento == numeroSecreto) {
				labelResultado.setText("¡Correcto! Has adivinado el número.");
				textField.setEditable(false);
			} else if (intento < numeroSecreto) {
				labelResultado.setText("El número secreto es mayor. Intentos restantes: " + intentosDisponibles);
			} else {
				labelResultado.setText("El número secreto es menor. Intentos restantes: " + intentosDisponibles);
			}

			if (intentosDisponibles == 0 && intento != numeroSecreto) {
				labelResultado.setText("¡Te has quedado sin intentos! El número secreto era: " + numeroSecreto);
				textField.setEditable(false);
			}
		} catch (NumberFormatException ex) {
			labelResultado.setText("Por favor, ingresa un número válido.");
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new JuegoAdivinaNumero());
	}
}
