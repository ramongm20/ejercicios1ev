package unidad4;

import java.util.Scanner;

public class TresEnRaya {
	static char [][] tablero =new char [3][3]; 
	static String [] jugadores = new String [2];
	static final char [] FICHAS = {'X', 'O'};
	static int numPartidas = 1;
	static Scanner in = new Scanner(System.in);
	static boolean salir = false;
	public static void main(String[] args) {
		
		System.out.println("Bienvenido al Tres en raya");
		
		for (int i=0; i<2; i++) {
			System.out.print("Nombre del jugador " + (i+1) + ": ");
			jugadores[i] = in.next();
		} // for
		
		do {
			partida();
			System.out.print("¿Otra partida? (s/n): ");
					switch (in.next().charAt(0)) {
					case 110:
						System.out.println("Adiós");
						salir = true;
						break;
					case 115: break;
					default: System.out.println("Error, el juego se interrumpe.");
					salir = true;
					} // switch
		} while (!salir);
	} // main

	public static void partida() {
		int turno = numPartidas%2 != 0 ? 0:1;
		iniciaTablero();
		do {
			imprimeTablero();
			turno = turno>0 ? 0:1;
			System.out.println("Es el turno de " + jugadores[turno] + ".");
			System.out.print("Teniendo en cuenta que la casilla inferior izquierda corresponde al 1, escoge dónde colocar tu ficha (1-9): ");
			switch (in.nextInt()) {
				case 1:
					tablero[2][0] = FICHAS[turno];
					break;
				case 2:
					tablero[2][1] = FICHAS[turno];
					break;
				case 3:
					tablero[2][2] = FICHAS[turno];
					break;
				case 4:
					tablero[1][0] = FICHAS[turno];
					break;
				case 5:
					tablero[1][1] = FICHAS[turno];
					break;
				case 6:
					tablero[1][2] = FICHAS[turno];
					break;
				case 7:
					tablero[0][0] = FICHAS[turno];
					break;
				case 8:
					tablero[0][1] = FICHAS[turno];
					break;
				case 9:
					tablero[0][2] = FICHAS[turno];
					break;
					default: System.out.println("Error, se interrumpe el juego.");
				}
		} while (!comprobarVictoria(turno));
		System.out.println("Enhorabuena, " + jugadores[turno]+ ", has ganado.");
		imprimeTablero();
		iniciaTablero();
		numPartidas++;
	} // partida

	static boolean comprobarVictoria(int turno) {
		return (
		(tablero[0][0] == FICHAS[turno]) && (tablero[0][1] == FICHAS[turno]) && (tablero[0][2] == FICHAS[turno]) ||
		(tablero[1][0] == FICHAS[turno]) && (tablero[1][1] == FICHAS[turno]) && (tablero[1][2] == FICHAS[turno]) ||
		(tablero[2][0] == FICHAS[turno]) && (tablero[2][1] == FICHAS[turno]) && (tablero[2][2] == FICHAS[turno]) ||
		(tablero[0][0] == FICHAS[turno]) && (tablero[1][0] == FICHAS[turno]) && (tablero[2][0] == FICHAS[turno]) ||
		(tablero[0][1] == FICHAS[turno]) && (tablero[1][1] == FICHAS[turno]) && (tablero[2][1] == FICHAS[turno]) ||
		(tablero[0][2] == FICHAS[turno]) && (tablero[1][2] == FICHAS[turno]) && (tablero[2][2] == FICHAS[turno]) ||
		(tablero[0][0] == FICHAS[turno]) && (tablero[1][1] == FICHAS[turno]) && (tablero[2][2] == FICHAS[turno]) ||
		(tablero[0][2] == FICHAS[turno]) && (tablero[1][1] == FICHAS[turno]) && (tablero[2][0] == FICHAS[turno])
		);
	} // comprobarVictoria

	static void imprimeTablero() {
		for (char [] fila: tablero) {
			for (char casilla: fila)
				System.out.print(casilla);
			System.out.println();
		} // for
	} // imprimeTablero
	
	static void iniciaTablero() {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++)
				tablero[i][j] = '-';
		} // for
	}
}
