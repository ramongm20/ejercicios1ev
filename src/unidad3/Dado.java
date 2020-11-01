package unidad3;

import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		int tiradas;
		int cara1 = 0;
		int cara2 = 0;
		int cara3 = 0;
		int cara4 = 0;
		int cara5 = 0;
		int cara6 = 0;
		int resultado;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce un número de tiradas:");
		tiradas = in.nextInt();
		
		for (int i = 1; i <= tiradas; i++) {
			resultado = (int)(Math.random() * 6)+1;
			
			switch (resultado) {
			case 1:
				cara1++;
				break;
			case 2:
				cara2++;
				break;
			case 3:
				cara3++;
				break;
			case 4:
				cara4++;
				break;
			case 5:
				cara5++;
				break;
			case 6:
				cara6++;
				break;
			}
		} // for
		
		System.out.println("El uno ha salido " + cara1 + " veces.");
		System.out.println("El dos ha salido " + cara2 + " veces.");
		System.out.println("El tres ha salido " + cara3 + " veces.");
		System.out.println("El cuatro ha salido " + cara4 + " veces.");
		System.out.println("El cinco ha salido " + cara5 + " veces.");
		System.out.println("El seis ha salido " + cara6 + " veces.");
	} // main

}
