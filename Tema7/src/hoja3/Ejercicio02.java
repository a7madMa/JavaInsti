package hoja3;

import java.awt.Dimension;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JList;

import javax.swing.JScrollPane;

public class Ejercicio02 extends JFrame {

	public Ejercicio02() {

		super("Selección de modelo");

		setSize(400, 200);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		String[] marcas = { "Peugeot", "Volkswagen", "Renault", "Seat", "Ferrari", "Porsche", "Jaguar", "Dacia" };

		JList<String> lstMarcas = new JList(marcas);

		JScrollPane scrMarcas = new JScrollPane(lstMarcas);

		scrMarcas.setPreferredSize(new Dimension(100, 120));

		JLabel lblModelo = new JLabel("Modelo?");

		add(scrMarcas);

		add(lblModelo);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejercicio02();

	}

}