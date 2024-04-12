package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.List;

public class Prueba extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba frame = new Prueba();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Prueba() {
		setTitle("Pruebas con WindowBuilder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);

		JMenuItem itemNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(itemNuevo);

		JSeparator separator = new JSeparator();
		mnArchivo.add(separator);

		JMenuItem itemAbrir = new JMenuItem("Abrir");
		mnArchivo.add(itemAbrir);

		JMenuItem itemCerrar = new JMenuItem("Cerrar");
		mnArchivo.add(itemCerrar);

		JMenuItem itemSalir = new JMenuItem("Salir");
		itemSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);
			}
		});
		mnArchivo.add(itemSalir);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 0, 70, 15);
		contentPane.add(lblNombre);

		textNombre = new JTextField();
		textNombre.setBounds(12, 22, 114, 19);
		contentPane.add(textNombre);
		textNombre.setColumns(10);

		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(12, 53, 70, 15);
		contentPane.add(lblApellidos);

		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(12, 80, 114, 19);
		contentPane.add(textApellidos);

		JScrollPane scrComentarios = new JScrollPane();
		scrComentarios.setBounds(188, 22, 227, 181);
		contentPane.add(scrComentarios);

		JTextArea txtComentarios = new JTextArea();
		txtComentarios.setText("Deja un comentario");
		scrComentarios.setViewportView(txtComentarios);

		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(12, 105, 114, 19);
		contentPane.add(lblProvincia);

		JComboBox<String> cmbProvincias = new JComboBox<String>();
		cmbProvincias.setModel(
				new DefaultComboBoxModel(new String[] { "Alicante", "Albacete", "Murcia", "Islas Baleares" }));
		cmbProvincias.setBounds(12, 124, 114, 24);
		contentPane.add(cmbProvincias);
	}
}
