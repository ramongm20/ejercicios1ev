package unidad4;

import java.util.Scanner;

public class Ejercicio15 {
	static Scanner in = new Scanner(System.in);
	static String [] nombres;
	static int [][] notas;
	
	public static void main(String[] args) {
	
		System.out.println("Introduzca el número de alumnos del curso:");
		nombres = new String[in.nextInt()];
		notas = new int[nombres.length][3];
		
		for (int i=0; i<nombres.length; i++) {
			in.nextLine();
			System.out.println("Introduzca el nombre del alumno " + (i+1) + ":");
			nombres[i] = in.nextLine();
			System.out.println("¿Qué nota sacó en la primera evaluación?");
			notas[i][0] = in.nextInt();
			System.out.println("¿Qué nota sacó en la segunda evaluación?");
			notas[i][1] = in.nextInt();
			System.out.println("¿Qué nota sacó en la tercera evaluación?");
			notas[i][2] = in.nextInt();
		}

		boolean menu = true;
		while (menu) {
			System.out.println("\nSeleccione una opción:\n1. Mostrar la nota media de todos los alumnos.\n2. Mostrar la nota media de un alumno determinado.\n3. Visualizar las notas por evaluación y la nota final de cada evaluación.\n4. Visualizar las notas por evaluación y la nota final de un alumno determinado.\n5. Calcular la nota media del curso.\n6. Calcular la nota más alta y la más baja e indicar a qué alumno y evaluación pertenece.\n7. Salir.");
			switch (in.nextInt()) {
			case 1:
				for (int i=0; i<nombres.length; i++) {
					System.out.println(nombres[i] + " tiene un " + notaMedia(notas[i]) + ".");
				} // for i
				break;
			case 2:
				int indice = indicaNombre();
				if (indice >=0)
				System.out.println("La nota media de " + nombres[indice] + " es " + notaMedia(notas[indice]) + ".");
				break;
			case 3:
				System.out.println("Nombre         1ª Evaluación  2ª Evaluación  3ª Evaluación  Final");
				for (int i=0; i<nombres.length; i++)
					System.out.printf("%-15s%-15d%-15d%-15d%-15d\n", nombres[i], notas[i][0], notas[i][1], notas[i][2], notaMedia(notas[i]));
				break;
			case 4:
				indice = indicaNombre();
				if (indice >=0) {
					System.out.println("Nombre         1ª Evaluación  2ª Evaluación  3ª Evaluación  Final");
					System.out.printf("%-15s%-15d%-15d%-15d%-15d\n", nombres[indice], notas[indice][0], notas[indice][1], notas[indice][2], notaMedia(notas[indice]));
				} break;
			case 5:
				int [] medias = new int[notas.length];
				for (int i=0; i<notas.length; i++)
					medias[i] = notaMedia(notas[i]);
				System.out.println("La nota media del curso es " + notaMedia(medias) + ".");
				break;
			case 6: // No tiene en cuenta que varios alumnos saquen la misma nota.
			int [] nombreEvaluacionNotaBaja = {0, 0, 0};
			int [] nombreEvaluacionNotaAlta = {0, 0, 0};
			for (int i=0; i<notas.length; i++) {
				for (int j=0; j<notas[i].length; j++) {
					if (notas[i][j] < nombreEvaluacionNotaBaja[2]) {
						nombreEvaluacionNotaBaja[2] = notas[i][j];
						nombreEvaluacionNotaBaja[1] = j;
						nombreEvaluacionNotaBaja[0] = i;
					} // if
					if (notas[i][j] > nombreEvaluacionNotaAlta[2]) {
						nombreEvaluacionNotaAlta[2] = notas[i][j];
						nombreEvaluacionNotaAlta[1] = j;
						nombreEvaluacionNotaAlta[0] = i;
					} // if
				} // for j
			} // for i
			System.out.println(nombres[nombreEvaluacionNotaBaja[0]] + " tiene la nota más baja del curso, con un " + nombreEvaluacionNotaBaja[2] + " en la " + (nombreEvaluacionNotaBaja[1]+1) + "ª evaluación.");
			System.out.println(nombres[nombreEvaluacionNotaAlta[0]] + " tiene la nota más alta del curso, con un " + nombreEvaluacionNotaAlta[2] + " en la " + (nombreEvaluacionNotaAlta[1]+1) + "ª evaluación.");
			break;
			case 7: menu = false;
			} // switch
		} // while
		System.out.println("Adiós.");
	
	} // main

	static int notaMedia(int [] notas) {
		int sumaNotas = 0;
		for (int nota: notas)
			sumaNotas += nota;
		return (sumaNotas/notas.length);
	} // notaMedia

	static int indicaNombre() {
		in.nextLine();
		System.out.println("Nombre del alumno:");
		String nombre = in.nextLine();
	int indice = -1;
	for (int i=0; i<nombres.length; i++) {
		if (nombre.equalsIgnoreCase(nombres[i]))
			indice = i;
	} // for
	if (indice<0) System.out.println("El alumno no está matriculado.");
	return indice;
} // indicaNombre



}
