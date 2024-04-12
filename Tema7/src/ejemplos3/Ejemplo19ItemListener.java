package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo19ItemListener extends JFrame implements ItemListener {

	private JComboBox<String> cmbAsignaturas;
	private JLabel lblPreferida;

	public Ejemplo19ItemListener() {

		super("Asignaturas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		JLabel lblAsignaturas = new JLabel("Elige tu asignatura favorita");

		cmbAsignaturas = new JComboBox<String>();
		cmbAsignaturas.addItem("Selecciona una");
		cmbAsignaturas.addItem("Programación");
		cmbAsignaturas.addItem("Formación y orientación Laboral");
		cmbAsignaturas.addItem("Entornos de desarollo");
		cmbAsignaturas.addItem("Base de datos");
		cmbAsignaturas.addItem("Sistemas informáticos");
		cmbAsignaturas.addItem("Lenguajes de marcas");

		cmbAsignaturas.addItemListener(this);

		lblPreferida = new JLabel();

		add(lblAsignaturas);
		add(cmbAsignaturas);
		add(lblPreferida);

		setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {

//		String seleccionado = (String) cmbAsignaturas.getSelectedItem();
//
//		if (seleccionado.equals("Selecciona una")) {
//			lblPreferida.setText("");
//
//		} else {
//			lblPreferida.setText("Has seleccionado " + seleccionado);
//		}

		int seleccionado = cmbAsignaturas.getSelectedIndex();

		if (seleccionado == 0) {
			lblPreferida.setText("");

		} else {
			String cadena = cmbAsignaturas.getItemAt(seleccionado);
			lblPreferida.setText("Has seleccionado " + cadena);

		}

	}

	public static void main(String[] args) {

		new Ejemplo19ItemListener();
	}

}
