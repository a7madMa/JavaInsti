package Conversor;

public class Conversion {

	private final static double KM_A_MILLAS = 0.621371;

	private final static double MB_A_ATM = 0.000986923;

	private final static double CAL_A_JULIOS = 4.1868;
	
	
	public void Conversion() {
		
		
	}

	public static double millas(double km) {
		return KM_A_MILLAS * km;

	}

	public double Km(double millas) {

		return KM_A_MILLAS * millas;
	}

	public static double atmosferas(double milibares) {

		return MB_A_ATM * milibares;
	}

	public double milibares(double atmosferas) {

		return MB_A_ATM * atmosferas;
	}

	public static double julios(double calorias) {

		return CAL_A_JULIOS * calorias;
	}

	public double calorias(double julios) {

		return CAL_A_JULIOS * julios;
	}

}
