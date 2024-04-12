package ejemplos1;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ejemplo03JTextField extends JFrame {

	public Ejemplo03JTextField() {
		super("Datos personales");
		setSize(250, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblNombre = new JLabel("Nombre:");
		JTextField txtNombre = new JTextField(20);

		JLabel lblEdad = new JLabel("Edad:");
		JTextField txtEdad = new JTextField(20);

		JLabel lblSatisfecho = new JLabel("¿Estás satisfecho con el programa?");

		JRadioButton rdbSatisfecho = new JRadioButton("Satisfecho", true);
		JRadioButton rdbNoSatisfecho = new JRadioButton("No Satisfecho");

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbSatisfecho);
		grupo.add(rdbNoSatisfecho);

		JCheckBox chkAceptacion = new JCheckBox("He léido y acepto los términos", true);
		JCheckBox chkPubli = new JCheckBox("Accepto recibir publicidad");

		JButton btnGuardar = new JButton("Guardar");

		add(lblNombre);
		add(txtNombre);
		add(lblEdad);
		add(txtEdad);
		add(lblSatisfecho);
		add(rdbSatisfecho);
		add(rdbNoSatisfecho);
		add(btnGuardar);
		add(chkAceptacion);
		add(chkPubli);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejemplo03JTextField ventana = new Ejemplo03JTextField();
	}

}
