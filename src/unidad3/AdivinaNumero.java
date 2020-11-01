package unidad3;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		int intento = 0;
		int numN = (int)(Math.random() * (100001 - 1000))+1000;
		int numPensado = (int)(Math.random() * ((numN + 1) + 1))+1;
		Scanner in = new Scanner(System.in);
		System.out.println("He pensado un número entre 1 y " + numN + ", adivina cuál es:");
		
		while (intento != numPensado) {
			intento = in.nextInt();
			if (intento > numPensado) {
				System.out.println("Te pasaste.");
			} else System.out.println("Te quedaste corto.");
		} // while
		System.out.println("Enhorabuena, lo has adivinado.");
	} // main

}
