package ejemplos1;

import javax.swing.JOptionPane;

public class Ejemplo06PanelesDialogo {

	public static void main(String[] args) {

//		JOptionPane.showMessageDialog(null, "El programa se va a cerrar por un error inesperado.");
//
//		JOptionPane.showMessageDialog(null, "El programa se va a cerrar por un error inesperado.", "Ejemplo 06",
//				JOptionPane.ERROR_MESSAGE);

//		JOptionPane.showConfirmDialog(null, "¿Quieres guardar los cambios?");

//		int eleccion = JOptionPane.showConfirmDialog(null, "¿Quieres guardar los cambios?", "Ejemplo 06",
//				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

//		if (eleccion == JOptionPane.YES_OPTION) {
//			System.out.println("Guardando los cambios...");
//		} else {
//			System.out.println("Cambios no guardados.");
//		}

		String dni = JOptionPane.showInputDialog(null, "Escribe tu DNI:", "DNI", JOptionPane.INFORMATION_MESSAGE);
		if (dni != null && !dni.trim().equals("")) {
			System.out.println("Tu DNI es " + dni);
		} else {
			System.out.println("No has proporcionado tu DNI.");
		}
	}

}