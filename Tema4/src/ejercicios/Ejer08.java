package ejercicios;

import java.util.Scanner;

/*Escribe un programa que pida los coeficientes a, b y c de una ecuación de segundo grado
(ax2+bx+c=0). A continuación mostrará las dos soluciones de la ecuación. Usa dos métodos que
tomen como parámetros los coeficientes a, b y c, y devuelvan cada uno una solución de la ecuación.
 */
public class Ejer08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);


		System.out.println("Introduce el valor de a:");

		double a = entrada.nextDouble();


		System.out.println("Introduce el valor de b:");

		double b = entrada.nextDouble();


		System.out.println("Introduce el valor de c:");

		double c = entrada.nextDouble();

		System.out.println("El resultado (con b -) de la ecuación de segundo grado es " + ecuacionNegativa(a, b, c)

		+ ". Con los coeficientes a = " + a + ", b = " + b + " y b = " + a + "." );

		System.out.println("El resultado (con b +) de la ecuación de segundo grado es " + ecuacionPositiva(a, b, c)

		+ ". Con los coeficientes a = " + a + ", b = " + b + " y b = " + a + "." );


		}


		static double ecuacionPositiva(double a, double b, double c) {


		return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

		//return Math.round((((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a)) * 100) / 100.0;


		}


		static double ecuacionNegativa(double a, double b, double c) {


		return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

		//return Math.round((((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a)) * 100) / 100.0;


		}

		}