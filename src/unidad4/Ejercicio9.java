package unidad4;

import java.util.Random;

public class Ejercicio9 {

	public static void main(String[] args) {
		Random r = new Random();

		int [] numeros = new int [r.nextInt(491)+10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(201)-100;
			if (numeros.length <= 50)
				System.out.println(numeros[i]);
		} // for
		System.out.println("Se han detectado " + secuenciasDeNumerosRepetidos(numeros) + " secuencias de números repetidos");
	} // main
	static int secuenciasDeNumerosRepetidos(int[] numeros) {
		int secuencias = 0;
		boolean secuenciaDetectada = false;
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] == numeros[i - 1]) {
				if (!secuenciaDetectada) {
					secuenciaDetectada = true;
					secuencias++;
				}
			} else if (secuenciaDetectada)
				secuenciaDetectada = false;
		}
		return secuencias;
	}

}
