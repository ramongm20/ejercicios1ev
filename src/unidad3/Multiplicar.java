package unidad3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		
		int tabla;
		int respuesta;
		int fallos = 0;
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.println("¿Qué tabla deseas repasar (1-9)?");
			tabla = in.nextInt();
			
			switch (tabla) {
				case 1:
					for (int i = 0; i <= 10; i++) {
						System.out.print(tabla + " x " + i + " = ");
						if (in.nextInt() != tabla * i) {
							fallos++;
							System.out.println("Error, la respuesta correcta es: " + tabla * i + ".");
						} else System.out.println("Correcto.");
					} // for
					if (fallos < 2) System.out.println("Aprobado.");
					else System.out.println("Suspenso.");
					fallos = 0;
					break;
				case 2:
					for (int i = 0; i <= 10; i++) {
						System.out.print(tabla + " x " + i + " = ");
						if (in.nextInt() != tabla * i) {
							fallos++;
							System.out.println("Error, la respuesta correcta es: " + tabla * i + ".");
						} else System.out.println("Correcto.");
					} // for
					if (fallos < 2) System.out.println("Aprobado.");
					else System.out.println("Suspenso.");
					fallos = 0;
					break;
					
				case 3:
					for (int i = 0; i <= 10; i++) {
						System.out.print(tabla + " x " + i + " = ");
						if (in.nextInt() != tabla * i) {
							fallos++;
							System.out.println("Error, la respuesta correcta es: " + tabla * i + ".");
						} else System.out.println("Correcto.");
					} // for
					if (fallos < 2) System.out.println("Aprobado.");
					else System.out.println("Suspenso.");
					fallos = 0;
					break;
					
				case 4:
					for (int i = 0; i <= 10; i++) {
						System.out.print(tabla + " x " + i + " = ");
						if (in.nextInt() != tabla * i) {
							fallos++;
							System.out.println("Error, la respuesta correcta es: " + tabla * i + ".");
						} else System.out.println("Correcto.");
					} // for
					if (fallos < 2) System.out.println("Aprobado.");
					else System.out.println("Suspenso.");
					fallos = 0;
					break;
					
				case 5:
					for (int i = 0; i <= 10; i++) {
						System.out.print(tabla + " x " + i + " = ");
						if (in.nextInt() != tabla * i) {
							fallos++;
							System.out.println("Error, la respuesta correcta es: " + tabla * i + ".");
						} else System.out.println("Correcto.");
					} // for
					if (fallos < 2) System.out.println("Aprobado.");
					else System.out.println("Suspenso.");
					fallos = 0;
					break;
					
				case 6:
					for (int i = 0; i <= 10; i++) {
						System.out.print(tabla + " x " + i + " = ");
						if (in.nextInt() != tabla * i) {
							fallos++;
							System.out.println("Error, la respuesta correcta es: " + tabla * i + ".");
						} else System.out.println("Correcto.");
					} // for
					if (fallos < 2) System.out.println("Aprobado.");
					else System.out.println("Suspenso.");
					fallos = 0;
					break;
					
				case 7:
					for (int i = 0; i <= 10; i++) {
						System.out.print(tabla + " x " + i + " = ");
						if (in.nextInt() != tabla * i) {
							fallos++;
							System.out.println("Error, la respuesta correcta es: " + tabla * i + ".");
						} else System.out.println("Correcto.");
					} // for
					if (fallos < 2) System.out.println("Aprobado.");
					else System.out.println("Suspenso.");
					fallos = 0;
					break;
					
				case 8:
					for (int i = 0; i <= 10; i++) {
						System.out.print(tabla + " x " + i + " = ");
						if (in.nextInt() != tabla * i) {
							fallos++;
							System.out.println("Error, la respuesta correcta es: " + tabla * i + ".");
						} else System.out.println("Correcto.");
					} // for
					if (fallos < 2) System.out.println("Aprobado.");
					else System.out.println("Suspenso.");
					fallos = 0;
					break;
					
				case 9:
					for (int i = 0; i <= 10; i++) {
						System.out.print(tabla + " x " + i + " = ");
						if (in.nextInt() != tabla * i) {
							fallos++;
							System.out.println("Error, la respuesta correcta es: " + tabla * i + ".");
						} else System.out.println("Correcto.");
					} // for
					if (fallos < 2) System.out.println("Aprobado.");
					else System.out.println("Suspenso.");
					fallos = 0;
					break;
				default: System.out.println("Entrada inválida.");
			} // switch
			System.out.println("Deseas repasar otra tabla (s/n)?");
			if (in.next().charAt(0) == 110) break;
		} // while
	} // main

}
