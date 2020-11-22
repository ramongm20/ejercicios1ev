package unidad4;

import java.util.Scanner;

public class InvertirCadena {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Introduzca texto:");
StringBuilder cadena = new StringBuilder(in.nextLine());
System.out.println(cadena.reverse());



	} //main

}
