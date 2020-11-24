package unidad4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Introduzca la longitud del vector (>=10 y <=200):");
		int longitud = in.nextInt();

		while (longitud < 10 || longitud > 200) {
			System.out.println("Introduzca un entero dentro del rango admitido:");
			longitud = in.nextInt();
		} // while

		int [] numeros = new int [longitud];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(201)-100;
			for (int j = 0; j < i; j++) {
				if (numeros[j] == numeros[i]) {
					numeros[i] = r.nextInt(201)-100;
					j = 0;
				} // if
			} // for j
		} // for i
		
		int cantidadExcluidos = 0;
		int sumaTodos = 0;
				int sumaExcluidos = 0;
				
		for (int i =0; i < numeros.length; i++) {
			sumaTodos += numeros[i];
			if (numeros[i] == 13) {
				for (int j = i; j < numeros.length; j++) {
					if (cantidadExcluidos <= 13) {
					sumaExcluidos = numeros[j];
					cantidadExcluidos++;
					} // if
				} // for
			} // if
		} // for
		
		if (sumaExcluidos != 7) {
			System.out.println("La suma total del vector es " + (sumaTodos - sumaExcluidos) + " sin contar los " + cantidadExcluidos + " números excluidos.");
		} else System.out.println("La suma total es " + sumaTodos + " porque la suma de los números excluídos es igual a 7.");
		if (cantidadExcluidos == 0) {
			System.out.println("Afortunadamente no se ha almacenado el número 13 en el vector.");
		}
		
		for (int numero: numeros)
			System.out.println(numero);
	} // main

}
