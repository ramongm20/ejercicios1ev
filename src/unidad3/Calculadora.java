package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		double num1;
		double num2;
		Scanner in = new Scanner(System.in);
		boolean control = true;
		
		while (control) {
			System.out.println("Elija una de las siguientes operaciones por el número correspondiente:\n1. Suma.\n2. Resta.\n3. Multiplicación.\n4. División.\n5. Salir.");
			
			switch (in.nextInt()) {
				case 1:
					System.out.println("Primer operando:");
					num1 = in.nextDouble();
					System.out.println("Segundo operando:");
					num2 = in.nextDouble();
					System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, num1 + num2);
					break;
				case 2:
					System.out.println("Primer operando:");
					num1 = in.nextDouble();
					System.out.println("Segundo operando:");
					num2 = in.nextDouble();
					System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, num1 - num2);
					break;
					
				case 3:
					System.out.println("Primer operando:");
					num1 = in.nextDouble();
					System.out.println("Segundo operando:");
					num2 = in.nextDouble();
					System.out.printf("%.2f x %.2f = %.2f\n", num1, num2, num1 * num2);
					break;
					
				case 4:
					System.out.println("Primer operando:");
					num1 = in.nextDouble();
					System.out.println("Segundo operando:");
					num2 = in.nextDouble();
					System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, num1 / num2);
					break;
					
				case 5: control = false;
			} // switch
		} // while
	} // main

}
