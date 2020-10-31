package unidad3;

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
		int horas, minutos, segundos;
		Scanner in = new Scanner(System.in);

		System.out.println("Introduce dos dígitos para la hora (24 h):");
		horas = in.nextInt();
		System.out.println("Introduce dos dígitos para los minutos:");
		minutos = in.nextInt();
		System.out.println("Introduce dos dígitos para los segundos:");
		segundos = in.nextInt()+1;
		
		if (segundos == 60) {
			segundos = 0;
			minutos++;
		} if (minutos == 60) {
			minutos = 0;
			horas++;
		} if (horas == 24) {
			horas = 0;
		} // if
		System.out.printf("la hora es: %02d:%02d:%02d.", horas, minutos, segundos);		
	} // main

}
