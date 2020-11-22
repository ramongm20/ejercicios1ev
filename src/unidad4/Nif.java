package unidad4;

import java.util.Scanner;

public class Nif {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		System.out.println("Introduzca un NIF válido:");
		String nif = in.nextLine();

		int num = Integer.parseInt(nif.substring(0, nif.length()-1));
		char letra = nif.charAt(nif.length()-1);
		int i = num % 23;
		
		if (letra == letras.charAt(i)) {
			System.out.println("El nif es correcto");
		} else {
			System.out.println("El nif es incorrecto");
		}
		
	}

}
