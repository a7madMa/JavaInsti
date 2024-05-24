package multiplesVentanas;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {

	private JLabel lblNombre;
	private String nombre;
	private String apellido;

	public VentanaPrincipal() {

		super("Ventana principal");
		setSize(400, 210);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblTuNombre = new JLabel("Tu nombre es:");
		lblTuNombre.setPreferredSize(new Dimension(350, 30));

		nombre = "-";
		apellido = "-";

		lblNombre = new JLabel(nombre + " " + apellido);
		lblNombre.setPreferredSize(new Dimension(350, 60));
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 40));

		JButton btnModificar = new JButton("Modificar nombre");
		btnModificar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				abrirVentana();
			}
		});

		add(lblTuNombre);
		add(lblNombre);
		add(btnModificar);

		setVisible(true);

	}

	private void abrirVentana() {

		VentanaSecundaria ventana = new VentanaSecundaria();
		ventana.setLocationRelativeTo(this);

		ventana.setIdentidad(new Identidad(nombre, apellido));

		ventana.SetCallback(new Callback() {

			@Override
			public void actualizarVentana(Identidad identidad) {

				nombre = identidad.getNombre();
				apellido = identidad.getApellido();

				lblNombre.setText(apellido + " " + nombre);

			}
		});

	}

	public static void main(String[] args) {
		new VentanaPrincipal();
	}

}