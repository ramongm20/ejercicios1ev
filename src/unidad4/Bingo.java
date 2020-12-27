package unidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
static int [][] numeros = new int [60][2];
static int [][] cartones = new int [8][15];
static int [][] resultados = new int [8][3];
static boolean linea = false;
static Random r = new Random();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i=0; i<60; i++) {
			numeros[i][0] = i;
			numeros[i][1] = 0;
		} // for
		
		boolean repetidos = true;
		while (repetidos) {
			cartones = matrizAleatoriosSinRepetir(8, 15, 60, 1);
		
		for (int i=0; i<7; i++) {
			for (int j=i+1; j<8; j++)
				repetidos = Arrays.equals(cartones[i], cartones[j]);
		} // for
		} // while
		
		System.out.println("Bienvenidos al BINGO");
		System.out.println("Escoja una opción:");
		System.out.println("1.- Siguiente número");
		System.out.println("2.- Salir");
		
		boolean salir = false;
		
		while (!salir) {
			switch (in.nextInt()) {
			case 1:
				int numero = -1;
				for (int i=0; i<60; i++) {
					if (numeros[i][1] == 0) {
						int indice = r.nextInt(60);
						while (numeros[indice][1] == 1) indice = r.nextInt(60);
						numero = indice+1;
						System.out.println((numero));
						numeros[indice][1]++;
						break;
					}
				} // for
				
				for (int i=0; i<8; i++) {
					for (int j=0, k=5, l=10; j<5 && k<10 && l<15; j++, k++, l++) {
						if (cartones[i][j] == numero) {
							resultados[i][0]++;
						} else if (cartones[i][k] == numero) {
							resultados[i][1]++;
						} else if (cartones[i][l] == numero)
							resultados[i][2]++;
					} // for j
				} // for i
int bingo = 0;
				for (int i=0; i<8; i++) {
					for (int j=0; j<3; j++) {
						bingo += resultados[i][j];
					} // for j
					if (bingo == 15) {
						System.out.println("El jugador con el cartón número " + i + " ha cantado Bingo. Es correcto.");
						if (linea) System.out.println("Cobra 14,4€.");
						else System.out.println("Cobra 16€.");
						imprimeCarton(i);
						salir = true;
						System.out.println("Gracias por jugar con nosotros. Hasta pronto.");
						break;
					} // if
					bingo = 0;
				} // for i
				
				if (!linea && bingo==0) {
					int lineas = 0;
					for (int i=0; i<8; i++) {
						for (int j=0; j<3; j++) {
							if (resultados[i][j] == 5) {
							System.out.println("El jugador con el cartón número " + i + " ha cantado Línea. Es correcto.");
							imprimeCarton(i);
							lineas++;
							} // if
						} // for j
					} // for i
					if (lineas>0) {
						System.out.println("La Línea es un 10% de la recaudación. Se reparten 1,6€ entre los acertantes. " + (1.6/lineas) + "€ es el premio correspondiente en esta ocasión.\nSeguimos para Bingo.");
						linea = true;
					} // if
				} // if
				
					break;
			case 2:
				System.out.println("Gracias por jugar con nosotros. Hasta pronto.");
				salir = true;
				break;
				default:
					System.out.println("Escoja la opción 1 o 2.");
			} // switch
		} // while
	} // main

	static void imprimeCarton(int num) {
		int [][] indices = new int [3][5];
		boolean repetidos = true;
		while (repetidos) {
			indices = matrizAleatoriosSinRepetir(3, 5, 9, 0);
int [] cuenta = {0, 0, 0, 0, 0, 0, 0, 0, 0};
boolean indiceRepetido = false;

			for (int m=0; m<9; m++) {
				for (int i=0; i<3; i++) {
					for (int j=0; j<5; j++) {
						if (indices[i][j] == m)
							cuenta[m]++;
					} // for j
				} // for i
				if (cuenta[m]>2)
					indiceRepetido = true;
			} // for m
				
			repetidos = indiceRepetido;
		} // while

		int [][] carton = new int [3][9];
		int numI = 0;
		
		for (int j=0; j<3; j++) {
			for ( int k=0; k<5; k++) {
				carton[j][indices[j][k]] = cartones[num][numI];
				numI++;
			} // for k
		} // for j

		for (int i=0; i<3; i++) {
			System.out.println();
			for (int j=0; j<9; j++) {
				if (carton[i][j] > 0)
					System.out.printf("%3d", carton[i][j]);
				else System.out.printf(" ##");
			}
		}
		System.out.println();
	} // imprimeCarton
	
	static int [][] matrizAleatoriosSinRepetir(int f, int c, int rangoAleatorio, int aumento) {
		int [][] matriz = new int [f][c];
		for (int i=0; i<f; i++) {
			for (int j=0; j<c; j++) {
				matriz[i][j] = r.nextInt(rangoAleatorio)+aumento;
				for (int k=0; k<j; k++) {
					while (matriz[i][k] == matriz[i][j]) {
						matriz[i][j] = r.nextInt(rangoAleatorio)+aumento;
						k = 0;
					} // while
				} // for k
			} // for j
			Arrays.sort(matriz[i]);
		} // for i
		return matriz;
	} // matrizAleatoriosSinRepetir

}
