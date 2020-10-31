package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		int num = 1;

		while (num != 0) {
			System.out.println("Introduce un número entero:");
			Scanner in = new Scanner(System.in);
			num = in.nextInt();
			if (num % 2 == 0) {
				System.out.println("Par");
			} else {
				System.out.println("Impar");
			} // else
		} // while
	} // main

}
