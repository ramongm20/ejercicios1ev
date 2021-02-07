package unidad4;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduzca el número de filas y columnas de la matriz, separados por un espacio:");
		final int F = in.nextInt();
		final int C = in.nextInt();
		in.nextLine();
		char [][] matriz = new char[F][C];

		System.out.println("Introduzca una cadena de caracteres [por cada línea que se corresponda con [a-z0-9]{" + C + "}:");
		for (int i=0; i<matriz.length; i++) {
			System.out.print((i+1) + ": ");
			String cadena = in.nextLine();
			for (int j=0; j<matriz[i].length; j++)
				matriz[i][j] = cadena.charAt(j);
		} // for i
		
		System.out.print("Introduzca el carácter de relleno: ");
		char caracterRelleno = in.next().charAt(0);
		System.out.print("Introduzca el valor para la fila inicial (0-" + (matriz.length-1) + "): ");
		int filaInicial = in.nextInt();
		System.out.print("Introduzca el valor para la columna inicial (0-" + (matriz[0].length-1) + "): ");
		int columnaInicial = in.nextInt();
in.close();
		imprime(matriz);
		imprime(rellenar(matriz, filaInicial, columnaInicial, caracterRelleno));

	} // main

	static char [][] rellenar(char [][] matriz, int filaInicial, int columnaInicial, char caracterRelleno) {
		char caracterInicial = matriz[filaInicial][columnaInicial];
		matriz[filaInicial][columnaInicial] = caracterRelleno;
		
		boolean control = true;
		while (control) {
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if ((i+1)<matriz.length && (i-1)>=0 && (j+1)<matriz[i].length && (j-1)>=0) {
					if (Character.compare(caracterInicial, matriz[i][j]) == 0 && (Character.compare(caracterInicial, matriz[i+1][j]) == 0 || Character.compare(caracterInicial, matriz[i-1][j]) == 0 || Character.compare(caracterInicial, matriz[i][j+1]) == 0 || Character.compare(caracterInicial, matriz[i][j-1]) == 0 ))
						matriz[i][j] = caracterRelleno;
					else control = false;
				}
			} // for j
		} // for i
		} // while
		
		return matriz;
	} // rellenar
	
	static void imprime(char [][] matriz) {
		System.out.println();
		for (int i=0; i<matriz.length; i++) {
			System.out.println();
			for (int j=0; j<matriz[i].length; j++)
				System.out.print(matriz[i][j]);
		} // for i
	} // imprime
}
