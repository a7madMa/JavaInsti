package practica;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class HallOfFame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	
	 

	JList lstContenido;

	DefaultListModel model;

	final String NOMBRE_ARCHIVO = "ficheros/jugadores.txt";

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					HallOfFame frame = new HallOfFame();

					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	

	public HallOfFame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 293, 404);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("*** Hall of Fame ***");

		lblTitulo.setBounds(62, 0, 131, 15);

		contentPane.add(lblTitulo);

		model = new DefaultListModel();

		lstContenido = new JList(model);
		lstContenido.setBounds(12, 27, 258, 277);

		contentPane.add(lstContenido);

		JButton btnNuevo = new JButton("Nuevo");

		btnNuevo.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				nuevoJugador();

			}

		});

		btnNuevo.setBounds(56, 316, 78, 25);

		contentPane.add(btnNuevo);

		JButton btnBorrar = new JButton("Borrar");

		btnBorrar.addActionListener(new ActionListener() {

			@Override

			public void actionPerformed(ActionEvent e) {

				borrarArchivo();

			}

		});

		btnBorrar.setBounds(146, 316, 87, 25);

		contentPane.add(btnBorrar);

		comprobacion();
		cargarJugadores();

	}

	public class Jugador {

		private String nombre;
		private int puntuacion;

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getPuntuacion() {
			return puntuacion;
		}

		public void setPuntuacion(int puntuacion) {
			this.puntuacion = puntuacion;
		}

		public Jugador(String nombre, int puntuacion) {
			super();
			this.nombre = nombre;
			this.puntuacion = puntuacion;
		}

	}

	

	private void nuevoJugador() {

		int puntuacion;

		String nombre = JOptionPane.showInputDialog(null, "¿Nombre del jugador?", "Nuevo",

				JOptionPane.QUESTION_MESSAGE);

		if (nombre == null || nombre.trim().equals("")) {

			return;

		}

		String puntuacionString = JOptionPane.showInputDialog(null, "¿Puntuación del jugador?", "Nuevo",

				JOptionPane.QUESTION_MESSAGE);
		puntuacion = Integer.parseInt(puntuacionString);
		model.addElement(nombre + "..." + puntuacion + " puntos.\n");
		Jugador nuevoJugador = new Jugador(nombre, puntuacion);
		guardarJugador(nuevoJugador);

	}

	



	public void guardarJugador(Jugador jugador) {
		try {

			FileWriter archivo = new FileWriter(NOMBRE_ARCHIVO, true);

			BufferedWriter buffer = new BufferedWriter(archivo);

			buffer.write(jugador.getNombre() + "," + jugador.getPuntuacion() + "\n");

			buffer.close();

		} catch (IOException e) {

			JOptionPane.showConfirmDialog(null, "Error de E/S", "Error", JOptionPane.CLOSED_OPTION,
					JOptionPane.WARNING_MESSAGE);
		}
	}

	
	public void cargarJugadores() {
		try {
			BufferedReader bufferLectura = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));

			String fila = bufferLectura.readLine();

			while (fila != null) {
				String[] textoSeparado = fila.split(",");
				model.addElement(textoSeparado[0] + "..." + textoSeparado[1] + " puntos.");
				fila = bufferLectura.readLine();

			}

			bufferLectura.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showConfirmDialog(null, "No se ha encontrado el archivo", "Error", JOptionPane.CLOSED_OPTION,
					JOptionPane.WARNING_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showConfirmDialog(null, "Error de E/S", "Error", JOptionPane.CLOSED_OPTION,
					JOptionPane.WARNING_MESSAGE);
		}
	}

	

	public void borrarArchivo() {

		int borrar = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres borrar todos los datos de jugadores?",

				"Advertencia", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (borrar == JOptionPane.CANCEL_OPTION) {

			JOptionPane.showConfirmDialog(null, "Operación cancelada. No se ha borrado ningún dato.", "Mensaje",

					JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);

		}

		model.clear();

		File archivoCreado = new File(NOMBRE_ARCHIVO);

		archivoCreado.delete();

	}

	public void comprobacion() {
		File crearArchivo = new File(NOMBRE_ARCHIVO);
		BufferedWriter buffer;
		if (crearArchivo.exists()) {
			return;
		} else {
			try {
				buffer = new BufferedWriter(new FileWriter(crearArchivo));
				JOptionPane.showConfirmDialog(null,
						"No se han encontrado datos guardados de jugadores. Se creará un archivo nuevo.", "Mensaje",
						JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);

			} catch (IOException e) {
				JOptionPane.showConfirmDialog(null, "Error de E/S", "Error", JOptionPane.CLOSED_OPTION,
						JOptionPane.WARNING_MESSAGE);
			}
		}

	}
}