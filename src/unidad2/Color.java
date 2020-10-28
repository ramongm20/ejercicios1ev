package unidad2;

import java.util.Scanner;

public class Color {

	public static void main(String[] args) {
		
		System.out.println("Rojo:");
		Scanner sc = new Scanner(System.in);
		int rojo = sc.nextInt();
		
		System.out.println("Verde:");
		sc = new Scanner(System.in);
		int verde = sc.nextInt();
		
		System.out.println("Azul:");
		sc = new Scanner(System.in);
	int	 azul = sc.nextInt();
		
		double componente_y = (0.299 * rojo) + (0.587 * verde) + (0.114 * azul);
		double componente_i = (0.596 * rojo) + (-0.275 * verde) + (-0.321 * azul);
		double componente_q = (0.212 * rojo) + (-0.528 * verde) + (0.311 * azul);
		
		System.out.print("y: ");
		System.out.printf("%.3f", componente_y);
		System.out.print("\ni: ");
		System.out.printf("%.3f", componente_i);
		System.out.print("\nq:");
		System.out.printf("%.3f", componente_q);

	} // main

}
