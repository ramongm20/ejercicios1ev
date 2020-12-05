package unidad4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int [][] numeros;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Número de secuencias: ");
		numeros = new int[in.nextInt()][];
		
		for (int i=0; i<numeros.length; i++) {
			System.out.println("Cantidad de números de la secuencia " + (i + 1) + ": ");
			numeros[i] = new int[in.nextInt()];
			System.out.println("Introduce los números de la secuencia:");
			for (int j=0; j<numeros[i].length; j++)
				numeros[i][j] = in.nextInt();
		}
		
		for (int [] v: numeros) {
			for (int n: v)
				System.out.printf("%-5d", n);
			System.out.println();
		}
		
		for (int [] v: numeros)
			System.out.println(Arrays.toString(v));
		
		in.close();
	} // main

}
