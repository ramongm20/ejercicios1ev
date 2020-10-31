package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		int anno;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce un año:");
		anno = in.nextInt();
		
		if (anno% 4 == 0 && (anno % 400 == 0 || anno % 100 != 0)) {
			System.out.println(anno + " es bisiesto.");
		} else System.out.println(anno + " no es bisiesto.");
		
		
	} // main

}
