package multiplesVentanas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaSecundaria extends JFrame {

	private JTextField txtNombre;
	private JTextField txtApellido;
	private Callback callback;

	public VentanaSecundaria() {

		super("Ventana Secundaria");
		setSize(270, 200);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblNombre = new JLabel("Nombre:");
		txtNombre = new JTextField(20);

		JLabel lblApellido = new JLabel("Apellido:");
		txtApellido = new JTextField(20);

		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				callback.actualizarVentana(new Identidad(txtNombre.getText(), txtApellido.getText()));
				dispose();

			}
		});

		add(lblNombre);
		add(txtNombre);
		add(lblApellido);
		add(txtApellido);
		add(btnAceptar);

		setVisible(true);

	}

	public void setIdentidad(Identidad identidad) {

		txtNombre.setText(identidad.getNombre());
		txtApellido.setText(identidad.getApellido());

	}

	public void SetCallback(Callback callback) {
		this.callback = callback;

	}

	public static void main(String[] args) {
		new VentanaSecundaria();
	}

}