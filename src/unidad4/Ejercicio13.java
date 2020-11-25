package unidad4;

import java.util.Random;

public class Ejercicio13 {

	public static void main(String[] args) {
		Random r = new Random();

		int [][] matriz = new int [r.nextInt(19)+2][r.nextInt(19)+2];

		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++)
				matriz[x][y] = r.nextInt(19)+2;
		} // for fila
		
		for (int x = 0; x < matriz.length; x++) {
			for (int y = 0; y < matriz[x].length; y++) {
				System.out.print(matriz[x][y] + "	");
			} // for y
			System.out.println(sumaFila(matriz)[x]);
		} // for x
		
		for (int numero: sumaColumna(matriz))
			System.out.print(numero + "\t");
	} // main
	static int [] sumaFila(int [][] matriz) {
		int [] fila = new int [matriz.length];
		for (int x=0; x<matriz.length; x++) {
			for (int y=0; y<matriz[x].length; y++)
				fila[x] += matriz[x][y];
		} // for x
		return fila;
	} // sumaFila
	
	static int [] sumaColumna(int [][] matriz) {
		int [] columna = new int [matriz[0].length];
		for (int x=0; x<matriz.length; x++) {
			for (int y=0; y<matriz[x].length; y++)
				columna[y] += matriz[x][y];
		} // for x
		return columna;
	}
}
