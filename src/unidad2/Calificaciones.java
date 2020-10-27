package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) {
		final float PESO_EXAMEN_MATES = 0.9f;
		final float PESO_EXAMEN_FISICA = 0.8f;
		final float PESO_EXAMEN_QUIMICA = 0.85f;

		float nota_mates = 0.0f;
		float nota_fisica = 0.0f;
		float nota_quimica = 0.0f;
		
		System.out.println("Introduzca la nota del examen de Matemáticas:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			float ponderacion_examen_mates = PESO_EXAMEN_MATES * Float.parseFloat(br.readLine());
			nota_mates = ponderacion_examen_mates;
		} catch(IOException ex) {
			System.out.println("Entrada inválida.");
		} // catch
		
		System.out.println("Introduzca la nota de la tarea 1 de Matemáticas:");
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		try {
			float ponderacion_tarea1_mates = ((1-PESO_EXAMEN_MATES) / 3) * Float.parseFloat(br.readLine());
			nota_mates += ponderacion_tarea1_mates;
		} catch(IOException ex) {
			System.out.println("Entrada inválida.");
		} // catch

		System.out.println("Introduzca la nota de la tarea 2 de Matemáticas:");
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		try {
			float ponderacion_tarea2_mates = ((1-PESO_EXAMEN_MATES) / 3) * Float.parseFloat(br.readLine());
			nota_mates += ponderacion_tarea2_mates;
		} catch(IOException ex) {
			System.out.println("Entrada inválida.");
		} // catch

		System.out.println("Introduzca la nota de la tarea 3 de Matemáticas:");
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		try {
			float ponderacion_tarea3_mates = ((1-PESO_EXAMEN_MATES) / 3) * Float.parseFloat(br.readLine());
			nota_mates += ponderacion_tarea3_mates;
		} catch(IOException ex) {
			System.out.println("Entrada inválida.");
		} // catch

		
		System.out.println("Introduzca la nota del examen de Física:");
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		try {
			float ponderacion_examen_fisica = PESO_EXAMEN_FISICA * Float.parseFloat(br.readLine());
			nota_fisica = ponderacion_examen_fisica;
		} catch(IOException ex) {
			System.out.println("Entrada inválida.");
		} // catch
		
		System.out.println("Introduzca la nota de la tarea 1 de Fisica:");
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		try {
			float ponderacion_tarea1_fisica = ((1-PESO_EXAMEN_FISICA) / 2) * Float.parseFloat(br.readLine());
			nota_fisica += ponderacion_tarea1_fisica;
		} catch(IOException ex) {
			System.out.println("Entrada inválida.");
		} // catch

		System.out.println("Introduzca la nota de la tarea 2 de Fisica:");
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		try {
			float ponderacion_tarea2_fisica = ((1-PESO_EXAMEN_FISICA) / 2) * Float.parseFloat(br.readLine());
			nota_fisica += ponderacion_tarea2_fisica;
		} catch(IOException ex) {
			System.out.println("Entrada inválida.");
		} // catch
		
		System.out.println("Introduzca la nota del examen de Química:");
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		try {
			float ponderacion_examen_quimica = PESO_EXAMEN_QUIMICA * Float.parseFloat(br.readLine());
			nota_quimica = ponderacion_examen_quimica;
		} catch(IOException ex) {
			System.out.println("Entrada inválida.");
		} // catch
		
		System.out.println("Introduzca la nota de la tarea 1 de Química:");
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		try {
			float ponderacion_tarea1_quimica = ((1-PESO_EXAMEN_QUIMICA) / 3) * Float.parseFloat(br.readLine());
			nota_quimica += ponderacion_tarea1_quimica;
		} catch(IOException ex) {
			System.out.println("Entrada inválida.");
		} // catch

		System.out.println("Introduzca la nota de la tarea 2 de Química:");
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		try {
			float ponderacion_tarea2_quimica = ((1-PESO_EXAMEN_QUIMICA) / 3) * Float.parseFloat(br.readLine());
			nota_quimica += ponderacion_tarea2_quimica;
		} catch(IOException ex) {
			System.out.println("Entrada inválida.");
		} // catch

		System.out.println("Introduzca la nota de la tarea 3 de Química:");
		isr = new InputStreamReader(System.in);
		br = new BufferedReader(isr);
		try {
			float ponderacion_tarea3_quimica = ((1-PESO_EXAMEN_QUIMICA) / 3) * Float.parseFloat(br.readLine());
			nota_quimica += ponderacion_tarea3_quimica;
		} catch(IOException ex) {
			System.out.println("Entrada inválida.");
		} // catch


		
		System.out.print("La nota de Matemáticas es un ");
		System.out.printf("%.2f", nota_mates);
		System.out.print(".\nLa nota de Física es un ");
		System.out.printf("%.2f", nota_fisica);
		System.out.print(".\nLa nota de Química es un ");
		System.out.printf("%.2f", nota_quimica);
		System.out.print(".\nLa nota media de las tres asignaturas es un ");
		System.out.printf("%.2f", (nota_mates +nota_fisica + nota_quimica) / 3);
		System.out.println(".\n");
	} // main

}
