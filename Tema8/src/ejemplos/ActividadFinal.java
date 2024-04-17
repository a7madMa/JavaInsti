package ejemplos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class ActividadFinal extends JFrame {

	private JTextArea txtArchivo;

	public ActividadFinal() {

		super("Lector");
		setSize(600, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(new FlowLayout().LEFT));
		setLocationRelativeTo(null);

		JMenuItem itemAbrir = new JMenuItem("Abrir");

		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.add(itemAbrir);

		JMenuBar BarraMenu = new JMenuBar();

		BarraMenu.add(menuArchivo);
		setJMenuBar(BarraMenu);

		txtArchivo = new JTextArea(600, 200);

		add(txtArchivo);

		setVisible(true);

		itemAbrir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				elegirArchivo();

			}
		});
	}

	private void elegirArchivo() {

		JFileChooser eleccion = new JFileChooser();

		int resultado = eleccion.showOpenDialog(null);

		if (resultado != JFileChooser.APPROVE_OPTION) {
			return;

		}
		File nombreArchivo = eleccion.getSelectedFile();

		txtArchivo.setText("");

		try {
			FileReader archivo = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(archivo);

			String linea = buffer.readLine();
			while (linea != null) {
				txtArchivo.setText(txtArchivo.getText() + linea + "\n");
				linea = buffer.readLine();
			}
			
			buffer.close();
		} catch (IOException ioe) {
			System.out.println("Error de E/S: " + ioe.toString());
		}

	}

	public static void main(String[] args) {
		new ActividadFinal();
	}

}
