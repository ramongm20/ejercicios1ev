package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Barcos {

	static int [][] tablero = new int [10][10];
	static final int AGUA = 0;
	static final int BARCO = 1;
	static final int INTENTO = 2;
	static int intentos = 1;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		for (int y=0; y<10; y++) {
			for (int x=0; x<10; x++)
				tablero[y][x] = AGUA;
			} // for

		int barcoX = r.nextInt(10);
		int barcoY = r.nextInt(10);
		
		tablero[barcoY][barcoX] = BARCO;
		
		System.out.println("EL JUEGO DE LOS BARCOS");
		boolean salir = false;
		
		while (!salir) {
			System.out.print("Introduzca las coordenadas del disparo separadas por un espacio: ");
			int disparoX = in.nextInt();
			int disparoY = in.nextInt();
			if (tablero[disparoY][disparoX] == BARCO)
				salir = true;
			else {
				tablero[disparoY][disparoX] = INTENTO;
				intentos++;
			}
			imprimeTablero(salir);
		}
		
	} // main

	public static void imprimeTablero(boolean fin) {
		if (!fin) System.out.println("AGUA");
		else System.out.println("HUNDIDO en " + intentos + " disparos.");
		for (int y=9; y>=0; y--) {
			for (int x=0; x<10; x++) {
				if (tablero[y][x] != BARCO)
				System.out.print(tablero[y][x]);
				else {
					if (fin)
						System.out.print('X');
					else
						System.out.print(0);
				}
			} // for casilla
			System.out.println();
		} // for fila
		System.out.println();
}
}
