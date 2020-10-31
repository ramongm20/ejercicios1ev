package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		float ladoA;
		float ladoB;
		float ladoC;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Medida de un lado:");
		ladoA = in.nextFloat();
		System.out.println("Medida de un segundo lado:");
		ladoB = in.nextFloat();
		System.out.println("Medida del tercer lado:");
		ladoC = in.nextFloat();
		
		if (ladoA + ladoB > ladoC && ladoB + ladoC > ladoA && ladoC + ladoA > ladoB) {
			if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
				System.out.println("El triángulo es escaleno.");
				System.out.println("El triángulo no es equilátero.");
				System.out.println("El triángulo no es isósceles.");
			} else {
				System.out.println("El triángulo no es escaleno.");
				if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
					System.out.println("El triángulo es equilátero.");
					System.out.println("El triángulo es isósceles.");
				} else {
					System.out.println("El triángulo no es equilátero.");
					System.out.println("El triángulo es isósceles.");
				}
			}
		} else System.out.println("El triángulo no está bien formado.");
		
	} //main
}
