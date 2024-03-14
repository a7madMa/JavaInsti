package ejemplos1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Ejemplo09ToolBar extends JFrame {

	public Ejemplo09ToolBar() {

		super("Barra de herramientas");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JToolBar tlbHerramientas = new JToolBar();

		ImageIcon imgNuevo = new ImageIcon("iconos/1.png");
		JButton btnNuevo = new JButton(imgNuevo);
		tlbHerramientas.add(btnNuevo);

		ImageIcon imgAbrir = new ImageIcon("iconos/52.png");
		JButton btnAbrir = new JButton(imgAbrir);
		tlbHerramientas.addSeparator();
		tlbHerramientas.add(btnAbrir);

		ImageIcon imgGuardar = new ImageIcon("iconos/22.png");
		JButton btnGuardar = new JButton(imgGuardar);
		tlbHerramientas.addSeparator();
		tlbHerramientas.add(btnGuardar);

		add(tlbHerramientas, BorderLayout.NORTH);

		// Añadimos un panel a la parte central de la vetana, dentro del cual aparecerá
		// un JLabel y un JScrollPane.
		JPanel panelCentro = new JPanel();
		panelCentro.setLayout(new FlowLayout());
		JLabel lblComentarios = new JLabel("Comentarios");
		JTextArea txtComentarios = new JTextArea();
		JScrollPane scrComentarios = new JScrollPane(txtComentarios);
		scrComentarios.setPreferredSize(new Dimension(450, 200));

		panelCentro.add(lblComentarios);
		panelCentro.add(scrComentarios);

		add(panelCentro, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {

		new Ejemplo09ToolBar();
	}
}
