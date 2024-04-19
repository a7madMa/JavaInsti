package practica;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class HallOfFame extends JFrame {

	public HallOfFame() {

		super("Puntuación");
		setSize(390, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JLabel lblTexto = new JLabel("*** Hall of Fame ***");

		JList<String> lstPuntos = new JList<>();

		JScrollPane scrPuntos = new JScrollPane(lstPuntos);
		scrPuntos.setPreferredSize(new Dimension(345, 450));

		JButton btnNuevo = new JButton("Nuevo");
		JButton btnBorrar = new JButton("Borrar");

		add(lblTexto);
		add(scrPuntos);
		add(btnNuevo);
		add(btnBorrar);

		setLocationRelativeTo(null);
		setVisible(true);

		btnNuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String eleccion = JOptionPane.showInputDialog(null, "¿Nombre del jugador?", "Nuevo",
						JOptionPane.QUESTION_MESSAGE);
				if (eleccion != null && eleccion.trim().equals("")) {
					JOptionPane.showInputDialog(null, "¿Puntuación del jugador?", "Nuevo",
							JOptionPane.QUESTION_MESSAGE);
				}

			}
		});

		btnBorrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showConfirmDialog(null, "¿Seguro que quieres borrar todos los datos de jugadores?",
						"Advertencia", JOptionPane.QUESTION_MESSAGE);
			}
		});
	}

	public static void main(String[] args) {
		new HallOfFame();
	}
}