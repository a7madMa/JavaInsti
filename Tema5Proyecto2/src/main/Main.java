package main;

import java.util.Scanner;

import conversion.conversor;

public class Inicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nConversor de Kilometros a Millas:");
        System.out.println("=================================");
        System.out.println("\nDime un numero con la unidad Kilometros y te lo convertiré en Millas");
        double km = sc.nextDouble();
        double millas = Conversion.millas(km);
        System.out.println("\n" + km + " kilómetros son " + millas + " millas.");

        System.out.println("\nConversor de Milibares a Atmósferas:");
        System.out.println("====================================");
        System.out.println("\nDime un numero con la unidad Milibares y te lo convertiré en Atmósferas");
        double milibares = sc.nextDouble();
        double atmosferas = Conversor.atmosferas(milibares);
        System.out.println("\n" + milibares + " milibares son " + atmosferas + " atmósferas.");

        System.out.println("\nConversor de Calorias a Julios:");
        System.out.println("===============================");
        System.out.println("\nDime un numero con la unidad Calorias y te lo convertiré en Julios");
        double calorias = sc.nextDouble();
        double julios = Conversor.julios(calorias);
        System.out.println("\n" + calorias + " calorías son " + julios + " julios.");

        sc.close();
    }
}