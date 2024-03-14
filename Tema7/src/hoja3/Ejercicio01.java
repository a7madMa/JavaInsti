package hoja3;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JToolBar;

public class Ejercicio01 extends JFrame {

	public Ejercicio01() {

		super("Planificador personal");

		setSize(400, 200);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JToolBar tlbHerramientas = new JToolBar();

		ImageIcon imgNuevo = new ImageIcon("iconos/1.png");

		JButton btnNuevo = new JButton(imgNuevo);

		tlbHerramientas.add(btnNuevo);

		ImageIcon imgGrafico = new ImageIcon("iconos/11.png");

		JButton btnGrafico = new JButton(imgGrafico);

		tlbHerramientas.add(btnGrafico);

		ImageIcon imgGuardar = new ImageIcon("iconos/22.png");

		JButton btnGuardar = new JButton(imgGuardar);

		tlbHerramientas.add(btnGuardar);

		ImageIcon imgInteres = new ImageIcon("iconos/3.png");

		JButton btnInteres = new JButton(imgInteres);

		tlbHerramientas.add(btnInteres);

		ImageIcon imgCalendario = new ImageIcon("iconos/44.png");

		JButton btnCalendario = new JButton(imgCalendario);

		tlbHerramientas.addSeparator();

		tlbHerramientas.add(btnCalendario);

		ImageIcon imgCamara = new ImageIcon("iconos/66.png");

		JButton btnCamara = new JButton(imgCamara);

		tlbHerramientas.add(btnCamara);

		ImageIcon imgTV = new ImageIcon("iconos/67.png");

		JButton btnTV = new JButton(imgTV);

		tlbHerramientas.add(btnTV);

		ImageIcon imgAjustes = new ImageIcon("iconos/73.png");

		JButton btnAjustes = new JButton(imgAjustes);

		tlbHerramientas.addSeparator();

		tlbHerramientas.add(btnAjustes);

		add(tlbHerramientas, BorderLayout.NORTH);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejercicio01();

	}

}