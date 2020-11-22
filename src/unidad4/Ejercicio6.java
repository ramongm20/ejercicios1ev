package unidad4;

import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
		Random r = new Random();

		int [] numeros = new int [r.nextInt(41)+10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(201)-100;
			for (int j = 0; j < i; j++) {
				if (numeros[i] == numeros[j]) {
					numeros[i] = r.nextInt(201)-100;
					j = 0;
				} // if
			} // segundo for
		} // for
		
		int [] numerosDelReves = new int [numeros.length];
		
		for (int i = 0; i < numeros.length; i++) {
			numerosDelReves[i] = numeros[(numeros.length-1) - i];
		} // for
		
		
		for (int i = 0; i < numeros.length; i++) {
		System.out.print(i + "	" + numeros[i] + "	" + numerosDelReves[i] + "\n");
		}
	} // main

}
