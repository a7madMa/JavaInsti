package ejemplos1;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Ejemplo10JList extends JFrame {

	public Ejemplo10JList() {

		super("Países");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JLabel lblPais = new JLabel("Elige tu país preferido");

		String paises[] = { "España", "Francia", "Reino Unido", "Italia", "Bélgica", "Holanda", "Luxemburgo" };

		JList<String> lstPais = new JList<>(paises);
		JScrollPane scrPais = new JScrollPane(lstPais);
		scrPais.setPreferredSize(new Dimension(150, 80));

		add(lblPais);
		add(scrPais);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo10JList();
	}

}
