package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int[] resultados = new int[6];

		System.out.println("¿Cuántas veces tiramos el dado?");
		int numTiradas = in.nextInt();

		for (int i = 0; i < numTiradas; i++) {
			resultados[r.nextInt(6)]++;
		} // for

		System.out.println("El dado se ha tirado " + numTiradas + " veces.");

		int cara = 1;
		
		for (int resultado: resultados) {
			System.out.println("El " + cara + " ha salido " + resultado + " veces.");
			cara++;
		} // for
	} // main

}
