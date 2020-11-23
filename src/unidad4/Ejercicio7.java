package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Introduzca tamaño del vector, entre 10 y 1 millón:");
		int numElementos = in.nextInt();

		while (numElementos <10 || numElementos > 1000000) {
			System.out.println("Introduzca un número dentro del rango admitido:");
			numElementos = in.nextInt();
		} // while
		
		int [] numeros = new int [numElementos];
		
		Random r = new Random();
		
		long t0 = System.currentTimeMillis();
		
		for (int i=0; i<numeros.length; i++) {
			int j;
			int n;
			do {
				n = r.nextInt(2000000) - 999999;
				j = 0;
				while (j < i && numeros[j] != n) 
					j++;
			} while (j != i);
			numeros[i] = n;
		}
		long t1 = System.currentTimeMillis() - t0;
		System.out.println("Tamaño del vector: " + numeros.length);
		System.out.println("Tiempo empleado en llenarlo: " + t1 + " milisegundos");
		t0 = System.currentTimeMillis();
		int numPequeno= 0;
		int numGrande = 0;
		for (int num: numeros) {
			if (num < numPequeno) numPequeno = num;
			if (num > numGrande) numGrande = num;
		} // for
int dif = numGrande - numPequeno;		
		
 		t1 = System.currentTimeMillis() - t0;
 		System.out.println("Diferencia entre el valor mayor y el menor: " + dif);
		System.out.println("Tiempo empleado en calcular la diferencia: " + t1 + "milisegundos");

	} // main

}
