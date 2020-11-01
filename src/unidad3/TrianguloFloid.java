package unidad3;

import java.util.Scanner;

public class TrianguloFloid {

	public static void main(String[] args) {
		int numFilas;
		int num = 1;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas del Triángulo de Floid:");
		numFilas = in.nextInt();
		
	                for (int i = 1; i <= numFilas; i++) {
	                     for (int j = num; j <= num + i - 1; j++) {
	                          System.out.print(j + "\t");
	                     }
	                System.out.println();
	                num += i;
	                }
	} // main

}
