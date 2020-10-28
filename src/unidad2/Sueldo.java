package unidad2;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
		final float COMISION = 0.1f;

		System.out.println("Introduzca importe del sueldo base:");
		Scanner sc = new Scanner(System.in);
		double sueldoBase = sc.nextDouble();
		
		System.out.println("Introduzca importe de la primera venta:");
		sc = new Scanner(System.in);
		double venta1 = sc.nextDouble();
		System.out.print("Percibirá ");
		System.out.printf("%.2f", venta1 * COMISION);
		System.out.println("€ por esta venta.");
		

		System.out.println("Introduzca importe de la segunda venta:");
		sc = new Scanner(System.in);
		double venta2 = sc.nextDouble();
		System.out.print("Percibirá ");
		System.out.printf("%.2f", venta2 * COMISION);
		System.out.println("€ por esta venta.");
		
		System.out.println("Introduzca importe de la tercera venta:");
		sc = new Scanner(System.in);
		double venta3 = sc.nextDouble();
		System.out.print("Percibirá ");
		System.out.printf("%.2f", venta3 * COMISION);
		System.out.println("€ por esta venta.");
		
		System.out.print("Total a percibir: ");
		System.out.printf("%.2f", sueldoBase + ((venta1 * COMISION) + (venta2 * COMISION) + (venta3 * COMISION)));
		System.out.println("€.");

	} // main

}
