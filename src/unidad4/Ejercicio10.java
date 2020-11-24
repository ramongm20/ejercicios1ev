package unidad4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un tamaño para el vector entre 10 y 20: ");
		int n = in.nextInt();
		while (n < 10 || n > 20) {
			System.out.println("Incorrecto, el tamaño tiene que estar entre 10 y 20. Vuelve a introducirlo: ");
			n = in.nextInt();
		}
		in.close();
		
		int [] vector = new int[n];
		for (int i=0; i<vector.length; i++)
			System.out.print((vector[i] = (int) Math.round(Math.random() * Integer.MAX_VALUE)) + " ");
		
		System.out.println();
		
		int min = Integer.MAX_VALUE;
		int dif;
		for (int i=1; i<vector.length; i++) {
			dif = vector[i] - vector[i-1];
			if (dif < min)
				min = dif;
		}
		
		System.out.println("Mínima diferencia: " + min);

	}

}
