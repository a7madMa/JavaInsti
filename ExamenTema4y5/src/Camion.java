
public class Camion {

	private int numPaquetes;
	private Paquete paquetes[];

	public Camion(int capacidad) {
		numPaquetes = 0;

		paquetes = new Paquete[capacidad];

	}

	public void addPaquete(Paquete paquete) {

		if (numPaquetes < paquetes.length) {
			paquetes[numPaquetes] = paquete;
			numPaquetes++;

		}

	}

	public void showPaquetes() {
		System.out.println("\nCarga del camión:");
		for (int i = 0; i < numPaquetes; i++) {
			System.out.println(paquetes[i].toString());

		}

	}

	public void delPaquete(int codPaquete) {

		int pos = searchPaquete(codPaquete);

		if (pos != -1) {

			for (int i = 0; i < numPaquetes; i++) {
				paquetes[i] = paquetes[i + 1];
			}
			numPaquetes--;

		}

	}

	public int searchPaquete(int codPaquete) {

		for (int i = 0; i < numPaquetes; i++) {

			if (paquetes[i].getCodigoPaquete() == codPaquete) {
				return i;

			}

		}
		return -1;

	}

	public void showPaquetes(String ciudad) {

		System.out.println("\nPaquetes destinados a " + ciudad + ":");
		for (int i = 0; i < numPaquetes; i++) {
			if (paquetes[i].getDireccion().getCiudad().equals(ciudad)) {
				System.out.println(paquetes[i].toString());
			}

		}

	}

}
