package ejercicios;
public class Cuenta {
	private String numero;
	private float saldo;

	public Cuenta(String numero, float saldo) {
    	this.numero = numero;
    	this.saldo = saldo;
	}

	public String getNumero() {
    	return numero;
	}

	public void setNumero(String numero) {
    	this.numero = numero;
	}

	public float getSaldo() {
    	return saldo;
	}

	public void setSaldo(float saldo) {
    	this.saldo = saldo;
	}

	public void ingresarDinero(double cantidad) {
    	saldo += cantidad;
	}

	public void extraerDinero(double cantidad) {
    	if ((saldo - cantidad) < 0) {
   		 throw new java.lang.ArithmeticException ("Saldo negativo");
    	} else {
   		 saldo -= cantidad;
    	}
	}


	public void mostrarInformacion() {
    	System.out.println("Número de cuenta: " + numero);
    	System.out.println("Saldo actual: $" + saldo);
	}

}
