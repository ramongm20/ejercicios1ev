package unidad2;

public class Conversor {

	public static void main(String[] args) {
		float euros;
		float dolares;
		float precio;
		
		euros = 1;
		precio = 1.18f;
		dolares = euros * precio;
		
		System.out.printf("%.2f", dolares);
	} // main

} // Conversor
