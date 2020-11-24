package unidad4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] nombres = new String [10];
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduzca nombre " + (i + 1));
			nombres[i] = in.nextLine();
	} // for
		System.out.println("El nombre más largo es " + nombres[devuelveCadena(nombres)]);

	} // main
	static int devuelveCadena(String [] vector) {
		int indiceCadena = -1;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i].length() > indiceCadena)
				indiceCadena = i;
		} // for
		return indiceCadena;
	} // metodo
	

}
