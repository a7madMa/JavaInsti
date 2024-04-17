package ejemplos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class Ejemlpo08FileChooser extends JFrame {

	private JLabel lblArchivoElegido;

	public Ejemlpo08FileChooser() {

		super("Lector de archivos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(new FlowLayout().LEFT));
		setLocationRelativeTo(null);

		JButton btnElegirArchivo = new JButton("Elegir archivo");

		lblArchivoElegido = new JLabel("");

		add(btnElegirArchivo);
		add(lblArchivoElegido);

		btnElegirArchivo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				elegirArchivo();

			}

		});

		setVisible(true);

	}

	private void elegirArchivo() {

		JFileChooser eleccion = new JFileChooser();

		int resultado = eleccion.showOpenDialog(null);

		if (resultado == eleccion.CANCEL_OPTION) {
			return;

		}

		File nombreArchivo = eleccion.getSelectedFile();

		// Alternativa:
		// String nombreArchivo = eleccion.getSelectedFile().toString();
		lblArchivoElegido.setText(nombreArchivo.toString());

	}

	public static void main(String[] args) {

		new Ejemlpo08FileChooser();

	}

}
