package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Oca {
static String [][] tablero = new String [63][4];
static String [] jugadores = new String [2];
static int [] casillaJugador = {-1, -1};
static int [] tiradasJugador = {1, 0};
static Random r = new Random();
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for (int i=0; i<63; i++) {
			for (int j=0; j<4; j++) {
				if (j == 0) tablero[i][j] = String.valueOf(i+1);
				else tablero[i][j] = "";
				if ((i+1)%6 == 0 && j==1) tablero[i][j] = "Oca";
				if (j==1 && (i==22 || i==44)) tablero[i][j] = "Dados";
				if (j==1 && (i==6 || i==12)) tablero[i][j] = "Puente";
				if (i==18 && j==1) tablero[i][j] = "Posada";
				if (i==30 && j==1) tablero[i][j] = "Pozo";
				if (i==51 && j==1) tablero[i][j] = "Cárcel";
				if (i==57 && j==1) tablero[i][j] = "Muerte";
			} // for j
		} // for i
		
		System.out.println("Bienvenido al juego de la Oca");
		for (int i=0; i<2; i++) {
			System.out.println("Nombre del jugador " + (i+1) + ": ");
			jugadores[i] = in.nextLine();
		} // for
		
		boolean salir = false;
		int turno = 0;
		
		while (!salir) {
			turno = tiradasJugador[0]>tiradasJugador[1]? 0:1;
			imprimeTablero();
			System.out.println(jugadores[turno] + "está en la casila " + (casillaJugador[turno]+1));
			System.out.println("Es el turno de " + jugadores[turno] + ". Presiona Enter para tirar el dado.");
			in.nextLine();
			int dado = r.nextInt(6)+1;
			System.out.println(jugadores[turno] + " avanza " + dado + " posiciones.");
			movimiento(turno, (casillaJugador[turno] + dado));
			if ((casillaJugador[turno]+1)%6 == 0) {
				movimiento(turno, (casillaJugador[turno] + 6));
				System.out.println(jugadores[turno] + " se desplaza hasta la siguiente Oca y tira porque le toca.");
			} else if (casillaJugador[turno]==22 || casillaJugador[turno] == 44) {
				movimiento(turno, casillaJugador[turno]==22?44:22);
				System.out.println(jugadores[turno] + " se desplaza de dado a dado y tira porque le ha tocado.");
		} else if (casillaJugador[turno]==6 || casillaJugador[turno] == 12) {
			movimiento(turno, casillaJugador[turno]==6?12:6);
			System.out.println(jugadores[turno] + " se desplaza de puente a puente y tira porque le lleva la corriente.");
		} else if (casillaJugador[turno] == 18) {
			tiradasJugador[turno] -= 6;
			System.out.println(jugadores[turno] + " descansa en la posada tres turnos sin tirar.");
		} else if (casillaJugador[turno] == 30) {
			tiradasJugador[turno] -= 10;
			System.out.println(jugadores[turno] + " sumido en el pozo cinco turnos sin tirar.");
		} else if (casillaJugador[turno] == 51) {
			tiradasJugador[turno] -= 6;
			System.out.println(jugadores[turno] + " encarcelado tres turnos sin tirar.");
		} else if (casillaJugador[turno]==57) {
			movimiento(turno, -1);
			System.out.println(jugadores[turno] + " vuelve a empezar.");
		} else tiradasJugador[turno] -=2;

			salir = casillaJugador[turno] > 62;
		} // while
		
		System.out.println(jugadores[turno] + " Gana.");
	} // main

	static void imprimeTablero() {
		// Primera fila
		for (int j=0; j<4; j++) {
			for (int i=22; i>13; i--)
				System.out.printf("%-6s", tablero[i][j]);
			System.out.println();
		}
		
		// Segunda fila
		for (int j=0; j<4; j++) {
			System.out.printf("%-6s", tablero[23][j]);
			for (int i=44; i>37; i--)
				System.out.printf("%-6s", tablero[i][j]);
			System.out.printf("%-6s", tablero[13][j]);
			System.out.println();
		}
		
		// Tercera fila
		for (int j=0; j<4; j++) {
			System.out.printf("%-6s%-6s", tablero[24][j], tablero[45][j]);
			for (int i=58; i>53; i--)
				System.out.printf("%-6s", tablero[i][j]);
			System.out.printf("%-6s%-6s", tablero[37][j], tablero[12][j]);
			System.out.println();
		}
		// Cuarta fila
		for (int j=0; j<4; j++) {
			System.out.printf("%-6s%-6s", tablero[25][j], tablero[46][j]);
			for (int i=59; i<63; i++)
				System.out.printf("%-6s", tablero[i][j]);
			System.out.printf("%-6s%-6s%-6s", tablero[53][j], tablero[36][j], tablero[11][j]);
			System.out.println();
		}
		// Quinta fila
		for (int j=0; j<4; j++) {
			System.out.printf("%-6s", tablero[26][j]);
			for (int i=47; i<53; i++)
				System.out.printf("%-6s", tablero[i][j]);
			System.out.printf("%-6s", tablero[35][j]);
			System.out.printf("%-6s", tablero[10][j]);
			System.out.println();
		}
		// Sexta fila
		for (int j=0; j<4; j++) {
			for (int i=27; i<35; i++)
				System.out.printf("%-6s", tablero[i][j]);
			System.out.printf("%-6s", tablero[9][j]);
			System.out.println();
		}
		// Séptima fila
		for (int j=0; j<4; j++) {
			for (int i=0; i<9; i++)
				System.out.printf("%-6s", tablero[i][j]);
			System.out.println();
		}
	} // imprimeTablero
	
		
	static void movimiento(int turno, int casilla) {
		if (casillaJugador[turno]>-1) tablero[casillaJugador[turno]][turno+2] = "";
		casillaJugador[turno] = casilla;
		if (casillaJugador[turno]<63) tablero[casillaJugador[turno]][turno+2] = jugadores[turno];
	} //movimiento
}
