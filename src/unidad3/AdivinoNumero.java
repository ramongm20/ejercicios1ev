package unidad3;

import java.util.Scanner;

public class AdivinoNumero {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int numMax;
		int numMin = 0;
		int candidato;
		boolean acierto = false;

		System.out.println("Límite superior:");
		numMax = in.nextInt();

		while (!acierto) {
			candidato = Math.round((numMax + numMin) / 2);
			if (candidato == numMax -1 && candidato == numMin + 1) {
				System.out.println("Estoy seguro de que es el " + candidato);
				acierto = true;
				break;
			} else {
				System.out.println("El número es el " + candidato + ".");
				System.out.println("1. Acierto.\n2. Mayor.\n3. Menor.");
				switch (in.nextInt()) {
				case 1:
					System.out.println("Correcto.");
					acierto = true;
					break;
				case 2:
					numMin = candidato;
					break;
				case 3:
					numMax = candidato;
					break;
				} // switch
			}
		} // while
	} // main
}
