package ejemplos1;

import javax.swing.JOptionPane;

public class Ejemplo06PanelesDialogo {

	public static void main(String[] args) {

//		JOptionPane.showMessageDialog(null, "El programa se va a cerrar por un error inesperado.");
//
//		JOptionPane.showMessageDialog(null, "El programa se va a cerrar por un error inesperado", "Ejemplo 06",
//				JOptionPane.ERROR_MESSAGE);

		JOptionPane.showConfirmDialog(null, "¿Quieres guardar los cambios?");

		JOptionPane.showConfirmDialog(null, "¿Quieres guardar los cambios?", "Ejemplo 06", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.WARNING_MESSAGE);

	}

}
