package ejemplos1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ejemplo12JMenuBar extends JFrame {

	public Ejemplo12JMenuBar() {

		super("Menús");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		// Creamos el JMenu Archivo.

		JMenu menuArchivo = new JMenu("Archivo");

		JMenuItem itemNuevo = new JMenuItem("Nuevo");
		JMenuItem itemAbrirArchivo = new JMenuItem("Abrir archivo...");
		JMenuItem itemAbrirProyecto = new JMenuItem("Abrir proyectos desde el sistema de archivos...");
		JMenuItem itemArchivosRecientes = new JMenuItem("Archivos recientes");

		menuArchivo.add(itemNuevo);
		menuArchivo.add(itemAbrirArchivo);
		menuArchivo.add(itemAbrirProyecto);
		menuArchivo.add(itemArchivosRecientes);

		// Creamos el JMenu Editar.

		JMenu menuEditar = new JMenu("Editar");

		JMenuItem itemDeshacer = new JMenuItem("Deshacer");
		JMenuItem itemRehacer = new JMenuItem("Rehacer");
		JMenuItem itemCortar = new JMenuItem("Cortar");
		JMenuItem itemCopiar = new JMenuItem("Copiar");

		menuEditar.add(itemDeshacer);
		menuEditar.add(itemRehacer);
		menuEditar.addSeparator();
		menuEditar.add(itemCortar);
		menuEditar.add(itemCopiar);

		// Añadimos todos los JMenus a la barra de menús.

		JMenuBar barraMenu = new JMenuBar();

		barraMenu.add(menuArchivo);
		barraMenu.add(menuEditar);

		setJMenuBar(barraMenu);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo12JMenuBar();
	}

}
