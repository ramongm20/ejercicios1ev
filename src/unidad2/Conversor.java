package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversor {

	public static void main(String[] args) {
		float euros;
		float dolares;
		float precio;

		System.out.println("Introduzca cantidad(€):");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			euros = Float.parseFloat(br.readLine());
			
			precio = 1.18f;
			dolares = euros * precio;
			
			System.out.printf("%.2f", dolares);

		} catch(IOException ex) {
			System.out.println("La entrada no es válida.");
		} // catch
	} // main

}
