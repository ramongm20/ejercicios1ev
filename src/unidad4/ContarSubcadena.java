package unidad4;

import java.util.Scanner;

public class ContarSubcadena {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduzca la primera cadena:");
		String cadena1 = in.nextLine();
		System.out.println("Introduzca la segunda cadena:");
		String cadena2 = in.nextLine();

		while (cadena1.isEmpty() || cadena2.isEmpty()) {
			System.out.println("Introduzca texto:");
			System.out.println("Introduzca la primera cadena:");
			cadena1 = in.nextLine();
			System.out.println("Introduzca la segunda cadena:");
			cadena2 = in.nextLine();
		} // while

		int coincidenciaSubcadena = 0;
		int i = cadena1.indexOf(cadena2);
		while (i != -1) {
			coincidenciaSubcadena++;
			i++;
			i = cadena1.indexOf(cadena2, i);
		} // while
		System.out.println("La primera cadena contiene " + coincidenciaSubcadena + " veces a la segunda.");
	} //main

}
