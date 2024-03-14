package ejemplos;

public class Ejemplo09 {

	public static void main(String[] args) {

		System.out.println(
				"El precio final de un artículo que vale 100 euros y se le aplica un descuento del 30% y un IVA del 21% es " + precioVenta(100, 30, 21));

	}

	// Devuelve el precio de venta de un objeto dado su precio inicial, su descuento
	// y el IVA aplicado.
	static double precioVenta(double precio, double descuento, double iva) {

		double precioConDescuento = precio - (precio * descuento) / 100;
		double precioConIva = precioConDescuento + precioConDescuento * iva / 100;

		return precioConIva;

	}

}
