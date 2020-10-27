package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) {
		System.out.println("Introduce tu nombre:");
		InputStreamReader isr = new InputStreamReader(System.in);
		long inicio = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(isr);
		try {
			String nombre = br.readLine();
			long fin = System.currentTimeMillis();
			float tiempo = ((float)(fin - inicio) / 1000);
			System.out.print(nombre + ", has empleado ");
			System.out.printf("%.3f", tiempo);
			System.out.println(" segundos en responder.");
		} catch(IOException ex) {
			System.out.println("Entrada no válida.");
		} // catch
	} // main
}
